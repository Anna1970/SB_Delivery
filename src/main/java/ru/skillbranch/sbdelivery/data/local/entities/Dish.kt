package ru.skillbranch.sbdelivery.data.local.entities

import androidx.room.*
import java.util.*

@Entity(
        tableName = "dishes",
        foreignKeys = [
            ForeignKey(
                    entity = Category::class,
                    parentColumns = ["id"],
                    childColumns = ["category"],
                    onDelete = ForeignKey.CASCADE
            )
        ]
)

data class Dish(
    @PrimaryKey
    val id: String,
    val name: String,
    val description: String,
    val image: String,
    @ColumnInfo(name = "old_price")
    val oldPrice: String? = null,
    val price: Float,
    val rating: Int,
    @ColumnInfo(name = "comments_count")
    val commentsCount: Int,
    val likes: Int,
    val category: String,
    val active: Boolean,
    @ColumnInfo(name = "created_at")
    val createdAt: Date,
    @ColumnInfo(name = "updated_at")
    val updatedAt: Date
)