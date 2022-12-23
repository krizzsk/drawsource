package com.applovin.impl.mediation.debugger.p041ui.testmode;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p051c.C1869d;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.b */
public class C1736b implements AppLovinCommunicatorSubscriber {

    /* renamed from: a */
    private final C1969m f2657a;

    /* renamed from: b */
    private boolean f2658b;

    /* renamed from: c */
    private boolean f2659c;

    /* renamed from: d */
    private String f2660d;

    public C1736b(C1969m mVar) {
        this.f2657a = mVar;
        this.f2660d = (String) mVar.mo14565b(C1869d.f3367B, null);
        mVar.mo14569b(C1869d.f3367B);
        if (StringUtils.isValidString(this.f2660d)) {
            this.f2659c = true;
        }
        this.f2658b = ((Boolean) mVar.mo14565b(C1869d.f3368C, false)).booleanValue();
        mVar.mo14569b(C1869d.f3368C);
        AppLovinCommunicator.getInstance(mVar.mo14520L()).subscribe((AppLovinCommunicatorSubscriber) this, "test_mode_settings");
    }

    /* renamed from: a */
    public void mo13803a(String str) {
        this.f2660d = str;
    }

    /* renamed from: a */
    public void mo13804a(JSONObject jSONObject) {
        if (!this.f2658b) {
            this.f2658b = JsonUtils.containsCaseInsensitiveString(this.f2657a.mo14529V().mo14832k().f3941b, JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray())) || this.f2657a.mo14529V().mo14828g() || AppLovinSdkUtils.isEmulator();
        }
    }

    /* renamed from: a */
    public void mo13805a(boolean z) {
        this.f2659c = z;
    }

    /* renamed from: a */
    public boolean mo13806a() {
        return this.f2658b;
    }

    /* renamed from: b */
    public void mo13807b(String str) {
        this.f2657a.mo14541a(C1869d.f3367B, str);
    }

    /* renamed from: b */
    public boolean mo13808b() {
        return this.f2659c;
    }

    /* renamed from: c */
    public String mo13809c() {
        return this.f2660d;
    }

    /* renamed from: d */
    public void mo13810d() {
        this.f2657a.mo14541a(C1869d.f3368C, true);
    }

    public String getCommunicatorId() {
        return C1736b.class.getSimpleName();
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("test_mode_settings".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            String string = BundleUtils.getString("force_ad_network", messageData);
            if (StringUtils.isValidString(string)) {
                this.f2659c = true;
                this.f2660d = string;
            }
            String string2 = BundleUtils.getString("test_mode_network_next_session", messageData);
            if (StringUtils.isValidString(string2)) {
                mo13810d();
                mo13807b(string2);
            }
        }
    }
}
