package gz.dam.catroomapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomgatos.GatosEntity
import gz.dam.catroomapp.data.dao.CatDao
import gz.dam.catroomapp.data.entity.CatEntity

@Database(
    entities = [GatosEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun catDao(): GatosDao
}
