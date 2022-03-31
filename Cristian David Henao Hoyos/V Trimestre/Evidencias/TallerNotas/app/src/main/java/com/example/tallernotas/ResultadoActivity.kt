package com.example.tallernotas


import android.content.Intent
import android.content.SharedPreferences
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.example.tallernotas.helpers.DBConexion
import com.example.tallernotas.utils.DBUtils
import com.google.android.material.button.MaterialButton
import pl.droidsonroids.gif.GifImageView
import java.lang.Exception


class ResultadoActivity : AppCompatActivity() {

    private var theme: MaterialButton? = null
    private var btnVolver: ImageButton? = null
    private var textNombre: TextView? = null
    private var textNota1: TextView? = null
    private var textNota2: TextView? = null
    private var textNota3: TextView? = null
    private var textNota4: TextView? = null
    private var textNota5: TextView? = null
    private var textPromedio: TextView? = null
    private var textResultado: TextView? = null
    private var documento: String? = null
    private var conn: DBConexion? = null
    private var gifView: GifImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(0, 0)
        setContentView(R.layout.activity_resultado)
        inciarComponentes()
    }

    override fun finish() {
        conn?.close()
        super.finish()
    }

    override fun onBackPressed() {
        finish()
        overridePendingTransition(androidx.appcompat.R.anim.abc_grow_fade_in_from_bottom, androidx.appcompat.R.anim.abc_shrink_fade_out_from_bottom)
    }

    private fun inciarComponentes() {
        conn = DBConexion(applicationContext, "estudiantes", null, 1)
        inicializarVistas()
        cargarDatos()
        anadirEventos()
        configurarTema()
    }

    private fun cargarDatos() {
        val data: Bundle? = this.intent.extras
        documento = data?.getString("documento")
        val db = conn!!.readableDatabase
        var cursor: Cursor? = null
        try {
            val parametros: Array<String?> = arrayOf(
                documento //0
            )
            val campos: Array<String> = arrayOf(
                DBUtils.campoNombre, //0
                DBUtils.campoNota1, //1
                DBUtils.campoNota2, //2
                DBUtils.campoNota3, //3
                DBUtils.campoNota4, //4
                DBUtils.campoNota5, //5
                DBUtils.campoPromedio, //6
                DBUtils.campoRendimiento //7
            )
            cursor = db.query(DBUtils.tabla, campos, DBUtils.campoDocumento + "=?", parametros, null, null, null)
            cursor.moveToFirst()
            cursor.getString(0).also { textNombre!!.text = it }
            cursor.getString(1).also { textNota1!!.text = it }
            cursor.getString(2).also { textNota2!!.text = it }
            cursor.getString(3).also { textNota3!!.text = it }
            cursor.getString(4).also { textNota4!!.text = it }
            cursor.getString(5).also { textNota5!!.text = it }
            cursor.getString(6).also { textPromedio!!.text = it }
            cursor.getString(7).also { textResultado!!.text = it }
            if (cursor.getString(6).toDouble() > 3.5){
                gifView!!.setImageResource(R.drawable.success)
                Handler(Looper.getMainLooper()).postDelayed({
                    gifView!!.setImageResource(R.drawable.succes_img)
                }, 2000)
            }
            else {
                gifView!!.setImageResource(R.drawable.fail)
                Handler(Looper.getMainLooper()).postDelayed({
                    gifView!!.setImageResource(R.drawable.fail_img)
                }, 2000)
            }
            cursor.close()
        }
        catch (e: android.database.CursorIndexOutOfBoundsException){
            Toast.makeText(applicationContext, "No se ha encontrado ningun estudiante con ese documento", Toast.LENGTH_LONG).show()
        }
        catch (e: Exception){
            Toast.makeText(applicationContext, "Error: $e", Toast.LENGTH_LONG).show()
        }
        finally {
            db.close()
            cursor?.close()
        }
    }

    private fun anadirEventos() {
        btnVolver!!.setOnClickListener{ onBackPressed() }
    }

    private fun inicializarVistas() {
        theme = findViewById(R.id.btnTheme)
        btnVolver = findViewById(R.id.btnVolver)
        textNombre = findViewById(R.id.textNombre)
        textNota1 = findViewById(R.id.textNota1)
        textNota2 = findViewById(R.id.textNota2)
        textNota3 = findViewById(R.id.textNota3)
        textNota4 = findViewById(R.id.textNota4)
        textNota5 = findViewById(R.id.textNota5)
        textPromedio = findViewById(R.id.textPromedio)
        textResultado = findViewById(R.id.textResultado)
        gifView = findViewById(R.id.gifView)
    }

    private fun configurarTema(){
        val appSettingsPrefs: SharedPreferences = getSharedPreferences("AppSettingPrefs", 0)
        val sharedPrefsEdit: SharedPreferences.Editor = appSettingsPrefs.edit()
        val isNightModeOn: Boolean = appSettingsPrefs.getBoolean("NightMode", false)

        if (isNightModeOn) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            theme!!.text = getText(R.string.sun)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            theme!!.text = getText(R.string.moon)
        }

        theme!!.setOnClickListener {
            if (isNightModeOn) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                sharedPrefsEdit.putBoolean("NightMode", false)
                sharedPrefsEdit.apply()
                theme!!.text = getText(R.string.moon)
                restartApp()
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                sharedPrefsEdit.putBoolean("NightMode", true)
                sharedPrefsEdit.apply()
                theme!!.text = getText(R.string.sun)
                restartApp()
            }
        }
    }

    private fun restartApp() {
        val intent = Intent(this, this::class.java)
        val data = Bundle()
        data.putString("documento", documento)
        intent.putExtras(data)
        finish()
        startActivity(intent)
    }
}