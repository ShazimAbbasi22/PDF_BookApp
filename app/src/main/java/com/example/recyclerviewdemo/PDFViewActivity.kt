package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class PDFViewActivity : AppCompatActivity() {

    private lateinit var pdfBook: PDFView
    private var pdfName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdfview)

        pdfBook = findViewById(R.id.pdfView)

        pdfName = intent.getStringExtra("pdfName")

        pdfBook.fromAsset(pdfName).load()
    }
}