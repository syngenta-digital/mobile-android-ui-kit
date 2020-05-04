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
import kotlinx.android.synthetic.main.fragment_colors.*

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

    override fun onResume() {
        super.onResume()
        (activity as MainActivity).setTitle(getString(R.string.colors))
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initializeList()
        val context = context ?: return

        val recyclerView = recycler_color_list
        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                recyclerView.context,
                layoutManager.orientation
            )
        )
        val adapter = ColorsAdapter(context, colorList.toTypedArray())
        recyclerView.adapter = adapter

    }

    private fun initializeList() {
        colorList.clear()
        colorList.add(ColorItem("Teal 100", R.color.teal_100))
        colorList.add(ColorItem("Teal 300", R.color.teal_300))
        colorList.add(ColorItem("Teal 500", R.color.teal_500))
        colorList.add(ColorItem("Teal 700", R.color.teal_700))
        colorList.add(ColorItem("Orange 100", R.color.orange_100))
        colorList.add(ColorItem("Orange 300", R.color.orange_300))
        colorList.add(ColorItem("Orange 500", R.color.orange_500))
        colorList.add(ColorItem("Orange 700", R.color.orange_700))
        colorList.add(ColorItem("Red 100", R.color.red_100))
        colorList.add(ColorItem("Red 300", R.color.red_300))
        colorList.add(ColorItem("Red 500", R.color.red_500))
        colorList.add(ColorItem("Red 700", R.color.red_700))
        colorList.add(ColorItem("Blue 100", R.color.blue_100))
        colorList.add(ColorItem("Blue 300", R.color.blue_300))
        colorList.add(ColorItem("Blue 500", R.color.blue_500))
        colorList.add(ColorItem("Blue 700", R.color.blue_700))
        colorList.add(ColorItem("Yellow 100", R.color.yellow_100))
        colorList.add(ColorItem("Yellow 300", R.color.yellow_300))
        colorList.add(ColorItem("Yellow 500", R.color.yellow_500))
        colorList.add(ColorItem("Yellow 700", R.color.yellow_700))
        colorList.add(ColorItem("Neutral 500", R.color.neutral_500))

    }

    companion object {
        val colorList = mutableListOf<ColorItem>()
    }

}
