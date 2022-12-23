package com.saygames.saypromo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;

@Metadata(mo72581bv = {}, mo72582d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\b"}, mo72583d2 = {"Lcom/saygames/saypromo/widget/SayPromoFrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "lib_googleRelease"}, mo72584k = 1, mo72585mv = {1, 7, 1})
public final class SayPromoFrameLayout extends FrameLayout {

    /* renamed from: a */
    private int f26383a;

    /* renamed from: b */
    private int f26384b;

    public SayPromoFrameLayout(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo65551a(int i, int i2) {
        this.f26383a = i;
        this.f26384b = i2;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = this.f26383a;
        int i5 = this.f26384b;
        if (i4 > 0 && i5 > 0) {
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i);
            int i6 = i5 * size;
            int i7 = i4 * size2;
            if (i6 < i7) {
                int i8 = i6 / i4;
                if (i8 > size2 / 2) {
                    int i9 = (size2 - i8) / 2;
                    setPadding(i9, 0, i9, 0);
                    super.onMeasure(i, i2);
                }
            } else if (i6 > i7 && (i3 = i7 / i5) > size / 2) {
                int i10 = (size - i3) / 2;
                setPadding(0, i10, 0, i10);
                super.onMeasure(i, i2);
            }
        }
        setPadding(0, 0, 0, 0);
        super.onMeasure(i, i2);
    }

    public SayPromoFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
