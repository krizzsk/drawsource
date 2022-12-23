package com.applovin.impl.adview;

import android.os.Handler;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.applovin.impl.adview.j */
public final class C1537j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2102v f1936a;

    /* renamed from: b */
    private final Handler f1937b;

    /* renamed from: c */
    private final Set<C1540b> f1938c = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final AtomicInteger f1939d = new AtomicInteger();

    /* renamed from: com.applovin.impl.adview.j$a */
    public interface C1539a {
        /* renamed from: a */
        void mo13038a();

        /* renamed from: b */
        boolean mo13039b();
    }

    /* renamed from: com.applovin.impl.adview.j$b */
    private static class C1540b {

        /* renamed from: a */
        private final String f1943a;

        /* renamed from: b */
        private final C1539a f1944b;

        /* renamed from: c */
        private final long f1945c;

        private C1540b(String str, long j, C1539a aVar) {
            this.f1943a = str;
            this.f1945c = j;
            this.f1944b = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String m2870a() {
            return this.f1943a;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public long m2872b() {
            return this.f1945c;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C1539a m2875c() {
            return this.f1944b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1540b)) {
                return false;
            }
            String str = this.f1943a;
            String str2 = ((C1540b) obj).f1943a;
            return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
        }

        public int hashCode() {
            String str = this.f1943a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f1943a + '\'' + ", countdownStepMillis=" + this.f1945c + '}';
        }
    }

    public C1537j(Handler handler, C1969m mVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        } else if (mVar != null) {
            this.f1937b = handler;
            this.f1936a = mVar.mo14509A();
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2861a(final C1540b bVar, final int i) {
        this.f1937b.postDelayed(new Runnable() {
            public void run() {
                C1539a b = bVar.m2875c();
                if (b.mo13039b()) {
                    if (C1537j.this.f1939d.get() == i) {
                        try {
                            b.mo13038a();
                            C1537j.this.m2861a(bVar, i);
                        } catch (Throwable th) {
                            if (C2102v.m5104a()) {
                                C2102v b2 = C1537j.this.f1936a;
                                b2.mo15013b("CountdownManager", "Encountered error on countdown step for: " + bVar.m2870a(), th);
                            }
                            C1537j.this.mo13189b();
                        }
                    } else if (C2102v.m5104a()) {
                        C2102v b3 = C1537j.this.f1936a;
                        b3.mo15015d("CountdownManager", "Killing duplicate countdown from previous generation: " + bVar.m2870a());
                    }
                } else if (C2102v.m5104a()) {
                    C2102v b4 = C1537j.this.f1936a;
                    b4.mo15012b("CountdownManager", "Ending countdown for " + bVar.m2870a());
                }
            }
        }, bVar.m2872b());
    }

    /* renamed from: a */
    public void mo13187a() {
        HashSet<C1540b> hashSet = new HashSet<>(this.f1938c);
        if (C2102v.m5104a()) {
            C2102v vVar = this.f1936a;
            vVar.mo15012b("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int incrementAndGet = this.f1939d.incrementAndGet();
        for (C1540b bVar : hashSet) {
            if (C2102v.m5104a()) {
                C2102v vVar2 = this.f1936a;
                vVar2.mo15012b("CountdownManager", "Starting countdown: " + bVar.m2870a() + " for generation " + incrementAndGet + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            m2861a(bVar, incrementAndGet);
        }
    }

    /* renamed from: a */
    public void mo13188a(String str, long j, C1539a aVar) {
        if (j <= 0) {
            throw new IllegalArgumentException("Invalid step specified.");
        } else if (this.f1937b != null) {
            if (C2102v.m5104a()) {
                C2102v vVar = this.f1936a;
                vVar.mo15012b("CountdownManager", "Adding countdown: " + str);
            }
            this.f1938c.add(new C1540b(str, j, aVar));
        } else {
            throw new IllegalArgumentException("No handler specified.");
        }
    }

    /* renamed from: b */
    public void mo13189b() {
        if (C2102v.m5104a()) {
            this.f1936a.mo15012b("CountdownManager", "Removing all countdowns...");
        }
        mo13190c();
        this.f1938c.clear();
    }

    /* renamed from: c */
    public void mo13190c() {
        if (C2102v.m5104a()) {
            this.f1936a.mo15012b("CountdownManager", "Stopping countdowns...");
        }
        this.f1939d.incrementAndGet();
        this.f1937b.removeCallbacksAndMessages((Object) null);
    }
}
