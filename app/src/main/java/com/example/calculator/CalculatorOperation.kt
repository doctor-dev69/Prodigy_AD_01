package com.example.calculator

sealed class CalculatorOperation(val symbol: String) {
    object Add: CalculatorOperation("+")
    object Subtract: CalculatorOperation("-")
    object Delete: CalculatorOperation("/")
    object Multiply: CalculatorOperation("x")
}