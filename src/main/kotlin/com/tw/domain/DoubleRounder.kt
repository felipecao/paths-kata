package com.tw.domain

import java.math.RoundingMode
import java.text.DecimalFormat

class DoubleRounder {
    companion object {
        fun round(number: Double) : Double {
            val df = DecimalFormat("#.#")
            df.roundingMode = RoundingMode.FLOOR
            return df.format(number).toDouble()
        }
    }
}