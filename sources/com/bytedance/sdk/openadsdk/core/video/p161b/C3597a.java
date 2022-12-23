package com.bytedance.sdk.openadsdk.core.video.p161b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.p107c.C2753a;
import com.bytedance.sdk.component.p118e.C2843b;
import com.bytedance.sdk.component.p118e.p119a.C2842a;
import com.bytedance.sdk.component.p118e.p120b.C2844a;
import com.bytedance.sdk.component.p118e.p120b.C2848c;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2888a;
import com.bytedance.sdk.component.utils.C2893e;
import com.bytedance.sdk.component.utils.C2894f;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.core.C3333a;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.b.a */
/* compiled from: PlayableCache */
public class C3597a {

    /* renamed from: a */
    private static volatile C3597a f9109a;

    /* renamed from: b */
    private String f9110b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map<C3431n, C3603b> f9111c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    private Map<String, JSONObject> f9112d = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AtomicBoolean f9113e = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Set<String> f9114f = Collections.synchronizedSet(new HashSet());

    /* renamed from: g */
    private Handler f9115g = new Handler(Looper.getMainLooper());

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.b.a$a */
    /* compiled from: PlayableCache */
    public interface C3602a {
        /* renamed from: a */
        void mo19105a(boolean z);
    }

    /* renamed from: a */
    public static C3597a m11391a() {
        if (f9109a == null) {
            synchronized (C3597a.class) {
                if (f9109a == null) {
                    f9109a = new C3597a();
                }
            }
        }
        return f9109a;
    }

    private C3597a() {
    }

