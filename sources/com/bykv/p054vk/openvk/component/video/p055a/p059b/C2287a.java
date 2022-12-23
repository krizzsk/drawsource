package com.bykv.p054vk.openvk.component.video.p055a.p059b;

import com.bykv.p054vk.openvk.component.video.p055a.p059b.C2352i;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.C2359l;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p060a.C2289a;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p060a.C2290b;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p061b.C2306c;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p062c.C2311a;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p063d.C2324a;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p064e.C2327a;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p064e.C2328b;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p064e.C2329c;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p064e.C2332e;
import com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a;
import com.google.common.net.HttpHeaders;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.a */
/* compiled from: AbsTask */
abstract class C2287a implements C2358k {

    /* renamed from: m */
    private static final AtomicLong f4583m = new AtomicLong();

    /* renamed from: a */
    protected volatile C2289a f4584a;

    /* renamed from: b */
    protected final C2306c f4585b;

    /* renamed from: c */
    protected final AtomicInteger f4586c = new AtomicInteger();

    /* renamed from: d */
    protected final AtomicLong f4587d = new AtomicLong();

    /* renamed from: e */
    protected C2324a f4588e;

    /* renamed from: f */
    protected volatile List<C2352i.C2354b> f4589f;

    /* renamed from: g */
    protected volatile String f4590g;

    /* renamed from: h */
    protected volatile String f4591h;

    /* renamed from: i */
    protected volatile C2352i f4592i;

    /* renamed from: j */
    protected volatile C2359l f4593j;

    /* renamed from: k */
    protected volatile boolean f4594k = false;

    /* renamed from: l */
    public final long f4595l = f4583m.incrementAndGet();

    /* renamed from: n */
    private final AtomicInteger f4596n = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f4597o = -1;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15682a(Boolean bool, String str, Throwable th) {
    }

    public C2287a(C2289a aVar, C2306c cVar) {
        this.f4584a = aVar;
        this.f4585b = cVar;
    }

    /* renamed from: a */
    public void mo15680a() {
        this.f4596n.compareAndSet(0, 1);
    }

    /* renamed from: b */
    public boolean mo15683b() {
        return this.f4596n.get() == 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo15684c() {
        this.f4596n.compareAndSet(0, 2);
    }

    /* renamed from: d */
    public boolean mo15685d() {
        return this.f4596n.get() == 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo15686e() throws C2311a {
        if (mo15683b()) {
            throw new C2311a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2327a mo15679a(C2359l.C2360a aVar, int i, int i2, String str) throws IOException {
        C2328b b = C2329c.m5345a().mo15770b();
        C2332e eVar = new C2332e();
        HashMap hashMap = new HashMap();
        eVar.f4699b = aVar.f4781a;
        eVar.f4698a = 0;
        if (VersionInfo.GIT_BRANCH.equalsIgnoreCase(str)) {
            eVar.f4698a = 4;
        }
        List<C2352i.C2354b> list = this.f4589f;
        if (list != null && !list.isEmpty()) {
            for (C2352i.C2354b next : list) {
                if (!"Range".equalsIgnoreCase(next.f4765a) && !"Connection".equalsIgnoreCase(next.f4765a) && !"Proxy-Connection".equalsIgnoreCase(next.f4765a) && !HttpHeaders.HOST.equalsIgnoreCase(next.f4765a)) {
                    hashMap.put(next.f4765a, next.f4766b);
                }
            }
        }
        String a = C2361a.m5443a(i, i2);
        if (a != null) {
            hashMap.put("Range", a);
        }
        if (C2325e.f4688f) {
            hashMap.put("Cache-Control", "no-cache");
        }
        C2315d c = C2315d.m5308c();
        C2334f a2 = C2334f.m5358a();
        boolean z = this.f4592i == null;
        C2310c a3 = z ? c.mo15737a() : a2.mo15775b();
        C2310c b2 = z ? c.mo15747b() : a2.mo15776c();
        if (!(a3 == null && b2 == null)) {
            if (a3 != null) {
                eVar.f4700c = a3.mo15736a(aVar.f4782b);
            }
            if (b2 != null) {
                eVar.f4701d = b2.mo15736a(aVar.f4782b);
            }
        }
        eVar.f4702e = hashMap;
        if (!this.f4594k) {
            return b.mo15769a(eVar);
        }
        this.f4594k = false;
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo15687f() {
        if (this.f4592i != null) {
            return this.f4592i.f4757c.f4758a;
        }
        return this.f4584a instanceof C2290b ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo15688g() {
        return mo15687f() == 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15681a(int i, int i2) {
        if (i > 0 && i2 >= 0) {
            int i3 = C2325e.f4689g;
            int f = mo15687f();
            if (i3 == 1 || (i3 == 2 && f == 1)) {
                int i4 = (int) ((((float) i2) / ((float) i)) * 100.0f);
                if (i4 > 100) {
                    i4 = 100;
                }
                synchronized (this) {
                    if (i4 > this.f4597o) {
                        this.f4597o = i4;
                        C2361a.m5453a((Runnable) new Runnable() {
                            public void run() {
                                if (C2287a.this.f4588e != null) {
                                    C2287a.this.f4588e.mo15758a(C2287a.this.f4593j, C2287a.this.f4597o);
                                }
                            }
                        });
                    }
                }
            }
        }
    }
}
