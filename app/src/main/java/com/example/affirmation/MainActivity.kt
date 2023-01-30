package com.example.affirmation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmation.adapter.ItemAdapter
import com.example.affirmation.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = DataSource().loadAffirmation()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        recyclerView.adapter = ItemAdapter(this , myDataset)
        recyclerView.setHasFixedSize(true)


    }
}