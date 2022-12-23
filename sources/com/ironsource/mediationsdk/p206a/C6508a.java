package com.ironsource.mediationsdk.p206a;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.a */
abstract class C6508a {

    /* renamed from: a */
    JSONObject f16734a;

    /* renamed from: b */
    int f16735b;

    /* renamed from: c */
    String f16736c;

    /* renamed from: d */
    private final String f16737d = "eventId";

    /* renamed from: e */
    private final String f16738e = "timestamp";

    /* renamed from: f */
    private final String f16739f = "InterstitialEvents";

    /* renamed from: g */
    private final String f16740g = "events";

    /* renamed from: h */
    private final String f16741h = "events";

    C6508a() {
    }

    /* renamed from: a */
    static JSONObject m19679a(C6517c cVar) {
        try {
            JSONObject jSONObject = !TextUtils.isEmpty(cVar.mo36372c()) ? new JSONObject(cVar.mo36372c()) : new JSONObject();
            jSONObject.put("eventId", cVar.mo36368a());
            jSONObject.put("timestamp", cVar.mo36371b());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo36331a() {
        return TextUtils.isEmpty(this.f16736c) ? mo36334b() : this.f16736c;
    }

    /* renamed from: a */
    public abstract String mo36332a(ArrayList<C6517c> arrayList, JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo36333a(JSONArray jSONArray) {
        try {
            if (this.f16734a == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(this.f16734a.toString());
            jSONObject.put("timestamp", IronSourceUtils.getTimeStamp());
            String str = "events";
            if (this.f16735b == 2) {
                str = "InterstitialEvents";
            }
            jSONObject.put(str, jSONArray);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo36334b();

    /* renamed from: c */
    public abstract String mo36335c();
}
