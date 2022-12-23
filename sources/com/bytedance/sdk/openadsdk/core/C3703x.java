package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

/* renamed from: com.bytedance.sdk.openadsdk.core.x */
/* compiled from: VisibilityChecker */
public class C3703x {
    /* renamed from: a */
    private static boolean m12104a(View view, int i) {
        float a = m12103a(view);
        return a > 0.0f && a >= ((float) i) / 100.0f;
    }

    /* renamed from: a */
    public static float m12103a(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0) {
                    if (view.getParent() != null) {
                        Rect rect = new Rect();
                        if (!view.getGlobalVisibleRect(rect)) {
                            return -1.0f;
                        }
                        long height = ((long) rect.height()) * ((long) rect.width());
                        long height2 = ((long) view.getHeight()) * ((long) view.getWidth());
                        if (height2 <= 0) {
                            return -1.0f;
                        }
                        return ((float) height) / ((float) height2);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    /* renamed from: b */
    private static boolean m12107b(View view) {
        return view != null && view.isShown();
    }

    /* renamed from: b */
    private static boolean m12108b(View view, int i) {
        return view.getWidth() >= m12109c(view, i) && view.getHeight() >= m12110d(view, i);
    }

    /* renamed from: c */
    private static int m12109c(View view, int i) {
        if (i == 3) {
            return (int) (((double) C3904y.m12877c(view.getContext().getApplicationContext())) * 0.7d);
        }
        return 20;
    }

    /* renamed from: d */
    private static int m12110d(View view, int i) {
        if (i == 3) {
            return C3904y.m12881d(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    /* renamed from: b */
    private static int m12106b(View view, int i, int i2) throws Throwable {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!m12107b(view)) {
            return 1;
        }
        if (!m12108b(view, i2)) {
            return 6;
        }
        return !m12104a(view, i) ? 3 : 0;
    }

    /* renamed from: a */
    public static boolean m12105a(View view, int i, int i2) {
        if (i2 == 1) {
            while (true) {
                if (view == null) {
                    break;
                }
                try {
                    if (view.getVisibility() != 0) {
                        return false;
                    }
                    if (view instanceof NativeExpressView) {
                        break;
                    } else if (view instanceof BannerExpressView) {
                        break;
                    } else {
                        view = (View) view.getParent();
                    }
                } catch (Throwable unused) {
                    return false;
                }
            }
        }
        if (m12106b(view, i, i2) == 0) {
            return true;
        }
        return false;
    }
}
