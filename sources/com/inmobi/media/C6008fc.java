package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.inmobi.media.fc */
/* compiled from: NativeContainerLayout */
public class C6008fc extends ViewGroup {

    /* renamed from: a */
    private static final String f15228a = C6008fc.class.getSimpleName();

    public C6008fc(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C6009a aVar = (C6009a) childAt.getLayoutParams();
                i4 = Math.max(i4, aVar.f15229a + childAt.getMeasuredWidth());
                i3 = Math.max(i3, aVar.f15230b + childAt.getMeasuredHeight());
            }
        }
        setMeasuredDimension(resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C6009a(-2, -2);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C6009a aVar = (C6009a) childAt.getLayoutParams();
                childAt.layout(aVar.f15229a, aVar.f15230b, aVar.f15229a + childAt.getMeasuredWidth(), aVar.f15230b + childAt.getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C6009a;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C6009a(layoutParams);
    }

    /* renamed from: com.inmobi.media.fc$a */
    /* compiled from: NativeContainerLayout */
    public static class C6009a extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public int f15229a;

        /* renamed from: b */
        public int f15230b;

        public C6009a(int i, int i2) {
            super(i, i2);
        }

        public C6009a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
