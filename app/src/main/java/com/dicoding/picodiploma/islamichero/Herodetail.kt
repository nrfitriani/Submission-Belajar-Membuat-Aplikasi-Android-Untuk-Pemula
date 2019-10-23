package com.dicoding.picodiploma.islamichero

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class Herodetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val setName: TextView = findViewById(R.id.tv_item_name)
        val setDetails: TextView = findViewById(R.id.tv_item_detail)
        val setPhoto: ImageView = findViewById(R.id.img_item_photo)


        val tName = intent.getStringExtra(EXTRA_NAME)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)
        val tImg = intent.getIntExtra(EXTRA_PHOTO, R.drawable.one)

        val actionbar = supportActionBar
        actionbar!!.title = tName
        actionbar.setDisplayHomeAsUpEnabled(true)

        setName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(setPhoto)
        setDetails.text = tDetail
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
