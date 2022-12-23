package com.bytedance.sdk.component.adexpress.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.component.utils.C2905l;
import java.lang.ref.WeakReference;

public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private WeakReference<C2676a> f5867a;

    public void onReceive(Context context, Intent intent) {
        C2905l.m8111b("ThemeStatusBroadcastReceiver", "====主题状态更新====");
        if (intent != null) {
            int intExtra = intent.getIntExtra("theme_status_change", 0);
            WeakReference<C2676a> weakReference = this.f5867a;
            if (weakReference != null && weakReference.get() != null) {
                ((C2676a) this.f5867a.get()).mo17184b(intExtra);
            }
        }
    }

    /* renamed from: a */
    public void mo17237a(C2676a aVar) {
        this.f5867a = new WeakReference<>(aVar);
    }
}
