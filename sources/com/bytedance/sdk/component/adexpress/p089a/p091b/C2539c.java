package com.bytedance.sdk.component.adexpress.p089a.p091b;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.adexpress.p089a.p090a.C2529a;
import com.bytedance.sdk.component.adexpress.p089a.p092c.C2546b;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.sdk.component.adexpress.a.b.c */
/* compiled from: TmplDbHelper */
public class C2539c {

    /* renamed from: a */
    private static volatile C2539c f5356a;

    /* renamed from: b */
    private Set<String> f5357b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    private Object f5358c = new Object();

    /* renamed from: d */
    private LruCache<String, C2546b> f5359d = new LruCache<String, C2546b>(2000) {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int sizeOf(String str, C2546b bVar) {
            return 1;
        }
    };

    /* renamed from: a */
    public static C2539c m6394a() {
        if (f5356a == null) {
            synchronized (C2539c.class) {
                if (f5356a == null) {
                    f5356a = new C2539c();
                }
            }
        }
        return f5356a;
    }

    private C2539c() {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ca, code lost:
        if (r11 != null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cc, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d8, code lost:
        if (r11 == null) goto L_0x00e2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.component.adexpress.p089a.p092c.C2546b mo16580a(java.lang.String r11) {
        /*
            r10 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = 0
            if (r0 != 0) goto L_0x00e6
            com.bytedance.sdk.component.adexpress.a.a.a r0 = com.bytedance.sdk.component.adexpress.p089a.p090a.C2529a.m6339a()
            com.bytedance.sdk.component.adexpress.a.a.b r0 = r0.mo16549b()
            if (r0 != 0) goto L_0x0013
            goto L_0x00e6
        L_0x0013:
            java.lang.Object r0 = r10.f5358c
            monitor-enter(r0)
            android.util.LruCache<java.lang.String, com.bytedance.sdk.component.adexpress.a.c.b> r2 = r10.f5359d     // Catch:{ all -> 0x00e3 }
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x00e3 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x00e3 }
            com.bytedance.sdk.component.adexpress.a.c.b r2 = (com.bytedance.sdk.component.adexpress.p089a.p092c.C2546b) r2     // Catch:{ all -> 0x00e3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e3 }
            if (r2 == 0) goto L_0x0026
            return r2
        L_0x0026:
            com.bytedance.sdk.component.adexpress.a.a.a r0 = com.bytedance.sdk.component.adexpress.p089a.p090a.C2529a.m6339a()
            com.bytedance.sdk.component.adexpress.a.a.b r2 = r0.mo16549b()
            java.lang.String r3 = "template_diff_new"
            r4 = 0
            java.lang.String r5 = "id=?"
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]
            r0 = 0
            r6[r0] = r11
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r11 = r2.mo16555a(r3, r4, r5, r6, r7, r8, r9)
            if (r11 == 0) goto L_0x00e2
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00ca
            java.lang.String r0 = "rit"
            int r0 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r2 = "id"
            int r2 = r11.getColumnIndex(r2)     // Catch:{ all -> 0x00d0 }
            java.lang.String r2 = r11.getString(r2)     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = "md5"
            int r3 = r11.getColumnIndex(r3)     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = r11.getString(r3)     // Catch:{ all -> 0x00d0 }
            java.lang.String r4 = "url"
            int r4 = r11.getColumnIndex(r4)     // Catch:{ all -> 0x00d0 }
            java.lang.String r4 = r11.getString(r4)     // Catch:{ all -> 0x00d0 }
            java.lang.String r5 = "data"
            int r5 = r11.getColumnIndex(r5)     // Catch:{ all -> 0x00d0 }
            java.lang.String r5 = r11.getString(r5)     // Catch:{ all -> 0x00d0 }
            java.lang.String r6 = "version"
            int r6 = r11.getColumnIndex(r6)     // Catch:{ all -> 0x00d0 }
            java.lang.String r6 = r11.getString(r6)     // Catch:{ all -> 0x00d0 }
            java.lang.String r7 = "update_time"
            int r7 = r11.getColumnIndex(r7)     // Catch:{ all -> 0x00d0 }
            long r7 = r11.getLong(r7)     // Catch:{ all -> 0x00d0 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x00d0 }
            com.bytedance.sdk.component.adexpress.a.c.b r8 = new com.bytedance.sdk.component.adexpress.a.c.b     // Catch:{ all -> 0x00d0 }
            r8.<init>()     // Catch:{ all -> 0x00d0 }
            com.bytedance.sdk.component.adexpress.a.c.b r0 = r8.mo16612a((java.lang.String) r0)     // Catch:{ all -> 0x00d0 }
            com.bytedance.sdk.component.adexpress.a.c.b r0 = r0.mo16614b(r2)     // Catch:{ all -> 0x00d0 }
            com.bytedance.sdk.component.adexpress.a.c.b r0 = r0.mo16616c(r3)     // Catch:{ all -> 0x00d0 }
            com.bytedance.sdk.component.adexpress.a.c.b r0 = r0.mo16618d(r4)     // Catch:{ all -> 0x00d0 }
            com.bytedance.sdk.component.adexpress.a.c.b r0 = r0.mo16620e(r5)     // Catch:{ all -> 0x00d0 }
            com.bytedance.sdk.component.adexpress.a.c.b r0 = r0.mo16622f(r6)     // Catch:{ all -> 0x00d0 }
            com.bytedance.sdk.component.adexpress.a.c.b r0 = r0.mo16611a((java.lang.Long) r7)     // Catch:{ all -> 0x00d0 }
            java.lang.Object r3 = r10.f5358c     // Catch:{ all -> 0x00d0 }
            monitor-enter(r3)     // Catch:{ all -> 0x00d0 }
            android.util.LruCache<java.lang.String, com.bytedance.sdk.component.adexpress.a.c.b> r4 = r10.f5359d     // Catch:{ all -> 0x00c7 }
            r4.put(r2, r0)     // Catch:{ all -> 0x00c7 }
            monitor-exit(r3)     // Catch:{ all -> 0x00c7 }
            java.util.Set<java.lang.String> r3 = r10.f5357b     // Catch:{ all -> 0x00d0 }
            r3.add(r2)     // Catch:{ all -> 0x00d0 }
            if (r11 == 0) goto L_0x00c6
            r11.close()
        L_0x00c6:
            return r0
        L_0x00c7:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00c7 }
            throw r0     // Catch:{ all -> 0x00d0 }
        L_0x00ca:
            if (r11 == 0) goto L_0x00e2
        L_0x00cc:
            r11.close()
            goto L_0x00e2
        L_0x00d0:
            r0 = move-exception
            java.lang.String r2 = "TmplDbHelper"
            java.lang.String r3 = "getTemplate error"
            com.bytedance.sdk.component.utils.C2905l.m8115c(r2, r3, r0)     // Catch:{ all -> 0x00db }
            if (r11 == 0) goto L_0x00e2
            goto L_0x00cc
        L_0x00db:
            r0 = move-exception
            if (r11 == 0) goto L_0x00e1
            r11.close()
        L_0x00e1:
            throw r0
        L_0x00e2:
            return r1
        L_0x00e3:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e3 }
            throw r11
        L_0x00e6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.p089a.p091b.C2539c.mo16580a(java.lang.String):com.bytedance.sdk.component.adexpress.a.c.b");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Set<String> mo16584b(String str) {
        if (!TextUtils.isEmpty(str) && C2529a.m6339a().mo16549b() != null) {
            HashSet hashSet = new HashSet();
            Cursor a = C2529a.m6339a().mo16549b().mo16555a("template_diff_new", (String[]) null, "rit=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (a != null) {
                while (a.moveToNext()) {
                    try {
                        hashSet.add(a.getString(a.getColumnIndex("id")));
                    } finally {
                        if (a != null) {
                            a.close();
                        }
                    }
                }
                return hashSet;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b8, code lost:
        if (r1 != null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ba, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c6, code lost:
        if (r1 == null) goto L_0x00d0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.bytedance.sdk.component.adexpress.p089a.p092c.C2546b> mo16583b() {
        /*
            r10 = this;
            com.bytedance.sdk.component.adexpress.a.a.a r0 = com.bytedance.sdk.component.adexpress.p089a.p090a.C2529a.m6339a()
            com.bytedance.sdk.component.adexpress.a.a.b r0 = r0.mo16549b()
            if (r0 != 0) goto L_0x000c
            r0 = 0
            return r0
        L_0x000c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bytedance.sdk.component.adexpress.a.a.a r1 = com.bytedance.sdk.component.adexpress.p089a.p090a.C2529a.m6339a()
            com.bytedance.sdk.component.adexpress.a.a.b r2 = r1.mo16549b()
            java.lang.String r3 = "template_diff_new"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r1 = r2.mo16555a(r3, r4, r5, r6, r7, r8, r9)
            if (r1 == 0) goto L_0x00d0
        L_0x0027:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x00be }
            if (r2 == 0) goto L_0x00b8
            java.lang.String r2 = "rit"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ all -> 0x00be }
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x00be }
            java.lang.String r3 = "id"
            int r3 = r1.getColumnIndex(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r3 = r1.getString(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r4 = "md5"
            int r4 = r1.getColumnIndex(r4)     // Catch:{ all -> 0x00be }
            java.lang.String r4 = r1.getString(r4)     // Catch:{ all -> 0x00be }
            java.lang.String r5 = "url"
            int r5 = r1.getColumnIndex(r5)     // Catch:{ all -> 0x00be }
            java.lang.String r5 = r1.getString(r5)     // Catch:{ all -> 0x00be }
            java.lang.String r6 = "data"
            int r6 = r1.getColumnIndex(r6)     // Catch:{ all -> 0x00be }
            java.lang.String r6 = r1.getString(r6)     // Catch:{ all -> 0x00be }
            java.lang.String r7 = "version"
            int r7 = r1.getColumnIndex(r7)     // Catch:{ all -> 0x00be }
            java.lang.String r7 = r1.getString(r7)     // Catch:{ all -> 0x00be }
            java.lang.String r8 = "update_time"
            int r8 = r1.getColumnIndex(r8)     // Catch:{ all -> 0x00be }
            long r8 = r1.getLong(r8)     // Catch:{ all -> 0x00be }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x00be }
            com.bytedance.sdk.component.adexpress.a.c.b r9 = new com.bytedance.sdk.component.adexpress.a.c.b     // Catch:{ all -> 0x00be }
            r9.<init>()     // Catch:{ all -> 0x00be }
            com.bytedance.sdk.component.adexpress.a.c.b r2 = r9.mo16612a((java.lang.String) r2)     // Catch:{ all -> 0x00be }
            com.bytedance.sdk.component.adexpress.a.c.b r2 = r2.mo16614b(r3)     // Catch:{ all -> 0x00be }
            com.bytedance.sdk.component.adexpress.a.c.b r2 = r2.mo16616c(r4)     // Catch:{ all -> 0x00be }
            com.bytedance.sdk.component.adexpress.a.c.b r2 = r2.mo16618d(r5)     // Catch:{ all -> 0x00be }
            com.bytedance.sdk.component.adexpress.a.c.b r2 = r2.mo16620e(r6)     // Catch:{ all -> 0x00be }
            com.bytedance.sdk.component.adexpress.a.c.b r2 = r2.mo16622f(r7)     // Catch:{ all -> 0x00be }
            com.bytedance.sdk.component.adexpress.a.c.b r2 = r2.mo16611a((java.lang.Long) r8)     // Catch:{ all -> 0x00be }
            r0.add(r2)     // Catch:{ all -> 0x00be }
            java.lang.Object r2 = r10.f5358c     // Catch:{ all -> 0x00be }
            monitor-enter(r2)     // Catch:{ all -> 0x00be }
            android.util.LruCache<java.lang.String, com.bytedance.sdk.component.adexpress.a.c.b> r4 = r10.f5359d     // Catch:{ all -> 0x00b5 }
            int r5 = r0.size()     // Catch:{ all -> 0x00b5 }
            int r5 = r5 + -1
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x00b5 }
            r4.put(r3, r5)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b5 }
            java.util.Set<java.lang.String> r2 = r10.f5357b     // Catch:{ all -> 0x00be }
            r2.add(r3)     // Catch:{ all -> 0x00be }
            goto L_0x0027
        L_0x00b5:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b5 }
            throw r3     // Catch:{ all -> 0x00be }
        L_0x00b8:
            if (r1 == 0) goto L_0x00d0
        L_0x00ba:
            r1.close()
            goto L_0x00d0
        L_0x00be:
            r2 = move-exception
            java.lang.String r3 = "TmplDbHelper"
            java.lang.String r4 = "getTemplate error"
            com.bytedance.sdk.component.utils.C2905l.m8115c(r3, r4, r2)     // Catch:{ all -> 0x00c9 }
            if (r1 == 0) goto L_0x00d0
            goto L_0x00ba
        L_0x00c9:
            r0 = move-exception
            if (r1 == 0) goto L_0x00cf
            r1.close()
        L_0x00cf:
            throw r0
        L_0x00d0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.p089a.p091b.C2539c.mo16583b():java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16581a(C2546b bVar) {
        if (bVar != null && C2529a.m6339a().mo16549b() != null && !TextUtils.isEmpty(bVar.mo16615b())) {
            Cursor a = C2529a.m6339a().mo16549b().mo16555a("template_diff_new", (String[]) null, "id=?", new String[]{bVar.mo16615b()}, (String) null, (String) null, (String) null);
            boolean z = a != null && a.getCount() > 0;
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable unused) {
                }
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("rit", bVar.mo16613a());
            contentValues.put("id", bVar.mo16615b());
            contentValues.put(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_MD5, bVar.mo16617c());
            contentValues.put("url", bVar.mo16619d());
            contentValues.put("data", bVar.mo16621e());
            contentValues.put("version", bVar.mo16623f());
            contentValues.put("update_time", bVar.mo16624g());
            if (z) {
                C2529a.m6339a().mo16549b().mo16553a("template_diff_new", contentValues, "id=?", new String[]{bVar.mo16615b()});
            } else {
                C2529a.m6339a().mo16549b().mo16556a("template_diff_new", contentValues);
            }
            synchronized (this.f5358c) {
                this.f5359d.put(bVar.mo16615b(), bVar);
            }
            this.f5357b.add(bVar.mo16615b());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16582a(Set<String> set) {
        if (set != null && !set.isEmpty() && C2529a.m6339a().mo16549b() != null) {
            String[] strArr = (String[]) set.toArray(new String[set.size()]);
            if (strArr.length > 0) {
                for (int i = 0; i < strArr.length; i++) {
                    m6396c(strArr[i]);
                    C2529a.m6339a().mo16549b().mo16554a("template_diff_new", "id=?", new String[]{strArr[i]});
                }
            }
        }
    }

    /* renamed from: c */
    private void m6396c(String str) {
        LruCache<String, C2546b> lruCache;
        if (!TextUtils.isEmpty(str) && (lruCache = this.f5359d) != null && lruCache.size() > 0) {
            synchronized (this.f5358c) {
                this.f5359d.remove(str);
            }
        }
    }

    /* renamed from: c */
    public static String m6395c() {
        return "CREATE TABLE IF NOT EXISTS " + "template_diff_new" + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," + "rit" + " TEXT ," + "id" + " TEXT UNIQUE," + AdvertisementDBAdapter.AdvertisementColumns.COLUMN_MD5 + " TEXT ," + "url" + " TEXT , " + "data" + " TEXT , " + "version" + " TEXT , " + "update_time" + " TEXT" + ")";
    }
}
