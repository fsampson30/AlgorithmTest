package com.sampson.algorithmtest.utils

class SmallerInt {

    fun testSmallerInt(): Int {
        val ints = arrayListOf(66, 12, 13, 14, 2)
        var smallerNumber = 0

        for (i in 0..ints.lastIndex) {
            if (i == 0) {
                smallerNumber = ints[i]
            }else if (ints[i] < smallerNumber) {
                smallerNumber = ints[i]
            }
        }
        return smallerNumber
    }
}