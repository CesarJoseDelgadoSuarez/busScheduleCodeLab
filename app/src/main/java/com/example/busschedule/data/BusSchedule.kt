package com.example.busschedule.data

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "busSchedule")
data class BusSchedule(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @NonNull
    @ColumnInfo(name = "stop_name")
    val stopName: String,
    @NonNull
    @ColumnInfo(name = "arrival_time")
    val arrivalTimeInMillis: Int
)
