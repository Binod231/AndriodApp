package com.example.todo_task

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.todo_task.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TodoUiImage()
                    TodoText(message1 ="All tasks completed",
                        message2 = "Nice work!", modifier = Modifier)
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun TodoTaskPreview() {
    HappyBirthdayTheme {
        TodoUiImage()
        TodoText(message1 ="All tasks completed",
            message2 = "Nice work!", modifier = Modifier)

    }
}

@Composable
fun TodoUiImage(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.ic_task_completed)
    Box(contentAlignment = Alignment.Center) {
        Image(
            painter = image,
            contentDescription = null,

            )
    }
}

@Composable
fun TodoText(message1: String,message2: String, modifier: Modifier) {
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = message1,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.paddingFromBaseline(284.dp, 8.dp),
        )
        Text(
            text = message2,
            fontSize = 16.sp
        )
    }
}