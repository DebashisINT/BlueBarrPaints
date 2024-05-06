package com.breezefieldbluebarry.app.domain

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.breezefieldbluebarry.app.AppConstant

@Dao
interface TeamAllListDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    @JvmSuppressWildcards
    abstract fun insertAll(kist: List<TeamAllListEntity>)

    @Query("select * from "+ AppConstant.TEAM_LIST_ALL)
    fun getAll(): List<TeamAllListEntity>

    @Query("select * from "+ AppConstant.TEAM_LIST_ALL+" where user_id=:user_id")
    fun getByID(user_id:String): TeamAllListEntity
}