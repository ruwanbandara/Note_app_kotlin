package ruwanbandara.mytodo

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = {Task.class}, version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}