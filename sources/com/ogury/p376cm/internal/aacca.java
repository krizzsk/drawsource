package com.ogury.p376cm.internal;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.ogury.cm.internal.aacca */
public abstract class aacca {

    /* renamed from: a */
    private final aacbc f24279a;

    public aacca(aacbc aacbc) {
        bbabc.m28052b(aacbc, "requestScheduler");
        this.f24279a = aacbc;
    }

    /* renamed from: a */
    public final aacbc mo63821a() {
        return this.f24279a;
    }

    /* renamed from: a */
    public abstract void mo63822a(Context context, acabc acabc, CountDownLatch countDownLatch);
}
