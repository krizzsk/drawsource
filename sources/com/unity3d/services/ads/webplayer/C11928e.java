package com.unity3d.services.ads.webplayer;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.ads.webplayer.e */
/* compiled from: WebPlayerSettingsCache */
public class C11928e {

    /* renamed from: a */
    private static C11928e f28968a;

    /* renamed from: b */
    private HashMap<String, JSONObject> f28969b = new HashMap<>();

    /* renamed from: c */
    private HashMap<String, JSONObject> f28970c = new HashMap<>();

    /* renamed from: d */
    private HashMap<String, JSONObject> f28971d = new HashMap<>();

    /* renamed from: a */
    public static C11928e m32480a() {
        if (f28968a == null) {
            f28968a = new C11928e();
        }
        return f28968a;
    }

    /* renamed from: b */
    public synchronized void mo70888b(String str, JSONObject jSONObject) {
        this.f28970c.put(str, jSONObject);
    }

    /* renamed from: c */
    public synchronized void mo70890c(String str, JSONObject jSONObject) {
        this.f28969b.put(str, jSONObject);
    }

    /* renamed from: d */
    public synchronized void mo70891d(String str) {
        if (this.f28971d.containsKey(str)) {
            this.f28971d.remove(str);
        }
    }

    /* renamed from: e */
    public synchronized void mo70892e(String str) {
        if (this.f28970c.containsKey(str)) {
            this.f28970c.remove(str);
        }
    }

    /* renamed from: f */
    public synchronized void mo70893f(String str) {
        if (this.f28969b.containsKey(str)) {
            this.f28969b.remove(str);
        }
    }

    /* renamed from: b */
    public synchronized JSONObject mo70887b(String str) {
        if (this.f28970c.containsKey(str)) {
            return this.f28970c.get(str);
        }
        return new JSONObject();
    }

    /* renamed from: c */
    public synchronized JSONObject mo70889c(String str) {
        if (this.f28969b.containsKey(str)) {
            return this.f28969b.get(str);
        }
        return new JSONObject();
    }

    /* renamed from: a */
    public synchronized void mo70886a(String str, JSONObject jSONObject) {
        this.f28971d.put(str, jSONObject);
    }

    /* renamed from: a */
    public synchronized JSONObject mo70885a(String str) {
        if (this.f28971d.containsKey(str)) {
            return this.f28971d.get(str);
        }
        return new JSONObject();
    }
}
