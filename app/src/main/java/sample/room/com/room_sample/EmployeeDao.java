package sample.room.com.room_sample;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by abhishekn on 3/12/2019.
 */

@Dao
public interface EmployeeDao {


    LiveData<List<Employee>> getAlphabetizedWords();

    @Insert
    void insertWord(Employee word);

    @Query("Sele")
    void deleteAll();
}
