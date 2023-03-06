package com.example.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aluvery.ui.theme.AluveryTheme
import com.example.aluvery.ui.theme.Purple200
import com.example.aluvery.ui.theme.Purple500
import com.example.aluvery.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme() {
                Surface {
                    ProductItem()
                }
            }
        }
    }
}

@Preview(showBackground = false)
@Composable
fun ProductItem() {
        Surface(Modifier.padding(8.dp),
            shape = RoundedCornerShape(15.dp),
            elevation = 4.dp ) {
            Column(modifier = Modifier
                .heightIn(250.dp, 300.dp)
                .width(200.dp)
            ) {
                val imageSize = 100.dp
                Box(modifier = Modifier
                    .height(imageSize)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Purple500, Teal200
                            )
                        )
                    )
                    .fillMaxWidth()
                ){
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        contentDescription = null,
                        modifier = Modifier
                            .size(imageSize)
                            .offset(y = imageSize / 2 )
                            .clip(shape = CircleShape)
                            .align(alignment = BottomCenter)
                    )
                }
                Spacer(modifier = Modifier.height(imageSize/2))

                    Text(
                        text = LoremIpsum(words = 50).values.first(),
                        fontSize = 18.sp,
                        fontWeight = FontWeight(700),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "R$ 14,99",
                        Modifier.padding(top = 8.dp),
                        fontSize = 14.sp,
                        fontWeight = FontWeight(weight = 400)
                    )


            }
        }

}

