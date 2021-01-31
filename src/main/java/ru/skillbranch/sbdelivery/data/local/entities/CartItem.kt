package ru.skillbranch.sbdelivery.data.local.entities

import androidx.room.*
import java.util.*

@Entity(
    tableName = "dishes",
    foreignKeys = [
        ForeignKey(
            entity = Cart::class,
            parentColumns = ["id"],
            childColumns = ["cart_id"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)

data class CartItem (
    @PrimaryKey
    val id: String,
    @ColumnInfo(name = "cart_id")
    val cartId:String,
    val amount: Int,
    val price: Float
)