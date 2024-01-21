package com.example.sqliteeg_database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class DbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "contactDB";
    private static final String TABLE_NAME = "contact";
    public static final String KEY_ID = "ID";
    public static final String KEY_NAME = "NAME";
    public static final String KEY_PHONE = "PHONE";

    //    public static final String VERSION_NAME = "1";
//
//    public DbHelper(Context context) {
//        super(context, DATABASE_NAME, null , VERSION_NAME);
//    }
    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String create_table = ("CREATE table " + TABLE_NAME + "(" + KEY_ID + " INTEGER  PRIMARY KEY AUTOINCREMENT , "
                + KEY_NAME + " TEXT, " + KEY_PHONE + " TEXT" + ")");
        sqLiteDatabase.execSQL(create_table);

//        SQLiteDatabase database = this.getWritableDatabase();
//        sqLiteDatabase.close();

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("drop table if exists " + TABLE_NAME);
        onCreate(sqLiteDatabase);

    }

    public void dbinsert(Contact contact) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, contact.getName());
        values.put(KEY_PHONE, contact.getPhone());

        db.insert(TABLE_NAME, null, values);

        db.close();

    }

    public static List<Contact> getAllContacts(Context context) {

        List<Contact> contactList = new ArrayList<>();
        String selectquery = "select * from " + TABLE_NAME;
        SQLiteDatabase db = new DbHelper(context).getReadableDatabase();
        Cursor cursor = db.rawQuery(selectquery, null);   //read query

        if (cursor.moveToFirst()) {
            do {
                Contact contact = new Contact();
                contact.setId(Integer.parseInt(cursor.getString(0)));
                contact.setName(cursor.getString(1));
                contact.setPhone(cursor.getString(2));

                contactList.add(contact);

            } while ((cursor.moveToNext()));
        }
        cursor.close();
        db.close();
        return contactList;
    }


    //Deleting data from database

//    public void deleteContact(int ContactId) {
//
//        SQLiteDatabase db = this.getWritableDatabase();
//        String whereClause = KEY_ID + " = ?";
//        String[] whereArgs = {String.valueOf(contactId)};
//        db.delete(TABLE_NAME, whereClause, whereArgs);
//        db.close();
//
//    }


}


