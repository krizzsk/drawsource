package com.ogury.p376cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Date;

/* renamed from: com.ogury.cm.internal.accca */
public abstract class accca implements accbb {

    /* renamed from: a */
    public static final aaaaa f24470a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.accca$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    public abstract String mo63926a();

    /* renamed from: a */
    public void mo63923a(Context context) {
        bbabc.m28052b(context, "context");
        abbba abbba = abbba.f24320a;
        if (abbba.m27838f("TCF")) {
            SharedPreferences.Editor edit = context.getSharedPreferences(mo63926a(), 0).edit();
            abbba abbba2 = abbba.f24320a;
            edit.putString("iabString", abbba.m27831c().mo63845c().mo63863a());
            abbba abbba3 = abbba.f24320a;
            edit.putBoolean("gdprApplies", abbba.m27831c().mo63845c().mo63866b());
            edit.apply();
        }
    }

    /* renamed from: b */
    public final void mo63924b(Context context) {
        bbabc.m28052b(context, "context");
        context.getSharedPreferences(mo63926a(), 0).edit().clear().apply();
        abbba abbba = abbba.f24320a;
        abbba.m27826a(new Date());
    }

    /* renamed from: c */
    public void mo63925c(Context context) {
        bbabc.m28052b(context, "context");
        abbba abbba = abbba.f24320a;
        if (abbba.m27838f("TCF")) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(mo63926a(), 0);
            abbba abbba2 = abbba.f24320a;
            abcab c = abbba.m27831c().mo63845c();
            String string = sharedPreferences.getString("iabString", "");
            bbabc.m28049a((Object) string, "prefs.getString(IAB_STRING_KEY, \"\")");
            c.mo63864a(string);
            abbba abbba3 = abbba.f24320a;
            abbba.m27831c().mo63845c().mo63865a(sharedPreferences.getBoolean("gdprApplies", true));
        }
    }
}
