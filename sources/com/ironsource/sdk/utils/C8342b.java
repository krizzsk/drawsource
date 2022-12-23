package com.ironsource.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ironsource.sdk.p285g.C8300f;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.utils.b */
public class C8342b {

    /* renamed from: b */
    private static C8342b f20329b;

    /* renamed from: a */
    public SharedPreferences f20330a;

    static {
        C8342b.class.getSimpleName();
    }

    private C8342b(Context context) {
        this.f20330a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    /* renamed from: a */
    public static synchronized C8342b m23758a() {
        C8342b bVar;
        synchronized (C8342b.class) {
            bVar = f20329b;
        }
        return bVar;
    }

    /* renamed from: a */
    public static synchronized C8342b m23759a(Context context) {
        C8342b bVar;
        synchronized (C8342b.class) {
            if (f20329b == null) {
                f20329b = new C8342b(context);
            }
            bVar = f20329b;
        }
        return bVar;
    }

    /* renamed from: b */
    public static boolean m23760b(String str) {
        return str.matches("^\\d+_\\d+$");
    }

    /* renamed from: c */
    private String m23761c() {
        return this.f20330a.getString("version", "-1");
    }

    /* renamed from: a */
    public final void mo56792a(String str) {
        if (!m23761c().equalsIgnoreCase(str)) {
            SharedPreferences.Editor edit = this.f20330a.edit();
            edit.putString("version", str);
            edit.apply();
        }
    }

    /* renamed from: a */
    public final boolean mo56793a(String str, String str2, String str3) {
        String string = this.f20330a.getString("ssaUserData", (String) null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2.isNull(str3)) {
                return false;
            }
            jSONObject2.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor edit = this.f20330a.edit();
            edit.putString("ssaUserData", jSONObject.toString());
            edit.apply();
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public final List<String> mo56794b() {
        String string = this.f20330a.getString("search_keys", (String) null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            C8300f fVar = new C8300f(string);
            if (fVar.mo56743a("searchKeys")) {
                try {
                    arrayList.addAll(fVar.mo56740a((JSONArray) fVar.mo56745c("searchKeys")));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return arrayList;
    }
}
