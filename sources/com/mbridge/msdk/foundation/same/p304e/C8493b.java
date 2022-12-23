package com.mbridge.msdk.foundation.same.p304e;

import android.content.Context;
import com.mbridge.msdk.foundation.same.p304e.C8490a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mbridge.msdk.foundation.same.e.b */
/* compiled from: CommonTaskLoader */
public final class C8493b {

    /* renamed from: a */
    ThreadPoolExecutor f20833a;

    /* renamed from: b */
    HashMap<Long, C8490a> f20834b;

    /* renamed from: c */
    WeakReference<Context> f20835c;

    public C8493b(Context context, int i) {
        if (i == 0) {
            this.f20833a = new ThreadPoolExecutor(1, 5, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        } else {
            this.f20833a = new ThreadPoolExecutor(i, (i * 2) + 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        }
        this.f20833a.allowCoreThreadTimeOut(true);
        this.f20834b = new HashMap<>();
        this.f20835c = new WeakReference<>(context);
    }

    public C8493b(Context context) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 5, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.f20833a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f20834b = new HashMap<>();
        this.f20835c = new WeakReference<>(context);
    }

    /* renamed from: b */
    private synchronized void m24351b(final C8490a aVar, final C8490a.C8492b bVar) {
        this.f20834b.put(Long.valueOf(C8490a.f20824b), aVar);
        aVar.f20826d = new C8490a.C8492b() {
            /* renamed from: a */
            public final void mo37107a(C8490a.C8491a aVar) {
                if (aVar == C8490a.C8491a.CANCEL) {
                    C8493b.this.f20834b.remove(Long.valueOf(C8490a.f20824b));
                } else if (aVar == C8490a.C8491a.FINISH) {
                    C8493b.this.f20834b.remove(Long.valueOf(C8490a.f20824b));
                } else if (aVar == C8490a.C8491a.RUNNING && ((Context) C8493b.this.f20835c.get()) == null) {
                    C8493b.this.mo57902a();
                }
                C8490a.C8492b bVar = bVar;
                if (bVar != null) {
                    bVar.mo37107a(aVar);
                }
            }
        };
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo57902a() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.HashMap<java.lang.Long, com.mbridge.msdk.foundation.same.e.a> r0 = r2.f20834b     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
        L_0x000b:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            if (r1 == 0) goto L_0x0021
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            com.mbridge.msdk.foundation.same.e.a r1 = (com.mbridge.msdk.foundation.same.p304e.C8490a) r1     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            r1.mo57900d()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            goto L_0x000b
        L_0x0021:
            java.util.HashMap<java.lang.Long, com.mbridge.msdk.foundation.same.e.a> r0 = r2.f20834b     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            r0.clear()     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            goto L_0x002a
        L_0x0027:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x002a:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.p304e.C8493b.mo57902a():void");
    }

    /* renamed from: a */
    public final void mo57903a(C8490a aVar) {
        m24351b(aVar, (C8490a.C8492b) null);
        this.f20833a.execute(aVar);
    }

    /* renamed from: a */
    public final void mo57904a(C8490a aVar, C8490a.C8492b bVar) {
        m24351b(aVar, bVar);
        this.f20833a.execute(aVar);
    }
}
