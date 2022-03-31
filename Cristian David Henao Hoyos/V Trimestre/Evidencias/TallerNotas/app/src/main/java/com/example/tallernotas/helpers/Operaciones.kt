package com.example.tallernotas.helpers

class Operaciones {
    companion object {
        fun promediar(notas: Array<Double>): Double{
            var suma = 0.0
            for (nota in notas){
                suma += nota
            }
            return suma / notas.size
        }

        fun rendimiento(promedio: Double): String {
            return when {
                promedio > 3.5 -> {
                    "Ganó"
                }
                promedio in 2.5..3.5 -> {
                    "Perdió y puede recuperar"
                }
                else -> {
                    "Perdió y no puede recuperar"
                }
            }
        }
    }
}