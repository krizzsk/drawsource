package com.applovin.impl.adview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.applovin.impl.adview.i */
public abstract class C1535i extends View {

    /* renamed from: a */
    protected float f1928a = 1.0f;

    /* renamed from: b */
    protected final Context f1929b;

    /* renamed from: com.applovin.impl.adview.i$a */
    public enum C1536a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2),
        TRANSPARENT_SKIP(3);
        

        /* renamed from: e */
        private final int f1935e;

        private C1536a(int i) {
            this.f1935e = i;
        }

        /* renamed from: a */
        public int mo13186a() {
            return this.f1935e;
        }
    }

    protected C1535i(Context context) {
        super(context);
        this.f1929b = context;
    }

    /* renamed from: a */
    public static C1535i m2857a(C1536a aVar, Context context) {
        return aVar.equals(C1536a.INVISIBLE) ? new C1560p(context) : aVar.equals(C1536a.WHITE_ON_TRANSPARENT) ? new C1561q(context) : aVar.equals(C1536a.TRANSPARENT_SKIP) ? new C1562r(context) : new C1568w(context);
    }

    /* renamed from: a */
    public void mo13182a(int i) {
        setViewScale(((float) i) / 30.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    public float getSize() {
        return this.f1928a * 30.0f;
    }

    public abstract C1536a getStyle();

    public void setViewScale(float f) {
        this.f1928a = f;
    }
}
