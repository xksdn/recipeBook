package com.example.second;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class databaseManager extends SQLiteOpenHelper {

    public databaseManager(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE RECIPE(" +
                "RCP_SEQ VERCHER PRIMARY KEY NOT NULL," +
                "RCP_NM VERCHER," +
                "RCP_WAY2 VERCHER," +
                "RCP_PAT2 VERCHER," +
                "INFO_WGT VERCHER," +
                "INFO_ENG VERCHER," +
                "INFO_CAR VERCHER," +
                "INFO_PRO VERCHER," +
                "INFO_FAT VERCHER," +
                "INFO_NA VERCHER," +
                "HASH_TAG VERCHER," +
                "ATT_FILE_NO_MAIN VERCHER," +
                "ATT_FILE_NO_MK VERCHER," +
                "RCP_RARTS_DTLS VERCHER," +
                "MANUAL01 VERCHER," +
                "MANUAL_IMG01 VERCHER," +
                ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
