package com.b3.train

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TrainRouteTest {
    @Test
    fun shouldFormatSingleStationRoute() {
        // given
        val station = "Luton"
        val trainRoute = TrainRoute(listOf(station))

        // when
        val route = trainRoute.format()

        // then
        assertThat(route).isEqualTo("Train is calling at Luton")
    }

    @Test
    fun shouldFormatDoubleStationRoute() {
        // given
        val station1 = "Luton"
        val station2 = "Harpenden"
        val trainRoute = TrainRoute(listOf(station1, station2))

        // when
        val route = trainRoute.format()

        // then
        assertThat(route).isEqualTo("Train is calling at Luton and Harpenden")
    }

    @Test
    fun shouldFormatTripleStationRoute() {
        // given
        val station1 = "Luton"
        val station2 = "Harpenden"
        val station3 = "London"
        val trainRoute = TrainRoute(listOf(station1, station2, station3))

        // when
        val route = trainRoute.format()

        // then
        assertThat(route).isEqualTo("Train is calling at Luton, Harpenden and London")
    }
}