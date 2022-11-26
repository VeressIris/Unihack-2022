package com.example.getlocation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val levelText = findViewById<TextView>(R.id.treeLevel)
        levelText.text = "Tree level: " +  MapsActivity().treeLevel.toString()

        val buttonClick = findViewById<Button>(R.id.backBttn)
        buttonClick.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }
    }

        fun growTree(lvl: Int){
            val treeImageView = findViewById<ImageView>(R.id.treeRender)

            if(lvl == 5){
                MapsActivity().treeLevel = 1
            }

            when(lvl){
                1 -> treeImageView.setBackgroundResource(R.drawable.tree1)
                2 -> treeImageView.setBackgroundResource(R.drawable.tree2)
                3 -> treeImageView.setBackgroundResource(R.drawable.tree3)
                4 -> treeImageView.setBackgroundResource(R.drawable.tree4)
            }
    }
}