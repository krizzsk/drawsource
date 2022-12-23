package com.mbridge.msdk.widget;

import android.view.View;
import java.util.Calendar;

/* renamed from: com.mbridge.msdk.widget.a */
/* compiled from: MBridgeNoDoubleClick */
public abstract class C9676a implements View.OnClickListener {

    /* renamed from: a */
    private long f24111a = 0;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo58499a(View view);

    public void onClick(View view) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.f24111a > 2000) {
            this.f24111a = timeInMillis;
            mo58499a(view);
        }
    }
}
