package com.mws.movielist_mwsp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class dashboard_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val cardOne = findViewById<CardView>(R.id.cardOne)
        val cardTwo = findViewById<CardView>(R.id.cardTwo)
        val cardThree = findViewById<CardView>(R.id.cardThree)
        val cardFour = findViewById<CardView>(R.id.cardFour)


        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController = findNavController(R.id.fragment)
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment, R.id.listFragment, R.id.profileFragment))
        setupActionBarWithNavController(navController, appBarConfiguration)


        cardOne.setOnClickListener{
            startActivity(Intent(this, MovieDetailOne::class.java))
        }

        cardTwo.setOnClickListener{
            startActivity(Intent(this, MovieDetailTwo::class.java))
        }

        cardThree.setOnClickListener{
            startActivity(Intent(this, MovieDetailThree::class.java))
        }

        cardFour.setOnClickListener{
            startActivity(Intent(this, MovieDetailFour::class.java))
        }




        bottomNavigationView.setupWithNavController(navController)
    }

}