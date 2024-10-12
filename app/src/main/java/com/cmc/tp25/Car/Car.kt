package com.cmc.tp25.Car

import com.cmc.tp25.Engine.Engine
import com.cmc.tp25.FuelTank.FuelTank

import javax.inject.Inject

class Car @Inject constructor(
    private val engine: Engine,
    private val fuelTank: FuelTank
) {
    fun drive(): String {
        engine.start()
        val fuelLevel = fuelTank.checkLevel()
        return "The car is on the road. $fuelLevel"
    }
}

