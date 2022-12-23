package com.ogury.p377ed.internal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* renamed from: com.ogury.ed.internal.gp */
public final class C10062gp {
    /* renamed from: a */
    public static final Activity m29210a(View view) {
        View findViewById;
        C10263mq.m29882b(view, "<this>");
        View rootView = view.getRootView();
        Context context = null;
        if (!(rootView == null || (findViewById = rootView.findViewById(16908290)) == null)) {
            context = findViewById.getContext();
        }
        return m29209a(context);
    }

    /* renamed from: a */
    private static final Activity m29209a(Context context) {
        while (true) {
            ContextWrapper contextWrapper = null;
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof ContextWrapper) {
                contextWrapper = (ContextWrapper) baseContext;
            }
            context = contextWrapper;
        }
    }
}
