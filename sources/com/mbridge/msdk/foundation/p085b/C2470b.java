package com.mbridge.msdk.foundation.p085b;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p085b.p086a.C2463a;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* renamed from: com.mbridge.msdk.foundation.b.b */
/* compiled from: FeedbackManager */
public final class C2470b {

    /* renamed from: a */
    public static int f5203a = -2;

    /* renamed from: b */
    public static int f5204b = -2;

    /* renamed from: c */
    public static volatile boolean f5205c = false;

    /* renamed from: d */
    private final ConcurrentHashMap<String, C2463a> f5206d;

    /* renamed from: e */
    private final RelativeLayout.LayoutParams f5207e;

    /* renamed from: f */
    private C2440a f5208f;

    /* renamed from: com.mbridge.msdk.foundation.b.b$a */
    /* compiled from: FeedbackManager */
    static class C2472a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C2470b f5209a = new C2470b();
    }

    private C2470b() {
        this.f5206d = new ConcurrentHashMap<>();
        this.f5207e = new RelativeLayout.LayoutParams(f5203a, f5204b);
    }

    /* renamed from: a */
    public static C2470b m6168a() {
        return C2472a.f5209a;
    }

    /* renamed from: a */
    public final Activity mo16415a(Context context) {
        Activity activity;
        Context c = C8388a.m23845e().mo56907c();
        Activity activity2 = null;
        try {
            Activity activity3 = c instanceof Activity ? (Activity) c : null;
            try {
                if ((context instanceof Activity) && (Build.VERSION.SDK_INT < 17 || !((Activity) context).isDestroyed())) {
                    activity3 = (Activity) context;
                }
                WeakReference<Activity> a = C8388a.m23845e().mo56896a();
                if (a != null && (activity = (Activity) a.get()) != null && !activity.isFinishing() && (Build.VERSION.SDK_INT < 17 || !activity.isDestroyed())) {
                    activity3 = activity;
                }
                if (activity3 == null || activity3.isFinishing()) {
                    return null;
                }
                if (Build.VERSION.SDK_INT < 17 || !activity3.isDestroyed()) {
                    return activity3;
                }
                return null;
            } catch (Exception e) {
                e = e;
                activity2 = activity3;
                e.printStackTrace();
                return activity2;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            return activity2;
        }
    }

    /* renamed from: a */
    private boolean m6169a(Context context, MBFeedBackDialog mBFeedBackDialog) {
        Activity a = mo16415a(context);
        if (a == null || mBFeedBackDialog == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 17 && a.isDestroyed()) {
            return false;
        }
        try {
            if (mBFeedBackDialog.isShowing() || a.isFinishing()) {
                return false;
            }
            mBFeedBackDialog.show();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo16425a(String str, Context context, MBFeedBackDialog mBFeedBackDialog) {
        if (mBFeedBackDialog != null) {
            return m6169a(context, mBFeedBackDialog);
        }
        C8672v.m24876b("", "mbAlertDialog  is null");
        return false;
    }

    /* renamed from: a */
    public final void mo16420a(String str, int i, ViewGroup viewGroup) {
        C2463a a = mo16416a(str);
        if (a.mo16403c() != null) {
            a.mo16396a(i);
            if (i == 0) {
                mo16421a(str, C8388a.m23845e().mo56913g(), viewGroup, (ViewGroup.LayoutParams) null, (C2462a) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo16418a(String str, int i, int i2, int i3, float f, float f2, float f3, String str2, String str3, float f4, JSONArray jSONArray) {
        C2463a a = mo16416a(str);
        Context g = C8388a.m23845e().mo56913g();
        a.mo16397a(C8677z.m24924b(g, f), C8677z.m24924b(g, f2), C8677z.m24924b(g, (float) i), C8677z.m24924b(g, (float) i2), C8677z.m24924b(g, (float) i3), f3, str2, str3, f4, jSONArray);
    }

    /* renamed from: b */
    public final boolean mo16428b() {
        C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
        this.f5208f = b;
        if (b == null) {
            this.f5208f = C2445b.m6020a().mo16285b();
        }
        return this.f5208f.mo16197ao() != 0;
    }

    /* renamed from: a */
    public final void mo16422a(String str, C2462a aVar) {
        C2463a a = mo16416a(str);
        if (aVar != null) {
            a.mo16398a(new C2463a.C2469a(str, aVar));
        }
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16421a(java.lang.String r3, android.content.Context r4, android.view.ViewGroup r5, android.view.ViewGroup.LayoutParams r6, com.mbridge.msdk.foundation.p085b.C2462a r7) {
        /*
            r2 = this;
            boolean r0 = r2.mo16428b()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.mbridge.msdk.foundation.b.a.a r0 = r2.mo16416a((java.lang.String) r3)
            if (r7 == 0) goto L_0x0015
            com.mbridge.msdk.foundation.b.a.a$a r1 = new com.mbridge.msdk.foundation.b.a.a$a
            r1.<init>(r3, r7)
            r0.mo16398a((com.mbridge.msdk.foundation.p085b.p086a.C2463a.C2469a) r1)
        L_0x0015:
            com.mbridge.msdk.widget.FeedBackButton r3 = r0.mo16403c()
            if (r3 == 0) goto L_0x0057
            if (r6 != 0) goto L_0x0032
            com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            android.content.Context r6 = r6.mo56913g()
            r7 = 1092616192(0x41200000, float:10.0)
            int r6 = com.mbridge.msdk.foundation.tools.C8677z.m24924b((android.content.Context) r6, (float) r7)
            android.widget.RelativeLayout$LayoutParams r7 = r2.f5207e
            r7.setMargins(r6, r6, r6, r6)
            android.widget.RelativeLayout$LayoutParams r6 = r2.f5207e
        L_0x0032:
            android.view.ViewParent r7 = r3.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            if (r7 == 0) goto L_0x003d
            r7.removeView(r3)
        L_0x003d:
            android.app.Activity r4 = r2.mo16415a((android.content.Context) r4)
            if (r4 == 0) goto L_0x004f
            if (r5 != 0) goto L_0x004f
            r5 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r4 = r4.findViewById(r5)
            r5 = r4
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
        L_0x004f:
            if (r5 == 0) goto L_0x0057
            r5.removeView(r3)
            r5.addView(r3, r6)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p085b.C2470b.mo16421a(java.lang.String, android.content.Context, android.view.ViewGroup, android.view.ViewGroup$LayoutParams, com.mbridge.msdk.foundation.b.a):void");
    }

    /* renamed from: a */
    public final void mo16417a(String str, int i) {
        C2463a a = mo16416a(str);
        if (i == 1) {
            a.mo16401b();
        } else {
            a.mo16395a();
        }
    }

    /* renamed from: a */
    public final void mo16423a(String str, CampaignEx campaignEx) {
        mo16416a(str).mo16399a(campaignEx);
    }

    /* renamed from: b */
    public final void mo16427b(String str, int i) {
        mo16416a(str).mo16402b(i);
    }

    /* renamed from: c */
    public final void mo16430c(String str, int i) {
        mo16416a(str).mo16404c(i);
    }

    /* renamed from: a */
    public final C2463a mo16416a(String str) {
        C2463a aVar;
        if (TextUtils.isEmpty(str)) {
            str = C8388a.m23845e().mo56914h();
        }
        if (!this.f5206d.containsKey(str)) {
            aVar = new C2463a(str);
            this.f5206d.put(str, aVar);
        } else {
            aVar = this.f5206d.get(str);
        }
        if (aVar != null) {
            return aVar;
        }
        C2463a aVar2 = new C2463a(str);
        this.f5206d.put(str, aVar2);
        return aVar2;
    }

    /* renamed from: a */
    public final void mo16424a(String str, FeedBackButton feedBackButton) {
        mo16416a(str).mo16400a(feedBackButton);
    }

    /* renamed from: b */
    public final FeedBackButton mo16426b(String str) {
        return mo16416a(str).mo16403c();
    }

    /* renamed from: a */
    public final void mo16419a(String str, int i, int i2, String str2) {
        String str3;
        String str4;
        C2463a a = mo16416a(str);
        CampaignEx e = a.mo16406e();
        if (e != null) {
            str3 = e.getCampaignUnitId();
        } else {
            str3 = "";
        }
        int f = a.mo16407f();
        int g = a.mo16408g();
        if (!TextUtils.isEmpty(str2)) {
            str4 = str2;
        } else {
            str4 = "";
        }
        C8598e.m24677a(e, str3, f, g, str4, i, e != null ? e.getAdType() : 0, i2);
    }

    /* renamed from: c */
    public final void mo16429c(String str) {
        C2463a aVar = null;
        try {
            String h = TextUtils.isEmpty(str) ? C8388a.m23845e().mo56914h() : str;
            if (this.f5206d.containsKey(h)) {
                aVar = this.f5206d.get(h);
            }
            if (aVar != null) {
                aVar.mo16405d();
            }
            this.f5206d.remove(str);
            f5205c = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
