package com.tw.domain

import java.util.*

class StopMother {
    companion object {
        fun randomStop(): Stop = Stop(UUID.randomUUID().toString(), PointMother.randomPoint())
    }
}