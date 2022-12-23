package com.ogury.p377ed.internal;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.ogury.p377ed.internal.C10025fk;
import java.lang.reflect.Constructor;
import java.util.Locale;
import java.util.MissingResourceException;

/* renamed from: com.ogury.ed.internal.fa */
public final class C10012fa {

    /* renamed from: a */
    public static final C10013a f25176a = new C10013a((byte) 0);

    /* renamed from: b */
    private final Context f25177b;

    /* renamed from: c */
    private final C10025fk f25178c;

    private C10012fa(Context context, C10025fk fkVar) {
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(fkVar, "profigDao");
        this.f25177b = context;
        this.f25178c = fkVar;
    }

    /* renamed from: a */
    public final Context mo64636a() {
        return this.f25177b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10012fa(Context context) {
        this(context, C10025fk.C10026a.m29075a(context));
        C10025fk.C10026a aVar = C10025fk.f25214a;
    }

    /* renamed from: com.ogury.ed.internal.fa$a */
    public static final class C10013a {
        public /* synthetic */ C10013a(byte b) {
            this();
        }

        private C10013a() {
        }
    }

    /* renamed from: a */
    public final boolean mo64637a(String str) {
        C10263mq.m29882b(str, "permission");
        return C10053gh.m29193a(this.f25177b, str);
    }

    /* renamed from: b */
    public final String mo64638b() {
        return this.f25178c.mo64686i();
    }

    /* renamed from: c */
    public final String mo64639c() {
        if (Build.VERSION.SDK_INT >= 24) {
            String language = this.f25177b.getResources().getConfiguration().getLocales().get(0).getLanguage();
            C10263mq.m29879a((Object) language, "{\n            context.re…les[0].language\n        }");
            return language;
        }
        String language2 = this.f25177b.getResources().getConfiguration().locale.getLanguage();
        C10263mq.m29879a((Object) language2, "{\n            context.re…locale.language\n        }");
        return language2;
    }

    /* renamed from: d */
    public final String mo64640d() {
        String j = m28996j();
        if (j == null || j.length() != 3) {
            return m28997k();
        }
        return j;
    }

    /* renamed from: j */
    private final String m28996j() {
        try {
            Object systemService = this.f25177b.getSystemService("phone");
            if (systemService != null) {
                return new Locale("", ((TelephonyManager) systemService).getNetworkCountryIso()).getISO3Country();
            }
            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: k */
    private final String m28997k() {
        String str;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                str = this.f25177b.getResources().getConfiguration().getLocales().get(0).getISO3Country();
            } else {
                str = this.f25177b.getResources().getConfiguration().locale.getISO3Country();
            }
            C10263mq.m29879a((Object) str, "{\n            if (Build.…y\n            }\n        }");
            return str;
        } catch (MissingResourceException unused) {
            return "ZZZ";
        }
    }

    /* renamed from: e */
    public final String mo64641e() {
        return "4.2.0/" + mo64638b() + '/' + Build.VERSION.RELEASE;
    }

    /* renamed from: f */
    public final String mo64642f() {
        String packageName = this.f25177b.getPackageName();
        C10263mq.m29879a((Object) packageName, "context.packageName");
        return packageName;
    }

    /* renamed from: g */
    public final String mo64643g() {
        String str;
        Constructor<WebSettings> declaredConstructor;
        if (Build.VERSION.SDK_INT >= 17) {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f25177b);
            C10263mq.m29879a((Object) defaultUserAgent, "{\n            WebSetting…rAgent(context)\n        }");
            return defaultUserAgent;
        }
        try {
            declaredConstructor = WebSettings.class.getDeclaredConstructor(new Class[]{Context.class, WebView.class});
            C10263mq.m29879a((Object) declaredConstructor, "WebSettings::class.java.…ava, WebView::class.java)");
            declaredConstructor.setAccessible(true);
            WebSettings newInstance = declaredConstructor.newInstance(new Object[]{this.f25177b, null});
            C10263mq.m29879a((Object) newInstance, "constructor.newInstance(context, null)");
            str = newInstance.getUserAgentString();
            declaredConstructor.setAccessible(false);
        } catch (Exception unused) {
            str = new WebView(this.f25177b).getSettings().getUserAgentString();
        } catch (Throwable th) {
            declaredConstructor.setAccessible(false);
            throw th;
        }
        C10263mq.m29879a((Object) str, "try {\n            val co…userAgentString\n        }");
        return str;
    }

    /* renamed from: h */
    public final int mo64644h() {
        try {
            return this.f25177b.getPackageManager().getApplicationInfo(this.f25177b.getPackageName(), 128).targetSdkVersion;
        } catch (Exception unused) {
            return 14;
        }
    }

    /* renamed from: i */
    public final String mo64645i() {
        return m28995a(this.f25177b);
    }

    /* renamed from: a */
    private static String m28995a(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            C10263mq.m29879a((Object) str, "{\n            val packag…nfo.versionName\n        }");
            return str;
        } catch (Exception unused) {
            return "";
        }
    }
}
