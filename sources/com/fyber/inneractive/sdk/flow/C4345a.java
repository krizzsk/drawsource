package com.fyber.inneractive.sdk.flow;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.C4252h;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.metrics.C4412a;
import com.fyber.inneractive.sdk.network.C4509p;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5312s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.a */
public class C4345a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InneractiveError f10660a;

    /* renamed from: b */
    public final /* synthetic */ C4347b f10661b;

    public C4345a(C4347b bVar, InneractiveError inneractiveError) {
        this.f10661b = bVar;
        this.f10660a = inneractiveError;
    }

    public void run() {
        String str;
        String str2;
        T t = this.f10661b.f10666b;
        if (t != null && (str = t.f13872h) != null) {
            Map<String, String> map = t.f13880p;
            if (map != null || t.f13881q != null) {
                IAConfigManager iAConfigManager = IAConfigManager.f10324J;
                C4252h hVar = iAConfigManager.f10356v.f10459b;
                String str3 = C4347b.f10664e;
                if (hVar.f10456a.containsKey("max_failed_creatives_interval_hours")) {
                    str3 = hVar.f10456a.get("max_failed_creatives_interval_hours");
                }
                C4252h hVar2 = iAConfigManager.f10356v.f10459b;
                String str4 = C4347b.f10665f;
                if (hVar2.f10456a.containsKey("max_failed_creatives_per_interval")) {
                    str4 = hVar2.f10456a.get("max_failed_creatives_per_interval");
                }
                int a = C5312s.m16530a(str3, 24);
                int a2 = C5312s.m16530a(str4, 1);
                Application application = C5292l.f14015a;
                if (application != null) {
                    SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigPrefs", 0);
                    JSONArray jSONArray = new JSONArray();
                    try {
                        jSONArray = new JSONArray(sharedPreferences.getString("lt", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
                    } catch (JSONException unused) {
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    C4347b bVar = this.f10661b;
                    bVar.getClass();
                    if (IAConfigManager.f10324J.f10356v.f10459b.mo24273a(bVar.f10831a, false) && !C4412a.m13570a(a, a2, jSONArray, copyOnWriteArrayList)) {
                        copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                        if (map != null) {
                            try {
                                str2 = new JSONObject(map).toString();
                            } catch (Throwable unused2) {
                                str2 = "";
                            }
                        } else {
                            str2 = this.f10661b.f10666b.f13881q;
                        }
                        C4347b bVar2 = this.f10661b;
                        InneractiveAdRequest inneractiveAdRequest = bVar2.f10667c;
                        T t2 = bVar2.f10666b;
                        InneractiveError inneractiveError = this.f10660a;
                        JSONArray jSONArray2 = bVar2.f10668d;
                        C4509p pVar = C4509p.IA_AD_FAILURE_DATA;
                        C4511q.C4512a aVar = new C4511q.C4512a(t2);
                        aVar.f11164c = pVar;
                        aVar.f11162a = inneractiveAdRequest;
                        aVar.f11165d = jSONArray2;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("raw_response", str);
                        } catch (Exception unused3) {
                            IAlog.m16450e("Got exception adding param to json object: %s, %s", "raw_response", str);
                        }
                        try {
                            jSONObject.put("headers", str2);
                        } catch (Exception unused4) {
                            IAlog.m16450e("Got exception adding param to json object: %s, %s", "headers", str2);
                        }
                        String description = inneractiveError.description();
                        try {
                            jSONObject.put("error_code", description);
                        } catch (Exception unused5) {
                            IAlog.m16450e("Got exception adding param to json object: %s, %s", "error_code", description);
                        }
                        aVar.f11167f.put(jSONObject);
                        aVar.mo24693a((String) null);
                    }
                    sharedPreferences.edit().putString("lt", new JSONArray(copyOnWriteArrayList).toString()).apply();
                }
            }
        }
    }
}
