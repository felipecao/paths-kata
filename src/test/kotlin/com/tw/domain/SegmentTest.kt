package com.tw.domain

import org.junit.Assert.*
import org.junit.Test

class SegmentTest {

    private val DELTA = 0.01

    @Test
    fun `distance of a segment is the square root of squares` () {
        val segment = Segment(Point(0, 0), Point(6, 8))
        assertEquals(10.0, segment.distance(), DELTA)
    }

    @Test
    fun `distance of a segment is rounded to one decimal place` () {
        val segment = Segment(Point(2, 4), Point(26,9))
        assertEquals(24.5, segment.distance(), DELTA)
    }
}