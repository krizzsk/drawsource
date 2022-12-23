package com.bytedance.sdk.openadsdk.p128b;

import android.content.Context;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.bytedance.sdk.openadsdk.b.q */
/* compiled from: StatsBatchEventRepertoryImpl */
public class C3114q extends C3116s {
    /* renamed from: c */
    public String mo18714c() {
        return "logstatsbatch";
    }

    public C3114q(Context context) {
        super(context);
    }

    /* renamed from: b */
    public int mo18669b() {
        return this.f7328a.mo19368b("stats_serverbusy_retrycount", 0);
    }

    /* renamed from: a */
    public void mo18662a(int i) {
        this.f7328a.mo19364a("stats_serverbusy_retrycount", i);
    }

    /* renamed from: d */
    public static String m9037d() {
        return "CREATE TABLE IF NOT EXISTS " + "logstatsbatch" + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," + "id" + " TEXT UNIQUE," + "value" + " TEXT ," + "gen_time" + " TEXT , " + TapjoyConstants.TJC_RETRY + " INTEGER default 0" + ")";
    }
}
