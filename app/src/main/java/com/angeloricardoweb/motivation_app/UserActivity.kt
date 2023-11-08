package com.angeloricardoweb.motivation_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.angeloricardoweb.motivation_app.databinding.ActivityMainBinding
import com.angeloricardoweb.motivation_app.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)

        setContentView(binding.root)

        supportActionBar?.hide()

        binding.buttonSave.setOnClickListener(this)


    }

    override fun onClick(view: View) {
        if(view.id == R.id.button_save){
            println('o')
        }
    }

}