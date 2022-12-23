package com.inmobi.media;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.jt */
/* compiled from: InMobiUnifiedIdKeyStoreInterface */
public final class C6272jt {

    /* renamed from: a */
    private static final Object f15794a = new Object();

    /* renamed from: b */
    private static final Object f15795b = new Object();

    /* renamed from: c */
    private static boolean f15796c = false;

    /* renamed from: d */
    private static boolean f15797d = false;

    /* renamed from: e */
    private static JSONObject f15798e = null;

    /* renamed from: f */
    private static JSONObject f15799f = null;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|14|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m18651a() {
        /*
            java.lang.Object r0 = f15794a
            monitor-enter(r0)
            boolean r1 = f15796c     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x000b
            org.json.JSONObject r1 = f15798e     // Catch:{ all -> 0x002e }
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return r1
        L_0x000b:
            r1 = 1
            f15796c = r1     // Catch:{ all -> 0x002e }
            android.content.Context r1 = com.inmobi.media.C6183hw.m18324c()     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "unified_id_info_store"
            com.inmobi.media.hi r1 = com.inmobi.media.C6165hi.m18257a((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "ufids"
            java.lang.String r1 = r1.mo35372b(r2)     // Catch:{ all -> 0x002e }
            if (r1 != 0) goto L_0x0023
            r1 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return r1
        L_0x0023:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002a }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x002a }
            f15798e = r2     // Catch:{ JSONException -> 0x002a }
        L_0x002a:
            org.json.JSONObject r1 = f15798e     // Catch:{ all -> 0x002e }
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return r1
        L_0x002e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6272jt.m18651a():org.json.JSONObject");
    }

    /* renamed from: a */
    public static void m18652a(JSONObject jSONObject) {
        synchronized (f15794a) {
            f15798e = jSONObject;
            f15796c = true;
            Context c = C6183hw.m18324c();
            if (c != null) {
                if (f15798e == null) {
                    C6165hi.m18257a(c, "unified_id_info_store").mo35376e("ufids");
                } else {
                    C6165hi.m18257a(c, "unified_id_info_store").mo35369a("ufids", f15798e.toString());
                }
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m18654b(JSONObject jSONObject) {
        synchronized (C6272jt.class) {
            synchronized (f15795b) {
                f15799f = jSONObject;
                f15797d = true;
                Context c = C6183hw.m18324c();
                if (c != null) {
                    if (f15799f == null) {
                        C6165hi.m18257a(c, "unified_id_info_store").mo35376e("publisher_provided_unified_id");
                    } else {
                        C6165hi.m18257a(c, "unified_id_info_store").mo35369a("publisher_provided_unified_id", f15799f.toString());
                    }
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|14|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002a */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m18653b() {
        /*
            java.lang.Object r0 = f15795b
            monitor-enter(r0)
            boolean r1 = f15797d     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x000b
            org.json.JSONObject r1 = f15799f     // Catch:{ all -> 0x002e }
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return r1
        L_0x000b:
            r1 = 1
            f15797d = r1     // Catch:{ all -> 0x002e }
            android.content.Context r1 = com.inmobi.media.C6183hw.m18324c()     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "unified_id_info_store"
            com.inmobi.media.hi r1 = com.inmobi.media.C6165hi.m18257a((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "publisher_provided_unified_id"
            java.lang.String r1 = r1.mo35372b(r2)     // Catch:{ all -> 0x002e }
            if (r1 != 0) goto L_0x0023
            r1 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return r1
        L_0x0023:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002a }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x002a }
            f15799f = r2     // Catch:{ JSONException -> 0x002a }
        L_0x002a:
            org.json.JSONObject r1 = f15799f     // Catch:{ all -> 0x002e }
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return r1
        L_0x002e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6272jt.m18653b():org.json.JSONObject");
    }

    /* renamed from: c */
    public static void m18655c() {
        m18651a();
        m18653b();
    }

    /* renamed from: d */
    public static void m18656d() {
        f15797d = false;
        f15796c = false;
        m18652a((JSONObject) null);
        m18654b((JSONObject) null);
    }
}
