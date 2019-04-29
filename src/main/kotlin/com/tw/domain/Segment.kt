package com.tw.domain

import com.tw.domain.DoubleRounder.Companion.round
import kotlin.math.sqrt
import java.lang.Math.pow

data class Segment (private val origin: Point, private val destination: Point) {
    fun distance() : Double {
        val xDiff = destination.x - origin.x
        val yDiff = destination.y - origin.y
        return round(sqrt(pow(xDiff.toDouble(), 2.0) + pow(yDiff.toDouble(), 2.0)))
    }
}