package com.bytedance.sdk.openadsdk.p128b;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.p095d.C2580e;
import com.bytedance.sdk.component.utils.C2898h;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.u */
/* compiled from: WebviewTimeTrack */
public class C3118u {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f7331a = "embeded_ad";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3431n f7332b;

    /* renamed from: c */
    private Boolean f7333c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Boolean f7334d = false;

    /* renamed from: e */
    private Boolean f7335e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public JSONObject f7336f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public JSONArray f7337g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public JSONArray f7338h;

    protected C3118u() {
    }

    public C3118u(int i, String str, C3431n nVar) {
        this.f7331a = str;
        this.f7332b = nVar;
        this.f7336f = new JSONObject();
        this.f7337g = new JSONArray();
        this.f7338h = new JSONArray();
        m9070a(this.f7336f, "webview_source", (Object) Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9069a(JSONArray jSONArray, Object obj) {
        if (jSONArray != null && jSONArray.length() < 10) {
            try {
                jSONArray.put(obj);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9070a(JSONObject jSONObject, String str, Object obj) {
        m9071a(jSONObject, str, obj, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9071a(JSONObject jSONObject, String str, Object obj, boolean z) {
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            if (!z) {
                try {
                    if (jSONObject.has(str)) {
                        return;
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            jSONObject.put(str, obj);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public boolean m9077q() {
        return this.f7335e.booleanValue() || (this.f7334d.booleanValue() && this.f7333c.booleanValue());
    }

    /* renamed from: a */
    public void mo18718a() {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3118u uVar = C3118u.this;
                uVar.m9070a(jSONObject, "render_sequence", (Object) Integer.valueOf(uVar.f7332b.mo19649q()));
                C3118u.this.m9070a(jSONObject, "webview_count", (Object) Integer.valueOf(C2580e.m6660a().mo16789e()));
                C3118u.this.m9070a(jSONObject, "available_cache_count", (Object) Integer.valueOf(C2580e.m6660a().mo16787d()));
                C3118u uVar2 = C3118u.this;
                uVar2.m9070a(uVar2.f7336f, "render_start", (Object) jSONObject);
            }
        });
    }

    /* renamed from: a */
    public void mo18719a(final int i) {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                C3118u.this.mo18720a(i, (String) null);
            }
        });
    }

    /* renamed from: a */
    public void mo18720a(final int i, final String str) {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3118u.this.m9070a(jSONObject, "code", (Object) Integer.valueOf(i));
                String str = str;
                if (str != null) {
                    C3118u.this.m9070a(jSONObject, "msg", (Object) str);
                }
                C3118u uVar = C3118u.this;
                uVar.m9070a(uVar.f7336f, "render_error", (Object) jSONObject);
            }
        });
    }

    /* renamed from: a */
    public void mo18721a(final String str) {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                if (!TextUtils.isEmpty(str)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                    C3118u.this.m9070a(jSONObject, "jsb", (Object) str);
                    C3118u uVar = C3118u.this;
                    uVar.m9070a(uVar.f7336f, "webview_jsb_start", (Object) jSONObject);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo18722a(String str, long j, long j2, int i) {
        final String str2 = str;
        final long j3 = j2;
        final long j4 = j;
        final int i2 = i;
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                if (!TextUtils.isEmpty(str2) && j3 >= j4) {
                    JSONObject jSONObject = new JSONObject();
                    C3118u.this.m9070a(jSONObject, "start_ts", (Object) Long.valueOf(j4));
                    C3118u.this.m9070a(jSONObject, "end_ts", (Object) Long.valueOf(j3));
                    C3118u.this.m9070a(jSONObject, "intercept_type", (Object) Integer.valueOf(i2));
                    C3118u.this.m9070a(jSONObject, "type", (Object) "intercept_html");
                    C3118u.this.m9070a(jSONObject, "url", (Object) str2);
                    C3118u.this.m9070a(jSONObject, "duration", (Object) Long.valueOf(j3 - j4));
                    C3118u uVar = C3118u.this;
                    uVar.m9069a(uVar.f7338h, (Object) jSONObject);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo18723a(final JSONObject jSONObject) {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                JSONObject jSONObject = jSONObject;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(System.currentTimeMillis()));
                C3118u uVar = C3118u.this;
                uVar.m9070a(uVar.f7336f, "webview_load_error", (Object) jSONObject);
            }
        });
    }

    /* renamed from: a */
    public void mo18724a(boolean z) {
        this.f7335e = Boolean.valueOf(z);
    }

    /* renamed from: b */
    public void mo18725b() {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3118u uVar = C3118u.this;
                uVar.m9070a(uVar.f7336f, "render_success", (Object) jSONObject);
            }
        });
    }

    /* renamed from: b */
    public void mo18726b(final int i) {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3118u.this.m9070a(jSONObject, "isWebViewCache", (Object) Integer.valueOf(i));
                C3118u uVar = C3118u.this;
                uVar.m9070a(uVar.f7336f, "before_webview_request", (Object) jSONObject);
            }
        });
    }

    /* renamed from: b */
    public void mo18727b(final int i, final String str) {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3118u.this.m9070a(jSONObject, "code", (Object) Integer.valueOf(i));
                C3118u uVar = C3118u.this;
                uVar.m9070a(uVar.f7336f, str, (Object) jSONObject);
            }
        });
    }

    /* renamed from: b */
    public void mo18728b(final String str) {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                if (!TextUtils.isEmpty(str)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                    C3118u.this.m9070a(jSONObject, "jsb", (Object) str);
                    C3118u uVar = C3118u.this;
                    uVar.m9070a(uVar.f7336f, "webview_jsb_end", (Object) jSONObject);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo18729b(String str, long j, long j2, int i) {
        final String str2 = str;
        final long j3 = j2;
        final long j4 = j;
        final int i2 = i;
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                if (!TextUtils.isEmpty(str2) && j3 >= j4) {
                    JSONObject jSONObject = new JSONObject();
                    C3118u.this.m9070a(jSONObject, "start_ts", (Object) Long.valueOf(j4));
                    C3118u.this.m9070a(jSONObject, "end_ts", (Object) Long.valueOf(j3));
                    C3118u.this.m9070a(jSONObject, "intercept_type", (Object) Integer.valueOf(i2));
                    C3118u.this.m9070a(jSONObject, "type", (Object) "intercept_js");
                    C3118u.this.m9070a(jSONObject, "url", (Object) str2);
                    C3118u.this.m9070a(jSONObject, "duration", (Object) Long.valueOf(j3 - j4));
                    C3118u uVar = C3118u.this;
                    uVar.m9069a(uVar.f7338h, (Object) jSONObject);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo18730b(final JSONObject jSONObject) {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                JSONObject jSONObject;
                if (C3118u.this.f7336f != null && (jSONObject = jSONObject) != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        C3118u uVar = C3118u.this;
                        uVar.m9070a(uVar.f7336f, next, jSONObject.opt(next));
                    }
                    Boolean unused = C3118u.this.f7334d = true;
                    C3118u.this.mo18744m();
                }
            }
        });
    }

    /* renamed from: c */
    public void mo18731c() {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3118u uVar = C3118u.this;
                uVar.m9070a(uVar.f7336f, "native_render_start", (Object) jSONObject);
            }
        });
    }

    /* renamed from: c */
    public void mo18732c(final String str) {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3118u uVar = C3118u.this;
                uVar.m9070a(uVar.f7336f, str, (Object) jSONObject);
            }
        });
    }

    /* renamed from: d */
    public void mo18733d() {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3118u uVar = C3118u.this;
                uVar.m9070a(uVar.f7336f, "native_render_end", (Object) jSONObject);
            }
        });
    }

    /* renamed from: d */
    public void mo18734d(final String str) {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3118u uVar = C3118u.this;
                uVar.m9070a(uVar.f7336f, str, (Object) jSONObject);
            }
        });
    }

    /* renamed from: e */
    public void mo18735e() {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3118u uVar = C3118u.this;
                uVar.m9071a(uVar.f7336f, "webview_load_start", (Object) jSONObject, false);
            }
        });
    }

    /* renamed from: e */
    public void mo18736e(final String str) {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3118u uVar = C3118u.this;
                uVar.m9070a(uVar.f7336f, str, (Object) jSONObject);
            }
        });
    }

    /* renamed from: f */
    public void mo18737f() {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3118u uVar = C3118u.this;
                uVar.m9070a(uVar.f7336f, "webview_load_success", (Object) jSONObject);
            }
        });
    }

    /* renamed from: g */
    public void mo18738g() {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                C3118u.this.mo18723a((JSONObject) null);
            }
        });
    }

    /* renamed from: h */
    public void mo18739h() {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3118u uVar = C3118u.this;
                uVar.m9070a(uVar.f7336f, "native_endcard_show", (Object) jSONObject);
            }
        });
    }

    /* renamed from: i */
    public void mo18740i() {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3118u uVar = C3118u.this;
                uVar.m9070a(uVar.f7336f, "native_endcard_close", (Object) jSONObject);
            }
        });
    }

    /* renamed from: j */
    public void mo18741j() {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3118u.this.m9070a(jSONObject, "type", (Object) "native_enterBackground");
                C3118u uVar = C3118u.this;
                uVar.m9069a(uVar.f7337g, (Object) jSONObject);
            }
        });
    }

    /* renamed from: k */
    public void mo18742k() {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3118u.this.m9070a(jSONObject, "type", (Object) "native_enterForeground");
                C3118u uVar = C3118u.this;
                uVar.m9069a(uVar.f7337g, (Object) jSONObject);
            }
        });
    }

    /* renamed from: l */
    public void mo18743l() {
        this.f7333c = true;
    }

    /* renamed from: m */
    public void mo18744m() {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                if (C3118u.this.m9077q()) {
                    if (!(C3118u.this.f7337g == null || C3118u.this.f7337g.length() == 0)) {
                        try {
                            C3118u.this.f7336f.put("native_switchBackgroundAndForeground", C3118u.this.f7337g);
                        } catch (Exception unused) {
                        }
                    }
                    if (!(C3118u.this.f7338h == null || C3118u.this.f7338h.length() == 0)) {
                        try {
                            C3118u.this.f7336f.put("intercept_source", C3118u.this.f7338h);
                        } catch (Exception unused2) {
                        }
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("webview_time_track", C3118u.this.f7336f);
                    if (C3457h.m10580d().mo19779s() && C3118u.this.f7336f != null) {
                        C2905l.m8111b("WebviewTimeTrack", C3118u.this.f7336f.toString());
                    }
                    C3090e.m8922c(C3513m.m10963a(), C3118u.this.f7332b, C3118u.this.f7331a, "webview_time_track", (Map<String, Object>) hashMap);
                }
            }
        });
    }

    /* renamed from: n */
    public void mo18745n() {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3118u uVar = C3118u.this;
                uVar.m9070a(uVar.f7336f, "native_render_end", (Object) jSONObject);
                long currentTimeMillis2 = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                C3118u.this.m9070a(jSONObject2, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis2));
                C3118u uVar2 = C3118u.this;
                uVar2.m9070a(uVar2.f7336f, "render_success", (Object) jSONObject2);
            }
        });
    }

    /* renamed from: o */
    public void mo18746o() {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3118u uVar = C3118u.this;
                uVar.m9070a(uVar.f7336f, "no_native_render", (Object) jSONObject);
            }
        });
    }

    /* renamed from: p */
    public void mo18747p() {
        C2898h.m8093a().post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                C3118u.this.m9070a(jSONObject, CampaignEx.JSON_KEY_ST_TS, (Object) Long.valueOf(currentTimeMillis));
                C3118u uVar = C3118u.this;
                uVar.m9070a(uVar.f7336f, "render_failed", (Object) jSONObject);
            }
        });
    }
}
