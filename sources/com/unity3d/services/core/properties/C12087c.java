package com.unity3d.services.core.properties;

/* renamed from: com.unity3d.services.core.properties.c */
/* compiled from: MadeWithUnityDetector */
public class C12087c {
    /* renamed from: a */
    public static boolean m32912a() {
        try {
            Class.forName("com.unity3d.player.UnityPlayer");
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }
}
