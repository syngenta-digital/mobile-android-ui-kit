package com.syngenta.uikit.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.syngenta.uikit.MainActivity
import com.syngenta.uikit.R
import com.syngenta.uikit.adapters.ColorItem
import com.syngenta.uikit.adapters.ColorsAdapter
import kotlinx.android.synthetic.main.fragment_buttons.*
import kotlinx.android.synthetic.main.fragment_colors.*
import kotlinx.android.synthetic.main.fragment_colors.toolbar

/**
 * A simple [Fragment] subclass.
 */
class ColorsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_colors, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        toolbar.setNavigationOnClickListener {
            activity?.onBackPressed()
        }

        initializeList()
        val context = context ?: return

        val recyclerView = recycler_color_list
        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        val adapter = ColorsAdapter(context, colorList.toTypedArray())
        recyclerView.adapter = adapter

    }

    private fun initializeList() {
        colorList.clear()
        colorList.add(ColorItem("Green 10 (cw_green_10)", R.color.cw_green_10))
        colorList.add(ColorItem("Green 20 (cw_green_20)", R.color.cw_green_20))
        colorList.add(ColorItem("Green 30 (cw_green_30)", R.color.cw_green_30))
        colorList.add(ColorItem("Green 40 (cw_green_40)", R.color.cw_green_40))
        colorList.add(ColorItem("Green 50 (cw_green_50)", R.color.cw_green_50))
        colorList.add(ColorItem("Green 60 (cw_green_60)", R.color.cw_green_60))
        colorList.add(ColorItem("Green 70 (cw_green_70)", R.color.cw_green_70))
        colorList.add(ColorItem("Green 80 (cw_green_80)", R.color.cw_green_80))
        colorList.add(ColorItem("Green 90 (cw_green_90)", R.color.cw_green_90))
        colorList.add(ColorItem("Green 100 (cw_green_100)", R.color.cw_green_100))

        colorList.add(ColorItem("Red 10 (cw_red_10)", R.color.cw_red_10))
        colorList.add(ColorItem("Red 20 (cw_red_20)", R.color.cw_red_20))
        colorList.add(ColorItem("Red 30 (cw_red_30)", R.color.cw_red_30))
        colorList.add(ColorItem("Red 40 (cw_red_40)", R.color.cw_red_40))
        colorList.add(ColorItem("Red 50 (cw_red_50)", R.color.cw_red_50))
        colorList.add(ColorItem("Red 60 (cw_red_60)", R.color.cw_red_60))
        colorList.add(ColorItem("Red 70 (cw_red_70)", R.color.cw_red_70))
        colorList.add(ColorItem("Red 80 (cw_red_80)", R.color.cw_red_80))
        colorList.add(ColorItem("Red 90 (cw_red_90)", R.color.cw_red_90))
        colorList.add(ColorItem("Red 100 (cw_red_100)", R.color.cw_red_100))

        colorList.add(ColorItem("Orange 10 (cw_orange_10)", R.color.cw_orange_10))
        colorList.add(ColorItem("Orange 20 (cw_orange_20)", R.color.cw_orange_20))
        colorList.add(ColorItem("Orange 30 (cw_orange_30)", R.color.cw_orange_30))
        colorList.add(ColorItem("Orange 40 (cw_orange_40)", R.color.cw_orange_40))
        colorList.add(ColorItem("Orange 50 (cw_orange_50)", R.color.cw_orange_50))
        colorList.add(ColorItem("Orange 60 (cw_orange_60)", R.color.cw_orange_60))
        colorList.add(ColorItem("Orange 70 (cw_orange_70)", R.color.cw_orange_70))
        colorList.add(ColorItem("Orange 80 (cw_orange_80)", R.color.cw_orange_80))
        colorList.add(ColorItem("Orange 90 (cw_orange_90)", R.color.cw_orange_90))
        colorList.add(ColorItem("Orange 100 (cw_orange_100)", R.color.cw_orange_100))

        colorList.add(ColorItem("Yellow 10 (cw_yellow_10)", R.color.cw_yellow_10))
        colorList.add(ColorItem("Yellow 20 (cw_yellow_20)", R.color.cw_yellow_20))
        colorList.add(ColorItem("Yellow 30 (cw_yellow_30)", R.color.cw_yellow_30))
        colorList.add(ColorItem("Yellow 40 (cw_yellow_40)", R.color.cw_yellow_40))
        colorList.add(ColorItem("Yellow 50 (cw_yellow_50)", R.color.cw_yellow_50))
        colorList.add(ColorItem("Yellow 60 (cw_yellow_60)", R.color.cw_yellow_60))
        colorList.add(ColorItem("Yellow 70 (cw_yellow_70)", R.color.cw_yellow_70))
        colorList.add(ColorItem("Yellow 80 (cw_yellow_80)", R.color.cw_yellow_80))
        colorList.add(ColorItem("Yellow 90 (cw_yellow_90)", R.color.cw_yellow_90))
        colorList.add(ColorItem("Yellow 100 (cw_yellow_100)", R.color.cw_yellow_100))

        colorList.add(ColorItem("Blue 10 (cw_blue_10)", R.color.cw_blue_10))
        colorList.add(ColorItem("Blue 20 (cw_blue_20)", R.color.cw_blue_20))
        colorList.add(ColorItem("Blue 30 (cw_blue_30)", R.color.cw_blue_30))
        colorList.add(ColorItem("Blue 40 (cw_blue_40)", R.color.cw_blue_40))
        colorList.add(ColorItem("Blue 50 (cw_blue_50)", R.color.cw_blue_50))
        colorList.add(ColorItem("Blue 60 (cw_blue_60)", R.color.cw_blue_60))
        colorList.add(ColorItem("Blue 70 (cw_blue_70)", R.color.cw_blue_70))
        colorList.add(ColorItem("Blue 80 (cw_blue_80)", R.color.cw_blue_80))
        colorList.add(ColorItem("Blue 90 (cw_blue_90)", R.color.cw_blue_90))
        colorList.add(ColorItem("Blue 100 (cw_blue_100)", R.color.cw_blue_100))

        colorList.add(ColorItem("Teal 10 (cw_teal_10)", R.color.cw_teal_10))
        colorList.add(ColorItem("Teal 20 (cw_teal_20)", R.color.cw_teal_20))
        colorList.add(ColorItem("Teal 30 (cw_teal_30)", R.color.cw_teal_30))
        colorList.add(ColorItem("Teal 40 (cw_teal_40)", R.color.cw_teal_40))
        colorList.add(ColorItem("Teal 50 (cw_teal_50)", R.color.cw_teal_50))
        colorList.add(ColorItem("Teal 60 (cw_teal_60)", R.color.cw_teal_60))
        colorList.add(ColorItem("Teal 70 (cw_teal_70)", R.color.cw_teal_70))
        colorList.add(ColorItem("Teal 80 (cw_teal_80)", R.color.cw_teal_80))
        colorList.add(ColorItem("Teal 90 (cw_teal_90)", R.color.cw_teal_90))
        colorList.add(ColorItem("Teal 100 (cw_teal_100)", R.color.cw_teal_100))

        colorList.add(ColorItem("Purple 10 (cw_purple_10)", R.color.cw_purple_10))
        colorList.add(ColorItem("Purple 20 (cw_purple_20)", R.color.cw_purple_20))
        colorList.add(ColorItem("Purple 30 (cw_purple_30)", R.color.cw_purple_30))
        colorList.add(ColorItem("Purple 40 (cw_purple_40)", R.color.cw_purple_40))
        colorList.add(ColorItem("Purple 50 (cw_purple_50)", R.color.cw_purple_50))
        colorList.add(ColorItem("Purple 60 (cw_purple_60)", R.color.cw_purple_60))
        colorList.add(ColorItem("Purple 70 (cw_purple_70)", R.color.cw_purple_70))
        colorList.add(ColorItem("Purple 80 (cw_purple_80)", R.color.cw_purple_80))
        colorList.add(ColorItem("Purple 90 (cw_purple_90)", R.color.cw_purple_90))
        colorList.add(ColorItem("Purple 100 (cw_purple_100)", R.color.cw_purple_100))

        colorList.add(ColorItem("Pink 10 (cw_pink_10)", R.color.cw_pink_10))
        colorList.add(ColorItem("Pink 20 (cw_pink_20)", R.color.cw_pink_20))
        colorList.add(ColorItem("Pink 30 (cw_pink_30)", R.color.cw_pink_30))
        colorList.add(ColorItem("Pink 40 (cw_pink_40)", R.color.cw_pink_40))
        colorList.add(ColorItem("Pink 50 (cw_pink_50)", R.color.cw_pink_50))
        colorList.add(ColorItem("Pink 60 (cw_pink_60)", R.color.cw_pink_60))
        colorList.add(ColorItem("Pink 70 (cw_pink_70)", R.color.cw_pink_70))
        colorList.add(ColorItem("Pink 80 (cw_pink_80)", R.color.cw_pink_80))
        colorList.add(ColorItem("Pink 90 (cw_pink_90)", R.color.cw_pink_90))
        colorList.add(ColorItem("Pink 100 (cw_pink_100)", R.color.cw_pink_100))

        colorList.add(ColorItem("Neutral 00 (cw_neutral_00)", R.color.cw_neutral_00))
        colorList.add(ColorItem("Neutral 10 (cw_neutral_10)", R.color.cw_neutral_10))
        colorList.add(ColorItem("Neutral 20 (cw_neutral_20)", R.color.cw_neutral_20))
        colorList.add(ColorItem("Neutral 30 (cw_neutral_30)", R.color.cw_neutral_30))
        colorList.add(ColorItem("Neutral 40 (cw_neutral_40)", R.color.cw_neutral_40))
        colorList.add(ColorItem("Neutral 50 (cw_neutral_50)", R.color.cw_neutral_50))
        colorList.add(ColorItem("Neutral 60 (cw_neutral_60)", R.color.cw_neutral_60))
        colorList.add(ColorItem("Neutral 70 (cw_neutral_70)", R.color.cw_neutral_70))
        colorList.add(ColorItem("Neutral 80 (cw_neutral_80)", R.color.cw_neutral_80))
        colorList.add(ColorItem("Neutral 90 (cw_neutral_90)", R.color.cw_neutral_90))
        colorList.add(ColorItem("Neutral 100 (cw_neutral_100)", R.color.cw_neutral_100))
    }

    companion object {
        val colorList = mutableListOf<ColorItem>()
    }

}
