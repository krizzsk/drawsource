package com.mbridge.msdk.dycreator.p294e;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.dycreator.binding.C8354b;
import com.mbridge.msdk.foundation.tools.C8672v;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mbridge.msdk.dycreator.e.b */
/* compiled from: CommUtil */
public final class C8371b {
    /* renamed from: a */
    public static double m23817a(double d, double d2, int i) {
        if (i < 0) {
            return 1.0d;
        }
        try {
            return new BigDecimal(Double.toString(d)).divide(new BigDecimal(Double.toString(d2)), i, 4).doubleValue();
        } catch (Exception e) {
            C8672v.m24878d("CommUtil", e.getMessage());
            return 1.0d;
        }
    }

    /* renamed from: a */
    public static int m23818a(Context context, float f) {
        if (context == null) {
            return 0;
        }
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                return 0;
            }
            return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
        } catch (Exception e) {
            C8672v.m24878d("CommUtil", e.getMessage());
            return 0;
        }
    }

    /* renamed from: a */
    public static Map<String, String> m23819a(Context context, AttributeSet attributeSet) {
        HashMap hashMap = new HashMap();
        if (!(context == null || attributeSet == null)) {
            int attributeCount = attributeSet.getAttributeCount();
            for (int i = 0; i < attributeCount; i++) {
                String attributeName = attributeSet.getAttributeName(i);
                if (!TextUtils.isEmpty(attributeName)) {
                    if (attributeName.equals("mbridge_data")) {
                        try {
                            hashMap.put("mbridgeData", C8370a.f20435a.get(attributeSet.getAttributeValue(i).substring(8)));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_click")) {
                        try {
                            hashMap.put("mbridgeAction", C8370a.f20435a.get(attributeSet.getAttributeValue(i).substring(8)));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_strategy")) {
                        try {
                            hashMap.put("mbridgeStrategy", C8370a.f20435a.get(attributeSet.getAttributeValue(i).substring(8)));
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_effect")) {
                        try {
                            hashMap.put("mbridgeEffect", C8370a.f20435a.get(attributeSet.getAttributeValue(i).substring(8)));
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_report")) {
                        try {
                            hashMap.put("mbridgeReport", attributeSet.getAttributeValue(i));
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m23821a(Map<String, String> map, View view) {
        if (map != null && view != null) {
            if (map.containsKey("mbridgeData")) {
                C8354b.m23777a().mo56803c(view);
            }
            if (map.containsKey("mbridgeAction")) {
                C8354b.m23777a().mo56804d(view);
            }
            if (map.containsKey("mbridgeEffect")) {
                C8354b.m23777a().mo56802b(view);
            }
            if (map.containsKey("mbridgeReport")) {
                C8354b.m23777a().mo56799a(view);
            }
        }
    }

    /* renamed from: a */
    public static Map<String, Boolean> m23820a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("\\|");
            if (split == null || split.length <= 0) {
                if (str.equals("attached")) {
                    hashMap.put("attached", true);
                }
                if (str.equals("detached")) {
                    hashMap.put("detached", true);
                }
            } else {
                for (String str2 : split) {
                    if (str2.equals("attached")) {
                        hashMap.put("attached", true);
                    }
                    if (str2.equals("detached")) {
                        hashMap.put("detached", true);
                    }
                }
            }
        }
        return hashMap;
    }
}
