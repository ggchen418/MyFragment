package com.android.example.myfragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class ThankYouFragment : Fragment() {

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_thank_you, container, false)

        val tvPercentage : TextView = view.findViewById(R.id.tvPercentage)

        val args = ThankYouFragment.fromBundle(requireArguments())

        tvPercentage.text = "Your Score : " + String.format("%.2f", args.percentage) + "%"


        return view
    }


}

