package com.ogury.p377ed.internal;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.az */
public final class C9848az {
    /* renamed from: a */
    public final List<View> mo64367a(ViewGroup viewGroup, WebView webView) {
        C10263mq.m29882b(viewGroup, "root");
        C10263mq.m29882b(webView, "webView");
        List arrayList = new ArrayList();
        m28431a(viewGroup, (List<View>) arrayList);
        return arrayList.subList(arrayList.indexOf(webView) + 1, arrayList.size());
    }

    /* renamed from: a */
    private final void m28431a(ViewGroup viewGroup, List<View> list) {
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (!(childAt instanceof C10044g)) {
                    C10263mq.m29879a((Object) childAt, "child");
                    list.add(childAt);
                }
                if (childAt instanceof ViewGroup) {
                    m28431a((ViewGroup) childAt, list);
                }
                if (i2 < childCount) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }
}
