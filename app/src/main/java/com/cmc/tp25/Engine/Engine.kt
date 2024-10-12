package com.cmc.tp25.Engine

import javax.inject.Inject

class Engine @Inject constructor() {
    fun start(): String {
        return "The engine starts."
    }
}

