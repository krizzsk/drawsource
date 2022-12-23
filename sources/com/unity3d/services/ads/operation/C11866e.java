package com.unity3d.services.ads.operation;

import android.os.ConditionVariable;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.timer.C12125a;
import com.unity3d.services.core.webview.bridge.C12147d;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: com.unity3d.services.ads.operation.e */
/* compiled from: OperationState */
public class C11866e implements C12147d {

    /* renamed from: a */
    private static String f28789a = "";

    /* renamed from: b */
    public String f28790b;

    /* renamed from: c */
    public String f28791c;

    /* renamed from: d */
    public Configuration f28792d;

    /* renamed from: e */
    public ConditionVariable f28793e;

    /* renamed from: f */
    public long f28794f;

    /* renamed from: g */
    public C12125a f28795g;

    public C11866e(String str, Configuration configuration) {
        this.f28791c = str == null ? f28789a : str;
        this.f28792d = configuration;
        this.f28793e = new ConditionVariable();
        this.f28790b = UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public String mo70811a() {
        return this.f28790b;
    }

    /* renamed from: d */
    public long mo70812d() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f28794f);
    }

    /* renamed from: e */
    public void mo70813e() {
        this.f28794f = System.nanoTime();
    }
}
