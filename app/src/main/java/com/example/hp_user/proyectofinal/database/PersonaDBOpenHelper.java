package com.example.hp_user.proyectofinal.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by HP-USER on 14-11-2017.
 */

public class PersonaDBOpenHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "agenda.db";
    public static final int DATABASE_VERSION = 1;
    public static final String LOGTAG = "DBOpenHelper";
    String TAG = "DbHelper";

    String CREATE_TABLE_LOGIN =
            "CREATE TABLE login (mail TEXT PRIMARY KEY," +
                    "password TEXT);";

    String INSERT_CONTACTO1 ="INSERT INTO login (mail, password) VALUES ('lino.cortess@gmail.com','123456');";
    String INSERT_CONTACTO2 ="INSERT INTO login (mail, password) VALUES ('lino.cortes@mayor.cl','1245');";
    String INSERT_CONTACTO3 ="INSERT INTO login (mail, password) VALUES ('corteslino@gmail.com','1346');";

    public PersonaDBOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_LOGIN);
        Log.i(LOGTAG,"Se creó tabla login");
        db.execSQL(INSERT_CONTACTO1);
        Log.i(LOGTAG, "Se insertó el contacto1");
        db.execSQL(INSERT_CONTACTO2);
        Log.i(LOGTAG, "Se insertó el contacto2");
        db.execSQL(INSERT_CONTACTO3);
        Log.i(LOGTAG, "Se insertó el contacto3");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
