package com.applovin.impl.adview.activity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowManager;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.activity.b */
public class C1449b {

    /* renamed from: a */
    private final Activity f1702a;

    /* renamed from: b */
    private final int f1703b;

    /* renamed from: c */
    private final int f1704c;

    /* renamed from: d */
    private final boolean f1705d;

    /* renamed from: e */
    private final boolean f1706e;

    public C1449b(Activity activity) {
        this.f1702a = activity;
        this.f1704c = Utils.getRotation(activity);
        boolean isTablet = AppLovinSdkUtils.isTablet(activity);
        this.f1705d = isTablet;
        this.f1703b = m2543a(this.f1704c, isTablet);
        this.f1706e = this.f1705d && 2 == m2544a((Context) activity);
    }

    /* renamed from: a */
    private int m2543a(int i, boolean z) {
        if (!z || !this.f1706e) {
            if (i == 0) {
                return 1;
            }
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 9;
            }
            return i == 3 ? 8 : -1;
        } else if (i == 0) {
            return 0;
        } else {
            if (i == 1) {
                return 9;
            }
            if (i == 2) {
                return 8;
            }
            return i == 3 ? 1 : -1;
        }
    }

    /* renamed from: a */
    private static int m2544a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    /* renamed from: a */
    private void m2545a(int i) {
        try {
            this.f1702a.setRequestedOrientation(i);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r5.f1704c != 1) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0049, code lost:
        if (r5.f1704c == 2) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005a, code lost:
        if (r5.f1704c == 1) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r6 != 3) goto L_0x0026;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2546a(com.applovin.impl.sdk.p049ad.C1839e.C1842b r6) {
        /*
            r5 = this;
            com.applovin.impl.sdk.ad.e$b r0 = com.applovin.impl.sdk.p049ad.C1839e.C1842b.ACTIVITY_PORTRAIT
            r1 = 3
            r2 = 2
            r3 = 1
            if (r6 != r0) goto L_0x0031
            boolean r6 = r5.f1705d
            r0 = 9
            if (r6 == 0) goto L_0x0020
            boolean r6 = r5.f1706e
            if (r6 == 0) goto L_0x0020
            int r6 = r5.f1704c
            if (r6 == r3) goto L_0x0018
            if (r6 == r1) goto L_0x0018
            goto L_0x0026
        L_0x0018:
            int r6 = r5.f1704c
            if (r6 != r3) goto L_0x0026
        L_0x001c:
            r5.m2545a((int) r0)
            goto L_0x005d
        L_0x0020:
            int r6 = r5.f1704c
            if (r6 == 0) goto L_0x002a
            if (r6 == r2) goto L_0x002a
        L_0x0026:
            r5.m2545a((int) r3)
            goto L_0x005d
        L_0x002a:
            int r6 = r5.f1704c
            if (r6 != 0) goto L_0x002f
            goto L_0x0026
        L_0x002f:
            r3 = r0
            goto L_0x0026
        L_0x0031:
            com.applovin.impl.sdk.ad.e$b r0 = com.applovin.impl.sdk.p049ad.C1839e.C1842b.ACTIVITY_LANDSCAPE
            if (r6 != r0) goto L_0x005d
            boolean r6 = r5.f1705d
            r0 = 8
            r4 = 0
            if (r6 == 0) goto L_0x004e
            boolean r6 = r5.f1706e
            if (r6 == 0) goto L_0x004e
            int r6 = r5.f1704c
            if (r6 == 0) goto L_0x0047
            if (r6 == r2) goto L_0x0047
            goto L_0x0054
        L_0x0047:
            int r6 = r5.f1704c
            if (r6 != r2) goto L_0x004c
            goto L_0x001c
        L_0x004c:
            r0 = r4
            goto L_0x001c
        L_0x004e:
            int r6 = r5.f1704c
            if (r6 == r3) goto L_0x0058
            if (r6 == r1) goto L_0x0058
        L_0x0054:
            r5.m2545a((int) r4)
            goto L_0x005d
        L_0x0058:
            int r6 = r5.f1704c
            if (r6 != r3) goto L_0x001c
            goto L_0x004c
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.activity.C1449b.m2546a(com.applovin.impl.sdk.ad.e$b):void");
    }

    /* renamed from: a */
    public void mo12979a(C1839e eVar) {
        int i;
        if (!eVar.mo14165E() || (i = this.f1703b) == -1) {
            m2546a(eVar.mo14232p());
        } else {
            m2545a(i);
        }
    }
}
