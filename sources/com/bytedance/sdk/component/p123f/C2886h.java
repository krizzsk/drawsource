package com.bytedance.sdk.component.p123f;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.sdk.component.f.h */
/* compiled from: TTThreadFactory */
public class C2886h implements ThreadFactory {

    /* renamed from: a */
    private final ThreadGroup f6498a;

    /* renamed from: b */
    private final String f6499b;

    /* renamed from: c */
    private int f6500c;

    public C2886h(int i, String str) {
        this.f6500c = i;
        this.f6498a = new ThreadGroup("csj_g_" + str);
        this.f6499b = "csj_" + str;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f6498a, runnable, this.f6499b);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        int i = this.f6500c;
        if (i > 10 || i < 1) {
            this.f6500c = 5;
        }
        thread.setPriority(this.f6500c);
        return thread;
    }
}
