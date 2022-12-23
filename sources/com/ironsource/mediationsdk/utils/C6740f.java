package com.ironsource.mediationsdk.utils;

import java.util.Date;

/* renamed from: com.ironsource.mediationsdk.utils.f */
public final class C6740f {

    /* renamed from: a */
    private long f17596a = new Date().getTime();

    /* renamed from: a */
    public static long m20412a(C6740f fVar) {
        if (fVar == null) {
            return 0;
        }
        return new Date().getTime() - fVar.f17596a;
    }
}
