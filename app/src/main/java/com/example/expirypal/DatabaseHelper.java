package com.example.expirypal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ep.db";
    private static final int DATABASE_VERSION = 1;

    // Define table and column names
    public static final String TABLE_NAME = "users";
    public static final String COLUMN_USERNAME = "usern";
    public static final String COLUMN_PASSWORD = "pass";
    public static final String COLUMN_EMAIL = "email";

    // SQL statement to create the table
    private static final String DATABASE_CREATE = "create table " + TABLE_NAME +
            " (" + COLUMN_USERNAME + " text not null, " +
            COLUMN_PASSWORD + " text not null, " +
            COLUMN_EMAIL + " text not null);";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
