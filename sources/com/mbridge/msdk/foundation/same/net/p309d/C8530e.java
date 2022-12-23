package com.mbridge.msdk.foundation.same.net.p309d;

import com.mbridge.msdk.foundation.same.net.C8532e;
import com.mbridge.msdk.foundation.same.net.C8554i;
import java.io.UnsupportedEncodingException;

/* renamed from: com.mbridge.msdk.foundation.same.net.d.e */
/* compiled from: JsonRequest */
public abstract class C8530e<T> extends C8554i<T> {

    /* renamed from: c */
    private static final String f20902c = C8530e.class.getSimpleName();

    /* renamed from: d */
    private final String f20903d;

    public C8530e(int i, String str, String str2, C8532e<T> eVar) {
        super(i, str, eVar);
        this.f20903d = str2;
    }

    /* renamed from: e */
    public final byte[] mo57953e() {
        try {
            if (this.f20903d == null) {
                return null;
            }
            return this.f20903d.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