    /* renamed from: a */
    public boolean mo20169a(C3431n nVar) {
        if (!(!this.f9113e.get() || nVar == null || nVar.mo19517J() == null || nVar.mo19517J().mo15956k() == null)) {
            try {
                String a = C2893e.m8077a(nVar.mo19517J().mo15956k());
                if (this.f9112d.get(a) == null) {
                    return false;
                }
                return m11410e(new File(m11404c(), a));
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo20170b() {
        if (!this.f9113e.get()) {
            C2882e.m8036a(new C2885g("PlayableCache_init") {
                public void run() {
                    File[] listFiles;
                    try {
                        String a = C3597a.this.m11404c();
                        if (!TextUtils.isEmpty(a)) {
                            File file = new File(a);
                            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                                for (File a2 : listFiles) {
                                    try {
                                        JSONObject unused = C3597a.this.m11397a(C3597a.this.m11393a(a2), true);
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused3) {
                    }
                    C3597a.this.f9113e.set(true);
                }
            }, 5);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public JSONObject m11397a(File file, boolean z) {
        byte[] d;
        String str;
        try {
            if (!m11403b(file) || (d = C2894f.m8087d(file)) == null || d.length <= 0) {
                return null;
            }
            if (TextUtils.equals(file.getName(), "tt_open_ad_sdk_check_res.dat")) {
                str = C2888a.m8064b(new String(d));
            } else {
                str = C2753a.m7505a(new String(d), C3333a.m9921a());
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (z && jSONObject.length() > 0) {
                this.f9112d.put(file.getParentFile().getName(), jSONObject);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public File m11393a(File file) {
        File file2 = new File(file, "tt_open_ad_sdk_check_res.dat");
        if (m11403b(file2)) {
            return file2;
        }
        return new File(file, "tt_open_ad_sdk_check_res.dat");
    }

    /* renamed from: b */
    private boolean m11403b(File file) {
        return file != null && file.exists() && file.isFile() && file.canRead();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|(2:17|(1:19))|20|21|(1:23)(2:24|(1:26)(3:27|(2:29|(1:31)(2:32|(1:34)(2:35|(2:39|40))))|44))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0049 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057 A[Catch:{ all -> 0x00b1 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058 A[Catch:{ all -> 0x00b1 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.webkit.WebResourceResponse mo20167a(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.f9113e     // Catch:{ all -> 0x00b1 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x000a
            return r0
        L_0x000a:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x00b0
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x00b0
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x001e
            goto L_0x00b0
        L_0x001e:
            java.lang.String r1 = "http"
            boolean r1 = r7.startsWith(r1)     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = "?"
            boolean r1 = r7.contains(r1)     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = "\\?"
            java.lang.String[] r1 = r7.split(r1)     // Catch:{ all -> 0x0049 }
            r2 = 0
            r7 = r1[r2]     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = "/"
            boolean r1 = r7.endsWith(r1)     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0049
            int r1 = r7.length()     // Catch:{ all -> 0x0049 }
            int r1 = r1 + -1
            java.lang.String r7 = r7.substring(r2, r1)     // Catch:{ all -> 0x0049 }
        L_0x0049:
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.C3513m.m10963a()     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = com.bytedance.sdk.component.utils.C2907n.m8122a((android.content.Context) r1, (java.lang.String) r7)     // Catch:{ all -> 0x00b1 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00b1 }
            if (r2 == 0) goto L_0x0058
            return r0
        L_0x0058:
            java.lang.String r5 = com.bytedance.sdk.component.utils.C2893e.m8077a((java.lang.String) r5)     // Catch:{ all -> 0x00b1 }
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00b1 }
            if (r2 == 0) goto L_0x0063
            return r0
        L_0x0063:
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00b1 }
            java.lang.String r3 = r4.m11404c()     // Catch:{ all -> 0x00b1 }
            r2.<init>(r3, r5)     // Catch:{ all -> 0x00b1 }
            boolean r3 = r4.m11410e(r2)     // Catch:{ all -> 0x00b1 }
            if (r3 == 0) goto L_0x00b9
            java.lang.String r6 = r4.m11395a((java.lang.String) r6)     // Catch:{ all -> 0x00b1 }
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00b1 }
            if (r3 == 0) goto L_0x007d
            return r0
        L_0x007d:
            java.lang.String r3 = ""
            java.lang.String r6 = r7.replace(r6, r3)     // Catch:{ all -> 0x00b1 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00b1 }
            if (r7 == 0) goto L_0x008a
            return r0
        L_0x008a:
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x00b1 }
            r7.<init>(r2, r6)     // Catch:{ all -> 0x00b1 }
            boolean r5 = r4.m11400a((java.lang.String) r5, (java.lang.String) r6, (java.io.File) r7)     // Catch:{ all -> 0x00b1 }
            if (r5 == 0) goto L_0x00b9
            java.lang.String r5 = r7.getCanonicalPath()     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = r2.getCanonicalPath()     // Catch:{ all -> 0x00b1 }
            boolean r5 = r5.startsWith(r6)     // Catch:{ all -> 0x00b1 }
            if (r5 == 0) goto L_0x00b9
            android.webkit.WebResourceResponse r5 = new android.webkit.WebResourceResponse     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = "utf-8"
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x00b1 }
            r2.<init>(r7)     // Catch:{ all -> 0x00b1 }
            r5.<init>(r1, r6, r2)     // Catch:{ all -> 0x00b1 }
            return r5
        L_0x00b0:
            return r0
        L_0x00b1:
            r5 = move-exception
            java.lang.String r6 = "PlayableCache"
            java.lang.String r7 = "playable intercept error: "
            com.bytedance.sdk.component.utils.C2905l.m8115c(r6, r7, r5)
        L_0x00b9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.p161b.C3597a.mo20167a(java.lang.String, java.lang.String, java.lang.String):android.webkit.WebResourceResponse");
    }

    /* renamed from: a */
    private String m11395a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\?");
        if (split != null && split.length == 2) {
            if (split[0] != null && split[0].endsWith("/")) {
                str = str.substring(0, split.length - 1);
            }
            if (split[0] != null && split[0].endsWith("index.html")) {
                str = split[0];
            }
        }
        return str.replace("index.html", "");
    }

    /* renamed from: a */
    private boolean m11400a(String str, String str2, File file) {
        JSONObject jSONObject;
        String optString;
        if (file == null || !file.exists() || (jSONObject = this.f9112d.get(str)) == null || (optString = jSONObject.optString(str2)) == null || !optString.equalsIgnoreCase(C2893e.m8076a(file))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo20168a(C3431n nVar, C3602a aVar) {
        if (nVar == null || nVar.mo19517J() == null || TextUtils.isEmpty(nVar.mo19517J().mo15956k())) {
            C3604b.m11425a(C3513m.m10963a(), nVar, -701, (String) null);
            m11398a(aVar, false);
            return;
        }
        final String k = nVar.mo19517J().mo15956k();
        if (!this.f9114f.contains(k)) {
            this.f9111c.put(nVar, new C3603b().mo20175a(System.currentTimeMillis()));
            C3604b.m11424a(C3513m.m10963a(), nVar);
            String a = C2893e.m8077a(k);
            final File file = new File(m11404c(), a);
            if (m11410e(file)) {
                C3604b.m11425a(C3513m.m10963a(), nVar, -702, (String) null);
                m11409d(file);
                this.f9111c.remove(nVar);
                m11398a(aVar, true);
                return;
            }
            try {
                C2894f.m8086c(file);
            } catch (Throwable unused) {
            }
            this.f9114f.add(k);
            String d = m11407d();
            File file2 = new File(d, a + ".zip");
            C2844a d2 = C3792d.m12395a().mo20615b().mo17685d();
            d2.mo17711a(k);
            d2.mo17706a(file2.getParent(), file2.getName());
            final C3431n nVar2 = nVar;
            final C3602a aVar2 = aVar;
            d2.mo17705a((C2842a) new C2842a() {
                /* renamed from: a */
                public void mo17693a(C2848c cVar, final C2843b bVar) {
                    C3597a.this.f9114f.remove(k);
                    final C3603b bVar2 = (C3603b) C3597a.this.f9111c.remove(nVar2);
                    if (bVar2 != null) {
                        bVar2.mo20177b(System.currentTimeMillis());
                    }
                    if (!bVar.mo17701f() || bVar.mo17700e() == null || !bVar.mo17700e().exists()) {
                        int i = -700;
                        if (bVar.mo17695a() != 0) {
                            i = bVar.mo17695a();
                        }
                        C3604b.m11425a(C3513m.m10963a(), nVar2, i, (String) null);
                        C2905l.m8114c("PlayableCache", "onResponse: Playable zip download fail");
                        C3597a.this.m11398a(aVar2, false);
                        return;
                    }
                    C2905l.m8114c("PlayableCache", "onResponse: Playable zip download success");
                    C2882e.m8036a(new C2885g("downloadZip") {
                        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|(10:1|2|(1:4)|5|(1:7)|8|(1:10)(1:11)|12|13|14)|17|18|19|21) */
                        /* JADX WARNING: Failed to process nested try/catch */
                        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x008b */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void run() {
                            /*
                                r7 = this;
                                r0 = 1
                                com.bytedance.sdk.openadsdk.core.video.b.a$b r1 = r4     // Catch:{ all -> 0x0071 }
                                if (r1 == 0) goto L_0x000e
                                com.bytedance.sdk.openadsdk.core.video.b.a$b r1 = r4     // Catch:{ all -> 0x0071 }
                                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0071 }
                                r1.mo20178c(r2)     // Catch:{ all -> 0x0071 }
                            L_0x000e:
                                com.bytedance.sdk.component.e.b r1 = r5     // Catch:{ all -> 0x0071 }
                                java.io.File r1 = r1.mo17700e()     // Catch:{ all -> 0x0071 }
                                java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r2 = com.bytedance.sdk.openadsdk.core.video.p161b.C3597a.C35992.this     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a r2 = com.bytedance.sdk.openadsdk.core.video.p161b.C3597a.this     // Catch:{ all -> 0x0071 }
                                java.lang.String r2 = r2.m11404c()     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.component.utils.C2925y.m8190a(r1, r2)     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a$b r1 = r4     // Catch:{ all -> 0x0071 }
                                if (r1 == 0) goto L_0x0030
                                com.bytedance.sdk.openadsdk.core.video.b.a$b r1 = r4     // Catch:{ all -> 0x0071 }
                                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0071 }
                                r1.mo20179d(r2)     // Catch:{ all -> 0x0071 }
                            L_0x0030:
                                com.bytedance.sdk.openadsdk.core.video.b.a$b r1 = r4     // Catch:{ all -> 0x0071 }
                                r2 = 0
                                if (r1 == 0) goto L_0x0045
                                com.bytedance.sdk.openadsdk.core.video.b.a$b r1 = r4     // Catch:{ all -> 0x0071 }
                                long r2 = r1.mo20174a()     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a$b r1 = r4     // Catch:{ all -> 0x0071 }
                                long r4 = r1.mo20176b()     // Catch:{ all -> 0x0071 }
                                r5 = r4
                                r3 = r2
                                goto L_0x0047
                            L_0x0045:
                                r5 = r2
                                r3 = r5
                            L_0x0047:
                                android.content.Context r1 = com.bytedance.sdk.openadsdk.core.C3513m.m10963a()     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r2 = com.bytedance.sdk.openadsdk.core.video.p161b.C3597a.C35992.this     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.e.n r2 = r5     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.p161b.C3604b.m11426a((android.content.Context) r1, (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r2, (long) r3, (long) r5)     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r1 = com.bytedance.sdk.openadsdk.core.video.p161b.C3597a.C35992.this     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a r1 = com.bytedance.sdk.openadsdk.core.video.p161b.C3597a.this     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r2 = com.bytedance.sdk.openadsdk.core.video.p161b.C3597a.C35992.this     // Catch:{ all -> 0x0071 }
                                java.io.File r2 = r6     // Catch:{ all -> 0x0071 }
                                r1.m11406c((java.io.File) r2)     // Catch:{ all -> 0x0071 }
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r1 = com.bytedance.sdk.openadsdk.core.video.p161b.C3597a.C35992.this     // Catch:{ all -> 0x008b }
                                com.bytedance.sdk.openadsdk.core.video.b.a r1 = com.bytedance.sdk.openadsdk.core.video.p161b.C3597a.this     // Catch:{ all -> 0x008b }
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r2 = com.bytedance.sdk.openadsdk.core.video.p161b.C3597a.C35992.this     // Catch:{ all -> 0x008b }
                                java.io.File r2 = r6     // Catch:{ all -> 0x008b }
                                java.io.File r1 = r1.m11393a((java.io.File) r2)     // Catch:{ all -> 0x008b }
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r2 = com.bytedance.sdk.openadsdk.core.video.p161b.C3597a.C35992.this     // Catch:{ all -> 0x008b }
                                com.bytedance.sdk.openadsdk.core.video.b.a r2 = com.bytedance.sdk.openadsdk.core.video.p161b.C3597a.this     // Catch:{ all -> 0x008b }
                                org.json.JSONObject unused = r2.m11397a((java.io.File) r1, (boolean) r0)     // Catch:{ all -> 0x008b }
                                goto L_0x008b
                            L_0x0071:
                                r0 = move-exception
                                java.lang.String r1 = "PlayableCache"
                                java.lang.String r2 = "unzip error: "
                                com.bytedance.sdk.component.utils.C2905l.m8115c(r1, r2, r0)
                                android.content.Context r1 = com.bytedance.sdk.openadsdk.core.C3513m.m10963a()
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r2 = com.bytedance.sdk.openadsdk.core.video.p161b.C3597a.C35992.this
                                com.bytedance.sdk.openadsdk.core.e.n r2 = r5
                                r3 = -704(0xfffffffffffffd40, float:NaN)
                                java.lang.String r0 = r0.getMessage()
                                com.bytedance.sdk.openadsdk.core.video.p161b.C3604b.m11425a((android.content.Context) r1, (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r2, (int) r3, (java.lang.String) r0)
                                r0 = 0
                            L_0x008b:
                                com.bytedance.sdk.component.e.b r1 = r5     // Catch:{ all -> 0x0094 }
                                java.io.File r1 = r1.mo17700e()     // Catch:{ all -> 0x0094 }
                                r1.delete()     // Catch:{ all -> 0x0094 }
                            L_0x0094:
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r1 = com.bytedance.sdk.openadsdk.core.video.p161b.C3597a.C35992.this
                                com.bytedance.sdk.openadsdk.core.video.b.a r1 = com.bytedance.sdk.openadsdk.core.video.p161b.C3597a.this
                                com.bytedance.sdk.openadsdk.core.video.b.a$2 r2 = com.bytedance.sdk.openadsdk.core.video.p161b.C3597a.C35992.this
                                com.bytedance.sdk.openadsdk.core.video.b.a$a r2 = r7
                                r1.m11398a((com.bytedance.sdk.openadsdk.core.video.p161b.C3597a.C3602a) r2, (boolean) r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.p161b.C3597a.C35992.C36001.run():void");
                        }
                    }, 5);
                }

                /* renamed from: a */
                public void mo17694a(C2848c cVar, IOException iOException) {
                    C3597a.this.f9114f.remove(k);
                    C3597a.this.f9111c.remove(nVar2);
                    C3604b.m11425a(C3513m.m10963a(), nVar2, -700, iOException.getMessage());
                    C3597a.this.m11398a(aVar2, false);
                    C2905l.m8114c("PlayableCache", "onFailure: Playable zip download fail");
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11398a(final C3602a aVar, final boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (aVar != null) {
                aVar.mo19105a(z);
            }
        } else if (aVar != null) {
            this.f9115g.post(new Runnable() {
                public void run() {
                    C3602a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo19105a(z);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m11406c(File file) {
        m11409d(file);
        try {
            C3457h.m10580d().mo19776p().mo18276a(file);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    private void m11409d(File file) {
        try {
            if (file.exists()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!file.setLastModified(currentTimeMillis)) {
                    file.renameTo(file);
                    if (file.lastModified() < currentTimeMillis) {
                        C2905l.m8117d("PlayableCache", "Last modified date " + new Date(file.lastModified()) + " is not set for file " + file.getAbsolutePath());
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private boolean m11410e(File file) {
        String[] list;
        if (file == null || !file.isDirectory() || (list = file.list()) == null || list.length <= 0) {
            return false;
        }
        return Arrays.asList(list).contains("index.html");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public String m11404c() {
        File file = new File(m11407d(), "games");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    /* renamed from: d */
    private String m11407d() {
        if (TextUtils.isEmpty(this.f9110b)) {
            try {
                File file = new File(C3513m.m10963a().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f9110b = file.getAbsolutePath();
            } catch (Throwable th) {
                C2905l.m8118e("PlayableCache", "init root path error: " + th);
            }
        }
        return this.f9110b;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.video.b.a$b */
    /* compiled from: PlayableCache */
    private static class C3603b {

        /* renamed from: a */
        long f9128a;

        /* renamed from: b */
        long f9129b;

        /* renamed from: c */
        long f9130c;

        /* renamed from: d */
        long f9131d;

        private C3603b() {
        }

        /* renamed from: a */
        public long mo20174a() {
            return this.f9129b - this.f9128a;
        }

        /* renamed from: b */
        public long mo20176b() {
            return this.f9131d - this.f9130c;
        }

        /* renamed from: a */
        public C3603b mo20175a(long j) {
            this.f9128a = j;
            return this;
        }

        /* renamed from: b */
        public C3603b mo20177b(long j) {
            this.f9129b = j;
            return this;
        }

        /* renamed from: c */
        public C3603b mo20178c(long j) {
            this.f9130c = j;
            return this;
        }

        /* renamed from: d */
        public C3603b mo20179d(long j) {
            this.f9131d = j;
            return this;
        }
    }
}
