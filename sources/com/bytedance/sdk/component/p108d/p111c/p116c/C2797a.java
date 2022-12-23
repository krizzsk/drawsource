package com.bytedance.sdk.component.p108d.p111c.p116c;

import android.graphics.BitmapFactory;

/* renamed from: com.bytedance.sdk.component.d.c.c.a */
/* compiled from: FileUtil */
public class C2797a {
    /* renamed from: a */
    public static boolean m7725a(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (options.outWidth > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m7726b(byte[] bArr) {
        return bArr != null && bArr.length >= 3 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70;
    }
}
