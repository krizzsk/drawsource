package com.ogury.p377ed.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.ogury.ed.internal.ev */
public final class C10003ev {

    /* renamed from: a */
    public static final C10004a f25164a = new C10004a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C10003ev f25165c;

    /* renamed from: b */
    private final SharedPreferences f25166b;

    public /* synthetic */ C10003ev(Context context, byte b) {
        this(context);
    }

    /* renamed from: com.ogury.ed.internal.ev$a */
    public static final class C10004a {
        public /* synthetic */ C10004a(byte b) {
            this();
        }

        private C10004a() {
        }

        /* renamed from: a */
        public static C10003ev m28961a(Context context) {
            C10263mq.m29882b(context, "context");
            if (C10003ev.f25165c == null) {
                Context applicationContext = context.getApplicationContext();
                C10263mq.m29879a((Object) applicationContext, "context.applicationContext");
                C10003ev.f25165c = new C10003ev(applicationContext, (byte) 0);
            }
            C10003ev c = C10003ev.f25165c;
            C10263mq.m29878a((Object) c);
            return c;
        }
    }

    private C10003ev(Context context) {
        this.f25166b = context.getSharedPreferences("ogury_mraid", 0);
    }

    /* renamed from: a */
    public final void mo64614a(String str) {
        C10263mq.m29882b(str, "mraidJs");
        this.f25166b.edit().putString("mraid_js", str).commit();
    }

    /* renamed from: b */
    public final void mo64616b(String str) {
        C10263mq.m29882b(str, "mraidDownloadUrl");
        this.f25166b.edit().putString("mraid_download_url", str).apply();
    }

    /* renamed from: a */
    public final String mo64613a() {
        SharedPreferences sharedPreferences = this.f25166b;
        C10263mq.m29879a((Object) sharedPreferences, "sharedPref");
        return C10056gk.m29200a(sharedPreferences, "mraid_download_url", "");
    }

    /* renamed from: b */
    public final String mo64615b() {
        SharedPreferences sharedPreferences = this.f25166b;
        C10263mq.m29879a((Object) sharedPreferences, "sharedPref");
        return C10056gk.m29200a(sharedPreferences, "mraid_js", "");
    }
}
