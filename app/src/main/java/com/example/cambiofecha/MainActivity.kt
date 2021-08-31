package com.example.cambiofecha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fecha = "2021-12-20T16:05:00.121"
        var fechaCorrecta = ""
        var b = 'a'

        for (letra in 1..fecha.length) {
            b = fecha.get(letra - 1)

            when (letra){
                in 1..10 -> fechaCorrecta = fechaCorrecta+b
                in 11..13 -> fechaCorrecta = fechaCorrecta
                in 14..14 -> fechaCorrecta = fechaCorrecta+" "
                in 15..19 -> fechaCorrecta = fechaCorrecta+b

            }


        }

        val fechaView = findViewById<TextView>(R.id.fechaCorrecta)
        val fechaView2 = findViewById<TextView>(R.id.branch)

        fechaView.text="Fecha de sanción: $fechaCorrecta"
        







    }
}