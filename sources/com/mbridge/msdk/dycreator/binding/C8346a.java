package com.mbridge.msdk.dycreator.binding;

import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.dycreator.baseview.MBCountDownView;
import com.mbridge.msdk.dycreator.baseview.MBLinearLayout;
import com.mbridge.msdk.dycreator.baseview.MBRelativeLayout;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.binding.base.BaseStrategy;
import com.mbridge.msdk.dycreator.binding.p291a.C8347a;
import com.mbridge.msdk.dycreator.binding.p291a.C8348b;
import com.mbridge.msdk.dycreator.binding.p291a.C8349c;
import com.mbridge.msdk.dycreator.binding.p291a.C8350d;
import com.mbridge.msdk.dycreator.binding.p291a.C8351e;
import com.mbridge.msdk.dycreator.binding.p291a.C8352f;
import com.mbridge.msdk.dycreator.binding.p291a.C8353g;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.p294e.C8372c;
import com.mbridge.msdk.dycreator.p295f.p296a.C8377a;
import com.vungle.warren.p395ui.JavascriptBridge;

/* renamed from: com.mbridge.msdk.dycreator.binding.a */
/* compiled from: BindViewClickListener */
public final class C8346a implements View.OnClickListener {

    /* renamed from: a */
    private C8377a f20341a;

    public C8346a(C8377a aVar) {
        this.f20341a = aVar;
    }

    public final void onClick(View view) {
        C8377a aVar;
        if (view != null && (view instanceof InterBase)) {
            if (!(view instanceof MBCountDownView) || (aVar = this.f20341a) == null || aVar.getEffectData() == null || this.f20341a.getEffectData().isCanSkip()) {
                C8377a aVar2 = this.f20341a;
                if (aVar2 != null && (view instanceof MBRelativeLayout) && C8372c.m23825a(view, aVar2)) {
                    C8377a aVar3 = this.f20341a;
                    if (aVar3 instanceof MBSplashData) {
                        MBRelativeLayout mBRelativeLayout = (MBRelativeLayout) view;
                        ((MBSplashData) aVar3).setxInScreen(mBRelativeLayout.getxInScreen());
                        ((MBSplashData) this.f20341a).setyInScreen(mBRelativeLayout.getyInScreen());
                        ((MBSplashData) this.f20341a).setClickType(1);
                    }
                }
                C8377a aVar4 = this.f20341a;
                if (aVar4 != null && (view instanceof MBLinearLayout) && C8372c.m23825a(view, aVar4)) {
                    C8377a aVar5 = this.f20341a;
                    if (aVar5 instanceof MBSplashData) {
                        MBLinearLayout mBLinearLayout = (MBLinearLayout) view;
                        ((MBSplashData) aVar5).setxInScreen(mBLinearLayout.getxInScreen());
                        ((MBSplashData) this.f20341a).setyInScreen(mBLinearLayout.getyInScreen());
                        ((MBSplashData) this.f20341a).setClickType(0);
                    }
                }
                String strategyDes = ((InterBase) view).getStrategyDes();
                if (!TextUtils.isEmpty(strategyDes)) {
                    C8362c.m23795a();
                    BaseStrategy baseStrategy = null;
                    if (!TextUtils.isEmpty(strategyDes)) {
                        if (strategyDes.equals("close")) {
                            baseStrategy = new C8349c();
                        } else if (strategyDes.equals(JavascriptBridge.MraidHandler.DOWNLOAD_ACTION)) {
                            baseStrategy = new C8348b();
                        } else if (!strategyDes.equals("deeplink") && strategyDes.equals("activity")) {
                            baseStrategy = new C8347a();
                        }
                        if (strategyDes.equals("feedback")) {
                            baseStrategy = new C8350d();
                        }
                        if (strategyDes.equals("notice")) {
                            baseStrategy = new C8351e();
                        }
                        if (strategyDes.equals("permissionInfo")) {
                            baseStrategy = new C8352f();
                        }
                        if (strategyDes.equals("privateAddress")) {
                            baseStrategy = new C8353g();
                        }
                    }
                    if (baseStrategy != null) {
                        baseStrategy.bindClickData(view, this.f20341a);
                    }
                }
            }
        }
    }
}
