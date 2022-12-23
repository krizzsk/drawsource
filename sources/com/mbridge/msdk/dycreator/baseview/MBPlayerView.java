package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
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
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.playercommon.PlayerView;
import java.util.HashMap;
import java.util.Map;

public class MBPlayerView extends PlayerView implements InterBase {

    /* renamed from: a */
    private float f18118a;

    /* renamed from: b */
    private float f18119b;

    /* renamed from: c */
    private Map<String, String> f18120c;

    /* renamed from: d */
    private Map<String, Boolean> f18121d;

    /* renamed from: e */
    private String f18122e = "";

    public MBPlayerView(Context context) {
        super(context);
    }

    public MBPlayerView(Context context, AttributeSet attributeSet) {
        super(context);
        try {
            this.f18120c = C8371b.m23819a(context, attributeSet);
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            C8371b.m23821a(this.f18120c, (View) this);
        } catch (Exception e) {
            C8672v.m24878d("MBLinearLayout", e.getMessage());
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        HashMap<String, C6812c> c = C6811b.m20739a().mo37134c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C6812c cVar = c.get(attributeSet.getAttributeName(i));
            if (cVar != null) {
                int i2 = C68241.f18123a[cVar.ordinal()];
                if (i2 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (attributeValue.startsWith("@+id/")) {
                        setId(attributeValue.substring(5).hashCode());
                    }
                } else if (i2 == 2) {
                    String attributeValue2 = attributeSet.getAttributeValue(i);
                    if (attributeValue2.startsWith("#")) {
                        setBackgroundColor(C6811b.m20739a().mo37126a(attributeSet.getAttributeValue(i)));
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
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
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
                    case layout_height:
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (!attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) && !attributeValue2.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
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
                        layoutParams.gravity = 1;
                        break;
                    case layout_centerVertical:
                        layoutParams.gravity = 16;
                        break;
                    case layout_weight:
                        layoutParams.weight = attributeSet.getAttributeFloatValue(i, 0.0f);
                        break;
                    case gravity:
                        setGravity(C6811b.m20739a().mo37133c(attributeSet.getAttributeValue(i)));
                        break;
                    case layout_margin:
                        int b2 = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i));
                        layoutParams.bottomMargin = b2;
                        layoutParams.leftMargin = b2;
                        layoutParams.rightMargin = b2;
                        layoutParams.topMargin = b2;
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
                    case layout_gravity:
                        layoutParams.gravity = C6811b.m20739a().mo37133c(attributeSet.getAttributeValue(i));
                        break;
                }
            }
        }
        return layoutParams;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f18118a = motionEvent.getRawX();
        this.f18119b = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public float getxInScreen() {
        return this.f18118a;
    }

    public float getyInScreen() {
        return this.f18119b;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f18121d;
        if (map != null && map.containsKey("attached") && this.f18121d.get("attached").booleanValue()) {
            new C8603f.C8605a("attached").mo58073a().mo58072a(this.f18122e);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f18121d;
        if (map != null && map.containsKey("detached") && this.f18121d.get("detached").booleanValue()) {
            new C8603f.C8605a("detached").mo58073a().mo58072a(this.f18122e);
        }
    }

    public String getBindDataDes() {
        Map<String, String> map = this.f18120c;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f18120c.get("mbridgeData");
    }

    public String getActionDes() {
        Map<String, String> map = this.f18120c;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f18120c.get("mbridgeAction");
    }

    public String getStrategyDes() {
        Map<String, String> map = this.f18120c;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f18120c.get("mbridgeStrategy");
    }

    public String getEffectDes() {
        Map<String, String> map = this.f18120c;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f18120c.get("mbridgeEffect");
    }

    public String getReportDes() {
        Map<String, String> map = this.f18120c;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f18120c.get("mbridgeReport");
    }

    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f18121d = C8371b.m23820a(str);
        if (campaignEx != null) {
            this.f18122e = campaignEx.getCampaignUnitId();
        }
    }
}
