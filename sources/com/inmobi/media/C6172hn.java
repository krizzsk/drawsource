package com.inmobi.media;

import android.content.ContentValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: com.inmobi.media.hn */
/* compiled from: TelemetryEvent */
public class C6172hn {

    /* renamed from: a */
    int f15584a;

    /* renamed from: b */
    String f15585b;

    /* renamed from: c */
    long f15586c;

    /* renamed from: d */
    String f15587d;

    public C6172hn(String str) {
        this.f15585b = str;
        this.f15587d = null;
        this.f15586c = System.currentTimeMillis();
    }

    private C6172hn(String str, String str2) {
        this.f15585b = str;
        this.f15587d = str2;
        this.f15586c = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final String mo35380a() {
        String str = this.f15587d;
        return str == null ? "" : str;
    }

    public String toString() {
        return this.f15585b + " ";
    }

    /* renamed from: a */
    public static C6172hn m18288a(ContentValues contentValues) {
        String asString = contentValues.getAsString("eventType");
        String asString2 = contentValues.getAsString("payload");
        long longValue = Long.valueOf(contentValues.getAsString(CampaignEx.JSON_KEY_ST_TS)).longValue();
        C6172hn hnVar = new C6172hn(asString, asString2);
        hnVar.f15586c = longValue;
        hnVar.f15584a = contentValues.getAsInteger("id").intValue();
        return hnVar;
    }
}
