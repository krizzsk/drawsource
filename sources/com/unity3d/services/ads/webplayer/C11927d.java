package com.unity3d.services.ads.webplayer;

import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;

/* renamed from: com.unity3d.services.ads.webplayer.d */
/* compiled from: WebPlayerEventBridge */
public class C11927d {
    /* renamed from: a */
    public static void m32479a(String str, String str2, String str3) {
        C12136a c = C12136a.m33103c();
        if (c != null) {
            c.mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.ERROR, str2, str3, str);
        }
    }

    /* renamed from: a */
    public static void m32477a(String str, int i, int i2, int i3, int i4, float f) {
        C12136a c = C12136a.m33103c();
        if (c != null) {
            c.mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.FRAME_UPDATE, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(f));
        }
    }

    /* renamed from: a */
    public static void m32478a(String str, String str2, int i, int i2, int i3, int i4, float f) {
        C12136a c = C12136a.m33103c();
        if (c != null) {
            c.mo71310a((Enum) C12143b.WEBPLAYER, (Enum) C11926c.GET_FRAME_RESPONSE, str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(f));
        }
    }
}
