package com.apm.insight.p017e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.C1250h;
import com.apm.insight.p017e.p018a.C1223a;
import com.apm.insight.p017e.p019b.C1226b;
import com.apm.insight.p026l.C1321q;

/* renamed from: com.apm.insight.e.a */
public class C1222a {

    /* renamed from: a */
    private static volatile C1222a f1101a;

    /* renamed from: b */
    private C1226b f1102b;

    /* renamed from: c */
    private SQLiteDatabase f1103c;

    private C1222a() {
    }

    /* renamed from: a */
    public static C1222a m1424a() {
        if (f1101a == null) {
            synchronized (C1222a.class) {
                if (f1101a == null) {
                    f1101a = new C1222a();
                }
            }
        }
        return f1101a;
    }

    /* renamed from: b */
    private void m1425b() {
        if (this.f1102b == null) {
            mo12447a(C1250h.m1615g());
        }
    }

    /* renamed from: a */
    public synchronized void mo12447a(Context context) {
        try {
            this.f1103c = new C1224b(context).getWritableDatabase();
        } catch (Throwable th) {
            C1321q.m1934b(th);
        }
        this.f1102b = new C1226b();
    }

    /* renamed from: a */
    public synchronized void mo12448a(C1223a aVar) {
        m1425b();
        if (this.f1102b != null) {
            this.f1102b.mo12455a(this.f1103c, aVar);
        }
    }

    /* renamed from: a */
    public synchronized boolean mo12449a(String str) {
        m1425b();
        if (this.f1102b == null) {
            return false;
        }
        return this.f1102b.mo12458a(this.f1103c, str);
    }
}
