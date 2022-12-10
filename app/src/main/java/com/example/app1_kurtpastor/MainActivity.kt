package com.example.app1_kurtpastor

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayPopupDialog()

        var croissantVar = false
        var chocolateVar = false
        var strawberryVar = false
        var donutVar = false
        var muffinVar = false
        var vanillaVar = false

        croissant.setOnClickListener {
           if (croissantVar == false) {
               croissantVar = true
               croissant.setAlpha(1f)
               muffinVar = false
               muffin.setAlpha(0.5f)
               donutVar = false
               donut.setAlpha(0.5f)
           }
            else if (croissantVar == true) {
               croissantVar = false
               croissant.setAlpha(0.5f)
           }
        }

        donut.setOnClickListener {
            if (donutVar == false) {
                donutVar = true
                donut.setAlpha(1f)
                croissantVar = false
                croissant.setAlpha(0.5f)
                muffinVar = false
                muffin.setAlpha(0.5f)
            }
            else{
                donutVar = false
                donut.setAlpha(0.5f)
            }
        }

        muffin.setOnClickListener {
            if (muffinVar == false) {
                muffinVar = true
                muffin.setAlpha(1f)
                croissantVar = false
                croissant.setAlpha(0.5f)
                donutVar = false
                donut.setAlpha(0.5f)
            }
            else{
                muffinVar = false
                muffin.setAlpha(0.5f)
            }
        }

        chocolate.setOnClickListener {
            if (chocolateVar == false) {
                chocolateVar = true
                chocolate.setAlpha(1f)
                vanillaVar = false
                vanilla.setAlpha(0.5f)
                strawberryVar = false
                strawberry.setAlpha(0.5f)
            }
            else{
                chocolateVar = false
                chocolate.setAlpha((0.5f))
            }
        }

        strawberry.setOnClickListener {
            if (strawberryVar == false) {
                strawberryVar = true
                strawberry.setAlpha(1f)
                chocolateVar = false
                chocolate.setAlpha(0.5f)
                vanillaVar = false
                vanilla.setAlpha(0.5f)
            }
            else{
                strawberryVar = false
                strawberry.setAlpha((0.5f))
            }
        }

        vanilla.setOnClickListener {
            if (vanillaVar == false) {
                vanillaVar = true
                vanilla.setAlpha(1f)
                strawberryVar = false
                strawberry.setAlpha(0.5f)
                chocolateVar = false
                chocolate.setAlpha(0.5f)
            }
            else{
                vanillaVar = false
                vanilla.setAlpha((0.5f))
            }
        }

        resetbutton.setOnClickListener {
            imageSet.visibility = View.GONE
            croissantVar = false
            croissant.setAlpha(0.5f)
            muffinVar = false
            muffin.setAlpha(0.5f)
            donutVar = false
            donut.setAlpha(0.5f)
            vanillaVar = false
            vanilla.setAlpha(0.5f)
            strawberryVar = false
            strawberry.setAlpha(0.5f)
            chocolateVar = false
            chocolate.setAlpha(0.5f)
        }

        mixButton.setOnClickListener {
            if (chocolateVar == true && croissantVar == true) {
                imageSet.setImageResource(R.drawable.croissantc)
                imageSet.visibility = View.VISIBLE
            }
            else if (strawberryVar == true && croissantVar == true) {
                imageSet.setImageResource(R.drawable.croissants)
                imageSet.visibility = View.VISIBLE
            }
            else if (vanillaVar == true && croissantVar == true){
                imageSet.setImageResource(R.drawable.croissantv)
                imageSet.visibility = View.VISIBLE
            }
            else if (chocolateVar == true && donutVar == true) {
                imageSet.setImageResource(R.drawable.donutc)
                imageSet.visibility = View.VISIBLE
            }
            else if (strawberryVar == true && donutVar == true) {
                imageSet.setImageResource(R.drawable.donuts)
                imageSet.visibility = View.VISIBLE
            }
            else if (vanillaVar == true && donutVar == true){
                imageSet.setImageResource(R.drawable.donutv)
                imageSet.visibility = View.VISIBLE
            }
            else if (chocolateVar == true && muffinVar == true) {
                imageSet.setImageResource(R.drawable.muffinc)
                imageSet.visibility = View.VISIBLE
            }
            else if (strawberryVar == true && muffinVar == true) {
                imageSet.setImageResource(R.drawable.muffins)
                imageSet.visibility = View.VISIBLE
            }
            else if (vanillaVar == true && muffinVar == true) {
                imageSet.setImageResource(R.drawable.muffinv)
                imageSet.visibility = View.VISIBLE
            }
        }

    }
    private fun displayPopupDialog() {
        var popupDialog = Dialog(this)
        popupDialog.setCancelable(false)

        popupDialog.setContentView(R.layout.pop_up)
        popupDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        var prcd = popupDialog.findViewById<TextView>(R.id.popbutton)

        prcd.setOnClickListener {
            popupDialog.dismiss()
        }

        popupDialog.show()
    }
}
