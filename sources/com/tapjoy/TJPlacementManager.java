package com.tapjoy;

import android.content.Context;
import android.text.TextUtils;
import com.tapjoy.internal.C11278at;
import com.tapjoy.internal.C11550hf;
import com.tapjoy.internal.C11572ho;

public class TJPlacementManager {

    /* renamed from: a */
    private static final C11278at<String, TJCorePlacement> f26692a = C11278at.m30873a();

    /* renamed from: b */
    private static int f26693b = 0;

    /* renamed from: c */
    private static int f26694c = 0;

    /* renamed from: d */
    private static int f26695d = 3;

    /* renamed from: e */
    private static int f26696e = 3;

    public static TJPlacement createPlacement(Context context, String str, boolean z, TJPlacementListener tJPlacementListener) {
        TJCorePlacement a = m30757a(str, (String) null, (String) null, z, false);
        a.f26612j = z;
        a.f26605c.setPlacementType("sdk");
        a.setContext(context);
        return new TJPlacement(a, tJPlacementListener);
    }

    /* renamed from: a */
    public static TJPlacement m30758a(String str, String str2, String str3, TJPlacementListener tJPlacementListener) {
        TJPlacement tJPlacement;
        synchronized (f26692a) {
            tJPlacement = new TJPlacement(m30757a(str, str2, str3, false, false), tJPlacementListener);
        }
        return tJPlacement;
    }

    /* renamed from: b */
    public static TJPlacement m30759b(String str, String str2, String str3, TJPlacementListener tJPlacementListener) {
        TJPlacement tJPlacement;
        synchronized (f26692a) {
            tJPlacement = new TJPlacement(m30757a(str, str2, str3, false, true), tJPlacementListener);
        }
        return tJPlacement;
    }

    /* renamed from: a */
    static TJCorePlacement m30756a(String str) {
        TJCorePlacement tJCorePlacement;
        synchronized (f26692a) {
            tJCorePlacement = f26692a.get(str);
        }
        return tJCorePlacement;
    }

    public static void setCachedPlacementLimit(int i) {
        f26695d = i;
    }

    public static void setPreRenderedPlacementLimit(int i) {
        f26696e = i;
    }

    public static int getCachedPlacementLimit() {
        return f26695d;
    }

    public static int getPreRenderedPlacementLimit() {
        return f26696e;
    }

    public static int getCachedPlacementCount() {
        return f26693b;
    }

    public static int getPreRenderedPlacementCount() {
        return f26694c;
    }

    public static boolean canCachePlacement() {
        return getCachedPlacementCount() < getCachedPlacementLimit();
    }

    public static boolean canPreRenderPlacement() {
        return getPreRenderedPlacementCount() < getPreRenderedPlacementLimit();
    }

    public static void incrementPlacementCacheCount() {
        int i = f26693b + 1;
        f26693b = i;
        int i2 = f26695d;
        if (i > i2) {
            f26693b = i2;
        }
        printPlacementCacheInformation();
    }

    public static void decrementPlacementCacheCount() {
        int i = f26693b - 1;
        f26693b = i;
        if (i < 0) {
            f26693b = 0;
        }
        printPlacementCacheInformation();
    }

    public static void incrementPlacementPreRenderCount() {
        int i = f26694c + 1;
        f26694c = i;
        int i2 = f26696e;
        if (i > i2) {
            f26694c = i2;
        }
    }

    public static void decrementPlacementPreRenderCount() {
        int i = f26694c - 1;
        f26694c = i;
        if (i < 0) {
            f26694c = 0;
        }
    }

    public static void printPlacementCacheInformation() {
        TapjoyLog.m30842i("TJPlacementManager", "Space available in placement cache: " + f26693b + " out of " + f26695d);
    }

    public static void printPlacementPreRenderInformation() {
        TapjoyLog.m30842i("TJPlacementManager", "Space available for placement pre-render: " + f26694c + " out of " + f26696e);
    }

    public static void dismissContentShowing(boolean z) {
        if (z) {
            TJAdUnitActivity.m30693a();
        }
        C11572ho.m31720a();
        C11550hf.m31611a();
    }

    /* renamed from: a */
    static TJCorePlacement m30757a(String str, String str2, String str3, boolean z, boolean z2) {
        TJCorePlacement a;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "!SYSTEM!" : "");
        sb.append(!TextUtils.isEmpty(str) ? str : "");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        sb.append(str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        sb.append(str3);
        sb.append(Boolean.toString(z2));
        String sb2 = sb.toString();
        TapjoyLog.m30839d("TJPlacementManager", "TJCorePlacement key=".concat(String.valueOf(sb2)));
        synchronized (f26692a) {
            a = m30756a(sb2);
            if (a == null) {
                a = new TJCorePlacement(str, sb2, z2);
                f26692a.put(sb2, a);
                TapjoyLog.m30839d("TJPlacementManager", "Created TJCorePlacement with GUID: " + a.f26606d);
            }
        }
        return a;
    }
}
