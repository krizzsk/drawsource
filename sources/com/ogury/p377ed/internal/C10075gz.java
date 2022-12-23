package com.ogury.p377ed.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.ogury.ed.internal.gz */
public final class C10075gz {

    /* renamed from: a */
    public static final C10075gz f25308a = new C10075gz();

    private C10075gz() {
    }

    /* renamed from: a */
    public static void m29254a(Context context, String str) {
        C10263mq.m29882b(context, "context");
        CharSequence charSequence = str;
        if (!(charSequence == null || charSequence.length() == 0)) {
            try {
                Uri parse = Uri.parse(str);
                C10263mq.m29879a((Object) parse, "uri");
                m29253a(context, parse);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m29256b(Context context, String str) {
        C10263mq.m29882b(context, "context");
        try {
            Intent a = m29251a(str);
            if (a == null) {
                return false;
            }
            m29252a(context, a);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m29257c(Context context, String str) {
        C10263mq.m29882b(context, "context");
        try {
            Intent a = m29251a(str);
            if (a == null) {
                return false;
            }
            return m29255b(context, a);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static Intent m29251a(String str) {
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            return null;
        }
        return Intent.parseUri(str, 0);
    }

    /* renamed from: a */
    private static void m29253a(Context context, Uri uri) {
        m29252a(context, new Intent("android.intent.action.VIEW", uri));
    }

    /* renamed from: a */
    private static void m29252a(Context context, Intent intent) {
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* renamed from: b */
    private static boolean m29255b(Context context, Intent intent) {
        return context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }
}
