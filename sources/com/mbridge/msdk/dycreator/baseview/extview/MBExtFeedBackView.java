package com.mbridge.msdk.dycreator.baseview.extview;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.p220a.C6811b;
import com.mbridge.msdk.dycreator.p220a.C6812c;
import com.mbridge.msdk.dycreator.p294e.C8370a;
import com.mbridge.msdk.dycreator.p294e.C8371b;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C8603f;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.HashMap;
import java.util.Map;

public class MBExtFeedBackView extends FeedBackButton implements InterBase {

    /* renamed from: a */
    private Map<String, String> f18253a;

    /* renamed from: b */
    private Map<String, Boolean> f18254b;

    /* renamed from: c */
    private String f18255c = "";

    public MBExtFeedBackView(Context context) {
        super(context);
    }

    public MBExtFeedBackView(Context context, AttributeSet attributeSet) {
        super(context);
        try {
            this.f18253a = C8371b.m23819a(context, attributeSet);
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            C8371b.m23821a(this.f18253a, (View) this);
        } catch (Exception e) {
            C8672v.m24878d("MBExtFeedBackView", e.getMessage());
        }
    }

    public MBExtFeedBackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        HashMap<String, C6812c> c = C6811b.m20739a().mo37134c();
        int attributeCount = attributeSet.getAttributeCount();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < attributeCount; i5++) {
            C6812c cVar = c.get(attributeSet.getAttributeName(i5));
            if (cVar != null) {
                Log.d("setupview", cVar.toString());
                switch (C68371.f18256a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i5);
                        if (!attributeValue.startsWith("@+id/")) {
                            break;
                        } else {
                            setId(attributeValue.substring(5).hashCode());
                            break;
                        }
                    case 2:
                        String attributeValue2 = attributeSet.getAttributeValue(i5);
                        if (!TextUtils.isEmpty(attributeValue2)) {
                            if (!attributeValue2.startsWith("@string/")) {
                                setText(attributeValue2);
                                break;
                            } else {
                                setText(C6811b.m20739a().mo37136e(attributeSet.getAttributeValue(i5)));
                                break;
                            }
                        } else {
                            break;
                        }
                    case 3:
                        String attributeValue3 = attributeSet.getAttributeValue(i5);
                        if (!TextUtils.isEmpty(attributeValue3)) {
                            if (attributeValue3.equals("end")) {
                                setEllipsize(TextUtils.TruncateAt.END);
                            }
                            if (attributeValue3.equals("start")) {
                                setEllipsize(TextUtils.TruncateAt.START);
                            }
                            if (attributeValue3.equals("middle")) {
                                setEllipsize(TextUtils.TruncateAt.MIDDLE);
                            }
                            if (!attributeValue3.equals("marquee")) {
                                break;
                            } else {
                                setEllipsize(TextUtils.TruncateAt.MARQUEE);
                                break;
                            }
                        } else {
                            break;
                        }
                    case 4:
                        setSingleLine(attributeSet.getAttributeBooleanValue(i5, false));
                        break;
                    case 5:
                        setLines(attributeSet.getAttributeIntValue(i5, 1));
                        break;
                    case 6:
                        String attributeValue4 = attributeSet.getAttributeValue(i5);
                        String substring = attributeValue4.startsWith("@drawable/") ? attributeValue4.substring(10) : "";
                        if (TextUtils.isEmpty(substring)) {
                            break;
                        } else {
                            Drawable drawable = getResources().getDrawable(C8658p.m24799a(C8388a.m23845e().mo56913g(), substring, "drawable"));
                            drawable.setBounds(0, 0, C8677z.m24924b(getContext(), 14.0f), C8677z.m24924b(getContext(), 14.0f));
                            setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                            break;
                        }
                    case 7:
                        setCompoundDrawablePadding(C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i5)));
                        break;
                    case 8:
                        setHorizontalFadingEdgeEnabled(attributeSet.getAttributeBooleanValue(i5, false));
                        break;
                    case 9:
                        setHorizontallyScrolling(attributeSet.getAttributeBooleanValue(i5, false));
                        break;
                    case 10:
                        setTextColor(C6811b.m20739a().mo37126a(attributeSet.getAttributeValue(i5)));
                        break;
                    case 11:
                        String attributeValue5 = attributeSet.getAttributeValue(i5);
                        if (TextUtils.isEmpty(attributeValue5)) {
                            break;
                        } else {
                            setTextSize((float) C6811b.m20739a().mo37131b(attributeValue5));
                            break;
                        }
                    case 12:
                        String attributeValue6 = attributeSet.getAttributeValue(i5);
                        if (!TextUtils.isEmpty(attributeValue6)) {
                            if (!attributeValue6.equals("invisible")) {
                                if (!attributeValue6.equalsIgnoreCase("gone")) {
                                    break;
                                } else {
                                    setVisibility(8);
                                    break;
                                }
                            } else {
                                setVisibility(4);
                                break;
                            }
                        } else {
                            break;
                        }
                    case 13:
                        String attributeValue7 = attributeSet.getAttributeValue(i5);
                        if (!attributeValue7.startsWith("#")) {
                            if (attributeValue7.startsWith("@drawable/")) {
                                attributeValue7 = attributeValue7.substring(10);
                            }
                            setBackgroundResource(getResources().getIdentifier(attributeValue7, "drawable", getContext().getPackageName()));
                            break;
                        } else {
                            setBackgroundColor(C6811b.m20739a().mo37126a(attributeSet.getAttributeValue(i5)));
                            break;
                        }
                    case 14:
                        if (!"bold".equalsIgnoreCase(attributeSet.getAttributeValue(i5))) {
                            break;
                        } else {
                            setTypeface(Typeface.defaultFromStyle(1));
                            break;
                        }
                    case 15:
                        String attributeValue8 = attributeSet.getAttributeValue(i5);
                        String substring2 = attributeValue8.substring(attributeValue8.indexOf("/") + 1);
                        setTextAppearance(getContext(), C6811b.m20739a().mo37135d("R.style." + substring2));
                        break;
                    case 16:
                        String attributeValue9 = attributeSet.getAttributeValue(i5);
                        if (TextUtils.isEmpty(attributeValue9)) {
                            break;
                        } else {
                            String str = C8370a.f20435a.get(attributeValue9.substring(8));
                            if (TextUtils.isEmpty(str)) {
                                break;
                            } else {
                                setContentDescription(str);
                                break;
                            }
                        }
                    case 17:
                        String attributeValue10 = attributeSet.getAttributeValue(i5);
                        if (!TextUtils.isEmpty(attributeValue10)) {
                            String str2 = C8370a.f20435a.get(attributeValue10.substring(8));
                            if (!TextUtils.isEmpty(str2)) {
                                setTag(str2);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    case 18:
                        setGravity(C6811b.m20739a().mo37133c(attributeSet.getAttributeValue(i5)));
                        break;
                    case 19:
                        int b = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i5));
                        setPadding(b, b, b, b);
                        break;
                    case 20:
                        i4 = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i5));
                        setPadding(i, i4, i2, i3);
                        break;
                    case 21:
                        i3 = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i5));
                        setPadding(i, i4, i2, i3);
                        break;
                    case 22:
                        i = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i5));
                        setPadding(i, i4, i2, i3);
                        break;
                    case 23:
                        i2 = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i5));
                        setPadding(i, i4, i2, i3);
                        break;
                    case 24:
                        setPadding(C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i5)), i4, i2, i3);
                        break;
                    case 25:
                        setPadding(i, i4, C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i5)), i3);
                        break;
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.dycreator.baseview.extview.MBExtFeedBackView$1 */
    static /* synthetic */ class C68371 {

        /* renamed from: a */
        static final /* synthetic */ int[] f18256a;

        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|(3:53|54|56)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|56) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.mbridge.msdk.dycreator.a.c[] r0 = com.mbridge.msdk.dycreator.p220a.C6812c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18256a = r0
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.id     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.text     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.ellipsize     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.singleLine     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.lines     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.drawableLeft     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.drawablePadding     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.fadingEdge     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.scrollHorizontally     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.textColor     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.textSize     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.f18009P     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.background     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.textStyle     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.style     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.contentDescription     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.tag     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.gravity     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.padding     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.paddingTop     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.paddingBottom     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x0108 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.paddingLeft     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x0114 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.paddingRight     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x0120 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.paddingStart     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x012c }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.paddingEnd     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x0138 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.layout_width     // Catch:{ NoSuchFieldError -> 0x0138 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0138 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0138 }
            L_0x0138:
                int[] r0 = f18256a     // Catch:{ NoSuchFieldError -> 0x0144 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.layout_height     // Catch:{ NoSuchFieldError -> 0x0144 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0144 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0144 }
            L_0x0144:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.extview.MBExtFeedBackView.C68371.<clinit>():void");
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        HashMap b = C6811b.m20739a().mo37132b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C6812c cVar = (C6812c) b.get(attributeSet.getAttributeName(i));
            if (cVar != null) {
                int i2 = C68371.f18256a[cVar.ordinal()];
                if (i2 == 26) {
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                        layoutParams.width = -1;
                    } else if (attributeValue.startsWith("wrap")) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = C6811b.m20739a().mo37131b(attributeValue);
                    }
                } else if (i2 == 27) {
                    String attributeValue2 = attributeSet.getAttributeValue(i);
                    if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                        layoutParams.height = -1;
                    } else if (attributeValue2.startsWith("wrap")) {
                        layoutParams.height = -2;
                    } else {
                        layoutParams.height = C6811b.m20739a().mo37131b(attributeValue2);
                    }
                }
            }
        }
        return layoutParams;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f18254b;
        if (map != null && map.containsKey("attached") && this.f18254b.get("attached").booleanValue()) {
            new C8603f.C8605a("attached").mo58073a().mo58072a(this.f18255c);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f18254b;
        if (map != null && map.containsKey("detached") && this.f18254b.get("detached").booleanValue()) {
            new C8603f.C8605a("detached").mo58073a().mo58072a(this.f18255c);
        }
    }

    public String getBindDataDes() {
        Map<String, String> map = this.f18253a;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f18253a.get("mbridgeData");
    }

    public String getActionDes() {
        Map<String, String> map = this.f18253a;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f18253a.get("mbridgeAction");
    }

    public String getStrategyDes() {
        Map<String, String> map = this.f18253a;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f18253a.get("mbridgeStrategy");
    }

    public String getEffectDes() {
        Map<String, String> map = this.f18253a;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f18253a.get("mbridgeEffect");
    }

    public String getReportDes() {
        Map<String, String> map = this.f18253a;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f18253a.get("mbridgeReport");
    }

    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f18254b = C8371b.m23820a(str);
        if (campaignEx != null) {
            this.f18255c = campaignEx.getCampaignUnitId();
        }
    }
}
