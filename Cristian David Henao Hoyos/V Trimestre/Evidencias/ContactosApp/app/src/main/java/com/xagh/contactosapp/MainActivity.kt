package com.xagh.contactosapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    val nombresInput: EditText =findViewById(R.id.nombresInput);
    val celularInput: EditText = findViewById(R.id.celularInput);
    val emailInput: EditText = findViewById(R.id.emailInput);
    val radioGroupInput: RadioGroup = findViewById(R.id.radioGroup);
    val redesCheckBox: CheckBox = findViewById(R.id.redesCheckBox);
    val videojuegosCheckBox: CheckBox = findViewById(R.id.videojuegosCheckBox);
    val programacionCheckBox: CheckBox = findViewById(R.id.programacionCheckBox);
    val bdCheckBox: CheckBox = findViewById(R.id.bdCheckBox);
    val guardarButton: Button = findViewById(R.id.guardarButton);
    val resumenSwitch: Switch = findViewById(R.id.resumenSwitch);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        this.guardarButton.setOnClickListener{ guardarContacto() }
        this.resumenSwitch.setOnClickListener{ resumen() }
    }

    private fun guardarContacto() {
        var nombresInput = this.nombresInput.text.toString();
        var celular
    }

    private fun resumen() {

    }


}