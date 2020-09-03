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
        colorList.add(ColorItem("Green 50 (cw_green_50)", R.color.cw_green_50))
        colorList.add(ColorItem("Green 60 (cw_green_60)", R.color.cw_green_60))
        colorList.add(ColorItem("Green 70 (cw_green_70)", R.color.cw_green_70))

        colorList.add(ColorItem("Red 50 (cw_red_50)", R.color.cw_red_50))
        colorList.add(ColorItem("Red 60 (cw_red_60)", R.color.cw_red_60))
        colorList.add(ColorItem("Red 70 (cw_red_70)", R.color.cw_red_70))

        colorList.add(ColorItem("Orange 50 (cw_orange_50)", R.color.cw_orange_50))
        colorList.add(ColorItem("Orange 60 (cw_orange_60)", R.color.cw_orange_60))
        colorList.add(ColorItem("Orange 70 (cw_orange_70)", R.color.cw_orange_70))

        colorList.add(ColorItem("Yellow 50 (cw_yellow_50)", R.color.cw_yellow_50))
        colorList.add(ColorItem("Yellow 60 (cw_yellow_60)", R.color.cw_yellow_60))
        colorList.add(ColorItem("Yellow 70 (cw_yellow_70)", R.color.cw_yellow_70))

        colorList.add(ColorItem("Blue 50 (cw_blue_50)", R.color.cw_blue_50))
        colorList.add(ColorItem("Blue 60 (cw_blue_60)", R.color.cw_blue_60))
        colorList.add(ColorItem("Blue 70 (cw_blue_70)", R.color.cw_blue_70))

        colorList.add(ColorItem("Teal 50 (cw_teal_50)", R.color.cw_teal_50))
        colorList.add(ColorItem("Teal 60 (cw_teal_60)", R.color.cw_teal_60))
        colorList.add(ColorItem("Teal 70 (cw_teal_70)", R.color.cw_teal_70))

        colorList.add(ColorItem("Purple 50 (cw_purple_50)", R.color.cw_purple_50))
        colorList.add(ColorItem("Purple 60 (cw_purple_60)", R.color.cw_purple_60))
        colorList.add(ColorItem("Purple 70 (cw_purple_70)", R.color.cw_purple_70))

        colorList.add(ColorItem("Pink 50 (cw_pink_50)", R.color.cw_pink_50))
        colorList.add(ColorItem("Pink 60 (cw_pink_60)", R.color.cw_pink_60))
        colorList.add(ColorItem("Pink 70 (cw_pink_70)", R.color.cw_pink_70))

        colorList.add(ColorItem("Neutral 50 (cw_neutral_50)", R.color.cw_neutral_50))
        colorList.add(ColorItem("Neutral 60 (cw_neutral_60)", R.color.cw_neutral_60))
        colorList.add(ColorItem("Neutral 70 (cw_neutral_70)", R.color.cw_neutral_70))
    }

    companion object {
        val colorList = mutableListOf<ColorItem>()
    }

}
