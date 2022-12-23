package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.p220a.C6811b;
import com.mbridge.msdk.dycreator.p220a.C6812c;
import com.mbridge.msdk.dycreator.p294e.C8371b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C8603f;
import com.mbridge.msdk.foundation.tools.C8672v;
import java.util.HashMap;
import java.util.Map;

public class MBListView extends ListView implements InterBase {

    /* renamed from: a */
    private Map<String, String> f18114a;

    /* renamed from: b */
    private Map<String, Boolean> f18115b;

    /* renamed from: c */
    private String f18116c = "";

    public MBListView(Context context, AttributeSet attributeSet) {
        super(context);
        try {
            this.f18114a = C8371b.m23819a(context, attributeSet);
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            C8371b.m23821a(this.f18114a, (View) this);
        } catch (Exception e) {
            C8672v.m24878d("MBListView", e.getMessage());
        }
    }

    public AbsListView.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) generateDefaultLayoutParams();
        HashMap<String, C6812c> c = C6811b.m20739a().mo37134c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C6812c cVar = c.get(attributeSet.getAttributeName(i));
            if (cVar != null) {
                int i2 = C68231.f18117a[cVar.ordinal()];
                if (i2 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                        layoutParams.width = -1;
                    } else if (attributeValue.startsWith("wrap")) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = C6811b.m20739a().mo37131b(attributeValue);
                    }
                } else if (i2 == 2) {
                    String attributeValue2 = attributeSet.getAttributeValue(i);
                    if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                        layoutParams.height = -1;
                    } else if (attributeValue2.startsWith("wrap")) {
                        layoutParams.height = -2;
                    } else {
                        layoutParams.height = C6811b.m20739a().mo37131b(attributeValue2);
                    }
                } else if (i2 == 3) {
                    setHorizontalFadingEdgeEnabled(attributeSet.getAttributeBooleanValue(i, false));
                } else if (i2 == 4) {
                    String attributeValue3 = attributeSet.getAttributeValue(i);
                    if (!TextUtils.isEmpty(attributeValue3)) {
                        if (attributeValue3.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue3.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                }
            }
        }
        return layoutParams;
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        HashMap<String, C6812c> c = C6811b.m20739a().mo37134c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C6812c cVar = c.get(attributeSet.getAttributeName(i));
            if (cVar != null) {
                switch (cVar) {
                    case id:
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (!attributeValue.startsWith("@+id/")) {
                            break;
                        } else {
                            setId(attributeValue.substring(5).hashCode());
                            break;
                        }
                    case splitMotionEvents:
                        setMotionEventSplittingEnabled(!attributeSet.getAttributeValue(i).equals("false"));
                        break;
                    case cacheColorHint:
                        setCacheColorHint(C6811b.m20739a().mo37126a(attributeSet.getAttributeValue(i)));
                        break;
                    case divider:
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue2) && attributeValue2.startsWith("@null")) {
                            setDivider((Drawable) null);
                            break;
                        }
                    case scrollbars:
                        String attributeValue3 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue3)) {
                            if (attributeValue3.equals("none")) {
                                setVerticalScrollBarEnabled(false);
                            }
                            if (!attributeValue3.equals("false")) {
                                break;
                            } else {
                                setScrollbarFadingEnabled(false);
                                break;
                            }
                        } else {
                            break;
                        }
                    case listSelector:
                        String attributeValue4 = attributeSet.getAttributeValue(i);
                        if (TextUtils.isEmpty(attributeValue4)) {
                            break;
                        } else {
                            setSelector(C6811b.m20739a().mo37126a(attributeValue4));
                            break;
                        }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f18115b;
        if (map != null && map.containsKey("attached") && this.f18115b.get("attached").booleanValue()) {
            new C8603f.C8605a("attached").mo58073a().mo58072a(this.f18116c);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f18115b;
        if (map != null && map.containsKey("detached") && this.f18115b.get("detached").booleanValue()) {
            new C8603f.C8605a("detached").mo58073a().mo58072a(this.f18116c);
        }
    }

    public String getBindDataDes() {
        Map<String, String> map = this.f18114a;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f18114a.get("mbridgeData");
    }

    public String getActionDes() {
        Map<String, String> map = this.f18114a;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f18114a.get("mbridgeAction");
    }

    public String getStrategyDes() {
        Map<String, String> map = this.f18114a;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f18114a.get("mbridgeStrategy");
    }

    public String getEffectDes() {
        Map<String, String> map = this.f18114a;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f18114a.get("mbridgeEffect");
    }

    public String getReportDes() {
        Map<String, String> map = this.f18114a;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f18114a.get("mbridgeReport");
    }

    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f18115b = C8371b.m23820a(str);
        if (campaignEx != null) {
            this.f18116c = campaignEx.getCampaignUnitId();
        }
    }
}
