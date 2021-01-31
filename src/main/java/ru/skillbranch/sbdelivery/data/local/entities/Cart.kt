package ru.skillbranch.sbdelivery.data.local.entities

import androidx.room.*
import java.util.*

@Entity(
    tableName = "cart"

)

data class Cart(
    @PrimaryKey
    val id: String,
    @ColumnInfo(name = "user_id") //TODO
    val userId: String,
    val promocode: String? = null,
    val promotext: String? = null,
    val total: Int
)