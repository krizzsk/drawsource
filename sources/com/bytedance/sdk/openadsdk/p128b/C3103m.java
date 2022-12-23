package com.bytedance.sdk.openadsdk.p128b;

import android.content.Context;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.bytedance.sdk.openadsdk.b.m */
/* compiled from: HighPriorityEventRepertoryImpl */
public class C3103m extends C3094g {
    /* renamed from: d */
    public String mo18672d() {
        return "loghighpriority";
    }

    public C3103m(Context context) {
        super(context);
    }

    /* renamed from: f */
    public static String m8998f() {
        return "CREATE TABLE IF NOT EXISTS " + "loghighpriority" + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," + "id" + " TEXT UNIQUE," + "value" + " TEXT ," + "gen_time" + " TEXT , " + TapjoyConstants.TJC_RETRY + " INTEGER default 0" + ")";
    }
}
