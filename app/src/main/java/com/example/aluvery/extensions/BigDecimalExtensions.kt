package com.example.aluvery.extensions

import java.math.BigDecimal
import java.text.NumberFormat
import java.util.Locale

fun BigDecimal.toCanadianCurrency(): String {
    return NumberFormat
        .getCurrencyInstance(Locale("en", "ca"))
        .format(this)
}
