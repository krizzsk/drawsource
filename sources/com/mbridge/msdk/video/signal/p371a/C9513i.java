package com.mbridge.msdk.video.signal.p371a;

import android.app.Activity;
import com.mbridge.msdk.video.p347bt.module.MBridgeBTContainer;

/* renamed from: com.mbridge.msdk.video.signal.a.i */
/* compiled from: JSBTModule */
public final class C9513i extends C9504b {

    /* renamed from: a */
    private Activity f23560a;

    /* renamed from: b */
    private MBridgeBTContainer f23561b;

    public C9513i(Activity activity, MBridgeBTContainer mBridgeBTContainer) {
        this.f23560a = activity;
        this.f23561b = mBridgeBTContainer;
    }

    public final void reactDeveloper(Object obj, String str) {
        super.reactDeveloper(obj, str);
        MBridgeBTContainer mBridgeBTContainer = this.f23561b;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.reactDeveloper(obj, str);
        }
    }

    public final void handlerH5Exception(int i, String str) {
        super.handlerH5Exception(i, str);
        MBridgeBTContainer mBridgeBTContainer = this.f23561b;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.handlerH5Exception(i, str);
        }
    }

    public final void click(int i, String str) {
        super.click(i, str);
        MBridgeBTContainer mBridgeBTContainer = this.f23561b;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.click(i, str);
        }
    }
}
