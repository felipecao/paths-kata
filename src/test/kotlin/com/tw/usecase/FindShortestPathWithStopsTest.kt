package com.tw.usecase

import com.tw.domain.Path
import com.tw.domain.StopMother.Companion.randomStop
import org.junit.Assert.*
import org.junit.Ignore
import org.junit.Test

class FindShortestPathWithStopsTest {

    @Test
    fun `collection of paths is empty`() {
        val paths = emptyList<Path>()
        val useCase = FindShortestPathWithStops(paths)

        assertEquals(null, useCase.findShortestWithStops(listOf(randomStop())))
    }

    @Test
    @Ignore
    fun `collection of paths has one element and no matches in common`() {
    }
}