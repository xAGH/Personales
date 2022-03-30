package com.example.tallernotas

import android.content.ContentValues
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.widget.addTextChangedListener
import com.example.tallernotas.helpers.DBConexion
import com.example.tallernotas.helpers.InputFiltroMinMax
import com.example.tallernotas.helpers.Operaciones
import com.example.tallernotas.utils.DBUtils
import com.google.android.material.button.MaterialButton
import java.lang.Exception

class RegistroActivity : AppCompatActivity() {

    private var inputDocumento: EditText? = null
    private var inputNombre: EditText? = null
    private var inputEdad: EditText? = null
    private var inputTelefono: EditText? = null
    private var inputDireccion: EditText? = null
    private var inputNota1: EditText? = null
    private var inputNota2: EditText? = null
    private var inputNota3: EditText? = null
    private var inputNota4: EditText? = null
    private var inputNota5: EditText? = null
    private var theme: MaterialButton? = null
    private var btnPromedio: MaterialButton? = null
    private var btnVolver: ImageButton? = null
    private var btnConsulta: MaterialButton? = null
    private var inputs: Array<EditText>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        iniciarComponentes()
    }

    override fun onBackPressed() {
        finish()
        overridePendingTransition(androidx.appcompat.R.anim.abc_grow_fade_in_from_bottom, androidx.appcompat.R.anim.abc_shrink_fade_out_from_bottom)
    }

    private fun iniciarComponentes(){
        inicializarVistas()
        anadirEventos()
        configurarTema()
    }

    private fun habilitarBotonRegistro() {
        var validacion: Boolean = true
        for (input in inputs!!){
            if (input.text.toString().isEmpty()){
                validacion = false
                break
            }
        }

        btnPromedio!!.isEnabled = validacion
    }

    private fun registrar() {
        val valores: ContentValues = ContentValues()
        val nota1 = inputNota1!!.text.toString().toDouble()
        val nota2 = inputNota2!!.text.toString().toDouble()
        val nota3 = inputNota3!!.text.toString().toDouble()
        val nota4 = inputNota4!!.text.toString().toDouble()
        val nota5 = inputNota5!!.text.toString().toDouble()
        valores.put(DBUtils.campoDocumento, inputDocumento!!.text.toString().toInt())
        valores.put(DBUtils.campoNombre, inputNombre!!.text.toString())
        valores.put(DBUtils.campoEdad, inputEdad!!.text.toString().toInt())
        valores.put(DBUtils.campoTelefono, inputTelefono!!.text.toString())
        valores.put(DBUtils.campoDireccion, inputDireccion!!.text.toString())
        valores.put(DBUtils.campoNota1, nota1)
        valores.put(DBUtils.campoNota2, nota2)
        valores.put(DBUtils.campoNota3, nota3)
        valores.put(DBUtils.campoNota4, nota4)
        valores.put(DBUtils.campoNota5, nota5)
        valores.put(DBUtils.campoPromedio, Operaciones.promediar(arrayOf<Double>(nota1, nota2, nota3, nota4, nota5)))

        val conn: DBConexion = DBConexion(applicationContext, "estudiantes", null, 1)
        val db = conn.writableDatabase
        val idResultante: Long = db.insert(DBUtils.tabla, DBUtils.campoDocumento, valores)
        conn.close()
        Toast.makeText(applicationContext, "Id registro: $idResultante", Toast.LENGTH_SHORT).show()
    }

    private fun anadirValidador() {
        val notas: Array<EditText> = arrayOf<EditText>(
        inputNota1!!, inputNota2!!, inputNota3!!, inputNota4!! ,inputNota5!!
        )
        for (nota: EditText in notas){
            nota.filters = arrayOf<InputFilter>(InputFiltroMinMax(0.0, 5.0), InputFilter.LengthFilter(4))
        }
        inputNombre!!.filters = arrayOf<InputFilter>(InputFilter.AllCaps())
        inputDireccion!!.filters = arrayOf<InputFilter>(InputFilter.AllCaps())
    }

    private fun inicializarVistas() {
        inputDocumento = findViewById(R.id.inputDocumento)
        inputNombre = findViewById(R.id.inputNombre)
        inputEdad = findViewById(R.id.inputEdad)
        inputTelefono = findViewById(R.id.inputTelefono)
        inputDireccion = findViewById(R.id.inputDireccion)
        inputNota1 = findViewById(R.id.inputNota1)
        inputNota2 = findViewById(R.id.inputNota2)
        inputNota3 = findViewById(R.id.inputNota3)
        inputNota4 = findViewById(R.id.inputNota4)
        inputNota5 = findViewById(R.id.inputNota5)
        theme = findViewById(R.id.btnTheme)
        btnVolver = findViewById(R.id.btnVolver)
        btnConsulta = findViewById(R.id.btnConsulta)
        btnPromedio = findViewById(R.id.btnPromedio)
    }

    private fun anadirEventos() {
        anadirValidador()
        inputs = arrayOf<EditText>(
            inputDocumento!!, inputNombre!!,inputEdad!!,
            inputTelefono!!, inputDireccion!!, inputNota1!!,
            inputNota2!!, inputNota3!!, inputNota4!!,
            inputNota5!!
        )
        for (input in inputs!!){
            input.addTextChangedListener { habilitarBotonRegistro() }
        }
        btnPromedio!!.setOnClickListener { registrar() }

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

        theme!!.setOnClickListener(View.OnClickListener {
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
        })
    }

    private fun restartApp() {
        val intent: Intent = Intent(this, RegistroActivity::class.java)
        startActivity(intent)
        finish()
    }
}