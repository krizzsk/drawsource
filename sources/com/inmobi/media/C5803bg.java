package com.inmobi.media;

import android.content.ContentValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.inmobi.media.bg */
/* compiled from: AssetDao */
public class C5803bg {

    /* renamed from: a */
    public static final String[] f14593a = {"id", "pending_attempts", "url", "disk_uri", CampaignEx.JSON_KEY_ST_TS, "created_ts", "ttl", "soft_ttl"};

    /* renamed from: b */
    private static final String f14594b = C5803bg.class.getSimpleName();

    /* renamed from: com.inmobi.media.bg$a */
    /* compiled from: AssetDao */
    static class C5804a {

        /* renamed from: a */
        static final C5803bg f14595a = new C5803bg((byte) 0);
    }

    /* synthetic */ C5803bg(byte b) {
        this();
    }

    /* renamed from: a */
    public static C5803bg m17287a() {
        return C5804a.f14595a;
    }

    private C5803bg() {
        C6164hh a = C6164hh.m18246a();
        a.mo35362a("asset", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, disk_uri TEXT, ts TEXT NOT NULL, created_ts TEXT NOT NULL, ttl TEXT NOT NULL, soft_ttl TEXT NOT NULL)");
        a.mo35365b();
    }

    /* renamed from: a */
    public final synchronized void mo34776a(C5784ax axVar) {
        if (m17288b(axVar) <= 0) {
            ContentValues d = m17293d(axVar);
            C6164hh a = C6164hh.m18246a();
            a.mo35359a("asset", d);
            a.mo35365b();
        }
    }

    /* renamed from: b */
    static C5784ax m17289b() {
        List<ContentValues> a = C6164hh.m18246a().mo35360a("asset", f14593a, (String) null, (String[]) null, (String) null, (String) null, "ts ASC ", (String) null);
        if (a.size() == 0) {
            return null;
        }
        return m17285a(a.get(0));
    }

    /* renamed from: c */
    static List<C5784ax> m17291c() {
        ArrayList<C5784ax> arrayList = new ArrayList<>();
        C6164hh a = C6164hh.m18246a();
        for (ContentValues a2 : a.mo35360a("asset", f14593a, (String) null, (String[]) null, (String) null, (String) null, "ts ASC ", (String) null)) {
            arrayList.add(m17285a(a2));
        }
        a.mo35365b();
        ArrayList arrayList2 = new ArrayList();
        for (C5784ax axVar : arrayList) {
            if (!axVar.mo34693a()) {
                arrayList2.add(axVar);
            }
        }
        return arrayList2;
    }

    /* renamed from: d */
    static List<C5784ax> m17294d() {
        ArrayList arrayList = new ArrayList();
        C6164hh a = C6164hh.m18246a();
        if (a.mo35357a("asset") == 0) {
            return arrayList;
        }
        List<ContentValues> a2 = a.mo35360a("asset", f14593a, "disk_uri IS NOT NULL", (String[]) null, (String) null, (String) null, "created_ts DESC ", (String) null);
        a.mo35365b();
        for (ContentValues a3 : a2) {
            arrayList.add(m17285a(a3));
        }
        return arrayList;
    }

    /* renamed from: e */
    public static String m17295e() {
        List<C5784ax> d = m17294d();
        if (d.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (C5784ax axVar : d) {
            try {
                jSONArray.put(URLEncoder.encode(axVar.f14523d, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return jSONArray.toString();
    }

    /* renamed from: a */
    static C5784ax m17286a(String str) {
        C6164hh a = C6164hh.m18246a();
        List<ContentValues> a2 = a.mo35360a("asset", f14593a, "url=? ", new String[]{str}, (String) null, (String) null, "created_ts DESC ", "1");
        a.mo35365b();
        if (a2.isEmpty()) {
            return null;
        }
        return m17285a(a2.get(0));
    }

    /* renamed from: f */
    public static List<String> m17296f() {
        ArrayList arrayList = new ArrayList();
        C6164hh a = C6164hh.m18246a();
        if (a.mo35357a("asset") == 0) {
            return arrayList;
        }
        List<ContentValues> a2 = a.mo35360a("asset", new String[]{"url"}, (String) null, (String[]) null, (String) null, (String) null, "created_ts DESC ", (String) null);
        a.mo35365b();
        for (ContentValues asString : a2) {
            arrayList.add(asString.getAsString("url"));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static C5784ax m17290b(String str) {
        C6164hh a = C6164hh.m18246a();
        List<ContentValues> a2 = a.mo35360a("asset", f14593a, "url=? ", new String[]{str}, (String) null, (String) null, "created_ts DESC ", "1");
        a.mo35365b();
        if (a2.isEmpty()) {
            return null;
        }
        return m17285a(a2.get(0));
    }

    /* renamed from: b */
    public static int m17288b(C5784ax axVar) {
        C6164hh a = C6164hh.m18246a();
        int b = a.mo35363b("asset", m17293d(axVar), "url = ?", new String[]{String.valueOf(axVar.f14523d)});
        a.mo35365b();
        return b;
    }

    /* renamed from: c */
    public static void m17292c(C5784ax axVar) {
        C6164hh a = C6164hh.m18246a();
        a.mo35358a("asset", "id = ?", new String[]{String.valueOf(axVar.f14521b)});
        a.mo35365b();
    }

    /* renamed from: a */
    public static C5784ax m17285a(ContentValues contentValues) {
        return new C5784ax(contentValues.getAsInteger("id").intValue(), contentValues.getAsString("url"), contentValues.getAsString("disk_uri"), contentValues.getAsInteger("pending_attempts").intValue(), Long.valueOf(contentValues.getAsString(CampaignEx.JSON_KEY_ST_TS)).longValue(), Long.valueOf(contentValues.getAsString("created_ts")).longValue(), Long.valueOf(contentValues.getAsString("ttl")).longValue(), Long.valueOf(contentValues.getAsString("soft_ttl")).longValue());
    }

    /* renamed from: d */
    private static ContentValues m17293d(C5784ax axVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(axVar.f14521b));
        contentValues.put("url", axVar.f14523d);
        contentValues.put("disk_uri", axVar.f14524e);
        contentValues.put("pending_attempts", Integer.valueOf(axVar.f14522c));
        contentValues.put(CampaignEx.JSON_KEY_ST_TS, Long.toString(axVar.f14525f));
        contentValues.put("created_ts", Long.toString(axVar.f14526g));
        contentValues.put("ttl", Long.toString(axVar.f14527h));
        contentValues.put("soft_ttl", Long.toString(axVar.f14528i));
        return contentValues;
    }
}
