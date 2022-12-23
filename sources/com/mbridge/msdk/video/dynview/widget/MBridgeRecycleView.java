package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.foundation.tools.C8677z;
import java.lang.ref.WeakReference;

public class MBridgeRecycleView extends RecyclerView {

    /* renamed from: c */
    private static int f23175c = -1;

    /* renamed from: a */
    C9412a f23176a;

    /* renamed from: b */
    private float f23177b;

    /* renamed from: d */
    private float f23178d;

    /* renamed from: e */
    private float f23179e;

    /* renamed from: f */
    private int f23180f;

    /* renamed from: g */
    private float f23181g;

    /* renamed from: h */
    private int f23182h;

    /* renamed from: i */
    private boolean f23183i;

    /* renamed from: j */
    private LinearLayoutManager f23184j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f23185k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f23186l;

    public MBridgeRecycleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23177b = 0.0f;
        this.f23178d = 0.0f;
        this.f23179e = -1.0f;
        this.f23180f = -1;
        this.f23181g = 1.3f;
        this.f23183i = false;
        this.f23176a = new C9412a(this);
        this.f23182h = C8677z.m24924b(context, 40.0f);
    }

    public MBridgeRecycleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23177b = 0.0f;
        this.f23178d = 0.0f;
        this.f23179e = -1.0f;
        this.f23180f = -1;
        this.f23181g = 1.3f;
        this.f23183i = false;
    }

    /* renamed from: a */
    public final void mo62959a(LinearLayoutManager linearLayoutManager) {
        this.f23184j = linearLayoutManager;
    }

    /* renamed from: com.mbridge.msdk.video.dynview.widget.MBridgeRecycleView$a */
    static class C9412a implements Runnable {

        /* renamed from: a */
        private final WeakReference<MBridgeRecycleView> f23187a;

        public C9412a(MBridgeRecycleView mBridgeRecycleView) {
            this.f23187a = new WeakReference<>(mBridgeRecycleView);
        }

        public final void run() {
            MBridgeRecycleView mBridgeRecycleView = (MBridgeRecycleView) this.f23187a.get();
            if (mBridgeRecycleView != null && mBridgeRecycleView.f23185k && mBridgeRecycleView.f23186l) {
                mBridgeRecycleView.scrollBy(-1, 0);
                mBridgeRecycleView.postDelayed(mBridgeRecycleView.f23176a, 16);
            }
        }
    }

    /* renamed from: a */
    public final void mo62960a(boolean z) {
        this.f23183i = z;
    }

    /* renamed from: a */
    public final void mo62958a() {
        if (this.f23185k) {
            this.f23185k = false;
            removeCallbacks(this.f23176a);
        }
        if (this.f23183i) {
            this.f23186l = true;
            this.f23185k = true;
            postDelayed(this.f23176a, 16);
        }
    }
}
