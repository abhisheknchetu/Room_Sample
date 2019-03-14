package sample.room.com.room_sample;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by abhishekn on 3/12/2019.
 */
@Entity(tableName = "employee_table")
public class Employee {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "employeeId")
    private String empId;

    @NonNull
    @ColumnInfo(name = "emp_name")
    private String name;

    @NonNull
    @ColumnInfo(name = "emp_role")
    private String designation;

    @NonNull
    @ColumnInfo(name = "project)")
    private String project;
    private int mobileNum;

    public void setEmpId(@NonNull String empId) {
        this.empId = empId;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public void setDesignation(@NonNull String designation) {
        this.designation = designation;
    }

    public void setProject(@NonNull String project) {
        this.project = project;
    }

    public void setMobileNum(int mobileNum) {
        this.mobileNum = mobileNum;
    }

    @NonNull
    public String getEmpId() {
        return empId;
    }

    @NonNull
    public String getName() {
        return name;
    }

    @NonNull
    public String getDesignation() {
        return designation;
    }

    @NonNull
    public String getProject() {
        return project;
    }

    public int getMobileNum() {
        return mobileNum;
    }
}
