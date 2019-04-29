package com.tw.usecase

import com.tw.domain.Path
import com.tw.domain.Point
import com.tw.domain.Stop
import com.tw.domain.StopMother.Companion.randomStop
import org.junit.Assert.*
import org.junit.Test

class FilterPathsThatIncludeStopsTest {

    @Test
    fun `filter returns nothing`() {
        val path1 = Path(emptyList(), listOf(randomStop(), randomStop()))
        val path2 = Path(emptyList(), listOf(randomStop()))
        val useCase = FilterPathsThatIncludeStops(listOf(path1, path2))

        assertEquals(emptyList<Path>(), useCase.filter(listOf(randomStop())))
    }

    @Test
    fun `filter returns last stop`() {
        val path1 = Path(emptyList(), listOf(randomStop(), randomStop()))
        val path2 = Path(emptyList(), listOf(randomStop()))

        val stop4 = Stop("bus stop", Point(4, 5))
        val path3 = Path(emptyList(), listOf(stop4))

        val useCase = FilterPathsThatIncludeStops(listOf(path1, path2, path3))

        assertEquals(listOf(path3), useCase.filter(listOf(stop4)))
    }

    @Test
    fun `filter for multiple stops`() {
        val stop1 = randomStop()
        val stop2 = randomStop()
        val path1 = Path(emptyList(), listOf(stop1, stop2))

        val stop3 = randomStop()
        val stop4 = randomStop()
        val path2 = Path(emptyList(), listOf(stop1, stop2, stop3, stop4))

        val stop5 = randomStop()
        val path3 = Path(emptyList(), listOf(stop4, stop5))

        val useCase = FilterPathsThatIncludeStops(listOf(path1, path2, path3))

        assertEquals(listOf(path1, path2), useCase.filter(listOf(stop1, stop2)))
    }
}