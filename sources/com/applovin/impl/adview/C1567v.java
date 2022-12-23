package com.applovin.impl.adview;

import android.webkit.WebSettings;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import kotlinx.coroutines.DebugKt;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.adview.v */
public final class C1567v {

    /* renamed from: a */
    private JSONObject f2003a;

    public C1567v(JSONObject jSONObject) {
        this.f2003a = jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Integer mo13246a() {
        int i;
        String string = JsonUtils.getString(this.f2003a, "mixed_content_mode", (String) null);
        if (StringUtils.isValidString(string)) {
            if ("always_allow".equalsIgnoreCase(string)) {
                i = 0;
            } else if ("never_allow".equalsIgnoreCase(string)) {
                i = 1;
            } else if ("compatibility_mode".equalsIgnoreCase(string)) {
                i = 2;
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public WebSettings.PluginState mo13247b() {
        String string = JsonUtils.getString(this.f2003a, "plugin_state", (String) null);
        if (StringUtils.isValidString(string)) {
            if ("on".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON;
            }
            if ("on_demand".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON_DEMAND;
            }
            if (DebugKt.DEBUG_PROPERTY_VALUE_OFF.equalsIgnoreCase(string)) {
                return WebSettings.PluginState.OFF;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Boolean mo13248c() {
        return JsonUtils.getBoolean(this.f2003a, "allow_file_access", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Boolean mo13249d() {
        return JsonUtils.getBoolean(this.f2003a, "load_with_overview_mode", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Boolean mo13250e() {
        return JsonUtils.getBoolean(this.f2003a, "use_wide_view_port", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Boolean mo13251f() {
        return JsonUtils.getBoolean(this.f2003a, "allow_content_access", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Boolean mo13252g() {
        return JsonUtils.getBoolean(this.f2003a, "use_built_in_zoom_controls", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Boolean mo13253h() {
        return JsonUtils.getBoolean(this.f2003a, "display_zoom_controls", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Boolean mo13254i() {
        return JsonUtils.getBoolean(this.f2003a, "save_form_data", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Boolean mo13255j() {
        return JsonUtils.getBoolean(this.f2003a, "geolocation_enabled", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Boolean mo13256k() {
        return JsonUtils.getBoolean(this.f2003a, "need_initial_focus", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Boolean mo13257l() {
        return JsonUtils.getBoolean(this.f2003a, "allow_file_access_from_file_urls", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Boolean mo13258m() {
        return JsonUtils.getBoolean(this.f2003a, "allow_universal_access_from_file_urls", (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Boolean mo13259n() {
        return JsonUtils.getBoolean(this.f2003a, "offscreen_pre_raster", (Boolean) null);
    }
}
