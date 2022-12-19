package com.b3.train

class TrainRoute(val stations: Collection<String>) {
    fun format(): String {
        // Try to not use `if`
        return "Train is calling at"
    }
}