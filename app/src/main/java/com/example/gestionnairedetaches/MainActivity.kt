package com.example.gestionnairedetaches

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.gestionnairedetaches.ui.theme.GestionnairedetachesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GestionnairedetachesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )
                {
                    Gestionnairedetaches(
                        premiermessage = "All tasks completed",
                        deuxiememessage = "Nice work!",
                    )
                }

            }
        }
    }
}

@Composable
fun Gestionnairedetaches(premiermessage: String, deuxiememessage: String,
                         modifier: Modifier = Modifier) {
   Column(){
       val image = painterResource(R.drawable.check)
       Image(
           painter = image,
           contentDescription = null,
       )

       Text(
           text = premiermessage,
           modifier = modifier
       )
       Text(
           text = deuxiememessage,
           modifier = modifier
       )
   }
}

@Preview(showBackground = true)
@Composable
fun GestionnairedetachesPreview() {
    Gestionnairedetaches(
        premiermessage = "All tasks completed",
        deuxiememessage = "Nice work!",
    )
}