package com.sampson.algorithmtest.utils

class SmallerInt {

    fun testSmallerInt(): Int {
        val ints = arrayListOf(-66, -12, -13, -14, -17, 202, 900, 99999, -1000,5,-1)
        var smallerNumber = 0

        for (i in 0..ints.lastIndex) {
            if (i == 0) {
                smallerNumber = ints[i]
            }
            if (Math.abs(ints[i]) < Math.abs(smallerNumber)) {
                smallerNumber = ints[i]
            }
        }
        return smallerNumber
    }
}
