package com.bytedance.sdk.component.p108d.p111c;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.p108d.C2765c;
import com.bytedance.sdk.component.p108d.C2827i;
import com.bytedance.sdk.component.p108d.C2830l;
import com.bytedance.sdk.component.p108d.C2831m;
import com.bytedance.sdk.component.p108d.C2835q;
import com.bytedance.sdk.component.p108d.p111c.C2790c;
import com.bytedance.sdk.component.p108d.p111c.p116c.C2799c;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;

/* renamed from: com.bytedance.sdk.component.d.c.b */
/* compiled from: ImageLoader */
public class C2788b implements C2831m {

    /* renamed from: a */
    private volatile C2804f f6229a;

    private C2788b() {
    }

    /* renamed from: a */
    public static C2831m m7647a(Context context, C2830l lVar) {
        C2788b bVar = new C2788b();
        bVar.m7648b(context, lVar);
        return bVar;
    }

    /* renamed from: b */
    private void m7648b(Context context, C2830l lVar) {
        if (this.f6229a != null) {
            Log.w("ImageLoader", "already init!");
        }
        if (lVar == null) {
            lVar = C2801e.m7739a(context);
        }
        this.f6229a = new C2804f(context, lVar);
    }

    /* renamed from: a */
    public C2827i mo17599a(String str) {
        return new C2790c.C2796b(this.f6229a).mo17643c(str);
    }

    /* renamed from: a */
    public InputStream mo17600a(String str, String str2) {
        if (this.f6229a != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = C2799c.m7728a(str);
            }
            Collection<C2835q> a = this.f6229a.mo17667a();
            if (a != null) {
                for (C2835q a2 : a) {
                    byte[] bArr = (byte[]) a2.mo17521a(str2);
                    if (bArr != null) {
                        return new ByteArrayInputStream(bArr);
                    }
                }
            }
            Collection<C2765c> b = this.f6229a.mo17669b();
            if (b != null) {
                for (C2765c a3 : b) {
                    InputStream a4 = a3.mo17547a(str2);
                    if (a4 != null) {
                        return a4;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo17601a(String str, String str2, String str3) {
        if (this.f6229a == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = C2799c.m7728a(str);
        }
        C2765c a = this.f6229a.mo17665a(str3);
        if (a != null) {
            return a.mo17523b(str2);
        }
        return false;
    }
}
