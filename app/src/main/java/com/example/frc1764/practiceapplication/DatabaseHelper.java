package com.example.frc1764.practiceapplication;

//Imports

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String TAG = "DatabaseHelper";
    private static final String TABLE_NAME = "scout_table";

    //Start FUNC
    private static final String COL1 = "match_num";
    private static final String COL2 = "team_num";

    //Autonomous FUNC
    private static final String COL3 = "starting_pos"; // Middle/Side
    private static final String COL4 = "line_cross"; // Y/N
    private static final String COL5 = "placement1"; //  Near Switch / Scale / Far switch --> Success or fail
    private static final String COL6 = "field_cross1"; // Y/N
    private static final String COl7 = "placement2"; // Near Switch / Scale / Far switch --> Success or fail
    private static final String COL8 = "field_cross2"; // Y/N

    //Tele OP FUNC
    private static final String COL9 = "power_ups"; // # of cubes
    //Cube Placement during Tele OP
    private static final String COL10 = "near_switch"; //# of cubes
    private static final String COL11 = "scale"; //# of cubes
    private static final String COL12 = "far_switch"; //# of cubes

    // END Game
    private static final String COL13 = "parking"; // Y/N
    private static final String COL14 = "climb"; // Y/N
    private static final String COL15 = "assisted_climb"; // Y/N

    public DatabaseHelper(Context context){
        super(context, TABLE_NAME, null, 1);
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int it) {
        String createTable = "CREATE TABLE " + TABLE_NAME + "ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COL2 +" TEXT";
        db.execSQL(createTable);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase){
        
    }
}
