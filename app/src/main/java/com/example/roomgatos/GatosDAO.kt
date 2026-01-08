import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RecordDao {

    @Query("SELECT * FROM record_table WHERE id = 1")
    fun getRecord(): RecordEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveRecord(record: RecordEntity)
}
