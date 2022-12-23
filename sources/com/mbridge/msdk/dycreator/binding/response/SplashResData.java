package com.mbridge.msdk.dycreator.binding.response;

import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.p295f.p296a.C8377a;

public class SplashResData extends BaseRespData {

    /* renamed from: a */
    private C8377a f20371a;

    /* renamed from: b */
    private EAction f20372b;

    public C8377a getBaseViewData() {
        return this.f20371a;
    }

    public void setBaseViewData(C8377a aVar) {
        this.f20371a = aVar;
    }

    public EAction geteAction() {
        return this.f20372b;
    }

    public void seteAction(EAction eAction) {
        this.f20372b = eAction;
    }
}
