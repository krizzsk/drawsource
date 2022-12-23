package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.inmobi.media.dn */
/* compiled from: TimeOutManager */
public class C5933dn {

    /* renamed from: a */
    private static final String f15020a = C5933dn.class.getSimpleName();

    /* renamed from: d */
    private static byte f15021d = -1;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C5932dm f15022b;

    /* renamed from: c */
    private HashMap<Byte, Timer> f15023c = new HashMap<>();

    public C5933dn(C5932dm dmVar) {
        this.f15022b = dmVar;
    }

    /* renamed from: a */
    public final boolean mo35042a(final byte b, long j) {
        if (this.f15023c.containsKey(Byte.valueOf(b))) {
            mo35041a(b);
        }
        try {
            Timer timer = new Timer(f15020a);
            this.f15023c.put(Byte.valueOf(b), timer);
            timer.schedule(new TimerTask() {
                public final void run() {
                    new Handler(Looper.getMainLooper()).post(new Runnable(b) {
                        public final void run() {
                            C5933dn.this.f15022b.mo34449c(r3);
                        }
                    });
                }
            }, j);
            return true;
        } catch (OutOfMemoryError unused) {
            C6195ic.m18378a((byte) 1, f15020a, "Could not execute timer due to OutOfMemory.");
            this.f15022b.mo34457d(b);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo35041a(byte b) {
        Timer timer = this.f15023c.get(Byte.valueOf(b));
        if (timer != null) {
            timer.cancel();
            this.f15023c.remove(Byte.valueOf(b));
        }
    }
}
