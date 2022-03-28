package com.example.tallernotas

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.button.MaterialButton

class RegistroActivity : AppCompatActivity() {
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
        configurarTema()
        validarNotas()
        val btnBack = findViewById<ImageButton?>(R.id.btnBack).setOnClickListener { onBackPressed() }
        val btnConsulta = findViewById<MaterialButton>(R.id.btnConsulta).setOnClickListener { onBackPressed() }
        val btnPromedio = findViewById<MaterialButton>(R.id.btnPromedio).setOnClickListener { onBackPressed() }
    }

    private fun validarNotas() {
        val inputNota1: EditText = findViewById(R.id.inputNota1)
        val inputNota2: EditText = findViewById(R.id.inputNota2)
        val inputNota3: EditText = findViewById(R.id.inputNota3)
        val inputNota4: EditText = findViewById(R.id.inputNota4)
        val inputNota5: EditText = findViewById(R.id.inputNota5)
        val notas: Array<EditText> = arrayOf<EditText>(
            inputNota1, inputNota2, inputNota3, inputNota4 ,inputNota5
        )
        for (nota: EditText in notas){
            nota.filters = arrayOf<InputFilter>(InputFilterMinMax(0, 5), InputFilter.LengthFilter(1))
        }
    }

    private fun configurarTema(){
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
                restartApp()
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                sharedPrefsEdit.putBoolean("NightMode", true)
                sharedPrefsEdit.apply()
                theme.text = getText(R.string.sun)
                restartApp()
            }
        })
    }

    private fun restartApp() {
        val intent: Intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}