package com.inmobi.media;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.view.ViewCompat;
import com.google.common.net.HttpHeaders;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C5961ee;
import com.inmobi.media.C5963ef;
import com.inmobi.media.C5991eu;
import com.inmobi.media.C6074ft;
import com.inmobi.media.C6234j;
import com.inmobi.media.C6262jp;
import com.inmobi.media.C6328z;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.smaato.sdk.video.vast.model.C11130Ad;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.q */
/* compiled from: RenderView */
public final class C6301q extends WebView implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, C5902cz, C6234j, C6262jp.C6267a, C6279l, C6328z.C6329a {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static final String f15887A = C6301q.class.getSimpleName();

    /* renamed from: a */
    public static final C6321s f15888a = new C6321s() {
        /* renamed from: a */
        public final void mo34421a(C6173ho hoVar) {
        }

        /* renamed from: c_ */
        public final C6268jq mo34455c_() {
            return C6268jq.m18631a();
        }
    };

    /* renamed from: aC */
    private static final C5961ee.C5962a f15889aC = new C5961ee.C5962a() {

        /* renamed from: a */
        private long f15988a;

        /* renamed from: a */
        public final boolean mo35087a(View view) {
            View view2 = view;
            if (!(view2 instanceof C6301q)) {
                return false;
            }
            C6301q qVar = (C6301q) view2;
            Rect rect = new Rect();
            if (qVar.getGlobalVisibleRect(rect) && rect.intersect(qVar.getAdFrameRect())) {
                Bitmap createBitmap = Bitmap.createBitmap(qVar.getWidth(), qVar.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, new Paint());
                qVar.draw(canvas);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, C6215il.m18449b(qVar.getWidth()), C6215il.m18449b(qVar.getHeight()), true);
                int i = qVar.f15929an[0];
                int i2 = qVar.f15929an[1];
                int i3 = qVar.f15929an[2] + i;
                int i4 = qVar.f15929an[3] + i2;
                Bitmap bitmap = null;
                if (i < createScaledBitmap.getWidth() && i2 < createScaledBitmap.getHeight()) {
                    if (i < 0) {
                        i = 0;
                    }
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    if (i3 > createScaledBitmap.getWidth()) {
                        i3 = createScaledBitmap.getWidth();
                    }
                    if (i4 > createScaledBitmap.getHeight()) {
                        i4 = createScaledBitmap.getHeight();
                    }
                    bitmap = Bitmap.createBitmap(createScaledBitmap, i, i2, Math.max(i3 - i, 0), Math.max(i4 - i2, 0));
                }
                Bitmap bitmap2 = bitmap;
                if (bitmap2 == null) {
                    return false;
                }
                int width = bitmap2.getWidth() * bitmap2.getHeight();
                int[] iArr = new int[width];
                bitmap2.getPixels(iArr, 0, bitmap2.getWidth(), 0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                int i5 = 0;
                for (int i6 = 0; i6 < width; i6++) {
                    int i7 = iArr[i6];
                    if (i7 > -16777216 && i7 < 0 && (i5 = i5 + 1) >= qVar.f15931ap) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo35104a(View view, View view2, int i, Object obj) {
            if (!(view2 == null || view2.getVisibility() != 0 || view == null || view.getParent() == null || !view2.isShown())) {
                C6301q qVar = null;
                if (view2 instanceof C6301q) {
                    qVar = (C6301q) view2;
                }
                if (qVar == null) {
                    return false;
                }
                if (qVar.getPlacementType() != 1 && (qVar.getHeight() <= 0 || qVar.getWidth() <= 0)) {
                    return false;
                }
                Rect rect = new Rect();
                if (!qVar.getGlobalVisibleRect(rect)) {
                    return false;
                }
                this.f15988a = ((long) rect.height()) * ((long) rect.width());
                if (qVar.getPlacementType() == 1) {
                    long unused = qVar.f15930ao = (long) (qVar.getWidth() * qVar.getHeight());
                }
                if (qVar.f15930ao <= 0 || this.f15988a * 100 < ((long) i) * qVar.f15930ao) {
                    return false;
                }
                return true;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0078 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x007c A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo35103a(android.view.View r11, android.view.View r12, int r13) {
            /*
                r10 = this;
                android.view.ViewParent r0 = r11.getParent()
                boolean r0 = r0 instanceof android.view.ViewGroup
                if (r0 == 0) goto L_0x000f
                android.view.ViewParent r0 = r11.getParent()
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                goto L_0x0010
            L_0x000f:
                r0 = 0
            L_0x0010:
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x001d
                boolean r3 = r10.mo35103a(r0, r12, r13)
                if (r3 == 0) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r3 = r1
                goto L_0x001e
            L_0x001d:
                r3 = r2
            L_0x001e:
                if (r0 == 0) goto L_0x007f
                int r11 = r0.indexOfChild(r11)
                int r11 = r11 + r2
            L_0x0025:
                int r4 = r0.getChildCount()
                if (r11 >= r4) goto L_0x007f
                android.view.View r4 = r0.getChildAt(r11)
                int r5 = r4.getVisibility()
                if (r5 != 0) goto L_0x007c
                boolean r5 = r12 instanceof com.inmobi.media.C6301q
                if (r5 != 0) goto L_0x003b
            L_0x0039:
                r4 = r2
                goto L_0x0076
            L_0x003b:
                android.graphics.Rect r5 = new android.graphics.Rect
                r5.<init>()
                android.graphics.Rect r6 = new android.graphics.Rect
                r6.<init>()
                r12.getGlobalVisibleRect(r5)
                r4.getGlobalVisibleRect(r6)
                boolean r4 = r6.intersect(r5)
                int r5 = r6.width()
                int r6 = r6.height()
                int r5 = r5 * r6
                if (r4 == 0) goto L_0x0075
                int r5 = r5 * 100
                long r4 = (long) r5
                long r6 = r10.f15988a
                r8 = 100
                long r6 = r6 * r8
                long r4 = r4 - r6
                long r4 = java.lang.Math.abs(r4)
                r6 = r12
                com.inmobi.media.q r6 = (com.inmobi.media.C6301q) r6
                long r6 = r6.f15930ao
                long r8 = (long) r13
                long r6 = r6 * r8
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 >= 0) goto L_0x0075
                goto L_0x0039
            L_0x0075:
                r4 = r1
            L_0x0076:
                if (r4 == 0) goto L_0x007c
                java.lang.String unused = com.inmobi.media.C6301q.f15887A
                return r1
            L_0x007c:
                int r11 = r11 + 1
                goto L_0x0025
            L_0x007f:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6301q.C63177.mo35103a(android.view.View, android.view.View, int):boolean");
        }
    };

    /* renamed from: B */
    private byte f15890B = 0;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C6301q f15891C = null;

    /* renamed from: D */
    private WeakReference<ViewGroup> f15892D;

    /* renamed from: E */
    private C6321s f15893E;

    /* renamed from: F */
    private C6074ft f15894F;

    /* renamed from: G */
    private boolean f15895G;

    /* renamed from: H */
    private C5904da f15896H;

    /* renamed from: I */
    private C5922dh f15897I;

    /* renamed from: J */
    private JSONObject f15898J;

    /* renamed from: K */
    private JSONObject f15899K;

    /* renamed from: L */
    private boolean f15900L = true;

    /* renamed from: M */
    private final Object f15901M = new Object();

    /* renamed from: N */
    private final Object f15902N = new Object();

    /* renamed from: O */
    private boolean f15903O = true;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public View f15904P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public WebChromeClient.CustomViewCallback f15905Q;

    /* renamed from: R */
    private int f15906R = -1;

    /* renamed from: S */
    private boolean f15907S = false;

    /* renamed from: T */
    private long f15908T = Long.MIN_VALUE;

    /* renamed from: U */
    private String f15909U;

    /* renamed from: V */
    private String f15910V;

    /* renamed from: W */
    private C6234j f15911W;

    /* renamed from: aA */
    private final C6177hs f15912aA = new C6177hs() {
        /* renamed from: a */
        public final void mo35387a() {
            C6301q.this.getListener().mo34435a_();
        }

        /* renamed from: a */
        public final void mo35389a(String str, String str2, String str3) {
            C6301q.this.mo35582b(str, str2, str3);
        }

        /* renamed from: b */
        public final void mo35390b(String str, String str2, String str3) {
            C6301q.this.mo35585c(str, str2, str3);
        }

        /* renamed from: b */
        public final void mo35393b() {
            if (!C6301q.this.f15957q.get()) {
                C6301q.this.getListener().mo34443b(new HashMap());
            }
        }

        /* renamed from: c */
        public final void mo35394c(String str, String str2, String str3) {
            if (!C6301q.this.f15957q.get()) {
                mo35389a(str, str2, str3);
            }
        }

        /* renamed from: a */
        public final void mo35388a(Intent intent) {
            InMobiAdActivity.m23148a(C6301q.this);
            C6183hw.m18313a(C6301q.this.getContainerContext(), intent);
        }
    };

    /* renamed from: aB */
    private final C5963ef.C5965a f15913aB = new C5963ef.C5965a() {
        /* renamed from: a */
        public final void mo35096a(View view, Object obj) {
            if (view instanceof C6301q) {
                C6301q.this.mo35627h();
            }
        }
    };

    /* renamed from: aD */
    private final C6234j.C6235a f15914aD = new C6234j.C6235a() {
        /* renamed from: a */
        public final void mo35461a() {
            String unused = C6301q.f15887A;
            C6301q.this.getListener().mo34403a();
        }

        /* renamed from: a */
        public final void mo35462a(Object obj) {
            String unused = C6301q.f15887A;
            if (C6301q.this.f15945e == 0) {
                if (C6301q.this.f15891C != null) {
                    C6301q.this.f15891C.setAndUpdateViewState("Expanded");
                } else {
                    C6301q.this.setAndUpdateViewState("Expanded");
                }
                boolean unused2 = C6301q.this.f15958r = false;
            }
            C6301q.this.getListener().mo34552a_(C6301q.this);
        }

        /* renamed from: b */
        public final void mo35463b(Object obj) {
            String unused = C6301q.f15887A;
            if (C6301q.this.f15945e == 0) {
                C6301q.this.setAndUpdateViewState("Default");
                if (C6301q.this.f15891C != null) {
                    C6301q.this.f15891C.setAndUpdateViewState("Default");
                }
            } else if ("Default".equals(C6301q.this.f15944d)) {
                C6301q.this.setAndUpdateViewState("Hidden");
            }
            C6301q.this.getListener().mo34558b_(C6301q.this);
        }
    };

    /* renamed from: aE */
    private final WebChromeClient f15915aE = new WebChromeClient() {
        public final boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
            String unused = C6301q.f15887A;
            if (!C6301q.m18836a(C6301q.this, jsResult)) {
                return true;
            }
            Activity fullScreenActivity = C6301q.this.getFullScreenActivity();
            if (fullScreenActivity != null) {
                new AlertDialog.Builder(fullScreenActivity).setMessage(str2).setTitle(str).setPositiveButton(17039370, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        jsResult.confirm();
                    }
                }).setCancelable(false).create().show();
                return true;
            }
            jsResult.cancel();
            return true;
        }

        public final boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
            String unused = C6301q.f15887A;
            if (!C6301q.m18836a(C6301q.this, jsResult)) {
                return true;
            }
            Activity fullScreenActivity = C6301q.this.getFullScreenActivity();
            if (fullScreenActivity != null) {
                new AlertDialog.Builder(fullScreenActivity).setMessage(str2).setPositiveButton(17039370, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        jsResult.confirm();
                    }
                }).setNegativeButton(17039360, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        jsResult.cancel();
                    }
                }).create().show();
                return true;
            }
            jsResult.cancel();
            return true;
        }

        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            String unused = C6301q.f15887A;
            if (!C6301q.m18836a(C6301q.this, (JsResult) jsPromptResult)) {
                return true;
            }
            if (C6301q.this.getFullScreenActivity() != null) {
                return false;
            }
            jsPromptResult.cancel();
            return true;
        }

        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (C6301q.this.f15942b != null && C6301q.this.f15942b.get() != null) {
                View unused = C6301q.this.f15904P = view;
                WebChromeClient.CustomViewCallback unused2 = C6301q.this.f15905Q = customViewCallback;
                C6301q.this.f15904P.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return true;
                    }
                });
                C6301q.this.f15904P.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                ((FrameLayout) ((Activity) C6301q.this.f15942b.get()).findViewById(16908290)).addView(C6301q.this.f15904P, new AbsoluteLayout.LayoutParams(-1, -1, 0, 0));
                C6301q.this.f15904P.requestFocus();
                View m = C6301q.this.f15904P;
                m.setOnKeyListener(new View.OnKeyListener() {
                    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                        if (4 != keyEvent.getKeyCode() || keyEvent.getAction() != 0) {
                            return false;
                        }
                        String unused = C6301q.f15887A;
                        C630310.this.m18895a();
                        return true;
                    }
                });
                m.setFocusable(true);
                m.setFocusableInTouchMode(true);
                m.requestFocus();
            }
        }

        public final void onHideCustomView() {
            m18895a();
            super.onHideCustomView();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m18895a() {
            if (C6301q.this.f15904P != null) {
                if (C6301q.this.f15905Q != null) {
                    C6301q.this.f15905Q.onCustomViewHidden();
                    WebChromeClient.CustomViewCallback unused = C6301q.this.f15905Q = null;
                }
                if (C6301q.this.f15904P != null && C6301q.this.f15904P.getParent() != null) {
                    ((ViewGroup) C6301q.this.f15904P.getParent()).removeView(C6301q.this.f15904P);
                    View unused2 = C6301q.this.f15904P = null;
                }
            }
        }

        public final void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
            if (!(C6301q.this.f15942b == null || C6301q.this.f15942b.get() == null)) {
                new AlertDialog.Builder((Context) C6301q.this.f15942b.get()).setTitle("Location Permission").setMessage("Allow location access").setPositiveButton(17039370, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        callback.invoke(str, true, false);
                    }
                }).setNegativeButton(17039360, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        callback.invoke(str, false, false);
                    }
                }).create().show();
            }
            super.onGeolocationPermissionsShowPrompt(str, callback);
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            consoleMessage.message();
            consoleMessage.lineNumber();
            consoleMessage.sourceId();
            String unused = C6301q.f15887A;
            return true;
        }
    };

    /* renamed from: aa */
    private boolean f15916aa = false;

    /* renamed from: ab */
    private long f15917ab = -1;

    /* renamed from: ac */
    private String f15918ac = TJAdUnitConstants.String.HTML;

    /* renamed from: ad */
    private C5977el f15919ad;

    /* renamed from: ae */
    private C5963ef f15920ae;

    /* renamed from: af */
    private final Set<C5951dx> f15921af;

    /* renamed from: ag */
    private C5953dz f15922ag;

    /* renamed from: ah */
    private boolean f15923ah;

    /* renamed from: ai */
    private boolean f15924ai;

    /* renamed from: aj */
    private boolean f15925aj = true;

    /* renamed from: ak */
    private int f15926ak;

    /* renamed from: al */
    private int f15927al;

    /* renamed from: am */
    private String f15928am;
    /* access modifiers changed from: private */

    /* renamed from: an */
    public int[] f15929an;
    /* access modifiers changed from: private */

    /* renamed from: ao */
    public long f15930ao;
    /* access modifiers changed from: private */

    /* renamed from: ap */
    public int f15931ap;

    /* renamed from: aq */
    private int f15932aq = Integer.MIN_VALUE;

    /* renamed from: ar */
    private int f15933ar = Integer.MIN_VALUE;

    /* renamed from: as */
    private final C6328z f15934as;

    /* renamed from: at */
    private final GestureDetector f15935at;
    /* access modifiers changed from: private */

    /* renamed from: au */
    public C6280m f15936au;

    /* renamed from: av */
    private C5921dg f15937av;

    /* renamed from: aw */
    private final C6320r f15938aw = new C6320r();

    /* renamed from: ax */
    private C6325w f15939ax;

    /* renamed from: ay */
    private String f15940ay = "DEFAULT";

    /* renamed from: az */
    private final C6004f f15941az = new C6004f() {
        /* renamed from: a */
        public final void mo35143a(String str) {
            C6301q.this.f15936au.mo35513a(str);
        }

        /* renamed from: a */
        public final void mo35142a() {
            String unused = C6301q.f15887A;
            C6301q.this.getListener().mo34552a_(C6301q.this);
            C6301q.this.mo35585c((String) null, (String) null, (String) null);
        }

        /* renamed from: b */
        public final void mo35144b() {
            String unused = C6301q.f15887A;
            C6301q.this.getListener().mo34558b_(C6301q.this);
        }
    };

    /* renamed from: b */
    public WeakReference<Activity> f15942b = new WeakReference<>((Object) null);

    /* renamed from: c */
    boolean f15943c = false;

    /* renamed from: d */
    public String f15944d = "Default";

    /* renamed from: e */
    public byte f15945e;

    /* renamed from: f */
    public C5909dc f15946f;

    /* renamed from: g */
    public C5919df f15947g;

    /* renamed from: h */
    public C5912de f15948h;

    /* renamed from: i */
    public boolean f15949i;

    /* renamed from: j */
    public boolean f15950j = true;

    /* renamed from: k */
    public boolean f15951k = true;

    /* renamed from: l */
    public boolean f15952l = false;

    /* renamed from: m */
    public boolean f15953m = false;

    /* renamed from: n */
    public boolean f15954n = false;

    /* renamed from: o */
    public boolean f15955o = false;

    /* renamed from: p */
    public String f15956p = null;

    /* renamed from: q */
    public AtomicBoolean f15957q = new AtomicBoolean(false);

    /* renamed from: r */
    public boolean f15958r;

    /* renamed from: s */
    public String f15959s;

    /* renamed from: t */
    public C5742ak f15960t;

    /* renamed from: u */
    public boolean f15961u;

    /* renamed from: v */
    public C6278k f15962v;

    /* renamed from: w */
    public boolean f15963w = false;

    /* renamed from: x */
    public String f15964x;

    /* renamed from: y */
    public final C5816bj f15965y = new C5816bj() {
        /* renamed from: a */
        public final void mo34773a(C5786ay ayVar, byte b) {
            if (ayVar.f14545f != null && ayVar.f14540a.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", ayVar.f14540a.get(0).f14523d);
                    jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, ayVar.f14540a.get(0).f14531l);
                } catch (JSONException unused) {
                }
                String unused2 = C6301q.f15887A;
                C6301q.this.mo35579a(ayVar.f14545f, "sendSaveContentResult(\"saveContent_" + ayVar.f14546g + "\", 'failed', \"" + jSONObject.toString().replace("\"", "\\\"") + "\");");
            }
        }

        /* renamed from: a */
        public final void mo34772a(C5786ay ayVar) {
            if (ayVar.f14545f != null && ayVar.f14540a.size() > 0) {
                String unused = C6301q.f15887A;
                C6301q.this.mo35579a(ayVar.f14545f, "sendSaveContentResult(\"saveContent_" + ayVar.f14546g + "\", 'success', \"" + ayVar.f14540a.get(0).f14530k + "\");");
            }
        }
    };

    /* renamed from: z */
    private Map<String, C6166hj> f15966z;

    public final Object getDataModel() {
        return null;
    }

    public final View getVideoContainerView() {
        return null;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    /* renamed from: a */
    public final void mo35577a(C6328z zVar) {
        if (getRenderingConfig().gestures.contains(2)) {
            zVar.f16015h.length();
            mo35588d("window.imraidview.onGestureDetected('2', '" + zVar.f16015h.toString() + "');");
        }
    }

    /* renamed from: a */
    public final void mo35574a(MotionEvent motionEvent) {
        if (getRenderingConfig().gestures.contains(4)) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONArray(Arrays.asList(new Float[]{Float.valueOf((motionEvent.getX() + motionEvent.getX(1)) / 2.0f), Float.valueOf((motionEvent.getY() + motionEvent.getY(1)) / 2.0f)})));
            mo35588d("window.imraidview.onGestureDetected('4', '" + jSONArray.toString() + "');");
        }
    }

    /* renamed from: a */
    public final void mo35575a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (getRenderingConfig().gestures.contains(3)) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONArray(Arrays.asList(new Float[]{Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY())})));
            jSONArray.put(new JSONArray(Arrays.asList(new Float[]{Float.valueOf(motionEvent.getX(1)), Float.valueOf(motionEvent.getY(1))})));
            jSONArray.put(new JSONArray(Arrays.asList(new Float[]{Float.valueOf(motionEvent2.getX()), Float.valueOf(motionEvent2.getY())})));
            jSONArray.put(new JSONArray(Arrays.asList(new Float[]{Float.valueOf(motionEvent2.getX(1)), Float.valueOf(motionEvent2.getY(1))})));
            mo35588d("window.imraidview.onGestureDetected('3', '" + jSONArray.toString() + "');");
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f15917ab = SystemClock.elapsedRealtime();
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        if (getRenderingConfig().gestures.contains(5)) {
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray.put((double) motionEvent.getX());
                jSONArray.put((double) motionEvent.getY());
            } catch (JSONException unused) {
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONArray);
            mo35588d("window.imraidview.onGestureDetected('5', '" + jSONArray2.toString() + "');");
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!getRenderingConfig().gestures.contains(0)) {
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put((double) motionEvent.getX());
            jSONArray.put((double) motionEvent.getY());
        } catch (JSONException unused) {
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        mo35588d("window.imraidview.onGestureDetected('0', '" + jSONArray2.toString() + "');");
        return false;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (!getRenderingConfig().gestures.contains(1)) {
            return false;
        }
        this.f15917ab = SystemClock.elapsedRealtime();
        if (motionEvent.getAction() == 1) {
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray.put((double) motionEvent.getX());
                jSONArray.put((double) motionEvent.getY());
            } catch (JSONException unused) {
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONArray);
            mo35588d("window.imraidview.onGestureDetected('1', '" + jSONArray2.toString() + "');");
        }
        return false;
    }

    public C6301q(Context context, byte b, Set<C5951dx> set, String str, Boolean bool, String str2) {
        super(context.getApplicationContext());
        boolean z = false;
        this.f15945e = b;
        this.f15958r = false;
        this.f15921af = set;
        this.f15959s = str;
        setReferenceContainer(this);
        this.f15911W = this;
        this.f15924ai = true;
        this.f15943c = bool.booleanValue();
        this.f15940ay = str2;
        this.f15934as = new C6328z(this);
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.f15935at = gestureDetector;
        gestureDetector.setOnDoubleTapListener(this);
        this.f15935at.setIsLongpressEnabled(b == 1 ? true : z);
        this.f15937av = new C5921dg();
    }

    public final void setAdPodHandler(C6278k kVar) {
        this.f15962v = kVar;
    }

    public final C6278k getAdPodHandler() {
        return this.f15962v;
    }

    public final void setAdSize(String str) {
        this.f15909U = str;
        this.f15927al = C6215il.m18443a(Integer.parseInt(str.split("x")[0]));
        int a = C6215il.m18443a(Integer.parseInt(str.split("x")[1]));
        this.f15926ak = a;
        this.f15930ao = (long) (a * this.f15927al);
    }

    public final void setIsPreload(boolean z) {
        this.f15961u = z;
    }

    public final void setPlacementId(long j) {
        this.f15908T = j;
    }

    public final void setImpressionId(String str) {
        this.f15959s = str;
    }

    public final void setCreativeId(String str) {
        this.f15910V = str;
    }

    public final void setAllowAutoRedirection(boolean z) {
        this.f15916aa = z;
    }

    public final void setBlobProvider(C5742ak akVar) {
        this.f15960t = akVar;
    }

    public final String getImpressionId() {
        return this.f15959s;
    }

    public final String getCreativeId() {
        return this.f15910V;
    }

    public final long getPlacementId() {
        return this.f15908T;
    }

    public final boolean getAllowAutoRedirection() {
        return this.f15916aa;
    }

    public final void setOriginalRenderView(C6301q qVar) {
        this.f15891C = qVar;
    }

    public final C6301q getOriginalRenderView() {
        return this.f15891C;
    }

    public final C6234j.C6235a getFullScreenEventsListener() {
        return this.f15914aD;
    }

    public final byte getPlacementType() {
        return this.f15945e;
    }

    public final String getState() {
        return this.f15944d;
    }

    public final Object getDefaultPositionMonitor() {
        return this.f15901M;
    }

    public final Object getCurrentPositionMonitor() {
        return this.f15902N;
    }

    public final void setShouldFireRenderBeacon(boolean z) {
        this.f15925aj = z;
    }

    public final String getContentUrl() {
        return this.f15928am;
    }

    public final void setContentUrl(String str) {
        this.f15928am = str;
    }

    public final Context getContainerContext() {
        WeakReference<Activity> weakReference = this.f15942b;
        if (weakReference == null || weakReference.get() == null) {
            return getContext();
        }
        return (Context) this.f15942b.get();
    }

    public final C6173ho getTelemetryOnAdImpression() {
        Map<String, C6166hj> telemetryManagerMap = getTelemetryManagerMap();
        return new C6173ho(telemetryManagerMap != null ? telemetryManagerMap.get("AdImpressionSuccessful") : null, getCreativeId(), getMarkupType());
    }

    public final Map<String, C6166hj> getTelemetryManagerMap() {
        return this.f15966z;
    }

    public final void setTelemetryManagerMap(Map<String, C6166hj> map) {
        this.f15966z = map;
    }

    /* renamed from: d */
    public final void mo35587d() {
        int[] iArr = new int[2];
        this.f15898J = new JSONObject();
        if (this.f15892D == null) {
            this.f15892D = new WeakReference<>((ViewGroup) getParent());
        }
        if (this.f15892D.get() != null) {
            ((ViewGroup) this.f15892D.get()).getLocationOnScreen(iArr);
            try {
                this.f15898J.put("x", C6215il.m18449b(iArr[0]));
                this.f15898J.put("y", C6215il.m18449b(iArr[1]));
                int b = C6215il.m18449b(((ViewGroup) this.f15892D.get()).getWidth());
                int b2 = C6215il.m18449b(((ViewGroup) this.f15892D.get()).getHeight());
                this.f15898J.put("width", b);
                this.f15898J.put("height", b2);
            } catch (JSONException unused) {
            }
        } else {
            this.f15898J.put("x", 0);
            this.f15898J.put("y", 0);
            this.f15898J.put("width", 0);
            this.f15898J.put("height", 0);
        }
        synchronized (this.f15901M) {
            this.f15950j = false;
            this.f15901M.notifyAll();
        }
    }

    public final String getDefaultPosition() {
        JSONObject jSONObject = this.f15898J;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    /* renamed from: e */
    public final void mo35590e() {
        this.f15899K = new JSONObject();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        try {
            this.f15899K.put("x", C6215il.m18449b(iArr[0]));
            this.f15899K.put("y", C6215il.m18449b(iArr[1]));
            int b = C6215il.m18449b(getWidth());
            int b2 = C6215il.m18449b(getHeight());
            this.f15899K.put("width", b);
            this.f15899K.put("height", b2);
        } catch (JSONException unused) {
        }
        synchronized (this.f15902N) {
            this.f15951k = false;
            this.f15902N.notifyAll();
        }
    }

    public final String getCurrentPosition() {
        JSONObject jSONObject = this.f15899K;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public final void setFullScreenActivityContext(Activity activity) {
        this.f15942b = new WeakReference<>(activity);
        m18855n();
    }

    /* renamed from: n */
    private void m18855n() {
        Activity activity = (Activity) this.f15942b.get();
        if (activity instanceof InMobiAdActivity) {
            ((InMobiAdActivity) activity).mo56274a(this.f15937av);
        }
    }

    public final void setEmbeddedBrowserJSCallbacks(C6325w wVar) {
        this.f15939ax = wVar;
    }

    /* renamed from: a */
    public final void mo34980a(C5923di diVar) {
        if ("Resized".equals(this.f15944d) && getResizeProperties() != null) {
            this.f15947g.mo35026a();
        }
    }

    public final Activity getFullScreenActivity() {
        WeakReference<Activity> weakReference = this.f15942b;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public final C6074ft.C6087i getRenderingConfig() {
        return this.f15894F.rendering;
    }

    public final C6074ft.C6085g getMraidConfig() {
        return this.f15894F.mraid;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != 0 && i2 != 0) {
            int b = C6215il.m18449b(i);
            int b2 = C6215il.m18449b(i2);
            mo35588d("window.mraidview.broadcastEvent('sizeChange'," + b + "," + b2 + ");");
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m18844f(i == 0);
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f15907S = !z;
        if (z) {
            z = isShown() && f15889aC.mo35104a(this, this, getAdConfig().viewability.web.impressionMinPercentageViewed, (Object) null) && f15889aC.mo35103a(this, this, getAdConfig().viewability.web.impressionMinPercentageViewed);
        }
        m18842e(z);
    }

    public final void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        if (i == 0) {
            m18842e(false);
        } else if (!this.f15907S) {
            m18842e(true);
        }
    }

    /* renamed from: e */
    private void m18842e(boolean z) {
        if (this.f15953m != z) {
            if (Build.VERSION.SDK_INT <= 23 || getFullScreenActivity() == null || !getFullScreenActivity().isInMultiWindowMode()) {
                m18844f(z);
            }
        }
    }

    /* renamed from: f */
    private void m18844f(boolean z) {
        if (this.f15953m != z && !this.f15958r) {
            this.f15953m = z;
            if (z) {
                getListener().mo34469f(this);
            }
            m18846g(this.f15953m);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15895G = isHardwareAccelerated();
        if (this.f15892D == null) {
            this.f15892D = new WeakReference<>((ViewGroup) getParent());
        }
        if (this.f15925aj && this.f15923ah) {
            C6262jp jpVar = new C6262jp(this, this);
            long b = (long) getListener().mo34455c_().mo35498b();
            C6262jp.C62631 r3 = new TimerTask() {
                public final void run(
/*
Method generation error in method: com.inmobi.media.jp.1.run():void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.jp.1.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            };
            View view = (View) jpVar.f15776a.get();
            if (view != null) {
                view.post(new Runnable(r3, b) {

                    /* renamed from: a */
                    final /* synthetic */ TimerTask f15781a;

                    /* renamed from: b */
                    final /* synthetic */ long f15782b;

                    public final void run(
/*
Method generation error in method: com.inmobi.media.jp.2.run():void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.jp.2.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                });
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        float f3;
        float f4;
        MotionEvent motionEvent2 = motionEvent;
        if (this.f15945e == 1) {
            C6328z zVar = this.f15934as;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                zVar.f16012e = motionEvent2.getPointerId(motionEvent.getActionIndex());
                zVar.f16015h = new JSONArray();
                zVar.f16015h.put(new JSONArray(Arrays.asList(new Float[]{Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY())})));
            } else if (actionMasked == 1) {
                zVar.f16012e = -1;
                if (zVar.f16015h.length() > 5) {
                    zVar.f16018k.mo35577a(zVar);
                    zVar.f16015h = new JSONArray();
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    zVar.f16012e = -1;
                    zVar.f16013f = -1;
                } else if (actionMasked == 5) {
                    zVar.f16013f = motionEvent2.getPointerId(motionEvent.getActionIndex());
                    zVar.f16016i = MotionEvent.obtain(motionEvent);
                    int findPointerIndex = motionEvent2.findPointerIndex(zVar.f16012e);
                    int findPointerIndex2 = motionEvent2.findPointerIndex(zVar.f16013f);
                    if (findPointerIndex >= 0) {
                        zVar.f16010c = motionEvent2.getX(findPointerIndex);
                        zVar.f16011d = motionEvent2.getY(findPointerIndex);
                    } else {
                        C6130gj a = C6130gj.m18161a();
                        a.mo35310a(new C6167hk(new IllegalArgumentException("Index for mPtrID1=" + zVar.f16012e + " is" + findPointerIndex + " | Pointer count=" + motionEvent.getPointerCount())));
                    }
                    if (findPointerIndex2 >= 0) {
                        zVar.f16008a = motionEvent2.getX(findPointerIndex2);
                        zVar.f16009b = motionEvent2.getY(findPointerIndex2);
                    } else {
                        C6130gj a2 = C6130gj.m18161a();
                        a2.mo35310a(new C6167hk(new IllegalArgumentException("Index for mPtrID2=" + zVar.f16013f + " is" + findPointerIndex2 + " | Pointer count=" + motionEvent.getPointerCount())));
                    }
                    zVar.f16017j = C6328z.m18948a(zVar.f16010c, zVar.f16008a, zVar.f16011d, zVar.f16009b);
                } else if (actionMasked == 6) {
                    zVar.f16013f = -1;
                    if (zVar.f16014g > 30.0f) {
                        zVar.f16018k.mo35575a(zVar.f16016i, motionEvent2);
                        zVar.f16014g = 0.0f;
                    }
                    if (Math.abs(C6328z.m18948a(motionEvent.getX(), motionEvent2.getX(1), motionEvent.getY(), motionEvent2.getY(1)) - zVar.f16017j) > 500) {
                        zVar.f16018k.mo35574a(motionEvent2);
                        zVar.f16017j = Integer.MAX_VALUE;
                    }
                }
            } else if (zVar.f16012e != -1 && zVar.f16013f != -1) {
                int findPointerIndex3 = motionEvent2.findPointerIndex(zVar.f16012e);
                int findPointerIndex4 = motionEvent2.findPointerIndex(zVar.f16013f);
                if (findPointerIndex3 >= 0) {
                    float x = motionEvent2.getX(findPointerIndex3);
                    f = motionEvent2.getY(findPointerIndex3);
                    f2 = x;
                } else {
                    C6130gj a3 = C6130gj.m18161a();
                    a3.mo35310a(new C6167hk(new IllegalArgumentException("Index for mPtrID1=" + zVar.f16012e + " is" + findPointerIndex3 + " | Pointer count=" + motionEvent.getPointerCount())));
                    f2 = 0.0f;
                    f = 0.0f;
                }
                if (findPointerIndex4 >= 0) {
                    float x2 = motionEvent2.getX(findPointerIndex4);
                    f3 = motionEvent2.getY(findPointerIndex4);
                    f4 = x2;
                } else {
                    C6130gj a4 = C6130gj.m18161a();
                    a4.mo35310a(new C6167hk(new IllegalArgumentException("Index for mPtrID1=" + zVar.f16013f + " is" + findPointerIndex4 + " | Pointer count=" + motionEvent.getPointerCount())));
                    f4 = 0.0f;
                    f3 = 0.0f;
                }
                zVar.f16014g = Math.abs(C6328z.m18947a(zVar.f16008a, zVar.f16009b, zVar.f16010c, zVar.f16011d, f4, f3, f2, f));
            } else if (zVar.f16012e != -1 && zVar.f16015h.length() > 0 && zVar.f16015h.length() < 50) {
                try {
                    float x3 = motionEvent.getX();
                    float y = motionEvent.getY();
                    JSONArray jSONArray = zVar.f16015h.getJSONArray(zVar.f16015h.length() - 1);
                    JSONArray jSONArray2 = new JSONArray(Arrays.asList(new Float[]{Float.valueOf(x3), Float.valueOf(y)}));
                    if (C6328z.m18948a((float) jSONArray.getInt(0), (float) jSONArray2.getInt(0), (float) jSONArray.getInt(1), (float) jSONArray2.getInt(1)) > 100) {
                        zVar.f16015h.put(jSONArray2);
                    }
                } catch (JSONException unused) {
                }
            }
        }
        this.f15935at.onTouchEvent(motionEvent2);
        return super.onTouchEvent(motionEvent);
    }

    public final void onDetachedFromWindow() {
        this.f15938aw.mo35691a();
        getMediaProcessor().mo35018b();
        getMediaProcessor().mo35019c();
        getMediaProcessor().mo35020e();
        try {
            super.onDetachedFromWindow();
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: o */
    private void m18856o() {
        m18859r();
        m18858q();
        m18857p();
    }

    /* renamed from: p */
    private void m18857p() {
        byte b;
        if (this.f15909U != null) {
            b = this.f15894F.viewability.banner.impressionType;
        } else {
            b = this.f15894F.viewability.interstitial.impressionType;
        }
        this.f15890B = b;
    }

    /* renamed from: q */
    private void m18858q() {
        if ("video".equals(this.f15964x)) {
            this.f15933ar = this.f15894F.viewability.video.impressionMinPercentageViewed;
        } else {
            this.f15933ar = this.f15894F.viewability.web.impressionMinPercentageViewed;
        }
    }

    /* renamed from: r */
    private void m18859r() {
        if ("video".equals(this.f15964x)) {
            this.f15932aq = this.f15894F.viewability.video.impressionMinTimeViewed;
        } else {
            this.f15932aq = this.f15894F.viewability.web.impressionMinTimeViewed;
        }
    }

    public final byte getImpressionType() {
        return this.f15890B;
    }

    /* renamed from: a */
    public final void mo35576a(C6321s sVar, C6074ft ftVar, boolean z, boolean z2) {
        int i;
        if (Build.VERSION.SDK_INT >= 21 && this.f15918ac.equals("htmlUrl")) {
            getSettings().setMixedContentMode(2);
        }
        this.f15894F = ftVar;
        if (this.f15921af == null) {
            m18856o();
        } else {
            try {
                m18856o();
                for (C5951dx next : this.f15921af) {
                    if (next.f15086a == 2) {
                        if (next.f15087b.containsKey("type")) {
                            this.f15890B = (byte) ((Integer) next.f15087b.get("type")).intValue();
                        } else {
                            m18857p();
                        }
                        if (next.f15087b.containsKey("time")) {
                            this.f15932aq = ((Integer) next.f15087b.get("time")).intValue();
                        } else {
                            m18859r();
                        }
                        if (next.f15087b.containsKey("view")) {
                            this.f15933ar = ((Integer) next.f15087b.get("view")).intValue();
                        } else {
                            m18858q();
                        }
                        if (getImpressionType() == 2) {
                            if (next.f15087b.containsKey("pixel")) {
                                this.f15931ap = ((Integer) next.f15087b.get("pixel")).intValue();
                            } else {
                                m18857p();
                            }
                            if (next.f15087b.containsKey("frame")) {
                                JSONArray jSONArray = (JSONArray) next.f15087b.get("frame");
                                this.f15929an = new int[jSONArray.length()];
                                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                    this.f15929an[i2] = ((Integer) jSONArray.get(i2)).intValue();
                                }
                            } else {
                                m18857p();
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
                m18856o();
            } catch (Exception unused2) {
                m18856o();
            }
        }
        this.f15936au = new C6280m(getContext(), new C6178ht(this.f15943c, this.f15940ay, this.f15894F.cctEnabled), this.f15941az, this.f15912aA);
        if ((getImpressionType() == 1 || getImpressionType() == 2) && !"video".equals(this.f15964x)) {
            this.f15919ad = new C5961ee(f15889aC, this.f15894F.viewability, getImpressionType());
            this.f15920ae = new C5963ef(this.f15894F.viewability, this.f15919ad, this.f15913aB);
        }
        this.f15893E = sVar;
        this.f15923ah = z;
        this.f15892D = new WeakReference<>((ViewGroup) getParent());
        this.f15925aj = z2;
        if (getRenderingConfig() != null) {
            setBackgroundColor(getRenderingConfig().mo35281a());
        }
        if (getMraidConfig() != null) {
            C5910dd ddVar = new C5910dd(getMraidConfig().url, getMraidConfig().maxRetries, getMraidConfig().retryInterval, getMraidConfig().expiry);
            if (ddVar.f14967a != null) {
                ddVar.f14968b = new C6156ha(ShareTarget.METHOD_GET, ddVar.f14967a);
                ddVar.f14968b.f15534o = false;
                ddVar.f14968b.f15539t = false;
                HashMap hashMap = new HashMap();
                hashMap.put(HttpHeaders.ACCEPT_ENCODING, "gzip");
                ddVar.f14968b.mo35338a((Map<String, String>) hashMap);
                new Thread(new Runnable() {
                    public final void run(
/*
Method generation error in method: com.inmobi.media.dd.1.run():void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.dd.1.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                }).start();
            }
        }
        if (Build.VERSION.SDK_INT >= 16) {
            setImportantForAccessibility(2);
        }
        setScrollable(false);
        if (Build.VERSION.SDK_INT >= 17) {
            getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        getSettings().setJavaScriptEnabled(true);
        getSettings().setGeolocationEnabled(true);
        C6320r rVar = this.f15938aw;
        if (this.f15945e == 0) {
            i = this.f15894F.rendering.bannerNetworkLoadsLimit;
        } else {
            i = this.f15894F.rendering.otherNetworkLoadsLimit;
        }
        rVar.f15993a = (short) i;
        setWebViewClient(this.f15938aw);
        setWebChromeClient(this.f15915aE);
        addJavascriptInterface(new C5880ct(this, this.f15945e), "sdkController");
        this.f15946f = new C5909dc(this, this.f15918ac);
        this.f15947g = new C5919df(this);
        this.f15948h = new C5912de(this);
        this.f15896H = new C5904da();
        this.f15897I = new C5922dh(C5922dh.DEFAULT_POSITION, Boolean.TRUE);
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = false;
        if (view instanceof C6301q) {
            if (i == 0) {
                z = true;
            }
            m18844f(z);
            return;
        }
        m18844f(false);
    }

    /* access modifiers changed from: private */
    public Rect getAdFrameRect() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i = iArr[0];
        int[] iArr2 = this.f15929an;
        int i2 = i + iArr2[0];
        int i3 = iArr[1] + iArr2[1];
        int[] iArr3 = this.f15929an;
        return new Rect(i2, i3, iArr3[2] + i2, iArr3[3] + i3);
    }

    public final void setScrollable(boolean z) {
        setScrollContainer(z);
        setVerticalScrollBarEnabled(z);
        setHorizontalScrollBarEnabled(z);
    }

    /* renamed from: c */
    public final boolean mo35451c() {
        return this.f15957q.get();
    }

    /* renamed from: f */
    public final void mo35592f() {
        super.destroy();
    }

    public final void destroy() {
        if (!this.f15957q.get()) {
            if (!this.f15900L) {
                this.f15900L = true;
                return;
            }
            this.f15957q.set(true);
            this.f15958r = true;
            this.f15906R = -1;
            removeJavascriptInterface("sdkController");
            WeakReference<Activity> weakReference = this.f15942b;
            if (weakReference != null) {
                weakReference.clear();
            }
            WeakReference<ViewGroup> weakReference2 = this.f15892D;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            C5953dz dzVar = this.f15922ag;
            if (dzVar != null) {
                dzVar.mo35075d();
                this.f15922ag.mo35076e();
            }
            this.f15939ax = null;
            this.f15893E = null;
            this.f15962v = null;
            this.f15911W = null;
            ViewParent parent = getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this);
                removeAllViews();
            }
            C6074ft.C6086h hVar = this.f15894F.viewability.omidConfig;
            if (!this.f15924ai || !hVar.omidEnabled || !C5991eu.C5992a.f15193a.mo35123a()) {
                super.destroy();
                return;
            }
            C6069fp fpVar = new C6069fp(this, hVar.webViewRetainTime);
            new Handler().postDelayed(new Runnable() {
                public final void run(
/*
Method generation error in method: com.inmobi.media.fs.1.run():void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.fs.1.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }, fpVar.f15391b);
        }
    }

    /* renamed from: a */
    public final void mo35449a(byte b, Map<String, String> map) {
        if (b == 2) {
            mo35588d("inmobi.recordEvent(120,null);");
        }
    }

    public final C6325w getEmbeddedBrowserJSCallbacks() {
        return this.f15939ax;
    }

    public final void setOrientationProperties(C5921dg dgVar) {
        this.f15937av = dgVar;
        m18855n();
    }

    public final C5921dg getOrientationProperties() {
        return this.f15937av;
    }

    public final void setReferenceContainer(C6234j jVar) {
        this.f15911W = jVar;
    }

    public final C6234j getReferenceContainer() {
        return this.f15911W;
    }

    public final C6074ft getAdConfig() {
        return this.f15894F;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.inmobi.media.eg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.inmobi.media.ea} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.inmobi.media.eg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: com.inmobi.media.eg} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.inmobi.media.C5953dz getViewableAd() {
        /*
            r8 = this;
            java.lang.String r0 = "deferred"
            com.inmobi.media.dz r1 = r8.f15922ag
            if (r1 != 0) goto L_0x00a0
            com.inmobi.media.ef r1 = r8.f15920ae
            if (r1 == 0) goto L_0x0039
            com.inmobi.media.eg r1 = new com.inmobi.media.eg
            com.inmobi.media.ef r4 = r8.f15920ae
            com.inmobi.media.ea r5 = new com.inmobi.media.ea
            r5.<init>(r8)
            int r2 = r8.f15933ar
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != r3) goto L_0x0023
            com.inmobi.media.ft r2 = r8.getAdConfig()
            com.inmobi.media.ft$m r2 = r2.viewability
            com.inmobi.media.ft$n r2 = r2.web
            int r2 = r2.impressionMinPercentageViewed
        L_0x0023:
            r6 = r2
            int r2 = r8.f15932aq
            if (r2 != r3) goto L_0x0032
            com.inmobi.media.ft r2 = r8.getAdConfig()
            com.inmobi.media.ft$m r2 = r2.viewability
            com.inmobi.media.ft$n r2 = r2.web
            int r2 = r2.impressionMinTimeViewed
        L_0x0032:
            r7 = r2
            r2 = r1
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x003e
        L_0x0039:
            com.inmobi.media.ea r1 = new com.inmobi.media.ea
            r1.<init>(r8)
        L_0x003e:
            r8.f15922ag = r1
            java.util.Set<com.inmobi.media.dx> r1 = r8.f15921af
            if (r1 == 0) goto L_0x00a0
            java.util.Iterator r1 = r1.iterator()
        L_0x0048:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00a0
            java.lang.Object r2 = r1.next()
            com.inmobi.media.dx r2 = (com.inmobi.media.C5951dx) r2
            byte r3 = r2.f15086a     // Catch:{ Exception -> 0x0048 }
            r4 = 3
            if (r3 == r4) goto L_0x005a
            goto L_0x0048
        L_0x005a:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.f15087b     // Catch:{ Exception -> 0x0048 }
            java.lang.String r4 = "omidAdSession"
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x0048 }
            com.inmobi.media.en r3 = (com.inmobi.media.C5983en) r3     // Catch:{ Exception -> 0x0048 }
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f15087b     // Catch:{ Exception -> 0x0048 }
            boolean r4 = r4.containsKey(r0)     // Catch:{ Exception -> 0x0048 }
            if (r4 == 0) goto L_0x007c
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f15087b     // Catch:{ Exception -> 0x0048 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ Exception -> 0x0048 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ Exception -> 0x0048 }
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x0048 }
            if (r4 == 0) goto L_0x007c
            r4 = 1
            goto L_0x007d
        L_0x007c:
            r4 = 0
        L_0x007d:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f15087b     // Catch:{ Exception -> 0x0048 }
            java.lang.String r5 = "customReferenceData"
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0048 }
            if (r4 == 0) goto L_0x0094
            java.lang.String r4 = r8.getContentUrl()     // Catch:{ Exception -> 0x0048 }
            com.iab.omid.library.inmobi.adsession.AdSessionContext r2 = com.inmobi.media.C5988er.m17818a((com.inmobi.media.C6301q) r8, (java.lang.String) r4, (java.lang.String) r2)     // Catch:{ Exception -> 0x0048 }
            r3.mo35118a((com.iab.omid.library.inmobi.adsession.AdSessionContext) r2)     // Catch:{ Exception -> 0x0048 }
        L_0x0094:
            if (r3 == 0) goto L_0x0048
            com.inmobi.media.er r2 = new com.inmobi.media.er     // Catch:{ Exception -> 0x0048 }
            com.inmobi.media.dz r4 = r8.f15922ag     // Catch:{ Exception -> 0x0048 }
            r2.<init>(r8, r4, r3)     // Catch:{ Exception -> 0x0048 }
            r8.f15922ag = r2     // Catch:{ Exception -> 0x0048 }
            goto L_0x0048
        L_0x00a0:
            com.inmobi.media.dz r0 = r8.f15922ag
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6301q.getViewableAd():com.inmobi.media.dz");
    }

    public final String getMarkupType() {
        return this.f15918ac;
    }

    public final void setMarkupType(String str) {
        this.f15918ac = str;
    }

    /* renamed from: a */
    public final void mo35578a(String str) {
        this.f15958r = false;
        if (!this.f15957q.get()) {
            loadDataWithBaseURL("", str, "text/html", "UTF-8", (String) null);
        }
    }

    /* renamed from: b */
    public final void mo35581b(String str) {
        this.f15958r = false;
        if (!this.f15957q.get()) {
            loadUrl(str);
        }
    }

    public final void stopLoading() {
        if (!this.f15957q.get()) {
            super.stopLoading();
        }
    }

    /* renamed from: a */
    public final void mo35580a(boolean z) {
        mo35588d("window.imraidview.broadcastEvent('adLoadSuccess'," + z + ");");
    }

    /* renamed from: g */
    public final void mo35593g() {
        HashMap hashMap = new HashMap();
        hashMap.put("creativeId", this.f15910V);
        hashMap.put("impressionId", getImpressionId());
        m18835a("NetworkLoadLimitExceeded", (Map<String, Object>) hashMap);
    }

    /* renamed from: g */
    private void m18846g(boolean z) {
        mo35588d("window.mraidview.broadcastEvent('viewableChange'," + z + ");");
    }

    /* renamed from: h */
    public final void mo35627h() {
        if (!"video".equals(this.f15964x)) {
            mo35588d("window.imraidview.impressionRendered();");
            getListener().mo34476i(this);
        }
    }

    /* renamed from: b */
    public final void mo35582b(String str, String str2, String str3) {
        if (str != null && str3 != null) {
            mo35579a(str, "broadcastEvent('error',\"" + str2 + "\", \"" + str3 + "\")");
        }
    }

    /* renamed from: a */
    public final void mo35579a(String str, String str2) {
        if (str != null) {
            mo35588d(str + "." + str2);
        }
    }

    /* renamed from: a */
    private void m18835a(String str, Map<String, Object> map) {
        getListener().mo34426a(str, map);
    }

    /* renamed from: d */
    public final void mo35588d(final String str) {
        new Handler(getContainerContext().getMainLooper()).postAtFrontOfQueue(new Runnable() {
            public final void run() {
                try {
                    if (!C6301q.this.f15957q.get()) {
                        String str = "javascript:try{" + str + "}catch(e){}";
                        String unused = C6301q.f15887A;
                        if (Build.VERSION.SDK_INT < 19) {
                            C6301q.this.loadUrl(str);
                        } else {
                            C6301q.this.evaluateJavascript(str, (ValueCallback) null);
                        }
                    }
                } catch (Exception unused2) {
                    String unused3 = C6301q.f15887A;
                }
            }
        });
    }

    public final void setUseCustomClose(boolean z) {
        this.f15952l = z;
    }

    public final void setCloseRegionDisabled(boolean z) {
        this.f15954n = z;
    }

    public final void setDisableBackButton(boolean z) {
        this.f15955o = z;
    }

    /* renamed from: b */
    public final void mo35583b(boolean z) {
        C5879cs csVar;
        setCloseRegionDisabled(z);
        View rootView = getRootView();
        if (rootView != null && (csVar = (C5879cs) rootView.findViewById(C6192i.f15630e)) != null) {
            csVar.setVisibility(this.f15954n ? 8 : 0);
        }
    }

    /* renamed from: c */
    public final void mo35586c(boolean z) {
        C5879cs csVar;
        setUseCustomClose(z);
        View rootView = getRootView();
        if (rootView != null && (csVar = (C5879cs) rootView.findViewById(C6192i.f15629d)) != null) {
            csVar.setVisibility(this.f15952l ? 8 : 0);
        }
    }

    /* renamed from: b */
    public final void mo35450b() {
        View view;
        View view2;
        View view3;
        View view4;
        ViewGroup viewGroup;
        View rootView;
        C5912de deVar = this.f15948h;
        ViewGroup viewGroup2 = null;
        if (deVar.f14975b != null) {
            deVar.f14975b.mo34993a();
            deVar.f14975b = null;
        }
        if ("Expanded".equals(this.f15944d)) {
            if (!"Default".equals(this.f15944d)) {
                this.f15958r = true;
                C5909dc dcVar = this.f15946f;
                if (!(dcVar.f14961a.getOriginalRenderView() != null || dcVar.f14963c == null || (rootView = dcVar.f14963c.getRootView()) == null)) {
                    View findViewById = rootView.findViewById(C6192i.f15626a);
                    ((ViewGroup) dcVar.f14961a.getParent()).removeView(dcVar.f14961a);
                    if (findViewById != null && (findViewById.getParent() instanceof ViewGroup)) {
                        viewGroup2 = (ViewGroup) findViewById.getParent();
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(findViewById);
                    }
                    dcVar.f14963c.addView(dcVar.f14961a, dcVar.f14964d, new RelativeLayout.LayoutParams(dcVar.f14963c.getWidth(), dcVar.f14963c.getHeight()));
                    dcVar.f14961a.m18861t();
                }
                m18860s();
                this.f15958r = false;
            }
            this.f15900L = false;
        } else if ("Resized".equals(this.f15944d)) {
            if (!"Default".equals(this.f15944d)) {
                this.f15958r = true;
                C5919df dfVar = this.f15947g;
                ViewGroup viewGroup3 = dfVar.f14990a.getParent() instanceof ViewGroup ? (ViewGroup) dfVar.f14990a.getParent() : null;
                if (viewGroup3 == null) {
                    view = null;
                } else {
                    view = viewGroup3.getRootView();
                }
                if (view == null) {
                    view2 = null;
                } else {
                    view2 = view.findViewById(C6192i.f15627b);
                }
                if (dfVar.f14991b == null) {
                    view3 = null;
                } else {
                    view3 = dfVar.f14991b.getRootView();
                }
                if (view3 == null) {
                    view4 = null;
                } else {
                    view4 = view3.findViewById(C6192i.f15626a);
                }
                if (view4 == null) {
                    viewGroup = null;
                } else {
                    viewGroup = (ViewGroup) view4.getParent();
                }
                if (view2 != null) {
                    viewGroup2 = (ViewGroup) view2.getParent();
                }
                if (viewGroup2 != null) {
                    viewGroup2.removeView(view2);
                }
                if (viewGroup != null) {
                    viewGroup.removeView(view4);
                }
                if (viewGroup3 != null) {
                    viewGroup3.removeView(dfVar.f14990a);
                }
                if (dfVar.f14991b != null) {
                    dfVar.f14991b.addView(dfVar.f14990a, dfVar.f14992c, new RelativeLayout.LayoutParams(dfVar.f14991b.getWidth(), dfVar.f14991b.getHeight()));
                }
                dfVar.f14990a.m18861t();
                setAndUpdateViewState("Default");
                getListener().mo34558b_(this);
                this.f15958r = false;
            }
        } else if ("Default".equals(this.f15944d)) {
            setAndUpdateViewState("Hidden");
            ViewParent parent = getParent();
            if (1 == this.f15945e) {
                m18860s();
            } else if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        C6278k kVar = this.f15962v;
        if (kVar != null && this.f15953m) {
            kVar.mo34422a(this, (Context) this.f15942b.get());
        }
        this.f15938aw.mo35691a();
    }

    /* renamed from: s */
    private void m18860s() {
        InMobiAdActivity.m23150a((Object) this);
        Activity fullScreenActivity = getFullScreenActivity();
        if (fullScreenActivity != null) {
            C6278k kVar = this.f15962v;
            if (kVar == null || !kVar.mo34446b(this)) {
                ((InMobiAdActivity) fullScreenActivity).f19592b = true;
                fullScreenActivity.finish();
                int i = this.f15906R;
                if (i != -1) {
                    fullScreenActivity.overridePendingTransition(0, i);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f15945e == 0) {
            setAndUpdateViewState("Default");
            C6301q qVar = this.f15891C;
            if (qVar != null) {
                qVar.setAndUpdateViewState("Default");
            }
        } else if ("Default".equals(this.f15944d)) {
            setAndUpdateViewState("Hidden");
        }
        getListener().mo34558b_(this);
    }

    public final void setExitAnimation(int i) {
        this.f15906R = i;
    }

    public final void setRenderViewEventListener(C6321s sVar) {
        this.f15893E = sVar;
    }

    public final C6321s getListener() {
        C6321s sVar = this.f15893E;
        if (sVar != null) {
            return sVar;
        }
        C6321s sVar2 = f15888a;
        this.f15893E = sVar2;
        return sVar2;
    }

    public final String getViewState() {
        return this.f15944d;
    }

    public final C5912de getMediaProcessor() {
        return this.f15948h;
    }

    public final C5904da getExpandProperties() {
        return this.f15896H;
    }

    public final C5922dh getResizeProperties() {
        return this.f15897I;
    }

    public final void setResizeProperties(C5922dh dhVar) {
        this.f15897I = dhVar;
    }

    public final void setAndUpdateViewState(String str) {
        this.f15944d = str;
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        mo35588d("window.mraidview.broadcastEvent('stateChange','" + lowerCase + "');");
    }

    /* renamed from: t */
    private void m18861t() {
        setVisibility(0);
        requestLayout();
    }

    public final String getMraidJsString() {
        String b = new C6198if(getContext(), "mraid_js_store").mo35415b("mraid_js_string");
        return b == null ? "var imIsObjValid=function(a){return\"undefined\"!=typeof a&&null!=a?!0:!1},EventListeners=function(a){this.event=a;this.count=0;var b=[];this.add=function(a){b.push(a);++this.count};this.remove=function(a){var e=!1,d=this;b=b.filter(function(b){if(b=b===a)--d.count,e=!0;return!b});return e};this.removeAll=function(){b=[];this.count=0};this.broadcast=function(a){b.forEach(function(b){try{b.apply({},a)}catch(d){}})};this.toString=function(){var c=[a,\":\"];b.forEach(function(a){c.push(\"|\",String(a),\"|\")});\nreturn c.join(\"\")}},InmobiObj=function(){this.listeners=[];this.addEventListener=function(a,b){try{if(imIsObjValid(b)&&imIsObjValid(a)){var c=this.listeners;c[a]||(c[a]=new EventListeners);c[a].add(b);\"micIntensityChange\"==a&&window.imraidview.startListeningMicIntensity();\"deviceMuted\"==a&&window.imraidview.startListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&window.imraidview.startListeningDeviceVolumeChange();\"volumeChange\"==a&&window.imraidview.startListeningVolumeChange();\"headphones\"==a&&\nwindow.imraidview.startListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&window.imraidview.startListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&window.imraidview.registerDownloaderCallbacks()}}catch(e){this.log(e)}};this.removeEventListener=function(a,b){if(imIsObjValid(a)){var c=this.listeners;imIsObjValid(c[a])&&(imIsObjValid(b)?c[a].remove(b):c[a].removeAll());\"micIntensityChange\"==a&&0==c[a].count&&window.imraidview.stopListeningMicIntensity();\"deviceMuted\"==a&&0==c[a].count&&\nwindow.imraidview.stopListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceVolumeChange();\"volumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningVolumeChange();\"headphones\"==a&&0==c[a].count&&window.imraidview.stopListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&0==c[a].count&&window.imraidview.stopListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&0==c[a].count&&window.imraidview.unregisterDownloaderCallbacks()}};\nthis.broadcastEvent=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)b[c]=arguments[c];c=b.shift();try{this.listeners[c]&&this.listeners[c].broadcast(b)}catch(e){}}};this.sendSaveContentResult=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)if(2==c){var e=arguments[c],e=JSON.parse(e);b[c]=e}else b[c]=arguments[c];e=b[1];\"success\"!=e&&(c=b[0].substring(b[0].indexOf(\"_\")+1),imraid.saveContentIDMap[c]&&delete imraid.saveContentIDMap[c]);\nwindow.imraid.broadcastEvent(b[0],b[1],b[2])}}},__im__iosNativeMessageHandler=void 0;window.webkit&&(window.webkit.messageHandlers&&window.webkit.messageHandlers.nativeMessageHandler)&&(__im__iosNativeMessageHandler=window.webkit.messageHandlers.nativeMessageHandler);\nvar __im__iosNativeCall={nativeCallInFlight:!1,nativeCallQueue:[],executeNativeCall:function(a){this.nativeCallInFlight?this.nativeCallQueue.push(a):(this.nativeCallInFlight=!0,imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=a)},nativeCallComplete:function(a){0==this.nativeCallQueue.length?this.nativeCallInFlight=!1:(a=this.nativeCallQueue.shift(),imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=\na)}},IOSNativeCall=function(){this.urlScheme=\"\";this.executeNativeCall=function(a){if(imIsObjValid(__im__iosNativeMessageHandler)){e={};e.command=a;e.scheme=this.urlScheme;for(var b={},c=1;c<arguments.length;c+=2)d=arguments[c+1],null!=d&&(b[arguments[c]]=\"\"+d);e.params=b}else for(var e=this.urlScheme+\"://\"+a,d,b=!0,c=1;c<arguments.length;c+=2)d=arguments[c+1],null!=d&&(b?(e+=\"?\",b=!1):e+=\"&\",e+=arguments[c]+\"=\"+escape(d));__im__iosNativeCall.executeNativeCall(e);return\"OK\"};this.nativeCallComplete=\nfunction(a){__im__iosNativeCall.nativeCallComplete(a);return\"OK\"};this.updateKV=function(a,b){this[a]=b;var c=this.broadcastMap[a];c&&this.broadcastEvent(c,b)}};\n(function(){var a=window.mraidview={};a.orientationProperties={allowOrientationChange:!0,forceOrientation:\"none\",direction:\"right\"};var b=[],c=!1;a.detectAndBlockFraud=function(b){a.isPossibleFraud()&&a.fireRedirectFraudBeacon(b);return!1};a.popupBlocked=function(b){a.firePopupBlockedBeacon(b)};a.zeroPad=function(a){var b=\"\";10>a&&(b+=\"0\");return b+a};a.supports=function(a){console.log(\"bridge: supports (MRAID)\");if(\"string\"!=typeof a)window.mraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\n\"supports\");else return\"false\"!=sdkController.supports(\"window.mraidview\",a)};a.useCustomClose=function(a){try{sdkController.useCustomClose(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"use CustomClose: \"+b)}};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};a.stackCommands=function(a,d){c?b.push(a):(eval(a),d&&(c=!0))};a.expand=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.expand(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"executeNativeExpand: \"+\nb+\", URL = \"+a)}};a.setExpandProperties=function(b){try{b?this.props=b:b=null;if(\"undefined\"!=typeof b.lockOrientation&&null!=b.lockOrientation&&\"undefined\"!=typeof b.orientation&&null!=b.orientation){var c={};c.allowOrientationChange=!b.lockOrientation;c.forceOrientation=b.orientation;a.setOrientationProperties(c)}sdkController.setExpandProperties(\"window.mraidview\",a.stringify(b))}catch(f){imraidview.showAlert(\"executeNativesetExpandProperties: \"+f+\", props = \"+b)}};a.getExpandProperties=function(){try{return eval(\"(\"+\nsdkController.getExpandProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getExpandProperties: \"+a)}};a.setOrientationProperties=function(b){try{b?(\"undefined\"!=typeof b.allowOrientationChange&&(a.orientationProperties.allowOrientationChange=b.allowOrientationChange),\"undefined\"!=typeof b.forceOrientation&&(a.orientationProperties.forceOrientation=b.forceOrientation)):b=null,sdkController.setOrientationProperties(\"window.mraidview\",a.stringify(a.orientationProperties))}catch(c){imraidview.showAlert(\"setOrientationProperties: \"+\nc+\", props = \"+b)}};a.getOrientationProperties=function(){return{forceOrientation:a.orientationProperties.forceOrientation,allowOrientationChange:a.orientationProperties.allowOrientationChange}};a.resizeProps=null;a.setResizeProperties=function(b){var c,f;try{c=parseInt(b.width);f=parseInt(b.height);if(isNaN(c)||isNaN(f)||1>c||1>f)throw\"Invalid\";b.width=c;b.height=f;a.resizeProps=b;sdkController.setResizeProperties(\"window.mraidview\",a.stringify(b))}catch(g){window.mraid.broadcastEvent(\"error\",\"Invalid properties.\",\n\"setResizeProperties\")}};a.getResizeProperties=function(){try{return eval(\"(\"+sdkController.getResizeProperties(\"window.mraidview\")+\")\")}catch(b){imraidview.showAlert(\"getResizeProperties: \"+b)}};a.open=function(b){\"undefined\"==typeof b&&(b=null);try{sdkController.open(\"window.mraidview\",b)}catch(a){imraidview.showAlert(\"open: \"+a)}};a.getScreenSize=function(){try{return eval(\"(\"+sdkController.getScreenSize(\"window.mraidview\")+\")\")}catch(b){imraidview.showAlert(\"getScreenSize: \"+b)}};a.getMaxSize=\nfunction(){try{return eval(\"(\"+sdkController.getMaxSize(\"window.mraidview\")+\")\")}catch(b){imraidview.showAlert(\"getMaxSize: \"+b)}};a.getCurrentPosition=function(){try{return eval(\"(\"+sdkController.getCurrentPosition(\"window.mraidview\")+\")\")}catch(b){imraidview.showAlert(\"getCurrentPosition: \"+b)}};a.getDefaultPosition=function(){try{return eval(\"(\"+sdkController.getDefaultPosition(\"window.mraidview\")+\")\")}catch(b){imraidview.showAlert(\"getDefaultPosition: \"+b)}};a.getState=function(){try{return String(sdkController.getState(\"window.mraidview\"))}catch(b){imraidview.showAlert(\"getState: \"+\nb)}};a.isViewable=function(){try{return sdkController.isViewable(\"window.mraidview\")}catch(b){imraidview.showAlert(\"isViewable: \"+b)}};a.getPlacementType=function(){return sdkController.getPlacementType(\"window.mraidview\")};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(b){imraidview.showAlert(\"close: \"+b)}};\"function\"!=typeof String.prototype.startsWith&&(String.prototype.startsWith=function(b){return 0==this.indexOf(b)});a.playVideo=function(b){var a=\"\";null!=b&&(a=b);try{sdkController.playVideo(\"window.mraidview\",\na)}catch(c){imraidview.showAlert(\"playVideo: \"+c)}};a.stringify=function(b){if(\"undefined\"===typeof JSON){var c=\"\",f;if(\"undefined\"==typeof b.length)return a.stringifyArg(b);for(f=0;f<b.length;f++)0<f&&(c+=\",\"),c+=a.stringifyArg(b[f]);return c+\"]\"}return JSON.stringify(b)};a.stringifyArg=function(b){var a,c,g;c=typeof b;a=\"\";if(\"number\"===c||\"boolean\"===c)a+=args;else if(b instanceof Array)a=a+\"[\"+b+\"]\";else if(b instanceof Object){c=!0;a+=\"{\";for(g in b)null!==b[g]&&(c||(a+=\",\"),a=a+'\"'+g+'\":',c=\ntypeof b[g],a=\"number\"===c||\"boolean\"===c?a+b[g]:\"function\"===typeof b[g]?a+'\"\"':b[g]instanceof Object?a+this.stringify(args[i][g]):a+'\"'+b[g]+'\"',c=!1);a+=\"}\"}else b=b.replace(/\\\\/g,\"\\\\\\\\\"),b=b.replace(/\"/g,'\\\\\"'),a=a+'\"'+b+'\"';imraidview.showAlert(\"json:\"+a);return a};getPID=function(b){var a=\"\";null!=b&&(\"undefined\"!=typeof b.id&&null!=b.id)&&(a=b.id);return a};a.resize=function(){if(null==a.resizeProps)window.mraid.broadcastEvent(\"error\",\"Valid resize dimensions must be provided before calling resize\",\n\"resize\");else try{sdkController.resize(\"window.mraidview\")}catch(b){imraidview.showAlert(\"resize called in bridge\")}};a.storePicture=function(b){console.log(\"bridge: storePicture\");if(\"string\"!=typeof b)window.mraid.broadcastEvent(\"error\",\"storePicture method expects url as string parameter\",\"storePicture\");else{if(a.supports(\"storePicture\"))return!window.confirm(\"Do you want to download the file?\")?(window.mraid.broadcastEvent(\"error\",\"Store picture on \"+b+\" was cancelled by user.\",\"storePicture\"),\n!1):sdkController.storePicture(\"window.mraidview\",b);window.mraid.broadcastEvent(\"error\",\"Store picture on \"+b+\" was cancelled because it is unsupported in this device/app.\",\"storePicture\")}};a.fireMediaTrackingEvent=function(b,a){};a.fireMediaErrorEvent=function(b,a){};a.fireMediaTimeUpdateEvent=function(b,a,c){};a.fireMediaCloseEvent=function(b,a,c){};a.fireMediaVolumeChangeEvent=function(b,a,c){};a.broadcastEvent=function(){window.mraid.broadcastEvent.apply(window.mraid,arguments)}})();\n(function(){var a=window.mraid=new InmobiObj,b=window.mraidview,c=!1;b.isAdShownToUser=!1;b.onUserInteraction=function(){imraidview.onUserInteraction();c=!0};b.isPossibleFraud=function(){return a.supports(\"redirectFraudDetection\")&&(!b.isAdShownToUser||!c)};b.fireRedirectFraudBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var c={};c.trigger=a;c.isAdShown=b.isAdShownToUser.toString();inmobi.recordEvent(135,c)}};b.firePopupBlockedBeacon=function(b){if(\"undefined\"!=typeof inmobi&&\ninmobi.recordEvent){var a={};a.trigger=b;inmobi.recordEvent(136,a)}};window.onbeforeunload=function(){b.detectAndBlockFraud(\"redirect\")};a.addEventListener(\"viewableChange\",function(a){a&&!b.isAdShownToUser&&(b.isAdShownToUser=!0)});a.useCustomClose=b.useCustomClose;a.close=b.close;a.getExpandProperties=b.getExpandProperties;a.setExpandProperties=function(c){\"undefined\"!=typeof c&&(\"useCustomClose\"in c&&\"undefined\"!=typeof a.getState()&&\"expanded\"!=a.getState())&&a.useCustomClose(c.useCustomClose);\nb.setExpandProperties(c)};a.getResizeProperties=b.getResizeProperties;a.setResizeProperties=b.setResizeProperties;a.getOrientationProperties=b.getOrientationProperties;a.setOrientationProperties=b.setOrientationProperties;a.expand=b.expand;a.getMaxSize=b.getMaxSize;a.getState=b.getState;a.isViewable=b.isViewable;a.createCalendarEvent=function(b){window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"createCalendarEvent\")};a.open=function(c){b.detectAndBlockFraud(\"mraid.open\")||(\"string\"!=typeof c?\na.broadcastEvent(\"error\",\"URL is required.\",\"open\"):b.open(c))};a.resize=b.resize;a.getVersion=function(){return\"2.0\"};a.getPlacementType=b.getPlacementType;a.playVideo=function(a){b.playVideo(a)};a.getScreenSize=b.getScreenSize;a.getCurrentPosition=b.getCurrentPosition;a.getDefaultPosition=b.getDefaultPosition;a.supports=function(a){return b.supports(a)};a.storePicture=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"storePicture\"):b.storePicture(c)}})();\n(function(){var a=window.imraidview={};a.setOrientationProperties=function(b){try{b?(\"undefined\"!=typeof b.allowOrientationChange&&(mraidview.orientationProperties.allowOrientationChange=b.allowOrientationChange),\"undefined\"!=typeof b.forceOrientation&&(mraidview.orientationProperties.forceOrientation=b.forceOrientation),\"undefined\"!=typeof b.direction&&(mraidview.orientationProperties.direction=b.direction)):b=null,sdkController.setOrientationProperties(\"window.imraidview\",mraidview.stringify(mraidview.orientationProperties))}catch(c){a.showAlert(\"setOrientationProperties: \"+\nc+\", props = \"+b)}};a.getOrientationProperties=function(){return mraidview.orientationProperties};a.firePostStatusEvent=function(b){window.imraid.broadcastEvent(\"postStatus\",b)};a.fireMediaTrackingEvent=function(b,a){var e={};e.name=b;var d=\"inmobi_media_\"+b;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(d=d+\"_\"+a);window.imraid.broadcastEvent(d,e)};a.fireMediaErrorEvent=function(b,a){var e={name:\"error\"};e.code=a;var d=\"inmobi_media_\"+e.name;\"undefined\"!=typeof b&&(null!=b&&\"\"!=b)&&(d=d+\"_\"+b);window.imraid.broadcastEvent(d,\ne)};a.fireMediaTimeUpdateEvent=function(b,a,e){var d={name:\"timeupdate\",target:{}};d.target.currentTime=a;d.target.duration=e;a=\"inmobi_media_\"+d.name;\"undefined\"!=typeof b&&(null!=b&&\"\"!=b)&&(a=a+\"_\"+b);window.imraid.broadcastEvent(a,d)};a.saveContent=function(b,a,e){window.imraid.addEventListener(\"saveContent_\"+b,e);sdkController.saveContent(\"window.imraidview\",b,a)};a.cancelSaveContent=function(b){sdkController.cancelSaveContent(\"window.imraidview\",b)};a.disableCloseRegion=function(b){sdkController.disableCloseRegion(\"window.imraidview\",\nb)};a.fireGalleryImageSelectedEvent=function(b,a,e){var d=new Image;d.src=\"data:image/jpeg;base64,\"+b;d.width=a;d.height=e;window.imraid.broadcastEvent(\"galleryImageSelected\",d)};a.fireCameraPictureCatpturedEvent=function(b,a,e){var d=new Image;d.src=\"data:image/jpeg;base64,\"+b;d.width=a;d.height=e;window.imraid.broadcastEvent(\"cameraPictureCaptured\",d)};a.fireMediaCloseEvent=function(b,a,e){var d={name:\"close\"};d.viaUserInteraction=a;d.target={};d.target.currentTime=e;a=\"inmobi_media_\"+d.name;\"undefined\"!=\ntypeof b&&(null!=b&&\"\"!=b)&&(a=a+\"_\"+b);window.imraid.broadcastEvent(a,d)};a.fireMediaVolumeChangeEvent=function(b,a,e){var d={name:\"volumechange\",target:{}};d.target.volume=a;d.target.muted=e;a=\"inmobi_media_\"+d.name;\"undefined\"!=typeof b&&(null!=b&&\"\"!=b)&&(a=a+\"_\"+b);window.imraid.broadcastEvent(a,d)};a.fireDeviceMuteChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceMuted\",a)};a.fireDeviceVolumeChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceVolumeChange\",a)};a.fireHeadphonePluggedEvent=\nfunction(a){window.imraid.broadcastEvent(\"headphones\",a)};a.showAlert=function(a){sdkController.showAlert(\"window.imraidview\",a)};a.openExternal=function(b,c){try{600<=getSdkVersionInt()?sdkController.openExternal(\"window.imraidview\",b,c):sdkController.openExternal(\"window.imraidview\",b)}catch(e){a.showAlert(\"openExternal: \"+e)}};a.log=function(b){try{sdkController.log(\"window.imraidview\",b)}catch(c){a.showAlert(\"log: \"+c)}};a.getPlatform=function(){return\"android\"};a.asyncPing=function(b){try{sdkController.asyncPing(\"window.imraidview\",\nb)}catch(c){a.showAlert(\"asyncPing: \"+c)}};a.startListeningDeviceMuteEvents=function(){sdkController.registerDeviceMuteEventListener(\"window.imraidview\")};a.stopListeningDeviceMuteEvents=function(){sdkController.unregisterDeviceMuteEventListener(\"window.imraidview\")};a.startListeningDeviceVolumeChange=function(){sdkController.registerDeviceVolumeChangeEventListener(\"window.imraidview\")};a.stopListeningDeviceVolumeChange=function(){sdkController.unregisterDeviceVolumeChangeEventListener(\"window.imraidview\")};\na.startListeningHeadphonePluggedEvents=function(){sdkController.registerHeadphonePluggedEventListener(\"window.imraidview\")};a.stopListeningHeadphonePluggedEvents=function(){sdkController.unregisterHeadphonePluggedEventListener(\"window.imraidview\")};getSdkVersionInt=function(){for(var b=a.getSdkVersion().split(\".\"),c=b.length,e=\"\",d=0;d<c;d++)e+=b[d];return parseInt(e)};a.getSdkVersion=function(){return window._im_imaiview.getSdkVersion()};a.supports=function(a){console.log(\"bridge: supports (IMRAID)\");\nif(\"string\"!=typeof a)window.imraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\"supports\");else return\"false\"!=sdkController.supports(\"window.imraidview\",a)};a.postToSocial=function(b,c,e,d){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"postToSocial\");a.log(\"Method postToSocial not supported\")};a.incentCompleted=function(a){if(\"object\"!=typeof a||null==a)sdkController.incentCompleted(\"window.imraidview\",null);else try{sdkController.incentCompleted(\"window.imraidview\",\nJSON.stringify(a))}catch(c){sdkController.incentCompleted(\"window.imraidview\",null)}};a.getOrientation=function(){try{return String(sdkController.getOrientation(\"window.imraidview\"))}catch(b){a.showAlert(\"getOrientation: \"+b)}};a.acceptAction=function(b){try{sdkController.acceptAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"acceptAction: \"+c+\", params = \"+b)}};a.rejectAction=function(b){try{sdkController.rejectAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"rejectAction: \"+\nc+\", params = \"+b)}};a.updateToPassbook=function(b){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"updateToPassbook\");a.log(\"Method not supported\")};a.isDeviceMuted=function(){return\"false\"!=sdkController.isDeviceMuted(\"window.imraidview\")};a.getDeviceVolume=function(){return 603>=getSdkVersionInt()?-1:sdkController.getDeviceVolume(\"window.imraidview\")};a.isHeadPhonesPlugged=function(){return\"false\"!=sdkController.isHeadphonePlugged(\"window.imraidview\")};a.sendSaveContentResult=function(){window.imraid.sendSaveContentResult.apply(window.imraid,\narguments)};a.broadcastEvent=function(){window.imraid.broadcastEvent.apply(window.imraid,arguments)};a.disableBackButton=function(a){void 0==a||\"boolean\"!=typeof a?console.log(\"disableBackButton called with invalid params\"):sdkController.disableBackButton(\"window.imraidview\",a)};a.isBackButtonDisabled=function(){return sdkController.isBackButtonDisabled(\"window.imraidview\")};a.startListeningForBackButtonPressedEvent=function(){sdkController.registerBackButtonPressedEventListener(\"window.imraidview\")};\na.stopListeningForBackButtonPressedEvent=function(){sdkController.unregisterBackButtonPressedEventListener(\"window.imraidview\")};a.hideStatusBar=function(){};a.setOpaqueBackground=function(){};a.startDownloader=function(a,c,e){682<=getSdkVersionInt()&&sdkController.startDownloader(\"window.imraidview\",a,c,e)};a.registerDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.registerDownloaderCallbacks(\"window.imraidview\")};a.unregisterDownloaderCallbacks=function(){682<=getSdkVersionInt()&&\nsdkController.unregisterDownloaderCallbacks(\"window.imraidview\")};a.getDownloadProgress=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadProgress(\"window.imraidview\"):-1};a.getDownloadStatus=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadStatus(\"window.imraidview\"):-1};a.fireEvent=function(a){700<=getSdkVersionInt()&&(\"fireSkip\"===a?sdkController.fireSkip(\"window.imraidview\"):\"fireComplete\"===a?sdkController.fireComplete(\"window.imraidview\"):\"showEndCard\"===a&&\nsdkController.showEndCard(\"window.imraidview\"))};a.saveBlob=function(a){700<=getSdkVersionInt()&&sdkController.saveBlob(\"window.imraidview\",a)};a.getBlob=function(a,c){700<=getSdkVersionInt()&&sdkController.getBlob(a,c)};a.setCloseEndCardTracker=function(a){700<=getSdkVersionInt()&&sdkController.setCloseEndCardTracker(\"window.imraidview\",a)};a.getRenderableAdIndexes=function(){try{if(917<=getSdkVersionInt())return sdkController.getRenderableAdIndexes(\"window.imraidview\")}catch(a){}return\"[]\"};a.getCurrentRenderingIndex=\nfunction(){try{if(917<=getSdkVersionInt())return sdkController.getCurrentRenderingIndex(\"window.imraidview\")}catch(a){}return-1};a.showAd=function(a){try{917<=getSdkVersionInt()&&sdkController.showAd(\"window.imraidview\",a)}catch(c){}};a.timeSinceShow=function(){try{if(917<=getSdkVersionInt())return sdkController.timeSinceShow(\"window.imraidview\")}catch(a){}return-1};a.getShowTimeStamp=function(){try{if(917<=getSdkVersionInt())return sdkController.getShowTimeStamp(\"window.imraidview\")}catch(a){}return-1};\na.closeAll=function(){try{917<=getSdkVersionInt()&&sdkController.closeAll(\"window.imraidview\")}catch(a){}};a.loadAd=function(a){try{917<=getSdkVersionInt()&&sdkController.loadAd(\"window.imraidview\",a)}catch(c){}};a.setAdContext=function(a){try{917<=getSdkVersionInt()&&sdkController.setAdContext(\"window.imraidview\",a)}catch(c){}};a.getAdContext=function(){try{if(917<=getSdkVersionInt())return sdkController.getAdContext(\"window.imraidview\")}catch(a){}return\"\"};a.openWithoutTracker=function(a){try{\"undefined\"==\ntypeof a&&(a=null),sdkController.openWithoutTracker(\"window.imraidview\",a)}catch(c){}};a.impressionRendered=function(){window.imraid.broadcastEvent(\"impressionRendered\")};a.customExpand=function(b,c,e,d,f){try{void 0==e||\"number\"!=typeof e?console.log(\"screenPercentage called with invalid params\"):void 0==c||\"number\"!=typeof c?console.log(\"inputType called with invalid params\"):void 0==d||\"boolean\"!=typeof d?console.log(\"topNavBarVisible called with invalid params\"):void 0==f||\"boolean\"!=typeof f?\nconsole.log(\"bottomNavBarVisible called with invalid params\"):sdkController.customExpand(\"window.imraidview\",b,c,e,d,f)}catch(g){a.showAlert(\"executeNativeCustomExpand: \"+g+\", input = \"+b+\", inputType = \"+c+\", screenPercentage = \"+e+\", bottomNavBarVisible = \"+f+\", topNavBarVisible = \"+d)}};a.closeCustomExpand=function(){try{sdkController.closeCustomExpand(\"window.imraidview\")}catch(a){}};a.onGestureDetected=function(a,c){window.imraid.broadcastEvent(\"onGestureDetected\",a,c)};a.onUserLandingCompleted=\nfunction(){window.imraid.broadcastEvent(\"onUserLandingCompleted\")};a.onUserInteraction=function(){window.imraid.broadcastEvent(\"onUserInteraction\")};a.impressionFired=function(){try{sdkController.impressionFired(\"window.imraidview\")}catch(b){a.showAlert(\"impressionFired: \"+b)}}})();\n(function(){var a=window.imraid=new InmobiObj,b=window.imraidview;a.getOrientation=b.getOrientation;a.setOrientationProperties=b.setOrientationProperties;a.getOrientationProperties=b.getOrientationProperties;a.saveContentIDMap={};a.saveContent=function(c,e,d){var f=arguments.length,g,h=null;if(3>f){if(\"function\"===typeof arguments[f-1])g=arguments[f-1];else return;h={reason:1}}else a.saveContentIDMap[c]&&(g=arguments[2],h={reason:11,url:arguments[1]});\"function\"!==!g&&(h?(window.imraid.addEventListener(\"saveContent_failed_\"+\nc,g),window.imraid.sendSaveContentResult(\"saveContent_failed_\"+c,\"failed\",JSON.stringify(h))):(a.removeEventListener(\"saveContent_\"+c),a.saveContentIDMap[c]=!0,b.saveContent(c,e,d)))};a.cancelSaveContent=function(a){b.cancelSaveContent(a)};a.asyncPing=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"asyncPing\"):b.asyncPing(c)};a.disableCloseRegion=b.disableCloseRegion;a.getSdkVersion=b.getSdkVersion;a.log=function(c){\"undefined\"==typeof c?a.broadcastEvent(\"error\",\"message is required.\",\n\"log\"):\"string\"==typeof c?b.log(c):b.log(JSON.stringify(c))};a.getInMobiAIVersion=function(){return\"2.0\"};a.getVendorName=function(){return\"inmobi\"};a.openExternal=function(a,e){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imraid.openExternal\")||b.openExternal(a,e)};a.updateToPassbook=function(c){mraidview.detectAndBlockFraud(\"imraid.updateToPassbook\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"updateToPassbook\"):\nb.updateToPassbook(c))};a.postToSocial=function(a,e,d,f){mraidview.detectAndBlockFraud(\"imraid.postToSocial\")||b.postToSocial(a,e,d,f)};a.getPlatform=b.getPlatform;a.incentCompleted=b.incentCompleted;a.loadSKStore=b.loadSKStore;a.showSKStore=function(a,e,d,f,g,h,k,l){mraidview.detectAndBlockFraud(\"imraid.showSKStore\")||b.showSKStore(a,e,d,f,g,h,k,l)};a.skoverlay=b.skoverlay;a.skoverlayWithSkan=b.skoverlayWithSkan;a.dismissSKOverlay=b.dismissSKOverlay;a.supports=function(a){return b.supports(a)};a.isDeviceMuted=\nfunction(){return!imIsObjValid(a.listeners.deviceMuted)?-1:b.isDeviceMuted()};a.isHeadPhonesPlugged=function(){return!imIsObjValid(a.listeners.headphones)?!1:b.isHeadPhonesPlugged()};a.getDeviceVolume=function(){return b.getDeviceVolume()};a.setDeviceVolume=function(a){b.setDeviceVolume(a)};a.hideStatusBar=function(){b.hideStatusBar()};a.setOpaqueBackground=function(){b.setOpaqueBackground()};a.getRenderableAdIndexes=b.getRenderableAdIndexes;a.getCurrentRenderingIndex=b.getCurrentRenderingIndex;a.showAd=\nb.showAd;a.timeSinceShow=b.timeSinceShow;a.closeAll=b.closeAll;a.loadAd=b.loadAd;a.setAdContext=b.setAdContext;a.getAdContext=b.getAdContext;a.getShowTimeStamp=b.getShowTimeStamp;a.disableBackButton=b.disableBackButton;a.isBackButtonDisabled=b.isBackButtonDisabled;a.startDownloader=b.startDownloader;a.getDownloadProgress=b.getDownloadProgress;a.getDownloadStatus=b.getDownloadStatus;a.fireEvent=b.fireEvent;a.saveBlob=b.saveBlob;a.getBlob=b.getBlob;a.setCloseEndCardTracker=b.setCloseEndCardTracker;\na.openWithoutTracker=b.openWithoutTracker;a.impressionRendered=b.impressionRendered;a.onGestureDetected=b.onGestureDetected;a.onUserLandingCompleted=b.onUserLandingCompleted;a.customExpand=b.customExpand;a.closeCustomExpand=b.closeCustomExpand;a.impressionFired=b.impressionFired})();\n(function(){var a=window._im_imaiview={ios:{}};window.imaiview=a;a.broadcastEvent=function(){for(var a=Array(arguments.length),c=0;c<arguments.length;c++)a[c]=arguments[c];c=a.shift();try{window.mraid.broadcastEvent(c,a)}catch(e){}};a.getPlatform=function(){return\"android\"};a.getPlatformVersion=function(){return sdkController.getPlatformVersion(\"window.imaiview\")};a.log=function(a){sdkController.log(\"window.imaiview\",a)};a.openEmbedded=function(a){sdkController.openEmbedded(\"window.imaiview\",a)};\na.openExternal=function(a,c){600<=getSdkVersionInt()?sdkController.openExternal(\"window.imaiview\",a,c):sdkController.openExternal(\"window.imaiview\",a)};a.ping=function(a,c){sdkController.ping(\"window.imaiview\",a,c)};a.pingInWebView=function(a,c){sdkController.pingInWebView(\"window.imaiview\",a,c)};a.getSdkVersion=function(){try{var a=sdkController.getSdkVersion(\"window.imaiview\");if(\"string\"==typeof a&&null!=a)return a}catch(c){return\"3.7.0\"}};a.onUserInteraction=function(a){if(\"object\"!=typeof a||\nnull==a)sdkController.onUserInteraction(\"window.imaiview\",null);else try{sdkController.onUserInteraction(\"window.imaiview\",JSON.stringify(a))}catch(c){sdkController.onUserInteraction(\"window.imaiview\",null)}};a.fireAdReady=function(){sdkController.fireAdReady(\"window.imaiview\")};a.fireAdFailed=function(){sdkController.fireAdFailed(\"window.imaiview\")};a.broadcastEvent=function(){window.imai.broadcastEvent.apply(window.imai,arguments)}})();\n(function(){var a=window._im_imaiview;window._im_imai=new InmobiObj;window._im_imai.ios=new InmobiObj;var b=window._im_imai;window.imai=window._im_imai;b.matchString=function(a,b){if(\"string\"!=typeof a||null==a||null==b)return-1;var d=-1;try{d=a.indexOf(b)}catch(f){}return d};b.isHttpUrl=function(a){return\"string\"!=typeof a||null==a?!1:0==b.matchString(a,\"http://\")?!0:0==b.matchString(a,\"https://\")?!0:!1};b.appendTapParams=function(a,e,d){if(!imIsObjValid(e)||!imIsObjValid(d))return a;b.isHttpUrl(a)&&\n(a=-1==b.matchString(a,\"?\")?a+(\"?u-tap-o=\"+e+\",\"+d):a+(\"&u-tap-o=\"+e+\",\"+d));return a};b.performAdClick=function(a,e){e=e||event;if(imIsObjValid(a)){var d=a.clickConfig,f=a.landingConfig;if(!imIsObjValid(d)&&!imIsObjValid(f))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var g=null,h=null,k=null,l=null,n=null,m=null,q=null,p=null;if(imIsObjValid(e))try{l=e.changedTouches[0].pageX,n=e.changedTouches[0].pageY}catch(r){n=\nl=0}imIsObjValid(f)?imIsObjValid(d)?(m=f.url,q=f.fallbackUrl,p=f.urlType,g=d.url,h=d.pingWV,k=d.fr):(m=f.url,p=f.urlType):(m=d.url,p=d.urlType);d=b.getPlatform();try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=!0;if(0>h||1<h)h=!0;if(\"number\"!=typeof p||null==p)p=0;g=b.appendTapParams(g,l,n);imIsObjValid(g)?!0==h?b.pingInWebView(g,k):b.ping(g,k):b.log(\"clickurl provided is null.\");if(imIsObjValid(m))switch(imIsObjValid(g)||\n(m=b.appendTapParams(m,l,n)),p){case 1:b.openEmbedded(m);break;case 2:\"ios\"==d?b.ios.openItunesProductView(m):this.broadcastEvent(\"error\",\"Cannot process openItunesProductView for os\"+d);break;default:b.openExternal(m,q)}else b.log(\"Landing url provided is null.\")}catch(s){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.performActionClick=function(a,e){e=e||event;if(imIsObjValid(a)){var d=a.clickConfig,f=a.landingConfig;\nif(!imIsObjValid(d)&&!imIsObjValid(f))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var g=null,h=null,k=null,l=null,n=null;if(imIsObjValid(e))try{l=e.changedTouches[0].pageX,n=e.changedTouches[0].pageY}catch(m){n=l=0}imIsObjValid(d)&&(g=d.url,h=d.pingWV,k=d.fr);try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=\n!0;if(0>h||1<h)h=!0;g=b.appendTapParams(g,l,n);imIsObjValid(g)?!0==h?b.pingInWebView(g,k):b.ping(g,k):b.log(\"clickurl provided is null.\");b.onUserInteraction(f)}catch(q){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.getVersion=function(){return\"1.0\"};b.getPlatform=a.getPlatform;b.getPlatformVersion=a.getPlatformVersion;b.log=a.log;b.openEmbedded=function(b){console.log(\"openEmbedded is deprecated, will be removed in future version\");\nmraidview.detectAndBlockFraud(\"imai.openEmbedded\")||a.openEmbedded(b)};b.openExternal=function(b,e){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imai.openExternal\")||a.openExternal(b,e)};b.ping=a.ping;b.pingInWebView=a.pingInWebView;b.onUserInteraction=a.onUserInteraction;b.getSdkVersion=a.getSdkVersion;b.loadSKStore=a.loadSKStore;b.showSKStore=function(b){mraidview.detectAndBlockFraud(\"imai.showSKStore\")||a.showSKStore(b)};b.ios.openItunesProductView=\nfunction(b){mraidview.detectAndBlockFraud(\"imai.ios.openItunesProductView\")||a.ios.openItunesProductView(b)};b.fireAdReady=a.fireAdReady;b.fireAdFailed=a.fireAdFailed})();\n" : b;
    }

    /* renamed from: a */
    public final void mo35448a() {
        this.f15903O = false;
        try {
            getClass().getMethod("setLayerType", new Class[]{Integer.TYPE, Paint.class}).invoke(this, new Object[]{1, null});
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo35591e(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            switch(r0) {
                case -1886160473: goto L_0x0035;
                case -1647691422: goto L_0x002b;
                case 1509574865: goto L_0x0021;
                case 1642189884: goto L_0x0017;
                case 1772979069: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x003f
        L_0x000d:
            java.lang.String r0 = "redirectFraudDetection"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = r4
            goto L_0x0040
        L_0x0017:
            java.lang.String r0 = "saveContent"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = r3
            goto L_0x0040
        L_0x0021:
            java.lang.String r0 = "html5video"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = r1
            goto L_0x0040
        L_0x002b:
            java.lang.String r0 = "inlineVideo"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = r2
            goto L_0x0040
        L_0x0035:
            java.lang.String r0 = "playVideo"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = r5
            goto L_0x0040
        L_0x003f:
            r7 = -1
        L_0x0040:
            if (r7 == r5) goto L_0x0053
            if (r7 == r3) goto L_0x0053
            if (r7 == r2) goto L_0x0049
            if (r7 == r1) goto L_0x0049
            return r4
        L_0x0049:
            boolean r7 = r6.f15895G
            if (r7 == 0) goto L_0x0052
            boolean r7 = r6.f15903O
            if (r7 == 0) goto L_0x0052
            return r5
        L_0x0052:
            return r4
        L_0x0053:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6301q.mo35591e(java.lang.String):boolean");
    }

    /* renamed from: i */
    public final boolean mo35628i() {
        C6074ft.C6087i renderingConfig = getRenderingConfig();
        if (renderingConfig == null) {
            return false;
        }
        boolean z = this.f15917ab != -1 && SystemClock.elapsedRealtime() - this.f15917ab < renderingConfig.userTouchResetTime * 1000;
        if (!renderingConfig.autoRedirectionEnforcement || this.f15916aa || z) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo35510a(String str, String str2, String str3) {
        mo35579a(str, str2 + "(" + str3 + ");");
    }

    public final void setCloseEndCardTracker(String str) {
        C6051fn fnVar;
        C5869cj cjVar;
        C6234j referenceContainer = getReferenceContainer();
        if ((referenceContainer instanceof C6296o) && (fnVar = (C6051fn) ((C6296o) referenceContainer).getVideoContainerView()) != null && (cjVar = (C5869cj) fnVar.getVideoView().getTag()) != null && cjVar.mo34867b() != null && cjVar.mo34867b().mo35065f() != null) {
            cjVar.mo34867b().mo35065f().mo35047a(new C5868ci(str, 0, "closeEndCard", (Map<String, String>) null));
        }
    }

    /* renamed from: j */
    public final void mo35495j() {
        if (!this.f15957q.get()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C6301q.this.getListener().mo34466f();
                }
            });
        }
    }

    /* renamed from: k */
    public final void mo35496k() {
        if (!this.f15957q.get()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C6301q.this.getListener().mo34470g();
                }
            });
        }
    }

    public final int getCurrentRenderingPodAdIndex() {
        C6278k kVar = this.f15962v;
        if (kVar != null) {
            return kVar.mo34401a(this);
        }
        return 0;
    }

    public final JSONArray getRenderableAdIndexes() {
        C6278k kVar = this.f15962v;
        if (kVar != null) {
            return kVar.mo34448c();
        }
        return new JSONArray();
    }

    public final long getShowTimeStamp() {
        C6278k kVar = this.f15962v;
        if (kVar != null) {
            return kVar.mo34456d();
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo35589d(boolean z) {
        getCurrentRenderingPodAdIndex();
        mo35588d("window.imraidview.broadcastEvent('adShowSuccess'," + z + ");");
    }

    public final String getLandingScheme() {
        return this.f15940ay;
    }

    public final C6280m getLandingPageHandler() {
        return this.f15936au;
    }

    /* renamed from: c */
    public final void mo35585c(String str, String str2, String str3) {
        mo35588d("window.imraid.broadcastEvent('onUserLandingCompleted');");
        if (str2 != null) {
            mo35579a(str2, "broadcastEvent('" + str + "Successful','" + str3 + "');");
        }
    }

    /* renamed from: c */
    public final void mo35584c(String str) {
        mo35588d("window.mraidview.fireRedirectFraudBeacon('" + str + "')");
        String str2 = this.f15909U != null ? "banner" : "int";
        HashMap hashMap = new HashMap();
        hashMap.put("creativeId", this.f15910V);
        hashMap.put("trigger", str);
        hashMap.put("impressionId", getImpressionId());
        hashMap.put(C11130Ad.AD_TYPE, str2);
        m18835a("BlockAutoRedirection", (Map<String, Object>) hashMap);
    }

    public final void setExpandProperties(C5904da daVar) {
        if (daVar.f14942b) {
            setUseCustomClose(daVar.f14941a);
        }
        this.f15896H = daVar;
    }

    /* renamed from: l */
    public final void mo35629l() {
        mo35588d("window.mraidview.onUserInteraction();");
        getListener().mo34474h(this);
    }

    /* renamed from: a */
    static /* synthetic */ boolean m18836a(C6301q qVar, JsResult jsResult) {
        C6074ft.C6087i renderingConfig = qVar.getRenderingConfig();
        if (renderingConfig != null && renderingConfig.shouldRenderPopup) {
            return true;
        }
        jsResult.cancel();
        qVar.mo35588d("window.mraidview.popupBlocked('popupBlocked')");
        return false;
    }
}
