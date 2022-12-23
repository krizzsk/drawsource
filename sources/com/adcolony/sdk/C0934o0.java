package com.adcolony.sdk;

import android.content.ContentValues;
import com.adcolony.sdk.C0826e0;
import com.adcolony.sdk.C0923n0;
import com.adcolony.sdk.C0928o;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* renamed from: com.adcolony.sdk.o0 */
class C0934o0 {

    /* renamed from: e */
    private static C0934o0 f684e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0923n0 f685a;

    /* renamed from: b */
    private final ExecutorService f686b = C1047z0.m1276h();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C0928o.C0930b f687c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f688d = false;

    /* renamed from: com.adcolony.sdk.o0$a */
    class C0935a implements C1013x<C0928o.C0930b> {

        /* renamed from: a */
        final /* synthetic */ C0928o.C0930b[] f689a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f690b;

        C0935a(C0934o0 o0Var, C0928o.C0930b[] bVarArr, CountDownLatch countDownLatch) {
            this.f689a = bVarArr;
            this.f690b = countDownLatch;
        }

        /* renamed from: a */
        public void mo10922a(C0928o.C0930b bVar) {
            this.f689a[0] = bVar;
            this.f690b.countDown();
        }
    }

    /* renamed from: com.adcolony.sdk.o0$b */
    class C0936b implements C1013x<C0928o.C0930b> {
        C0936b(C0934o0 o0Var) {
        }

        /* renamed from: a */
        public void mo10922a(C0928o.C0930b bVar) {
        }
    }

    /* renamed from: com.adcolony.sdk.o0$c */
    class C0937c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1013x f691a;

        /* renamed from: b */
        final /* synthetic */ long f692b;

        C0937c(C1013x xVar, long j) {
            this.f691a = xVar;
            this.f692b = j;
        }

        public void run() {
            C0928o.C0930b bVar;
            C1013x xVar = this.f691a;
            if (C0934o0.this.f688d) {
                bVar = C0934o0.this.f687c;
            } else {
                bVar = C0988v.m1089a().mo11144a(C0934o0.this.f685a, this.f692b);
            }
            xVar.mo10922a(bVar);
        }
    }

    C0934o0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10995d() {
        this.f688d = false;
    }

    /* renamed from: c */
    static C0934o0 m895c() {
        if (f684e == null) {
            synchronized (C0934o0.class) {
                if (f684e == null) {
                    f684e = new C0934o0();
                }
            }
        }
        return f684e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10990a(C0923n0 n0Var) {
        this.f685a = n0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0928o.C0930b mo10994b() {
        return this.f687c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r0 = r3.mo10809p("request_type");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10989a(com.adcolony.sdk.C0850h0 r3) {
        /*
            r2 = this;
            com.adcolony.sdk.n0 r0 = r2.f685a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.adcolony.sdk.f1 r3 = r3.mo10834a()
            if (r3 != 0) goto L_0x000c
            return
        L_0x000c:
            java.lang.String r0 = "payload"
            com.adcolony.sdk.f1 r3 = r3.mo10807n(r0)
            if (r3 != 0) goto L_0x0015
            return
        L_0x0015:
            java.lang.String r0 = "request_type"
            java.lang.String r0 = r3.mo10809p(r0)
            com.adcolony.sdk.n0 r1 = r2.f685a
            com.adcolony.sdk.n0$a r1 = r1.mo10957a((java.lang.String) r0)
            if (r1 == 0) goto L_0x0026
            r2.m891a(r0, r3, r1)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0934o0.mo10989a(com.adcolony.sdk.h0):void");
    }

    /* renamed from: a */
    private void m891a(String str, C0832f1 f1Var, C0923n0.C0924a aVar) {
        try {
            ContentValues a = m890a(f1Var, aVar);
            C0988v.m1089a().mo11148a(aVar.mo10965f(), a);
            C0988v.m1089a().mo11146a(aVar, a);
            mo10995d();
        } catch (NullPointerException | NumberFormatException e) {
            e.printStackTrace();
            C0826e0.C0827a aVar2 = new C0826e0.C0827a();
            C0826e0.C0827a a2 = aVar2.mo10746a("Error parsing event:" + str + " ").mo10746a(f1Var.toString());
            a2.mo10746a("Schema version: " + this.f685a.mo10959b() + " ").mo10746a(" e: ").mo10746a(e.toString()).mo10747a(C0826e0.f460g);
        }
    }

    /* renamed from: a */
    static ContentValues m890a(C0832f1 f1Var, C0923n0.C0924a aVar) throws NumberFormatException, NullPointerException {
        ContentValues contentValues = new ContentValues();
        for (C0923n0.C0925b next : aVar.mo10960a()) {
            Object o = f1Var.mo10808o(next.mo10968b());
            if (o != null) {
                if (o instanceof Boolean) {
                    contentValues.put(next.mo10968b(), (Boolean) o);
                } else if (o instanceof Long) {
                    contentValues.put(next.mo10968b(), (Long) o);
                } else if (o instanceof Double) {
                    contentValues.put(next.mo10968b(), (Double) o);
                } else if (o instanceof Number) {
                    Number number = (Number) o;
                    if (number.doubleValue() != ((double) number.longValue()) || !"INTEGER".equalsIgnoreCase(next.mo10969c())) {
                        contentValues.put(next.mo10968b(), Double.valueOf(number.doubleValue()));
                    } else {
                        contentValues.put(next.mo10968b(), Long.valueOf(number.longValue()));
                    }
                } else if (o instanceof String) {
                    contentValues.put(next.mo10968b(), (String) o);
                }
            }
        }
        return contentValues;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0928o.C0930b mo10987a(long j) {
        C0928o.C0930b[] bVarArr = new C0928o.C0930b[1];
        CountDownLatch countDownLatch = new CountDownLatch(1);
        mo10993a((C1013x<C0928o.C0930b>) new C0935a(this, bVarArr, countDownLatch), j);
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
        return bVarArr[0];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10988a() {
        mo10992a((C1013x<C0928o.C0930b>) new C0936b(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10992a(C1013x<C0928o.C0930b> xVar) {
        mo10993a(xVar, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10993a(C1013x<C0928o.C0930b> xVar, long j) {
        if (this.f685a == null) {
            xVar.mo10922a(null);
        } else if (this.f688d) {
            xVar.mo10922a(this.f687c);
        } else if (!C1047z0.m1247a(this.f686b, (Runnable) new C0937c(xVar, j))) {
            new C0826e0.C0827a().mo10746a("Execute ADCOdtEventsListener.calculateFeatureVectors failed").mo10747a(C0826e0.f462i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10991a(C0928o.C0930b bVar) {
        this.f687c = bVar;
        this.f688d = true;
    }
}
