package com.patika.bottomnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.patika.bottomnavigationview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        /*val navHostFragment = supportFragmentManager.
        findFragmentById(R.id.fragmentContainerView) as NavHostFragment*/

        binding.apply {
            val navHostFragment  = supportFragmentManager
                .findFragmentById(fragmentContainerView.id) as NavHostFragment
            NavigationUI.setupWithNavController(binding.bottomNavigationView3,navHostFragment.navController)
        }

        /*
        2.ss
        val navController = findNavController(R.id.fragmentContainerView) // layout fragment
        NavigationUI.setupWithNavController(binding.bottomNavigationView3,navController)*/



      //  bottomNavigationView.setupWithNavController(navHostFragment.navController)


    }
}