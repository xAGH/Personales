package com.xagh.primeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val miBoton: Button = findViewById(R.id.btnIngresar)
        miBoton.setOnClickListener{onClick()}
    }

    private fun onClick(){
        val campoNombre: EditText = findViewById(R.id.editTextNombre)
        val campoTelefono: EditText = findViewById(R.id.editTextTelefono)
        val campoEmail: EditText = findViewById(R.id.editTextEmail)
        val campoEdad: EditText = findViewById(R.id.editTextEdad)
        val campoDocumento: EditText = findViewById(R.id.editTextDocumento)

        var nombre: String = campoNombre.text.toString()
        var telefono: Int =  Integer.parseInt(campoTelefono.text.toString())
        var email: String = campoEmail.text.toString()
        var edad: Int = Integer.parseInt(campoEdad.text.toString())
        var documento: Int = Integer.parseInt(campoDocumento.text.toString())

        var edad_txt: String? = null

        if (edad in 0..15){
            edad_txt = "Infante"
        }


        val txtResultado: TextView = findViewById(R.id.txtResultado)
        txtResultado.text = "Bienvenido $nombre"

        Toast.makeText(this, "Bienvenido $nombre", Toast.LENGTH_LONG).show()
    }
}