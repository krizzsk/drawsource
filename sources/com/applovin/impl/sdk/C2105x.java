package com.applovin.impl.sdk;

import com.applovin.impl.sdk.p049ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.applovin.impl.sdk.x */
class C2105x {

    /* renamed from: a */
    private final Queue<AppLovinAdImpl> f4136a = new LinkedList();

    /* renamed from: b */
    private final Object f4137b = new Object();

    C2105x() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo15020a() {
        int size;
        synchronized (this.f4137b) {
            size = this.f4136a.size();
        }
        return size;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15021a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f4137b) {
            if (mo15020a() <= 25) {
                this.f4136a.offer(appLovinAdImpl);
            } else if (C2102v.m5104a()) {
                C2102v.m5110i("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo15022b() {
        boolean z;
        synchronized (this.f4137b) {
            z = mo15020a() == 0;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public AppLovinAdImpl mo15023c() {
        AppLovinAdImpl poll;
        synchronized (this.f4137b) {
            poll = !mo15022b() ? this.f4136a.poll() : null;
        }
        return poll;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public AppLovinAdImpl mo15024d() {
        AppLovinAdImpl peek;
        synchronized (this.f4137b) {
            peek = this.f4136a.peek();
        }
        return peek;
    }
}
