package com.ogury.p377ed.internal;

import android.content.Context;
import android.content.pm.ShortcutManager;

/* renamed from: com.ogury.ed.internal.ib */
public final class C10114ib {
    /* renamed from: a */
    public static ShortcutManager m29468a(Context context) {
        C10263mq.m29882b(context, "context");
        Object systemService = context.getSystemService(ShortcutManager.class);
        C10263mq.m29879a(systemService, "context.getSystemService…rtcutManager::class.java)");
        return (ShortcutManager) systemService;
    }
}
