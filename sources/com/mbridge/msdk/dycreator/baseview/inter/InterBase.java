package com.mbridge.msdk.dycreator.baseview.inter;

import com.mbridge.msdk.foundation.entity.CampaignEx;

public interface InterBase {
    String getActionDes();

    String getBindDataDes();

    String getEffectDes();

    String getReportDes();

    String getStrategyDes();

    void setDynamicReport(String str, CampaignEx campaignEx);
}
