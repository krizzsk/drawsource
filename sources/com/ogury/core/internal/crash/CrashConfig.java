package com.ogury.core.internal.crash;

import com.ogury.core.internal.C9717ai;

/* compiled from: CrashConfig.kt */
public final class CrashConfig {

    /* renamed from: a */
    private final int f24613a;

    /* renamed from: b */
    private final int f24614b;
    private final String packageName;
    private final String url;

    public CrashConfig(String str, String str2, int i, int i2) {
        C9717ai.m28145b(str, "url");
        C9717ai.m28145b(str2, "packageName");
        this.url = str;
        this.packageName = str2;
        this.f24613a = i;
        this.f24614b = i2;
    }

    public final int getDeleteAllCrashesFrequency() {
        return this.f24614b;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final int getSendCrashFrequency() {
        return this.f24613a;
    }

    public final String getUrl() {
        return this.url;
    }
}
