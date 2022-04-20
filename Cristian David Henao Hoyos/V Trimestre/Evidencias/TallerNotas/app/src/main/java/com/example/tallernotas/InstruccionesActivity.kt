package com.example.tallernotas

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.button.MaterialButton

class InstruccionesActivity : AppCompatActivity() {

    private var theme: MaterialButton? = null
    private var btnVolver: ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instrucciones)
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

    private fun inicializarVistas() {
        btnVolver = findViewById(R.id.btnVolver)
    }

    private fun anadirEventos(){
        btnVolver!!.setOnClickListener{ onBackPressed() }
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