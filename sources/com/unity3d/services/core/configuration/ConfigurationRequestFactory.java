package com.unity3d.services.core.configuration;

import androidx.browser.trusted.sharing.ShareTarget;
import com.unity3d.services.core.device.reader.C12033a;
import com.unity3d.services.core.device.reader.C12034b;
import com.unity3d.services.core.device.reader.C12035c;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.properties.C12084a;
import com.unity3d.services.core.properties.C12088d;
import com.unity3d.services.core.request.C12099h;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.HashMap;

public class ConfigurationRequestFactory {

    /* renamed from: a */
    private final Configuration f29210a;

    /* renamed from: b */
    private final C12033a f29211b;

    public ConfigurationRequestFactory(Configuration configuration, C12033a aVar) {
        this.f29210a = configuration;
        this.f29211b = aVar;
    }

    public Configuration getConfiguration() {
        return this.f29210a;
    }

    public C12099h getWebRequest() throws MalformedURLException {
        C12099h hVar;
        String configUrl = this.f29210a.getConfigUrl();
        if (configUrl != null) {
            StringBuilder sb = new StringBuilder(configUrl);
            Experiments experiments = this.f29210a.getExperiments();
            if (experiments == null || !experiments.isTwoStageInitializationEnabled()) {
                sb.append("?ts=");
                sb.append(System.currentTimeMillis());
                sb.append("&sdkVersion=");
                sb.append(C12088d.m32941n());
                sb.append("&sdkVersionName=");
                sb.append(C12088d.m32942o());
                sb.append("&gameId=");
                sb.append(C12084a.m32909f());
                hVar = new C12099h(sb.toString(), ShareTarget.METHOD_GET);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("Content-Encoding", Collections.singletonList("gzip"));
                hVar = new C12099h(sb.toString(), ShareTarget.METHOD_POST, hashMap);
                hVar.mo71248a(new C12035c(new C12034b(this.f29211b.mo71172a())).mo71177c());
            }
            C12065a.m32845b("Requesting configuration with: " + sb);
            return hVar;
        }
        throw new MalformedURLException("Base URL is null");
    }
}
