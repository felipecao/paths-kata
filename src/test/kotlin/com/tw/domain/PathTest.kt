package com.tw.domain

import com.tw.domain.StopMother.Companion.randomStop
import org.junit.Assert.*
import org.junit.Test

class PathTest {

    private val DELTA = 0.01

    @Test
    fun `the distance of a path is the sum of distance of segments`() {
        val segment1 = Segment(Point(0, 0), Point(6, 8))
        val segment2 = Segment(Point(2, 4), Point(26,9))
        val path = Path(listOf(segment1, segment2), emptyList())

        assertEquals(34.5, path.distance(), DELTA)
    }

    @Test
    fun `path does not contain stop`() {
        val path = Path(emptyList(), listOf(randomStop(), randomStop()))
        assertFalse(path.containsAllStops(listOf(randomStop())))
    }

    @Test
    fun `path contains a stop`() {
        val stop1 = randomStop()
        val stop2 = randomStop()
        val path = Path(emptyList(), listOf(stop1, stop2))

        assertTrue(path.containsAllStops(listOf(stop1)))
    }

    @Test
    fun `path contains multiple stops`() {
        val stop1 = randomStop()
        val stop2 = randomStop()
        val stop3 = randomStop()
        val path = Path(emptyList(), listOf(stop1, stop2, stop3))

        assertTrue(path.containsAllStops(listOf(stop1, stop3)))
    }
}