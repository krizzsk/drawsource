package com.inmobi.media;

import android.util.SparseArray;
import com.inmobi.media.C6094fv;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.hy */
/* compiled from: AdExecutorService */
public class C6185hy {

    /* renamed from: b */
    private static final String f15613b = C6185hy.class.getSimpleName();

    /* renamed from: a */
    public SparseArray<Queue<C5727ah>> f15614a;

    /* renamed from: c */
    private final ExecutorService f15615c;

    /* renamed from: d */
    private byte f15616d;

    /* renamed from: com.inmobi.media.hy$a */
    /* compiled from: AdExecutorService */
    static class C6186a {

        /* renamed from: a */
        static final C6185hy f15617a = new C6185hy((byte) 0);
    }

    /* synthetic */ C6185hy(byte b) {
        this();
    }

    private C6185hy() {
        this.f15616d = -1;
        this.f15614a = new SparseArray<>();
        C6074ft ftVar = (C6074ft) C6094fv.m18084a(CampaignUnit.JSON_KEY_ADS, C6183hw.m18332f(), (C6094fv.C6097c) null);
        int i = ftVar.maxPoolSize;
        int i2 = ftVar.maxPoolSize;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i2, 5, timeUnit, linkedBlockingQueue, new C6194ib(f15613b + "-AD"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f15615c = threadPoolExecutor;
    }

    /* renamed from: a */
    public static C6185hy m18355a() {
        return C6186a.f15617a;
    }

    /* renamed from: a */
    public final void mo35396a(int i, C5727ah ahVar) {
        Queue queue = this.f15614a.get(i);
        if (queue == null) {
            queue = new LinkedList();
            this.f15614a.put(i, queue);
        }
        queue.add(ahVar);
        C5727ah ahVar2 = (C5727ah) queue.peek();
        if (queue.size() == 1 && ahVar2 != null) {
            mo35397a(ahVar2);
        }
    }

    /* renamed from: a */
    public final void mo35397a(C5727ah ahVar) {
        try {
            this.f15615c.execute(ahVar);
        } catch (OutOfMemoryError unused) {
            ahVar.mo34373b();
        }
    }

    /* renamed from: a */
    public final void mo35395a(int i) {
        this.f15614a.remove(i);
        this.f15614a.size();
    }
}
