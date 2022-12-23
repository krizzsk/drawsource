package com.inmobi.media;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.inmobi.media.ib */
/* compiled from: InMobiThreadFactory */
public final class C6194ib implements ThreadFactory {

    /* renamed from: a */
    private String f15639a;

    public C6194ib(String str) {
        this.f15639a = "TIM-".concat(String.valueOf(str));
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f15639a);
    }
}
