package com.applovin.impl.sdk;

import android.os.Bundle;
import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.C1573c;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.mediation.p031a.C1583a;
import com.applovin.impl.mediation.p035d.C1655c;
import com.applovin.impl.sdk.network.C1993a;
import com.applovin.impl.sdk.network.C2000c;
import com.applovin.impl.sdk.network.C2017h;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.tapjoy.TapjoyConstants;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.i */
public class C1953i implements AppLovinCommunicatorPublisher, AppLovinCommunicatorSubscriber {

    /* renamed from: a */
    private final C1969m f3643a;

    /* renamed from: b */
    private final AppLovinCommunicator f3644b;

    C1953i(C1969m mVar) {
        this.f3643a = mVar;
        this.f3644b = AppLovinCommunicator.getInstance(mVar.mo14520L());
        if (!mVar.mo14575e() && ((Boolean) mVar.mo14534a(C1867b.f3332eX)).booleanValue()) {
            this.f3644b.mo12816a(mVar);
            this.f3644b.subscribe((AppLovinCommunicatorSubscriber) this, C1573c.f2023a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.os.Bundle m4407b(com.applovin.impl.mediation.p031a.C1583a r4) {
        /*
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = r4.mo13365f()
            java.lang.String r2 = "id"
            r0.putString(r2, r1)
            java.lang.String r1 = r4.mo13431L()
            java.lang.String r2 = "network_name"
            r0.putString(r2, r1)
            java.lang.String r1 = r4.getAdUnitId()
            java.lang.String r2 = "max_ad_unit_id"
            r0.putString(r2, r1)
            java.lang.String r1 = r4.mo13385l()
            java.lang.String r2 = "third_party_ad_placement_id"
            r0.putString(r2, r1)
            com.applovin.mediation.MaxAdFormat r1 = r4.getFormat()
            java.lang.String r1 = r1.getLabel()
            java.lang.String r2 = "ad_format"
            r0.putString(r2, r1)
            java.lang.String r1 = r4.getCreativeId()
            boolean r1 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = r4.getCreativeId()
            java.lang.String r2 = "creative_id"
            r0.putString(r2, r1)
        L_0x0049:
            java.lang.String r1 = r4.getDspName()
            boolean r1 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r1)
            if (r1 == 0) goto L_0x005c
            java.lang.String r1 = r4.getDspName()
            java.lang.String r2 = "dsp_name"
            r0.putString(r2, r1)
        L_0x005c:
            boolean r1 = r4.mo13384k()
            if (r1 == 0) goto L_0x006c
            java.lang.String r1 = r4.getNetworkName()
            java.lang.String r2 = "custom_js_network_name"
        L_0x0068:
            r0.putString(r2, r1)
            goto L_0x007f
        L_0x006c:
            java.lang.String r1 = r4.mo13431L()
            java.lang.String r2 = "CUSTOM_NETWORK_SDK"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x007f
            java.lang.String r1 = r4.getNetworkName()
            java.lang.String r2 = "custom_sdk_network_name"
            goto L_0x0068
        L_0x007f:
            org.json.JSONObject r1 = r4.mo13361b()
            android.os.Bundle r1 = com.applovin.impl.sdk.utils.JsonUtils.toBundle((org.json.JSONObject) r1)
            r0.putAll(r1)
            boolean r1 = r4 instanceof com.applovin.impl.mediation.p031a.C1584b
            if (r1 == 0) goto L_0x00c2
            com.applovin.impl.mediation.a.b r4 = (com.applovin.impl.mediation.p031a.C1584b) r4
            android.view.View r4 = r4.mo13399w()
            if (r4 == 0) goto L_0x00bb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            r2 = 64
            r1.append(r2)
            int r4 = r4.hashCode()
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            goto L_0x00bd
        L_0x00bb:
            java.lang.String r4 = "N/A"
        L_0x00bd:
            java.lang.String r1 = "ad_view"
            r0.putString(r1, r4)
        L_0x00c2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1953i.m4407b(com.applovin.impl.mediation.a.a):android.os.Bundle");
    }

    /* renamed from: a */
    public void mo14479a() {
        if (((Boolean) this.f3643a.mo14534a(C1867b.f3332eX)).booleanValue()) {
            mo14480a(new Bundle(), "privacy_setting_updated");
        }
    }

    /* renamed from: a */
    public void mo14480a(Bundle bundle, String str) {
        if (((Boolean) this.f3643a.mo14534a(C1867b.f3332eX)).booleanValue() && !this.f3643a.mo14575e()) {
            this.f3644b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this, this.f3643a.mo14567b(C1867b.f3331eW).contains(str)));
        }
    }

    /* renamed from: a */
    public void mo14481a(C1583a aVar) {
        if (((Boolean) this.f3643a.mo14534a(C1867b.f3332eX)).booleanValue() && this.f3644b.hasSubscriber("max_revenue_events")) {
            Bundle b = m4407b(aVar);
            b.putAll(JsonUtils.toBundle(aVar.mo13362c()));
            b.putString(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, this.f3643a.mo14589s().getCountryCode());
            BundleUtils.putStringIfValid("user_segment", this.f3643a.mo14587q().getName(), b);
            mo14480a(b, "max_revenue_events");
        }
    }

    /* renamed from: a */
    public void mo14482a(C1583a aVar, String str) {
        if (((Boolean) this.f3643a.mo14534a(C1867b.f3332eX)).booleanValue() && this.f3644b.hasSubscriber("max_ad_events")) {
            Bundle b = m4407b(aVar);
            b.putString("type", str);
            if (C2102v.m5104a()) {
                C2102v A = this.f3643a.mo14509A();
                A.mo15012b("CommunicatorService", "Sending \"max_ad_events\" message: " + b);
            }
            mo14480a(b, "max_ad_events");
        }
    }

    /* renamed from: a */
    public void mo14483a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (((Boolean) this.f3643a.mo14534a(C1867b.f3332eX)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            mo14480a(bundle, "adapter_initialization_status");
        }
    }

    /* renamed from: a */
    public void mo14484a(String str, String str2) {
        if (((Boolean) this.f3643a.mo14534a(C1867b.f3332eX)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            mo14480a(bundle, "network_sdk_version_updated");
        }
    }

    /* renamed from: a */
    public void mo14485a(String str, String str2, int i, Object obj, String str3, boolean z) {
        if (((Boolean) this.f3643a.mo14534a(C1867b.f3332eX)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putString("url", str2);
            bundle.putInt("code", i);
            bundle.putBundle("body", JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z);
            BundleUtils.putString("error_message", str3, bundle);
            mo14480a(bundle, "receive_http_response");
        }
    }

    /* renamed from: a */
    public void mo14486a(String str, String str2, String str3) {
        if (((Boolean) this.f3643a.mo14534a(C1867b.f3332eX)).booleanValue()) {
            String maybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String maybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", maybeConvertToIndentedString);
            bundle.putString("response", maybeConvertToIndentedString2);
            mo14480a(bundle, "responses");
        }
    }

    /* renamed from: a */
    public void mo14487a(JSONObject jSONObject, boolean z) {
        if (((Boolean) this.f3643a.mo14534a(C1867b.f3332eX)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3643a.mo14597z());
            bundle.putString("applovin_random_token", this.f3643a.mo14585o());
            bundle.putString("compass_random_token", this.f3643a.mo14584n());
            bundle.putString(TapjoyConstants.TJC_DEVICE_TYPE_NAME, AppLovinSdkUtils.isTablet(this.f3643a.mo14520L()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z));
            bundle.putParcelableArrayList("installed_mediation_adapters", JsonUtils.toBundle(C1655c.m3371a(this.f3643a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", new JSONObject());
            Bundle bundle2 = (Bundle) bundle.clone();
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "user_engagement_sdk_settings", new JSONObject());
            JsonUtils.putString(jSONObject3, "lsc", "Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U=");
            JsonUtils.putString(jSONObject3, "psp", "Y29tLmFuZHJvaWQudmVuZGluZw==");
            bundle2.putBundle("settings", JsonUtils.toBundle(jSONObject3));
            mo14480a(bundle2, "user_engagement_sdk_init");
            Bundle bundle3 = (Bundle) bundle.clone();
            bundle3.putString("user_id", this.f3643a.mo14583m());
            bundle3.putBundle("settings", JsonUtils.toBundle(JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new JSONObject())));
            if (C2102v.m5104a()) {
                C2102v A = this.f3643a.mo14509A();
                A.mo15012b("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            mo14480a(bundle3, "safedk_init");
            Bundle bundle4 = (Bundle) bundle.clone();
            bundle4.putBundle("settings", JsonUtils.toBundle(JsonUtils.getJSONObject(jSONObject2, "adjust_settings", new JSONObject())));
            mo14480a(bundle4, "adjust_init");
            Bundle bundle5 = (Bundle) bundle.clone();
            bundle5.putBundle("settings", JsonUtils.toBundle(JsonUtils.getJSONObject(jSONObject2, "discovery_settings", new JSONObject())));
            mo14480a(bundle5, "discovery_init");
        }
    }

    /* renamed from: a */
    public boolean mo14488a(String str) {
        return C1573c.f2023a.contains(str);
    }

    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        int i;
        Map<String, Object> map;
        if (((Boolean) this.f3643a.mo14534a(C1867b.f3332eX)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map2 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString("id", "");
                if (!map2.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                    map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3643a.mo14597z());
                }
                this.f3643a.mo14528U().mo14764a(new C2017h.C2019a().mo14798c(messageData.getString("url")).mo14801d(messageData.getString("backup_url")).mo14792a(stringMap).mo14799c(map2).mo14796b(stringMap2).mo14793a(((Boolean) this.f3643a.mo14534a(C1867b.f3348ep)).booleanValue()).mo14791a(string).mo14794a());
            } else if ("send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
                String string2 = messageData2.getString("http_method", ShareTarget.METHOD_POST);
                long millis = messageData2.containsKey("timeout_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((Long) this.f3643a.mo14534a(C1867b.f3290dh)).longValue();
                int i2 = messageData2.getInt("retry_count", ((Integer) this.f3643a.mo14534a(C1867b.f3291di)).intValue());
                long millis2 = messageData2.containsKey("retry_delay_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((Long) this.f3643a.mo14534a(C1867b.f3292dj)).longValue();
                Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
                long j = millis2;
                if (ShareTarget.METHOD_GET.equalsIgnoreCase(string2)) {
                    if (messageData2.getBoolean("include_data_collector_info", true)) {
                        stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(this.f3643a.mo14529V().mo14821a((Map<String, String>) null, false, false))));
                    }
                    i = i2;
                    map = null;
                } else {
                    map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                    if (messageData2.getBoolean("include_data_collector_info", true)) {
                        Map<String, Object> h = this.f3643a.mo14529V().mo14829h();
                        Map<String, Object> d = this.f3643a.mo14529V().mo14825d();
                        if (!d.containsKey("idfv") || !d.containsKey("idfv_scope")) {
                            i = i2;
                        } else {
                            i = i2;
                            int intValue = ((Integer) d.get("idfv_scope")).intValue();
                            d.remove("idfv");
                            d.remove("idfv_scope");
                            h.put("idfv", (String) d.get("idfv"));
                            h.put("idfv_scope", Integer.valueOf(intValue));
                        }
                        h.put("server_installed_at", this.f3643a.mo14534a(C1867b.f3131af));
                        h.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3643a.mo14597z());
                        map.put(TapjoyConstants.TJC_APP_PLACEMENT, h);
                        map.put("device", d);
                    } else {
                        i = i2;
                    }
                }
                this.f3643a.mo14526S().mo14429a((C1887a) new C1993a(appLovinCommunicatorMessage.getPublisherId(), C2000c.m4627a(this.f3643a).mo14724a(messageData2.getString("url")).mo14734c(messageData2.getString("backup_url")).mo14725a(stringMap3).mo14730b(string2).mo14731b(BundleUtils.toStringMap(messageData2.getBundle("headers"))).mo14726a(map != null ? new JSONObject(map) : null).mo14729b((int) millis).mo14722a(i).mo14733c((int) j).mo14723a(new JSONObject()).mo14735c(messageData2.getBoolean("is_encoding_enabled", false)).mo14728a(), this.f3643a), C1918o.C1920a.MAIN);
            } else if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.f3643a.mo14592u().addCustomQueryParams(Utils.stringifyObjectMap(BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
            } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.f3643a.mo14592u().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
            } else if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.f3643a.mo14513E().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
            }
        }
    }
}
