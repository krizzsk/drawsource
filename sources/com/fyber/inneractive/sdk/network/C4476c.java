package com.fyber.inneractive.sdk.network;

import android.os.Handler;
import android.os.HandlerThread;
import com.fyber.inneractive.sdk.util.C5304o0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.network.c */
public class C4476c implements C5304o0 {

    /* renamed from: a */
    public final BlockingQueue<JSONObject> f10998a = new LinkedBlockingQueue();

    /* renamed from: b */
    public JSONArray f10999b = new JSONArray();

    /* renamed from: c */
    public final HandlerThread f11000c = new HandlerThread("EventCollectorHandlerThread", 0);

    /* renamed from: d */
    public Handler f11001d;

    /* renamed from: e */
    public int f11002e;

    /* renamed from: f */
    public boolean f11003f = false;

    /* renamed from: g */
    public boolean f11004g = false;

    /* renamed from: com.fyber.inneractive.sdk.network.c$a */
    public class C4477a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f11005a;

        /* renamed from: b */
        public final /* synthetic */ long f11006b;

        public C4477a(int i, long j) {
            this.f11005a = i;
            this.f11006b = j;
        }

        public void run() {
            C4476c.this.f11001d.sendEmptyMessageDelayed(this.f11005a, this.f11006b);
        }
    }

    /* renamed from: a */
    public final void mo24658a(int i, long j) {
        Handler handler = this.f11001d;
        if (handler != null) {
            handler.post(new C4477a(i, j));
        }
    }

    /* JADX WARNING: type inference failed for: r11v21, types: [org.json.JSONObject] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r11) {
        /*
            r10 = this;
            int r11 = r11.what
            r0 = 12312329(0xbbdf09, float:1.7253248E-38)
            if (r11 == r0) goto L_0x000c
            r1 = 20150330(0x133783a, float:3.2963366E-38)
            if (r11 != r1) goto L_0x0083
        L_0x000c:
            boolean r11 = r10.f11003f
            if (r11 == 0) goto L_0x0074
            java.util.concurrent.BlockingQueue<org.json.JSONObject> r11 = r10.f10998a
            int r11 = r11.size()
            if (r11 <= 0) goto L_0x0074
        L_0x0018:
            java.util.concurrent.BlockingQueue<org.json.JSONObject> r11 = r10.f10998a
            int r11 = r11.size()
            r1 = 0
            if (r11 <= 0) goto L_0x0032
            java.util.concurrent.BlockingQueue<org.json.JSONObject> r11 = r10.f10998a     // Catch:{ all -> 0x002a }
            java.lang.Object r11 = r11.poll()     // Catch:{ all -> 0x002a }
            org.json.JSONObject r11 = (org.json.JSONObject) r11     // Catch:{ all -> 0x002a }
            r1 = r11
        L_0x002a:
            if (r1 == 0) goto L_0x0018
            org.json.JSONArray r11 = r10.f10999b
            r11.put(r1)
            goto L_0x0018
        L_0x0032:
            org.json.JSONArray r11 = r10.f10999b
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x0074
            org.json.JSONArray r5 = r10.f10999b
            java.lang.String r11 = com.fyber.inneractive.sdk.config.C4203a.m13187b()
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0048 }
        L_0x0048:
            if (r1 == 0) goto L_0x006d
            com.fyber.inneractive.sdk.network.g0 r8 = new com.fyber.inneractive.sdk.network.g0
            com.fyber.inneractive.sdk.network.e r9 = new com.fyber.inneractive.sdk.network.e
            r2 = r9
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6)
            com.fyber.inneractive.sdk.network.v r2 = com.fyber.inneractive.sdk.network.C4522v.m13803b()
            com.fyber.inneractive.sdk.network.g r2 = r2.mo24698a()
            r8.<init>(r9, r11, r1, r2)
            com.fyber.inneractive.sdk.config.IAConfigManager r11 = com.fyber.inneractive.sdk.config.IAConfigManager.f10324J
            com.fyber.inneractive.sdk.network.w r11 = r11.f10354t
            java.util.concurrent.BlockingQueue<com.fyber.inneractive.sdk.network.b0<?>> r11 = r11.f11186a
            r11.offer(r8)
            com.fyber.inneractive.sdk.network.m0 r11 = com.fyber.inneractive.sdk.network.C4501m0.QUEUED
            r8.mo24642a((com.fyber.inneractive.sdk.network.C4501m0) r11)
        L_0x006d:
            org.json.JSONArray r11 = new org.json.JSONArray
            r11.<init>()
            r10.f10999b = r11
        L_0x0074:
            android.os.Handler r11 = r10.f11001d
            if (r11 == 0) goto L_0x0083
            r11.removeMessages(r0)
            int r11 = r10.f11002e
            int r11 = r11 * 1000
            long r1 = (long) r11
            r10.mo24658a(r0, r1)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.C4476c.handleMessage(android.os.Message):void");
    }
}
