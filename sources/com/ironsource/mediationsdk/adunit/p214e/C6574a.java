package com.ironsource.mediationsdk.adunit.p214e;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.p209c.p211b.C6555a;
import com.ironsource.mediationsdk.adunit.p212d.p213a.C6570c;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ironsource.mediationsdk.adunit.e.a */
public final class C6574a<Smash extends C6570c<?>> {

    /* renamed from: a */
    ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> f17032a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public String f17033b = "";

    /* renamed from: c */
    ConcurrentHashMap<String, AdInfo> f17034c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private String f17035d = "";

    /* renamed from: e */
    private C6570c<?> f17036e;

    /* renamed from: f */
    private final List<String> f17037f;

    /* renamed from: g */
    private final int f17038g;

    /* renamed from: h */
    private final Timer f17039h = new Timer();

    /* renamed from: i */
    private C6576b f17040i;

    /* renamed from: j */
    private final int f17041j = 5;

    public C6574a(List<String> list, int i, C6576b bVar) {
        this.f17037f = list;
        this.f17038g = i;
        this.f17040i = bVar;
    }

    /* renamed from: b */
    private synchronized void m19990b() {
        if (this.f17036e != null) {
            this.f17036e.mo36535c();
        }
    }

    /* renamed from: c */
    private synchronized boolean m19991c() {
        return this.f17036e != null && this.f17036e.mo36550p() && this.f17036e.mo36549o().equals(this.f17035d);
    }

    /* renamed from: d */
    private void m19992d() {
        Iterator it = mo36553a().iterator();
        while (it.hasNext()) {
            C6570c cVar = (C6570c) it.next();
            if (!cVar.equals(this.f17036e)) {
                cVar.mo36535c();
            }
        }
    }

    /* renamed from: a */
    public final AdInfo mo36552a(String str) {
        if (this.f17034c.containsKey(str)) {
            return this.f17034c.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public final CopyOnWriteArrayList<Smash> mo36553a() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.f17032a.get(this.f17033b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    /* renamed from: a */
    public final void mo36554a(C6555a.C6556a aVar, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        m19992d();
        if (aVar == C6555a.C6556a.AUTOMATIC_LOAD_WHILE_SHOW) {
            this.f17032a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.f17035d)) {
                if (m19991c()) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.verbose("ad from previous waterfall " + this.f17035d + " is still showing - the current waterfall " + this.f17033b + " will be deleted instead");
                    String str2 = this.f17033b;
                    this.f17033b = this.f17035d;
                    this.f17035d = str2;
                }
                final String str3 = this.f17035d;
                this.f17039h.schedule(new TimerTask() {
                    public final void run() {
                        try {
                            IronLog ironLog = IronLog.INTERNAL;
                            ironLog.verbose("removing waterfall with id " + str3 + " from memory");
                            C6574a.this.f17032a.remove(str3);
                            IronLog ironLog2 = IronLog.INTERNAL;
                            ironLog2.verbose("waterfall size is currently " + C6574a.this.f17032a.size());
                            IronLog ironLog3 = IronLog.INTERNAL;
                            ironLog3.verbose("removing adInfo with id " + str3 + " from memory");
                            C6574a.this.f17034c.remove(str3);
                            IronLog ironLog4 = IronLog.INTERNAL;
                            ironLog4.verbose("adInfo size is currently " + C6574a.this.f17034c.size());
                        } finally {
                            cancel();
                        }
                    }
                }, (long) this.f17038g);
            }
        } else {
            this.f17032a.clear();
            this.f17032a.put(str, copyOnWriteArrayList);
        }
        this.f17035d = this.f17033b;
        this.f17033b = str;
        if (this.f17032a.size() > 5) {
            this.f17040i.mo36518a(this.f17032a.size());
        }
    }

    /* renamed from: a */
    public final synchronized void mo36555a(C6570c<?> cVar) {
        IronLog.INTERNAL.verbose("");
        if (this.f17036e != null && !this.f17036e.equals(cVar)) {
            m19990b();
        }
        this.f17036e = cVar;
    }

    /* renamed from: a */
    public final void mo36556a(String str, ImpressionData impressionData) {
        if (!TextUtils.isEmpty(str) && impressionData != null) {
            this.f17034c.put(str, new AdInfo(impressionData));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r3.f17037f.contains(r6) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r3.f17036e.mo36548n().equals(r6) == false) goto L_0x0007;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo36557a(com.ironsource.mediationsdk.adunit.p209c.p211b.C6555a.C6556a r4, java.lang.String r5, java.lang.String r6, com.ironsource.mediationsdk.LoadWhileShowSupportState r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ironsource.mediationsdk.adunit.c.b.a$a r0 = com.ironsource.mediationsdk.adunit.p209c.p211b.C6555a.C6556a.AUTOMATIC_LOAD_WHILE_SHOW     // Catch:{ all -> 0x0059 }
            r1 = 0
            r2 = 1
            if (r4 == r0) goto L_0x0009
        L_0x0007:
            r1 = r2
            goto L_0x003f
        L_0x0009:
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.f17036e     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0007
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.f17036e     // Catch:{ all -> 0x0059 }
            boolean r4 = r4.mo36550p()     // Catch:{ all -> 0x0059 }
            if (r4 != 0) goto L_0x0016
            goto L_0x0007
        L_0x0016:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK     // Catch:{ all -> 0x0059 }
            if (r7 != r4) goto L_0x0027
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.f17036e     // Catch:{ all -> 0x0059 }
            java.lang.String r4 = r4.mo36388k()     // Catch:{ all -> 0x0059 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0027
            goto L_0x003f
        L_0x0027:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.NONE     // Catch:{ all -> 0x0059 }
            if (r7 == r4) goto L_0x0033
            java.util.List<java.lang.String> r4 = r3.f17037f     // Catch:{ all -> 0x0059 }
            boolean r4 = r4.contains(r6)     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0007
        L_0x0033:
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.f17036e     // Catch:{ all -> 0x0059 }
            java.lang.String r4 = r4.mo36548n()     // Catch:{ all -> 0x0059 }
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0007
        L_0x003f:
            if (r1 != 0) goto L_0x0057
            com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0059 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r6.<init>()     // Catch:{ all -> 0x0059 }
            r6.append(r5)     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = " does not support load while show and will not be added to the auction request"
            r6.append(r5)     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x0059 }
            r4.verbose(r5)     // Catch:{ all -> 0x0059 }
        L_0x0057:
            monitor-exit(r3)
            return r1
        L_0x0059:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p214e.C6574a.mo36557a(com.ironsource.mediationsdk.adunit.c.b.a$a, java.lang.String, java.lang.String, com.ironsource.mediationsdk.LoadWhileShowSupportState):boolean");
    }
}
