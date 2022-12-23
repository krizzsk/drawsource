package com.ogury.sdk.internal;

import android.content.SharedPreferences;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ogury.sdk.internal.i */
/* compiled from: MonitoringInfoStorage.kt */
public final class C10358i {

    /* renamed from: a */
    private final SharedPreferences f25693a;

    /* renamed from: b */
    private final C10355g f25694b;

    static {
        new C10359a((byte) 0);
    }

    public C10358i(C10361k kVar, C10355g gVar) {
        C10363m.m30060b(kVar, "sharedPreferencesCreator");
        C10363m.m30060b(gVar, "monitoringInfoJsonSerializer");
        this.f25694b = gVar;
        this.f25693a = kVar.mo65212a("ogury_monitoring_info_file");
    }

    /* renamed from: a */
    public final C10348b mo65209a() {
        String str = "";
        try {
            String string = this.f25693a.getString("mInfo", str);
            if (string != null) {
                str = string;
            }
            C10363m.m30058a((Object) str, "sharedPreferences.getString(SP_KEY, \"\") ?: \"\"");
            C10363m.m30060b(str, "jsonString");
            C10348b bVar = new C10348b();
            if (!(str.length() == 0)) {
                C10363m.m30060b(str, "jsonString");
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bVar.mo65190a(next, jSONObject.getString(next));
                }
            }
            return bVar;
        } catch (Exception unused) {
            return new C10348b();
        }
    }

    /* renamed from: a */
    public final void mo65210a(C10348b bVar) {
        if (bVar != null) {
            try {
                this.f25693a.edit().putString("mInfo", this.f25694b.mo65207a(bVar)).apply();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo65211b() {
        this.f25693a.edit().clear().apply();
    }

    /* renamed from: com.ogury.sdk.internal.i$a */
    /* compiled from: MonitoringInfoStorage.kt */
    public static final class C10359a {
        private C10359a() {
        }

        public /* synthetic */ C10359a(byte b) {
            this();
        }
    }
}
