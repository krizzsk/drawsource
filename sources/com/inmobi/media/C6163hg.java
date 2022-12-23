package com.inmobi.media;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.inmobi.media.hg */
/* compiled from: DbHelper */
public final class C6163hg extends SQLiteOpenHelper {

    /* renamed from: a */
    public static final String f15558a = ("com.im_" + C6184hx.m18347b() + ".db");

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public C6163hg(Context context) {
        super(context, f15558a, (SQLiteDatabase.CursorFactory) null, 1);
    }
}
