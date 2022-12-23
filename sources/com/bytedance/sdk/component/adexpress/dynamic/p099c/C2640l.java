package com.bytedance.sdk.component.adexpress.dynamic.p099c;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2570c;
import com.bytedance.sdk.component.adexpress.dynamic.p099c.C2621a;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2914t;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.l */
/* compiled from: LayoutUnitSizeUtils */
public class C2640l {

    /* renamed from: a */
    private static final Set<String> f5729a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"dislike", "close", "close-fill", "webview-close"})));

    /* renamed from: b */
    private static String f5730b;

    /* renamed from: a */
    public static C2621a.C2624c m7078a(String str, String str2, String str3, boolean z, boolean z2, int i) {
        float f;
        int i2;
        int i3;
        C2621a.C2624c cVar = new C2621a.C2624c();
        if (str.startsWith("<svg") || f5729a.contains(str2)) {
            try {
                if ("close".equals(str2)) {
                    float optDouble = (float) new JSONObject(str3).optDouble("fontSize");
                    cVar.f5696a = optDouble;
                    cVar.f5697b = optDouble;
                    return cVar;
                }
            } catch (Exception unused) {
            }
            cVar.f5696a = 10.0f;
            cVar.f5697b = 10.0f;
            return cVar;
        } else if (!"logo".equals(str2)) {
            if ("development-name".equals(str2)) {
                str = "开发者：" + str;
            }
            if ("app-version".equals(str2)) {
                str = "版本号：V" + str;
            }
            if ("score-count".equals(str2)) {
                try {
                    i3 = Integer.parseInt(str);
                } catch (NumberFormatException unused2) {
                    i3 = 0;
                }
                return m7077a("(" + String.format(C2914t.m8151a(C2570c.m6618a(), "tt_comment_num"), new Object[]{Integer.valueOf(i3)}) + ")", str3);
            } else if ("score-count-type-2".equals(str2)) {
                try {
                    i2 = Integer.parseInt(str);
                } catch (NumberFormatException unused3) {
                    i2 = 0;
                }
                return m7077a("(" + String.format(new DecimalFormat("###,###,###").format((long) i2), new Object[]{Integer.valueOf(i2)}) + ")", str3);
            } else if ("feedback-dislike".equals(str2)) {
                return m7077a(C2914t.m8151a(C2570c.m6618a(), "tt_reward_feedback"), str3);
            } else {
                if ("skip-with-time-countdown".equals(str2) || TextUtils.equals("skip-with-countdowns-video-countdown", str2)) {
                    return m7077a("00S", str3);
                }
                if (TextUtils.equals("skip-with-countdowns-skip-btn", str2)) {
                    return m7077a(" | " + C2914t.m8151a(C2570c.m6618a(), "tt_reward_screen_skip_tx"), str3);
                } else if (TextUtils.equals("skip-with-countdowns-skip-countdown", str2)) {
                    return m7077a(" | " + String.format(C2914t.m8151a(C2570c.m6618a(), "tt_reward_full_skip_count_down"), new Object[]{"00"}), str3);
                } else if ("skip-with-time-skip-btn".equals(str2)) {
                    return m7077a(" |  " + C2914t.m8151a(C2570c.m6618a(), "tt_reward_screen_skip_tx"), str3);
                } else if ("skip".equals(str2)) {
                    return m7077a(C2914t.m8151a(C2570c.m6618a(), "tt_reward_screen_skip_tx"), str3);
                } else {
                    if ("timedown".equals(str2)) {
                        return m7077a(IdManager.DEFAULT_VERSION_NAME, str3);
                    }
                    if ("text_star".equals(str2)) {
                        return m7077a("0.00", str3);
                    }
                    if (TextUtils.equals("privacy-detail", str2)) {
                        return m7077a("权限列表 | 隐私政策", str3);
                    }
                    if ("arrowButton".equals(str2)) {
                        return m7077a("立即下载", str3);
                    }
                    if ("title".equals(str2)) {
                        try {
                            return m7079a(str.replace(10, ' '), str3, true);
                        } catch (Exception unused4) {
                        }
                    }
                    if ("fillButton".equals(str2) || "text".equals(str2) || "button".equals(str2) || "downloadWithIcon".equals(str2) || "downloadButton".equals(str2) || "laceButton".equals(str2) || "cardButton".equals(str2) || "colourMixtureButton".equals(str2) || "arrowButton".equals(str2) || "source".equals(str2) || TextUtils.equals("app-version", str2) || TextUtils.equals("development-name", str2)) {
                        return m7077a(str, str3);
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str3);
                        int length = str.length();
                        float optDouble2 = (float) jSONObject.optDouble("fontSize");
                        float optDouble3 = (float) jSONObject.optDouble("letterSpacing");
                        float optDouble4 = (float) jSONObject.optDouble("lineHeight");
                        float optDouble5 = (float) jSONObject.optDouble("maxWidth");
                        float f2 = (((float) length) * (optDouble2 + optDouble3)) - optDouble3;
                        C2905l.m8118e("DynamicBaseWidget", "getDomSizeFromNative letterSpacing==" + optDouble3 + ",lineHeight==" + optDouble4 + ",maxWidth ==" + optDouble5 + ",totalStrLength" + f2);
                        if ("muted".equals(str2)) {
                            cVar.f5696a = optDouble2;
                            cVar.f5697b = optDouble2;
                            return cVar;
                        } else if ("star".equals(str2)) {
                            cVar.f5696a = 5.0f * optDouble2;
                            cVar.f5697b = optDouble2;
                            return cVar;
                        } else if (RewardPlus.ICON.equals(str2)) {
                            cVar.f5696a = optDouble2;
                            cVar.f5697b = optDouble2;
                            return cVar;
                        } else {
                            if (z) {
                                int i4 = ((int) (f2 / optDouble5)) + 1;
                                if (!z2 || i4 < i) {
                                    i = i4;
                                }
                                f = (float) (((double) (optDouble4 * optDouble2 * ((float) i))) * 1.2d);
                            } else {
                                float f3 = (float) (((double) (optDouble4 * optDouble2)) * 1.2d);
                                if (f2 <= optDouble5) {
                                    optDouble5 = f2;
                                }
                                f = f3;
                            }
                            cVar.f5696a = optDouble5;
                            cVar.f5697b = f;
                            return cVar;
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else if (C2570c.m6619b() || ((TextUtils.isEmpty(str) || !str.contains("adx:")) && !m7086b())) {
            cVar.f5696a = "union".equals(str) ? 10.0f : 20.0f;
            cVar.f5697b = 10.0f;
            if (C2570c.m6619b()) {
                if ((str2 + str).contains("logoad")) {
                    return m7077a("AD", str3);
                }
            }
            return cVar;
        } else if (m7086b()) {
            return m7076a(cVar, str, str3, f5730b);
        } else {
            return m7076a(cVar, str, str3, "");
        }
    }

    /* renamed from: a */
    public static String m7081a(String str) {
        String[] split;
        if (!TextUtils.isEmpty(str) && (split = str.split("adx:")) != null && split.length >= 2) {
            return split[1];
        }
        return "";
    }

    /* renamed from: a */
    private static C2621a.C2624c m7076a(C2621a.C2624c cVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            cVar.f5696a = 0.0f;
            cVar.f5697b = 0.0f;
        } else {
            if (TextUtils.isEmpty(str3)) {
                str3 = m7081a(str);
            }
            if (!TextUtils.isEmpty(str3)) {
                return m7077a(str3, str2);
            }
            cVar.f5696a = 0.0f;
            cVar.f5697b = 0.0f;
        }
        return cVar;
    }

    /* renamed from: b */
    public static String m7084b(String str, String str2, String str3, boolean z, boolean z2, int i) {
        JSONObject jSONObject = new JSONObject();
        C2621a.C2624c a = m7078a(str, str2, str3, z, z2, i);
        try {
            jSONObject.put("width", (double) a.f5696a);
            jSONObject.put("height", (double) a.f5697b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static C2621a.C2624c m7077a(String str, String str2) {
        return m7079a(str, str2, false);
    }

    /* renamed from: a */
    public static C2621a.C2624c m7079a(String str, String str2, boolean z) {
        C2621a.C2624c cVar = new C2621a.C2624c();
        try {
            int[] a = m7083a(str, (int) Double.parseDouble(new JSONObject(str2).optString("fontSize")), z);
            cVar.f5696a = (float) a[0];
            cVar.f5697b = (float) a[1];
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cVar;
    }

    /* renamed from: a */
    public static int[] m7083a(String str, int i, boolean z) {
        int[] a = m7082a(str, (float) i, z);
        return new int[]{C2572b.m6626b(C2570c.m6618a(), (float) a[0]), C2572b.m6626b(C2570c.m6618a(), (float) a[1])};
    }

    /* renamed from: a */
    public static int[] m7082a(String str, float f, boolean z) {
        TextView textView = new TextView(C2570c.m6618a());
        textView.setTextSize(f);
        textView.setText(str);
        textView.setIncludeFontPadding(false);
        if (z) {
            textView.setSingleLine();
        }
        textView.measure(-2, -2);
        return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
    }

    /* renamed from: b */
    public static void m7085b(String str) {
        f5730b = str;
    }

    /* renamed from: a */
    public static String m7080a() {
        return f5730b;
    }

    /* renamed from: b */
    public static boolean m7086b() {
        return !TextUtils.isEmpty(f5730b);
    }
}
