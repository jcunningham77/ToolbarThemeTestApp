package com.jeffcunningham.toolbarthemingtestapp;

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.third_activity)
        setSupportActionBar(findViewById(R.id.topAppBar))
    }
}
