package com.tapjoy.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.tapjoy.TJAdUnitConstants;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.gj */
class C11523gj extends C11520gi {

    /* renamed from: b */
    private final File f27673b;

    /* renamed from: c */
    private final C11557hi f27674c;

    /* renamed from: d */
    private volatile SQLiteDatabase f27675d;

    /* renamed from: e */
    private long f27676e;

    /* renamed from: f */
    private long f27677f;

    /* renamed from: g */
    private long f27678g;

    public C11523gj(File file, C11557hi hiVar) {
        this.f27673b = file;
        this.f27674c = hiVar;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (this.f27675d != null) {
            C11531gp.m31567a(this.f27675d);
            this.f27675d = null;
        }
        super.finalize();
    }

    /* access modifiers changed from: protected */
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo70060a(long j) {
        if (this.f27675d == null) {
            this.f27675d = SQLiteDatabase.openOrCreateDatabase(this.f27673b, (SQLiteDatabase.CursorFactory) null);
            int version = this.f27675d.getVersion();
            if (version == 0) {
                this.f27675d.beginTransaction();
                try {
                    this.f27675d.execSQL("CREATE TABLE IF NOT EXISTS UsageStats(name TEXT,dimensions TEXT,count INTEGER,first_time INTEGER,last_time INTEGER,PRIMARY KEY(name, dimensions))");
                    this.f27675d.execSQL("CREATE TABLE IF NOT EXISTS UsageStatValues(stat_id LONG,name TEXT,count INTEGER,avg REAL,max INTEGER,PRIMARY KEY(stat_id, name))");
                    this.f27675d.setVersion(1);
                    this.f27675d.setTransactionSuccessful();
                } finally {
                    this.f27675d.endTransaction();
                }
            } else if (version != 1) {
                throw new SQLException("Unknown database version: ".concat(String.valueOf(version)));
            }
            Cursor rawQuery = this.f27675d.rawQuery("SELECT MIN(first_time), MAX(last_time) FROM UsageStats", (String[]) null);
            try {
                if (rawQuery.moveToNext()) {
                    this.f27677f = rawQuery.getLong(0);
                    this.f27678g = rawQuery.getLong(1);
                }
                rawQuery.close();
                long j2 = this.f27677f;
                if (j2 > 0 && j2 + 86400000 <= j) {
                    m31547b();
                }
            } catch (Throwable th) {
                rawQuery.close();
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70059a() {
        if (this.f27675d != null) {
            C11531gp.m31567a(this.f27675d);
            this.f27675d = null;
        }
        this.f27673b.delete();
        this.f27678g = 0;
        this.f27677f = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70061a(long j, String str, @Nullable String str2, @Nullable Map<String, Long> map) {
        long j2;
        Cursor cursor;
        String str3;
        char c;
        long j3 = j;
        String str4 = str;
        if (this.f27675d != null) {
            long j4 = this.f27676e;
            if (j4 == 0) {
                this.f27678g = j3;
                this.f27676e = j3;
            } else if (j3 < j4 || j3 >= j4 + 86400000) {
                if (j3 >= this.f27676e || this.f27678g - j3 >= 86400000) {
                    m31547b();
                    this.f27678g = j3;
                    this.f27676e = j3;
                } else {
                    this.f27676e = j3;
                }
            } else if (j3 > this.f27678g) {
                this.f27678g = j3;
            }
            String str5 = str2 == null ? "" : str2;
            int i = 0;
            char c2 = 1;
            Cursor rawQuery = this.f27675d.rawQuery("SELECT ROWID,count,first_time,last_time FROM UsageStats WHERE name = ? AND dimensions = ?", new String[]{str4, str5});
            try {
                ContentValues contentValues = new ContentValues();
                String str6 = "ROWID = ";
                if (rawQuery.moveToNext()) {
                    j2 = rawQuery.getLong(0);
                    int i2 = rawQuery.getInt(1);
                    long j5 = rawQuery.getLong(2);
                    long j6 = rawQuery.getLong(3);
                    contentValues.put("count", Integer.valueOf(i2 + 1));
                    if (j3 < j5) {
                        contentValues.put("first_time", Long.valueOf(j));
                    }
                    if (j3 > j6) {
                        contentValues.put("last_time", Long.valueOf(j));
                    }
                    this.f27675d.update("UsageStats", contentValues, str6.concat(String.valueOf(j2)), (String[]) null);
                } else {
                    contentValues.put("name", str4);
                    contentValues.put(TJAdUnitConstants.String.USAGE_TRACKER_DIMENSIONS, str5);
                    contentValues.put("count", 1);
                    contentValues.put("first_time", Long.valueOf(j));
                    contentValues.put("last_time", Long.valueOf(j));
                    j2 = this.f27675d.insert("UsageStats", (String) null, contentValues);
                }
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry next : map.entrySet()) {
                        if (next.getValue() != null) {
                            String str7 = (String) next.getKey();
                            long longValue = ((Long) next.getValue()).longValue();
                            String[] strArr = new String[2];
                            strArr[i] = Long.toString(j2);
                            strArr[c2] = str7;
                            Cursor rawQuery2 = this.f27675d.rawQuery("SELECT ROWID, * FROM UsageStatValues WHERE stat_id = ? AND name = ?", strArr);
                            try {
                                if (rawQuery2.moveToNext()) {
                                    long j7 = rawQuery2.getLong(i);
                                    int i3 = rawQuery2.getInt(3);
                                    double d = rawQuery2.getDouble(4);
                                    long j8 = rawQuery2.getLong(5);
                                    contentValues.clear();
                                    int i4 = i3 + 1;
                                    contentValues.put("count", Integer.valueOf(i4));
                                    str3 = str6;
                                    cursor = rawQuery2;
                                    contentValues.put("avg", Double.valueOf(d + ((((double) longValue) - d) / ((double) i4))));
                                    if (longValue > j8) {
                                        contentValues.put("max", Long.valueOf(longValue));
                                    }
                                    this.f27675d.update("UsageStatValues", contentValues, str3.concat(String.valueOf(j7)), (String[]) null);
                                    c = 1;
                                } else {
                                    cursor = rawQuery2;
                                    str3 = str6;
                                    contentValues.clear();
                                    contentValues.put("stat_id", Long.valueOf(j2));
                                    contentValues.put("name", str7);
                                    c = 1;
                                    contentValues.put("count", 1);
                                    contentValues.put("avg", Long.valueOf(longValue));
                                    contentValues.put("max", Long.valueOf(longValue));
                                    this.f27675d.insert("UsageStatValues", (String) null, contentValues);
                                }
                                cursor.close();
                                c2 = c;
                                str6 = str3;
                                i = 0;
                            } catch (Throwable th) {
                                th = th;
                                cursor = rawQuery2;
                                cursor.close();
                                throw th;
                            }
                        }
                    }
                }
                rawQuery.close();
            } catch (Throwable th2) {
                rawQuery.close();
                throw th2;
            }
        }
    }

    /* renamed from: b */
    private void m31547b() {
        HashMap hashMap;
        Set<String> set = C11520gi.f27665a;
        String str = null;
        Cursor rawQuery = this.f27675d.rawQuery("SELECT ROWID, * FROM UsageStats ORDER BY ROWID ASC", (String[]) null);
        try {
            rawQuery = this.f27675d.rawQuery("SELECT * FROM UsageStatValues ORDER BY stat_id ASC", (String[]) null);
            rawQuery.moveToNext();
            while (rawQuery.moveToNext()) {
                int i = 0;
                long j = rawQuery.getLong(0);
                int i2 = 1;
                String string = rawQuery.getString(1);
                String string2 = rawQuery.getString(2);
                String str2 = string2.isEmpty() ? str : string2;
                int i3 = rawQuery.getInt(3);
                long j2 = rawQuery.getLong(4);
                long j3 = rawQuery.getLong(5);
                if (!rawQuery.isAfterLast()) {
                    hashMap = null;
                    while (true) {
                        if (rawQuery.getLong(i) != j) {
                            break;
                        }
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        String string3 = rawQuery.getString(i2);
                        long j4 = rawQuery.getLong(3);
                        long j5 = rawQuery.getLong(4);
                        hashMap.put(string3, Long.valueOf(j4));
                        hashMap.put(string3 + "_max", Long.valueOf(j5));
                        if (!rawQuery.moveToNext()) {
                            break;
                        }
                        i = 0;
                        i2 = 1;
                    }
                } else {
                    hashMap = null;
                }
                if (set != null) {
                    if (set.contains(string)) {
                        str = null;
                    }
                }
                this.f27674c.mo70105a(string, str2, i3, j2, j3, (Map<String, Long>) hashMap);
                str = null;
            }
            rawQuery.close();
            this.f27675d.execSQL("DELETE FROM UsageStats");
            this.f27675d.execSQL("DELETE FROM UsageStatValues");
            this.f27678g = 0;
            this.f27677f = 0;
        } catch (Throwable th) {
            throw th;
        } finally {
            rawQuery.close();
        }
    }
}
