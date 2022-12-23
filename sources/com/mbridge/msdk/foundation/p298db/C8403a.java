package com.mbridge.msdk.foundation.p298db;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.mbridge.msdk.foundation.db.a */
/* compiled from: BaseDao */
public class C8403a<T> {
    protected C8412f mHelper = null;

    public C8403a(C8412f fVar) {
        this.mHelper = fVar;
    }

    /* access modifiers changed from: protected */
    public synchronized SQLiteDatabase getReadableDatabase() {
        return this.mHelper.mo57014a();
    }

    /* access modifiers changed from: protected */
    public synchronized SQLiteDatabase getWritableDatabase() {
        return this.mHelper.mo57017b();
    }
}
