package com.yosetdn.dinnerdecide

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese","Hamburguer","Pizza","Taquitos")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        decideBtn.setOnClickListener {
            val random = Random()
            val randomfood = random.nextInt(foodList.count())
            selectedFoodTxt.text =  foodList[randomfood]
        }
        addFoodBtn.setOnClickListener{
            foodList.add(addFoodTxt.text.toString())
            addFoodTxt.text.clear()
        }
    }
}
