package com.example.android.busymode;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by paudelroshan93 on 12/31/2016.
 */
public class DatabaseHandler extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "messageManager";

    // Message table name
    private static final String TABLE_MESSAGE = "message";

    // Message Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_SUB = "subject";
    private static final String KEY_DES = "description";
    private static final String KEY_FLAG ="0";
    private static final String KEY_SELECT = "0";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_MESSAGE_TABLE = "CREATE TABLE " + TABLE_MESSAGE + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_SUB + " TEXT,"
                + KEY_DES + " TEXT,"+ KEY_FLAG + " INTEGER,"+ KEY_SELECT + " INTEGER" + ")";
        db.execSQL(CREATE_MESSAGE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MESSAGE);

        // Create tables again
        onCreate(db);
    }

    /**
     * All CRUD(Create, Read, Update, Delete) Operations
     */

    // Adding new contact
    void addInfo(Information info) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_SUB, info.getMessageSub()); // Message Subject
        values.put(KEY_DES, info.getMessageDes()); // Message Description
        values.put(KEY_FLAG, info.getFlag()); // Edit Flag
        values.put(KEY_DES, info.getSelected()); // Selection Flag

        // Inserting Row
        db.insert(TABLE_MESSAGE, null, values);
        db.close(); // Closing database connection
    }

    // Getting single messageInfo
    Information getInfo(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_MESSAGE, new String[] { KEY_ID,
                        KEY_SUB, KEY_DES, KEY_FLAG, KEY_SELECT }, KEY_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Information info = new Information(Integer.parseInt(cursor.getString(0)),Boolean.parseBoolean(cursor.getString(1)),Boolean.parseBoolean(cursor.getString(1)),
                cursor.getString(3), cursor.getString(4));
        // return messageInfo
        return info;
    }

}
