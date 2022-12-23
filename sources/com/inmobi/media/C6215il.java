package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.internal.security.CertificateUtil;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.il */
/* compiled from: DisplayInfo */
public class C6215il {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f15666a = C6215il.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static String f15667b = null;

    /* renamed from: a */
    public static int m18443a(int i) {
        return Math.round(((float) i) * m18444a().f15674c);
    }

    /* renamed from: a */
    public static C6218im m18444a() {
        Context c = C6183hw.m18324c();
        if (c == null) {
            return new C6218im(0, 0, 2.0f);
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) c.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        float f = displayMetrics.density;
        return new C6218im(Math.round(((float) displayMetrics.widthPixels) / f), Math.round(((float) displayMetrics.heightPixels) / f), f);
    }

    /* renamed from: b */
    public static int m18449b(int i) {
        return Math.round(((float) i) / m18444a().f15674c);
    }

    /* renamed from: b */
    public static byte m18448b() {
        Context c = C6183hw.m18324c();
        if (c == null) {
            return 1;
        }
        int rotation = ((WindowManager) c.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 3;
        }
        if (rotation == 2) {
            return 2;
        }
        if (rotation != 3) {
            return 1;
        }
        return 4;
    }

    /* renamed from: c */
    public static Map<String, String> m18451c() {
        String str;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("d-device-screen-density", String.valueOf(m18444a().f15674c));
            C6218im a = m18444a();
            hashMap.put("d-device-screen-size", a.f15672a + "X" + a.f15673b);
            Context c = C6183hw.m18324c();
            if (c == null) {
                str = "0x0";
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) c.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                str = displayMetrics.widthPixels + "x" + displayMetrics.heightPixels;
            }
            hashMap.put("d-density-dependent-screen-size", str);
            hashMap.put("d-orientation", String.valueOf(m18448b()));
            hashMap.put("d-textsize", String.valueOf(new TextView(C6183hw.m18324c()).getTextSize()));
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m18446a(Context context) {
        Window window;
        WindowInsets rootWindowInsets;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && (rootWindowInsets = window.getDecorView().getRootWindowInsets()) != null) {
            m18447a(context, rootWindowInsets);
        }
    }

    /* renamed from: a */
    public static void m18447a(final Context context, final WindowInsets windowInsets) {
        C6183hw.m18316a((Runnable) new Runnable() {
            public final void run() {
                try {
                    String[] split = windowInsets.getSystemGestureInsets().toString().split("Insets");
                    StringBuffer stringBuffer = new StringBuffer();
                    if (split.length > 1) {
                        String[] split2 = split[1].replaceAll("[^0-9,=a-zA-Z]*", "").split(",");
                        stringBuffer.append("{");
                        for (int i = 0; i < split2.length; i++) {
                            String[] split3 = split2[i].split("=");
                            if (split3.length == 2) {
                                stringBuffer.append("\"" + split3[0] + "\"");
                                stringBuffer.append(CertificateUtil.DELIMITER);
                                stringBuffer.append(C6215il.m18449b(Integer.parseInt(split3[1])));
                                if (i < split2.length - 1) {
                                    stringBuffer.append(", ");
                                }
                            }
                        }
                        stringBuffer.append("}");
                    }
                    if (stringBuffer.length() > 0) {
                        String unused = C6215il.f15667b = stringBuffer.toString();
                        C6165hi.m18257a(context, "gesture_info_store").mo35369a("gesture_margin", stringBuffer.toString());
                    }
                } catch (Exception unused2) {
                    String unused3 = C6215il.f15666a;
                }
            }
        });
    }

    /* renamed from: d */
    public static String m18452d() {
        String str;
        String str2 = f15667b;
        if (str2 != null) {
            return str2;
        }
        Context c = C6183hw.m18324c();
        if (c == null) {
            str = null;
        } else {
            str = C6165hi.m18257a(c, "gesture_info_store").mo35372b("gesture_margin");
        }
        f15667b = str;
        return str;
    }

    /* renamed from: b */
    public static C6217a m18450b(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return new C6217a(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* renamed from: com.inmobi.media.il$a */
    /* compiled from: DisplayInfo */
    public static class C6217a {

        /* renamed from: a */
        public int f15670a;

        /* renamed from: b */
        public int f15671b;

        public C6217a(int i, int i2) {
            this.f15670a = i;
            this.f15671b = i2;
        }

        public final String toString() {
            return "Size{width=" + this.f15670a + ", height=" + this.f15671b + '}';
        }
    }
}
