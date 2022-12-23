package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.request.C12099h;
import org.json.JSONObject;

public class PrivacyConfigurationLoader implements IConfigurationLoader {

    /* renamed from: a */
    private final IConfigurationLoader f29307a;

    /* renamed from: b */
    private final ConfigurationRequestFactory f29308b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final PrivacyConfigStorage f29309c;

    /* renamed from: com.unity3d.services.core.configuration.PrivacyConfigurationLoader$a */
    class C12001a implements IPrivacyConfigurationListener {
        C12001a() {
        }

        public void onError(String str) {
            C12065a.m32851e("Couldn't fetch privacy configuration: " + str);
            PrivacyConfigurationLoader.this.f29309c.setPrivacyConfig(new PrivacyConfig());
        }

        public void onSuccess(PrivacyConfig privacyConfig) {
            PrivacyConfigurationLoader.this.f29309c.setPrivacyConfig(privacyConfig);
        }
    }

    public PrivacyConfigurationLoader(IConfigurationLoader iConfigurationLoader, ConfigurationRequestFactory configurationRequestFactory, PrivacyConfigStorage privacyConfigStorage) {
        this.f29307a = iConfigurationLoader;
        this.f29308b = configurationRequestFactory;
        this.f29309c = privacyConfigStorage;
    }

    public Configuration getLocalConfiguration() {
        return this.f29307a.getLocalConfiguration();
    }

    public void loadConfiguration(IConfigurationLoaderListener iConfigurationLoaderListener) throws Exception {
        if (this.f29309c.getPrivacyConfig().getPrivacyStatus() == PrivacyConfigStatus.UNKNOWN) {
            m32651a((IPrivacyConfigurationListener) new C12001a());
        }
        this.f29307a.loadConfiguration(iConfigurationLoaderListener);
    }

    /* renamed from: a */
    private void m32651a(IPrivacyConfigurationListener iPrivacyConfigurationListener) throws Exception {
        try {
            C12099h webRequest = this.f29308b.getWebRequest();
            InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestStart();
            String n = webRequest.mo71260n();
            try {
                if (webRequest.mo71256j() / 100 == 2) {
                    InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(true);
                    iPrivacyConfigurationListener.onSuccess(new PrivacyConfig(new JSONObject(n)));
                    return;
                }
                InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(false);
                iPrivacyConfigurationListener.onError("Privacy request failed with code: " + webRequest.mo71256j());
            } catch (Exception unused) {
                InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(false);
                iPrivacyConfigurationListener.onError("Could not create web request");
            }
        } catch (Exception e) {
            iPrivacyConfigurationListener.onError("Could not create web request: " + e);
        }
    }
}
