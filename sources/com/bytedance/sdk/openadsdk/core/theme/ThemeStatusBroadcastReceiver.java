package com.bytedance.sdk.openadsdk.core.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.component.utils.C2905l;
import java.lang.ref.WeakReference;

public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private WeakReference<C3581a> f9049a;

    public void onReceive(Context context, Intent intent) {
        C2905l.m8111b("ThemeStatusBroadcastReceiver", "====主题状态更新====");
        if (intent != null) {
            int intExtra = intent.getIntExtra("theme_status_change", 0);
            WeakReference<C3581a> weakReference = this.f9049a;
            if (weakReference != null && weakReference.get() != null) {
                ((C3581a) this.f9049a.get()).mo20142a(intExtra);
            }
        }
    }
}
