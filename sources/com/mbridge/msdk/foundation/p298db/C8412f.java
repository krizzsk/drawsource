package com.mbridge.msdk.foundation.p298db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.mbridge.msdk.foundation.db.f */
/* compiled from: CommonAbsDBHelper */
public abstract class C8412f {

    /* renamed from: a */
    private C8413a f20552a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo57015a(SQLiteDatabase sQLiteDatabase);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo57016a(SQLiteDatabase sQLiteDatabase, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo57018b(SQLiteDatabase sQLiteDatabase, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo57019c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo57020d();

    public C8412f(Context context) {
        this.f20552a = new C8413a(context, mo57019c(), mo57020d());
    }

    /* renamed from: a */
    public final SQLiteDatabase mo57014a() {
        return this.f20552a.getReadableDatabase();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
        r0 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.database.sqlite.SQLiteDatabase mo57017b() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.mbridge.msdk.foundation.db.f$a r0 = r1.f20552a     // Catch:{ Exception -> 0x000b, all -> 0x0008 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ Exception -> 0x000b, all -> 0x0008 }
            goto L_0x000c
        L_0x0008:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x000b:
            r0 = 0
        L_0x000c:
            monitor-exit(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p298db.C8412f.mo57017b():android.database.sqlite.SQLiteDatabase");
    }

    /* renamed from: com.mbridge.msdk.foundation.db.f$a */
    /* compiled from: CommonAbsDBHelper */
    private class C8413a extends SQLiteOpenHelper {
        public C8413a(Context context, String str, int i) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            C8412f.this.mo57015a(sQLiteDatabase);
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C8412f.this.mo57016a(sQLiteDatabase, i, i2);
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C8412f.this.mo57018b(sQLiteDatabase, i, i2);
        }
    }
}
