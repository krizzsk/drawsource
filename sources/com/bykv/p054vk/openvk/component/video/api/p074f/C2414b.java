package com.bykv.p054vk.openvk.component.video.api.p074f;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.bykv.vk.openvk.component.video.api.f.b */
/* compiled from: MD5 */
public class C2414b {

    /* renamed from: a */
    private static final MessageDigest f4919a = m5823a();

    /* renamed from: b */
    private static final char[] f4920b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private C2414b() {
    }

    /* renamed from: a */
    private static MessageDigest m5823a() {
        try {
            return MessageDigest.getInstance(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_MD5);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m5821a(String str) {
        byte[] digest;
        MessageDigest messageDigest = f4919a;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        synchronized (C2414b.class) {
            digest = messageDigest.digest(bytes);
        }
        return m5822a(digest);
    }

    /* renamed from: a */
    public static String m5822a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[(bArr.length << 1)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f4920b;
            cArr[i] = cArr2[(b & 240) >> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b & Ascii.f18305SI];
        }
        return new String(cArr);
    }
}
