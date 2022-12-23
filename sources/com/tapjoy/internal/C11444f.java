package com.tapjoy.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

/* renamed from: com.tapjoy.internal.f */
public final class C11444f<E> extends C11271an<E> implements C11276ar<E>, Closeable {

    /* renamed from: a */
    private SQLiteDatabase f27360a;

    /* renamed from: b */
    private final C11282ax<E> f27361b;

    /* renamed from: c */
    private int f27362c;

    public C11444f(File file, C11282ax<E> axVar) {
        SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
        this.f27360a = openOrCreateDatabase;
        this.f27361b = axVar;
        if (openOrCreateDatabase.getVersion() != 1) {
            this.f27360a.beginTransaction();
            try {
                this.f27360a.execSQL("CREATE TABLE IF NOT EXISTS List(value BLOB)");
                this.f27360a.setVersion(1);
                this.f27360a.setTransactionSuccessful();
            } finally {
                this.f27360a.endTransaction();
            }
        }
        this.f27362c = m31389a();
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        close();
        super.finalize();
    }

    public final void close() {
        SQLiteDatabase sQLiteDatabase = this.f27360a;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.f27360a = null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.String[], android.database.Cursor] */
    /* renamed from: a */
    private int m31389a() {
        Cursor cursor = 0;
        try {
            cursor = this.f27360a.rawQuery("SELECT COUNT(1) FROM List", cursor);
            if (cursor.moveToNext()) {
                return cursor.getInt(0);
            }
            m31390a(cursor);
            return 0;
        } finally {
            m31390a((Cursor) cursor);
        }
    }

    public final int size() {
        return this.f27362c;
    }

    public final void clear() {
        this.f27360a.delete("List", "1", (String[]) null);
        this.f27362c = 0;
    }

    public final boolean offer(E e) {
        C11533gr.m31570a(e);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.f27361b.mo69687a(byteArrayOutputStream, e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C11531gp.m31567a(byteArrayOutputStream);
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", byteArray);
            if (this.f27360a.insert("List", (String) null, contentValues) == -1) {
                return false;
            }
            this.f27362c++;
            return true;
        } catch (IOException e2) {
            throw new IllegalArgumentException(e2);
        } catch (Throwable th) {
            C11531gp.m31567a(byteArrayOutputStream);
            throw th;
        }
    }

    public final E poll() {
        if (this.f27362c <= 0) {
            return null;
        }
        E peek = peek();
        mo69632b(1);
        return peek;
    }

    public final E peek() {
        if (this.f27362c > 0) {
            return mo69631a(0);
        }
        return null;
    }

    /* renamed from: a */
    public final E mo69631a(int i) {
        ByteArrayInputStream byteArrayInputStream;
        if (i < 0 || i >= this.f27362c) {
            throw new IndexOutOfBoundsException();
        }
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f27360a;
            cursor = sQLiteDatabase.rawQuery("SELECT value FROM List ORDER BY rowid LIMIT " + i + ",1", (String[]) null);
            if (cursor.moveToNext()) {
                byteArrayInputStream = new ByteArrayInputStream(cursor.getBlob(0));
                E b = this.f27361b.mo69686b(byteArrayInputStream);
                C11531gp.m31567a(byteArrayInputStream);
                m31390a(cursor);
                return b;
            }
            throw new NoSuchElementException();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        } catch (Throwable th) {
            m31390a(cursor);
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo69632b(int i) {
        int i2;
        if (i <= 0 || i > (i2 = this.f27362c)) {
            throw new IndexOutOfBoundsException();
        } else if (i == i2) {
            clear();
        } else {
            Cursor cursor = null;
            try {
                SQLiteDatabase sQLiteDatabase = this.f27360a;
                StringBuilder sb = new StringBuilder("SELECT rowid FROM List ORDER BY rowid LIMIT ");
                sb.append(i - 1);
                sb.append(",1");
                Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), (String[]) null);
                try {
                    if (rawQuery.moveToNext()) {
                        long j = rawQuery.getLong(0);
                        rawQuery.close();
                        int delete = this.f27360a.delete("List", "rowid <= ".concat(String.valueOf(j)), (String[]) null);
                        this.f27362c -= delete;
                        if (delete == i) {
                            m31390a((Cursor) null);
                            return;
                        }
                        throw new IllegalStateException("Try to delete " + i + ", but deleted " + delete);
                    }
                    throw new IllegalStateException();
                } catch (Throwable th) {
                    th = th;
                    cursor = rawQuery;
                    m31390a(cursor);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                m31390a(cursor);
                throw th;
            }
        }
    }

    /* renamed from: a */
    private static Cursor m31390a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        cursor.close();
        return null;
    }
}
