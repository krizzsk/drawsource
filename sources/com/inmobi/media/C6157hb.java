package com.inmobi.media;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

/* renamed from: com.inmobi.media.hb */
/* compiled from: NetworkResponse */
public class C6157hb {

    /* renamed from: d */
    private static final String f15540d = C6157hb.class.getSimpleName();

    /* renamed from: a */
    public C6154gz f15541a;

    /* renamed from: b */
    public int f15542b;

    /* renamed from: c */
    public Map<String, List<String>> f15543c;

    /* renamed from: e */
    private String f15544e;

    /* renamed from: f */
    private byte[] f15545f;

    /* renamed from: a */
    public final boolean mo35349a() {
        return this.f15541a != null;
    }

    /* renamed from: b */
    public final String mo35350b() {
        if (this.f15544e == null) {
            this.f15544e = m18235b(this.f15545f);
        }
        return this.f15544e;
    }

    /* renamed from: b */
    private static String m18235b(byte[] bArr) {
        if (!(bArr == null || bArr.length == 0)) {
            try {
                return new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return "";
    }

    /* renamed from: c */
    public final byte[] mo35351c() {
        byte[] bArr = this.f15545f;
        if (bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    public final void mo35348a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            this.f15545f = new byte[0];
            return;
        }
        byte[] bArr2 = new byte[bArr.length];
        this.f15545f = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    /* renamed from: d */
    public final long mo35352d() {
        try {
            if (this.f15544e != null) {
                return ((long) this.f15544e.length()) + 0;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }
}
