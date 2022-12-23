package com.applovin.impl.sdk.p053e;

import com.applovin.impl.sdk.C1969m;

/* renamed from: com.applovin.impl.sdk.e.z */
public class C1944z extends C1887a {

    /* renamed from: a */
    private final Runnable f3614a;

    public C1944z(C1969m mVar, Runnable runnable) {
        this(mVar, false, runnable);
    }

    public C1944z(C1969m mVar, boolean z, Runnable runnable) {
        super("TaskRunnable", mVar, z);
        this.f3614a = runnable;
    }

    public void run() {
        this.f3614a.run();
    }
}
