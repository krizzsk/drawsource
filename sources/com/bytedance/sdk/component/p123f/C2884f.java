package com.bytedance.sdk.component.p123f;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.bytedance.sdk.component.f.f */
/* compiled from: TTFutureTask */
public class C2884f<V> extends FutureTask<V> implements Comparable<C2884f<V>> {

    /* renamed from: a */
    private int f6494a;

    /* renamed from: b */
    private int f6495b;

    public C2884f(Callable<V> callable, int i, int i2) {
        super(callable);
        this.f6494a = i == -1 ? 5 : i;
        this.f6495b = i2;
    }

    public C2884f(Runnable runnable, V v, int i, int i2) {
        super(runnable, v);
        this.f6494a = i == -1 ? 5 : i;
        this.f6495b = i2;
    }

    /* renamed from: a */
    public int compareTo(C2884f fVar) {
        if (mo17795a() < fVar.mo17795a()) {
            return 1;
        }
        return mo17795a() > fVar.mo17795a() ? -1 : 0;
    }

    /* renamed from: a */
    public int mo17795a() {
        return this.f6494a;
    }
}
