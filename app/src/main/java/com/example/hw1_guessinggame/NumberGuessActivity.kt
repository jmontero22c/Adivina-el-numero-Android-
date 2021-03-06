package com.example.hw1_guessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.hw1_guessinggame.R
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var numAleatorio = Random.nextInt(1,1000)
    var intentos = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`activity_number_guess`)

    }



    fun adivinar (v: View){
        val texto = findViewById<EditText>(R.id.number)
        val numero =Integer.parseInt(texto.text.toString())

        if(numero == numAleatorio){
            Toast.makeText(this,"Felicidades has acertado en "+intentos+" intentos",Toast.LENGTH_LONG).show()
        }else if(numero > numAleatorio){
            Toast.makeText(this,"El numero es menor",Toast.LENGTH_SHORT).show()
            intentos+=1
        }else {
            Toast.makeText(this, "El numero es mayor", Toast.LENGTH_SHORT).show()
            intentos += 1
        }
    }

    fun playAgain(v: View){
        numAleatorio = Random.nextInt(1,1000)
        intentos = 1
    }

}
