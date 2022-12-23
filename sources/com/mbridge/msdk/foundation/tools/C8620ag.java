package com.mbridge.msdk.foundation.tools;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/* renamed from: com.mbridge.msdk.foundation.tools.ag */
/* compiled from: ViewCoveredUtils */
public final class C8620ag {

    /* renamed from: a */
    private static boolean f21128a = false;

    /* renamed from: a */
    public static boolean m24732a(View view) {
        if (view.getVisibility() != 0) {
            C8672v.m24878d("ViewUtils", "Banner Judge : Banner's not visible.");
            return true;
        } else if (view.getAlpha() < 0.5f) {
            C8672v.m24878d("ViewUtils", "Banner Judge : Banner's alpha must set up 50%.");
            return true;
        } else if (view.getParent() == null || !(view.getParent() instanceof ViewGroup) || ((ViewGroup) view.getParent()).getVisibility() == 0) {
            Rect rect = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
            boolean z = (rect.bottom - rect.top) * (rect.right - rect.left) >= (view.getMeasuredHeight() * view.getMeasuredWidth()) / 2;
            boolean z2 = globalVisibleRect && z;
            C8672v.m24878d("ViewUtils", "View Judge : partVisible is " + globalVisibleRect + " halfPercentVisible is " + z);
            StringBuilder sb = new StringBuilder();
            sb.append("View Judge : totalViewVisible is ");
            sb.append(z2);
            C8672v.m24878d("ViewUtils", sb.toString());
            if (!z2) {
                return true;
            }
            ViewGroup viewGroup = view;
            while (viewGroup.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                for (int a = m24731a(viewGroup, viewGroup2) + 1; a < viewGroup2.getChildCount(); a++) {
                    View childAt = viewGroup2.getChildAt(a);
                    if (childAt.getVisibility() == 0 && m24733a(view, childAt)) {
                        if (childAt instanceof ViewGroup) {
                            ViewGroup viewGroup3 = (ViewGroup) childAt;
                            if (viewGroup3.getChildCount() > 0) {
                                C8672v.m24878d("ViewUtils", "View Judge : Covered by ViewGroup.");
                                boolean b = m24735b(view, viewGroup3);
                                f21128a = false;
                                if (b) {
                                    return true;
                                }
                            }
                        }
                        if (m24734b(childAt)) {
                            C8672v.m24878d("ViewUtils", "View Judge : View Covered and Cover View is not transparent.");
                            return true;
                        }
                    }
                }
                viewGroup = viewGroup2;
            }
            C8672v.m24878d("ViewUtils", "View Judge : Well done, View is not covered.");
            return false;
        } else {
            C8672v.m24878d("ViewUtils", "View Judge : View's container is not visible.");
            return true;
        }
    }

    /* renamed from: b */
    private static boolean m24734b(View view) {
        if (view.getAlpha() <= 0.5f) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 19) {
            return true;
        }
        if (view.getBackground() == null || view.getBackground().getAlpha() <= 127) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m24733a(View view, View view2) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        view2.getGlobalVisibleRect(rect2);
        return Rect.intersects(rect, rect2) && ((Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left)) * (Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top))) * 2 >= view.getMeasuredHeight() * view.getMeasuredWidth();
    }

    /* renamed from: a */
    private static int m24731a(View view, ViewGroup viewGroup) {
        int i = 0;
        while (i < viewGroup.getChildCount() && viewGroup.getChildAt(i) != view) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    private static boolean m24735b(View view, ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            C8672v.m24878d("ViewUtils", "View Judge : Start Loop");
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0 && m24733a(view, childAt)) {
                if ((childAt instanceof WebView) && childAt.getVisibility() == 0) {
                    C8672v.m24878d("ViewUtils", "View Judge : View Covered by WebView.");
                    f21128a = true;
                }
                if (m24734b(childAt)) {
                    C8672v.m24878d("ViewUtils", "View Judge : View Covered and Cover ViewGroup is not transparent.");
                    f21128a = true;
                }
                if (f21128a) {
                    break;
                } else if (childAt instanceof ViewGroup) {
                    m24735b(view, (ViewGroup) childAt);
                }
            }
        }
        return f21128a;
    }
}
