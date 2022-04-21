package com.example.tallernotas

import android.content.Intent
import android.content.SharedPreferences
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.example.tallernotas.helpers.DBConexion
import com.example.tallernotas.utils.DBUtils
import com.google.android.material.button.MaterialButton
import java.lang.Exception

class EstadisticasActivity : AppCompatActivity() {

    private var theme: MaterialButton? = null
    private var conn: DBConexion? = null
    private var btnVolver: ImageButton? = null
    private var txtProcesados: TextView? = null
    private var txtGanan: TextView? = null
    private var txtPierden: TextView? = null
    private var txtRecuperan: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estadisticas)
        iniciarComponentes()
    }

    override fun onBackPressed() {
        finish()
        overridePendingTransition(androidx.appcompat.R.anim.abc_grow_fade_in_from_bottom, androidx.appcompat.R.anim.abc_shrink_fade_out_from_bottom)
    }

    private fun iniciarComponentes(){
        conn = DBConexion(applicationContext, "estudiantes", null, 1)
        inicializarVistas()
        anadirEventos()
        surtirDatos()
        configurarTema()
    }

    private fun inicializarVistas() {
        btnVolver = findViewById(R.id.btnVolver)
        txtProcesados = findViewById(R.id.txtProcesados)
        txtGanan = findViewById(R.id.txtGanan)
        txtPierden = findViewById(R.id.txtPierden)
        txtRecuperan = findViewById(R.id.txtRecuperan)
    }

    private fun anadirEventos(){
        btnVolver!!.setOnClickListener{ onBackPressed() }
    }

    private fun surtirDatos(){
        var ganan = 0
        var pierden = 0
        var recuperan = 0
        val db = conn!!.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM ${DBUtils.tabla}", null)
        val data = ArrayList<Double>()
        cursor.moveToFirst()
        while (!cursor.isAfterLast) {
            data.add(cursor.getString(cursor.getColumnIndex("promedio")).toDouble())
            cursor.moveToNext()
        }
        for (i in data){
            if (i < 2.5){
                pierden += 1
            }
            else if (i in 2.5..3.5){
                recuperan += 1
            }
            else {
                ganan += 1
            }
        }
        val procesados = data.size
        txtProcesados!!.text = procesados.toString()
        txtGanan!!.text = ganan.toString()
        txtPierden!!.text = pierden.toString()
        txtRecuperan!!.text = recuperan.toString()
    }

    override fun finish() {
        conn?.close()
        super.finish()
    }

    private fun configurarTema(){
        val appSettingsPrefs: SharedPreferences = getSharedPreferences("AppSettingPrefs", 0)
        val sharedPrefsEdit: SharedPreferences.Editor = appSettingsPrefs.edit()
        val isNightModeOn: Boolean = appSettingsPrefs.getBoolean("NightMode", false)

        theme = findViewById(R.id.btnTheme)
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
        startActivity(intent)
        finish()
    }
}