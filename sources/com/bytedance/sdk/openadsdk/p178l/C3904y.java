package com.bytedance.sdk.openadsdk.p178l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2892d;
import com.bytedance.sdk.component.utils.C2897g;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3434p;
import com.bytedance.sdk.openadsdk.core.video.p161b.C3597a;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.l.y */
/* compiled from: UIUtils */
public class C3904y {

    /* renamed from: a */
    private static float f9978a = -1.0f;

    /* renamed from: b */
    private static int f9979b = -1;

    /* renamed from: c */
    private static float f9980c = -1.0f;

    /* renamed from: d */
    private static int f9981d = -1;

    /* renamed from: e */
    private static int f9982e = -1;

    /* renamed from: f */
    private static WindowManager f9983f;

    /* renamed from: a */
    public static void m12850a(Context context, C3431n nVar, String str, WebView webView) {
    }

    /* renamed from: a */
    private static boolean m12866a(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    static {
        m12849a(C3513m.m10963a());
    }

    /* renamed from: a */
    private static boolean m12865a() {
        return f9978a < 0.0f || f9979b < 0 || f9980c < 0.0f || f9981d < 0 || f9982e < 0;
    }

    /* renamed from: a */
    public static void m12849a(Context context) {
        m12851a(context, false);
    }

    /* renamed from: a */
    public static void m12851a(Context context, boolean z) {
        Context a = context == null ? C3513m.m10963a() : context;
        if (a != null) {
            f9983f = (WindowManager) a.getSystemService("window");
            if (m12865a() || z) {
                DisplayMetrics displayMetrics = a.getResources().getDisplayMetrics();
                f9978a = displayMetrics.density;
                f9979b = displayMetrics.densityDpi;
                f9980c = displayMetrics.scaledDensity;
                f9981d = displayMetrics.widthPixels;
                f9982e = displayMetrics.heightPixels;
            }
            if (context != null && context.getResources() != null && context.getResources().getConfiguration() != null) {
                if (context.getResources().getConfiguration().orientation == 1) {
                    int i = f9981d;
                    int i2 = f9982e;
                    if (i > i2) {
                        f9981d = i2;
                        f9982e = i;
                        return;
                    }
                    return;
                }
                int i3 = f9981d;
                int i4 = f9982e;
                if (i3 < i4) {
                    f9981d = i4;
                    f9982e = i3;
                }
            }
        }
    }

    /* renamed from: a */
    public static int m12843a(Context context, float f) {
        m12849a(context);
        float f2 = m12888f(context);
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    /* renamed from: b */
    public static float m12868b(Context context, float f) {
        m12849a(context);
        return (f * m12885e(context)) + 0.5f;
    }

    /* renamed from: c */
    public static float m12876c(Context context, float f) {
        m12849a(context);
        return f * m12885e(context);
    }

    /* renamed from: d */
    public static int m12882d(Context context, float f) {
        m12851a(context, true);
        float e = m12885e(context);
        if (e <= 0.0f) {
            e = 1.0f;
        }
        return (int) ((f / e) + 0.5f);
    }

    /* renamed from: b */
    public static int[] m12874b(Context context) {
        if (context == null) {
            return null;
        }
        if (f9983f == null) {
            f9983f = (WindowManager) C3513m.m10963a().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = f9983f;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            if (Build.VERSION.SDK_INT >= 14 && Build.VERSION.SDK_INT < 17) {
                try {
                    i = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                    i2 = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                } catch (Exception unused) {
                }
            }
            if (Build.VERSION.SDK_INT >= 17) {
                try {
                    Point point = new Point();
                    Display.class.getMethod("getRealSize", new Class[]{Point.class}).invoke(defaultDisplay, new Object[]{point});
                    i = point.x;
                    i2 = point.y;
                } catch (Exception unused2) {
                }
            }
            iArr[0] = i;
            iArr[1] = i2;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    /* renamed from: c */
    public static int m12877c(Context context) {
        m12849a(context);
        return f9981d;
    }

    /* renamed from: d */
    public static int m12881d(Context context) {
        m12849a(context);
        return f9982e;
    }

    /* renamed from: e */
    public static float m12885e(Context context) {
        m12849a(context);
        return f9978a;
    }

    /* renamed from: f */
    public static float m12888f(Context context) {
        m12849a(context);
        return f9980c;
    }

    /* renamed from: g */
    public static int m12890g(Context context) {
        m12849a(context);
        return f9979b;
    }

    /* renamed from: a */
    public static void m12854a(View view, int i, int i2, int i3, int i4) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= i;
        rect.bottom += i2;
        rect.left -= i3;
        rect.right += i4;
        ((View) view.getParent()).setTouchDelegate(new C2897g(rect, view));
    }

    /* renamed from: a */
    public static int[] m12867a(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* renamed from: b */
    public static int[] m12875b(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* renamed from: c */
    public static int[] m12880c(View view) {
        if (view == null) {
            return null;
        }
        return new int[]{view.getWidth(), view.getHeight()};
    }

    /* renamed from: a */
    public static void m12853a(View view, int i) {
        if (view != null && view.getVisibility() != i && m12866a(i)) {
            view.setVisibility(i);
        }
    }

    /* renamed from: d */
    public static boolean m12884d(View view) {
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: a */
    public static void m12862a(TextView textView, CharSequence charSequence) {
        if (textView != null && !TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: b */
    public static void m12872b(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            m12857a(view, (ViewGroup.MarginLayoutParams) layoutParams, i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    private static void m12857a(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        if (view != null && marginLayoutParams != null) {
            if (marginLayoutParams.leftMargin != i || marginLayoutParams.topMargin != i2 || marginLayoutParams.rightMargin != i3 || marginLayoutParams.bottomMargin != i4) {
                if (i != -3) {
                    marginLayoutParams.leftMargin = i;
                }
                if (i2 != -3) {
                    marginLayoutParams.topMargin = i2;
                }
                if (i3 != -3) {
                    marginLayoutParams.rightMargin = i3;
                }
                if (i4 != -3) {
                    marginLayoutParams.bottomMargin = i4;
                }
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* renamed from: a */
    private static Bitmap m12846a(WebView webView) {
        Bitmap bitmap = null;
        try {
            Picture capturePicture = webView.capturePicture();
            bitmap = Bitmap.createBitmap(capturePicture.getWidth(), capturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            capturePicture.draw(new Canvas(bitmap));
            return bitmap;
        } catch (Throwable th) {
            th.printStackTrace();
            return bitmap;
        }
    }

    /* renamed from: e */
    public static void m12887e(final View view) {
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
            ofFloat.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    C3904y.m12853a(view, 8);
                    ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}).setDuration(0).start();
                }
            });
            ofFloat.setDuration(800);
            ofFloat.start();
        }
    }

    /* renamed from: f */
    public static void m12889f(View view) {
        if (view != null) {
            m12853a(view, 0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
            ofFloat.addListener(new AnimatorListenerAdapter() {
                public void onAnimationStart(Animator animator) {
                    super.onAnimationEnd(animator);
                }
            });
            ofFloat.setDuration(300);
            ofFloat.start();
        }
    }

    /* renamed from: e */
    public static int m12886e(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: h */
    public static int m12891h(Context context) {
        if (context == null) {
            context = C3513m.m10963a();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    /* renamed from: i */
    public static int m12892i(Context context) {
        if (context == null) {
            context = C3513m.m10963a();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics.widthPixels;
    }

    /* renamed from: j */
    public static float m12893j(Context context) {
        if (context == null) {
            context = C3513m.m10963a();
        }
        int identifier = context.getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return (float) context.getApplicationContext().getResources().getDimensionPixelSize(identifier);
        }
        return 0.0f;
    }

    /* renamed from: a */
    public static void m12848a(Activity activity) {
        if (activity != null) {
            try {
                if (Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) {
                    activity.getWindow().getDecorView().setSystemUiVisibility(8);
                } else if (Build.VERSION.SDK_INT >= 19) {
                    activity.getWindow().getDecorView().setSystemUiVisibility(3846);
                    activity.getWindow().addFlags(1792);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m12871b(Activity activity) {
        if (activity != null) {
            try {
                activity.getWindow().getDecorView().setSystemUiVisibility(1792);
                activity.getWindow().clearFlags(1792);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public static boolean m12879c(Activity activity) {
        if (m12883d(activity) || m12845a("ro.miui.notch", activity) == 1 || m12894k(activity) || m12898o(activity) || m12895l(activity) || m12896m(activity) || m12897n(activity)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m12883d(Activity activity) {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        DisplayCutout displayCutout = null;
        try {
            WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
            if (rootWindowInsets != null) {
                displayCutout = rootWindowInsets.getDisplayCutout();
            }
            if (displayCutout != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static int m12845a(String str, Activity activity) {
        if (!C3886o.m12684e()) {
            return 0;
        }
        try {
            Class<?> loadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
            return ((Integer) loadClass.getMethod("getInt", new Class[]{String.class, Integer.TYPE}).invoke(loadClass, new Object[]{new String(str), new Integer(0)})).intValue();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return 0;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            return 0;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return 0;
        } catch (IllegalArgumentException e4) {
            e4.printStackTrace();
            return 0;
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m12894k(android.content.Context r3) {
        /*
            r0 = 0
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            java.lang.String r1 = "com.huawei.android.util.HwNotchSizeUtil"
            java.lang.Class r3 = r3.loadClass(r1)     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            java.lang.String r1 = "hasNotchInScreen"
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            java.lang.reflect.Method r1 = r3.getMethod(r1, r2)     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            java.lang.Object r3 = r1.invoke(r3, r2)     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            boolean r0 = r3.booleanValue()     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            goto L_0x0022
        L_0x0020:
            r3 = move-exception
            throw r3
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p178l.C3904y.m12894k(android.content.Context):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m12895l(android.content.Context r5) {
        /*
            r0 = 0
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            java.lang.String r1 = "android.util.FtFeature"
            java.lang.Class r5 = r5.loadClass(r1)     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            java.lang.String r1 = "isFeatureSupport"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            r3[r0] = r4     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            java.lang.reflect.Method r1 = r5.getMethod(r1, r3)     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            r3 = 32
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            r2[r0] = r3     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            java.lang.Object r5 = r1.invoke(r5, r2)     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            boolean r0 = r5.booleanValue()     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            goto L_0x002f
        L_0x002d:
            r5 = move-exception
            throw r5
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p178l.C3904y.m12895l(android.content.Context):boolean");
    }

    /* renamed from: m */
    public static boolean m12896m(Context context) {
        return Build.MODEL.equals("IN2010") || Build.MODEL.equals("IN2020") || Build.MODEL.equals("KB2000") || Build.MODEL.startsWith("ONEPLUS");
    }

    /* renamed from: n */
    public static boolean m12897n(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            String string = identifier > 0 ? resources.getString(identifier) : null;
            if (string == null || TextUtils.isEmpty(string)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: o */
    public static boolean m12898o(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    /* renamed from: a */
    public static void m12855a(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            C2905l.m8118e("OnclickListener ", str + " is null , can not set OnClickListener !!!");
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public static void m12856a(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            C2905l.m8118e("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    /* renamed from: a */
    public static void m12852a(View view, float f) {
        if (view != null) {
            view.setAlpha(f);
        }
    }

    /* renamed from: a */
    public static void m12861a(TextView textView, TTRatingBar2 tTRatingBar2, C3431n nVar, Context context) {
        m12860a(textView, tTRatingBar2, (nVar == null || nVar.mo19567aa() == null) ? -1.0d : nVar.mo19567aa().mo19409d(), context);
    }

    /* renamed from: a */
    public static void m12860a(TextView textView, TTRatingBar2 tTRatingBar2, double d, Context context) {
        if (d == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            tTRatingBar2.setVisibility(8);
            return;
        }
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f", new Object[]{Double.valueOf(d)}));
        }
        m12864a(tTRatingBar2, d, 0, 14);
    }

    /* renamed from: a */
    public static void m12864a(TTRatingBar2 tTRatingBar2, double d, int i, int i2) {
        if (d < 0.0d) {
            tTRatingBar2.setVisibility(8);
            return;
        }
        tTRatingBar2.setVisibility(0);
        tTRatingBar2.mo20422a(d, i, i2);
    }

    /* renamed from: a */
    public static void m12859a(TextView textView, C3431n nVar, Context context, String str) {
        m12858a(textView, nVar.mo19567aa() != null ? nVar.mo19567aa().mo19410e() : -1, context, str);
    }

    /* renamed from: a */
    public static void m12858a(TextView textView, int i, Context context, String str) {
        StringBuilder sb;
        String str2;
        String a = C2914t.m8151a(context, str);
        if (i > 10000) {
            sb = new StringBuilder();
            sb.append(i / 1000);
            str2 = CampaignEx.JSON_KEY_AD_K;
        } else {
            sb = new StringBuilder();
            sb.append(i);
            str2 = "";
        }
        sb.append(str2);
        textView.setText(String.format(a, new Object[]{sb.toString()}));
        if (i == -1) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public static Bitmap m12847a(SSWebView sSWebView) {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        WebView webView = sSWebView.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, (Paint) null);
        Bitmap b = m12869b(sSWebView);
        if (b == null) {
            b = m12846a(webView);
        }
        webView.setLayerType(layerType, (Paint) null);
        if (b == null) {
            return null;
        }
        return C2892d.m8073a(b, b.getWidth() / 6, b.getHeight() / 6);
    }

    /* renamed from: a */
    public static void m12863a(C3431n nVar, String str, String str2, Bitmap bitmap, String str3, long j) {
        final C3431n nVar2 = nVar;
        final String str4 = str;
        final String str5 = str2;
        final Bitmap bitmap2 = bitmap;
        final String str6 = str3;
        final long j2 = j;
        C2882e.m8042b(new C2885g("startCheckPlayableStatusPercentage") {
            public void run() {
                C3904y.m12878c(nVar2, str4, str5, bitmap2, str6, j2);
            }
        }, 5);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m12878c(C3431n nVar, String str, String str2, Bitmap bitmap, String str3, long j) {
        JSONObject jSONObject;
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                    if (!bitmap.isRecycled()) {
                        int a = m12844a(bitmap);
                        JSONObject jSONObject2 = null;
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("url", str3);
                            if (j != -1) {
                                jSONObject3.put("page_id", j);
                            }
                            jSONObject3.put("render_type", "h5");
                            int i = 0;
                            jSONObject3.put("render_type_2", 0);
                            jSONObject3.put("is_blank", a == 100 ? 1 : 0);
                            jSONObject3.put("is_playable", C3434p.m10489a(nVar) ? 1 : 0);
                            if (C3597a.m11391a().mo20169a(nVar)) {
                                i = 1;
                            }
                            jSONObject3.put("usecache", i);
                            jSONObject = new JSONObject();
                            try {
                                jSONObject.put("ad_extra_data", jSONObject3.toString());
                            } catch (JSONException unused) {
                                jSONObject2 = jSONObject;
                            }
                        } catch (JSONException unused2) {
                            jSONObject = jSONObject2;
                            C3090e.m8923c(C3513m.m10963a(), nVar, str, str2, jSONObject);
                        }
                        C3090e.m8923c(C3513m.m10963a(), nVar, str, str2, jSONObject);
                    }
                }
            } catch (Throwable th) {
                C2905l.m8118e("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>" + th.toString());
            }
        }
    }

    /* renamed from: b */
    private static Bitmap m12869b(SSWebView sSWebView) {
        if (sSWebView == null) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(sSWebView.getWidth(), sSWebView.getHeight(), Bitmap.Config.RGB_565);
            sSWebView.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static int m12844a(Bitmap bitmap) {
        try {
            ArrayList<Integer> b = m12870b(bitmap);
            if (b == null) {
                return -1;
            }
            HashMap hashMap = new HashMap();
            Iterator<Integer> it = b.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (hashMap.containsKey(next)) {
                    Integer valueOf = Integer.valueOf(((Integer) hashMap.get(next)).intValue() + 1);
                    hashMap.remove(next);
                    hashMap.put(next, valueOf);
                } else {
                    hashMap.put(next, 1);
                }
            }
            int i = 0;
            int i2 = 0;
            for (Map.Entry entry : hashMap.entrySet()) {
                int intValue = ((Integer) entry.getValue()).intValue();
                if (i2 < intValue) {
                    i = ((Integer) entry.getKey()).intValue();
                    i2 = intValue;
                }
            }
            if (i == 0) {
                return -1;
            }
            return (int) ((((float) i2) / (((float) (bitmap.getWidth() * bitmap.getHeight())) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: b */
    private static ArrayList<Integer> m12870b(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = width * height;
            int[] iArr = new int[i];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = iArr[i2];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i3) >> 16, (65280 & i3) >> 8, i3 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }
}
