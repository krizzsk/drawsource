package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.p220a.C6811b;
import com.mbridge.msdk.dycreator.p220a.C6812c;
import com.mbridge.msdk.dycreator.p294e.C8371b;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C8603f;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8672v;
import java.util.HashMap;
import java.util.Map;

public class MBRelativeLayout extends RelativeLayout implements InterBase {

    /* renamed from: a */
    private float f18124a;

    /* renamed from: b */
    private float f18125b;

    /* renamed from: c */
    private Map<String, String> f18126c;

    /* renamed from: d */
    private Map<String, Boolean> f18127d;

    /* renamed from: e */
    private String f18128e = "";

    public MBRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MBRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context);
        try {
            this.f18126c = C8371b.m23819a(context, attributeSet);
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            C8371b.m23821a(this.f18126c, (View) this);
        } catch (Exception e) {
            C8672v.m24878d("MBRelativeLayouts", e.getMessage());
        }
    }

    public MBRelativeLayout(Context context) {
        super(context);
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArr;
        HashMap<String, C6812c> c = C6811b.m20739a().mo37134c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C6812c cVar = c.get(attributeSet.getAttributeName(i));
            if (cVar != null) {
                int i2 = C68251.f18129a[cVar.ordinal()];
                if (i2 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (attributeValue.startsWith("@+id/")) {
                        setId(attributeValue.substring(5).hashCode());
                    }
                } else if (i2 == 2) {
                    Log.i("litongtest", "设置背景颜色");
                    String attributeValue2 = attributeSet.getAttributeValue(i);
                    if (attributeValue2.startsWith("#")) {
                        String[] strArr2 = new String[0];
                        try {
                            strArr = attributeValue2.split("-");
                        } catch (Exception unused) {
                            strArr = null;
                        }
                        if (strArr == null || strArr.length > 2) {
                            if (strArr != null && strArr.length == 3) {
                                try {
                                    GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArr[2]), new int[]{Color.parseColor(strArr[0]), Color.parseColor(strArr[1])});
                                    gradientDrawable.setGradientType(0);
                                    setBackground(gradientDrawable);
                                } catch (Exception unused2) {
                                }
                            }
                            setBackgroundColor(C6811b.m20739a().mo37126a(attributeSet.getAttributeValue(i)));
                        } else {
                            setBackgroundColor(C6811b.m20739a().mo37126a(attributeSet.getAttributeValue(i)));
                        }
                    } else {
                        if (attributeValue2.startsWith("@drawable/")) {
                            attributeValue2 = attributeValue2.substring(10);
                        }
                        setBackgroundResource(C8658p.m24799a(C8388a.m23845e().mo56913g(), attributeValue2, "drawable"));
                    }
                } else if (i2 == 3) {
                    int b = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i));
                    setPadding(b, b, b, b);
                } else if (i2 == 4) {
                    setGravity(C6811b.m20739a().mo37133c(attributeSet.getAttributeValue(i)));
                } else if (i2 == 5) {
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
    }

    public RelativeLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        HashMap b = C6811b.m20739a().mo37132b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C6812c cVar = (C6812c) b.get(attributeSet.getAttributeName(i));
            if (cVar != null) {
                switch (cVar) {
                    case layout_width:
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (!attributeValue.startsWith("fill") && !attributeValue.startsWith("match")) {
                            if (!attributeValue.startsWith("w")) {
                                layoutParams.width = C6811b.m20739a().mo37131b(attributeValue);
                                break;
                            } else {
                                layoutParams.width = -2;
                                break;
                            }
                        } else {
                            layoutParams.width = -1;
                            break;
                        }
                        break;
                    case layout_height:
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (!attributeValue2.startsWith("fill") && !attributeValue2.startsWith("match")) {
                            if (!attributeValue2.startsWith("wrap")) {
                                layoutParams.height = C6811b.m20739a().mo37131b(attributeValue2);
                                break;
                            } else {
                                layoutParams.height = -2;
                                break;
                            }
                        } else {
                            layoutParams.height = -1;
                            break;
                        }
                        break;
                    case layout_centerHorizontal:
                        if (!attributeSet.getAttributeBooleanValue(i, false)) {
                            break;
                        } else {
                            layoutParams.addRule(14, -1);
                            break;
                        }
                    case layout_alignParentBottom:
                        if (!attributeSet.getAttributeBooleanValue(i, false)) {
                            break;
                        } else {
                            layoutParams.addRule(12, -1);
                            break;
                        }
                    case layout_alignParentTop:
                        if (!attributeSet.getAttributeBooleanValue(i, false)) {
                            break;
                        } else {
                            layoutParams.addRule(10, -1);
                            break;
                        }
                    case layout_centerVertical:
                        if (!attributeSet.getAttributeBooleanValue(i, false)) {
                            break;
                        } else {
                            layoutParams.addRule(15, -1);
                            break;
                        }
                    case layout_below:
                        String attributeValue3 = attributeSet.getAttributeValue(i);
                        if (!attributeValue3.startsWith("@+id")) {
                            break;
                        } else {
                            layoutParams.addRule(3, attributeValue3.substring(5).hashCode());
                            break;
                        }
                    case layout_above:
                        String attributeValue4 = attributeSet.getAttributeValue(i);
                        if (!attributeValue4.startsWith("@+id")) {
                            break;
                        } else {
                            layoutParams.addRule(2, attributeValue4.substring(5).hashCode());
                            break;
                        }
                    case layout_toLeftOf:
                        String attributeValue5 = attributeSet.getAttributeValue(i);
                        if (!attributeValue5.startsWith("@+id")) {
                            break;
                        } else {
                            layoutParams.addRule(0, attributeValue5.substring(5).hashCode());
                            break;
                        }
                    case layout_toRightOf:
                        String attributeValue6 = attributeSet.getAttributeValue(i);
                        if (!attributeValue6.startsWith("@+id")) {
                            break;
                        } else {
                            layoutParams.addRule(1, attributeValue6.substring(5).hashCode());
                            break;
                        }
                    case layout_toEndOf:
                        String attributeValue7 = attributeSet.getAttributeValue(i);
                        if (!attributeValue7.startsWith("@+id")) {
                            break;
                        } else {
                            layoutParams.addRule(17, attributeValue7.substring(5).hashCode());
                            break;
                        }
                    case layout_margin:
                        int b2 = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i));
                        layoutParams.setMargins(b2, b2, b2, b2);
                        break;
                    case layout_marginLeft:
                        layoutParams.leftMargin = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i));
                        break;
                    case layout_marginRight:
                        layoutParams.rightMargin = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i));
                        break;
                    case layout_marginTop:
                        layoutParams.topMargin = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i));
                        break;
                    case layout_marginBottom:
                        layoutParams.bottomMargin = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i));
                        break;
                    case layout_alignParentRight:
                        if (!attributeSet.getAttributeBooleanValue(i, false)) {
                            break;
                        } else {
                            layoutParams.addRule(11, -1);
                            break;
                        }
                    case layout_alignParentLeft:
                        if (!attributeSet.getAttributeBooleanValue(i, false)) {
                            break;
                        } else {
                            layoutParams.addRule(9, -1);
                            break;
                        }
                    case layout_alignTop:
                        String attributeValue8 = attributeSet.getAttributeValue(i);
                        if (!attributeValue8.startsWith("@+id")) {
                            break;
                        } else {
                            layoutParams.addRule(6, attributeValue8.substring(5).hashCode());
                            break;
                        }
                    case layout_alignLeft:
                        String attributeValue9 = attributeSet.getAttributeValue(i);
                        if (!attributeValue9.startsWith("@+id")) {
                            break;
                        } else {
                            layoutParams.addRule(5, attributeValue9.substring(5).hashCode());
                            break;
                        }
                    case layout_alignRight:
                        String attributeValue10 = attributeSet.getAttributeValue(i);
                        if (!attributeValue10.startsWith("@+id")) {
                            break;
                        } else {
                            layoutParams.addRule(7, attributeValue10.substring(5).hashCode());
                            break;
                        }
                    case layout_alignBottom:
                        String attributeValue11 = attributeSet.getAttributeValue(i);
                        if (!attributeValue11.startsWith("@+id")) {
                            break;
                        } else {
                            layoutParams.addRule(8, attributeValue11.substring(5).hashCode());
                            break;
                        }
                    case layout_centerInParent:
                        if (!attributeSet.getAttributeBooleanValue(i, false)) {
                            break;
                        } else {
                            layoutParams.addRule(13, -1);
                            break;
                        }
                    case layout_alignParentEnd:
                        if (!attributeSet.getAttributeBooleanValue(i, false)) {
                            break;
                        } else {
                            layoutParams.addRule(21, -1);
                            break;
                        }
                }
            }
        }
        return layoutParams;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 0;
        while (i5 < getChildCount()) {
            try {
                View childAt = getChildAt(i5);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) childAt.getLayoutParams();
                if (childAt instanceof MBLinearLayout) {
                    MBLinearLayout mBLinearLayout = (MBLinearLayout) childAt;
                    for (int i6 = 0; i6 < mBLinearLayout.getChildCount(); i6++) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) mBLinearLayout.getChildAt(i6).getLayoutParams();
                    }
                }
                i5++;
            } catch (Exception e) {
                C8672v.m24878d("MBRelativeLayouts", e.getMessage());
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f18124a = motionEvent.getRawX();
        this.f18125b = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public float getxInScreen() {
        return this.f18124a;
    }

    public float getyInScreen() {
        return this.f18125b;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f18127d;
        if (map != null && map.containsKey("attached") && this.f18127d.get("attached").booleanValue()) {
            new C8603f.C8605a("attached").mo58073a().mo58072a(this.f18128e);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f18127d;
        if (map != null && map.containsKey("detached") && this.f18127d.get("detached").booleanValue()) {
            new C8603f.C8605a("detached").mo58073a().mo58072a(this.f18128e);
        }
    }

    public String getBindDataDes() {
        Map<String, String> map = this.f18126c;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f18126c.get("mbridgeData");
    }

    public String getActionDes() {
        Map<String, String> map = this.f18126c;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f18126c.get("mbridgeAction");
    }

    public String getStrategyDes() {
        Map<String, String> map = this.f18126c;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f18126c.get("mbridgeStrategy");
    }

    public String getEffectDes() {
        Map<String, String> map = this.f18126c;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f18126c.get("mbridgeEffect");
    }

    public String getReportDes() {
        Map<String, String> map = this.f18126c;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f18126c.get("mbridgeReport");
    }

    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f18127d = C8371b.m23820a(str);
        if (campaignEx != null) {
            this.f18128e = campaignEx.getCampaignUnitId();
        }
    }
}
