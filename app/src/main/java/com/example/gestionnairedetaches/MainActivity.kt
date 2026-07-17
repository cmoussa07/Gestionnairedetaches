package com.example.gestionnairedetaches

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                        premiermessage = stringResource(R.string.all_tasks_completed_text),
                        deuxiememessage = stringResource(R.string.nice_work_text),
                    )
                }

            }
        }
    }
}

@Composable
fun Gestionnairedetaches(premiermessage: String, deuxiememessage: String,
                         modifier: Modifier = Modifier) {
   Column(
       modifier = modifier
           .fillMaxSize(),
       verticalArrangement = Arrangement.Center,
       horizontalAlignment = Alignment.CenterHorizontally

   ){
       val image = painterResource(R.drawable.check)
       Image(
           painter = image,
           contentDescription = null,
       )

       Text(
           text = premiermessage,
           fontWeight = FontWeight.Bold,
           modifier = Modifier
               .padding(top = 24.dp)
               .padding(bottom = 8.dp)
       )
       Text(
           text = deuxiememessage,
           fontSize = 16.sp
       )
   }
}

@Preview(showBackground = true)
@Composable
fun GestionnairedetachesPreview() {
    Gestionnairedetaches(
        premiermessage = stringResource(R.string.all_tasks_completed_text),
        deuxiememessage = stringResource(R.string.nice_work_text),
    )
}