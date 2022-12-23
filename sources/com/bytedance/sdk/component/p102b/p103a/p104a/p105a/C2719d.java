package com.bytedance.sdk.component.p102b.p103a.p104a.p105a;

import com.bytedance.sdk.component.p102b.p103a.C2724b;
import com.bytedance.sdk.component.p102b.p103a.C2735d;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.component.b.a.a.a.d */
/* compiled from: NetDispatcher */
public class C2719d extends C2735d {

    /* renamed from: a */
    private ExecutorService f6051a;

    /* renamed from: b */
    private List<C2724b> f6052b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private List<C2724b> f6053c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private AtomicInteger f6054d = new AtomicInteger(64);

    public C2719d() {
        if (this.f6051a == null) {
            this.f6051a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() {
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    /* renamed from: b */
    public ExecutorService mo17402b() {
        return this.f6051a;
    }

    /* renamed from: a */
    public void mo17401a(int i) {
        this.f6054d.set(i);
    }

    /* renamed from: c */
    public List<C2724b> mo17403c() {
        return this.f6052b;
    }

    /* renamed from: d */
    public List<C2724b> mo17404d() {
        return this.f6053c;
    }

    /* renamed from: a */
    public int mo17400a() {
        return this.f6054d.get();
    }
}
