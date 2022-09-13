package com.sampson.algorithmtest.utils

import android.util.Log

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