package com.tapjoy;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class TapjoyDisplayMetricsUtil {

    /* renamed from: a */
    private Context f26885a;

    /* renamed from: b */
    private Configuration f26886b;

    /* renamed from: c */
    private DisplayMetrics f26887c = new DisplayMetrics();

    public TapjoyDisplayMetricsUtil(Context context) {
        this.f26885a = context;
        ((WindowManager) this.f26885a.getSystemService("window")).getDefaultDisplay().getMetrics(this.f26887c);
        this.f26886b = this.f26885a.getResources().getConfiguration();
    }

    public int getScreenDensityDPI() {
        return this.f26887c.densityDpi;
    }

    public float getScreenDensityScale() {
        return this.f26887c.density;
    }

    public int getScreenLayoutSize() {
        return this.f26886b.screenLayout & 15;
    }
}
