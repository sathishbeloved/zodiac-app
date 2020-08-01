package com.beloved.zodiacc.ui.home

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.StateListDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.beloved.zodiacc.R
import com.beloved.zodiacc.signdetails
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        return root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
button1.setOnClickListener {
    addClickEffect(button1)
    val intent = Intent(requireActivity().application, signdetails::class.java)
    intent.putExtra("id", "1")
        startActivity(intent)

}
        button2.setOnClickListener {
            addClickEffect(button2)
            val intent = Intent(requireActivity().application, signdetails::class.java)
            intent.putExtra("id", "2")
            startActivity(intent)
        }
        button3.setOnClickListener {
            addClickEffect(button3)
            val intent = Intent(requireActivity().application, signdetails::class.java)
            intent.putExtra("id", "3")
            startActivity(intent)
        }
        button4.setOnClickListener {
            addClickEffect(button4)
            val intent = Intent(requireActivity().application, signdetails::class.java)
            intent.putExtra("id", "4")
            startActivity(intent)
        }
        button5.setOnClickListener {
            addClickEffect(button5)

            val intent = Intent(requireActivity().application, signdetails::class.java)
            intent.putExtra("id", "5")
            startActivity(intent)
        }
        button6.setOnClickListener {
            addClickEffect(button6)
            val intent = Intent(requireActivity().application, signdetails::class.java)
            intent.putExtra("id", "6")
            startActivity(intent)
        }
        button7.setOnClickListener {
            addClickEffect(button7)
            val intent = Intent(requireActivity().application, signdetails::class.java)
            intent.putExtra("id", "7")
            startActivity(intent)
        }
        button8.setOnClickListener {
            addClickEffect(button8)
            val intent = Intent(requireActivity().application, signdetails::class.java)
            intent.putExtra("id", "8")
            startActivity(intent)
        }
        button9.setOnClickListener {
            addClickEffect(button9)
            val intent = Intent(requireActivity().application, signdetails::class.java)
            intent.putExtra("id", "9")
            startActivity(intent)
        }
        button10.setOnClickListener {
            addClickEffect(button10)
            val intent = Intent(requireActivity().application, signdetails::class.java)
            intent.putExtra("id", "10")
            startActivity(intent)
        }
        button11.setOnClickListener {
            addClickEffect(button11)
            val intent = Intent(requireActivity().application, signdetails::class.java)
            intent.putExtra("id", "11")
            startActivity(intent)
        }
        button12.setOnClickListener {
            addClickEffect(button12)
            val intent = Intent(requireActivity().application, signdetails::class.java)
            intent.putExtra("id", "12")
            startActivity(intent)
        }


    }
    fun addClickEffect(view: View) {
        val drawableNormal = view.background
        val drawablePressed = view.background.constantState!!.newDrawable()
        drawablePressed.mutate()
        drawablePressed.setColorFilter(Color.argb(100, 158, 160, 158), PorterDuff.Mode.SRC_ATOP)
        val listDrawable =
            StateListDrawable()
        listDrawable.addState(intArrayOf(android.R.attr.state_pressed), drawablePressed)
        listDrawable.addState(intArrayOf(), drawableNormal)
        view.background = listDrawable
    }

}


