package com.apm.insight.p013a;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.runtime.C1394p;

/* renamed from: com.apm.insight.a.a */
public class C1182a implements ICrashCallback {

    /* renamed from: d */
    private static volatile C1182a f952d;

    /* renamed from: a */
    private volatile String f953a;

    /* renamed from: b */
    private volatile C1184b f954b;

    /* renamed from: c */
    private volatile C1185c f955c;

    /* renamed from: e */
    private volatile boolean f956e = false;

    private C1182a() {
    }

    /* renamed from: a */
    public static C1182a m1301a() {
        if (f952d == null) {
            synchronized (C1182a.class) {
                if (f952d == null) {
                    f952d = new C1182a();
                }
            }
        }
        return f952d;
    }

    /* renamed from: a */
    public void mo12398a(CrashType crashType, long j, String str) {
    }

    /* renamed from: a */
    public void mo12399a(String str) {
    }

    /* renamed from: a */
    public void mo12400a(String str, C1184b bVar, C1185c cVar) {
        this.f953a = str;
        this.f954b = bVar;
        this.f955c = cVar;
        if (!this.f956e) {
            this.f956e = true;
            C1394p.m2321b().mo12749a((Runnable) new Runnable() {
                public void run() {
                }
            });
        }
    }

    /* renamed from: b */
    public void mo12401b() {
    }

    public void onCrash(CrashType crashType, String str, Thread thread) {
        boolean equals = crashType.equals(CrashType.NATIVE);
    }
}
