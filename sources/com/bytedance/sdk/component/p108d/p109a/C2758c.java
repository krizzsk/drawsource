package com.bytedance.sdk.component.p108d.p109a;

import com.smaato.sdk.core.injections.CoreLightModuleInterface;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.d.a.c */
/* compiled from: ThreadPoolFactory */
public class C2758c {

    /* renamed from: a */
    private static final TimeUnit f6143a = TimeUnit.SECONDS;

    /* renamed from: a */
    public static ExecutorService m7516a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30, f6143a, new LinkedBlockingQueue(), new C2755a(CoreLightModuleInterface.NAME_DEFAULT_HTTP_HANDLER));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
