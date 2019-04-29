package com.tw.domain

import java.util.*

class PointMother {
    companion object {
        private val randomThreshold = 20

        fun randomPoint(): Point {
            val x = Random().nextInt(randomThreshold)
            val y = Random().nextInt(randomThreshold)

            return Point(x, y)
        }
    }
}