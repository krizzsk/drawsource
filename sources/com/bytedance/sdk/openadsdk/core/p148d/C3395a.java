package com.bytedance.sdk.openadsdk.core.p148d;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p153i.C3471f;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.bytedance.sdk.openadsdk.core.d.a */
/* compiled from: FrequentCallController */
public class C3395a {

    /* renamed from: a */
    private static volatile C3395a f8182a;

    /* renamed from: b */
    private static volatile boolean f8183b;

    /* renamed from: c */
    private static volatile long f8184c;

    /* renamed from: d */
    private final Queue<C3397a> f8185d = new LinkedList();

    /* renamed from: e */
    private Handler f8186e;

    /* renamed from: f */
    private final C3471f f8187f = C3513m.m10973h();

    private C3395a() {
    }

    /* renamed from: a */
    public static C3395a m10104a() {
        if (f8182a == null) {
            synchronized (C3395a.class) {
                if (f8182a == null) {
                    f8182a = new C3395a();
                }
            }
        }
        return f8182a;
    }

    /* renamed from: b */
    private synchronized boolean m10109b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        int i = this.f8187f.mo19859i();
        long h = this.f8187f.mo19857h();
        if (this.f8185d.size() <= 0 || this.f8185d.size() < i) {
            this.f8185d.offer(new C3397a(currentTimeMillis, str));
        } else {
            long abs = Math.abs(currentTimeMillis - this.f8185d.peek().f8189a);
            if (abs <= h) {
                m10108b(h - abs);
                return true;
            }
            this.f8185d.poll();
            this.f8185d.offer(new C3397a(currentTimeMillis, str));
        }
        return false;
    }

    /* renamed from: a */
    public synchronized boolean mo19376a(String str) {
        if (m10109b(str)) {
            m10107a(true);
            m10105a(f8184c);
        } else {
            m10107a(false);
        }
        return f8183b;
    }

    /* renamed from: a */
    private synchronized void m10105a(long j) {
        if (this.f8186e == null) {
            this.f8186e = new Handler(Looper.getMainLooper());
        }
        this.f8186e.postDelayed(new Runnable() {
            public void run() {
                C3395a.this.m10107a(false);
            }
        }, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m10107a(boolean z) {
        f8183b = z;
    }

    /* renamed from: b */
    public synchronized boolean mo19377b() {
        return f8183b;
    }

    /* renamed from: b */
    private synchronized void m10108b(long j) {
        f8184c = j;
    }

    /* renamed from: c */
    public synchronized String mo19378c() {
        String str;
        HashMap hashMap = new HashMap();
        for (C3397a aVar : this.f8185d) {
            if (hashMap.containsKey(aVar.f8190b)) {
                hashMap.put(aVar.f8190b, Integer.valueOf(((Integer) hashMap.get(aVar.f8190b)).intValue() + 1));
            } else {
                hashMap.put(aVar.f8190b, 1);
            }
        }
        int i = Integer.MIN_VALUE;
        str = "";
        for (String str2 : hashMap.keySet()) {
            int intValue = ((Integer) hashMap.get(str2)).intValue();
            if (i < intValue) {
                str = str2;
                i = intValue;
            }
        }
        return str;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.d.a$a */
    /* compiled from: FrequentCallController */
    private static class C3397a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final long f8189a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f8190b;

        private C3397a(long j, String str) {
            this.f8189a = j;
            this.f8190b = str;
        }
    }
}
