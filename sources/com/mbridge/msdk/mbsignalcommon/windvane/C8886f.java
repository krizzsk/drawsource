package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import com.mbridge.msdk.mbsignalcommon.base.C8860e;
import java.util.HashMap;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.f */
/* compiled from: WindVaneApiManager */
public final class C8886f {

    /* renamed from: a */
    private static HashMap<String, Class> f21902a = new HashMap<>();

    /* renamed from: b */
    private Context f21903b;

    /* renamed from: c */
    private Object f21904c;

    /* renamed from: d */
    private WindVaneWebView f21905d;

    public C8886f(Context context, WindVaneWebView windVaneWebView) {
        this.f21903b = context;
        this.f21905d = windVaneWebView;
        try {
            mo58685a(C8860e.f21830a, Class.forName("com.mbridge.msdk.interstitial.signalcommon.interstitial"));
        } catch (ClassNotFoundException unused) {
        }
        try {
            mo58685a(C8860e.f21831b, Class.forName("com.mbridge.msdk.video.signal.communication.RewardSignal"));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            mo58685a(C8860e.f21832c, Class.forName("com.mbridge.msdk.video.signal.communication.VideoCommunication"));
        } catch (ClassNotFoundException unused3) {
        }
        try {
            mo58685a(C8860e.f21833d, Class.forName("com.mbridge.msdk.interactiveads.signalcommon.Interactive"));
        } catch (ClassNotFoundException unused4) {
        }
        try {
            mo58685a(C8860e.f21834e, Class.forName("com.mbridge.msdk.mbsignalcommon.mraid.MraidSignalCommunication"));
        } catch (ClassNotFoundException unused5) {
        }
        try {
            mo58685a(C8860e.f21835f, Class.forName("com.mbridge.msdk.mbsignalcommon.communication.BannerSignalPlugin"));
        } catch (ClassNotFoundException unused6) {
        }
        try {
            mo58685a(C8860e.f21836g, Class.forName("com.mbridge.msdk.splash.signal.SplashSignal"));
        } catch (ClassNotFoundException unused7) {
        }
        try {
            mo58685a(C8860e.f21837h, Class.forName("com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebGLCheckSignal"));
        } catch (ClassNotFoundException unused8) {
        }
    }

    /* renamed from: a */
    public final void mo58683a(Context context) {
        this.f21903b = context;
    }

    /* renamed from: a */
    public final void mo58684a(Object obj) {
        this.f21904c = obj;
    }

    /* renamed from: a */
    private Object m25664a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f21902a.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!C8888h.class.isAssignableFrom(cls)) {
                return null;
            }
            C8888h hVar = (C8888h) cls.newInstance();
            hVar.initialize(context, windVaneWebView);
            hVar.initialize(this.f21904c, windVaneWebView);
            return hVar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo58685a(String str, Class cls) {
        if (f21902a == null) {
            f21902a = new HashMap<>();
        }
        f21902a.put(str, cls);
    }

    /* renamed from: a */
    public final Object mo58682a(String str) {
        if (f21902a == null) {
            f21902a = new HashMap<>();
        }
        return m25664a(str, this.f21905d, this.f21903b);
    }
}
