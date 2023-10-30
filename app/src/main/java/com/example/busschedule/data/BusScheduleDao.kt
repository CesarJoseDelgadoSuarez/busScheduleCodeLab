package com.example.busschedule.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BusScheduleDao {
    @Query(
        """
        SELECT * FROM busSchedule 
        ORDER BY arrival_time ASC    
        """
    )
    fun getAll(): Flow<List<BusSchedule>>

    @Query(
        """
        SELECT * FROM busSchedule 
        WHERE stop_name = :stopName 
        ORDER BY arrival_time ASC 
        """
    )
    fun getByStopName(stopName: String): Flow<List<BusSchedule>>
}
