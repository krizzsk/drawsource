package com.fyber.inneractive.sdk.network;

import android.os.Environment;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.C5312s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.i0 */
public class C4492i0 extends C4482e0<String> {

    /* renamed from: g */
    public final String f11041g;

    public C4492i0(C4521u<String> uVar, String str) {
        super(uVar, C4522v.m13803b().mo24698a());
        this.f11041g = str;
    }

    /* renamed from: a */
    public String mo24640a() {
        return this.f11041g;
    }

    /* renamed from: f */
    public C4499l0 mo24647f() {
        return C4499l0.LOW;
    }

    /* renamed from: j */
    public boolean mo24651j() {
        return false;
    }

    /* renamed from: n */
    public C4528y mo24655n() {
        return C4528y.f11197d;
    }

    /* renamed from: p */
    public int mo24656p() {
        return 0;
    }

    /* renamed from: a */
    public C4472a0 mo24638a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        T t;
        C4472a0 a0Var = new C4472a0();
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File(Environment.getExternalStorageDirectory(), "Pictures");
            file.mkdirs();
            String a = mo24681a(URI.create(this.f11041g), map);
            if (!TextUtils.isEmpty(a)) {
                File file2 = new File(file, a);
                t = file2.toString();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    C5312s.m16538a(inputStream, (OutputStream) fileOutputStream2);
                    fileOutputStream = fileOutputStream2;
                } catch (Exception unused) {
                    fileOutputStream = fileOutputStream2;
                    try {
                        IAlog.m16446a("failed to download and save the image file.", new Object[0]);
                        C5312s.m16539b(fileOutputStream);
                        return a0Var;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream2 = fileOutputStream;
                        C5312s.m16539b(fileOutputStream2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C5312s.m16539b(fileOutputStream2);
                    throw th;
                }
            } else {
                t = null;
            }
            a0Var.f10996a = t;
        } catch (Exception unused2) {
        }
        C5312s.m16539b(fileOutputStream);
        return a0Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo24681a(java.net.URI r5, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r6) {
        /*
            r4 = this;
            java.lang.String r5 = r5.getPath()
            r0 = 0
            if (r5 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.File r1 = new java.io.File
            r1.<init>(r5)
            java.lang.String r5 = r1.getName()
            if (r6 == 0) goto L_0x001c
            java.lang.String r1 = "text/html"
            java.lang.Object r6 = r6.get(r1)
            java.util.List r6 = (java.util.List) r6
            goto L_0x001d
        L_0x001c:
            r6 = r0
        L_0x001d:
            r1 = 0
            if (r6 == 0) goto L_0x0027
            java.lang.Object r6 = r6.get(r1)
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
        L_0x0027:
            if (r0 == 0) goto L_0x006f
            java.lang.String r6 = ";"
            java.lang.String[] r6 = r0.split(r6)
            int r0 = r6.length
        L_0x0030:
            if (r1 >= r0) goto L_0x006f
            r2 = r6[r1]
            java.lang.String r3 = "image/"
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x006c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "."
            r6.append(r0)
            java.lang.String r0 = "/"
            java.lang.String[] r0 = r2.split(r0)
            r1 = 1
            r0 = r0[r1]
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            boolean r0 = r5.endsWith(r6)
            if (r0 != 0) goto L_0x006f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = r0.toString()
            goto L_0x006f
        L_0x006c:
            int r1 = r1 + 1
            goto L_0x0030
        L_0x006f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.C4492i0.mo24681a(java.net.URI, java.util.Map):java.lang.String");
    }
}
