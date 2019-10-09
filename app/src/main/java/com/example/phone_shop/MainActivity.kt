package com.example.phone_shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        //Set the layout manager
        recyclerView.layoutManager = LinearLayoutManager(this)

        var phones = ArrayList<Phone>()

            phones.add(Phone(1, "A" , 1200, 21))
            phones.add(Phone(1, "A" , 1200, 21))
            phones.add(Phone(1, "A" , 1200, 21))
            phones.add(Phone(1, "A" , 1200, 21))
        var adapter = PhoneAdapter(phones)
            recyclerView.adapter = adapter







    }
}
