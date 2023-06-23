package com.example.drinkstoreapp.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.drinkstoreapp.model.DrinkStore
import kotlinx.coroutines.flow.Flow

@Dao
interface DrinkStoreDao {
    @Query("SELECT * FROM drink_table ORDER BY id ASC")
    fun getAllDrinkStore(): Flow<List<DrinkStore>>

    @Insert
    suspend fun insertDrinkStore(drinkStore: DrinkStore)

    @Delete
    suspend fun deleteDrinkStore(drinkStore: DrinkStore)

    @Update
    fun updateDrinkStore(drinkStore: DrinkStore)
}