package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.*

//esto hace que la variable se inicie una vez sea necesario, asi se previene el lag al iniciar la app
lateinit var rollDice: ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton = findViewById<Button>(R.id.roll_Button)
        rollButton.setOnClickListener{
            //TOAST ES EL MENSAGE QUE APARECE COMO SI FUERA UN POP UP DURANTE UNOS SEGUNDOS
            Toast.makeText(this, "Lets Roll", Toast.LENGTH_SHORT).show()
            rollDice()
        }

    }

    private fun rollDice() {
        rollDice = findViewById(R.id.dice_Image)
        val random_num = Random().nextInt(6) + 1 //saca un numero random del 0 al 5 por eso se le suma 1
        //when es el equivalente al switch de java, R.drawable busca dentro de la carpeta drawable
        val imagen_Random = when (random_num){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        //setImageResource asigna una nueva imagen
        rollDice.setImageResource(imagen_Random)
    }
}