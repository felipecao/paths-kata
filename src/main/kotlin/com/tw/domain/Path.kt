package com.tw.domain

data class Path (private val segments: List<Segment>, private val stops: List<Stop>) {
    fun distance(): Double = segments.map { it.distance() }.sum()

    fun containsAllStops(stops: List<Stop>): Boolean {
        return this.stops.containsAll(stops)
    }
}