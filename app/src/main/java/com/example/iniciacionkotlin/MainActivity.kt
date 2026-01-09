package com.example.iniciacionkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //constante -> val
    //si quiero cambiarlo -> var

    val yo : Persona = Persona("Eva", 19)
    val a : Double = 5.0
    val b : Double = 3.0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        panelOperaciones();
    }

    fun panelOperaciones() {
        System.out.println("Aqui tienes tus resultados: ");
        System.out.println("Suma: ${CalculadoraK.suma(a, b)}")
        System.out.println("Resta: ${CalculadoraK.resta(a, b)}")
        System.out.println("Producto: ${CalculadoraK.producto(a, b)}")
        System.out.println("Cociente: ${CalculadoraK.cociente(a, b)}")
        System.out.println("Resto de la división: ${CalculadoraK.resto(a, b)}")
    }

    private fun suma(numero1 : Double, numero2: Double) : Double {
        return numero1 + numero2
    }

    private fun resta(numero1: Double, numero2: Double): Double {
        return numero1 - numero2
    }

    private fun producto(numero1: Double, numero2: Double): Double {
        return numero1 * numero2
    }

    private fun cociente(numero1: Double, numero2: Double): Double {
        return numero1 / numero2
    }

    private fun resto(numero1: Double, numero2: Double): Double {
        return numero1 % numero2
    }
}