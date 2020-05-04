package com.syngenta.uikit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.syngenta.uikit.fragments.ButtonsFragment
import com.syngenta.uikit.fragments.ColorsFragment
import com.syngenta.uikit.fragments.DialogsFragment
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
        navigateTo(ButtonsFragment())
    }

    fun showDialogsLayout() {
        navigateTo(DialogsFragment())
    }

    fun showColorsLayout() {
        navigateTo(ColorsFragment())
    }

    private fun navigateTo(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        fragmentTransaction.commit()
    }
}
