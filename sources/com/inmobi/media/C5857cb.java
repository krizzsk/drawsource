package com.inmobi.media;

import android.os.Build;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.cb */
/* compiled from: NativeGifAsset */
public class C5857cb extends C5847bw {

    /* renamed from: A */
    private static final String f14780A = C5857cb.class.getSimpleName();

    /* renamed from: z */
    public C6000ey f14781z;

    C5857cb(String str, String str2, C5848bx bxVar, String str3, byte b, JSONObject jSONObject) {
        this(str, str2, bxVar, str3, new LinkedList(), b, jSONObject);
    }

    C5857cb(String str, String str2, C5848bx bxVar, String str3, List<C5868ci> list, byte b, JSONObject jSONObject) {
        super(str, str2, "GIF", bxVar, list);
        C5803bg.m17287a();
        C5784ax b2 = C5803bg.m17290b(str3);
        this.f14707e = b2 == null ? null : b2.f14524e;
        if (b2 != null) {
            try {
                String str4 = b2.f14524e;
                this.f14781z = Build.VERSION.SDK_INT < 28 ? new C6002ez(str4) : new C5994ew(str4);
            } catch (Exception e) {
                this.f14781z = null;
                C6130gj.m18161a().mo35310a(new C6167hk(e));
            }
        }
        if (jSONObject != null) {
            this.f14711i = b;
            this.f14708f = jSONObject;
        }
    }
}
