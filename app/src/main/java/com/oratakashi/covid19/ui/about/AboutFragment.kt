package com.oratakashi.covid19.ui.about

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.oratakashi.covid19.BuildConfig
import com.oratakashi.covid19.R
import com.oratakashi.covid19.ui.main.MainInterfaces
import com.oratakashi.covid19.utils.ImageHelper
import kotlinx.android.synthetic.main.fragment_about.*


/**
 * A simple [Fragment] subclass.
 */
class AboutFragment(val parent : MainInterfaces) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        parent.getLocation(-6.9201766, 107.6049431, 12f)

        tvSource.text = BuildConfig.BASE_URL+"\nhttp://covid19.bnpb.go.id/"

//        tvSourceCode.text = "https://github.com/oratakashi/COVID19_Tracker"
//        tvSourceCode.text = "https://github.com/oratakashi/COVID19_Tracker"
//        tvSourceCode.setOnClickListener {
//            val i = Intent(Intent.ACTION_VIEW)
//            i.data = Uri.parse("https://github.com/oratakashi/COVID19_Tracker")
//            startActivity(i)
//        }

//        ImageHelper.getPicasso(ivPhoto, "https://instagram.fjog3-1.fna.fbcdn.net/v/t51.2885-15/sh0.08/e35/p640x640/69176405_434317503884119_473784165719279935_n.jpg?_nc_ht=instagram.fjog3-1.fna.fbcdn.net&_nc_cat=107&_nc_ohc=ZRqEk48VSnkAX_fmBNp&oh=2b4bac19132fd5657cdfe2ffdb0db755&oe=5EA7FFCB")
        ImageHelper.getPicasso(ivPhoto, "https://www.ajnn.net/files/images/20200317-ilustrasi-virus-corona-shutterstock1.jpg")
    }
}
