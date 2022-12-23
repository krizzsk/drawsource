package com.ogury.p376cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Date;

/* renamed from: com.ogury.cm.internal.accbc */
public final class accbc implements accbb {

    /* renamed from: a */
    public static final aaaaa f24469a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.accbc$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: a */
    private static abcaa m27974a() {
        abbba abbba = abbba.f24320a;
        return abbba.m27831c().mo63846d();
    }

    /* renamed from: a */
    public final void mo63923a(Context context) {
        bbabc.m28052b(context, "context");
        abbba abbba = abbba.f24320a;
        if (abbba.m27838f("CCPAF")) {
            SharedPreferences.Editor edit = context.getSharedPreferences("cacheConsentCcpaf", 0).edit();
            edit.putString("uspString", m27974a().mo63853a());
            edit.putBoolean("explicitNotice", m27974a().mo63857b());
            edit.putBoolean("optOutSale", m27974a().mo63859c());
            edit.putBoolean("lspa", m27974a().mo63861d());
            edit.putBoolean("ccpaApplies", m27974a().mo63862e());
            edit.apply();
        }
    }

    /* renamed from: b */
    public final void mo63924b(Context context) {
        bbabc.m28052b(context, "context");
        context.getSharedPreferences("cacheConsentCcpaf", 0).edit().clear().apply();
        abbba abbba = abbba.f24320a;
        abbba.m27826a(new Date());
    }

    /* renamed from: c */
    public final void mo63925c(Context context) {
        bbabc.m28052b(context, "context");
        abbba abbba = abbba.f24320a;
        if (abbba.m27838f("CCPAF")) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("cacheConsentCcpaf", 0);
            abcaa a = m27974a();
            String string = sharedPreferences.getString("uspString", "");
            bbabc.m28049a((Object) string, "prefs.getString(USP_STRING, \"\")");
            a.mo63854a(string);
            a.mo63855a(sharedPreferences.getBoolean("explicitNotice", false));
            a.mo63856b(sharedPreferences.getBoolean("optOutSale", false));
            a.mo63858c(sharedPreferences.getBoolean("lspa", false));
            a.mo63860d(sharedPreferences.getBoolean("ccpaApplies", false));
        }
    }
}
