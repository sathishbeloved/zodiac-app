package com.beloved.zodiacc.ui.notifications

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
import kotlinx.android.synthetic.main.fragment_notifications.*
import java.util.*


class NotificationsFragment : Fragment() {

    private lateinit var notificationsViewModel: NotificationsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_notifications, container, false)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener {
            addClickEffect(button)
            fortune(view)

        }
    }

    fun fortune(view: View){
        var fort = arrayOf("A beautiful, smart, and loving person will be coming into your life.",
            "A dubious friend may be an enemy in camouflage.",
            "A faithful friend is a strong defense.",
            "A feather in the hand is better than a bird in the air. ",
            "A fresh start will put you on your way.",
            "A friend asks only for your time not your money.",
            "A friend is a present you give yourself.",
            "A gambler not only will lose what he has, but also will lose what he doesn't have.",
            "A golden egg of opportunity falls into your lap this month.",
            "A good friendship is often more important than a passionate romance.",
            "A good time to finish up old tasks. ",
            "A hunch is creativity trying to tell you something.",
            "A lifetime friend shall soon be made.",
            "A lifetime of happiness lies ahead of you.",
            "A light heart carries you through all the hard times.",
            "A new perspective will come with the new year. ",
            "A person is never to (sic) old to learn. ",
            "A person of words and not deeds is like a garden full of weeds.",
            "A pleasant surprise is waiting for you.",
            "A short pencil is usually better than a long memory any day.",
            "A small donation is call for. It's the right thing to do.",
            "A smile is your personal welcome mat.",
            "A smooth long journey! Great expectations.",
            "A soft voice may be awfully persuasive.",
            "A truly rich life contains love and art in abundance.",
            "Accept something that you cannot change, and you will feel better.",
            "Adventure can be real happiness.",
            "Advice is like kissing. It costs nothing and is a pleasant thing to do. ",
            "Advice, when most needed, is least heeded.",
            "All the effort you are making will ultimately pay off.",
            "All the troubles you have will pass away very quickly.",
            "All will go well with your new project.",
            "All your hard work will soon pay off.",
            "Allow compassion to guide your decisions.",
            "An acquaintance of the past will affect you in the near future.",
            "An agreeable romance might begin to take on the appearance.",
            "An important person will offer you support.",
            "An inch of time is an inch of gold.",
            "Any decision you have to make tomorrow is a good decision.",
            "At the touch of love, everyone becomes a poet.",
            "Be careful or you could fall for some tricks today.",
            "Beauty in its various forms appeals to you. ",
            "Because you demand more from yourself, others respect you deeply.",
            "Believe in yourself and others will too.",
            "Believe it can be done.",
            "Better ask twice than lose yourself once.")
        val rand = Random()
        val i = rand.nextInt(fort.size)

rrr.setText(fort.get(i))
    }

    fun addClickEffect(view: View) {
        val drawableNormal = view.background
        val drawablePressed = view.background.constantState!!.newDrawable()
        drawablePressed.mutate()
        drawablePressed.setColorFilter(Color.argb(50, 0, 0, 0), PorterDuff.Mode.SRC_ATOP)
        val listDrawable =
            StateListDrawable()
        listDrawable.addState(intArrayOf(android.R.attr.state_pressed), drawablePressed)
        listDrawable.addState(intArrayOf(), drawableNormal)
        view.background = listDrawable
    }
}
