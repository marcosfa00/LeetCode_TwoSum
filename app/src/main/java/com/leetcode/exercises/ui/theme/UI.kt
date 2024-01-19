package com.leetcode.exercises.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.leetcode.exercises.MainViewModel
@Composable
fun Greeting(model: MainViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .wrapContentSize(Alignment.Center)
    ) {
        Title()
        TextBox()
        SendBtn(model)
    }
}

@Composable
fun Title(){
    Text(text = "Two Sum", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp))
}

@Composable
fun SendBtn(model: MainViewModel){
    OutlinedButton(onClick = {

        model.twoSumVM()

    }) {
        Text(text = "SEND")
    }

}

@Composable
fun TextBox(){

    Column {
        for(i in 0 until Data.lista.size){
            Inputs(Data.lista[i])
        }


    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Inputs(name: String) {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = {
            text = it
           if (name.equals("Array")){
               Data.nums.value = text
           }else{
               Data.target.value = text
           }
        },
        label = {
            Text(text = name, color = Color.Gray)
        },
        modifier = Modifier.padding(top = 8.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Gray,
            unfocusedBorderColor = Color.Gray,
            textColor = Color.Black,
            cursorColor = Color.Black
        )
    )
}


