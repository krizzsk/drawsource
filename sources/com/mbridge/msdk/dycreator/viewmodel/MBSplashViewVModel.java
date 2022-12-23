package com.mbridge.msdk.dycreator.viewmodel;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.dycreator.binding.C8354b;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.p297g.C8380c;
import com.mbridge.msdk.dycreator.p297g.C8381d;
import com.mbridge.msdk.dycreator.p297g.C8383f;
import com.mbridge.msdk.dycreator.p297g.C8385h;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8660r;

public class MBSplashViewVModel implements BaseViewModel {

    /* renamed from: a */
    private C8381d f20455a;

    /* renamed from: b */
    private C8380c f20456b;

    /* renamed from: c */
    private C8383f f20457c;

    /* renamed from: d */
    private C8385h f20458d;

    /* renamed from: e */
    private DynamicViewBackListener f20459e;

    /* renamed from: f */
    private DyOption f20460f;

    public MBSplashViewVModel(DyOption dyOption) {
        this.f20460f = dyOption;
        String campaignUnitId = (dyOption == null || dyOption.getCampaignEx() == null) ? "" : dyOption.getCampaignEx().getCampaignUnitId();
        if (!TextUtils.isEmpty(campaignUnitId)) {
            EventBus.getDefault().register(campaignUnitId, (Object) this);
        } else {
            EventBus.getDefault().register(this);
        }
    }

    public void setModelDataAndBind() {
        MBSplashData mBSplashData = new MBSplashData(this.f20460f);
        Context g = C8388a.m23845e().mo56913g();
        if (g != null) {
            DyOption dyOption = this.f20460f;
            if (dyOption != null) {
                CampaignEx campaignEx = dyOption.getCampaignEx();
                if (campaignEx != null) {
                    mBSplashData.setAdClickText(campaignEx.getAdCall());
                }
                mBSplashData.setCountDownText(g.getResources().getString(C8658p.m24799a(g, this.f20460f.isCanSkip() ? "mbridge_splash_count_time_can_skip" : "mbridge_splash_count_time_can_skip_not", "string")));
            }
            mBSplashData.setNoticeImage(C8658p.m24799a(g, "mbridge_splash_notice", "drawable"));
            String d = C8660r.m24817d(g);
            mBSplashData.setLogoText((TextUtils.isEmpty(d) || !d.contains("zh")) ? "AD" : "广告");
        }
        C8381d dVar = this.f20455a;
        if (dVar != null) {
            dVar.mo56883a(mBSplashData);
        }
        C8380c cVar = this.f20456b;
        if (cVar != null) {
            cVar.mo56882a(mBSplashData);
        }
        C8383f fVar = this.f20457c;
        if (fVar != null) {
            fVar.mo56884a(mBSplashData);
        }
    }

    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.f20459e = dynamicViewBackListener;
        }
    }

    public void setClickSubject(C8380c cVar) {
        if (cVar != null) {
            this.f20456b = cVar;
        }
    }

    public void setConcreteSubject(C8381d dVar) {
        if (dVar != null) {
            this.f20455a = dVar;
        }
    }

    public void setEffectSubject(C8383f fVar) {
        if (fVar != null) {
            this.f20457c = fVar;
        }
    }

    public void setReportSubject(C8385h hVar) {
        if (hVar != null) {
            this.f20458d = hVar;
        }
    }

    /* renamed from: com.mbridge.msdk.dycreator.viewmodel.MBSplashViewVModel$1 */
    static /* synthetic */ class C83871 {

        /* renamed from: a */
        static final /* synthetic */ int[] f20461a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.mbridge.msdk.dycreator.listener.action.EAction[] r0 = com.mbridge.msdk.dycreator.listener.action.EAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20461a = r0
                com.mbridge.msdk.dycreator.listener.action.EAction r1 = com.mbridge.msdk.dycreator.listener.action.EAction.DOWNLOAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20461a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.mbridge.msdk.dycreator.listener.action.EAction r1 = com.mbridge.msdk.dycreator.listener.action.EAction.CLOSE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.viewmodel.MBSplashViewVModel.C83871.<clinit>():void");
        }
    }

    public void onEventMainThread(SplashResData splashResData) {
        if (this.f20459e != null && splashResData != null) {
            int i = C83871.f20461a[splashResData.geteAction().ordinal()];
            if (i == 1 || i == 2) {
                String str = "";
                try {
                    if (!(splashResData.getBaseViewData() == null || splashResData.getBaseViewData().getBindData() == null)) {
                        str = splashResData.getBaseViewData().getBindData().getCampaignUnitId();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        EventBus.getDefault().unregister(str);
                        C8354b.m23777a().mo56801b();
                    } else {
                        EventBus.getDefault().unregister((Object) this);
                        C8354b.m23777a().mo56801b();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    EventBus.getDefault().unregister((Object) this);
                    EventBus.getDefault().release();
                    C8354b.m23777a().mo56801b();
                }
            }
            this.f20459e.viewClicked(splashResData);
        }
    }
}
