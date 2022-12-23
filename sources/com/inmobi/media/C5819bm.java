package com.inmobi.media;

import android.content.ContentValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.bm */
/* compiled from: ClickDao */
public class C5819bm {

    /* renamed from: a */
    static final String[] f14638a = {"id", "pending_attempts", "url", "ping_in_webview", "follow_redirect", CampaignEx.JSON_KEY_ST_TS, "created_ts", "track_extras"};

    /* renamed from: b */
    private static final String f14639b = C5819bm.class.getSimpleName();

    C5819bm() {
        C6164hh a = C6164hh.m18246a();
        a.mo35362a("click", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )");
        a.mo35365b();
    }

    /* renamed from: a */
    public static boolean m17360a() {
        return C6164hh.m18246a().mo35357a("click") == 0;
    }

    /* renamed from: a */
    public final synchronized void mo34789a(C5818bl blVar, int i) {
        ContentValues b = m17361b(blVar);
        C6164hh a = C6164hh.m18246a();
        if (a.mo35357a("click") >= i) {
            C5818bl a2 = m17357a(a.mo35360a("click", f14638a, "ts= (SELECT MIN(ts) FROM click LIMIT 1)", (String[]) null, (String) null, (String) null, (String) null, (String) null).get(0));
            C5820bn.m17365a().mo34790a(blVar, "DB_OVERLOAD");
            m17359a(a2);
        }
        a.mo35359a("click", b);
        a.mo35365b();
    }

    /* renamed from: a */
    public static void m17359a(C5818bl blVar) {
        C6164hh a = C6164hh.m18246a();
        a.mo35358a("click", "id = ?", new String[]{String.valueOf(blVar.f14629a)});
        a.mo35365b();
    }

    /* renamed from: a */
    static C5818bl m17357a(ContentValues contentValues) {
        int intValue = contentValues.getAsInteger("id").intValue();
        int intValue2 = contentValues.getAsInteger("pending_attempts").intValue();
        String asString = contentValues.getAsString("url");
        long longValue = Long.valueOf(contentValues.getAsString(CampaignEx.JSON_KEY_ST_TS)).longValue();
        long longValue2 = Long.valueOf(contentValues.getAsString("created_ts")).longValue();
        boolean booleanValue = Boolean.valueOf(contentValues.getAsString("follow_redirect")).booleanValue();
        boolean booleanValue2 = Boolean.valueOf(contentValues.getAsString("ping_in_webview")).booleanValue();
        String asString2 = contentValues.getAsString("track_extras");
        HashMap hashMap = new HashMap();
        if (asString2 != null) {
            try {
                hashMap.putAll(m17358a(new JSONObject(asString2)));
            } catch (Exception | JSONException unused) {
            }
        }
        return new C5818bl(intValue, asString, hashMap, booleanValue, booleanValue2, intValue2, longValue, longValue2);
    }

    /* renamed from: b */
    static ContentValues m17361b(C5818bl blVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(blVar.f14629a));
        contentValues.put("url", blVar.f14630b);
        contentValues.put("pending_attempts", Integer.valueOf(blVar.f14634f));
        contentValues.put(CampaignEx.JSON_KEY_ST_TS, Long.toString(blVar.f14632d));
        contentValues.put("created_ts", Long.toString(blVar.f14633e));
        contentValues.put("follow_redirect", Boolean.toString(blVar.f14637i));
        contentValues.put("ping_in_webview", Boolean.toString(blVar.f14636h));
        if (blVar.f14631c != null && blVar.f14631c.size() > 0) {
            contentValues.put("track_extras", new JSONObject(blVar.f14631c).toString());
        }
        return contentValues;
    }

    /* renamed from: a */
    private static Map<String, String> m17358a(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, (String) jSONObject.get(next));
        }
        return hashMap;
    }
}
