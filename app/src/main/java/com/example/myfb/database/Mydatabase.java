package com.example.myfb.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.nfc.Tag;
import android.util.Log;

import androidx.annotation.Nullable;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class Mydatabase extends SQLiteOpenHelper {

    // Database Name and Version
    public static final String DB_NAME = "my_database_name";
    public static final int DB_VERSION = 1;

    // Student Table Name and Column Names
    private static final String STUDENT_TABLE = "student";


    private static final String STUDENT_NAME = "name";
    private static final String STUDENT_AGE = "age";
    private static final String STUDENT_MARKS = "marks";

    private static final String CREATE_STUDENT_TABLE = "CREATE TABLE "+STUDENT_TABLE+"("+STUDENT_NAME+" VARCHAR (120) ,"+STUDENT_AGE+" INTEGER ,"+STUDENT_MARKS+" INTEGER );";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " +STUDENT_TABLE;

    public Mydatabase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d(TAG ,"onCreate: " + " Database Create Successfully ");
        db.execSQL(CREATE_STUDENT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.d(TAG ,"onCreate: " + " Database Update Successfully ");
        db.execSQL(DROP_TABLE);
        onCreate(db);
    }

    public long insertStudent(String name,int age,int marks){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(" INSERT INTO "+STUDENT_TABLE+" VALUES ("+name+","+age+","+marks+")");
        db.close();
        return 0;
    }

}
