package com.example.jetpackdemo.data.dao

import androidx.room.*
import com.example.jetpackdemo.data.bean.IntegralResponse

@Dao
interface IntegralDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(data: IntegralResponse)

    @Query("SELECT * FROM integral WHERE userId = :userId")
    suspend fun getIntegral(userId: String?): IntegralResponse
}