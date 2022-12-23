package com.inmobi.media;

import android.content.ContentValues;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.gl */
/* compiled from: CrashEvent */
public class C6134gl {

    /* renamed from: g */
    private static final String f15451g = C6134gl.class.getSimpleName();

    /* renamed from: a */
    int f15452a;

    /* renamed from: b */
    String f15453b;

    /* renamed from: c */
    String f15454c;

    /* renamed from: d */
    String f15455d;

    /* renamed from: e */
    long f15456e;

    /* renamed from: f */
    protected String f15457f;

    public C6134gl(Thread thread, Throwable th) {
        this("crashReporting", "CrashEvent");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", th.getClass().getSimpleName());
            jSONObject.put("message", th.getMessage());
            jSONObject.put("stack", Log.getStackTraceString(th));
            jSONObject.put("thread", thread.getName());
            this.f15457f = jSONObject.toString();
        } catch (JSONException unused) {
        }
    }

    public C6134gl(String str, String str2) {
        this.f15453b = UUID.randomUUID().toString();
        this.f15455d = str;
        this.f15454c = str2;
        this.f15457f = null;
        this.f15456e = System.currentTimeMillis();
    }

    private C6134gl(String str, String str2, String str3, String str4) {
        this.f15453b = str;
        this.f15455d = str2;
        this.f15454c = str3;
        this.f15457f = str4;
        this.f15456e = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final String mo35321a() {
        String str = this.f15457f;
        return str == null ? "" : str;
    }

    public String toString() {
        return this.f15454c + "@" + this.f15455d + " ";
    }

    /* renamed from: a */
    public static C6134gl m18179a(ContentValues contentValues) {
        String asString = contentValues.getAsString("eventId");
        String asString2 = contentValues.getAsString("eventType");
        String asString3 = contentValues.getAsString("componentType");
        String asString4 = contentValues.getAsString("payload");
        long longValue = Long.valueOf(contentValues.getAsString(CampaignEx.JSON_KEY_ST_TS)).longValue();
        C6134gl glVar = new C6134gl(asString, asString3, asString2, asString4);
        glVar.f15456e = longValue;
        glVar.f15452a = contentValues.getAsInteger("id").intValue();
        return glVar;
    }
}
