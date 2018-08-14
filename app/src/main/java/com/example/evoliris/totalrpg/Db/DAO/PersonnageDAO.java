package com.example.evoliris.totalrpg.Db.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.evoliris.totalrpg.Db.DBHelper;

import java.util.Locale;

public class PersonnageDAO {
    /*public static final String TABLE_NAME = "personnage";
    public static final String COL_ID = "pers_id";
    public static final String COL_PLAYER_NAME = "score_player_name";
    public static final String COL_SCORE = "score_score";

    //    public static final String CREATE = "CREATE TABLE score(" +
//            COL_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT, " +
//            COL_PLAYER_NAME+ " VARCHAR(50) NOT NULL, " +
//            COL_SCORE+ " VARCHAR(255) NOT NULL);";

    public static final String CREATE = String.format("CREATE TABLE %s(%s INTEGER PRIMARY KEY AUTOINCREMENT, %s VARCHAR(50) NOT NULL, %s VARCHAR(255), %s VARCHAR(50) NOT NULL)", TABLE_NAME, COL_ID, COL_PLAYER_NAME, COL_SCORE);
    public static final String DROP = String.format("DROP TABLE %s;", TABLE_NAME);

    private DBHelper helper;
    private Context context;
    private SQLiteDatabase db;

    public ScoreDAO(Context context){
        this.context = context;
        this.helper = new DBHelper(this.context);
    }

    public ScoreDAO openReadable(){
        this.db = this.helper.getReadableDatabase();
        return this;
    }
    public ScoreDAO openWriteable(){
        this.db = this.helper.getWritableDatabase();
        return this;
    }

    public void close(){
        this.db.close();
        this.helper.close();
    }

    public void update(Score score){
        ContentValues values = new ContentValues();
        values.put(COL_ID, score.getId());
        values.put(COL_PLAYER_NAME, score.getPlayerName());
        values.put(COL_SCORE, score.getScore());

        db.update(TABLE_NAME, values, String.format(Locale.FRENCH, "%s = %d", COL_ID, score.getId()), null);
    }
    public long insert(Score score){
        ContentValues values = new ContentValues();
        values.put(COL_PLAYER_NAME, score.getPlayerName());
        values.put(COL_SCORE, score.getScore());


        long idInserted = db.insert(TABLE_NAME, null, values);
        score.setId(idInserted);
        return idInserted;
    }
    public Score findById(long id){
        Cursor cursor = db.query(TABLE_NAME, null, COL_ID+ " = "+ id, null, null, null, null);

        if(cursor == null)return null;
        if(cursor.getCount() == 0)return null;

        cursor.moveToFirst();
        return cursorToMovie(cursor);
    }

    private Score cursorToMovie(Cursor cursor){
        Score score = new Score();

        score.setId(cursor.getLong(cursor.getColumnIndex(COL_ID)));
        score.setPlayerName(cursor.getString(cursor.getColumnIndex(COL_PLAYER_NAME)));
        score.setScore(cursor.getInt(cursor.getColumnIndex(COL_SCORE)));

        return score;
    }*/
}
