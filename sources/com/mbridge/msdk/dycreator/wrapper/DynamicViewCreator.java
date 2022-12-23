package com.mbridge.msdk.dycreator.wrapper;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.dycreator.binding.C8354b;
import com.mbridge.msdk.dycreator.p220a.C6811b;
import com.mbridge.msdk.dycreator.p221b.C6813a;
import com.mbridge.msdk.dycreator.p221b.C6814b;
import com.mbridge.msdk.dycreator.p294e.C8374e;
import com.mbridge.msdk.dycreator.viewmodel.BaseViewModel;
import com.mbridge.msdk.dycreator.viewmodel.MBCommonViewVModel;
import com.mbridge.msdk.dycreator.viewmodel.MBRewardViewVModel;
import com.mbridge.msdk.dycreator.viewmodel.MBSplashViewVModel;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.tools.C8672v;

public class DynamicViewCreator {

    /* renamed from: a */
    private static volatile DynamicViewCreator f5158a = null;

    /* renamed from: b */
    private static int f5159b = -201;

    private DynamicViewCreator() {
        C6811b.m20739a().mo37128a(C8388a.m23845e().mo56913g());
    }

    public static DynamicViewCreator getInstance() {
        if (f5158a == null) {
            synchronized (DynamicViewCreator.class) {
                if (f5158a == null) {
                    f5158a = new DynamicViewCreator();
                }
            }
        }
        return f5158a;
    }

    public void createDynamicView(DyOption dyOption, DynamicViewBackListener dynamicViewBackListener) {
        View view;
        BaseViewModel baseViewModel;
        boolean z;
        if (dyOption == null) {
            dynamicViewBackListener.viewCreateFail(new C6813a(C6814b.NOT_FOUND_DYNAMIC_OPTION));
        } else if (dynamicViewBackListener != null) {
            Context g = C8388a.m23845e().mo56913g();
            if (g == null) {
                dynamicViewBackListener.viewCreateFail(new C6813a(C6814b.NOT_FOUND_CONTEXT));
                return;
            }
            boolean z2 = false;
            String[] strArr = new String[0];
            if (dyOption != null) {
                if (dyOption.getCampaignEx() == null) {
                    dynamicViewBackListener.viewCreateFail(new C6813a(C6814b.NOT_FOUND_CAMPAIGN));
                    z = false;
                } else {
                    z = true;
                }
                if (dyOption.getFile() != null || !TextUtils.isEmpty(dyOption.getFileDir())) {
                    z2 = z;
                } else {
                    dynamicViewBackListener.viewCreateFail(new C6813a(C6814b.BIND_DATA_FILE_OR_DIR));
                }
            } else {
                z2 = true;
            }
            if (z2) {
                try {
                    m6117a(dyOption, "create dynamic view", "start");
                    if (dyOption.getFile() != null) {
                        view = C8374e.m23828a(g).mo56878a(dyOption.getFile());
                    } else {
                        view = C8374e.m23828a(g).mo56879a(dyOption.getFileDir());
                    }
                    if (view == null) {
                        dynamicViewBackListener.viewCreateFail(new C6813a(C6814b.FILE_CREATE_VIEW_FILE));
                        m6117a(dyOption, "create dynamic view", "fail");
                        return;
                    }
                    m6117a(dyOption, "create dynamic view", "success");
                    int i = C24571.f5160a[dyOption.getDyAdType().ordinal()];
                    if (i == 1) {
                        baseViewModel = new MBSplashViewVModel(dyOption);
                    } else if (i != 2) {
                        baseViewModel = new MBCommonViewVModel();
                    } else {
                        baseViewModel = new MBRewardViewVModel(dyOption);
                    }
                    baseViewModel.setDynamicViewBackListener(dynamicViewBackListener);
                    C8354b.m23777a().mo56800a(baseViewModel);
                    baseViewModel.setModelDataAndBind();
                    m6117a(dyOption, "create dynamic view", "bind_data_done");
                    dynamicViewBackListener.viewCreatedSuccess(view);
                } catch (Exception e) {
                    C8672v.m24878d("DynamicViewCreator", e.getMessage());
                    dynamicViewBackListener.viewCreateFail(new C6813a(f5159b, e.getMessage()));
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator$1 */
    static /* synthetic */ class C24571 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5160a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.mbridge.msdk.dycreator.wrapper.DyAdType[] r0 = com.mbridge.msdk.dycreator.wrapper.DyAdType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5160a = r0
                com.mbridge.msdk.dycreator.wrapper.DyAdType r1 = com.mbridge.msdk.dycreator.wrapper.DyAdType.SPLASH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5160a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.mbridge.msdk.dycreator.wrapper.DyAdType r1 = com.mbridge.msdk.dycreator.wrapper.DyAdType.REWARD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator.C24571.<clinit>():void");
        }
    }

    public View createDynamicView(DyOption dyOption) {
        Context g;
        View view;
        if (dyOption == null || (g = C8388a.m23845e().mo56913g()) == null) {
            return null;
        }
        try {
            if (dyOption.getFile() != null) {
                view = C8374e.m23828a(g).mo56878a(dyOption.getFile());
            } else {
                view = C8374e.m23828a(g).mo56879a(dyOption.getFileDir());
            }
            return view;
        } catch (Exception e) {
            C8672v.m24878d("DynamicViewCreator", e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private void m6117a(DyOption dyOption, String str, String str2) {
        if (dyOption != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    Context g = C8388a.m23845e().mo56913g();
                    C8598e.m24671a(g, dyOption.getDyAdType() + "", dyOption.getTemplateType(), str, str2, dyOption.getCampaignEx());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
