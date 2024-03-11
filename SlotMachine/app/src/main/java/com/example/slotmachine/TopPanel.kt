package com.example.slotmachine

import androidx.compose.foundation.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.FlowRowScope
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.*
import androidx.compose.material.icons.*
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.*
import androidx.compose.ui.draw.drawWithCache
import com.example.slotmachine.R

@Composable
fun TopPanel(
    balance: Int = 2000,
    level: Int = 1,
    progress: Float = 0.5f,
    onSettingsClick: () -> Unit = {}
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

            LevelProgressBar(level = level, progress = progress, modifier = Modifier.weight(0.5f))

            Text(
                text = "$balance",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )

        IconButton(onClick = onSettingsClick) {
            Icon(imageVector = Icons.Outlined.Settings, contentDescription = "Настройки")
        }
    }
}

@Composable
fun LevelProgressBar(level: Int,progress: Float ,modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .width(20.dp)
    ) {
        LinearProgressIndicator(
            progress = progress,
            modifier = Modifier
                .height(20.dp)
        )

        Box(
            modifier = Modifier
                .matchParentSize()
        ) {
            Text(
                text = "Ур. $level",
                color = Color.Black,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp
                ),
                modifier = Modifier
                    .wrapContentWidth()
                    .align(Alignment.Center)
            )
        }
    }
}



