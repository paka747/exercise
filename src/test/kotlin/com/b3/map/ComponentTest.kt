package com.b3.map

import java.util.Date
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assumptions.assumeThat
import org.junit.jupiter.api.Test

class ComponentTest {
    @Test
    fun shouldComponentBeAKeyInMap() {
        // given
        val value = "value"
        val component = Component("s", 1, Date())
        val map: MutableMap<Component, String> = HashMap()
        map[component] = value
        assumeThat(map).containsEntry(component, value)
        component.i = 4

        // when
        val actual = map[component]

        // then
        assertThat(actual).isEqualTo(value)
    }
}