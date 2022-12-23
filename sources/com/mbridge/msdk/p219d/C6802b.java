package com.mbridge.msdk.p219d;

import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.p219d.C6798a;

/* renamed from: com.mbridge.msdk.d.b */
/* compiled from: TimerController */
public class C6802b {

    /* renamed from: com.mbridge.msdk.d.b$a */
    /* compiled from: TimerController */
    static class C6804a {

        /* renamed from: a */
        static C6802b f17976a = new C6802b();
    }

    private C6802b() {
    }

    public static C6802b getInstance() {
        return C6804a.f17976a;
    }

    public void start() {
        C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
        if (b == null) {
            b = C2445b.m6020a().mo16285b();
        }
        int e = b.mo16223e();
        if (e > 0) {
            C6798a.C6801a.f17975a.mo37112a((long) (e * 1000));
        }
    }

    public void addRewardList(String str, String str2) {
        C6798a.C6801a.f17975a.mo37113a(str, str2);
    }

    public void addInterstitialList(String str, String str2) {
        C6798a.C6801a.f17975a.mo37114b(str, str2);
    }
}
