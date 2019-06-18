package com.example.idkgallery

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : WearableActivity() {
    private val photos: ArrayList<Int> = ArrayList()
    var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setAmbientEnabled()

        photos.add(R.drawable.photo1)
        photos.add(R.drawable.photo2)
        photos.add(R.drawable.photo3)
        photos.add(R.drawable.photo4)
        photos.add(R.drawable.photo5)
        photos.add(R.drawable.photo6)
        photos.add(R.drawable.photo7)
        photos.add(R.drawable.photo8)
        photos.add(R.drawable.photo9)
        photos.add(R.drawable.photo10)
        photos.add(R.drawable.photo11)
        photos.add(R.drawable.photo12)
        photos.add(R.drawable.photo13)

        left_button.setOnClickListener {
            previousPhoto()
        }

        right_button.setOnClickListener {
            nextPhoto()
        }
    }

    private fun nextPhoto() {
        index = (index + 1) % photos.size
        setPhoto(index)
    }

    private fun previousPhoto() {
        index = ((index - 1) + photos.size) % photos.size
        setPhoto(index)
    }

    private fun setPhoto(photo: Int) {
        myLayout.setBackgroundResource(photos[photo])
    }
}
