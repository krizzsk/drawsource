package com.unity3d.services.core.configuration;

import com.unity3d.services.core.request.C12099h;
import com.unity3d.services.core.request.metrics.C12120i;
import com.unity3d.services.core.request.metrics.C12122j;
import org.json.JSONObject;

public class ConfigurationLoader implements IConfigurationLoader {

    /* renamed from: a */
    private final Configuration f29207a;

    /* renamed from: b */
    private final ConfigurationRequestFactory f29208b;

    public ConfigurationLoader(ConfigurationRequestFactory configurationRequestFactory) {
        this.f29207a = configurationRequestFactory.getConfiguration();
        this.f29208b = configurationRequestFactory;
    }

    /* renamed from: a */
    private void m32624a(String str, String str2) {
        if (this.f29207a.getExperiments() != null && this.f29207a.getExperiments().isTwoStageInitializationEnabled()) {
            if (str == null || str.isEmpty()) {
                C12120i.m33045a().sendMetric(C12122j.m33070e());
            }
            if (str2 == null || str2.isEmpty()) {
                C12120i.m33045a().sendMetric(C12122j.m33066d());
            }
        }
    }

    public Configuration getLocalConfiguration() {
        return this.f29207a;
    }

    public void loadConfiguration(IConfigurationLoaderListener iConfigurationLoaderListener) throws Exception {
        try {
            C12099h webRequest = this.f29208b.getWebRequest();
            InitializeEventsMetricSender.getInstance().didConfigRequestStart();
            String n = webRequest.mo71260n();
            if (!(webRequest.mo71256j() / 100 == 2)) {
                iConfigurationLoaderListener.onError("Non 2xx HTTP status received from ads configuration request.");
                return;
            }
            try {
                this.f29207a.mo71033a(new JSONObject(n), true);
                m32624a(this.f29207a.getUnifiedAuctionToken(), this.f29207a.getStateId());
                iConfigurationLoaderListener.onSuccess(this.f29207a);
            } catch (Exception unused) {
                iConfigurationLoaderListener.onError("Could not create web request");
            }
        } catch (Exception e) {
            iConfigurationLoaderListener.onError("Could not create web request: " + e);
        }
    }
}
