package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.C8468m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p305f.C8496a;
import com.mbridge.msdk.foundation.tools.C8660r;

/* renamed from: com.mbridge.msdk.foundation.same.report.c */
/* compiled from: PlayableReportUtils */
public final class C8580c {

    /* renamed from: a */
    private static Handler f21083a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m24604a(CampaignEx campaignEx, String str, String str2, String str3) {
        if (campaignEx != null && campaignEx.isMraid()) {
            int i = 1;
            if (!(!TextUtils.isEmpty(campaignEx.getMraid()))) {
                i = 3;
            }
            C8468m mVar = new C8468m("2000043", i, "0", "", campaignEx.getId(), str2, str, String.valueOf(campaignEx.getKeyIaRst()));
            mVar.mo57846n(campaignEx.getId());
            mVar.mo57840k(campaignEx.getRequestId());
            mVar.mo57842l(campaignEx.getRequestIdNotice());
            mVar.mo57819b(campaignEx.getAdSpaceT());
            mVar.mo57834h(str3);
            mVar.mo57822c(C8660r.m24840o(C8388a.m23845e().mo56913g()));
            mVar.mo57816a(campaignEx.isMraid() ? C8468m.f20702a : C8468m.f20703b);
            m24606a(mVar, str2);
        }
    }

    /* renamed from: a */
    public static void m24606a(C8468m mVar, String str) {
        if (mVar != null) {
            mVar.mo57820b(C8660r.m24832k());
            String d = C8468m.m24200d(mVar);
            if (C8574b.m24577a().mo58054c()) {
                C8574b.m24577a().mo58052a(d);
            } else {
                m24608a(d, C8388a.m23845e().mo56913g(), str);
            }
        }
    }

    /* renamed from: a */
    public static void m24605a(C8468m mVar, Context context, String str) {
        if (mVar != null) {
            mVar.mo57848o("2000060");
            mVar.mo57844m(str);
            mVar.mo57822c(C8660r.m24840o(context));
            String b = C8468m.m24196b(mVar);
            if (C8574b.m24577a().mo58054c()) {
                C8574b.m24577a().mo58052a(b);
            } else {
                m24608a(b, context, str);
            }
        }
    }

    /* renamed from: b */
    public static void m24610b(C8468m mVar, String str) {
        if (mVar != null) {
            mVar.mo57848o("2000059");
            mVar.mo57844m(str);
            mVar.mo57822c(C8660r.m24840o(C8388a.m23845e().mo56913g()));
            mVar.mo57820b(C8660r.m24832k());
            String c = C8468m.m24198c(mVar);
            if (C8574b.m24577a().mo58054c()) {
                C8574b.m24577a().mo58052a(c);
            } else {
                m24608a(c, C8388a.m23845e().mo56913g(), str);
            }
        }
    }

    /* renamed from: a */
    public static void m24608a(String str, Context context, String str2) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            m24607a(new C8496a(str, str2));
        }
    }

    /* renamed from: b */
    public static void m24609b(C8468m mVar, Context context, String str) {
        String g = C8468m.m24206g(mVar);
        if (C8574b.m24577a().mo58054c()) {
            C8574b.m24577a().mo58052a(g);
        } else {
            m24608a(g, context, str);
        }
    }

    /* renamed from: c */
    public static void m24611c(C8468m mVar, Context context, String str) {
        String h = C8468m.m24207h(mVar);
        if (C8574b.m24577a().mo58054c()) {
            C8574b.m24577a().mo58052a(h);
        } else {
            m24608a(h, context, str);
        }
    }

    /* renamed from: d */
    public static void m24612d(C8468m mVar, Context context, String str) {
        if (mVar != null) {
            mVar.mo57848o("2000063");
            mVar.mo57844m(str);
            mVar.mo57822c(C8660r.m24840o(context));
            String a = C8468m.m24194a(mVar);
            if (C8574b.m24577a().mo58054c()) {
                C8574b.m24577a().mo58052a(a);
            } else {
                m24608a(a, context, str);
            }
        }
    }

    /* renamed from: a */
    private static void m24607a(Runnable runnable) {
        Handler handler = f21083a;
        if (handler != null) {
            handler.post(runnable);
        }
    }
}
