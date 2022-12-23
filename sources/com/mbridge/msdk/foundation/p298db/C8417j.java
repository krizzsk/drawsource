package com.mbridge.msdk.foundation.p298db;

import com.mbridge.msdk.foundation.entity.C8461f;

/* renamed from: com.mbridge.msdk.foundation.db.j */
/* compiled from: FrequenceDao */
public final class C8417j extends C8403a<C8461f> {

    /* renamed from: a */
    private static C8417j f20558a;

    private C8417j(C8412f fVar) {
        super(fVar);
    }

    /* renamed from: a */
    public static synchronized C8417j m23986a(C8412f fVar) {
        C8417j jVar;
        synchronized (C8417j.class) {
            if (f20558a == null) {
                f20558a = new C8417j(fVar);
            }
            jVar = f20558a;
        }
        return jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r0 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r0 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004a, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long[] mo57030a() {
        /*
            r7 = this;
            java.lang.String r0 = "SELECT id FROM frequence WHERE fc_a<impression_count"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r7.getReadableDatabase()     // Catch:{ Exception -> 0x0044, all -> 0x003a }
            android.database.Cursor r0 = r2.rawQuery(r0, r1)     // Catch:{ Exception -> 0x0044, all -> 0x003a }
            if (r0 == 0) goto L_0x0037
            int r2 = r0.getCount()     // Catch:{ Exception -> 0x0045, all -> 0x0035 }
            if (r2 <= 0) goto L_0x0037
            int r2 = r0.getCount()     // Catch:{ Exception -> 0x0045, all -> 0x0035 }
            long[] r2 = new long[r2]     // Catch:{ Exception -> 0x0045, all -> 0x0035 }
            r3 = 0
        L_0x001a:
            boolean r4 = r0.moveToNext()     // Catch:{ Exception -> 0x0045, all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            java.lang.String r4 = "id"
            int r4 = r0.getColumnIndexOrThrow(r4)     // Catch:{ Exception -> 0x0045, all -> 0x0035 }
            long r4 = r0.getLong(r4)     // Catch:{ Exception -> 0x0045, all -> 0x0035 }
            r2[r3] = r4     // Catch:{ Exception -> 0x0045, all -> 0x0035 }
            int r3 = r3 + 1
            goto L_0x001a
        L_0x002f:
            if (r0 == 0) goto L_0x0034
            r0.close()
        L_0x0034:
            return r2
        L_0x0035:
            r1 = move-exception
            goto L_0x003e
        L_0x0037:
            if (r0 == 0) goto L_0x004a
            goto L_0x0047
        L_0x003a:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x003e:
            if (r0 == 0) goto L_0x0043
            r0.close()
        L_0x0043:
            throw r1
        L_0x0044:
            r0 = r1
        L_0x0045:
            if (r0 == 0) goto L_0x004a
        L_0x0047:
            r0.close()
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p298db.C8417j.mo57030a():long[]");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo57031b() {
        /*
            r4 = this;
            monitor-enter(r4)
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 - r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            r2.<init>()     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            java.lang.String r3 = "ts<"
            r2.append(r3)     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            r2.append(r0)     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            android.database.sqlite.SQLiteDatabase r1 = r4.getWritableDatabase()     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            if (r1 == 0) goto L_0x002e
            android.database.sqlite.SQLiteDatabase r1 = r4.getWritableDatabase()     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            java.lang.String r2 = "frequence"
            r3 = 0
            r1.delete(r2, r0, r3)     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            goto L_0x002e
        L_0x002b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x002e:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p298db.C8417j.mo57031b():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r1 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r1 == null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0045, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x004e, code lost:
        throw r5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo57029a(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r1 = 0
            monitor-enter(r5)     // Catch:{ Exception -> 0x0047, all -> 0x003e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x003b }
            r2.<init>()     // Catch:{ all -> 0x003b }
            java.lang.String r3 = "SELECT id FROM frequence WHERE id='"
            r2.append(r3)     // Catch:{ all -> 0x003b }
            r2.append(r5)     // Catch:{ all -> 0x003b }
            java.lang.String r3 = "'"
            r2.append(r3)     // Catch:{ all -> 0x003b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x003b }
            android.database.sqlite.SQLiteDatabase r3 = r4.getReadableDatabase()     // Catch:{ all -> 0x003b }
            android.database.Cursor r1 = r3.rawQuery(r2, r1)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0033
            int r2 = r1.getCount()     // Catch:{ all -> 0x003b }
            if (r2 <= 0) goto L_0x0033
            r2 = 1
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0031
            r1.close()     // Catch:{ all -> 0x0045 }
        L_0x0031:
            monitor-exit(r4)
            return r2
        L_0x0033:
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0039
            r1.close()     // Catch:{ all -> 0x0045 }
        L_0x0039:
            monitor-exit(r4)
            return r0
        L_0x003b:
            r2 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x003b }
            throw r2     // Catch:{ Exception -> 0x0047, all -> 0x003e }
        L_0x003e:
            r5 = move-exception
            if (r1 == 0) goto L_0x0044
            r1.close()     // Catch:{ all -> 0x0045 }
        L_0x0044:
            throw r5     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r5 = move-exception
            goto L_0x004d
        L_0x0047:
            if (r1 == 0) goto L_0x004f
            r1.close()     // Catch:{ all -> 0x0045 }
            goto L_0x004f
        L_0x004d:
            monitor-exit(r4)
            throw r5
        L_0x004f:
            monitor-exit(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p298db.C8417j.mo57029a(java.lang.String):boolean");
    }

    /* renamed from: b */
    public final synchronized void mo57032b(String str) {
        if (mo57029a(str)) {
            String str2 = "UPDATE frequence Set impression_count=impression_count+1 WHERE id=" + str;
            if (getReadableDatabase() != null) {
                getReadableDatabase().execSQL(str2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0078, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized long m23987b(com.mbridge.msdk.foundation.entity.C8461f r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = -1
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r2.<init>()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "id"
            java.lang.String r4 = r7.mo57721a()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "fc_a"
            int r4 = r7.mo57725b()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "fc_b"
            int r4 = r7.mo57727c()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "ts"
            long r4 = r7.mo57732f()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "impression_count"
            int r4 = r7.mo57729d()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "click_count"
            int r4 = r7.mo57731e()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "ts"
            long r4 = r7.mo57732f()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            r2.put(r3, r7)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            android.database.sqlite.SQLiteDatabase r7 = r6.getWritableDatabase()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            if (r7 != 0) goto L_0x0067
            monitor-exit(r6)
            return r0
        L_0x0067:
            android.database.sqlite.SQLiteDatabase r7 = r6.getWritableDatabase()     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            java.lang.String r3 = "frequence"
            r4 = 0
            long r0 = r7.insert(r3, r4, r2)     // Catch:{ Exception -> 0x0077, all -> 0x0074 }
            monitor-exit(r6)
            return r0
        L_0x0074:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x0077:
            monitor-exit(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p298db.C8417j.m23987b(com.mbridge.msdk.foundation.entity.f):long");
    }

    /* renamed from: a */
    public final synchronized void mo57028a(C8461f fVar) {
        if (!mo57029a(fVar.mo57721a())) {
            m23987b(fVar);
        }
    }
}
