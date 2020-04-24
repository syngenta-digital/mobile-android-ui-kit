package com.syngenta.uikit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.syngenta.uikit.fragments.ButtonsFragment
import com.syngenta.uikit.fragments.HomeFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val homeFragment = HomeFragment()
        fragmentTransaction.add(R.id.frameLayout, homeFragment)
        fragmentTransaction.commit()
    }

    fun setTitle(title: String) {
        supportActionBar?.title = title
    }

    fun showButtonsLayout() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val buttonsFragment = ButtonsFragment()
        fragmentTransaction.replace(R.id.frameLayout, buttonsFragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        fragmentTransaction.commit()
    }
}
