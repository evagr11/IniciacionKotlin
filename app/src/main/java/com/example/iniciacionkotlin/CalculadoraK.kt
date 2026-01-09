package com.example.iniciacionkotlin;

class CalculadoraK {
    companion object{
        fun suma(numero1 : Double, numero2: Double) : Double {
            return numero1 + numero2
        }

        fun resta(numero1: Double, numero2: Double): Double {
            return numero1 - numero2
        }

        fun producto(numero1: Double, numero2: Double): Double {
            return numero1 * numero2
        }

        fun cociente(numero1: Double, numero2: Double): Double {
            return numero1 / numero2
        }

        fun resto(numero1: Double, numero2: Double): Double {
            return numero1 % numero2
        }
    }
}
