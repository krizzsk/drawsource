package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.config.C4215e;
import com.fyber.inneractive.sdk.config.C4252h;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.cache.b */
public class C4178b implements C4177a<C4252h> {

    /* renamed from: a */
    public static final String f10278a = String.format("https://%sconfig_android.json", new Object[]{"cdn2.inner-active.mobi/ia-sdk-config/"});

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo24168a(Object obj) {
        C4252h hVar = (C4252h) obj;
    }

    /* renamed from: b */
    public String mo24169b() {
        return "IALastModifiedFromHeader.global";
    }

    /* renamed from: c */
    public String mo24170c() {
        return "ia-global.config";
    }

    /* renamed from: d */
    public boolean mo24171d() {
        return true;
    }

    /* renamed from: a */
    public Object mo24166a(String str) throws Exception {
        try {
            return C4252h.m13286a(new JSONObject(str));
        } catch (JSONException e) {
            IAlog.m16447b("internal error while parsing global config file", new Object[0]);
            throw e;
        }
    }

    /* renamed from: a */
    public String mo24167a() {
        int i = C4215e.f10405a;
        if (System.getProperty("ia.testEnvironmentConfiguration.globalConfigUrl") == null) {
            return f10278a;
        }
        return System.getProperty("ia.testEnvironmentConfiguration.globalConfigUrl");
    }
}
