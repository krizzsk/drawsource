package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.model.vast.C4426h;

/* renamed from: com.fyber.inneractive.sdk.util.v0 */
public class C5324v0 {
    /* renamed from: a */
    public static boolean m16548a(String str, C4426h hVar) {
        String substring = str != null ? str.substring(str.lastIndexOf(".") + 1) : "";
        String str2 = hVar.toString();
        if (str2.equalsIgnoreCase(substring)) {
            return true;
        }
        if (!substring.equals("jpeg") && !substring.equals("jpg")) {
            return false;
        }
        if (str2.equals("Jpeg") || str2.equals("Jpg")) {
            return true;
        }
        return false;
    }
}
