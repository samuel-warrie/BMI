//package com.example.bmi
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import andriodx.compose.runtime.mutableStateOf
//import andriodx.compose.runtime.remember
//import andriodx.compose.runtime.setValue
//import andriodx.compose.runtime.getvalue
//import android.icu.text.DecimalFormat
//import androidx.compose.foundation.text.KeyboardOptions
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.text.input.KeyboardType
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.bmi.ui.theme.BmiTheme
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            DeleteTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Bmi(
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun Bmi(modifier: Modifier = Modifier) {
//    Column {
//       Text (   text = "Body mass Index",
//                fontSize = 24.sp,
//                color = MaterialTheme.colorScheme.primary,
//                textAlign = TextAlign.Center,
//                modifier = modifier.fillMaxWidth().padding(vertical = 16.dp)
//
//        )
//        OutlinedTextField(
//            value = heightinput,
//            onValueChange = {heightInput = it.replace(',','.')},
//            label = {Text("Height")},
//            singleLine = true,
//            keyboardActions = KeyboardOptions(
//                keyboardType = KeyboardType.Number),
//            modifier = Modifier.fillMaxWidth().padding(start = 8.dp, end = 8.dp)
//            )
//        )
//        OutlinedTextField(
//            value = weightInput,
//            onValueChange = {weightInput = it.replace(',','.')},
//            label = {Text("Weight")},
//            singleLine = true,
//            keyboardActions = KeyboardOptions(
//                keyboardType = KeyboardType.Number),
//            modifier = Modifier.fillMaxWidth().padding(start = 8.dp, end = 8.dp)
//        )
//        Text(
//            text = "Body mass index is" + bmi,
//            modifier = Modifier.fillMaxWidth().padding(start = 16.dp,top = 16.dp)
//        )
//
//
//        )
//    }
//}
//@Composable
//fun Bmi(modifier: Modifier = Modifier){
//    var heightinput: String by remember { mutableStateOf("") }
//    var heightinput: String by remember { mutableStateOf("") }
//    val height = heightinput.toFloatOrNull() ?: 0.0f
//    val weight = weightInput.toIntOrNull() ?: 0
//    val formatter = DecimalFormat("0.00")
//    val bmi = if (weight > 0 && height > 0) formatter.format(weight / (height *height)) else 0.0f
//
//
//}
//
//@Preview(showBackground = true)
//@Composable
//fun BmiPreview() {
//    BmiTheme {
//        Bmi()
//    }
//}

package com.example.bmi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bmi.ui.theme.BmiTheme
import java.text.DecimalFormat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BmiTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Bmi(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Bmi(modifier: Modifier = Modifier) {
    var heightInput by remember { mutableStateOf("") }
    var weightInput by remember { mutableStateOf("") }

    val height = heightInput.toFloatOrNull() ?: 0.0f
    val weight = weightInput.toFloatOrNull() ?: 0.0f
    val formatter = DecimalFormat("0.00")
    val bmi = if (weight > 0 && height > 0) {
        formatter.format(weight / (height * height))
    } else {
        ""
    }

    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = stringResource(R.string.body_mass_index),
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        )

        OutlinedTextField(
            value = heightInput,
            onValueChange = { heightInput = it.replace(',', '.') },
            label = { Text(stringResource(R.string.height)) },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )

        OutlinedTextField(
            value = weightInput,
            onValueChange = { weightInput = it.replace(',', '.') },
            label = { Text(stringResource(R.string.weight)) },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        Text(
            text = if (bmi.isNotEmpty()) stringResource(R.string.body_mass_index_is, bmi) else "Enter valid values",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BmiPreview() {
    BmiTheme {
        Bmi()
    }
}
