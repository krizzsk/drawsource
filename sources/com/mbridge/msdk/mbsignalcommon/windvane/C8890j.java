package com.mbridge.msdk.mbsignalcommon.windvane;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.j */
/* compiled from: WindVaneUtil */
public final class C8890j {

    /* renamed from: a */
    private static final String[] f21916a = {"wv_hybrid:", "mraid:", "ssp:", "mvb_hybrid:"};

    /* renamed from: b */
    private static final Pattern f21917b = Pattern.compile("hybrid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: c */
    private static final Pattern f21918c = Pattern.compile("mraid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: d */
    private static final Pattern f21919d = Pattern.compile("ssp://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: e */
    private static final Pattern f21920e = Pattern.compile("mv://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: f */
    private static Map<String, String> f21921f = new HashMap();

    static {
        for (C8885e eVar : C8885e.values()) {
            f21921f.put(eVar.mo58680a(), eVar.mo58681b());
        }
    }

    /* renamed from: a */
    public static boolean m25678a(String str) {
        for (String equals : f21916a) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static Pattern m25679b(String str) {
        if ("wv_hybrid:".equals(str)) {
            return f21920e;
        }
        if ("mraid:".equals(str)) {
            return f21918c;
        }
        if ("ssp:".equals(str)) {
            return f21919d;
        }
        if ("mvb_hybrid:".equals(str)) {
            return f21920e;
        }
        return null;
    }

    /* renamed from: c */
    public static String m25680c(String str) {
        char[] cArr = {'\'', '\\'};
        StringBuffer stringBuffer = new StringBuffer(1000);
        stringBuffer.setLength(0);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            boolean z = true;
            if (charAt > 255) {
                stringBuffer.append("\\u");
                String upperCase = Integer.toHexString(charAt >>> 8).toUpperCase();
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                String upperCase2 = Integer.toHexString(charAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase2);
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= 2) {
                        z = false;
                        break;
                    } else if (cArr[i2] == charAt) {
                        stringBuffer.append("\\" + charAt);
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    stringBuffer.append(charAt);
                }
            }
        }
        return new String(stringBuffer);
    }

    /* renamed from: d */
    public static boolean m25681d(String str) {
        return m25682e(str).startsWith("image");
    }

    /* renamed from: e */
    public static String m25682e(String str) {
        String str2 = f21921f.get(m25683f(str));
        return str2 == null ? "" : str2;
    }

    /* renamed from: f */
    private static String m25683f(String str) {
        String path;
        int lastIndexOf;
        if (TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (lastIndexOf = path.lastIndexOf(".")) == -1) {
            return "";
        }
        return path.substring(lastIndexOf + 1);
    }
}
