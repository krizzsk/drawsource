package com.mbridge.msdk.foundation.same.net;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.mbridge.msdk.foundation.same.net.j */
/* compiled from: RequestQueue */
public class C8555j {

    /* renamed from: a */
    private static final String f21007a = C8555j.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f21008b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C8511c f21009c;

    /* renamed from: d */
    private Set<C8554i> f21010d = new HashSet();

    /* renamed from: e */
    private ExecutorService f21011e = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.DiscardPolicy());

    /* renamed from: f */
    private AtomicInteger f21012f = new AtomicInteger();

    public C8555j(Context context) {
        this.f21008b = context.getApplicationContext();
        this.f21009c = new C8514d(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    public final void mo58013a(final C8554i iVar) {
        iVar.mo57987a(this);
        synchronized (this) {
            this.f21010d.add(iVar);
        }
        iVar.mo57986a(this.f21012f.incrementAndGet());
        this.f21011e.execute(new Runnable() {
            public final void run() {
                new C8553h(C8555j.this.f21008b, (SSLSocketFactory) null, C8555j.this.f21009c).mo57984a(iVar);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo58014b(C8554i iVar) {
        synchronized (this) {
            this.f21010d.remove(iVar);
        }
    }
}
