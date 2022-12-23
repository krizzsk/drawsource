package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.cache.C4177a;
import com.fyber.inneractive.sdk.config.C4215e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.global.m */
public class C4245m implements C4177a<C4244l> {
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo24168a(Object obj) {
        C4244l lVar = (C4244l) obj;
    }

    /* renamed from: b */
    public String mo24169b() {
        return "IALastModifiedFromHeader.remote";
    }

    /* renamed from: c */
    public String mo24170c() {
        return "ia-remote.config";
    }

    /* renamed from: d */
    public boolean mo24171d() {
        return true;
    }

    /* renamed from: a */
    public Object mo24166a(String str) throws Exception {
        try {
            return C4244l.m13251a(new JSONObject(str));
        } catch (Exception e) {
            IAlog.m16447b("internal error while parsing remote features config file", new Object[0]);
            if (IAlog.f13936a <= 5) {
                e.printStackTrace();
            }
            throw e;
        }
    }

    /* renamed from: a */
    public String mo24167a() {
        int i = C4215e.f10405a;
        if (System.getProperty("ia.testEnvironmentConfiguration.remoteConfigUrl") != null) {
            return System.getProperty("ia.testEnvironmentConfiguration.remoteConfigUrl");
        }
        return String.format(Locale.ENGLISH, "https://%sfeatures_config.json", new Object[]{"cdn2.inner-active.mobi/ia-sdk-config/"});
    }
}
