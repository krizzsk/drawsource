package com.bytedance.sdk.openadsdk.component.reward.p142b;

import android.app.Activity;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.p141a.C3223c;
import com.bytedance.sdk.openadsdk.component.reward.view.C3322d;
import com.bytedance.sdk.openadsdk.core.p144b.C3365e;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.b.a */
/* compiled from: RewardFullAdType */
public abstract class C3255a {

    /* renamed from: a */
    protected Activity f7710a;

    /* renamed from: b */
    protected C3431n f7711b;

    /* renamed from: c */
    protected int f7712c;

    /* renamed from: d */
    protected int f7713d;

    /* renamed from: e */
    protected int f7714e;

    /* renamed from: f */
    protected float f7715f;

    /* renamed from: g */
    protected String f7716g;

    /* renamed from: h */
    protected C3365e f7717h;

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.b.a$a */
    /* compiled from: RewardFullAdType */
    public interface C3256a {
        /* renamed from: a */
        void mo19088a(boolean z);
    }

    /* renamed from: a */
    public C3256a mo19079a() {
        return null;
    }

    /* renamed from: a */
    public abstract void mo19082a(FrameLayout frameLayout);

    /* renamed from: a */
    public abstract void mo19083a(C3223c cVar, C3322d dVar);

    /* renamed from: b */
    public abstract boolean mo19086b();

    /* renamed from: c */
    public abstract boolean mo19087c();

    public C3255a(Activity activity, C3431n nVar, int i, int i2) {
        this.f7710a = activity;
        this.f7711b = nVar;
        this.f7712c = i;
        this.f7713d = i2;
    }

    /* renamed from: a */
    public final void mo19081a(int i) {
        this.f7714e = i;
    }

    /* renamed from: a */
    public final void mo19080a(float f) {
        this.f7715f = f;
    }

    /* renamed from: a */
    public final void mo19085a(String str) {
        this.f7716g = str;
    }

    /* renamed from: a */
    public final void mo19084a(C3365e eVar) {
        this.f7717h = eVar;
    }
}
