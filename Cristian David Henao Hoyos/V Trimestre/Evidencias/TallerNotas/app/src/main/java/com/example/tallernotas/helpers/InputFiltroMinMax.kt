package com.example.tallernotas.helpers

import android.text.InputFilter
import android.text.Spanned


class InputFiltroMinMax(private var min: Double, private var max: Double) : InputFilter {

    override fun filter(
        source: CharSequence?,
        start: Int,
        end: Int,
        dest: Spanned?,
        dStart: Int,
        dEnd: Int
    ): CharSequence? {
        try {
            var newVal = dest.toString().substring(0, dStart) + dest.toString().substring(dEnd, dest.toString().length)
            newVal = newVal.substring(0, dStart) + source.toString() + newVal.substring(
                dStart,
                newVal.length
            )
            val input = newVal.toDouble()
            if (isInRange(min, max, input)) {
                return null
            }
        } catch (nfe: NumberFormatException) {
        }
        return ""
    }

    private fun isInRange(a: Double, b: Double, c: Double): Boolean {
        return if (b > a) c in a..b else c in b..a
    }
}
