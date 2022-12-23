package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.p081e.p082a.C2458a;
import com.mbridge.msdk.p081e.p082a.C2459b;

public class MBCountDownView extends MBTextView {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2459b f18078a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public MBCountDownView f18079b = this;

    public MBCountDownView(Context context) {
        super(context);
    }

    public MBCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBCountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2459b bVar = this.f18078a;
        if (bVar != null) {
            bVar.mo16379a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2459b bVar = this.f18078a;
        if (bVar != null) {
            bVar.mo16381b();
        }
    }

    public void initView(final String str, final String str2, int i) {
        this.f18078a = new C2459b().mo16380b((long) (i * 1000)).mo16377a(1000).mo16378a((C2458a) new C2458a() {
            public void onTick(long j) {
                if (str2.startsWith("zh")) {
                    MBCountDownView a = MBCountDownView.this.f18079b;
                    a.setText((j / 1000) + "s" + str);
                    return;
                }
                MBCountDownView a2 = MBCountDownView.this.f18079b;
                a2.setText(MBCountDownView.this.f18079b + " " + (j / 1000) + "s");
            }

            public void onFinish() {
                MBCountDownView.this.f18078a.mo16381b();
                SplashResData splashResData = new SplashResData();
                splashResData.seteAction(EAction.CLOSE);
                EventBus.getDefault().post(splashResData);
            }
        });
    }
}
