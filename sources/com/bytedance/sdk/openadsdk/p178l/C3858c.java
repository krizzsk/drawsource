package com.bytedance.sdk.openadsdk.p178l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.core.C3513m;

/* renamed from: com.bytedance.sdk.openadsdk.l.c */
/* compiled from: BatteryDataWatcher */
public class C3858c {

    /* renamed from: a */
    static int f9912a = -1;

    /* renamed from: b */
    static float f9913b = 0.0f;

    /* renamed from: c */
    private static final Handler f9914c = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final BroadcastReceiver f9915d = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if (intent != null && "android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                C3858c.m12588b(intent);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static boolean f9916e;

    /* renamed from: f */
    private static final Runnable f9917f = new Runnable() {
        public void run() {
            C2905l.m8111b("BatteryDataWatcher", "cancel receiver");
            try {
                C3513m.m10963a().unregisterReceiver(C3858c.f9915d);
                boolean unused = C3858c.f9916e = false;
            } catch (Exception e) {
                C2905l.m8115c("BatteryDataWatcher", "", e);
            }
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m12588b(Intent intent) {
        if (intent.getIntExtra("status", -1) == 2) {
            f9912a = 1;
        } else {
            f9912a = 0;
        }
        f9913b = ((float) (intent.getIntExtra("level", -1) * 100)) / ((float) intent.getIntExtra("scale", -1));
        C2905l.m8111b("BatteryDataWatcher", "updateFromIntent: " + f9912a + ", " + f9913b);
    }

    /* renamed from: a */
    public static Intent m12583a(Context context) {
        C2905l.m8111b("BatteryDataWatcher", "register() called with: context = [" + context + "]");
        Intent intent = null;
        if (f9916e) {
            return null;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            intent = context.registerReceiver(f9915d, intentFilter);
            f9916e = true;
            f9914c.removeCallbacks(f9917f);
            f9914c.postDelayed(f9917f, 60000);
            return intent;
        } catch (Throwable th) {
            C2905l.m8115c("BatteryDataWatcher", "", th);
            return intent;
        }
    }

    /* renamed from: a */
    public static C3861a m12584a() {
        if (!f9916e) {
            Intent a = m12583a(C3513m.m10963a());
            if (a != null) {
                m12588b(a);
            }
        } else {
            f9914c.removeCallbacks(f9917f);
            f9914c.postDelayed(f9917f, 60000);
        }
        C3861a aVar = new C3861a(f9912a, f9913b);
        C2905l.m8111b("BatteryDataWatcher", "obtainCurrentState: " + aVar);
        return aVar;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.l.c$a */
    /* compiled from: BatteryDataWatcher */
    public static class C3861a {

        /* renamed from: a */
        public final int f9918a;

        /* renamed from: b */
        public final float f9919b;

        public C3861a(int i, float f) {
            this.f9918a = i;
            this.f9919b = f;
        }

        public String toString() {
            return "BatteryInfo{batteryStatus=" + this.f9918a + ", batteryResidualRatio=" + this.f9919b + '}';
        }
    }
}
