package com.dicoding.picodiploma.islamichero

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class About: AppCompatActivity () , View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val actionBar = supportActionBar
        actionBar!!.title = "About"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val btnDialPhone: Button = findViewById(R.id.btn_dial_phone)
        btnDialPhone.setOnClickListener(this)

        val btnSendMail: Button = findViewById(R.id.btn_send_mail)
        btnSendMail.setOnClickListener(this)
    }

    override fun onClick(v: View){
        when(v.id){
            R.id.btn_dial_phone -> {
                val phone = "088744619461"
                val phoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phone"))
                startActivity(phoneIntent)
            }
            R.id.btn_send_mail -> {
                val email = "halidinnutfitriani@gmail.com"
                val mailIntent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:$email"))
                startActivity(mailIntent)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean{
        onBackPressed()
        return true
    }
}