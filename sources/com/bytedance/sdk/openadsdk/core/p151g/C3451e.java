package com.bytedance.sdk.openadsdk.core.p151g;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.sdk.openadsdk.core.g.e */
/* compiled from: PermissionsResultAction */
public abstract class C3451e {

    /* renamed from: a */
    private static final String f8505a = C3451e.class.getSimpleName();

    /* renamed from: b */
    private final Set<String> f8506b = new HashSet(1);

    /* renamed from: c */
    private Looper f8507c = Looper.getMainLooper();

    /* renamed from: a */
    public abstract void mo18421a();

    /* renamed from: a */
    public abstract void mo18422a(String str);

    /* renamed from: b */
    public synchronized boolean mo19738b(String str) {
        String str2 = f8505a;
        Log.d(str2, "Permission not found: " + str);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized boolean mo19736a(String str, int i) {
        if (i == 0) {
            return mo19737a(str, C3449c.GRANTED);
        }
        return mo19737a(str, C3449c.DENIED);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.g.e$5 */
    /* compiled from: PermissionsResultAction */
    static /* synthetic */ class C34565 {

        /* renamed from: a */
        static final /* synthetic */ int[] f8514a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.sdk.openadsdk.core.g.c[] r0 = com.bytedance.sdk.openadsdk.core.p151g.C3449c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8514a = r0
                com.bytedance.sdk.openadsdk.core.g.c r1 = com.bytedance.sdk.openadsdk.core.p151g.C3449c.GRANTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8514a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.sdk.openadsdk.core.g.c r1 = com.bytedance.sdk.openadsdk.core.p151g.C3449c.DENIED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8514a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.sdk.openadsdk.core.g.c r1 = com.bytedance.sdk.openadsdk.core.p151g.C3449c.NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p151g.C3451e.C34565.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized boolean mo19737a(final String str, C3449c cVar) {
        this.f8506b.remove(str);
        int i = C34565.f8514a[cVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                new Handler(this.f8507c).post(new Runnable() {
                    public void run() {
                        C3451e.this.mo18422a(str);
                    }
                });
                return true;
            } else if (i == 3) {
                if (!mo19738b(str)) {
                    new Handler(this.f8507c).post(new Runnable() {
                        public void run() {
                            C3451e.this.mo18422a(str);
                        }
                    });
                    return true;
                } else if (this.f8506b.isEmpty()) {
                    new Handler(this.f8507c).post(new Runnable() {
                        public void run() {
                            C3451e.this.mo18421a();
                        }
                    });
                    return true;
                }
            }
        } else if (this.f8506b.isEmpty()) {
            new Handler(this.f8507c).post(new Runnable() {
                public void run() {
                    C3451e.this.mo18421a();
                }
            });
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo19735a(String[] strArr) {
        Collections.addAll(this.f8506b, strArr);
    }
}
