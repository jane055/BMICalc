package com.example.bmicalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }



    fun calculateBMI (view : View) {
        val weight : Float = editTextWeight.text.toString().toFloat()
        val height : Float = editTextWeight.text.toString().toFloat()

        val result : Float = weight / height * height;

        if (result <= 18.5){
            findViewById<ImageView>(R.id.imageViewProfile).setImageResource(R.drawable.under)

        }
        else if (result >= 18.5 && result <= 24.9){
            findViewById<ImageView>(R.id.imageViewProfile).setImageResource(R.drawable.normal)

        }
        else if (result >= 25.0){
            findViewById<ImageView>(R.id.imageViewProfile).setImageResource(R.drawable.over)
        }

        textViewBMI.text = "BMI : " + result



    }

    public fun reset(view : View){
        editTextHeight.text.clear()
        editTextWeight.text.clear()
        textViewBMI.text = "BMI : "
        imageViewProfile.setImageResource(R.drawable.empty)
    }
}
