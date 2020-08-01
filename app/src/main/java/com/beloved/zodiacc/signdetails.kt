package com.beloved.zodiacc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_signdetails.*

class signdetails : AppCompatActivity() {
     var zname: String = "Zodiac name"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signdetails)
        val intent = intent
        val zid = intent.getStringExtra("id")

        if (zid.equals("0"))
        {
            zname = "Worng sign got"
            imageView.setImageResource(R.drawable.ic_dashboard_black_24dp)
        }
        else if (zid.equals("1"))
        {
            zname = "Aeries"
            imageView.setImageResource(R.drawable.aries)
        }
        else if (zid.equals("2"))
        {
            zname = "Taurus"
            imageView.setImageResource(R.drawable.taurus)
        }
        else if (zid.equals("3"))
        {
            zname = "Gemini"
            imageView.setImageResource(R.drawable.gemini)
        }
        else if (zid.equals("4"))
        {
            zname = "Cancer"
            imageView.setImageResource(R.drawable.cancer)
        }
        else if (zid.equals("5"))
        {
            zname = "Leo"
            imageView.setImageResource(R.drawable.leo)
        }
        else if (zid.equals("6"))
        {
            zname = "Vigro"
            imageView.setImageResource(R.drawable.virgo)
        }
        else if (zid.equals("7"))
        {
            zname = "Libra"
            imageView.setImageResource(R.drawable.libra)
        }   else if (zid.equals("8"))
        {
            zname = "Scorpio"
            imageView.setImageResource(R.drawable.scorpio)
        }
        else if (zid.equals("9"))
        {
            zname = "Sagittarius"
            imageView.setImageResource(R.drawable.sagittarius)
        }
        else if (zid.equals("10"))
        {
            zname = "Capricorn"
            imageView.setImageResource(R.drawable.capricorn)
        }
        else if (zid.equals("11"))
        {
            zname = "Aquarius"
            imageView.setImageResource(R.drawable.aquarius)
        }
        else if (zid.equals("12"))
        {
            zname = "Piseces"
            imageView.setImageResource(R.drawable.pisces)
        }


        textView2.setText(zname)

    finishbtn.setOnClickListener {
        finish()
    }


    }

}

