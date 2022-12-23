package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.C4193b;
import com.vungle.warren.model.SessionDataDBAdapter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.cache.session.b */
public class C4186b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4189d f10291a;

    /* renamed from: com.fyber.inneractive.sdk.cache.session.b$a */
    public class C4187a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ JSONObject f10292a;

        public C4187a(JSONObject jSONObject) {
            this.f10292a = jSONObject;
        }

        public void run() {
            C4189d dVar = C4186b.this.f10291a;
            JSONObject jSONObject = this.f10292a;
            dVar.getClass();
            for (C4193b bVar : C4193b.values()) {
                if (bVar != C4193b.NONE) {
                    String name = bVar.name();
                    JSONArray jSONArray = new JSONArray();
                    try {
                        jSONArray = jSONObject.getJSONArray(name);
                    } catch (JSONException unused) {
                    }
                    for (int i = 0; i < jSONArray.length(); i++) {
                        C4191e a = C4191e.m13170a(jSONArray.optJSONObject(i));
                        if (!(a == null || a.f10302a == 0)) {
                            dVar.mo24177a(bVar, a);
                        }
                    }
                }
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("currentSession");
            if (optJSONObject != null) {
                C4195f fVar = new C4195f();
                JSONArray jSONArray2 = new JSONArray();
                try {
                    jSONArray2 = optJSONObject.getJSONArray("content");
                } catch (JSONException unused2) {
                }
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2 = jSONArray2.getJSONObject(i2);
                    } catch (JSONException unused3) {
                    }
                    C4193b a2 = C4193b.m13172a(jSONObject2.optString("type"), jSONObject2.optString("subType"));
                    C4191e a3 = C4191e.m13170a(jSONObject2.optJSONObject(SessionDataDBAdapter.SessionDataColumns.TABLE_NAME));
                    if (a3 != null) {
                        fVar.f10322a.put(a2, a3);
                    }
                }
                dVar.mo24178a(fVar);
            }
            C4186b.this.f10291a.getClass();
        }
    }

    public C4186b(C4189d dVar) {
        this.f10291a = dVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038 A[SYNTHETIC, Splitter:B:18:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
            java.lang.String r0 = "session_details.json"
            android.app.Application r1 = com.fyber.inneractive.sdk.util.C5292l.f14015a
            r2 = 0
            r3 = 0
            java.io.FileInputStream r4 = r1.openFileInput(r0)     // Catch:{ all -> 0x0023 }
            int r5 = r4.available()     // Catch:{ all -> 0x0024 }
            byte[] r6 = new byte[r5]     // Catch:{ all -> 0x0024 }
            int r7 = r4.read(r6)     // Catch:{ all -> 0x0024 }
            if (r7 != r5) goto L_0x001e
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0024 }
            java.lang.String r7 = "UTF-8"
            r5.<init>(r6, r7)     // Catch:{ all -> 0x0024 }
            goto L_0x001f
        L_0x001e:
            r5 = r3
        L_0x001f:
            com.fyber.inneractive.sdk.util.C5312s.m16537a((java.io.Closeable) r4)
            goto L_0x0032
        L_0x0023:
            r4 = r3
        L_0x0024:
            java.lang.String r5 = "readFileFromContext failed reading %s"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0062 }
            r6[r2] = r0     // Catch:{ all -> 0x0062 }
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r5, r6)     // Catch:{ all -> 0x0062 }
            com.fyber.inneractive.sdk.util.C5312s.m16537a((java.io.Closeable) r4)
            r5 = r3
        L_0x0032:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L_0x005c
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x003f }
            r4.<init>(r5)     // Catch:{ all -> 0x003f }
            r3 = r4
            goto L_0x0046
        L_0x003f:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "Failed parsing SessionCache"
            com.fyber.inneractive.sdk.util.IAlog.m16450e(r4, r2)
        L_0x0046:
            if (r3 == 0) goto L_0x0053
            android.os.Handler r0 = com.fyber.inneractive.sdk.util.C5299n.f14024b
            com.fyber.inneractive.sdk.cache.session.b$a r1 = new com.fyber.inneractive.sdk.cache.session.b$a
            r1.<init>(r3)
            r0.post(r1)
            goto L_0x0061
        L_0x0053:
            r1.deleteFile(r0)
            com.fyber.inneractive.sdk.cache.session.d r0 = r8.f10291a
            r0.getClass()
            goto L_0x0061
        L_0x005c:
            com.fyber.inneractive.sdk.cache.session.d r0 = r8.f10291a
            r0.getClass()
        L_0x0061:
            return
        L_0x0062:
            r0 = move-exception
            com.fyber.inneractive.sdk.util.C5312s.m16537a((java.io.Closeable) r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.cache.session.C4186b.run():void");
    }
}
