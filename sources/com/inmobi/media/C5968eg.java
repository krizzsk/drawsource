package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.C5953dz;
import java.util.Map;

/* renamed from: com.inmobi.media.eg */
/* compiled from: InMobiTrackedHtmlAd */
public class C5968eg extends C5953dz {

    /* renamed from: d */
    private static final String f15120d = C5968eg.class.getSimpleName();

    /* renamed from: e */
    private final C5953dz f15121e;

    /* renamed from: f */
    private final C5963ef f15122f;

    /* renamed from: g */
    private final int f15123g;

    /* renamed from: h */
    private final int f15124h;

    /* renamed from: a */
    public final void mo35069a(byte b) {
    }

    public C5968eg(C6234j jVar, C5963ef efVar, C5953dz dzVar, int i, int i2) {
        super(jVar);
        this.f15121e = dzVar;
        this.f15122f = efVar;
        this.f15123g = i;
        this.f15124h = i2;
    }

    /* renamed from: a */
    public final C5953dz.C5954a mo35068a() {
        return this.f15121e.mo35068a();
    }

    /* renamed from: b */
    public final View mo35073b() {
        return this.f15121e.mo35073b();
    }

    /* renamed from: c */
    public final View mo35074c() {
        return this.f15121e.mo35074c();
    }

    /* renamed from: a */
    public final void mo35070a(Context context, byte b) {
        if (b == 0) {
            this.f15122f.mo35092b();
        } else if (b == 1) {
            this.f15122f.mo35088a();
        } else if (b == 2) {
            try {
                this.f15122f.mo35094d();
            } catch (Exception e) {
                C6130gj.m18161a().mo35310a(new C6167hk(e));
            } catch (Throwable th) {
                this.f15121e.mo35070a(context, b);
                throw th;
            }
        }
        this.f15121e.mo35070a(context, b);
    }

    /* renamed from: e */
    public final void mo35076e() {
        this.f15122f.mo35094d();
        super.mo35076e();
    }

    /* renamed from: a */
    public final View mo35067a(View view, ViewGroup viewGroup, boolean z) {
        View b = this.f15121e.mo35073b();
        if (b != null) {
            this.f15122f.mo35089a(b);
        }
        return this.f15121e.mo35067a(view, viewGroup, z);
    }

    /* renamed from: a */
    public final void mo35072a(Map<View, FriendlyObstructionPurpose> map) {
        View b = this.f15121e.mo35073b();
        if (b != null) {
            this.f15122f.mo35090a(b, b, this.f15123g, this.f15124h);
            this.f15121e.mo35072a(map);
        }
    }

    /* renamed from: d */
    public final void mo35075d() {
        View b = this.f15121e.mo35073b();
        if (b != null) {
            this.f15122f.mo35089a(b);
            this.f15121e.mo35075d();
        }
    }
}
