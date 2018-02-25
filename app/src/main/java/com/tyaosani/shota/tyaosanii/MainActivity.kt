package com.tyaosani.shota.tyaosanii

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        class CustomAdapter(val crdList: ArrayList<Crd>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
            override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int):ViewHolder {
                val v = LayoutInflater.from(parent?.context).inflate(R.layout.single_tyaosani, parent, false)
                return ViewHolder(v)
            }

            override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                holder.txtTitle.text = crdList[position].title
            }

            override fun getItemCount(): Int {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
                val txtTitle = itemView.findViewById<TextView>(R.id.title)

            }

        }

    }
}
