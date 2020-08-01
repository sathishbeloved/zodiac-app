package com.beloved.zodiacc.ui.dashboard

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.beloved.zodiacc.R
import com.beloved.zodiacc.signdetails
import kotlinx.android.synthetic.main.fragment_dashboard.*
import java.util.*

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    var d: String="0"
     var m: String="0"



    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var resul: Int = 0
        var ress: String = " "
        button13.setOnClickListener {
            clickDataPicker(view)
        }


        submit.setOnClickListener {
            resul = setTheSign()

            if (resul ==1)
            {
                ress= "Areis"
            }

            else if (resul == 2)
            {
                ress = "Taurus"
            }
            else if (resul == 3)
            {
                ress = "Gemini"
            }
            else if (resul == 4)
            {
                ress = "Cancer"
            }
            else if (resul == 5)
            {
                ress = "Leo"
            }
            else if (resul == 6)
            {
                ress = "Vigro"
            }
            else if (resul == 7)
            {
                ress = "Libra"
            }
            else if (resul == 8)
            {
                ress = "Scorpio"
            }
            else if (resul == 9)
            {
                ress = "Sagittarius"
            }
            else if (resul == 10)
            {
                ress = "Capricorn"
            }
            else if (resul == 11)
            {
                ress = "Aquarius"
            }
            else if (resul == 12)
            {
                ress = "Piseces"
            }

            result.setText("Result: "+ress)



        }
    /*    gotosign.setOnClickListener {
            val intent = Intent(requireActivity().application, signdetails::class.java)
            intent.putExtra("id", resul)
            startActivity(intent)
        }*/
    }

    private fun setTheSign(): Int {
        var ret:Int = 0
        var intm:Int=m.toInt()
        var intd:Int=d.toInt()
        if (m.equals("0")||d.equals("0"))
            Toast.makeText(requireActivity().application, "Enter date correctly", Toast.LENGTH_LONG)
                .show()
         if (intm>4){
            if (intd>=20)
                ret= 2
            if (intd<=20)
                ret= 1
        }
        if (intm>5){
            if (intd>=21)
                ret= 3
            if (intd<=20)
                ret= 2
        }
        if (intm>6){
            if (intd>=20)
                return 3
            if (intd<=20)
                return 2
        }



        Toast.makeText(requireActivity().application, m+" "+d, Toast.LENGTH_LONG)
            .show()


        return ret
    }
    @RequiresApi(Build.VERSION_CODES.N)
    fun clickDataPicker(view: View) {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        var ss: String

        val dpd =
            getActivity()?.let {
                DatePickerDialog(it, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                    // Display Selected date in Toast
                    Toast.makeText(requireActivity().application, """$dayOfMonth - ${monthOfYear + 1} - $year""", Toast.LENGTH_LONG).show()
                    m= """$dayOfMonth"""
                    d="""${monthOfYear + 1}"""
                }, year, month, day)
            }



        if (dpd != null) {
            dpd.show()
        }
    }

}
