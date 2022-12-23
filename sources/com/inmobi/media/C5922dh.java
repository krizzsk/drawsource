package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.dh */
/* compiled from: ResizeProperties */
public class C5922dh {
    public static final String DEFAULT_POSITION = "top-right";
    private static final String TAG = C5922dh.class.getSimpleName();
    Boolean allowOffscreen;
    String customClosePosition;
    int height;
    int offsetX = 0;
    int offsetY = 0;
    int width;

    public C5922dh(String str, Boolean bool) {
        this.customClosePosition = str;
        this.allowOffscreen = bool;
    }

    /* renamed from: a */
    public static C5922dh m17608a(String str, C5922dh dhVar) {
        boolean z;
        String str2;
        try {
            C5922dh dhVar2 = (C5922dh) new C6225is().mo35434a(new JSONObject(str), C5922dh.class);
            if (dhVar2 == null) {
                return null;
            }
            if (dhVar2.customClosePosition == null) {
                if (dhVar == null) {
                    str2 = DEFAULT_POSITION;
                } else {
                    str2 = dhVar.customClosePosition;
                }
                dhVar2.customClosePosition = str2;
            }
            if (dhVar2.allowOffscreen == null) {
                if (dhVar == null) {
                    z = true;
                } else {
                    z = dhVar.allowOffscreen.booleanValue();
                }
                dhVar2.allowOffscreen = Boolean.valueOf(z);
            }
            return dhVar2;
        } catch (JSONException unused) {
            return null;
        }
    }
}
