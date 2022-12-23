package com.adcolony.sdk;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.q0 */
class C0951q0<T> {

    /* renamed from: a */
    private final List<Callable<T>> f735a = new ArrayList();

    /* renamed from: b */
    private boolean f736b = false;

    /* renamed from: com.adcolony.sdk.q0$a */
    interface C0952a<T> extends Callable<T> {
        /* renamed from: a */
        T mo11077a();
    }

    C0951q0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11075a(Callable<T> callable) {
        if (!this.f736b) {
            this.f735a.add(callable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo11076b() {
        return this.f735a.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<T> mo11073a() {
        return mo11074a(-1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<T> mo11074a(long j) {
        List<Future<T>> list;
        this.f736b = true;
        ArrayList arrayList = new ArrayList();
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(this.f735a.size());
        ArrayList arrayList2 = new ArrayList();
        if (j > 0) {
            try {
                list = newFixedThreadPool.invokeAll(this.f735a, j, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
        } else {
            list = newFixedThreadPool.invokeAll(this.f735a);
        }
        arrayList2.addAll(list);
        newFixedThreadPool.shutdownNow();
        for (int i = 0; i < arrayList2.size(); i++) {
            Future future = (Future) arrayList2.get(i);
            if (!future.isCancelled()) {
                try {
                    arrayList.add(future.get());
                } catch (Exception unused2) {
                }
            } else if (this.f735a.get(i) instanceof C0952a) {
                arrayList.add(((C0952a) this.f735a.get(i)).mo11077a());
            }
        }
        return arrayList;
    }
}
