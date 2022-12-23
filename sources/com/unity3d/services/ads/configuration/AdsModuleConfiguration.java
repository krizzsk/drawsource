package com.unity3d.services.ads.configuration;

import android.os.ConditionVariable;
import com.unity3d.services.ads.C11808a;
import com.unity3d.services.ads.adunit.C11812d;
import com.unity3d.services.ads.adunit.C11816h;
import com.unity3d.services.ads.adunit.C11817i;
import com.unity3d.services.ads.adunit.C11818j;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.ads.api.GMAScar;
import com.unity3d.services.ads.api.Load;
import com.unity3d.services.ads.api.Show;
import com.unity3d.services.ads.api.Token;
import com.unity3d.services.ads.api.VideoPlayer;
import com.unity3d.services.ads.api.WebPlayer;
import com.unity3d.services.ads.token.C11898a;
import com.unity3d.services.ads.token.C11913h;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.log.C12065a;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class AdsModuleConfiguration implements IAdsModuleConfiguration {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public InetAddress f28748a;

    /* renamed from: com.unity3d.services.ads.configuration.AdsModuleConfiguration$a */
    class C11838a extends Thread {

        /* renamed from: a */
        final /* synthetic */ String f28749a;

        /* renamed from: b */
        final /* synthetic */ ConditionVariable f28750b;

        C11838a(String str, ConditionVariable conditionVariable) {
            this.f28749a = str;
            this.f28750b = conditionVariable;
        }

        public void run() {
            try {
                InetAddress unused = AdsModuleConfiguration.this.f28748a = InetAddress.getByName(this.f28749a);
                this.f28750b.open();
            } catch (Exception e) {
                C12065a.m32842a("Couldn't get address. Host: " + this.f28749a, e);
                this.f28750b.open();
            }
        }
    }

    public Map<String, Class> getAdUnitViewHandlers() {
        HashMap hashMap = new HashMap();
        hashMap.put("videoplayer", C11816h.class);
        hashMap.put("webplayer", C11817i.class);
        hashMap.put("webview", C11818j.class);
        return hashMap;
    }

    public Class[] getWebAppApiClassList() {
        return new Class[]{AdUnit.class, VideoPlayer.class, WebPlayer.class, Load.class, Show.class, Token.class, GMAScar.class};
    }

    public boolean initCompleteState(Configuration configuration) {
        C11812d.m32279a(configuration);
        C11808a.m32246a(configuration);
        C11898a.m32434a().mo70855b(configuration);
        return true;
    }

    public boolean initErrorState(Configuration configuration, ErrorState errorState, String str) {
        C11913h.m32461a((String) null);
        C11913h.m32459a();
        return true;
    }

    public boolean initModuleState(Configuration configuration) {
        InetAddress inetAddress;
        C12065a.m32845b("Unity Ads init: checking for ad blockers");
        try {
            String host = new URL(configuration.getConfigUrl()).getHost();
            ConditionVariable conditionVariable = new ConditionVariable();
            new C11838a(host, conditionVariable).start();
            if (!conditionVariable.block(2000) || (inetAddress = this.f28748a) == null || !inetAddress.isLoopbackAddress()) {
                C11812d.m32279a(configuration);
                C11808a.m32246a(configuration);
                C11898a.m32434a().mo70855b(configuration);
                return true;
            }
            C12065a.m32848c("Unity Ads init: halting init because Unity Ads config resolves to loopback address (due to ad blocker?)");
            return false;
        } catch (MalformedURLException unused) {
        }
    }

    public boolean resetState(Configuration configuration) {
        C11812d.m32279a(configuration);
        C11808a.m32246a(configuration);
        C11913h.m32459a();
        C11898a.m32434a().mo70855b(configuration);
        return true;
    }
}
