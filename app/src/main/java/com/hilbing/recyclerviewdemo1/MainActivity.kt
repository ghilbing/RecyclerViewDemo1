package com.hilbing.recyclerviewdemo1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val fruitList = listOf(
        Fruit("Mango", "Tom"),
        Fruit("Apple", "Gretel"),
        Fruit("Banana", "Eli"),
        Fruit("Guava", "Alma"),
        Fruit("Lemon", "Sol"),
        Fruit("Pear", "Roly"),
        Fruit("Orange", "Walter"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.setBackgroundColor(Color.YELLOW)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter(fruitList)

    }
}