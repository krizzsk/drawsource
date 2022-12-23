package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.videocommon.download.C9652g;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.mbridge.msdk.videocommon.download.b */
/* compiled from: DownLoadH5SourceListener */
public final class C9644b implements C9652g.C9659c {

    /* renamed from: a */
    private static String f24030a = "DownLoadH5SourceListener";

    /* renamed from: b */
    private ConcurrentMap<String, C9644b> f24031b;

    /* renamed from: c */
    private C9667j f24032c;

    /* renamed from: d */
    private CopyOnWriteArrayList<C9652g.C9660d> f24033d;

    /* renamed from: e */
    private String f24034e;

    /* renamed from: a */
    public final void mo63648a() {
    }

    public C9644b(ConcurrentMap<String, C9644b> concurrentMap, C9667j jVar, C9652g.C9660d dVar, String str) {
        CopyOnWriteArrayList<C9652g.C9660d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f24033d = copyOnWriteArrayList;
        this.f24031b = concurrentMap;
        this.f24032c = jVar;
        copyOnWriteArrayList.add(dVar);
        this.f24034e = str;
    }

    /* renamed from: a */
    public final void mo63649a(C9652g.C9660d dVar) {
        this.f24033d.add(dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x009a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63651a(java.lang.String r2, byte[] r3, java.lang.String r4) {
        /*
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.String, com.mbridge.msdk.videocommon.download.b> r2 = r1.f24031b     // Catch:{ Exception -> 0x0075 }
            if (r2 != 0) goto L_0x0024
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.g$d> r2 = r1.f24033d     // Catch:{ Exception -> 0x0075 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0075 }
        L_0x000a:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x0075 }
            if (r3 == 0) goto L_0x0023
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x0075 }
            com.mbridge.msdk.videocommon.download.g$d r3 = (com.mbridge.msdk.videocommon.download.C9652g.C9660d) r3     // Catch:{ Exception -> 0x0075 }
            if (r3 == 0) goto L_0x000a
            java.lang.String r0 = "mResDownloadingMap  is null"
            r3.mo58373a(r4, r0)     // Catch:{ Exception -> 0x0075 }
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.g$d> r0 = r1.f24033d     // Catch:{ Exception -> 0x0075 }
            r0.remove(r3)     // Catch:{ Exception -> 0x0075 }
            goto L_0x000a
        L_0x0023:
            return
        L_0x0024:
            java.util.concurrent.ConcurrentMap<java.lang.String, com.mbridge.msdk.videocommon.download.b> r2 = r1.f24031b     // Catch:{ Exception -> 0x0075 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ Exception -> 0x0075 }
            if (r2 == 0) goto L_0x0031
            java.util.concurrent.ConcurrentMap<java.lang.String, com.mbridge.msdk.videocommon.download.b> r2 = r1.f24031b     // Catch:{ Exception -> 0x0075 }
            r2.remove(r4)     // Catch:{ Exception -> 0x0075 }
        L_0x0031:
            if (r3 == 0) goto L_0x0072
            int r2 = r3.length     // Catch:{ Exception -> 0x0075 }
            if (r2 <= 0) goto L_0x0072
            com.mbridge.msdk.videocommon.download.j r2 = r1.f24032c     // Catch:{ Exception -> 0x0075 }
            java.lang.String r2 = r2.mo63685a(r4, r3)     // Catch:{ Exception -> 0x0075 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0075 }
            if (r3 == 0) goto L_0x0060
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.g$d> r2 = r1.f24033d     // Catch:{ Exception -> 0x0075 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0075 }
        L_0x0048:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x0075 }
            if (r3 == 0) goto L_0x005f
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x0075 }
            com.mbridge.msdk.videocommon.download.g$d r3 = (com.mbridge.msdk.videocommon.download.C9652g.C9660d) r3     // Catch:{ Exception -> 0x0075 }
            if (r3 == 0) goto L_0x0048
            r3.mo58372a(r4)     // Catch:{ Exception -> 0x0075 }
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.g$d> r0 = r1.f24033d     // Catch:{ Exception -> 0x0075 }
            r0.remove(r3)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0048
        L_0x005f:
            return
        L_0x0060:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0075 }
            r3.<init>()     // Catch:{ Exception -> 0x0075 }
            java.lang.String r0 = "data save failed:"
            r3.append(r0)     // Catch:{ Exception -> 0x0075 }
            r3.append(r2)     // Catch:{ Exception -> 0x0075 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0075 }
            goto L_0x008e
        L_0x0072:
            java.lang.String r2 = "response data is error"
            goto L_0x008e
        L_0x0075:
            r2 = move-exception
            boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r3 == 0) goto L_0x007d
            r2.printStackTrace()
        L_0x007d:
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0082 }
            goto L_0x008e
        L_0x0082:
            r2 = move-exception
            java.lang.String r3 = f24030a
            java.lang.String r0 = r2.getMessage()
            com.mbridge.msdk.foundation.tools.C8672v.m24875a(r3, r0, r2)
            java.lang.String r2 = ""
        L_0x008e:
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.g$d> r3 = r1.f24033d
            java.util.Iterator r3 = r3.iterator()
        L_0x0094:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r0 = r3.next()
            com.mbridge.msdk.videocommon.download.g$d r0 = (com.mbridge.msdk.videocommon.download.C9652g.C9660d) r0
            if (r0 == 0) goto L_0x0094
            r0.mo58373a(r4, r2)
            goto L_0x0094
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.C9644b.mo63651a(java.lang.String, byte[], java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo63650a(String str) {
        try {
            if (this.f24031b == null) {
                Iterator<C9652g.C9660d> it = this.f24033d.iterator();
                while (it.hasNext()) {
                    C9652g.C9660d next = it.next();
                    if (next != null) {
                        next.mo58373a(this.f24034e, "mResDownloadingMap  is null");
                        this.f24033d.remove(next);
                    }
                }
                return;
            }
            if (this.f24031b.containsKey(this.f24034e)) {
                this.f24031b.remove(this.f24034e);
            }
            Iterator<C9652g.C9660d> it2 = this.f24033d.iterator();
            while (it2.hasNext()) {
                C9652g.C9660d next2 = it2.next();
                if (next2 != null) {
                    next2.mo58373a(this.f24034e, str);
                    this.f24033d.remove(next2);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            str = e.getMessage();
        } catch (Throwable th) {
            C8672v.m24875a(f24030a, th.getMessage(), th);
        }
    }
}
