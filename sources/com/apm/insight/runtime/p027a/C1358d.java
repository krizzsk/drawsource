package com.apm.insight.runtime.p027a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.apm.insight.C1186b;
import com.apm.insight.runtime.C1394p;

/* renamed from: com.apm.insight.runtime.a.d */
class C1358d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f1427a;

    /* renamed from: com.apm.insight.runtime.a.d$a */
    private class C1360a extends BroadcastReceiver {
        private C1360a() {
        }

        public void onReceive(Context context, Intent intent) {
            try {
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    int unused = C1358d.this.f1427a = (int) ((((float) intent.getIntExtra("level", 0)) * 100.0f) / ((float) intent.getIntExtra("scale", 100)));
                }
            } catch (Throwable unused2) {
            }
        }
    }

    C1358d(final Context context) {
        C1394p.m2321b().mo12749a((Runnable) new Runnable() {
            public void run() {
                try {
                    C1358d.this.m2187a(context);
                } catch (Throwable th) {
                    C1186b.m1306a().mo12441a("NPTH_CATCH", th);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2187a(Context context) {
        context.registerReceiver(new C1360a(), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    /* renamed from: a */
    public int mo12697a() {
        return this.f1427a;
    }
}
