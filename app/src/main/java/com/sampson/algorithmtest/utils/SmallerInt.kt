package com.sampson.algorithmtest.utils

class SmallerInt {

    fun testSmallerInt(): Int {
        val a = arrayOf(1, 2, 3, 4, 5)
        var smallerNumber = 0

        for (i in 1..a.size) {
            if (i == 0) {
                smallerNumber = a[i]
            } else {
                if (a[i] < smallerNumber) {
                    smallerNumber = a[i]
                }
            }
        }
        return smallerNumber
    }
}