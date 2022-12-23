package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.p220a.C6811b;
import com.mbridge.msdk.dycreator.p220a.C6812c;
import com.mbridge.msdk.dycreator.p294e.C8370a;
import com.mbridge.msdk.foundation.tools.C8672v;
import java.util.HashMap;

public class MBCusRoundImageView extends ImageView {

    /* renamed from: a */
    private int f18179a;

    /* renamed from: b */
    private int f18180b;

    /* renamed from: c */
    private int f18181c;

    /* renamed from: d */
    private int f18182d;

    /* renamed from: e */
    private Xfermode f18183e;

    /* renamed from: f */
    private int f18184f;

    /* renamed from: g */
    private int f18185g;

    /* renamed from: h */
    private int f18186h;

    /* renamed from: i */
    private int f18187i;

    /* renamed from: j */
    private int f18188j;

    /* renamed from: k */
    private int f18189k;

    /* renamed from: l */
    private int f18190l;

    /* renamed from: m */
    private int f18191m;

    /* renamed from: n */
    private int f18192n;

    /* renamed from: o */
    private float[] f18193o;

    /* renamed from: p */
    private float[] f18194p;

    /* renamed from: q */
    private RectF f18195q;

    /* renamed from: r */
    private RectF f18196r;

    /* renamed from: s */
    private boolean f18197s;

    /* renamed from: t */
    private boolean f18198t;

    /* renamed from: u */
    private Path f18199u;

    /* renamed from: v */
    private Paint f18200v;

