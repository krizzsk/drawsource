package com.inmobi.media;

import android.content.Context;

/* renamed from: com.inmobi.media.ie */
/* compiled from: PermissionUtils */
public class C6197ie {

    /* renamed from: a */
    private static final String f15642a = C6197ie.class.getSimpleName();

    /* renamed from: a */
    public static boolean m18393a(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Exception unused) {
        }
    }
}
