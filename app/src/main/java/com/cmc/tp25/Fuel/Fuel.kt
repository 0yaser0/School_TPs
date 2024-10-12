package com.cmc.tp25.Fuel

import javax.inject.Inject

class Fuel @Inject constructor() {
    fun fuelType(): String {
        return "Gasoline"
    }
}
