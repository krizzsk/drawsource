package com.inmobi.media;

import com.inmobi.media.C5860ce;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.bz */
/* compiled from: NativeCtaAsset */
public final class C5851bz extends C5860ce {

    /* renamed from: com.inmobi.media.bz$a */
    /* compiled from: NativeCtaAsset */
    public static class C5852a extends C5860ce.C5861a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5852a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, String str4, int i9, String str5, String[] strArr, C5862cf cfVar) {
            super(i, i2, i3, i4, i5, i6, i7, i8, str, str2, str3, str4, cfVar);
            String[] strArr2 = strArr;
            this.f14782l = i9;
            this.f14784n = Integer.MAX_VALUE;
            this.f14783m = str5.length() == 0 ? "#ff000000" : str5;
            int min = Math.min(strArr2.length, 1);
            this.f14785o = new String[min];
            System.arraycopy(strArr2, 0, this.f14785o, 0, min);
        }
    }

    C5851bz(String str, String str2, C5848bx bxVar, String str3, byte b, JSONObject jSONObject) {
        this(str, str2, bxVar, str3, new LinkedList(), b, jSONObject);
    }

    C5851bz(String str, String str2, C5848bx bxVar, String str3, List<C5868ci> list, byte b, JSONObject jSONObject) {
        super(str, str2, "CTA", bxVar, str3);
        mo34825a(list);
        if (jSONObject != null) {
            this.f14711i = b;
            this.f14708f = jSONObject;
        }
    }
}
