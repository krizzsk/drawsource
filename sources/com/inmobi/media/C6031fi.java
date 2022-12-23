package com.inmobi.media;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: com.inmobi.media.fi */
/* compiled from: NativeScrollableContainer */
public abstract class C6031fi extends FrameLayout {

    /* renamed from: a */
    private final byte f15291a;

    /* renamed from: com.inmobi.media.fi$a */
    /* compiled from: NativeScrollableContainer */
    interface C6032a {
        /* renamed from: a */
        int mo35172a(int i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo35190a(C5849by byVar, C6033fj fjVar, int i, int i2, C6032a aVar);

    public C6031fi(Context context, byte b) {
        super(context);
        this.f15291a = b;
    }

    public final byte getType() {
        return this.f15291a;
    }
}
