package com.example.drinkstoreapp.repository

import com.example.drinkstoreapp.dao.DrinkStoreDao
import com.example.drinkstoreapp.model.DrinkStore
import kotlinx.coroutines.flow.Flow;

class DrinkStoreRepository(private val drinkStoreDao: DrinkStoreDao) {
    val allDrinkStores: Flow<List<DrinkStore>> = drinkStoreDao.getAllDrinkStore()

    suspend fun insertDrinkStore(drinkStore: DrinkStore){
        drinkStoreDao.insertDrinkStore(drinkStore)
    }
    suspend fun deleteDrinkStore(drinkStore: DrinkStore){
        drinkStoreDao.insertDrinkStore(drinkStore)
    }
    suspend fun updateDrinkStore(drinkStore: DrinkStore){
        drinkStoreDao.insertDrinkStore(drinkStore)
    }
}