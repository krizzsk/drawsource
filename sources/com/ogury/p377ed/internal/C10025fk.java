package com.ogury.p377ed.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyConstants;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ogury.ed.internal.fk */
public final class C10025fk {

    /* renamed from: a */
    public static final C10026a f25214a = new C10026a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C10025fk f25215c;

    /* renamed from: b */
    private final SharedPreferences f25216b;

    public /* synthetic */ C10025fk(Context context, byte b) {
        this(context);
    }

    private C10025fk(Context context) {
        this.f25216b = context.getSharedPreferences("profig", 0);
    }

    /* renamed from: com.ogury.ed.internal.fk$a */
    public static final class C10026a {
        public /* synthetic */ C10026a(byte b) {
            this();
        }

        private C10026a() {
        }

        /* renamed from: a */
        public static C10025fk m29075a(Context context) {
            C10263mq.m29882b(context, "context");
            if (C10025fk.f25215c == null) {
                Context applicationContext = context.getApplicationContext();
                C10263mq.m29879a((Object) applicationContext, "context.applicationContext");
                C10025fk.f25215c = new C10025fk(applicationContext, (byte) 0);
            }
            C10025fk l = C10025fk.f25215c;
            C10263mq.m29878a((Object) l);
            return l;
        }
    }

    /* renamed from: a */
    public final void mo64672a(int i) {
        this.f25216b.edit().putInt("numberOfProfigApiCalls", i).apply();
    }

    /* renamed from: a */
    public final int mo64671a() {
        return this.f25216b.getInt("numberOfProfigApiCalls", 0);
    }

    /* renamed from: b */
    public final String mo64675b() {
        SharedPreferences sharedPreferences = this.f25216b;
        C10263mq.m29879a((Object) sharedPreferences, "sharedPref");
        return C10056gk.m29200a(sharedPreferences, "md5Profig", "");
    }

    /* renamed from: a */
    public final void mo64674a(String str) {
        C10263mq.m29882b(str, "md5Profig");
        this.f25216b.edit().putString("md5Profig", str).apply();
    }

    /* renamed from: b */
    public final void mo64676b(String str) {
        C10263mq.m29882b(str, "aaid");
        this.f25216b.edit().putString("aaid", str).apply();
    }

    /* renamed from: c */
    public final String mo64677c() {
        SharedPreferences sharedPreferences = this.f25216b;
        C10263mq.m29879a((Object) sharedPreferences, "sharedPref");
        return C10056gk.m29200a(sharedPreferences, "aaid", "");
    }

    /* renamed from: c */
    public final void mo64678c(String str) {
        C10263mq.m29882b(str, "fullProfigResponse");
        this.f25216b.edit().putString("fullProfigResponseJson", str).apply();
    }

    /* renamed from: d */
    public final String mo64679d() {
        SharedPreferences sharedPreferences = this.f25216b;
        C10263mq.m29879a((Object) sharedPreferences, "sharedPref");
        return C10056gk.m29200a(sharedPreferences, "fullProfigResponseJson", "");
    }

    /* renamed from: e */
    public final void mo64681e() {
        this.f25216b.edit().putLong("numberOfDays", System.currentTimeMillis() / TimeUnit.DAYS.toMillis(1)).apply();
    }

    /* renamed from: f */
    public final long mo64683f() {
        return this.f25216b.getLong("numberOfDays", 0);
    }

    /* renamed from: d */
    public final void mo64680d(String str) {
        C10263mq.m29882b(str, "appVersion");
        this.f25216b.edit().putString("appVersion", str).apply();
    }

    /* renamed from: g */
    public final String mo64684g() {
        String string = this.f25216b.getString("appVersion", C10061go.m29208a());
        return string == null ? "" : string;
    }

    /* renamed from: a */
    public final void mo64673a(long j) {
        this.f25216b.edit().putLong("last_profig_sync", j).apply();
    }

    /* renamed from: h */
    public final long mo64685h() {
        return this.f25216b.getLong("last_profig_sync", 0);
    }

    /* renamed from: e */
    public final void mo64682e(String str) {
        C10263mq.m29882b(str, "apiKey");
        this.f25216b.edit().putString(TapjoyConstants.TJC_API_KEY, str).apply();
    }

    /* renamed from: i */
    public final String mo64686i() {
        SharedPreferences sharedPreferences = this.f25216b;
        C10263mq.m29879a((Object) sharedPreferences, "sharedPref");
        return C10056gk.m29200a(sharedPreferences, TapjoyConstants.TJC_API_KEY, "");
    }

    /* renamed from: j */
    public final void mo64687j() {
        this.f25216b.edit().putLong("profigSyncRequired", System.currentTimeMillis()).apply();
    }

    /* renamed from: k */
    public final boolean mo64688k() {
        return this.f25216b.getLong("profigSyncRequired", 0) >= mo64685h();
    }
}
