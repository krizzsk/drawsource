package com.mbridge.msdk.foundation.same.net.p309d;

import com.mbridge.msdk.foundation.same.net.C8532e;
import com.mbridge.msdk.foundation.same.net.C8554i;
import com.mbridge.msdk.foundation.same.net.C8557k;
import com.mbridge.msdk.foundation.same.net.p306a.C8508a;
import com.mbridge.msdk.foundation.same.net.p310e.C8535c;
import com.mbridge.msdk.foundation.same.net.p311f.C8538b;
import com.mbridge.msdk.foundation.tools.C8672v;
import java.io.UnsupportedEncodingException;

/* renamed from: com.mbridge.msdk.foundation.same.net.d.f */
/* compiled from: StringRequest */
public class C8531f extends C8554i<String> {

    /* renamed from: c */
    private static final String f20904c = C8531f.class.getSimpleName();

    /* renamed from: d */
    private String f20905d;

    public C8531f(int i, String str, String str2, C8532e<String> eVar) {
        super(i, str, eVar);
        this.f20905d = str2;
    }

    /* renamed from: e */
    public final byte[] mo57953e() {
        try {
            if (this.f20905d == null) {
                return null;
            }
            return this.f20905d.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C8557k<String> mo57946a(C8535c cVar) {
        try {
            return C8557k.m24541a(new String(cVar.f20913b, C8538b.m24453a(cVar.f20915d)), cVar);
        } catch (UnsupportedEncodingException e) {
            C8672v.m24878d(f20904c, e.getMessage());
            return C8557k.m24540a(new C8508a(8, cVar));
        }
    }
}
