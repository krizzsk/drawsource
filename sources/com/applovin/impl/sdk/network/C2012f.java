package com.applovin.impl.sdk.network;

import android.content.SharedPreferences;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p051c.C1869d;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.p053e.C1944z;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.f */
public class C2012f {

    /* renamed from: a */
    private final C1969m f3878a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2102v f3879b;

    /* renamed from: c */
    private final int f3880c;

    /* renamed from: d */
    private final C2016g f3881d;

    /* renamed from: e */
    private final SharedPreferences f3882e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Object f3883f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ArrayList<C2017h> f3884g;

    /* renamed from: h */
    private final ArrayList<C2017h> f3885h = new ArrayList<>();

    /* renamed from: i */
    private long f3886i = 0;

    /* renamed from: j */
    private final Set<C2017h> f3887j = new HashSet();

    public C2012f(C1969m mVar) {
        if (mVar != null) {
            this.f3878a = mVar;
            this.f3879b = mVar.mo14509A();
            this.f3880c = ((Integer) mVar.mo14534a(C1867b.f3216cL)).intValue();
            if (mVar.mo14551aa() != null) {
                this.f3882e = mVar.mo14520L().getSharedPreferences("com.applovin.sdk.impl.postbackQueue.domain", 0);
                this.f3884g = m4718d();
                this.f3881d = null;
                return;
            }
            C2016g gVar = new C2016g(this, mVar);
            this.f3881d = gVar;
            this.f3884g = gVar.mo14771a(this.f3880c);
            this.f3881d.mo14772a();
            this.f3882e = null;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        r0 = ((java.lang.Integer) r4.f3878a.mo14534a(com.applovin.impl.sdk.p051c.C1867b.f3214cJ)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r5.mo14786k() <= r0) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0090, code lost:
        if (com.applovin.impl.sdk.C2102v.m5104a() == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0092, code lost:
        r6 = r4.f3879b;
        r6.mo15015d("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + r0 + ". Dequeuing postback: " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b2, code lost:
        m4721d(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        r1 = r4.f3883f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b9, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r4.f3887j.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bf, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        if (r5.mo14780f() == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c6, code lost:
        r0 = new org.json.JSONObject(r5.mo14780f());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d0, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d1, code lost:
        r4.f3878a.mo14531X().dispatchPostbackRequest(com.applovin.impl.sdk.network.C2020i.m4771b(r4.f3878a).mo14810d(r5.mo14775b()).mo14813e(r5.mo14776c()).mo14808c(r5.mo14777d()).mo14816f(r5.mo14774a()).mo14811d(r5.mo14778e()).mo14806b(r0).mo14817f(r5.mo14782h()).mo14814e(r5.mo14781g()).mo14819g(r5.mo14784i()).mo14818g(r5.mo14785j()).mo14807b(), new com.applovin.impl.sdk.network.C2012f.C20142(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m4711a(final com.applovin.impl.sdk.network.C2017h r5, final com.applovin.sdk.AppLovinPostbackListener r6) {
        /*
            r4 = this;
            boolean r0 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r0 == 0) goto L_0x001e
            com.applovin.impl.sdk.v r0 = r4.f3879b
            java.lang.String r1 = "PersistentPostbackManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Preparing to submit postback..."
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.mo15012b(r1, r2)
        L_0x001e:
            com.applovin.impl.sdk.m r0 = r4.f3878a
            boolean r0 = r0.mo14573c()
            if (r0 == 0) goto L_0x0036
            boolean r5 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r5 == 0) goto L_0x0035
            com.applovin.impl.sdk.v r5 = r4.f3879b
            java.lang.String r6 = "PersistentPostbackManager"
            java.lang.String r0 = "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards"
            r5.mo15012b(r6, r0)
        L_0x0035:
            return
        L_0x0036:
            java.lang.Object r0 = r4.f3883f
            monitor-enter(r0)
            java.util.Set<com.applovin.impl.sdk.network.h> r1 = r4.f3887j     // Catch:{ all -> 0x0139 }
            boolean r1 = r1.contains(r5)     // Catch:{ all -> 0x0139 }
            if (r1 == 0) goto L_0x0065
            boolean r6 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x0139 }
            if (r6 == 0) goto L_0x0063
            com.applovin.impl.sdk.v r6 = r4.f3879b     // Catch:{ all -> 0x0139 }
            java.lang.String r1 = "PersistentPostbackManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0139 }
            r2.<init>()     // Catch:{ all -> 0x0139 }
            java.lang.String r3 = "Skip pending postback: "
            r2.append(r3)     // Catch:{ all -> 0x0139 }
            java.lang.String r5 = r5.mo14775b()     // Catch:{ all -> 0x0139 }
            r2.append(r5)     // Catch:{ all -> 0x0139 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0139 }
            r6.mo15012b(r1, r5)     // Catch:{ all -> 0x0139 }
        L_0x0063:
            monitor-exit(r0)     // Catch:{ all -> 0x0139 }
            return
        L_0x0065:
            r5.mo14787l()     // Catch:{ all -> 0x0139 }
            com.applovin.impl.sdk.m r1 = r4.f3878a     // Catch:{ all -> 0x0139 }
            com.applovin.impl.sdk.r r1 = r1.mo14551aa()     // Catch:{ all -> 0x0139 }
            if (r1 == 0) goto L_0x0074
            r4.m4724f()     // Catch:{ all -> 0x0139 }
            goto L_0x0077
        L_0x0074:
            r4.m4722e()     // Catch:{ all -> 0x0139 }
        L_0x0077:
            monitor-exit(r0)     // Catch:{ all -> 0x0139 }
            com.applovin.impl.sdk.m r0 = r4.f3878a
            com.applovin.impl.sdk.c.b<java.lang.Integer> r1 = com.applovin.impl.sdk.p051c.C1867b.f3214cJ
            java.lang.Object r0 = r0.mo14534a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r1 = r5.mo14786k()
            if (r1 <= r0) goto L_0x00b7
            boolean r6 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r6 == 0) goto L_0x00b2
            com.applovin.impl.sdk.v r6 = r4.f3879b
            java.lang.String r1 = "PersistentPostbackManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exceeded maximum persisted attempt count of "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ". Dequeuing postback: "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r2.toString()
            r6.mo15015d(r1, r0)
        L_0x00b2:
            r4.m4721d((com.applovin.impl.sdk.network.C2017h) r5)
            goto L_0x0135
        L_0x00b7:
            java.lang.Object r1 = r4.f3883f
            monitor-enter(r1)
            java.util.Set<com.applovin.impl.sdk.network.h> r0 = r4.f3887j     // Catch:{ all -> 0x0136 }
            r0.add(r5)     // Catch:{ all -> 0x0136 }
            monitor-exit(r1)     // Catch:{ all -> 0x0136 }
            java.util.Map r0 = r5.mo14780f()
            if (r0 == 0) goto L_0x00d0
            org.json.JSONObject r0 = new org.json.JSONObject
            java.util.Map r1 = r5.mo14780f()
            r0.<init>(r1)
            goto L_0x00d1
        L_0x00d0:
            r0 = 0
        L_0x00d1:
            com.applovin.impl.sdk.m r1 = r4.f3878a
            com.applovin.impl.sdk.network.i$a r1 = com.applovin.impl.sdk.network.C2020i.m4771b(r1)
            java.lang.String r2 = r5.mo14775b()
            com.applovin.impl.sdk.network.i$a r1 = r1.mo14724a((java.lang.String) r2)
            java.lang.String r2 = r5.mo14776c()
            com.applovin.impl.sdk.network.i$a r1 = r1.mo14734c((java.lang.String) r2)
            java.util.Map r2 = r5.mo14777d()
            com.applovin.impl.sdk.network.i$a r1 = r1.mo14725a((java.util.Map<java.lang.String, java.lang.String>) r2)
            java.lang.String r2 = r5.mo14774a()
            com.applovin.impl.sdk.network.i$a r1 = r1.mo14730b((java.lang.String) r2)
            java.util.Map r2 = r5.mo14778e()
            com.applovin.impl.sdk.network.i$a r1 = r1.mo14731b((java.util.Map<java.lang.String, java.lang.String>) r2)
            com.applovin.impl.sdk.network.i$a r0 = r1.mo14726a((org.json.JSONObject) r0)
            boolean r1 = r5.mo14782h()
            com.applovin.impl.sdk.network.i$a r0 = r0.mo14736d((boolean) r1)
            boolean r1 = r5.mo14781g()
            com.applovin.impl.sdk.network.i$a r0 = r0.mo14735c((boolean) r1)
            boolean r1 = r5.mo14784i()
            com.applovin.impl.sdk.network.i$a r0 = r0.mo14819g((boolean) r1)
            java.lang.String r1 = r5.mo14785j()
            com.applovin.impl.sdk.network.i$a r0 = r0.mo14818g((java.lang.String) r1)
            com.applovin.impl.sdk.network.i r0 = r0.mo14728a()
            com.applovin.impl.sdk.m r1 = r4.f3878a
            com.applovin.impl.sdk.network.PostbackServiceImpl r1 = r1.mo14531X()
            com.applovin.impl.sdk.network.f$2 r2 = new com.applovin.impl.sdk.network.f$2
            r2.<init>(r5, r6)
            r1.dispatchPostbackRequest(r0, r2)
        L_0x0135:
            return
        L_0x0136:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0136 }
            throw r5
        L_0x0139:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0139 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.network.C2012f.m4711a(com.applovin.impl.sdk.network.h, com.applovin.sdk.AppLovinPostbackListener):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m4714b(C2017h hVar) {
        synchronized (this.f3883f) {
            if (this.f3878a.mo14551aa() != null) {
                this.f3884g.add(hVar);
                m4724f();
            } else {
                while (this.f3884g.size() > this.f3880c) {
                    this.f3884g.remove(0);
                }
                this.f3884g.add(hVar);
                m4722e();
            }
            if (C2102v.m5104a()) {
                C2102v vVar = this.f3879b;
                vVar.mo15012b("PersistentPostbackManager", "Enqueued postback: " + hVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m4717c(C2017h hVar) {
        m4711a(hVar, (AppLovinPostbackListener) null);
    }

    /* renamed from: d */
    private ArrayList<C2017h> m4718d() {
        Set<String> set = (Set) this.f3878a.mo14566b(C1869d.f3384p, new LinkedHashSet(0), this.f3882e);
        ArrayList<C2017h> arrayList = new ArrayList<>(Math.max(1, set.size()));
        int intValue = ((Integer) this.f3878a.mo14534a(C1867b.f3214cJ)).intValue();
        C2102v vVar = this.f3879b;
        vVar.mo15012b("PersistentPostbackManager", "Deserializing " + set.size() + " postback(s).");
        for (String str : set) {
            try {
                C2017h hVar = new C2017h(new JSONObject(str), this.f3878a);
                if (hVar.mo14786k() < intValue) {
                    arrayList.add(hVar);
                } else if (C2102v.m5105a(this.f3878a)) {
                    C2102v vVar2 = this.f3879b;
                    vVar2.mo15012b("PersistentPostbackManager", "Skipping deserialization because maximum attempt count exceeded for postback: " + hVar);
                }
            } catch (Throwable th) {
                if (C2102v.m5105a(this.f3878a)) {
                    C2102v vVar3 = this.f3879b;
                    vVar3.mo15013b("PersistentPostbackManager", "Unable to deserialize postback request from json: " + str, th);
                }
            }
        }
        if (C2102v.m5105a(this.f3878a)) {
            C2102v vVar4 = this.f3879b;
            vVar4.mo15012b("PersistentPostbackManager", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m4721d(C2017h hVar) {
        synchronized (this.f3883f) {
            this.f3887j.remove(hVar);
            this.f3884g.remove(hVar);
            if (this.f3878a.mo14551aa() != null) {
                m4724f();
            } else {
                m4722e();
            }
        }
        if (C2102v.m5104a()) {
            C2102v vVar = this.f3879b;
            vVar.mo15012b("PersistentPostbackManager", "Dequeued successfully transmitted postback: " + hVar);
        }
    }

    /* renamed from: e */
    private void m4722e() {
        this.f3886i = System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m4723e(C2017h hVar) {
        synchronized (this.f3883f) {
            this.f3887j.remove(hVar);
            this.f3885h.add(hVar);
        }
    }

    /* renamed from: f */
    private void m4724f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.f3884g.size());
        Iterator<C2017h> it = this.f3884g.iterator();
        while (it.hasNext()) {
            try {
                linkedHashSet.add(it.next().mo14789n().toString());
            } catch (Throwable th) {
                this.f3879b.mo15013b("PersistentPostbackManager", "Unable to serialize postback request to JSON.", th);
            }
        }
        this.f3878a.mo14542a(C1869d.f3384p, linkedHashSet, this.f3882e);
        this.f3879b.mo15012b("PersistentPostbackManager", "Wrote updated postback queue to disk.");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m4725g() {
        synchronized (this.f3883f) {
            Iterator<C2017h> it = this.f3885h.iterator();
            while (it.hasNext()) {
                m4717c(it.next());
            }
            this.f3885h.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo14763a() {
        return this.f3886i;
    }

    /* renamed from: a */
    public void mo14764a(C2017h hVar) {
        mo14765a(hVar, true);
    }

    /* renamed from: a */
    public void mo14765a(C2017h hVar, boolean z) {
        mo14766a(hVar, z, (AppLovinPostbackListener) null);
    }

    /* renamed from: a */
    public void mo14766a(final C2017h hVar, boolean z, final AppLovinPostbackListener appLovinPostbackListener) {
        if (StringUtils.isValidString(hVar.mo14775b())) {
            if (z) {
                hVar.mo14788m();
            }
            C20131 r3 = new Runnable() {
                public void run() {
                    synchronized (C2012f.this.f3883f) {
                        C2012f.this.m4714b(hVar);
                        C2012f.this.m4711a(hVar, appLovinPostbackListener);
                    }
                }
            };
            if (Utils.isMainThread()) {
                this.f3878a.mo14526S().mo14429a((C1887a) new C1944z(this.f3878a, r3), C1918o.C1920a.POSTBACKS);
                return;
            }
            r3.run();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<C2017h> mo14767b() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f3883f) {
            arrayList.ensureCapacity(this.f3884g.size());
            arrayList.addAll(this.f3884g);
        }
        return arrayList;
    }

    /* renamed from: c */
    public void mo14768c() {
        C20153 r0 = new Runnable() {
            public void run() {
                synchronized (C2012f.this.f3883f) {
                    if (C2012f.this.f3884g != null) {
                        for (C2017h d : new ArrayList(C2012f.this.f3884g)) {
                            C2012f.this.m4717c(d);
                        }
                    }
                }
            }
        };
        if (((Boolean) this.f3878a.mo14534a(C1867b.f3215cK)).booleanValue()) {
            this.f3878a.mo14526S().mo14429a((C1887a) new C1944z(this.f3878a, r0), C1918o.C1920a.POSTBACKS);
            return;
        }
        r0.run();
    }
}
