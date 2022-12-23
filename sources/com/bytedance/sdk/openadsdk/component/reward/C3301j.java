package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.p184d.C3961a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.j */
/* compiled from: SpCache */
class C3301j {

    /* renamed from: a */
    private String f7837a;

    /* renamed from: b */
    private Context f7838b;

    C3301j(Context context, String str) {
        this.f7838b = context;
        this.f7837a = TextUtils.isEmpty(str) ? "" : str;
    }

    /* renamed from: b */
    private Context m9728b() {
        Context context = this.f7838b;
        return context == null ? C3513m.m10963a() : context;
    }

    /* renamed from: f */
    private SharedPreferences m9731f(String str) {
        try {
            if (m9728b() != null) {
                return m9728b().getSharedPreferences(str, 0);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: g */
    private String m9732g(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        return this.f7837a + "_cache_" + str;
    }

    /* renamed from: c */
    private String m9729c() {
        return this.f7837a + "_adslot";
    }

    /* renamed from: d */
    private String m9730d() {
        return this.f7837a + "_adslot_preload";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo19137a(String str) {
        try {
            if (C3948b.m12959c()) {
                return C3961a.m13035b(m9732g(str), "material_data", (String) null);
            }
            SharedPreferences f = m9731f(m9732g(str));
            if (f != null) {
                return f.getString("material_data", (String) null);
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo19140b(String str) {
        try {
            if (C3948b.m12959c()) {
                return C3961a.m13021a(m9732g(str), "create_time", 0);
            }
            SharedPreferences f = m9731f(m9732g(str));
            if (f != null) {
                return f.getLong("create_time", 0);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo19142c(String str) {
        try {
            if (C3948b.m12959c()) {
                return C3961a.m13032a(m9732g(str), "has_played", true);
            }
            SharedPreferences f = m9731f(m9732g(str));
            if (f != null) {
                return f.getBoolean("has_played", true);
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19139a(String str, String str2) {
        try {
            if (C3948b.m12959c()) {
                C3961a.m13025a(m9732g(str), "has_played", (Boolean) false);
                C3961a.m13028a(m9732g(str), "create_time", Long.valueOf(System.currentTimeMillis()));
                C3961a.m13029a(m9732g(str), "material_data", str2);
                return;
            }
            SharedPreferences f = m9731f(m9732g(str));
            if (f != null) {
                f.edit().putBoolean("has_played", false).putLong("create_time", System.currentTimeMillis()).putString("material_data", str2).apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo19143d(String str) {
        try {
            if (C3948b.m12959c()) {
                C3961a.m13023a(m9732g(str));
                return;
            }
            SharedPreferences f = m9731f(m9732g(str));
            if (f != null) {
                f.edit().clear().apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public AdSlot mo19144e(String str) {
        String str2;
        try {
            if (C3948b.m12959c()) {
                str2 = C3961a.m13035b(m9729c(), str, (String) null);
            } else {
                SharedPreferences f = m9731f(m9729c());
                str2 = f != null ? f.getString(str, (String) null) : null;
            }
            return AdSlot.getSlot(str2 != null ? new JSONObject(str2) : null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19138a(AdSlot adSlot) {
        if (adSlot != null) {
            try {
                if (!TextUtils.isEmpty(adSlot.getCodeId())) {
                    String jSONObject = adSlot.toJsonObj().toString();
                    if (C3948b.m12959c()) {
                        C3961a.m13029a(m9729c(), adSlot.getCodeId(), jSONObject);
                        return;
                    }
                    SharedPreferences f = m9731f(m9729c());
                    if (f != null) {
                        f.edit().putString(adSlot.getCodeId(), jSONObject).apply();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo19141b(AdSlot adSlot) {
        if (adSlot != null) {
            try {
                if (!TextUtils.isEmpty(adSlot.getCodeId())) {
                    String jSONObject = adSlot.toJsonObj().toString();
                    if (C3948b.m12959c()) {
                        C3961a.m13029a(m9730d(), "preload_data", jSONObject);
                        return;
                    }
                    SharedPreferences f = m9731f(m9730d());
                    if (f != null) {
                        f.edit().putString("preload_data", jSONObject).apply();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdSlot mo19136a() {
        String str;
        try {
            if (C3948b.m12959c()) {
                str = C3961a.m13035b(m9730d(), "preload_data", (String) null);
                C3961a.m13023a(m9730d());
            } else {
                SharedPreferences f = m9731f(m9730d());
                if (f != null) {
                    String string = f.getString("preload_data", (String) null);
                    f.edit().clear().apply();
                    str = string;
                } else {
                    str = null;
                }
            }
            return AdSlot.getSlot(str != null ? new JSONObject(str) : null);
        } catch (Throwable unused) {
            return null;
        }
    }
}
