package com.bytedance.sdk.component.p102b.p103a.p104a.p105a;

import android.text.TextUtils;
import com.bytedance.sdk.component.p102b.p103a.C2736e;
import com.bytedance.sdk.component.p102b.p103a.C2745j;
import com.bytedance.sdk.component.p102b.p103a.C2746k;
import com.bytedance.sdk.component.p102b.p103a.C2750m;
import com.bytedance.sdk.component.p102b.p103a.C2751n;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.b.a.a.a.f */
/* compiled from: NetResponse */
public class C2722f extends C2750m {

    /* renamed from: a */
    HttpURLConnection f6058a;

    /* renamed from: b */
    C2746k f6059b;

    public C2722f(HttpURLConnection httpURLConnection, C2746k kVar) {
        this.f6058a = httpURLConnection;
        this.f6059b = kVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = 'J';
        r1 = '7';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        switch(r1) {
            case 55: goto L_0x000f;
            case 56: goto L_0x0026;
            case 57: goto L_0x0026;
            default: goto L_0x000e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r2 = r2.toCharArray();
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r0 >= r2.length) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r2[r0] = (char) (r2[r0] ^ r0);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        return new java.lang.String(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String f1659536876631dc(java.lang.String r2) {
        /*
        L_0x0000:
            r0 = 73
            r1 = 96
        L_0x0004:
            switch(r0) {
                case 72: goto L_0x0026;
                case 73: goto L_0x0008;
                case 74: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x002b
        L_0x0008:
            switch(r1) {
                case 94: goto L_0x0000;
                case 95: goto L_0x0026;
                case 96: goto L_0x0026;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r1) {
                case 55: goto L_0x000f;
                case 56: goto L_0x0026;
                case 57: goto L_0x0026;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0000
        L_0x000f:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L_0x0014:
            int r1 = r2.length
            if (r0 >= r1) goto L_0x0020
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0020:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L_0x0026:
            r0 = 74
            r1 = 55
            goto L_0x0004
        L_0x002b:
            r0 = 72
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p102b.p103a.p104a.p105a.C2722f.f1659536876631dc(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public long mo17415a() {
        return 0;
    }

    /* renamed from: a */
    public String mo17416a(String str) {
        return this.f6058a.getHeaderField(str);
    }

    /* renamed from: a */
    public String mo17417a(String str, String str2) {
        return !TextUtils.isEmpty(mo17416a(str)) ? mo17416a(str) : str2;
    }

    /* renamed from: b */
    public long mo17418b() {
        return 0;
    }

    /* renamed from: c */
    public int mo17419c() {
        try {
            return this.f6058a.getResponseCode();
        } catch (Exception unused) {
            return -1;
        }
    }

    public void close() {
        try {
            mo17423f().close();
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public boolean mo17421d() {
        return mo17419c() >= 200 && mo17419c() < 300;
    }

    /* renamed from: e */
    public String mo17422e() throws IOException {
        return this.f6058a.getResponseMessage();
    }

    /* renamed from: f */
    public C2751n mo17423f() {
        try {
            return new C2723g(this.f6058a);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: g */
    public C2736e mo17424g() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f6058a.getHeaderFields().entrySet()) {
            for (String str : (List) entry.getValue()) {
                if (!HttpHeaders.CONTENT_RANGE.equalsIgnoreCase((String) entry.getKey()) || mo17419c() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new C2736e((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: h */
    public C2745j mo17425h() {
        return C2745j.HTTP_1_1;
    }

    public String toString() {
        return "";
    }
}
