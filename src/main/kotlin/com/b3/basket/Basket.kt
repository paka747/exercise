package com.b3.basket

import java.util.Objects
import java.util.stream.Stream

class Basket(val fruits: Collection<Fruit>) {

    fun fruits(): Stream<Fruit> = fruits.stream()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false
        val basket = other as Basket
        return fruits == basket.fruits
    }

    override fun hashCode(): Int {
        return Objects.hash(fruits)
    }
}