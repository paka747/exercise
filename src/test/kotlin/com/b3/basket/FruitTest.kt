package com.b3.basket

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FruitTest {
    /**
     * Replace  emptySet() with an implementation that satisfies the following conditions
     * - both baskets are used
     * - fruit amount in basket is odd
     * - get first fruit name letter
     * - letters are uppercase
     * - letters are unique
     * - letters are sorted in natural order
     */
    @Test
    fun shouldFindLetters() {
        // given
        val left = Basket(
            listOf(
                Fruit("apple", 3),
                Fruit("pineapple", 1),
                Fruit("mango", 2),
                Fruit("pear", 9)
            )
        )
        val right = Basket(
            listOf(
                Fruit("raspberry", 12),
                Fruit("blueberry", 4),
                Fruit("banana", 5),
                Fruit("blackberry", 7),
                Fruit("plum", 2)
            )
        )

        // when
        val result: Collection<String> = emptySet()

        // then
        assertThat(result).containsExactly("A", "B", "P")
    }
}