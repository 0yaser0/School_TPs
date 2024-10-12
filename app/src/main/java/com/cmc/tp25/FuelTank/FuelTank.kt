package com.cmc.tp25.FuelTank

import com.cmc.tp25.Fuel.Fuel

import javax.inject.Inject

class FuelTank @Inject
constructor(private val fuel: Fuel ) {
    fun checkLevel(): String {
        return "Fuel level checked:" +
                " ${fuel.fuelType()}"
    }
}

