package com.angeloricardoweb.motivation_app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.angeloricardoweb.motivation_app.infra.MotivationConstants
import com.angeloricardoweb.motivation_app.R
import com.angeloricardoweb.motivation_app.infra.SecurityPreferences
import com.angeloricardoweb.motivation_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        // esconde o action bar se ele existir
        supportActionBar?.hide()

        handleUserName()
        binding.buttonNewPhrase.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_new_phrase) {
            println('o')
        }
    }

    private fun handleUserName() {
        val name = SecurityPreferences(this).getString(MotivationConstants.KEY.USER_NAME)
        binding.userName.text = "Olá, $name!"
    }
}