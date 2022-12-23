package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.C0826e0;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.i0 */
class C0852i0 {

    /* renamed from: a */
    private final LinkedHashMap<Integer, C0898k0> f511a = new LinkedHashMap<>();

    /* renamed from: b */
    private int f512b = 2;

    /* renamed from: c */
    private final HashMap<String, ArrayList<C0865j0>> f513c = new HashMap<>();

    /* renamed from: d */
    private int f514d = 1;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final LinkedBlockingQueue<C0832f1> f515e = new LinkedBlockingQueue<>();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f516f = false;

    /* renamed from: g */
    private final ScheduledExecutorService f517g = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: h */
    private final ExecutorService f518h = Executors.newSingleThreadExecutor();

    /* renamed from: i */
    private ScheduledFuture<?> f519i;

    /* renamed from: com.adcolony.sdk.i0$a */
    class C0853a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f520a;

        C0853a(Context context) {
            this.f520a = context;
        }

        public void run() {
            C0832f1 b = C0723a.m193b().mo10912u().mo10383b();
            C0832f1 b2 = C0773c0.m379b();
            C0773c0.m376a(b, "os_name", "android");
            C0773c0.m376a(b2, "filepath", C0723a.m193b().mo10917z().mo11153a() + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
            C0773c0.m375a(b2, TJAdUnitConstants.String.VIDEO_INFO, b);
            C0773c0.m383b(b2, "m_origin", 0);
            C0773c0.m383b(b2, "m_id", C0852i0.m633a(C0852i0.this));
            C0773c0.m376a(b2, "m_type", "Controller.create");
            try {
                C0899l.m800b(this.f520a, new C0850h0(b2));
            } catch (RuntimeException e) {
                C0826e0.C0827a aVar = new C0826e0.C0827a();
                aVar.mo10746a(e.toString() + ": during WebView initialization.").mo10746a(" Disabling AdColony.").mo10747a(C0826e0.f461h);
                AdColony.disable();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i0$b */
    class C0854b implements Runnable {
        C0854b() {
        }

        public void run() {
            while (true) {
                try {
                    C0832f1 f1Var = (C0832f1) C0852i0.this.f515e.poll(60, TimeUnit.SECONDS);
                    if (f1Var != null) {
                        C0852i0.this.m641b(f1Var);
                    } else {
                        synchronized (C0852i0.this.f515e) {
                            if (C0852i0.this.f515e.peek() == null) {
                                boolean unused = C0852i0.this.f516f = false;
                                return;
                            }
                        }
                    }
                } catch (InterruptedException e) {
                    new C0826e0.C0827a().mo10746a("Native messages thread was interrupted: ").mo10746a(e.toString()).mo10747a(C0826e0.f462i);
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i0$c */
    class C0855c implements Runnable {
        C0855c() {
        }

        public void run() {
            C0723a.m198f();
            if (!C0852i0.this.mo10853f()) {
                C0852i0.this.mo10855i();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.i0$d */
    class C0856d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f524a;

        /* renamed from: b */
        final /* synthetic */ C0832f1 f525b;

        C0856d(String str, C0832f1 f1Var) {
            this.f524a = str;
            this.f525b = f1Var;
        }

        public void run() {
            C0852i0.this.m637a(this.f524a, this.f525b);
        }
    }

    C0852i0() {
    }

    /* renamed from: a */
    static /* synthetic */ int m633a(C0852i0 i0Var) {
        int i = i0Var.f514d;
        i0Var.f514d = i + 1;
        return i;
    }

    /* renamed from: g */
    private void m642g() {
        if (this.f519i == null) {
            try {
                this.f519i = this.f517g.scheduleAtFixedRate(new C0855c(), 0, 17, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                new C0826e0.C0827a().mo10746a("Error when scheduling message pumping").mo10746a(e.toString()).mo10747a(C0826e0.f462i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10850c(C0832f1 f1Var) {
        try {
            if (f1Var.mo10793c("m_id", this.f514d)) {
                this.f514d++;
            }
            f1Var.mo10793c("m_origin", 0);
            int b = f1Var.mo10786b("m_target");
            if (b == 0) {
                m634a(f1Var);
                return;
            }
            C0898k0 k0Var = this.f511a.get(Integer.valueOf(b));
            if (k0Var != null) {
                k0Var.mo10666a(f1Var);
            }
        } catch (JSONException e) {
            new C0826e0.C0827a().mo10746a("JSON error in ADCMessageDispatcher's sendMessage(): ").mo10746a(e.toString()).mo10747a(C0826e0.f462i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public LinkedHashMap<Integer, C0898k0> mo10851d() {
        return this.f511a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo10852e() {
        int i = this.f512b;
        this.f512b = i + 1;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo10853f() {
        for (C0898k0 a : this.f511a.values()) {
            if (a.mo10667a()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo10854h() {
        if (mo10853f()) {
            m642g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo10855i() {
        ScheduledFuture<?> scheduledFuture = this.f519i;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isCancelled()) {
                this.f519i.cancel(false);
            }
            this.f519i = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo10856j() {
        synchronized (this.f511a) {
            ArrayList arrayList = new ArrayList(this.f511a.values());
            Collections.reverse(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C0898k0) it.next()).mo10668b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10846b(String str, C0865j0 j0Var) {
        synchronized (this.f513c) {
            ArrayList arrayList = this.f513c.get(str);
            if (arrayList != null) {
                arrayList.remove(j0Var);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10845a(String str, C0865j0 j0Var) {
        ArrayList arrayList = this.f513c.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f513c.put(str, arrayList);
        }
        arrayList.add(j0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo10848b(C0898k0 k0Var) {
        return mo10847b(k0Var.getAdcModuleId());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo10847b(int i) {
        synchronized (this.f511a) {
            C0898k0 k0Var = (C0898k0) this.f511a.remove(Integer.valueOf(i));
            if (k0Var == null) {
                return false;
            }
            k0Var.mo10671c();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10844a() {
        Context a;
        C0866k b = C0723a.m193b();
        if (!b.mo10867E() && !b.mo10868F() && (a = C0723a.m186a()) != null) {
            m640b();
            C1047z0.m1259b((Runnable) new C0853a(a));
        }
    }

    /* renamed from: b */
    private void m640b() {
        if (!this.f516f) {
            synchronized (this.f515e) {
                if (!this.f516f) {
                    this.f516f = true;
                    new Thread(new C0854b()).start();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0899l mo10849c() {
        C0898k0 a = mo10842a(1);
        if (a instanceof C0899l) {
            return (C0899l) a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0898k0 mo10843a(C0898k0 k0Var) {
        synchronized (this.f511a) {
            this.f511a.put(Integer.valueOf(k0Var.getAdcModuleId()), k0Var);
            mo10854h();
        }
        return k0Var;
    }

    /* renamed from: a */
    private void m634a(C0832f1 f1Var) {
        m640b();
        this.f515e.add(f1Var);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r4.hasNext() == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        ((com.adcolony.sdk.C0865j0) r4.next()).mo10531a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        new com.adcolony.sdk.C0826e0.C0827a().mo10745a((java.lang.Object) r3).mo10747a(com.adcolony.sdk.C0826e0.f462i);
        r3.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r3 = new com.adcolony.sdk.C0850h0(r4);
        r4 = r1.iterator();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m637a(java.lang.String r3, com.adcolony.sdk.C0832f1 r4) {
        /*
            r2 = this;
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.adcolony.sdk.j0>> r0 = r2.f513c
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.adcolony.sdk.j0>> r1 = r2.f513c     // Catch:{ all -> 0x0041 }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x0041 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0041 }
            if (r3 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x000f:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0041 }
            r1.<init>(r3)     // Catch:{ all -> 0x0041 }
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            com.adcolony.sdk.h0 r3 = new com.adcolony.sdk.h0
            r3.<init>(r4)
            java.util.Iterator r4 = r1.iterator()
        L_0x001e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r0 = r4.next()
            com.adcolony.sdk.j0 r0 = (com.adcolony.sdk.C0865j0) r0
            r0.mo10531a(r3)     // Catch:{ RuntimeException -> 0x002e }
            goto L_0x001e
        L_0x002e:
            r3 = move-exception
            com.adcolony.sdk.e0$a r4 = new com.adcolony.sdk.e0$a
            r4.<init>()
            com.adcolony.sdk.e0$a r4 = r4.mo10745a((java.lang.Object) r3)
            com.adcolony.sdk.e0 r0 = com.adcolony.sdk.C0826e0.f462i
            r4.mo10747a((com.adcolony.sdk.C0826e0) r0)
            r3.printStackTrace()
        L_0x0040:
            return
        L_0x0041:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0852i0.m637a(java.lang.String, com.adcolony.sdk.f1):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0898k0 mo10842a(int i) {
        return this.f511a.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m641b(C0832f1 f1Var) {
        try {
            String e = f1Var.mo10796e("m_type");
            int b = f1Var.mo10786b("m_origin");
            C0856d dVar = new C0856d(e, f1Var);
            if (b >= 2) {
                C1047z0.m1259b((Runnable) dVar);
            } else {
                this.f518h.execute(dVar);
            }
        } catch (RejectedExecutionException e2) {
            new C0826e0.C0827a().mo10746a("RejectedExecutionException from message dispatcher's dispatchNativeMessage(): ").mo10746a(e2.toString()).mo10747a(C0826e0.f462i);
        } catch (JSONException e3) {
            new C0826e0.C0827a().mo10746a("JSON error from message dispatcher's dispatchNativeMessage(): ").mo10746a(e3.toString()).mo10747a(C0826e0.f462i);
        }
    }
}
