package com.ogury.core.internal.crash;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.ogury.core.internal.C9714af;
import com.ogury.core.internal.C9717ai;
import com.ogury.core.internal.C9776h;
import com.tapjoy.TapjoyConstants;
import org.json.JSONObject;

/* renamed from: com.ogury.core.internal.crash.e */
/* compiled from: CrashFormatter.kt */
public final class C9748e {

    /* renamed from: a */
    private final SdkInfo f24639a;

    static {
        new C9749a((byte) 0);
    }

    public C9748e(SdkInfo sdkInfo) {
        C9717ai.m28145b(sdkInfo, "sdkInfo");
        this.f24639a = sdkInfo;
    }

    /* renamed from: com.ogury.core.internal.crash.e$a */
    /* compiled from: CrashFormatter.kt */
    public static final class C9749a {
        private C9749a() {
        }

        public /* synthetic */ C9749a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final JSONObject mo64098a(C9741a aVar, C9765o oVar, Throwable th, String str) {
        String str2;
        C9717ai.m28145b(aVar, "appInfo");
        C9717ai.m28145b(oVar, "phoneInfo");
        C9717ai.m28145b(th, "throwable");
        C9717ai.m28145b(str, "stackTrace");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("created_at", System.currentTimeMillis());
        jSONObject.put("sdk_version", this.f24639a.getSdkVersion());
        jSONObject.put(TapjoyConstants.TJC_API_KEY, this.f24639a.getApiKey());
        jSONObject.put("aaid", this.f24639a.getAaid());
        jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, aVar.mo64084b());
        jSONObject.put("package_version", aVar.mo64083a());
        String a = oVar.mo64119a();
        if (a.length() > 16) {
            if (a != null) {
                a = a.substring(0, 16);
                C9717ai.m28143a((Object) a, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        jSONObject.put("phone_model", a);
        jSONObject.put("android_version", oVar.mo64120b());
        jSONObject.put("exception_type", th.getClass().getCanonicalName());
        C9767p c = oVar.mo64121c();
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getName());
        sb.append(" : ");
        sb.append(th.getMessage());
        if (c.mo64125d()) {
            str2 = " : Free[" + c.mo64122a() + "] Total[" + c.mo64123b() + "] Max[" + c.mo64124c() + "]";
        } else {
            str2 = "";
        }
        sb.append(str2);
        jSONObject.put("message", sb.toString());
        jSONObject.put("stacktrace", str);
        jSONObject.put("number_of_crashes", 1);
        jSONObject.put("number_of_crashes_on_last_upload", 0);
        return jSONObject;
    }

    /* renamed from: a */
    public static String m28188a(Throwable th) {
        C9717ai.m28145b(th, "throwable");
        StackTraceElement[] stackTrace = th.getStackTrace();
        C9717ai.m28143a((Object) stackTrace, "throwable.stackTrace");
        return C9776h.m28237a((Object[]) stackTrace, (CharSequence) "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C9714af) null, 62);
    }
}