    public MBCusRoundImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MBCusRoundImageView(Context context, AttributeSet attributeSet) {
        this(context, (AttributeSet) null, 0);
        try {
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(context, attributeSet));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public MBCusRoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18199u = new Path();
        this.f18200v = new Paint();
        this.f18193o = new float[8];
        this.f18194p = new float[8];
        this.f18196r = new RectF();
        this.f18195q = new RectF();
        this.f18183e = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        super.onSizeChanged(i, i2, i3, i4);
        try {
            this.f18184f = i;
            this.f18185g = i2;
            int i8 = 0;
            if (this.f18198t) {
                try {
                    if (!(this.f18193o == null || this.f18194p == null)) {
                        while (true) {
                            i5 = 2;
                            if (i8 >= 2) {
                                break;
                            }
                            this.f18193o[i8] = (float) this.f18187i;
                            this.f18194p[i8] = ((float) this.f18187i) - (((float) this.f18191m) / 2.0f);
                            i8++;
                        }
                        while (true) {
                            i6 = 4;
                            if (i5 >= 4) {
                                break;
                            }
                            this.f18193o[i5] = (float) this.f18188j;
                            this.f18194p[i5] = ((float) this.f18188j) - (((float) this.f18191m) / 2.0f);
                            i5++;
                        }
                        while (true) {
                            if (i6 >= 6) {
                                break;
                            }
                            this.f18193o[i6] = (float) this.f18189k;
                            this.f18194p[i6] = ((float) this.f18189k) - (((float) this.f18191m) / 2.0f);
                            i6++;
                        }
                        for (i7 = 6; i7 < 8; i7++) {
                            this.f18193o[i7] = (float) this.f18190l;
                            this.f18194p[i7] = ((float) this.f18190l) - (((float) this.f18191m) / 2.0f);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (!(this.f18193o == null || this.f18194p == null)) {
                while (i8 < this.f18193o.length) {
                    try {
                        this.f18193o[i8] = (float) this.f18186h;
                        this.f18194p[i8] = ((float) this.f18186h) - (((float) this.f18191m) / 2.0f);
                        i8++;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
            if (this.f18196r != null) {
                this.f18196r.set(((float) this.f18191m) / 2.0f, ((float) this.f18191m) / 2.0f, ((float) this.f18184f) - (((float) this.f18191m) / 2.0f), ((float) this.f18185g) - (((float) this.f18191m) / 2.0f));
            }
            if (this.f18195q != null) {
                this.f18195q.set(0.0f, 0.0f, (float) this.f18184f, (float) this.f18185g);
            }
        } catch (Exception e3) {
            C8672v.m24878d("MBridgeImageView", e3.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (canvas != null) {
            try {
                canvas.saveLayer(this.f18195q, (Paint) null, 31);
                canvas.scale((((float) (this.f18184f - (this.f18191m * 2))) * 1.0f) / ((float) this.f18184f), (((float) (this.f18185g - (this.f18191m * 2))) * 1.0f) / ((float) this.f18185g), ((float) this.f18184f) / 2.0f, ((float) this.f18185g) / 2.0f);
                super.onDraw(canvas);
                if (this.f18200v != null) {
                    this.f18200v.reset();
                    this.f18200v.setAntiAlias(true);
                    this.f18200v.setStyle(Paint.Style.FILL);
                    this.f18200v.setXfermode(this.f18183e);
                }
                if (this.f18199u != null) {
                    this.f18199u.reset();
                    this.f18199u.addRoundRect(this.f18195q, this.f18194p, Path.Direction.CCW);
                }
                canvas.drawPath(this.f18199u, this.f18200v);
                if (this.f18200v != null) {
                    this.f18200v.setXfermode((Xfermode) null);
                }
                canvas.restore();
                if (this.f18197s) {
                    int i = this.f18191m;
                    int i2 = this.f18192n;
                    RectF rectF = this.f18196r;
                    float[] fArr = this.f18193o;
                    try {
                        if (this.f18199u != null) {
                            this.f18199u.reset();
                        }
                        if (this.f18200v != null) {
                            this.f18200v.setStrokeWidth((float) i);
                            this.f18200v.setColor(i2);
                            this.f18200v.setStyle(Paint.Style.STROKE);
                        }
                        if (this.f18199u != null) {
                            this.f18199u.addRoundRect(rectF, fArr, Path.Direction.CCW);
                        }
                        if (canvas != null) {
                            canvas.drawPath(this.f18199u, this.f18200v);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                C8672v.m24874a("MBridgeImageView", e2.getMessage());
            }
        }
    }

    public void setCornerRadius(int i) {
        this.f18186h = i;
    }

    public void setBorder(int i, int i2, int i3) {
        this.f18197s = true;
        this.f18191m = i2;
        this.f18192n = i3;
        this.f18186h = i;
    }

    public void setCustomBorder(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f18197s = true;
        this.f18198t = true;
        this.f18191m = i5;
        this.f18192n = i6;
        this.f18187i = i;
        this.f18189k = i3;
        this.f18188j = i2;
        this.f18190l = i4;
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArr;
        HashMap<String, C6812c> c = C6811b.m20739a().mo37134c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C6812c cVar = c.get(attributeSet.getAttributeName(i));
            if (cVar != null) {
                switch (C68341.f18201a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (!attributeValue.startsWith("@+id/")) {
                            break;
                        } else {
                            setId(attributeValue.substring(5).hashCode());
                            break;
                        }
                    case 2:
                        C6811b.m20739a().mo37130a(attributeSet.getAttributeValue(i), (ImageView) this);
                        break;
                    case 3:
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (!attributeValue2.startsWith("#")) {
                            if (attributeValue2.startsWith("@drawable/")) {
                                attributeValue2 = attributeValue2.substring(10);
                            }
                            setBackgroundResource(getResources().getIdentifier(attributeValue2, "drawable", getContext().getPackageName()));
                            break;
                        } else {
                            String[] strArr2 = new String[0];
                            try {
                                strArr = attributeValue2.split("-");
                            } catch (Exception unused) {
                                strArr = null;
                            }
                            if (strArr != null && strArr.length <= 2) {
                                setBackgroundColor(C6811b.m20739a().mo37126a(attributeSet.getAttributeValue(i)));
                                break;
                            } else {
                                if (strArr != null && strArr.length == 3) {
                                    try {
                                        GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArr[2]), new int[]{Color.parseColor(strArr[0]), Color.parseColor(strArr[1])});
                                        gradientDrawable.setGradientType(0);
                                        setBackground(gradientDrawable);
                                        break;
                                    } catch (Exception unused2) {
                                    }
                                }
                                setBackgroundColor(C6811b.m20739a().mo37126a(attributeSet.getAttributeValue(i)));
                                break;
                            }
                        }
                        break;
                    case 4:
                        String attributeValue3 = attributeSet.getAttributeValue(i);
                        if (TextUtils.isEmpty(attributeValue3)) {
                            break;
                        } else {
                            String str = C8370a.f20435a.get(attributeValue3.substring(8));
                            if (TextUtils.isEmpty(str)) {
                                break;
                            } else {
                                setContentDescription(str);
                                break;
                            }
                        }
                    case 5:
                        String attributeValue4 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue4)) {
                            String str2 = C8370a.f20435a.get(attributeValue4.substring(8));
                            if (!TextUtils.isEmpty(str2)) {
                                setTag(str2);
                                break;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    case 6:
                        String attributeValue5 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue5)) {
                            if (!attributeValue5.equals("invisible")) {
                                if (!attributeValue5.equalsIgnoreCase("gone")) {
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
                    case 7:
                        String attributeValue6 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue6)) {
                            if (!attributeValue6.equals("fitXY")) {
                                if (!attributeValue6.equals("centerInside")) {
                                    if (!attributeValue6.equals("centerCrop")) {
                                        break;
                                    } else {
                                        setScaleType(ImageView.ScaleType.CENTER_CROP);
                                        break;
                                    }
                                } else {
                                    setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                                    break;
                                }
                            } else {
                                setScaleType(ImageView.ScaleType.FIT_XY);
                                break;
                            }
                        } else {
                            break;
                        }
                    case 8:
                        int b = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i));
                        this.f18182d = b;
                        this.f18181c = b;
                        this.f18180b = b;
                        this.f18179a = b;
                        setPadding(b, b, b, b);
                        break;
                    case 9:
                        int b2 = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i));
                        this.f18180b = b2;
                        setPadding(this.f18179a, b2, this.f18181c, this.f18182d);
                        break;
                    case 10:
                        int b3 = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i));
                        this.f18182d = b3;
                        setPadding(this.f18179a, this.f18180b, this.f18181c, b3);
                        break;
                    case 11:
                        int b4 = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i));
                        this.f18179a = b4;
                        setPadding(b4, this.f18180b, this.f18181c, this.f18182d);
                        break;
                    case 12:
                        int b5 = C6811b.m20739a().mo37131b(attributeSet.getAttributeValue(i));
                        this.f18181c = b5;
                        setPadding(this.f18179a, this.f18180b, b5, this.f18182d);
                        break;
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView$1 */
    static /* synthetic */ class C68341 {

        /* renamed from: a */
        static final /* synthetic */ int[] f18201a;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.mbridge.msdk.dycreator.a.c[] r0 = com.mbridge.msdk.dycreator.p220a.C6812c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18201a = r0
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.id     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18201a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.src     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18201a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.background     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18201a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.contentDescription     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18201a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.tag     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f18201a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.f18009P     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f18201a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.scaleType     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f18201a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.padding     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f18201a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.paddingTop     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f18201a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.paddingBottom     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f18201a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.paddingLeft     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f18201a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.paddingRight     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f18201a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.layout_width     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f18201a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.layout_height     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f18201a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.gravity     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f18201a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.mbridge.msdk.dycreator.a.c r1 = com.mbridge.msdk.dycreator.p220a.C6812c.layout_gravity     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView.C68341.<clinit>():void");
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        HashMap<String, C6812c> c = C6811b.m20739a().mo37134c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C6812c cVar = c.get(attributeSet.getAttributeName(i));
            if (cVar != null) {
                int i2 = C68341.f18201a[cVar.ordinal()];
                if (i2 == 6) {
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        if (attributeValue.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                } else if (i2 == 13) {
                    String attributeValue2 = attributeSet.getAttributeValue(i);
                    if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                        layoutParams.width = -1;
                    } else if (attributeValue2.startsWith("wrap")) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = C6811b.m20739a().mo37131b(attributeValue2);
                    }
                } else if (i2 == 14) {
                    String attributeValue3 = attributeSet.getAttributeValue(i);
                    if (attributeValue3.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue3.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                        layoutParams.height = -1;
                    } else if (attributeValue3.startsWith("wrap")) {
                        layoutParams.height = -2;
                    } else {
                        layoutParams.height = C6811b.m20739a().mo37131b(attributeValue3);
                    }
                }
            }
        }
        return layoutParams;
    }
}
