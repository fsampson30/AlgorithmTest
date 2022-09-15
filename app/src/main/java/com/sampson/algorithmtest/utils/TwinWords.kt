package com.sampson.algorithmtest.utils

class TwinWords {

    fun testTwinWords(): Boolean {
        val firstWord = "Listen"
        val secondWord = "Silent4"
        if (firstWord.length == secondWord.length) {
            return true
        }
        return false
    }
}