package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.bl */
/* compiled from: Click */
public final class C5818bl {

    /* renamed from: a */
    int f14629a;

    /* renamed from: b */
    public String f14630b;

    /* renamed from: c */
    public Map<String, String> f14631c;

    /* renamed from: d */
    long f14632d;

    /* renamed from: e */
    long f14633e;

    /* renamed from: f */
    int f14634f;

    /* renamed from: g */
    AtomicBoolean f14635g;

    /* renamed from: h */
    boolean f14636h;

    /* renamed from: i */
    boolean f14637i;

    C5818bl(String str, boolean z, boolean z2, int i) {
        this(new Random().nextInt() & Integer.MAX_VALUE, str, new HashMap(), z, z2, i, System.currentTimeMillis(), System.currentTimeMillis());
    }

    C5818bl(String str, Map<String, String> map, boolean z, int i) {
        this(new Random().nextInt() & Integer.MAX_VALUE, str, map, z, false, i, System.currentTimeMillis(), System.currentTimeMillis());
    }

    C5818bl(int i, String str, Map<String, String> map, boolean z, boolean z2, int i2, long j, long j2) {
        this.f14629a = i;
        this.f14630b = str;
        this.f14631c = map;
        this.f14632d = j;
        this.f14633e = j2;
        this.f14634f = i2;
        this.f14635g = new AtomicBoolean(false);
        this.f14637i = z;
        this.f14636h = z2;
    }

    /* renamed from: a */
    public final boolean mo34788a(long j) {
        return System.currentTimeMillis() - this.f14633e > j * 1000;
    }
}
