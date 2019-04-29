package com.tw.usecase

import com.tw.domain.Path

class FindShortestPathInListOfPaths (private val listOfPaths: List<Path>) {
    fun findShortest(): Path? {
        return listOfPaths.minBy { it.distance() }
    }
}