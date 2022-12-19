package com.b3.map

import java.util.Date
import java.util.Objects

class Component(var s: String, var i: Int, var d: Date) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false
        val component = other as Component
        return i == component.i && s == component.s && d == component.d
    }

    override fun hashCode(): Int {
        return Objects.hash(s, i, d)
    }
}