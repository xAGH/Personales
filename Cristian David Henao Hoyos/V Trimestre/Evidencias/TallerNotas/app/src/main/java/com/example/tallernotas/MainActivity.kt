package com.example.tallernotas

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_TallerNotas)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciarComponentes()
    }

    private fun iniciarComponentes(){
        configurarTema()
        val btnRegistro: MaterialButton = findViewById(R.id.btnRegistro)
        val btnEstadicticas: MaterialButton = findViewById(R.id.btnEstadicticas)
        val btnInstrucciones: MaterialButton = findViewById(R.id.btnInstrucciones)
        btnRegistro.setOnClickListener{ btnOnClick(1) }
        btnEstadicticas.setOnClickListener{ btnOnClick(2) }
        btnInstrucciones.setOnClickListener{ btnOnClick(3) }
    }

    private fun btnOnClick(btn: Int){
        val intent: Intent?
        when (btn){
            1 -> {
                intent = Intent(this, RegistroActivity::class.java)
                startActivity(intent)
            }
            2 -> {
                intent = Intent(this, EstadisticasActivity::class.java)
                startActivity(intent)
            }
            3 -> {
                intent = Intent(this, InstruccionesActivity::class.java)
                startActivity(intent)
            }
        }
    }

    fun configurarTema(){
        val appSettingsPrefs: SharedPreferences = getSharedPreferences("AppSettingPrefs", 0)
        val sharedPrefsEdit: SharedPreferences.Editor = appSettingsPrefs.edit()
        val isNightModeOn: Boolean = appSettingsPrefs.getBoolean("NightMode", false)

        val theme: MaterialButton = findViewById(R.id.btnTheme)
        if (isNightModeOn) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            theme.text = getText(R.string.sun)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            theme.text = getText(R.string.moon)
        }

        theme.setOnClickListener(View.OnClickListener {
            if (isNightModeOn) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                sharedPrefsEdit.putBoolean("NightMode", false)
                sharedPrefsEdit.apply()
                theme.text = getText(R.string.moon)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                sharedPrefsEdit.putBoolean("NightMode", true)
                sharedPrefsEdit.apply()
                theme.text = getText(R.string.sun)
            }
        })
    }
}
