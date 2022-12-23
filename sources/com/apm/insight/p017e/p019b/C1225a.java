package com.apm.insight.p017e.p019b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.C1186b;
import com.apm.insight.p026l.C1321q;
import java.util.HashMap;

/* renamed from: com.apm.insight.e.b.a */
public abstract class C1225a<T> {

    /* renamed from: a */
    protected final String f1106a = "_id";

    /* renamed from: b */
    protected final String f1107b;

    protected C1225a(String str) {
        this.f1107b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ContentValues mo12452a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract HashMap<String, String> mo12453a();

    /* renamed from: a */
    public void mo12454a(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE ");
            sb.append(this.f1107b);
            sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            HashMap<String, String> a = mo12453a();
            if (a != null) {
                for (String next : a.keySet()) {
                    sb.append(next);
                    sb.append(" ");
                    sb.append(a.get(next));
                    sb.append(",");
                }
                sb.delete(sb.length() - 1, sb.length());
                sb.append(")");
                sQLiteDatabase.execSQL(sb.toString());
            }
        } catch (Throwable th) {
            C1186b.m1306a().mo12441a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    public void mo12455a(SQLiteDatabase sQLiteDatabase, T t) {
        if (sQLiteDatabase != null && t != null) {
            try {
                sQLiteDatabase.insert(this.f1107b, (String) null, mo12452a(t));
            } catch (Throwable th) {
                C1321q.m1934b(th);
            }
        }
    }
}
