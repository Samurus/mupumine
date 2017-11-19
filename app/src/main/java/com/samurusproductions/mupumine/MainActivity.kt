package com.samurusproductions.mupumine

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.setContentView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       var ui = MainUI()                //define Anko UI Layout to be used
        ui.setContentView(this)                 //Set Anko UI to this Activity
       // setContentView(R.layout.activity_main)
    }
}
