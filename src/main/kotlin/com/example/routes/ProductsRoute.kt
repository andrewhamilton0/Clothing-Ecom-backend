package com.example.routes

import com.example.data.Store
import com.example.data.model.Categories.JEWELRY
import com.example.data.model.Categories.KIDS
import com.example.data.model.Categories.MENS
import com.example.data.model.Categories.TECH
import com.example.data.model.Categories.WOMENS
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getProducts(){
    get("/products") {
        call.respond(
            HttpStatusCode.OK,
            Store.products
        )
    }
}

fun Route.getCategories(){
    get("/products/categories") {
        call.respond(
            HttpStatusCode.OK,
            Store.categories
        )
    }
}

fun Route.getProductsOfCategory() {
    get("/products/category/{category}"){
        val categorizedProducts = when(call.parameters["category"]){
            WOMENS -> Store.products.filter { it.category == WOMENS }
            MENS -> Store.products.filter { it.category == MENS }
            KIDS -> Store.products.filter { it.category == KIDS }
            TECH -> Store.products.filter { it.category == TECH }
            JEWELRY -> Store.products.filter { it.category == JEWELRY }
            else -> emptyList()
        }
        call.respond(
            HttpStatusCode.OK,
            categorizedProducts
        )

    }
}