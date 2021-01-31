package ru.skillbranch.sbdelivery.data.local.entities

import androidx.room.*
import java.util.*

@Entity(
    tableName = "reviews"
)

data class Reviews (
    @PrimaryKey
    val id:String,
    @ColumnInfo(name = "dish_id")
    val dishId: String,
    val author: String,
    val date: Date,
    val rating: Int,
    val text: String?,
    @ColumnInfo(name = "created_at")
    val createdAt: Date,
    @ColumnInfo(name = "updated_at")
    val updatedAt: Date
)