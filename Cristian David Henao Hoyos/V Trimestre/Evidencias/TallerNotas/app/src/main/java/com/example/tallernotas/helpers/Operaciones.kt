package com.example.tallernotas.helpers

import kotlin.math.roundToInt

class Operaciones {
    companion object {
        fun promediar(notas: Array<Double>): Double{
            var suma: Double = 0.0
            for (nota in notas){
                suma += nota
            }
            return suma / notas.size
        }
    }
}