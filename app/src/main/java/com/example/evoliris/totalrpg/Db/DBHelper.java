package com.example.evoliris.totalrpg.Db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.evoliris.totalrpg.Db.DAO.ScoreDAO;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "RPGMax";
    public static int CURRENT_VERSION = 1;

    public DBHelper(Context context) {
        super(context, DB_NAME, null, CURRENT_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ScoreDAO.CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

            db.execSQL(ScoreDAO.DROP);

            db.execSQL(ScoreDAO.CREATE);


    }
}
