package com.ogury.p376cm.internal;

import android.content.Context;
import android.content.res.Resources;
import android.net.NetworkInfo;
import android.util.DisplayMetrics;
import com.ogury.core.internal.InternalCore;
import com.ogury.p376cm.ConsentActivity;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.acaac */
public final class acaac {

    /* renamed from: a */
    public static final aaaaa f24433a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.acaac$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    public static String m27922a(Context context, String str) {
        Context context2 = context;
        bbabc.m28052b(context2, "context");
        bbabc.m28052b(str, "appKey");
        Context applicationContext = context.getApplicationContext();
        bbabc.m28049a((Object) applicationContext, "context.applicationContext");
        Resources resources = applicationContext.getResources();
        bbabc.m28049a((Object) resources, "context.applicationContext.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        bbabc.m28049a((Object) displayMetrics, "context.applicationConte….resources.displayMetrics");
        NetworkInfo a = ConsentActivity.aaaaa.m27626a(context);
        String typeName = a != null ? a.getTypeName() : null;
        Resources resources2 = context.getResources();
        bbabc.m28049a((Object) resources2, "context.resources");
        Context applicationContext2 = context.getApplicationContext();
        bbabc.m28049a((Object) applicationContext2, "context.applicationContext");
        String packageName = applicationContext2.getPackageName();
        bbabc.m28049a((Object) packageName, "context.applicationContext.packageName");
        String c = ConsentActivity.aaaaa.m27632c(context);
        String token = InternalCore.getToken(context2, "consent_token");
        bbabc.m28049a((Object) token, "InternalCore.getToken(context, \"consent_token\")");
        boolean z = !baaba.f24478a.isBillingDisabled();
        baabc baabc = baabc.f24503a;
        String a2 = baabc.m28007a();
        aacac aacac = aacac.f24275a;
        Boolean a3 = aacac.m27778a("IS_CHILD_UNDER_COPPA");
        aacac aacac2 = aacac.f24275a;
        String jSONObject = new acaab(displayMetrics, resources2, typeName, str, "android", packageName, "3.3.0", c, token, z, a2, a3, aacac.m27778a("IS_UNDER_AGE_OF_GDPR_CONSENT")).mo63898a().mo63894a().toString();
        bbabc.m28049a((Object) jSONObject, "requestBodyBuilder.build…serializedJson.toString()");
        return jSONObject;
    }

    /* renamed from: a */
    public static String m27923a(String str) {
        bbabc.m28052b(str, "errorMessage");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", "CONSENT_ERROR");
        jSONObject.put("errorMessage", str);
        String jSONObject2 = jSONObject.toString();
        bbabc.m28049a((Object) jSONObject2, "json.toString()");
        return jSONObject2;
    }
}
