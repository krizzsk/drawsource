package com.unity3d.services.core.webview;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.request.metrics.C12120i;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: com.unity3d.services.core.webview.c */
/* compiled from: WebViewUrlBuilder */
public class C12162c {

    /* renamed from: a */
    private final String f29696a;

    public C12162c(String str, Configuration configuration) {
        String str2 = ("?platform=android" + m33160a("origin", configuration.getWebViewUrl())) + m33160a("version", configuration.getWebViewVersion());
        if (configuration.getExperiments() != null && configuration.getExperiments().isForwardExperimentsToWebViewEnabled()) {
            str2 = str2 + m33160a("experiments", configuration.getExperiments().getExperimentData().toString());
        }
        this.f29696a = str + (str2 + m33160a("isNativeCollectingMetrics", String.valueOf(C12120i.m33045a().mo71269a())));
    }

    /* renamed from: a */
    public String mo71354a() {
        return this.f29696a;
    }

    /* renamed from: a */
    private String m33160a(String str, String str2) {
        if (str2 == null) {
            return "";
        }
        try {
            return "" + "&" + str + "=" + URLEncoder.encode(str2, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C12065a.m32842a(String.format("Unsupported charset when encoding %s", new Object[]{str}), (Exception) e);
            return "";
        }
    }
}
