package com.example.aluvery.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aluvery.models.Product
import com.example.aluvery.R.*
import java.math.BigDecimal


@Composable
fun ProductsSection(
    title: String, products: List<Product>
) {
    Column() {
        Text(
            text = title,
            Modifier.padding(
                start = 16.dp, end = 16.dp
            ),
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        Row(
            Modifier
                .horizontalScroll(rememberScrollState())
                .padding(top = 8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Spacer(modifier = Modifier)
            for (product in products) {
                ProductItem(product = product)
            }
            Spacer(modifier = Modifier)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductsSectionPreview() {
    ProductsSection("Promotional", products = sampleProducts)

}

val sampleProducts = listOf<Product>(
    Product(
        name = "Burger", price = BigDecimal("10.99"), image = drawable.burger
    ),
    Product(
        name = "Pizza", price = BigDecimal("16.99"), image = drawable.pizza
    ),
    Product(
        name = "French Fries", price = BigDecimal("5.89"), image = drawable.fries
    )
)
