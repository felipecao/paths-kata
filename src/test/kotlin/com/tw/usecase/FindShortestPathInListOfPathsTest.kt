package com.tw.usecase

import com.tw.domain.Path
import com.tw.domain.Point
import com.tw.domain.Segment
import org.junit.Assert.*
import org.junit.Test

class FindShortestPathInListOfPathsTest {

    @Test
    fun `if there's just one path, return it`() {
        val segment1 = Segment(Point(0, 0), Point(6, 8))
        val segment2 = Segment(Point(2, 4), Point(26,9))
        val path = Path(listOf(segment1, segment2), emptyList())
        val useCase = FindShortestPathInListOfPaths(listOf(path))

        assertEquals(useCase.findShortest(), path)
    }

    @Test
    fun `return the path with least distance`() {
        val segment1 = Segment(Point(0, 0), Point(6, 8))
        val segment2 = Segment(Point(2, 4), Point(26,9))
        val path1 = Path(listOf(segment1, segment2), emptyList())

        val segment3 = Segment(Point(0, 0), Point(1, 1))
        val segment4 = Segment(Point(2, 2), Point(3,3))
        val path2 = Path(listOf(segment3, segment4), emptyList())

        val useCase = FindShortestPathInListOfPaths(listOf(path1, path2))

        assertEquals(useCase.findShortest(), path2)
    }
}