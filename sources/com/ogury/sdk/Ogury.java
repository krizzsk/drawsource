package com.ogury.sdk;

import android.content.Context;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.ogury.core.internal.InternalCore;
import com.ogury.core.internal.OguryBroadcastEventBus;
import com.ogury.core.internal.OguryEventBuses;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.core.internal.OguryPersistentMessageEventBus;
import com.ogury.p376cm.internal.InternalCM;
import com.ogury.p377ed.internal.InternalAds;
import com.ogury.sdk.internal.C10347a;
import com.ogury.sdk.internal.C10349c;
import com.ogury.sdk.internal.C10350d;
import com.ogury.sdk.internal.C10354f;
import com.ogury.sdk.internal.C10355g;
import com.ogury.sdk.internal.C10356h;
import com.ogury.sdk.internal.C10358i;
import com.ogury.sdk.internal.C10361k;
import com.ogury.sdk.internal.C10363m;

/* compiled from: Ogury.kt */
public final class Ogury {
    public static final Ogury INSTANCE = new Ogury();

    /* renamed from: a */
    private static OguryEventBuses f25682a;

    public static final String getSdkVersion() {
        return "5.3.0";
    }

    private Ogury() {
    }

    public static final synchronized void start(OguryConfiguration oguryConfiguration) {
        synchronized (Ogury.class) {
            C10363m.m30060b(oguryConfiguration, "configuration");
            OguryIntegrationLogger.m28105d("[Ogury] Starting Ogury SDK " + getSdkVersion() + APSSharedUtil.TRUNCATE_SEPARATOR);
            Context applicationContext = oguryConfiguration.getContext().getApplicationContext();
            if (f25682a == null) {
                f25682a = new OguryEventBuses(new OguryPersistentMessageEventBus(), new OguryBroadcastEventBus());
            }
            OguryIntegrationLogger.m28105d("[Ogury] Starting modules...");
            boolean z = false;
            if (!m30034a()) {
                C10363m.m30058a((Object) applicationContext, "appContext");
                if ((applicationContext.getApplicationInfo().flags & 2) != 0) {
                    z = true;
                }
                if (z) {
                    throw new OguryIntegrationException("Core module is missing!");
                }
                return;
            }
            C10363m.m30058a((Object) applicationContext, "appContext");
            OguryEventBuses oguryEventBuses = f25682a;
            try {
                String version = InternalCM.getVersion();
                OguryIntegrationLogger.m28105d("[Ogury] Starting Consent module " + version + APSSharedUtil.TRUNCATE_SEPARATOR);
                InternalCM.start(applicationContext, oguryConfiguration.getAssetKey(), oguryEventBuses);
                if (!C10363m.m30059a((Object) version, (Object) "3.3.0")) {
                    OguryIntegrationLogger.m28108i("[Ogury] Unexpected CM version: " + version + " (3.3.0 expected)");
                }
            } catch (NoClassDefFoundError unused) {
                OguryIntegrationLogger.m28108i("[Ogury] Consent module missing!");
            } catch (Throwable th) {
                OguryIntegrationLogger.m28107e(th);
            }
            OguryEventBuses oguryEventBuses2 = f25682a;
            try {
                String version2 = InternalAds.getVersion();
                OguryIntegrationLogger.m28105d("[Ogury] Starting Ads module " + version2 + APSSharedUtil.TRUNCATE_SEPARATOR);
                InternalAds.start(applicationContext, oguryConfiguration.getAssetKey(), oguryEventBuses2);
                if (!C10363m.m30059a((Object) version2, (Object) "4.2.0")) {
                    OguryIntegrationLogger.m28108i("[Ogury] Unexpected Ads version: " + version2 + " (4.2.0 expected)");
                }
            } catch (NoClassDefFoundError unused2) {
                OguryIntegrationLogger.m28108i("[Ogury] Ads module missing!");
            } catch (Throwable th2) {
                OguryIntegrationLogger.m28107e(th2);
            }
            OguryIntegrationLogger.m28105d("[Ogury] Ogury SDK is started");
            OguryIntegrationLogger.m28105d("[Ogury] Checking environment...");
            try {
                C10354f fVar = new C10354f(oguryConfiguration);
                OguryIntegrationLogger.m28105d("[Ogury][environment] Package name: " + fVar.mo65204c() + " ; version name: " + fVar.mo65205d() + " ; asset key: " + fVar.mo65203a() + " ; environment: " + C10354f.m30045b());
                C10355g gVar = new C10355g(new C10347a());
                new C10349c(new C10350d(fVar), new C10358i(new C10361k(oguryConfiguration.getContext()), gVar), new C10356h(fVar, gVar)).execute(new Object[0]);
            } catch (Exception e) {
                OguryIntegrationLogger.m28107e((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    private static boolean m30034a() {
        try {
            String version = InternalCore.getVersion();
            OguryIntegrationLogger.m28105d("[Ogury] Core module " + version + " detected");
            if (!C10363m.m30059a((Object) version, (Object) "1.1.0")) {
                OguryIntegrationLogger.m28108i("[Ogury] Unexpected Core version: " + version + " (1.1.0 expected)");
            }
            return true;
        } catch (NoClassDefFoundError unused) {
            OguryIntegrationLogger.m28106e("[Ogury] Core module is missing!");
            return false;
        } catch (Throwable th) {
            OguryIntegrationLogger.m28107e(th);
            return false;
        }
    }

    public static final void applyChildPrivacy(int i) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3 = null;
        if (i == 1) {
            bool2 = Boolean.FALSE;
        } else if (i != 2) {
            if (i != 4) {
                bool = i != 8 ? null : Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            InternalCM.setChildUnderCoppaTreatment(bool3);
            InternalCM.setUnderAgeOfGdprConsentTreatment(bool);
            InternalAds.setChildUnderCoppaTreatment(bool3);
            InternalAds.setUnderAgeOfGdprConsentTreatment(bool);
        } else {
            bool2 = Boolean.TRUE;
        }
        bool3 = bool2;
        bool = null;
        InternalCM.setChildUnderCoppaTreatment(bool3);
        InternalCM.setUnderAgeOfGdprConsentTreatment(bool);
        InternalAds.setChildUnderCoppaTreatment(bool3);
        InternalAds.setUnderAgeOfGdprConsentTreatment(bool);
    }
}
