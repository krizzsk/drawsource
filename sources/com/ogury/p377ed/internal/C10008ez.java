package com.ogury.p377ed.internal;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.View;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ogury.ed.internal.ez */
public final class C10008ez {

    /* renamed from: a */
    public static final C10009a f25168a = new C10009a((byte) 0);

    /* renamed from: b */
    private final Context f25169b;

    /* renamed from: c */
    private final TimeZone f25170c;

    /* renamed from: d */
    private final DisplayMetrics f25171d;

    /* renamed from: e */
    private final String f25172e;

    /* renamed from: f */
    private final String f25173f;

    private C10008ez(Context context, TimeZone timeZone, DisplayMetrics displayMetrics) {
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(timeZone, "utcTimezone");
        C10263mq.m29882b(displayMetrics, "displayMetrics");
        this.f25169b = context;
        this.f25170c = timeZone;
        this.f25171d = displayMetrics;
        String str = Build.MANUFACTURER;
        C10263mq.m29879a((Object) str, "MANUFACTURER");
        this.f25172e = str;
        this.f25173f = Build.MODEL;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private /* synthetic */ C10008ez(android.content.Context r3, java.util.TimeZone r4) {
        /*
            r2 = this;
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            java.lang.String r1 = "getSystem().displayMetrics"
            com.ogury.p377ed.internal.C10263mq.m29879a((java.lang.Object) r0, (java.lang.String) r1)
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p377ed.internal.C10008ez.<init>(android.content.Context, java.util.TimeZone):void");
    }

    /* renamed from: com.ogury.ed.internal.ez$a */
    public static final class C10009a {
        public /* synthetic */ C10009a(byte b) {
            this();
        }

        private C10009a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10008ez(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            com.ogury.p377ed.internal.C10263mq.m29882b(r3, r0)
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            java.lang.String r1 = "getTimeZone(\"UTC\")"
            com.ogury.p377ed.internal.C10263mq.m29879a((java.lang.Object) r0, (java.lang.String) r1)
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p377ed.internal.C10008ez.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public static String m28967a() {
        String str = Build.VERSION.RELEASE;
        C10263mq.m29879a((Object) str, "RELEASE");
        return str;
    }

    /* renamed from: b */
    public static int m28970b() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: c */
    public static String m28971c() {
        String property = System.getProperty("java.vm.version");
        return property == null ? "" : property;
    }

    /* renamed from: d */
    public static String m28972d() {
        String property = System.getProperty("java.vm.name");
        return property == null ? "" : property;
    }

    /* renamed from: e */
    public static String m28973e() {
        String property = System.getProperty("os.arch");
        return property == null ? "" : property;
    }

    /* renamed from: f */
    public static String m28974f() {
        try {
            String format = new SimpleDateFormat("Z", Locale.US).format(new Date());
            StringBuilder sb = new StringBuilder();
            C10263mq.m29879a((Object) format, "formattedTime");
            String substring = format.substring(0, 3);
            C10263mq.m29879a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append(':');
            String substring2 = format.substring(3, format.length());
            C10263mq.m29879a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring2);
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: g */
    public final String mo64619g() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(this.f25170c);
        String format = simpleDateFormat.format(date);
        C10263mq.m29879a((Object) format, "format.format(currentLocalDate)");
        return format;
    }

    /* renamed from: h */
    public final boolean mo64620h() {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                if (Build.VERSION.SDK_INT < 21) {
                    if (Build.VERSION.SDK_INT < 17 || Settings.Global.getInt(this.f25169b.getContentResolver(), "install_non_market_apps", 0) != 1) {
                        return false;
                    }
                    return true;
                }
            }
            if (Settings.Secure.getInt(this.f25169b.getContentResolver(), "install_non_market_apps", 0) != 1) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = m28969a(r3.f25172e, r0);
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo64621i() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f25173f
            java.lang.String r1 = "Unknown"
            if (r0 != 0) goto L_0x0007
            return r1
        L_0x0007:
            java.lang.String r2 = r3.f25172e
            java.lang.String r0 = m28969a(r2, r0)
            if (r0 != 0) goto L_0x0010
            return r1
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p377ed.internal.C10008ez.mo64621i():java.lang.String");
    }

    /* renamed from: a */
    private static String m28969a(String str, String str2) {
        if (C10312oc.m29953b(str2, str)) {
            return str2;
        }
        return str + ' ' + str2;
    }

    /* renamed from: j */
    public final String mo64622j() {
        try {
            NetworkInfo a = C10039fw.m29157a(this.f25169b);
            return a != null ? m28968a(a) : "UNKNOWN";
        } catch (Exception unused) {
            return "NONE";
        }
    }

    /* renamed from: a */
    private static String m28968a(NetworkInfo networkInfo) {
        if (C10039fw.m29158a(networkInfo)) {
            String typeName = networkInfo.getTypeName();
            C10263mq.m29879a((Object) typeName, "{\n            info.typeName\n        }");
            return typeName;
        }
        return networkInfo.getTypeName() + " - " + networkInfo.getSubtypeName();
    }

    /* renamed from: k */
    public final int mo64623k() {
        return this.f25171d.widthPixels;
    }

    /* renamed from: l */
    public final int mo64624l() {
        return this.f25171d.heightPixels;
    }

    /* renamed from: a */
    public final Rect mo64618a(View view) {
        C10263mq.m29882b(view, "view");
        Rect rect = new Rect(0, 0, this.f25171d.widthPixels, this.f25171d.heightPixels);
        try {
            view.getWindowVisibleDisplayFrame(rect);
        } catch (Exception unused) {
        }
        return rect;
    }

    /* renamed from: m */
    public final int mo64625m() {
        Object systemService = this.f25169b.getSystemService("audio");
        if (systemService != null) {
            return ((AudioManager) systemService).getStreamVolume(3);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
    }

    /* renamed from: n */
    public final String mo64626n() {
        return this.f25169b.getResources().getConfiguration().orientation == 2 ? "landscape" : "portrait";
    }

    /* renamed from: o */
    public final float mo64627o() {
        return this.f25171d.density;
    }

    /* renamed from: p */
    public final boolean mo64628p() {
        return this.f25169b.getResources().getConfiguration().orientation == 1;
    }
}
