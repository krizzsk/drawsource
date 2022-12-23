package com.fyber.inneractive.sdk.util;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.util.C5256b0;

/* renamed from: com.fyber.inneractive.sdk.util.a0 */
public class C5254a0 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C5256b0 f13945a;

    public C5254a0(C5256b0 b0Var) {
        this.f13945a = b0Var;
    }

    public void onReceive(Context context, Intent intent) {
        boolean z;
        C5256b0 b0Var = this.f13945a;
        b0Var.getClass();
        IAlog.m16446a("%sonReceive. action = %s", IAlog.m16443a((Object) b0Var), intent.getAction());
        C5256b0 b0Var2 = this.f13945a;
        synchronized (b0Var2) {
            try {
                z = ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
            } catch (Exception unused) {
                IAlog.m16446a("%sFailed to get lock screen status", IAlog.m16443a((Object) b0Var2));
                z = false;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                b0Var2.f13947b = true;
            } else if (("android.intent.action.SCREEN_ON".equals(intent.getAction()) && !z) || "android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                b0Var2.f13947b = false;
            }
            IAlog.m16446a("%sNew screen state is locked: %s. number of listeners: %d", IAlog.m16443a((Object) b0Var2), Boolean.valueOf(b0Var2.f13947b), Integer.valueOf(b0Var2.f13946a.size()));
            for (C5256b0.C5258b b : b0Var2.f13946a) {
                b.mo26264b(b0Var2.f13947b);
            }
        }
    }
}
