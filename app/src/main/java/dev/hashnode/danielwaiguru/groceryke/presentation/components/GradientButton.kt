package dev.hashnode.danielwaiguru.groceryke.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.hashnode.danielwaiguru.groceryke.ui.theme.primaryColor
import dev.hashnode.danielwaiguru.groceryke.ui.theme.primaryVariantColor

@Composable
fun GradientButton(
    text: String,
    textColor: Color,
    gradient: Brush,
    onClick:() -> Unit
) {
    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent
        ),
        contentPadding = PaddingValues(),
        onClick = { onClick() },
        shape = RoundedCornerShape(25.dp)
    )
    {
        Box(
            modifier = Modifier.background(gradient)
                .padding(horizontal = 32.dp, vertical = 16.dp)

            ,
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = text,
                color = textColor,
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal
            )
        }
    }
}
@Preview
@Composable
fun GradientButtonPreview() {
    GradientButton(
        text = "Get Started",
        textColor = Color.White,
        gradient = Brush.horizontalGradient(
            colors = listOf(primaryVariantColor, primaryColor)
        )){}
}