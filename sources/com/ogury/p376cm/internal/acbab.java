package com.ogury.p376cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: com.ogury.cm.internal.acbab */
public final class acbab implements acbaa {

    /* renamed from: a */
    public static final aaaaa f24448a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.acbab$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo63911a(Context context) {
        bbabc.m28052b(context, "context");
        abbba abbba = abbba.f24320a;
        if (abbba.m27838f("CCPAF")) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).edit();
            abbba abbba2 = abbba.f24320a;
            edit.putString("IABUSPrivacy_String", abbba.m27831c().mo63846d().mo63853a());
            edit.apply();
        }
    }
}
