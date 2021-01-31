package ru.skillbranch.sbdelivery.data.local.entities

import androidx.room.*
import java.util.*

@Entity(
    tableName = "categories",
    foreignKeys = [
        ForeignKey(
            entity = Category::class,
            parentColumns = ["id"],
            childColumns = ["parent"],
            onDelete = ForeignKey.SET_NULL
        )
    ]
)

data class Category(
    @PrimaryKey
    val id: String,
    val name: String,
    val order: Int,
    val icon: String,
    val parent: String?,
    val active: Boolean,
    @ColumnInfo(name = "created_at")
    val createdAt: Date,
    @ColumnInfo(name = "updated_at")
    val updatedAt: Date
)