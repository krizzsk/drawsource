package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.adcolony.sdk.C0826e0;

/* renamed from: com.adcolony.sdk.p */
class C0938p {
    /* renamed from: a */
    static void m910a(String str, ContentValues contentValues, SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.insertOrThrow(str, (String) null, contentValues);
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e) {
            try {
                C0826e0.C0827a aVar = new C0826e0.C0827a();
                C0826e0.C0827a a = aVar.mo10746a("Exception on insert to " + str + ", db version:").mo10744a(sQLiteDatabase.getVersion());
                a.mo10746a(". Values: " + contentValues.toString() + " caused: ").mo10746a(e.toString()).mo10747a(C0826e0.f460g);
            } catch (Throwable th) {
                C0826e0.C0827a aVar2 = new C0826e0.C0827a();
                C0826e0.C0827a a2 = aVar2.mo10746a("Error on insert to " + str + ", db version:").mo10744a(sQLiteDatabase.getVersion());
                a2.mo10746a(". Values: " + contentValues.toString() + " caused: ").mo10746a(th.toString()).mo10747a(C0826e0.f462i);
                return;
            }
        }
        sQLiteDatabase.endTransaction();
    }

    /* renamed from: a */
    static void m909a(int i, long j, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            if (str == null) {
                str = "rowid";
                j = -1;
            }
            if (i >= 0) {
                Cursor rawQuery = sQLiteDatabase.rawQuery("select " + str + " from " + str2 + " order by " + str + " desc limit 1 offset " + i, (String[]) null);
                if (rawQuery.moveToFirst()) {
                    j = Math.max(j, rawQuery.getLong(0));
                }
                rawQuery.close();
            }
            if (j >= 0) {
                sQLiteDatabase.execSQL("delete from " + str2 + " where " + str + " <= " + j);
            }
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e) {
            try {
                new C0826e0.C0827a().mo10746a("Exception on deleting excessive rows:").mo10746a(e.toString()).mo10747a(C0826e0.f460g);
            } catch (Throwable th) {
                new C0826e0.C0827a().mo10746a("Error on deleting excessive rows:").mo10746a(th.toString()).mo10747a(C0826e0.f462i);
                return;
            }
        }
        sQLiteDatabase.endTransaction();
    }
}
