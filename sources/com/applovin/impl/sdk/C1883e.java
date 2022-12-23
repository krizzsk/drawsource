package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.p053e.C1944z;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.e */
public class C1883e implements AppLovinCommunicatorSubscriber {

    /* renamed from: a */
    private final C1969m f3486a;

    /* renamed from: b */
    private final Object f3487b = new Object();

    /* renamed from: c */
    private final LinkedHashMap<String, Bundle> f3488c = new LinkedHashMap<String, Bundle>() {
        /* access modifiers changed from: protected */
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    };

    /* renamed from: d */
    private final Set<C1886a> f3489d = Collections.synchronizedSet(new HashSet());

    /* renamed from: com.applovin.impl.sdk.e$a */
    public interface C1886a {
        void onCreativeIdGenerated(String str, String str2);
    }

    public C1883e(C1969m mVar) {
        this.f3486a = mVar;
        AppLovinCommunicator.getInstance(mVar.mo14520L()).subscribe((AppLovinCommunicatorSubscriber) this, "safedk_ad_info");
    }

    /* renamed from: a */
    public static String m4176a() {
        return m4178d("getVersion");
    }

    /* renamed from: b */
    public static String m4177b() {
        return m4178d("getSdkKey");
    }

    /* renamed from: d */
    private static String m4178d(String str) {
        Class<?> cls;
        try {
            cls = Class.forName("com.applovin.quality.AppLovinQualityService");
        } catch (Throwable unused) {
            return "";
        }
        return (String) cls.getMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }

    /* renamed from: a */
    public String mo14358a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return BundleUtils.getString("ad_review_creative_id", mo14360b(str));
    }

    /* renamed from: a */
    public void mo14359a(C1886a aVar) {
        this.f3489d.add(aVar);
    }

    /* renamed from: b */
    public Bundle mo14360b(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f3487b) {
            bundle = this.f3488c.get(str);
        }
        return bundle;
    }

    /* renamed from: b */
    public void mo14361b(C1886a aVar) {
        this.f3489d.remove(aVar);
    }

    /* renamed from: c */
    public void mo14362c(String str) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f3487b) {
                this.f3488c.remove(str);
            }
        }
    }

    public String getCommunicatorId() {
        return C1883e.class.getSimpleName();
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            if (bundle != null) {
                Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
                if (bundle2 == null) {
                    if (C2102v.m5104a()) {
                        this.f3486a.mo14509A().mo15015d("AppLovinSdk", "Received SafeDK ad info without private data");
                    }
                } else if (MaxAdFormat.formatFromString(bundle2.getString(FirebaseAnalytics.Param.AD_FORMAT)) != null) {
                    final String string = bundle2.getString("id");
                    if (!TextUtils.isEmpty(string)) {
                        synchronized (this.f3487b) {
                            C2102v A = this.f3486a.mo14509A();
                            A.mo15012b("AppLovinSdk", "Storing current SafeDK ad info for serve id: " + string);
                            this.f3488c.put(string, bundle);
                        }
                        final String string2 = bundle.getString("ad_review_creative_id");
                        if (StringUtils.isValidString(string2) && !this.f3489d.isEmpty()) {
                            Iterator it = new HashSet(this.f3489d).iterator();
                            while (it.hasNext()) {
                                final C1886a aVar = (C1886a) it.next();
                                this.f3486a.mo14526S().mo14429a((C1887a) new C1944z(this.f3486a, new Runnable() {
                                    public void run() {
                                        aVar.onCreativeIdGenerated(string, string2);
                                    }
                                }), C1918o.C1920a.BACKGROUND);
                            }
                        }
                    } else if (C2102v.m5104a()) {
                        this.f3486a.mo14509A().mo15015d("AppLovinSdk", "Received SafeDK ad info without serve id");
                    }
                } else if (C2102v.m5104a()) {
                    this.f3486a.mo14509A().mo15015d("AppLovinSdk", "Received SafeDK ad info without ad format");
                }
            } else if (C2102v.m5104a()) {
                this.f3486a.mo14509A().mo15015d("AppLovinSdk", "Received SafeDK ad info without public data");
            }
        }
    }
}
