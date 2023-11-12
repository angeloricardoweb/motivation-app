package com.angeloricardoweb.motivation_app.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.angeloricardoweb.motivation_app.infra.MotivationConstants
import com.angeloricardoweb.motivation_app.R
import com.angeloricardoweb.motivation_app.infra.SecurityPreferences
import com.angeloricardoweb.motivation_app.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)

        setContentView(binding.root)

        supportActionBar?.hide()

        // events
        binding.buttonSave.setOnClickListener(this)


    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_save) {
            handleSave()
        }
    }



    private fun handleSave() {
        val name = binding.editName.text.toString()
        if (name != "") {
            SecurityPreferences(this).storeString(MotivationConstants.KEY.USER_NAME, name)
            finish()
        } else {
            Toast.makeText(
                this,
                R.string.validation_mandatory_name,
                Toast.LENGTH_LONG
            ).show()
        }
    }

}