package com.example.brandontownesxmlcolorme

import android.os.Bundle
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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}

