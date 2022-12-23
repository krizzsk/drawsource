package com.bytedance.sdk.openadsdk.core;

import com.bykv.p054vk.openvk.component.video.api.p072d.C2405c;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.com.bytedance.overseas.sdk.p185a.C3968c;

/* renamed from: com.bytedance.sdk.openadsdk.core.t */
/* compiled from: SingleAppData */
public class C3580t {

    /* renamed from: a */
    private static C3580t f9040a;

    /* renamed from: b */
    private C2405c f9041b;

    /* renamed from: c */
    private boolean f9042c = true;

    /* renamed from: d */
    private C3431n f9043d;

    /* renamed from: e */
    private TTRewardVideoAd.RewardAdInteractionListener f9044e;

    /* renamed from: f */
    private C3968c f9045f;

    /* renamed from: g */
    private TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f9046g;

    /* renamed from: h */
    private TTAppOpenAd.AppOpenAdInteractionListener f9047h;

    /* renamed from: i */
    private boolean f9048i = false;

    private C3580t() {
    }

    /* renamed from: a */
    public static C3580t m11322a() {
        if (f9040a == null) {
            f9040a = new C3580t();
        }
        return f9040a;
    }

    /* renamed from: a */
    public void mo20132a(boolean z) {
        this.f9042c = z;
    }

    /* renamed from: b */
    public boolean mo20134b() {
        return this.f9042c;
    }

    /* renamed from: c */
    public C3431n mo20135c() {
        return this.f9043d;
    }

    /* renamed from: a */
    public void mo20130a(C3431n nVar) {
        this.f9043d = nVar;
    }

    /* renamed from: d */
    public TTRewardVideoAd.RewardAdInteractionListener mo20136d() {
        return this.f9044e;
    }

    /* renamed from: e */
    public TTFullScreenVideoAd.FullScreenVideoAdInteractionListener mo20137e() {
        return this.f9046g;
    }

    /* renamed from: f */
    public TTAppOpenAd.AppOpenAdInteractionListener mo20138f() {
        return this.f9047h;
    }

    /* renamed from: a */
    public void mo20128a(TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener) {
        this.f9046g = fullScreenVideoAdInteractionListener;
    }

    /* renamed from: a */
    public void mo20129a(TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        this.f9044e = rewardAdInteractionListener;
    }

    /* renamed from: a */
    public void mo20127a(TTAppOpenAd.AppOpenAdInteractionListener appOpenAdInteractionListener) {
        this.f9047h = appOpenAdInteractionListener;
    }

    /* renamed from: g */
    public C3968c mo20139g() {
        return this.f9045f;
    }

    /* renamed from: a */
    public void mo20131a(C3968c cVar) {
        this.f9045f = cVar;
    }

    /* renamed from: b */
    public void mo20133b(boolean z) {
        this.f9048i = z;
    }

    /* renamed from: h */
    public void mo20140h() {
        this.f9041b = null;
        this.f9043d = null;
        this.f9044e = null;
        this.f9046g = null;
        this.f9047h = null;
        this.f9045f = null;
        this.f9048i = false;
        this.f9042c = true;
    }
}
