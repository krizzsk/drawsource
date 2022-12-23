package com.inmobi.media;

import android.content.Context;

/* renamed from: com.inmobi.media.dd */
/* compiled from: MraidJsFetcher */
public class C5910dd {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String f14966c = C5910dd.class.getSimpleName();

    /* renamed from: a */
    public String f14967a;

    /* renamed from: b */
    public C6156ha f14968b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f14969d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f14970e;

    /* renamed from: f */
    private long f14971f;

    public C5910dd(String str, int i, int i2, long j) {
        this.f14967a = str;
        this.f14969d = i;
        this.f14970e = i2;
        this.f14971f = j;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m17583a(C5910dd ddVar) {
        Context c = C6183hw.m18324c();
        if (c != null) {
            if ((System.currentTimeMillis() / 1000) - new C6198if(c, "mraid_js_store").mo35409a() > ddVar.f14971f) {
                return true;
            }
        }
        return false;
    }
}
