package com.example.imagenes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var toyImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.cambiar)
        rollButton.setOnClickListener { changeRandom() }
        toyImage = findViewById(R.id.imageView)
    }

    private fun changeRandom() {
        val randomInt = (1..2).random()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.pulpito01
            else -> R.drawable.pulpito02
        }

        toyImage.setImageResource(drawableResource)
    }
}
