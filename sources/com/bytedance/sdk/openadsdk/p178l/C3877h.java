package com.bytedance.sdk.openadsdk.p178l;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.p174i.C3783a;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import com.bytedance.sdk.openadsdk.p174i.p175a.C3784a;
import com.bytedance.sdk.openadsdk.p174i.p175a.C3788b;

/* renamed from: com.bytedance.sdk.openadsdk.l.h */
/* compiled from: ImageBytesHelper */
public class C3877h {

    /* renamed from: com.bytedance.sdk.openadsdk.l.h$a */
    /* compiled from: ImageBytesHelper */
    public interface C3879a {
        /* renamed from: a */
        void mo18310a();

        /* renamed from: a */
        void mo18311a(C3788b bVar);

        /* renamed from: b */
        void mo18312b();
    }

    /* renamed from: a */
    public static void m12656a(C3783a aVar, int i, int i2, final C3879a aVar2, String str) {
        C2905l.m8118e("splashLoadAd", " getImageBytes url " + aVar);
        C3792d.m12395a().mo20616c().mo20601a(aVar, new C3784a.C3787b() {
            /* renamed from: a */
            public void mo20604a(String str, C3788b bVar) {
                C3879a aVar;
                if (!bVar.mo20607c() || (aVar = aVar2) == null) {
                    C3879a aVar2 = aVar2;
                    if (aVar2 != null) {
                        aVar2.mo18310a();
                        return;
                    }
                    return;
                }
                aVar.mo18311a(bVar);
            }

            /* renamed from: a */
            public void mo20603a(int i, String str, Throwable th) {
                C3879a aVar = aVar2;
                if (aVar != null) {
                    aVar.mo18310a();
                }
            }

            /* renamed from: a */
            public void mo20602a() {
                C3879a aVar = aVar2;
                if (aVar != null) {
                    aVar.mo18312b();
                }
            }
        }, i, i2, str);
    }

    /* renamed from: a */
    public static Drawable m12655a(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return new ColorDrawable(0);
        }
        try {
            return new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
        } catch (Throwable unused) {
            return new ColorDrawable(0);
        }
    }
}
