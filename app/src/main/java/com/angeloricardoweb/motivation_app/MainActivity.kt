package com.angeloricardoweb.motivation_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.angeloricardoweb.motivation_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        // esconde o action bar se ele existir
        supportActionBar?.hide()


        binding.buttonNewPhrase.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        if(view.id == R.id.button_new_phrase){
            println('o')
        }
    }
}