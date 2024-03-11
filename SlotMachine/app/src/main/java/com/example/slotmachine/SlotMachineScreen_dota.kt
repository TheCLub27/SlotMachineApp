package com.example.slotmachine

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material.icons.*
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun SlotMachineScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        TopPanel()
        SlotReels()
        WinningAmountField()
        BetFields()
        SpinButton()
        ReturnToGamesButton(navController)
    }
}

@Composable
fun SlotReels() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(200.dp)
        .background(Color.Gray)
    ) {

    }
}

@Composable
fun WinningAmountField() {
    Text(
        text = "Winning Amount: $0",
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    )
}

@Composable
fun BetFields(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextButton(onClick = { /*минус*/ }) {
            Icon(imageVector = Icons.Filled.KeyboardArrowLeft, contentDescription = null)
        }

        BasicTextField(value = "Bet: $1",
            onValueChange = { },
            modifier = Modifier.width(IntrinsicSize.Min)
        )

        TextButton(onClick = { /*плюс*/ }) {
            Icon(imageVector = Icons.Filled.KeyboardArrowRight, contentDescription = null)
        }
    }
}

@Composable
fun SpinButton() {
    Button(
        onClick = { /*  */ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp)
    ) {
        Text("Крутить")
    }
}

@Composable
fun ReturnToGamesButton(navController: NavController) {
    Button(
        onClick = { navController.popBackStack() },
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = null)
            Text("Вернуться к играм")
        }
    }
}
