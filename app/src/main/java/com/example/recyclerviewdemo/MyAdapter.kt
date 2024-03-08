package com.example.recyclerviewdemo

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val context: Context,private val userList: ArrayList<PDFBooks>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.book_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bookName.text = userList[position].bookName
        holder.bookCover.setImageResource(userList[position].bookCover)
        holder.pdfFile.setOnClickListener {
            val pdfIntent = Intent(context, PDFViewActivity::class.java)
            pdfIntent.putExtra("pdfName", userList[position].pdfFile)
            context.startActivity(pdfIntent)
        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var bookName = itemView.findViewById<TextView>(R.id.book_title)
        var bookCover = itemView.findViewById<ImageView>(R.id.cover_image)
        var pdfFile = itemView.findViewById<CardView>(R.id.item_layout)
    }
}