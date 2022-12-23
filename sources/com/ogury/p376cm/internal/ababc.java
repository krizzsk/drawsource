package com.ogury.p376cm.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.ogury.cm.internal.ababc */
public final class ababc implements abacc {

    /* renamed from: a */
    private final ExecutorService f24308a = Executors.newFixedThreadPool(3);

    /* renamed from: a */
    public final void mo63835a(bbaaa<babcc> bbaaa) {
        bbabc.m28052b(bbaaa, "action");
        this.f24308a.execute(new abaca(bbaaa));
    }
}
