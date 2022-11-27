package com.example.getlocation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.io.File

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val levelText = findViewById<TextView>(R.id.treeLevel)
//        levelText.text = "Tree level: " + countLines().toString()
        levelText.text = "Tree level: 1 (MORE LEVELS IN FULL VERSION)"

        val buttonClick = findViewById<Button>(R.id.backBttn)
        buttonClick.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }

//        growTree()
    }

//        fun growTree(){
//            var lvl = countLines()
//            val treeImageView = findViewById<ImageView>(R.id.treeRender)
//
//            if(lvl == 5){
//                //clear file
//            }
//
//            when(lvl){
//                1 -> treeImageView.setBackgroundResource(R.drawable.tree1)
//                2 -> treeImageView.setBackgroundResource(R.drawable.tree2)
//                3 -> treeImageView.setBackgroundResource(R.drawable.tree3)
//                4 -> treeImageView.setBackgroundResource(R.drawable.tree4)
//            }
//        }

//        fun countLines(): Int{
//            var k = 0
//            File ("lines.txt").readLines().forEach(){
//                if(it == "6"){
//                    k++
//                }
//            }
//
//            return k
//        }
}