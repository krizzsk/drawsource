package com.ironsource.sdk.controller;

import com.ironsource.sdk.utils.C8343c;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;

/* renamed from: com.ironsource.sdk.controller.t */
final class C8195t {

    /* renamed from: a */
    String f19920a;

    C8195t(String str) {
        this.f19920a = str;
    }

    /* renamed from: a */
    private String m23377a(String str) {
        try {
            return C8343c.m23767a(str);
        } catch (Exception e) {
            e.printStackTrace();
            return m23378b(str);
        }
    }

    /* renamed from: b */
    private String m23378b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(SameMD5.TAG);
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo56484a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(m23377a(str + str2 + this.f19920a));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
