package gz.dam.catroomapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.room.Room
import com.example.roomgatos.GatosEntity
import gz.dam.catroomapp.data.database.AppDatabase
import gz.dam.catroomapp.data.entity.CatEntity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "cat_database"
        )
            .allowMainThreadQueries() // SOLO para ejemplo
            .build()

        val GatosDao = db.GatosDao()

        // Insertamos gatitos
        GatosDao.insertCat(GatosEntity(name = "Michi", age = 2, color = "Naranja"))
        GatosDao.insertCat(GatosEntity(name = "Luna", age = 4, color = "Negra"))

        // Recuperamos los gatitos
        val cats = GatosDao.getAllCats()
        Log.d("CAT_ROOM", "Gatitos guardados: $cats")
    }
}
