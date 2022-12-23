package com.inmobi.media;

import android.net.Uri;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.az */
/* compiled from: AdAssetFetcher */
public final class C5787az {

    /* renamed from: b */
    private static final String f14550b = C5787az.class.getSimpleName();

    /* renamed from: a */
    C5805bh f14551a;

    C5787az(C5805bh bhVar) {
        this.f14551a = bhVar;
    }

    /* renamed from: a */
    static String m17191a(C5784ax axVar, File file, long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", axVar.f14523d);
            jSONObject.put("saved_url", Uri.fromFile(file));
            jSONObject.put("size_in_bytes", file.length());
            jSONObject.put("download_started_at", j);
            jSONObject.put("download_ended_at", j2);
        } catch (JSONException e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        }
        return jSONObject.toString().replace("\"", "\\\"");
    }

    /* renamed from: a */
    static void m17192a(long j, long j2, long j3) {
        try {
            C6244je.m18561a().mo35474a(0);
            C6244je.m18561a().mo35475b(j2);
            C6244je.m18561a().mo35476c(j3 - j);
        } catch (Exception e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        }
    }
}
