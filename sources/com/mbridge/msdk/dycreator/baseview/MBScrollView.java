package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.p220a.C6811b;
import com.mbridge.msdk.dycreator.p220a.C6812c;
import com.mbridge.msdk.dycreator.p294e.C8371b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C8603f;
import java.util.HashMap;
import java.util.Map;

public class MBScrollView extends ScrollView implements InterBase {

    /* renamed from: a */
    private Map<String, String> f18131a;

    /* renamed from: b */
    private Map<String, Boolean> f18132b;

    /* renamed from: c */
    private String f18133c = "";

    public MBScrollView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f18131a = C8371b.m23819a(context, attributeSet);
        setAttributeSet(attributeSet);
        setLayoutParams(generateLayoutParams(attributeSet));
        C8371b.m23821a(this.f18131a, (View) this);
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        HashMap<String, C6812c> c = C6811b.m20739a().mo37134c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C6812c cVar = c.get(attributeSet.getAttributeName(i));
            if (cVar != null) {
                int i2 = C68261.f18134a[cVar.ordinal()];
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
                        String file = getContext().getFilesDir().toString();
                        setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeFile(file + "/" + attributeValue2 + ".png")));
                    }
                } else if (i2 == 3) {
                    setContentDescription(attributeSet.getAttributeValue(i));
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBScrollView$1 */
    static /* synthetic */ class C68261 {

        /* renamed from: a */
        static final /* synthetic */ int[] f18134a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.mbridge.msdk.dycreator.a.c[] r0 = com.mbridge.msdk.dycreator.p220a.C6812c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18134a = r0
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.id     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18134a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.background     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18134a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.contentDescription     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18134a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.fadingEdge     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18134a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.f18009P     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f18134a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.layout_marginBottom     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.MBScrollView.C68261.<clinit>():void");
        }
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        FrameLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        HashMap<String, C6812c> c = C6811b.m20739a().mo37134c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C6812c cVar = c.get(attributeSet.getAttributeName(i));
            if (cVar != null) {
                Log.e("MBscrollviewparam", cVar.toString());
            }
            if (cVar != null) {
                int i2 = C68261.f18134a[cVar.ordinal()];
                if (i2 == 4) {
                    setHorizontalFadingEdgeEnabled(attributeSet.getAttributeBooleanValue(i, false));
                } else if (i2 == 5) {
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        if (attributeValue.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                } else if (i2 == 6) {
                    generateDefaultLayoutParams.bottomMargin = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i));
                }
            }
        }
        return generateDefaultLayoutParams;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f18132b;
        if (map != null && map.containsKey("attached") && this.f18132b.get("attached").booleanValue()) {
            new C8603f.C8605a("attached").mo58073a().mo58072a(this.f18133c);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f18132b;
        if (map != null && map.containsKey("detached") && this.f18132b.get("detached").booleanValue()) {
            new C8603f.C8605a("detached").mo58073a().mo58072a(this.f18133c);
        }
    }

    public String getBindDataDes() {
        Map<String, String> map = this.f18131a;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f18131a.get("mbridgeData");
    }

    public String getActionDes() {
        Map<String, String> map = this.f18131a;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f18131a.get("mbridgeAction");
    }

    public String getStrategyDes() {
        Map<String, String> map = this.f18131a;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f18131a.get("mbridgeStrategy");
    }

    public String getEffectDes() {
        Map<String, String> map = this.f18131a;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f18131a.get("mbridgeEffect");
    }

    public String getReportDes() {
        Map<String, String> map = this.f18131a;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f18131a.get("mbridgeReport");
    }

    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f18132b = C8371b.m23820a(str);
        if (campaignEx != null) {
            this.f18133c = campaignEx.getCampaignUnitId();
        }
    }
}
