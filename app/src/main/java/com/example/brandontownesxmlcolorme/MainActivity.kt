package com.example.brandontownesxmlcolorme

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.example.brandontownesxmlcolorme.databinding.ActivityMainBinding
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.brandontownesxmlcolorme.ui.theme.BrandonTownesXMLColorMeTheme

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonRed.setOnClickListener {
            binding.buttonRed.setBackgroundColor(resources.getColor(R.color.red))
            binding.toastMessage.setText("Red Button")
        }

        binding.buttonGreen.setOnClickListener {
            binding.buttonGreen.setBackgroundColor(resources.getColor(R.color.green))
            binding.toastMessage.setText("Green Button")
        }

        binding.buttonBlue.setOnClickListener {
            binding.buttonBlue.setBackgroundColor(resources.getColor(R.color.blue))
            binding.toastMessage.setText("Blue Button")
        }

        binding.resetbutton.setOnClickListener {
            binding.buttonBlue.setBackgroundColor(resources.getColor(R.color.white))
            binding.buttonGreen.setBackgroundColor(resources.getColor(R.color.white))
            binding.buttonRed.setBackgroundColor(resources.getColor(R.color.white))
            binding.toastMessage.setText("")
        }

    }

}

