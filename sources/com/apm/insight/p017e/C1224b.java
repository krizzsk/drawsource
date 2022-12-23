package com.apm.insight.p017e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.apm.insight.p017e.p019b.C1226b;

/* renamed from: com.apm.insight.e.b */
public class C1224b extends SQLiteOpenHelper {
    public C1224b(Context context) {
        super(context, "npth_log.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        new C1226b().mo12454a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
