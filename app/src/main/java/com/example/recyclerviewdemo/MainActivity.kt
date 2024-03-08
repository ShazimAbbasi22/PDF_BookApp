package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listOfBooks: ArrayList<PDFBooks> = arrayListOf()
        listOfBooks.add(
            PDFBooks(
                "The Time Machine",
                R.drawable.title_cover_the_time_machine,
                "The Time Machine Author H. G. Wells.pdf"
            )
        )
        listOfBooks.add(
            PDFBooks(
                "Lost World",
                R.drawable.title_cover_lost_world,
                "The Lost World Author Arthur Conan Doyle.pdf"
            )
        )
        listOfBooks.add(
            PDFBooks(
                "Nineteen Eighty Four",
                R.drawable.title_cover_nineteen_eighty_four,
                "Nineteen Eighty-Four Author George Orwell.pdf"
            )
        )
        listOfBooks.add(
            PDFBooks(
                "Frankenstein",
                R.drawable.tilte_cover_frankenstein,
                "Frankenstein Author Mary Shelley.pdf"
            )
        )
        listOfBooks.add(
            PDFBooks(
                "Twenty Thousand Leagues Under The Sea",
                R.drawable.title_cover_twenty_thousand_leagues_under_the_seas,
                "Twenty Thousand Leagues Under the Seas Author Jules Verne.pdf"
            )
        )
        listOfBooks.add(
            PDFBooks(
                "The Time Machine",
                R.drawable.title_cover_the_time_machine,
                "The Time Machine Author H. G. Wells.pdf"
            )
        )
        listOfBooks.add(
            PDFBooks(
                "Lost World",
                R.drawable.title_cover_lost_world,
                "The Lost World Author Arthur Conan Doyle.pdf"
            )
        )
        listOfBooks.add(
            PDFBooks(
                "Nineteen Eighty Four",
                R.drawable.title_cover_nineteen_eighty_four,
                "Nineteen Eighty-Four Author George Orwell.pdf"
            )
        )
        listOfBooks.add(
            PDFBooks(
                "Frankenstein",
                R.drawable.tilte_cover_frankenstein,
                "Frankenstein Author Mary Shelley.pdf"
            )
        )
        listOfBooks.add(
            PDFBooks(
                "Twenty Thousand Leagues Under The Sea",
                R.drawable.title_cover_twenty_thousand_leagues_under_the_seas,
                "Twenty Thousand Leagues Under the Seas Author Jules Verne.pdf"
            )
        )


        val recyclerView = findViewById<RecyclerView>(R.id.books_recyclerview)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = MyAdapter(
            this, listOfBooks
        )

    }
}