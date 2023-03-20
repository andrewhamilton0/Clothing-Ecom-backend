package com.example.data

import com.example.BASE_URL
import com.example.data.model.Categories.JEWELRY
import com.example.data.model.Categories.KIDS
import com.example.data.model.Categories.MENS
import com.example.data.model.Categories.TECH
import com.example.data.model.Categories.WOMENS
import com.example.data.model.Product
import com.example.data.model.Rating

object Store {
    val categories = listOf<String>(MENS, WOMENS, KIDS, TECH, JEWELRY)
    val products = listOf<Product>(
        Product(category = JEWELRY, description = "2.5ct", imageUrl = "$BASE_URL/jewelry/diamond-misc.jpg", id= 10039038, price = 499.99, rating = Rating(count = 4, rate = 10.0), title = "Diamond Necklace" ),
        Product(category = MENS, description = "Soft and Stylish", imageUrl = "$BASE_URL/mens/blue-jacket.jpg", id= 78216948, price = 59.99, rating = Rating(count = 20, rate = 7.2), title = "Blue Jacket" ),
        Product(category = WOMENS, description = "White cotton", imageUrl = "$BASE_URL/womens/button-down-professional.jpg", id= 46512051, price = 39.99, rating = Rating(count = 37, rate = 9.2), title = "White Button Down" ),
        Product(category = TECH, description = "Flagship", imageUrl = "$BASE_URL/tech/google-phones.jpg", id= 39393933, price = 899.99, rating = Rating(count = 43, rate = 8.7), title = "Google Pixel" ),
        Product(category = KIDS, description = "Beige cotton", imageUrl = "$BASE_URL/kids/boys-tshirt.jpg", id= 54369210, price = 24.99, rating = Rating(count = 5, rate = 6.4), title = "Boys T-Shirt" )
    )
}