package com.ironsource.mediationsdk.p206a;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.c */
public class C6517c {

    /* renamed from: a */
    private int f16798a = -1;

    /* renamed from: b */
    private long f16799b = -1;

    /* renamed from: c */
    private JSONObject f16800c;

    public C6517c(int i, long j, JSONObject jSONObject) {
        this.f16798a = i;
        this.f16799b = j;
        this.f16800c = jSONObject;
    }

    public C6517c(int i, JSONObject jSONObject) {
        this.f16798a = i;
        this.f16799b = System.currentTimeMillis();
        if (jSONObject == null) {
            this.f16800c = new JSONObject();
        } else {
            this.f16800c = jSONObject;
        }
    }

    /* renamed from: a */
    static C6508a m19724a(String str, int i) {
        if ("ironbeast".equals(str)) {
            return new C6519e(i);
        }
        if ("outcome".equals(str)) {
            return new C6520f(i);
        }
        if (i == 2) {
            return new C6519e(i);
        }
        if (i == 3) {
            return new C6520f(i);
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
        logger.log(ironSourceTag, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i + ")", 2);
        return null;
    }

    /* renamed from: a */
    public int mo36368a() {
        return this.f16798a;
    }

    /* renamed from: a */
    public void mo36369a(int i) {
        this.f16798a = i;
    }

    /* renamed from: a */
    public void mo36370a(String str, Object obj) {
        try {
            this.f16800c.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public long mo36371b() {
        return this.f16799b;
    }

    /* renamed from: c */
    public String mo36372c() {
        return this.f16800c.toString();
    }

    /* renamed from: d */
    public JSONObject mo36373d() {
        return this.f16800c;
    }
}
