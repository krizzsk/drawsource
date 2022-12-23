package com.tapjoy.internal;

import android.graphics.Bitmap;
import com.tapjoy.internal.C11266aj;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.tapjoy.internal.ih */
public final class C11610ih {

    /* renamed from: e */
    public static final C11288bc<C11610ih> f27922e = new C11288bc<C11610ih>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo69701a(C11296bh bhVar) {
            return new C11610ih(bhVar);
        }
    };

    /* renamed from: f */
    private static final C11264ah<URL, Bitmap> f27923f = new C11266aj.C11267a(new C11269al());

    /* renamed from: a */
    public URL f27924a;

    /* renamed from: b */
    public Bitmap f27925b;

    /* renamed from: c */
    public byte[] f27926c;

    /* renamed from: d */
    public C11622io f27927d;

    public C11610ih(URL url) {
        this.f27924a = url;
    }

    /* renamed from: a */
    public final boolean mo70194a() {
        return (this.f27925b == null && this.f27926c == null) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0051  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70195b() {
        /*
            r10 = this;
            com.tapjoy.internal.gb r0 = com.tapjoy.internal.C11506gd.m31493b()
            java.lang.String r1 = "mm_external_cache_enabled"
            r2 = 1
            boolean r0 = r0.mo70076a(r1, r2)
            r1 = r0 ^ 1
            if (r1 == 0) goto L_0x001e
            com.tapjoy.internal.ah<java.net.URL, android.graphics.Bitmap> r2 = f27923f
            java.net.URL r3 = r10.f27924a
            java.lang.Object r2 = r2.mo69624a(r3)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r10.f27925b = r2
            if (r2 == 0) goto L_0x001e
            return
        L_0x001e:
            if (r0 == 0) goto L_0x005f
            com.tapjoy.internal.id r2 = com.tapjoy.internal.C11600id.f27889a
            java.net.URL r3 = r10.f27924a
            java.io.File r2 = r2.mo70184a((java.net.URL) r3)
            if (r2 == 0) goto L_0x005f
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0041, all -> 0x003c }
            r4.<init>(r2)     // Catch:{ IOException -> 0x0041, all -> 0x003c }
            r10.m31807a(r4)     // Catch:{ IOException -> 0x003a, all -> 0x0037 }
            com.tapjoy.internal.C11531gp.m31567a(r4)
            goto L_0x0044
        L_0x0037:
            r0 = move-exception
            r3 = r4
            goto L_0x003d
        L_0x003a:
            r3 = r4
            goto L_0x0041
        L_0x003c:
            r0 = move-exception
        L_0x003d:
            com.tapjoy.internal.C11531gp.m31567a(r3)
            throw r0
        L_0x0041:
            com.tapjoy.internal.C11531gp.m31567a(r3)
        L_0x0044:
            android.graphics.Bitmap r3 = r10.f27925b
            if (r3 != 0) goto L_0x0051
            byte[] r3 = r10.f27926c
            if (r3 == 0) goto L_0x004d
            goto L_0x0051
        L_0x004d:
            r2.delete()
            goto L_0x005f
        L_0x0051:
            if (r1 == 0) goto L_0x005e
            android.graphics.Bitmap r0 = r10.f27925b
            if (r0 == 0) goto L_0x005e
            com.tapjoy.internal.ah<java.net.URL, android.graphics.Bitmap> r1 = f27923f
            java.net.URL r2 = r10.f27924a
            r1.mo69625a(r2, r0)
        L_0x005e:
            return
        L_0x005f:
            java.net.URL r2 = r10.f27924a
            java.net.URLConnection r2 = com.tapjoy.internal.C11475fl.m31434a(r2)
            r3 = 0
            java.lang.String r5 = "Cache-Control"
            java.lang.String r5 = r2.getHeaderField(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0099
            java.lang.String r6 = ","
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            r7 = 0
        L_0x007b:
            if (r7 >= r6) goto L_0x0099
            r8 = r5[r7]
            java.lang.String r8 = r8.trim()
            java.lang.String r9 = "max-age="
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0096
            r5 = 8
            java.lang.String r5 = r8.substring(r5)
            long r3 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0099 }
            goto L_0x0099
        L_0x0096:
            int r7 = r7 + 1
            goto L_0x007b
        L_0x0099:
            java.io.InputStream r2 = r2.getInputStream()
            java.io.ByteArrayInputStream r5 = r10.m31807a(r2)
            com.tapjoy.internal.C11531gp.m31567a(r2)
            com.tapjoy.internal.id r2 = com.tapjoy.internal.C11600id.f27889a
            boolean r2 = com.tapjoy.internal.C11600id.m31789a((long) r3)
            if (r2 == 0) goto L_0x00bd
            if (r0 == 0) goto L_0x00bd
            android.graphics.Bitmap r0 = r10.f27925b
            if (r0 != 0) goto L_0x00b6
            byte[] r0 = r10.f27926c
            if (r0 == 0) goto L_0x00bd
        L_0x00b6:
            com.tapjoy.internal.id r0 = com.tapjoy.internal.C11600id.f27889a
            java.net.URL r2 = r10.f27924a
            r0.mo70186a(r2, r5, r3)
        L_0x00bd:
            if (r1 == 0) goto L_0x00ca
            android.graphics.Bitmap r0 = r10.f27925b
            if (r0 == 0) goto L_0x00ca
            com.tapjoy.internal.ah<java.net.URL, android.graphics.Bitmap> r1 = f27923f
            java.net.URL r2 = r10.f27924a
            r1.mo69625a(r2, r0)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11610ih.mo70195b():void");
    }

    /* renamed from: a */
    private ByteArrayInputStream m31807a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C11529gn.m31564a(inputStream, byteArrayOutputStream);
        byteArrayOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        C11623ip ipVar = new C11623ip();
        ipVar.mo70204a(byteArray);
        C11622io a = ipVar.mo70203a();
        if (a.f27990b == 0) {
            this.f27926c = byteArray;
            this.f27927d = a;
        } else {
            C11680r rVar = C11680r.f28187a;
            this.f27925b = C11680r.m32044a((InputStream) byteArrayInputStream);
            byteArrayInputStream.reset();
        }
        return byteArrayInputStream;
    }

    C11610ih(C11296bh bhVar) {
        if (bhVar.mo69725k() == C11305bm.STRING) {
            this.f27924a = bhVar.mo69715e();
            return;
        }
        bhVar.mo69722h();
        String l = bhVar.mo69726l();
        while (bhVar.mo69724j()) {
            if ("url".equals(l)) {
                this.f27924a = bhVar.mo69715e();
            } else {
                bhVar.mo69733s();
            }
        }
        bhVar.mo69723i();
    }
}
