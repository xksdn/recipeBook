package com.example.second;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
                "MANUAL02 VERCHER," +
                "MANUAL_IMG02 VERCHER," +
                "MANUAL03 VERCHER," +
                "MANUAL_IMG03 VERCHER," +
                "MANUAL04 VERCHER," +
                "MANUAL_IMG04 VERCHER," +
                "MANUAL05 VERCHER," +
                "MANUAL_IMG05 VERCHER," +
                "MANUAL06 VERCHER," +
                "MANUAL_IMG06 VERCHER," +
                "MANUAL07 VERCHER," +
                "MANUAL_IMG07 VERCHER," +
                "MANUAL08 VERCHER," +
                "MANUAL_IMG08 VERCHER," +
                "MANUAL09 VERCHER," +
                "MANUAL_IMG09 VERCHER," +
                "MANUAL10 VERCHER," +
                "MANUAL_IMG10 VERCHER," +
                "MANUAL11 VERCHER," +
                "MANUAL_IMG11 VERCHER," +
                "MANUAL12 VERCHER," +
                "MANUAL_IMG12 VERCHER," +
                "MANUAL13 VERCHER," +
                "MANUAL_IMG13 VERCHER," +
                "MANUAL14 VERCHER," +
                "MANUAL_IMG14 VERCHER," +
                "MANUAL15 VERCHER," +
                "MANUAL_IMG15 VERCHER," +
                "MANUAL16 VERCHER," +
                "MANUAL_IMG16 VERCHER," +
                "MANUAL17 VERCHER," +
                "MANUAL_IMG17 VERCHER," +
                "MANUAL18 VERCHER," +
                "MANUAL_IMG18 VERCHER," +
                "MANUAL19 VERCHER," +
                "MANUAL_IMG19 VERCHER," +
                "MANUAL20 VERCHER," +
                "MANUAL_IMG20 VERCHER," +
                "RCP_NA_TIP VERCHER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertData(ArrayList<CookRecipeResponse> list) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        for(CookRecipeResponse response : list) {
            for (CookRecipeResponse.RecipeRow row : response.getCookRcp01().getRowList()) {
                values.put("RCP_SEQ", row.getRCP_SEQ());
                values.put("RCP_NM", row.getRCP_NM());
                values.put("RCP_WAY2", row.getRCP_WAY2());
                values.put("RCP_PAT2", row.getRCP_PAT2());
                values.put("INFO_WGT", row.getINFO_WGT());
                values.put("INFO_ENG", row.getINFO_ENG());
                values.put("INFO_CAR", row.getINFO_CAR());
                values.put("INFO_PRO", row.getINFO_PRO());
                values.put("INFO_FAT", row.getINFO_FAT());
                values.put("INFO_NA", row.getINFO_NA());
                values.put("HASH_TAG", row.getHASH_TAG());
                values.put("ATT_FILE_NO_MAIN", row.getATT_FILE_NO_MAIN());
                values.put("ATT_FILE_NO_MK", row.getATT_FILE_NO_MK());
                values.put("RCP_PARTS_DTLS", row.getRCP_PARTS_DTLS());
                values.put("MANUAL01", row.getMANUAL01());
                values.put("MANUAL_IMG01", row.getMANUAL_IMG01());
                values.put("MANUAL02", row.getMANUAL02());
                values.put("MANUAL_IMG02", row.getMANUAL_IMG02());
                values.put("MANUAL03", row.getMANUAL03());
                values.put("MANUAL_IMG03", row.getMANUAL_IMG03());
                values.put("MANUAL04", row.getMANUAL04());
                values.put("MANUAL_IMG04", row.getMANUAL_IMG04());
                values.put("MANUAL05", row.getMANUAL05());
                values.put("MANUAL_IMG05", row.getMANUAL_IMG05());
                values.put("MANUAL06", row.getMANUAL06());
                values.put("MANUAL_IMG06", row.getMANUAL_IMG06());
                values.put("MANUAL07", row.getMANUAL07());
                values.put("MANUAL_IMG07", row.getMANUAL_IMG07());
                values.put("MANUAL08", row.getMANUAL08());
                values.put("MANUAL_IMG08", row.getMANUAL_IMG08());
                values.put("MANUAL09", row.getMANUAL09());
                values.put("MANUAL_IMG09", row.getMANUAL_IMG09());
                values.put("MANUAL10", row.getMANUAL10());
                values.put("MANUAL_IMG10", row.getMANUAL_IMG10());
                values.put("MANUAL11", row.getMANUAL11());
                values.put("MANUAL_IMG11", row.getMANUAL_IMG11());
                values.put("MANUAL12", row.getMANUAL12());
                values.put("MANUAL_IMG12", row.getMANUAL_IMG12());
                values.put("MANUAL13", row.getMANUAL13());
                values.put("MANUAL_IMG13", row.getMANUAL_IMG13());
                values.put("MANUAL14", row.getMANUAL14());
                values.put("MANUAL_IMG14", row.getMANUAL_IMG14());
                values.put("MANUAL15", row.getMANUAL15());
                values.put("MANUAL_IMG15", row.getMANUAL_IMG15());
                values.put("MANUAL16", row.getMANUAL16());
                values.put("MANUAL_IMG16", row.getMANUAL_IMG16());
                values.put("MANUAL17", row.getMANUAL17());
                values.put("MANUAL_IMG17", row.getMANUAL_IMG17());
                values.put("MANUAL18", row.getMANUAL18());
                values.put("MANUAL_IMG18", row.getMANUAL_IMG18());
                values.put("MANUAL19", row.getMANUAL19());
                values.put("MANUAL_IMG19", row.getMANUAL_IMG19());
                values.put("MANUAL20", row.getMANUAL20());
                values.put("MANUAL_IMG20", row.getMANUAL_IMG20());
                values.put("RCP_NA_TIP", row.getRCP_NA_TIP());
                db.insert("RECIPE", null, values);
            }
        }
        db.close();
    }

    public ArrayList<CookRecipeResponse> getItems() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM RECIPE", null);
        ArrayList<CookRecipeResponse> list = new ArrayList<>();

        while (cursor.moveToNext()) {
            CookRecipeResponse response = new CookRecipeResponse();
            response.getCookRcp01().getRowList().add(setRecipeRow(cursor));

            list.add(response);
        }

        cursor.close();
        db.close();

        return list;
    }

    private CookRecipeResponse.RecipeRow setRecipeRow(Cursor cursor) {
        CookRecipeResponse.RecipeRow row = new CookRecipeResponse.RecipeRow();
        try {
            row.setRCP_SEQ(cursor.getString(cursor.getColumnIndexOrThrow("RCP_SEQ")));
            row.setRCP_NM(cursor.getString(cursor.getColumnIndexOrThrow("RCP_NM")));
            row.setRCP_WAY2(cursor.getString(cursor.getColumnIndexOrThrow("RCP_WAY2")));
            row.setRCP_PAT2(cursor.getString(cursor.getColumnIndexOrThrow("RCP_PAT2")));
            row.setINFO_WGT(cursor.getString(cursor.getColumnIndexOrThrow("INFO_WEG")));
            row.setINFO_ENG(cursor.getString(cursor.getColumnIndexOrThrow("INFO_ENG")));
            row.setINFO_CAR(cursor.getString(cursor.getColumnIndexOrThrow("INFO_CAR")));
            row.setINFO_PRO(cursor.getString(cursor.getColumnIndexOrThrow("INFO_PRO")));
            row.setINFO_FAT(cursor.getString(cursor.getColumnIndexOrThrow("INFO_FAT")));
            row.setINFO_NA(cursor.getString(cursor.getColumnIndexOrThrow("INFO_NA")));
            row.setHASH_TAG(cursor.getString(cursor.getColumnIndexOrThrow("HASH_TAG")));
            row.setATT_FILE_NO_MAIN(cursor.getString(cursor.getColumnIndexOrThrow("ATT_FILE_NO_MAIN")));
            row.setATT_FILE_NO_MK(cursor.getString(cursor.getColumnIndexOrThrow("ATT_FILE_NO_MK")));
            row.setRCP_PARTS_DTLS(cursor.getString(cursor.getColumnIndexOrThrow("RCP_PARTS_DTLS")));
            row.setMANUAL01(cursor.getString(cursor.getColumnIndexOrThrow("MANUAL01")));
            row.setMANUAL_IMG01(cursor.getString(cursor.getColumnIndexOrThrow("MANUAL_IMG01")));
            row.setMANUAL02(cursor.getString(cursor.getColumnIndexOrThrow("MANUAL02")));
            row.setMANUAL_IMG02(cursor.getString(cursor.getColumnIndexOrThrow("MANUAL_IMG02")));
            row.setMANUAL03(cursor.getString(cursor.getColumnIndexOrThrow("MANUAL03")));
            row.setMANUAL_IMG03(cursor.getString(cursor.getColumnIndexOrThrow("MANUAL_IMG03")));
            row.setMANUAL04(cursor.getString(cursor.getColumnIndexOrThrow("MANUAL04")));
            row.setMANUAL_IMG04(cursor.getString(cursor.getColumnIndexOrThrow("MANUAL_IMG04")));
            row.setMANUAL05(cursor.getString(cursor.getColumnIndexOrThrow("MANUAL05")));
            row.setMANUAL_IMG05(cursor.getString(cursor.getColumnIndexOrThrow("MANUAL_IMG05")));
            row.setMANUAL06(cursor.getString(cursor.getColumnIndexOrThrow("MANUAL06")));
            row.setMANUAL_IMG06(cursor.getString(cursor.getColumnIndexOrThrow("MANUAL_IMG06")));
            row.setMANUAL07(cursor.getString(cursor.getColumnIndexOrThrow("MANUAL07")));
            row.setMANUAL_IMG07(cursor.getString(cursor.getColumnIndexOrThrow("MANUAL_IMG07")));
            row.setMANUAL08(cursor.getString(cursor.getColumnIndexOrThrow("MANUAL08")));
            row.setMANUAL_IMG08(cursor.getString(cursor.getColumnIndexOrThrow("MANUAL_IMG08")));


        } catch (IllegalArgumentException e) {

        }

        return row;
    }



}
