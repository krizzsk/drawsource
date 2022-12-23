package com.ogury.p377ed.internal;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.bb */
public final class C9851bb {

    /* renamed from: a */
    private final C9852bc f24837a;

    public C9851bb(C9852bc bcVar) {
        C10263mq.m29882b(bcVar, "rectHelper");
        this.f24837a = bcVar;
    }

    /* renamed from: a */
    public static List<Rect> m28437a(List<? extends View> list, Rect rect) {
        C10263mq.m29882b(list, "viewsAfterOverlay");
        C10263mq.m29882b(rect, "webViewOnScreenRect");
        List<Rect> arrayList = new ArrayList<>();
        for (View view : list) {
            if (view.getVisibility() == 0) {
                Rect a = C9852bc.m28439a(view);
                Rect rect2 = new Rect(rect);
                if (rect2.intersect(a)) {
                    arrayList.add(rect2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static int m28435a(Rect rect, List<Rect> list) {
        C10263mq.m29882b(rect, "webViewRect");
        C10263mq.m29882b(list, "overlappingRects");
        if (list.isEmpty()) {
            return 0;
        }
        if (C9847ay.m28427a(rect, list)) {
            return C9847ay.m28423a(rect);
        }
        if (list.size() <= 2) {
            return m28436a(list);
        }
        return m28438b(rect, list);
    }

    /* renamed from: b */
    private static int m28438b(Rect rect, List<Rect> list) {
        int i = rect.left;
        int i2 = rect.right;
        int i3 = 0;
        if (i < i2) {
            while (true) {
                int i4 = i + 1;
                int i5 = rect.top;
                int i6 = rect.bottom;
                if (i5 < i6) {
                    while (true) {
                        int i7 = i5 + 1;
                        if (C9847ay.m28428a(list, i, i5)) {
                            i3++;
                        }
                        if (i7 >= i6) {
                            break;
                        }
                        i5 = i7;
                    }
                }
                if (i4 >= i2) {
                    break;
                }
                i = i4;
            }
        }
        return i3;
    }

    /* renamed from: a */
    private static int m28436a(List<Rect> list) {
        int i = 0;
        int i2 = 0;
        for (Rect a : list) {
            i2 += C9847ay.m28423a(a);
        }
        int size = list.size() - 2;
        if (size >= 0) {
            while (true) {
                int i3 = i + 1;
                int size2 = list.size();
                if (i3 < size2) {
                    int i4 = i3;
                    while (true) {
                        int i5 = i4 + 1;
                        i2 -= C9847ay.m28429b(list.get(i), list.get(i4));
                        if (i5 >= size2) {
                            break;
                        }
                        i4 = i5;
                    }
                }
                if (i == size) {
                    break;
                }
                i = i3;
            }
        }
        return i2;
    }
}
