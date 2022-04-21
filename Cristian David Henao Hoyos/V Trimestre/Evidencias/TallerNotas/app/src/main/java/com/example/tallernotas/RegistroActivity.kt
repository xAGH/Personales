package com.example.tallernotas

import android.content.ContentValues
import android.content.Intent
import android.content.SharedPreferences
import android.database.Cursor
import android.graphics.Color
import android.graphics.Color.TRANSPARENT
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.PopupWindow
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.widget.addTextChangedListener
import com.example.tallernotas.helpers.DBConexion
import com.example.tallernotas.helpers.InputFiltroMinMax
import com.example.tallernotas.helpers.Operaciones
import com.example.tallernotas.utils.DBUtils
import com.google.android.material.button.MaterialButton
import java.lang.Exception
import android.text.InputFilter as InputFilter1

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
    private var conn: DBConexion? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        iniciarComponentes()
    }

    override fun finish() {
        conn?.close()
        super.finish()
    }

    override fun onBackPressed() {
        finish()
        overridePendingTransition(androidx.appcompat.R.anim.abc_grow_fade_in_from_bottom, androidx.appcompat.R.anim.abc_shrink_fade_out_from_bottom)
    }

    private fun iniciarComponentes(){
        conn = DBConexion(applicationContext, "estudiantes", null, 1)
        inicializarVistas()
        anadirEventos()
        configurarTema()
        verificarPersistencia()
    }

    private fun verificarPersistencia() {
        val data: Bundle? = this.intent.extras
        if (data != null){
            inputDocumento?.setText(data.getString("documento")) ?: ""
            inputNombre?.setText(data.getString("nombre")) ?: ""
            inputEdad?.setText(data.getString("edad")) ?: ""
            inputTelefono?.setText(data.getString("telefono")) ?: ""
            inputDireccion?.setText(data.getString("direccion")) ?: ""
            inputNota1?.setText(data.getString("nota1")) ?: ""
            inputNota2?.setText(data.getString("nota2")) ?: ""
            inputNota3?.setText(data.getString("nota3")) ?: ""
            inputNota4?.setText(data.getString("nota4")) ?: ""
            inputNota5?.setText(data.getString("nota5")) ?: ""
            habilitarBotonRegistro()
        }
    }

    private fun habilitarBotonRegistro() {
        var validacion = true
        for (input in inputs!!){
            if (input.text.toString().isEmpty()){
                validacion = false
                break
            }
        }
        btnPromedio!!.isEnabled = validacion
    }

    private fun anadirValidador() {
        val notas: Array<EditText> = arrayOf(
        inputNota1!!, inputNota2!!, inputNota3!!, inputNota4!! ,inputNota5!!
        )
        for (nota: EditText in notas){
            nota.filters = arrayOf(InputFiltroMinMax(0.0, 5.0), InputFilter1.LengthFilter(4))
        }
        inputNombre!!.filters = arrayOf<InputFilter1>(InputFilter1.AllCaps())
        inputDireccion!!.filters = arrayOf<InputFilter1>(InputFilter1.AllCaps())
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
        inputs = arrayOf(
            inputDocumento!!, inputNombre!!,inputEdad!!,
            inputTelefono!!, inputDireccion!!, inputNota1!!,
            inputNota2!!, inputNota3!!, inputNota4!!,
            inputNota5!!
        )
        for (input in inputs!!){
            input.addTextChangedListener { habilitarBotonRegistro() }
        }
        btnPromedio!!.setOnClickListener { registrar() }
        btnConsulta!!.setOnClickListener { consultar() }
        btnVolver!!.setOnClickListener{ onBackPressed() }
    }

    private fun registrar() {
        val valores: ContentValues = obtenerValores()
        val dbRead = conn!!.readableDatabase
        var cursor: Cursor? = null
        try {
            val parametros: Array<String> = arrayOf(
                inputDocumento!!.text.toString(), //0
            )
            val campos: Array<String> = arrayOf(
                DBUtils.campoDocumento,
            )
            cursor = dbRead.query(DBUtils.tabla, campos, DBUtils.campoDocumento + "=?", parametros, null, null, null)
            cursor.moveToFirst()
            cursor.getString(0)
            cursor.close()
            actualizar(inputDocumento!!.text.toString())
            Toast.makeText(applicationContext, "ACTUALIZADO", Toast.LENGTH_SHORT).show()
        }
        catch (e: android.database.CursorIndexOutOfBoundsException){
            val dbWrite = conn!!.writableDatabase
            dbWrite.insert(DBUtils.tabla, DBUtils.campoDocumento, valores)
            dbWrite.close()
            Toast.makeText(applicationContext, "REGISTRADO", Toast.LENGTH_SHORT).show()
        }
        catch (e: Exception){
            Toast.makeText(applicationContext, "Error: $e", Toast.LENGTH_LONG).show()
        }
        finally {
            dbRead.close()
            cursor?.close()
        }
        openResultado()
    }

    private fun openResultado() {
        val intent = Intent(this, ResultadoActivity::class.java)
        val data: Bundle = Bundle()
        data.putString("documento", inputDocumento!!.text.toString())
        intent.putExtras(data)
        startActivity(intent)
    }

    private fun obtenerValores(): ContentValues {
        val valores = ContentValues()
        val nota1 = inputNota1!!.text.toString().toDouble()
        val nota2 = inputNota2!!.text.toString().toDouble()
        val nota3 = inputNota3!!.text.toString().toDouble()
        val nota4 = inputNota4!!.text.toString().toDouble()
        val nota5 = inputNota5!!.text.toString().toDouble()
        val promedio = Operaciones.promediar(arrayOf(nota1, nota2, nota3, nota4, nota5))
        valores.put(DBUtils.campoDocumento, inputDocumento!!.text.toString())
        valores.put(DBUtils.campoNombre, inputNombre!!.text.toString())
        valores.put(DBUtils.campoEdad, inputEdad!!.text.toString())
        valores.put(DBUtils.campoTelefono, inputTelefono!!.text.toString())
        valores.put(DBUtils.campoDireccion, inputDireccion!!.text.toString())
        valores.put(DBUtils.campoNota1, nota1)
        valores.put(DBUtils.campoNota2, nota2)
        valores.put(DBUtils.campoNota3, nota3)
        valores.put(DBUtils.campoNota4, nota4)
        valores.put(DBUtils.campoNota5, nota5)
        valores.put(DBUtils.campoPromedio, promedio)
        valores.put(DBUtils.campoRendimiento, Operaciones.rendimiento(promedio))
        return valores
    }

    private fun actualizar(documento: String) {
        val db = conn!!.writableDatabase
        val valores: ContentValues = obtenerValores()
        db.update(DBUtils.tabla, valores, DBUtils.campoDocumento+"=?", arrayOf(documento))
        db.close()
    }

    private fun consultar() {
        val db = conn!!.readableDatabase
        var cursor: Cursor? = null
        try {
            val parametros: Array<String> = arrayOf(
                inputDocumento!!.text.toString(), //0
            )
            val campos: Array<String> = arrayOf(
                DBUtils.campoNombre, //0
                DBUtils.campoEdad, //1
                DBUtils.campoTelefono, //2
                DBUtils.campoDireccion, //3
                DBUtils.campoNota1, //4
                DBUtils.campoNota2, //5
                DBUtils.campoNota3, //6
                DBUtils.campoNota4, //7
                DBUtils.campoNota5 //8
            )
            cursor = db.query(DBUtils.tabla, campos, DBUtils.campoDocumento + "=?", parametros, null, null, null)
            cursor.moveToFirst()
            inputNombre!!.setText(cursor.getString(0))
            inputEdad!!.setText(cursor.getString(1))
            inputTelefono!!.setText(cursor.getString(2))
            inputDireccion!!.setText(cursor.getString(3))
            inputNota1!!.setText(cursor.getString(4))
            inputNota2!!.setText(cursor.getString(5))
            inputNota3!!.setText(cursor.getString(6))
            inputNota4!!.setText(cursor.getString(7))
            inputNota5!!.setText(cursor.getString(8))
            cursor.close()
            btnPromedio!!.setText(R.string.actualizarDatos)
        }
        catch (e: android.database.CursorIndexOutOfBoundsException){
            Toast.makeText(applicationContext, "No se ha encontrado ningun estudiante con ese documento", Toast.LENGTH_LONG).show()
            btnPromedio!!.setText(R.string.registrarDatos)
        }
        catch (e: Exception){
            Toast.makeText(applicationContext, "Error: $e", Toast.LENGTH_LONG).show()
        }
        finally {
            db.close()
            cursor?.close()
        }
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
        val data: Bundle = Bundle()
        data.putString("documento", inputDocumento?.text.toString() ?: "")
        data.putString("nombre", inputNombre?.text.toString())
        data.putString("edad", inputEdad?.text.toString())
        data.putString("telefono", inputTelefono?.text.toString())
        data.putString("direccion", inputDireccion?.text.toString())
        data.putString("nota1", inputNota1?.text.toString())
        data.putString("nota2", inputNota2?.text.toString())
        data.putString("nota3", inputNota3?.text.toString())
        data.putString("nota4", inputNota4?.text.toString())
        data.putString("nota5", inputNota5?.text.toString())
        intent.putExtras(data)
        finish()
        startActivity(intent)
    }
}