package com.tyaosani.shota.tyaosanii

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FullActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full)

supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = intent.extras.getString("title")
           val data = intent.extras.getString("des")

          val txtview = findViewById<TextView>(R.id.des)
txtview.text = data

    }
}
