package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.ResolveInfo;
import java.net.URISyntaxException;
import java.util.List;

/* renamed from: com.inmobi.media.hr */
/* compiled from: DeeplinkHandler */
public final class C6176hr {

    /* renamed from: a */
    private static C6176hr f15594a;

    private C6176hr() {
    }

    /* renamed from: a */
    public static synchronized C6176hr m18300a() {
        C6176hr hrVar;
        synchronized (C6176hr.class) {
            if (f15594a == null) {
                f15594a = new C6176hr();
            }
            hrVar = f15594a;
        }
        return hrVar;
    }

    /* renamed from: b */
    private static boolean m18302b(Context context, String str) {
        try {
            C6193ia.m18374b(context, str);
            return true;
        } catch (ActivityNotFoundException unused) {
            try {
                C6193ia.m18369a(context, str, (ResolveInfo) null);
                return true;
            } catch (ActivityNotFoundException | URISyntaxException unused2) {
                return false;
            }
        } catch (URISyntaxException unused3) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m18301a(Context context, String str) {
        if (str.isEmpty()) {
            return false;
        }
        List<ResolveInfo> c = C6193ia.m18376c(context, str);
        if (c.isEmpty()) {
            return m18302b(context, str);
        }
        String str2 = c.get(0).activityInfo.name;
        try {
            C6193ia.m18369a(context, str, c.get(0));
            return true;
        } catch (URISyntaxException unused) {
            return false;
        }
    }
}
