package com.adcolony.sdk;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.adcolony.sdk.C0826e0;
import com.adcolony.sdk.C0923n0;
import com.adcolony.sdk.C0928o;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.adcolony.sdk.v */
class C0988v {

    /* renamed from: f */
    private static C0988v f835f;

    /* renamed from: a */
    private final Executor f836a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    private SQLiteDatabase f837b;

    /* renamed from: c */
    private boolean f838c = false;

    /* renamed from: d */
    private C0991c f839d;

    /* renamed from: e */
    private Set<String> f840e = new HashSet();

    /* renamed from: com.adcolony.sdk.v$a */
    class C0989a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0832f1 f841a;

        /* renamed from: b */
        final /* synthetic */ C1013x f842b;

        /* renamed from: c */
        final /* synthetic */ Context f843c;

        C0989a(C0832f1 f1Var, C1013x xVar, Context context) {
            this.f841a = f1Var;
            this.f842b = xVar;
            this.f843c = context;
        }

        public void run() {
            C0923n0 a = C0923n0.m849a(this.f841a);
            if (a != null) {
                C0988v.this.m1090a(a, (C1013x<C0923n0>) this.f842b, this.f843c);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.v$b */
    class C0990b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f845a;

        /* renamed from: b */
        final /* synthetic */ ContentValues f846b;

        C0990b(String str, ContentValues contentValues) {
            this.f845a = str;
            this.f846b = contentValues;
        }

        public void run() {
            C0988v.this.m1094b(this.f845a, this.f846b);
        }
    }

    /* renamed from: com.adcolony.sdk.v$c */
    interface C0991c {
        /* renamed from: a */
        void mo10926a();
    }

    C0988v() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11149b() {
        this.f840e.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m1094b(String str, ContentValues contentValues) {
        C0938p.m910a(str, contentValues, this.f837b);
    }

    /* renamed from: a */
    public static C0988v m1089a() {
        if (f835f == null) {
            synchronized (C0988v.class) {
                if (f835f == null) {
                    f835f = new C0988v();
                }
            }
        }
        return f835f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11147a(C0991c cVar) {
        this.f839d = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11145a(C0832f1 f1Var, C1013x<C0923n0> xVar) {
        Context applicationContext = C0723a.m195c() ? C0723a.m186a().getApplicationContext() : null;
        if (applicationContext != null && f1Var != null) {
            try {
                this.f836a.execute(new C0989a(f1Var, xVar, applicationContext));
            } catch (RejectedExecutionException e) {
                C0826e0.C0827a aVar = new C0826e0.C0827a();
                aVar.mo10746a("ADCEventsRepository.open failed with: " + e.toString()).mo10747a(C0826e0.f462i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m1090a(C0923n0 n0Var, C1013x<C0923n0> xVar, Context context) {
        try {
            SQLiteDatabase sQLiteDatabase = this.f837b;
            boolean z = false;
            if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                this.f837b = context.openOrCreateDatabase("adc_events_db", 0, (SQLiteDatabase.CursorFactory) null);
            }
            if (this.f837b.needUpgrade(n0Var.mo10959b())) {
                if (m1093a(n0Var) && this.f839d != null) {
                    z = true;
                }
                this.f838c = z;
                if (z) {
                    this.f839d.mo10926a();
                }
            } else {
                this.f838c = true;
            }
            if (this.f838c) {
                xVar.mo10922a(n0Var);
            }
        } catch (SQLiteException e) {
            new C0826e0.C0827a().mo10746a("Database cannot be opened").mo10746a(e.toString()).mo10747a(C0826e0.f460g);
        }
        return;
    }

    /* renamed from: a */
    private boolean m1093a(C0923n0 n0Var) {
        return new C0921n(this.f837b, n0Var).mo10949b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11146a(C0923n0.C0924a aVar, ContentValues contentValues) {
        String str;
        if (aVar != null && !this.f840e.contains(aVar.mo10965f())) {
            this.f840e.add(aVar.mo10965f());
            int c = aVar.mo10962c();
            long j = -1;
            C0923n0.C0927d g = aVar.mo10966g();
            if (g != null) {
                j = contentValues.getAsLong(g.mo10972a()).longValue() - g.mo10973b();
                str = g.mo10972a();
            } else {
                str = null;
            }
            C0938p.m909a(c, j, str, aVar.mo10965f(), this.f837b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11148a(String str, ContentValues contentValues) {
        if (this.f838c) {
            try {
                this.f836a.execute(new C0990b(str, contentValues));
            } catch (RejectedExecutionException e) {
                C0826e0.C0827a aVar = new C0826e0.C0827a();
                aVar.mo10746a("ADCEventsRepository.saveEvent failed with: " + e.toString()).mo10747a(C0826e0.f462i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0928o.C0930b mo11144a(C0923n0 n0Var, long j) {
        if (this.f838c) {
            return C0928o.m869a(n0Var, this.f837b, this.f836a, j);
        }
        return null;
    }
}
