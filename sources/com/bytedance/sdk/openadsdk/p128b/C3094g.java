package com.bytedance.sdk.openadsdk.p128b;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2900j;
import com.bytedance.sdk.openadsdk.core.C3388c;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.multipro.p179a.C3909a;
import com.tapjoy.TapjoyConstants;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.b.g */
/* compiled from: AdEventRepertoryImpl */
public class C3094g implements C3093f<C3060a> {

    /* renamed from: a */
    private final Context f7250a;

    /* renamed from: b */
    private final C3388c f7251b = C3388c.m10078a(mo18671c());

    /* renamed from: d */
    public String mo18672d() {
        return "adevent";
    }

    public C3094g(Context context) {
        this.f7250a = context;
    }

    /* renamed from: c */
    public Context mo18671c() {
        Context context = this.f7250a;
        return context == null ? C3513m.m10963a() : context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:11|(3:13|14|28)(1:27)|26|9|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        throw r9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0041 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047 A[Catch:{ all -> 0x0070 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<com.bytedance.sdk.openadsdk.p128b.C3060a> mo18661a(int r9, java.lang.String r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 0
            if (r9 <= 0) goto L_0x001e
            boolean r1 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0075 }
            if (r1 != 0) goto L_0x001e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r0.<init>()     // Catch:{ all -> 0x0075 }
            r0.append(r10)     // Catch:{ all -> 0x0075 }
            java.lang.String r10 = " DESC limit "
            r0.append(r10)     // Catch:{ all -> 0x0075 }
            r0.append(r9)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0075 }
        L_0x001e:
            r7 = r0
            java.util.LinkedList r9 = new java.util.LinkedList     // Catch:{ all -> 0x0075 }
            r9.<init>()     // Catch:{ all -> 0x0075 }
            com.bytedance.sdk.openadsdk.multipro.aidl.c r10 = new com.bytedance.sdk.openadsdk.multipro.aidl.c     // Catch:{ all -> 0x0075 }
            android.content.Context r0 = r8.mo18671c()     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = r8.mo18672d()     // Catch:{ all -> 0x0075 }
            java.lang.String r2 = "id"
            java.lang.String r3 = "value"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch:{ all -> 0x0075 }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.util.Map r0 = com.bytedance.sdk.openadsdk.multipro.p179a.C3909a.m12910a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0075 }
            r10.<init>(r0)     // Catch:{ all -> 0x0075 }
        L_0x0041:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = "id"
            int r0 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = "value"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ all -> 0x0070 }
            if (r1 == 0) goto L_0x0041
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0041 }
            r2.<init>(r1)     // Catch:{ all -> 0x0041 }
            com.bytedance.sdk.openadsdk.b.a r1 = new com.bytedance.sdk.openadsdk.b.a     // Catch:{ all -> 0x0041 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0041 }
            r9.add(r1)     // Catch:{ all -> 0x0041 }
            goto L_0x0041
        L_0x006b:
            r10.close()     // Catch:{ all -> 0x0075 }
            monitor-exit(r8)
            return r9
        L_0x0070:
            r9 = move-exception
            r10.close()     // Catch:{ all -> 0x0075 }
            throw r9     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p128b.C3094g.mo18661a(int, java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public synchronized void mo18664a(C3060a aVar) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", aVar.f7137a);
            contentValues.put("value", aVar.mo18566b().toString());
            contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
            contentValues.put(TapjoyConstants.TJC_RETRY, 0);
            C3909a.m12912a(mo18671c(), mo18672d(), contentValues);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public synchronized void mo18665a(List<C3060a> list) {
        if (!C2900j.m8097a(list)) {
            LinkedList linkedList = new LinkedList();
            for (C3060a aVar : list) {
                linkedList.add(aVar.f7137a);
            }
            C3909a.m12911a(mo18671c(), "DELETE FROM " + mo18672d() + " WHERE " + m8938a("id", linkedList, 1000, true));
        }
    }

    /* renamed from: a */
    public synchronized void mo18663a(int i, long j) {
        m8939b(i, j);
    }

    /* renamed from: b */
    private synchronized void m8939b(int i, long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        Context c = mo18671c();
        String d = mo18672d();
        C3909a.m12907a(c, d, "gen_time <? AND retry >?", new String[]{currentTimeMillis + "", i + ""});
    }

    /* renamed from: a */
    public synchronized void mo18666a(List<C3060a> list, int i, long j) {
        if (!C2900j.m8097a(list)) {
            try {
                m8940b(list);
                m8939b(i, j);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private synchronized void m8940b(List<C3060a> list) {
        LinkedList linkedList = new LinkedList();
        for (C3060a aVar : list) {
            linkedList.add(aVar.f7137a);
        }
        C3909a.m12911a(mo18671c(), "UPDATE " + mo18672d() + " SET " + TapjoyConstants.TJC_RETRY + " = " + TapjoyConstants.TJC_RETRY + "+1" + " WHERE " + m8938a("id", linkedList, 1000, true));
    }

    /* renamed from: a */
    public void mo18667a(boolean z) {
        this.f7251b.mo19367a("serverbusy_flag", z);
    }

    /* renamed from: a */
    public boolean mo18668a() {
        return this.f7251b.mo19371b("serverbusy_flag", false);
    }

    /* renamed from: b */
    public int mo18669b() {
        return this.f7251b.mo19368b("serverbusy_retrycount", 0);
    }

    /* renamed from: a */
    public void mo18662a(int i) {
        this.f7251b.mo19364a("serverbusy_retrycount", i);
    }

    /* renamed from: e */
    public static String m8941e() {
        return "CREATE TABLE IF NOT EXISTS " + "adevent" + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," + "id" + " TEXT UNIQUE," + "value" + " TEXT ," + "gen_time" + " TEXT , " + TapjoyConstants.TJC_RETRY + " INTEGER default 0" + ")";
    }

    /* renamed from: a */
    private static String m8938a(String str, List<?> list, int i, boolean z) {
        int i2;
        String str2 = z ? " IN " : " NOT IN ";
        String str3 = z ? " OR " : " AND ";
        int min = Math.min(i, 1000);
        int size = list.size();
        if (size % min == 0) {
            i2 = size / min;
        } else {
            i2 = (size / min) + 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * min;
            String a = m8937a(TextUtils.join("','", list.subList(i4, Math.min(i4 + min, size))), "");
            if (i3 != 0) {
                sb.append(str3);
            }
            sb.append(str);
            sb.append(str2);
            sb.append("('");
            sb.append(a);
            sb.append("')");
        }
        String sb2 = sb.toString();
        return m8937a(sb2, str + str2 + "('')");
    }

    /* renamed from: a */
    private static String m8937a(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
