package com.mbridge.msdk.mbnative.p336e;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.mbridge.msdk.foundation.tools.C8666t;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.mbnative.controller.C8825b;
import com.mbridge.msdk.mbnative.controller.NativeController;
import com.mbridge.msdk.mbnative.p334c.C8801a;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.mbnative.e.a */
/* compiled from: NativeProvider */
public class C8840a {

    /* renamed from: a */
    private NativeController f21801a;

    /* renamed from: b */
    private Handler f21802b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private C8801a f21803c;

    /* renamed from: d */
    private NativeListener.NativeTrackingListener f21804d;

    /* renamed from: a */
    public final void mo58544a(C8801a aVar) {
        this.f21803c = aVar;
    }

    /* renamed from: a */
    public final void mo58545a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f21804d = nativeTrackingListener;
    }

    public C8840a() {
    }

    public C8840a(C8801a aVar, NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f21803c = aVar;
        this.f21804d = nativeTrackingListener;
    }

    /* renamed from: a */
    public final void mo58541a(Context context, Resources resources, Map<String, Object> map) {
        this.f21801a = new NativeController(this.f21803c, this.f21804d, map, context);
    }

    /* renamed from: a */
    public final void mo58540a() {
        m25515a(0, "");
    }

    /* renamed from: a */
    public final void mo58546a(String str) {
        m25515a(0, str);
    }

    /* renamed from: b */
    public final void mo58547b() {
        m25515a(1, "");
    }

    /* renamed from: d */
    public final void mo58551d() {
        try {
            this.f21801a.mo58490a();
        } catch (Exception unused) {
            C8672v.m24878d("NativeProvider", "release failed");
        }
    }

    /* renamed from: a */
    public final void mo58543a(View view, List<View> list, Campaign campaign) {
        NativeController nativeController = this.f21801a;
        if (nativeController != null) {
            nativeController.mo58493a(campaign, view, list);
        }
    }

    /* renamed from: a */
    public final void mo58542a(View view, Campaign campaign) {
        C8672v.m24876b("NativeProvider", "native provider registerView");
        NativeController nativeController = this.f21801a;
        if (nativeController != null) {
            nativeController.mo58492a(campaign, view);
        }
    }

    /* renamed from: b */
    public final void mo58548b(View view, Campaign campaign) {
        C8672v.m24876b("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.f21801a;
        if (nativeController != null) {
            nativeController.mo58497b(campaign, view);
        }
    }

    /* renamed from: b */
    public final void mo58549b(View view, List<View> list, Campaign campaign) {
        C8672v.m24876b("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.f21801a;
        if (nativeController != null) {
            nativeController.mo58498b(campaign, view, list);
        }
    }

    public static void preload(Map<String, Object> map, int i) {
        C8672v.m24876b("NativeProvider", "native provider preload");
        new C8825b().mo58520a(map, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m25517f() {
        this.f21803c.onAdLoadError("current request is loading");
        this.f21803c.mo58489b();
    }

    /* renamed from: a */
    private void m25515a(int i, String str) {
        if (this.f21801a != null) {
            C8801a aVar = this.f21803c;
            if (aVar == null || !aVar.mo58488a()) {
                C8801a aVar2 = this.f21803c;
                if (aVar2 != null) {
                    aVar2.mo58489b();
                }
                this.f21801a.mo58491a(i, str);
            } else if (C8677z.m24928b()) {
                m25517f();
            } else {
                this.f21802b.post(new Runnable() {
                    public final void run() {
                        C8840a.this.m25517f();
                    }
                });
            }
        }
    }

    /* renamed from: e */
    public final String mo58552e() {
        NativeController nativeController = this.f21801a;
        return nativeController != null ? nativeController.mo58495b() : "";
    }

    /* renamed from: c */
    public final void mo58550c() {
        try {
            C8666t.m24858a();
        } catch (Exception unused) {
            C8672v.m24878d("NativeProvider", "clear cache failed");
        }
    }
}
