package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.p220a.C6811b;
import com.mbridge.msdk.dycreator.p220a.C6812c;
import com.mbridge.msdk.dycreator.p294e.C8371b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C8603f;
import java.util.HashMap;
import java.util.Map;

public class MBLinearLayout extends LinearLayout implements InterBase {

    /* renamed from: a */
    private float f18108a;

    /* renamed from: b */
    private float f18109b;

    /* renamed from: c */
    private Map<String, String> f18110c;

    /* renamed from: d */
    private Map<String, Boolean> f18111d;

    /* renamed from: e */
    private String f18112e = "";

    public MBLinearLayout(Context context) {
        super(context);
    }

    public MBLinearLayout(Context context, AttributeSet attributeSet) {
        super(context);
        this.f18110c = C8371b.m23819a(context, attributeSet);
        setAttributeSet(attributeSet);
        setLayoutParams(generateLayoutParams(attributeSet));
        C8371b.m23821a(this.f18110c, (View) this);
    }

    public MBLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArr;
        HashMap<String, C6812c> c = C6811b.m20739a().mo37134c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C6812c cVar = c.get(attributeSet.getAttributeName(i));
            if (cVar != null) {
                int i2 = C68221.f18113a[cVar.ordinal()];
                if (i2 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (attributeValue.startsWith("@+id/")) {
                        setId(attributeValue.substring(5).hashCode());
                    }
                } else if (i2 == 2) {
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
                        setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeFile(getContext().getFilesDir().toString() + "/" + attributeValue2 + ".png")));
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        String attributeValue3 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue3)) {
                            if (attributeValue3.equals("invisible")) {
                                setVisibility(4);
                            } else if (attributeValue3.equalsIgnoreCase("gone")) {
                                setVisibility(8);
                            }
                        }
                    } else if (i2 == 5) {
                        int b = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i));
                        setPadding(b, b, b, b);
                    }
                } else if ("horizontal".equalsIgnoreCase(attributeSet.getAttributeValue(i))) {
                    setOrientation(0);
                } else {
                    setOrientation(1);
                }
            }
        }
    }

    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        HashMap b = C6811b.m20739a().mo37132b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C6812c cVar = (C6812c) b.get(attributeSet.getAttributeName(i));
            if (cVar != null) {
                switch (cVar) {
                    case layout_width:
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (!attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) && !attributeValue.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                            if (!attributeValue.startsWith("wrap")) {
                                generateDefaultLayoutParams.width = C6811b.m20739a().mo37131b(attributeValue);
                                break;
                            } else {
                                generateDefaultLayoutParams.width = -2;
                                break;
                            }
                        } else {
                            generateDefaultLayoutParams.width = -1;
                            break;
                        }
                    case layout_height:
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (!attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) && !attributeValue2.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                            if (!attributeValue2.startsWith("wrap")) {
                                generateDefaultLayoutParams.height = C6811b.m20739a().mo37131b(attributeValue2);
                                break;
                            } else {
                                generateDefaultLayoutParams.height = -2;
                                break;
                            }
                        } else {
                            generateDefaultLayoutParams.height = -1;
                            break;
                        }
                        break;
                    case layout_centerHorizontal:
                        generateDefaultLayoutParams.gravity = 1;
                        break;
                    case layout_centerVertical:
                        generateDefaultLayoutParams.gravity = 16;
                        break;
                    case layout_weight:
                        generateDefaultLayoutParams.weight = attributeSet.getAttributeFloatValue(i, 0.0f);
                        break;
                    case gravity:
                        setGravity(C6811b.m20739a().mo37133c(attributeSet.getAttributeValue(i)));
                        break;
                    case layout_margin:
                        int b2 = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i));
                        generateDefaultLayoutParams.bottomMargin = b2;
                        generateDefaultLayoutParams.leftMargin = b2;
                        generateDefaultLayoutParams.rightMargin = b2;
                        generateDefaultLayoutParams.topMargin = b2;
                        break;
                    case layout_marginLeft:
                        generateDefaultLayoutParams.leftMargin = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i));
                        break;
                    case layout_marginRight:
                        generateDefaultLayoutParams.rightMargin = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i));
                        break;
                    case layout_marginTop:
                        generateDefaultLayoutParams.topMargin = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i));
                        break;
                    case layout_marginBottom:
                        generateDefaultLayoutParams.bottomMargin = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i));
                        break;
                    case layout_gravity:
                        generateDefaultLayoutParams.gravity = C6811b.m20739a().mo37133c(attributeSet.getAttributeValue(i));
                        break;
                }
            }
        }
        return generateDefaultLayoutParams;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f18108a = motionEvent.getRawX();
        this.f18109b = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public float getxInScreen() {
        return this.f18108a;
    }

    public float getyInScreen() {
        return this.f18109b;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f18111d;
        if (map != null && map.containsKey("attached") && this.f18111d.get("attached").booleanValue()) {
            new C8603f.C8605a("attached").mo58073a().mo58072a(this.f18112e);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f18111d;
        if (map != null && map.containsKey("detached") && this.f18111d.get("detached").booleanValue()) {
            new C8603f.C8605a("detached").mo58073a().mo58072a(this.f18112e);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public String getBindDataDes() {
        Map<String, String> map = this.f18110c;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f18110c.get("mbridgeData");
    }

    public String getActionDes() {
        Map<String, String> map = this.f18110c;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f18110c.get("mbridgeAction");
    }

    public String getStrategyDes() {
        Map<String, String> map = this.f18110c;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f18110c.get("mbridgeStrategy");
    }

    public String getEffectDes() {
        Map<String, String> map = this.f18110c;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f18110c.get("mbridgeEffect");
    }

    public String getReportDes() {
        Map<String, String> map = this.f18110c;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f18110c.get("mbridgeReport");
    }

    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f18111d = C8371b.m23820a(str);
        if (campaignEx != null) {
            this.f18112e = campaignEx.getCampaignUnitId();
        }
    }
}
