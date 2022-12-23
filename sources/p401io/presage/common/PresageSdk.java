package p401io.presage.common;

import android.content.Context;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p377ed.internal.C10263mq;
import com.ogury.p377ed.internal.C9921cy;
import com.ogury.p377ed.internal.C9930de;

/* renamed from: io.presage.common.PresageSdk */
public final class PresageSdk {

    /* renamed from: a */
    public static final PresageSdk f29803a = new PresageSdk();

    /* renamed from: b */
    private static C9930de f29804b = new C9930de();

    private PresageSdk() {
    }

    public static final void init(Context context, String str) {
        C10263mq.m29882b(context, "context");
        m33344a(new C9921cy(context, str));
    }

    /* renamed from: a */
    public static void m33344a(C9921cy cyVar) {
        C10263mq.m29882b(cyVar, "adsConfig");
        OguryIntegrationLogger.m28105d("[Ads] Setting up...");
        f29804b.mo64459a(cyVar);
    }

    public static final String getAdsSdkVersion() {
        return C9930de.m28680d();
    }

    /* renamed from: a */
    public static boolean m33345a() {
        return f29804b.mo64461a();
    }

    /* renamed from: b */
    public static boolean m33346b() {
        return f29804b.mo64462b();
    }

    /* renamed from: c */
    public static boolean m33347c() {
        return f29804b.mo64463c();
    }

    public final void addSdkInitCallback(PresageSdkInitCallback presageSdkInitCallback) {
        C10263mq.m29882b(presageSdkInitCallback, "presageSdkInitCallback");
        f29804b.mo64460a(presageSdkInitCallback);
    }
}
