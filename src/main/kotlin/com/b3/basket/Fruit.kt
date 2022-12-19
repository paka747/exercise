package com.b3.basket

import java.util.Objects

data class Fruit(val name: String, private val amount: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false
        val fruit = other as Fruit
        return amount == fruit.amount && name == fruit.name
    }

    override fun hashCode(): Int {
        return Objects.hash(name, amount)
    }
}