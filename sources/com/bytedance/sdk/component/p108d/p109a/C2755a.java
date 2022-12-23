package com.bytedance.sdk.component.p108d.p109a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.component.d.a.a */
/* compiled from: DefaultThreadFactory */
public class C2755a implements ThreadFactory {

    /* renamed from: a */
    private final ThreadGroup f6140a;

    /* renamed from: b */
    private final AtomicInteger f6141b = new AtomicInteger(1);

    public C2755a(String str) {
        this.f6140a = new ThreadGroup("tt_img_" + str);
    }

    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.f6140a;
        Thread thread = new Thread(threadGroup, runnable, "tt_img_" + this.f6141b.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
