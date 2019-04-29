package com.tw.usecase

import com.tw.domain.Path
import com.tw.domain.Stop

class FilterPathsThatIncludeStops (private val listOfPaths: List<Path>) {
    fun filter(stopsToSearch: List<Stop>): List<Path> {
        return listOfPaths.filter { it.containsAllStops(stopsToSearch) }
    }
}