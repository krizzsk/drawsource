package com.inmobi.unifiedId;

import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.media.C6168hl;
import com.inmobi.media.C6183hw;
import com.inmobi.media.C6221ip;
import com.inmobi.media.C6271js;
import com.inmobi.media.C6272jt;
import com.inmobi.media.C6273ju;
import com.inmobi.media.C6275jv;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class InMobiUnifiedIdService {

    /* renamed from: a */
    private static final String f16036a = InMobiUnifiedIdService.class.getSimpleName();

    /* renamed from: b */
    private static final AtomicBoolean f16037b = new AtomicBoolean();

    private InMobiUnifiedIdService() {
    }

    public static AtomicBoolean getIsPushCalled() {
        return f16037b;
    }

    public static void push(final InMobiUserDataModel inMobiUserDataModel) {
        if (C6183hw.m18318a()) {
            C6183hw.m18316a((Runnable) new Runnable() {
                public final void run() {
                    InMobiUnifiedIdService.m18960a(InMobiUserDataModel.this);
                }
            });
            return;
        }
        throw new SdkNotInitializedException(f16036a);
    }

    public static void fetchUnifiedIds(final InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        if (C6183hw.m18318a()) {
            C6183hw.m18316a((Runnable) new Runnable() {
                public final void run() {
                    InMobiUnifiedIdService.m18959a(InMobiUnifiedIdInterface.this);
                }
            });
            return;
        }
        throw new SdkNotInitializedException(f16036a);
    }

    /* renamed from: a */
    public static void m18959a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        C6168hl.m18270a().mo35377a("FetchApiInvoked", (Map<String, Object>) new HashMap());
        if (C6273ju.m18665c()) {
            C6273ju.m18660a(inMobiUnifiedIdInterface, (JSONObject) null, new Error(InMobiUnifiedIdInterface.UNIFIED_SERVICE_IS_NOT_ENABLED));
        } else if (C6273ju.m18662b()) {
            C6273ju.m18660a(inMobiUnifiedIdInterface, (JSONObject) null, new Error(InMobiUnifiedIdInterface.USER_HAS_OPTED_OUT));
        } else if (C6221ip.m18478b()) {
            C6273ju.m18660a(inMobiUnifiedIdInterface, (JSONObject) null, new Error(InMobiUnifiedIdInterface.USER_HAS_AGE_RESTRICTION));
        } else {
            synchronized (C6275jv.class) {
                if (C6275jv.m18670c()) {
                    C6275jv.m18668a(inMobiUnifiedIdInterface);
                } else {
                    JSONObject a = C6272jt.m18651a();
                    if (!C6273ju.m18663b(a) && C6273ju.m18661a(a)) {
                        C6275jv.m18668a(inMobiUnifiedIdInterface);
                    } else if (inMobiUnifiedIdInterface != null) {
                        if (!C6273ju.m18663b(a)) {
                            C6273ju.m18660a(inMobiUnifiedIdInterface, a, (Error) null);
                        } else if (f16037b.get()) {
                            C6275jv.m18668a(inMobiUnifiedIdInterface);
                        } else {
                            C6273ju.m18660a(inMobiUnifiedIdInterface, (JSONObject) null, new Error(InMobiUnifiedIdInterface.PUSH_NEEDS_TO_BE_CALLED_FIRST));
                        }
                    }
                }
            }
        }
    }

    public static void reset() {
        if (C6183hw.m18318a()) {
            C6183hw.m18316a((Runnable) new Runnable() {
                public final void run() {
                    InMobiUnifiedIdService.m18958a();
                }
            });
            return;
        }
        throw new SdkNotInitializedException(f16036a);
    }

    /* renamed from: a */
    static /* synthetic */ void m18960a(InMobiUserDataModel inMobiUserDataModel) {
        if (!C6273ju.m18665c() && !C6273ju.m18662b() && !C6221ip.m18478b()) {
            if (!C6271js.m18649b(inMobiUserDataModel) || !f16037b.get()) {
                C6271js.m18647a(inMobiUserDataModel);
                f16037b.set(true);
                C6275jv.m18667a();
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m18958a() {
        f16037b.set(false);
        C6271js.m18647a((InMobiUserDataModel) null);
        C6275jv.m18669b();
        C6272jt.m18656d();
    }
}
