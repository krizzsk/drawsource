package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.inmobi.media.ay */
/* compiled from: AdAssetBatch */
public final class C5786ay {

    /* renamed from: a */
    public List<C5784ax> f14540a = new ArrayList();

    /* renamed from: b */
    Set<C5841bq> f14541b;

    /* renamed from: c */
    Set<String> f14542c = new HashSet();

    /* renamed from: d */
    int f14543d;

    /* renamed from: e */
    int f14544e;

    /* renamed from: f */
    public String f14545f;

    /* renamed from: g */
    public String f14546g;

    /* renamed from: h */
    private String f14547h;

    /* renamed from: i */
    private String f14548i;

    /* renamed from: j */
    private final WeakReference<C5816bj> f14549j;

    public C5786ay(String str, String str2, Set<C5841bq> set, C5816bj bjVar) {
        this.f14547h = str;
        this.f14548i = str2;
        this.f14541b = set;
        this.f14549j = new WeakReference<>(bjVar);
    }

    public C5786ay(String str, Set<C5841bq> set, C5816bj bjVar, String str2) {
        this.f14547h = str;
        this.f14546g = str2;
        this.f14541b = set;
        this.f14549j = new WeakReference<>(bjVar);
    }

    /* renamed from: a */
    public final C5816bj mo34700a() {
        return (C5816bj) this.f14549j.get();
    }

    public final String toString() {
        return "AdAssetBatch{mRawAssets=" + this.f14541b + ", mBatchDownloadSuccessCount=" + this.f14543d + ", mBatchDownloadFailureCount=" + this.f14544e + '}';
    }
}
