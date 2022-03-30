package com.example.tallernotas.utils

class DBUtils {
    companion object{
        const val tabla: String = "estudiantes"
        const val campoDocumento: String = "documento"
        const val campoNombre: String = "nombre"
        const val campoEdad: String = "edad"
        const val campoTelefono: String = "telefono"
        const val campoDireccion: String = "direccion"
        const val campoNota1: String = "nota1"
        const val campoNota2: String = "nota2"
        const val campoNota3: String = "nota3"
        const val campoNota4: String = "nota4"
        const val campoNota5: String = "nota5"
        const val campoPromedio: String = "promedio"

        fun createTable(): String =
            "CREATE TABLE $tabla("+
                    "$campoDocumento INTEGER," +
                    "$campoNombre TEXT," +
                    "$campoEdad INTEGER," +
                    "$campoTelefono TEXT," +
                    "$campoDireccion TEXT," +
                    "$campoNota1 REAL," +
                    "$campoNota2 REAL," +
                    "$campoNota3 REAL," +
                    "$campoNota4 REAL," +
                    "$campoNota5 REAL," +
                    "$campoPromedio REAL" +
                    ")"

        fun dropTable(): String = "DROP TABLE IF EXISTS $tabla"
    }
}
