package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.PlayerState;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C6765a;
import com.mbridge.msdk.click.C6779b;
import com.mbridge.msdk.click.p217a.C6772a;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.controller.C8396b;
import com.mbridge.msdk.foundation.entity.C8468m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8423p;
import com.mbridge.msdk.foundation.same.p302c.C8481b;
import com.mbridge.msdk.foundation.same.p302c.C8484c;
import com.mbridge.msdk.foundation.same.p305f.C8498b;
import com.mbridge.msdk.foundation.tools.C8616ad;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8675y;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.mbnative.controller.NativeController;
import com.mbridge.msdk.mbnative.p334c.C8801a;
import com.mbridge.msdk.mbnative.p335d.C8838b;
import com.mbridge.msdk.mbsignalcommon.base.C8856a;
import com.mbridge.msdk.mbsignalcommon.communication.C8868b;
import com.mbridge.msdk.mbsignalcommon.p339b.C8853b;
import com.mbridge.msdk.mbsignalcommon.windvane.C8881a;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.nativex.listener.C8896a;
import com.mbridge.msdk.nativex.listener.C8897b;
import com.mbridge.msdk.nativex.view.MediaViewPlayerView;
import com.mbridge.msdk.nativex.view.mbfullview.BaseView;
import com.mbridge.msdk.nativex.view.mbfullview.C8937a;
import com.mbridge.msdk.nativex.view.mbfullview.MBridgeFullView;
import com.mbridge.msdk.nativex.view.mbfullview.MBridgeTopFullView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import com.mbridge.msdk.out.OnMBMediaViewListenerPlus;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.p078c.C2456d;
import com.mbridge.msdk.playercommon.VideoPlayerStatusListener;
import com.mbridge.msdk.video.signal.communication.IRewardCommunication;
import com.mbridge.msdk.videocommon.download.C9641a;
import com.mbridge.msdk.videocommon.download.C9645c;
import com.mbridge.msdk.videocommon.download.C9652g;
import com.mbridge.msdk.videocommon.download.C9661h;
import com.mbridge.msdk.videocommon.download.C9670k;
import com.mbridge.msdk.videocommon.listener.C9673a;
import com.mbridge.msdk.videocommon.view.MyImageView;
import com.mbridge.msdk.widget.C9676a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MBMediaView extends LinearLayout implements VideoPlayerStatusListener, IRewardCommunication {
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_1_LANDING_PAGE = 1;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_2_NORMAL_FULLSCREEN = 2;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_3_NORMAL_FULLSCREEN_ENDCARD = 3;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_4_NORMAL_FULLSCREEN_LP = 4;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_6_SMALLVIDEO = 6;
    public static final String TAG = "MBMediaView";
    public static final int WHAT_VIEW_FULL_SCREEN = 2;
    public static final int WHAT_VIEW_SMALL_SCREEN = 1;

    /* renamed from: o */
    private static int f21928o = 2;

    /* renamed from: p */
    private static int f21929p = 1;

    /* renamed from: A */
    private WindVaneWebViewForNV f21930A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public WindVaneWebViewForNV f21931B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public MyImageView f21932C;

    /* renamed from: D */
    private ProgressBar f21933D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public View f21934E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public BaseView f21935F;

    /* renamed from: G */
    private RelativeLayout f21936G;

    /* renamed from: H */
    private RelativeLayout f21937H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public TextView f21938I;

    /* renamed from: J */
    private ProgressBar f21939J;

    /* renamed from: K */
    private RelativeLayout f21940K;

    /* renamed from: L */
    private int f21941L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public Handler f21942M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public CampaignEx f21943N;

    /* renamed from: O */
    private int f21944O;

    /* renamed from: P */
    private int f21945P;

    /* renamed from: Q */
    private double f21946Q;

    /* renamed from: R */
    private double f21947R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public int f21948S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public int f21949T;

    /* renamed from: U */
    private C8921e f21950U;

    /* renamed from: V */
    private SensorManager f21951V;

    /* renamed from: W */
    private Sensor f21952W;

    /* renamed from: a */
    private boolean f21953a = true;

    /* renamed from: aa */
    private C9641a f21954aa = null;
    /* access modifiers changed from: private */

    /* renamed from: ab */
    public C8917a f21955ab = null;

    /* renamed from: ac */
    private OnMBMediaViewListener f21956ac;

    /* renamed from: ad */
    private OnMBMediaViewListenerPlus f21957ad;

    /* renamed from: ae */
    private int f21958ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public boolean f21959af = false;

    /* renamed from: ag */
    private boolean f21960ag = false;

    /* renamed from: ah */
    private RelativeLayout f21961ah;

    /* renamed from: ai */
    private ImageView f21962ai;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public int f21963aj;
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public boolean f21964ak = false;
    /* access modifiers changed from: private */

    /* renamed from: al */
    public Context f21965al;

    /* renamed from: am */
    private boolean f21966am = false;

    /* renamed from: an */
    private Runnable f21967an = new Runnable() {
        public final void run() {
            try {
                if (!MBMediaView.this.f21974h) {
                    if (!MBMediaView.this.m25731a((View) MBMediaView.this)) {
                        MBMediaView.m25717S(MBMediaView.this);
                    } else {
                        MBMediaView.m25718T(MBMediaView.this);
                    }
                }
                MBMediaView.this.f21942M.postDelayed(this, 300);
            } catch (Exception e) {
                C8672v.m24878d(MBMediaView.TAG, e.getMessage());
            }
        }
    };

    /* renamed from: b */
    private boolean f21968b = true;

    /* renamed from: c */
    private boolean f21969c = true;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f21970d = true;

    /* renamed from: e */
    private boolean f21971e = true;

    /* renamed from: f */
    private boolean f21972f = false;

    /* renamed from: g */
    private boolean f21973g = true;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f21974h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile boolean f21975i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public volatile boolean f21976j = false;

    /* renamed from: k */
    private boolean f21977k = true;

    /* renamed from: l */
    private boolean f21978l = true;

    /* renamed from: m */
    private ArrayList<String> f21979m = new ArrayList<>();

    /* renamed from: n */
    private ArrayList<String> f21980n = new ArrayList<>();

    /* renamed from: q */
    private boolean f21981q = false;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f21982r = false;

    /* renamed from: s */
    private AdSession f21983s = null;

    /* renamed from: t */
    private AdEvents f21984t = null;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public MediaEvents f21985u = null;

    /* renamed from: v */
    private int f21986v = 0;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public MediaViewPlayerView f21987w;

    /* renamed from: x */
    private RelativeLayout f21988x;

    /* renamed from: y */
    private RelativeLayout f21989y;

    /* renamed from: z */
    private RelativeLayout f21990z;

    /* renamed from: com.mbridge.msdk.nativex.view.MBMediaView$a */
    private enum C8917a {
        BIG_IMAGE,
        f22012b,
        GIF
    }

    public void handlerPlayableException(Object obj, String str) {
    }

    public void notifyCloseBtn(Object obj, String str) {
    }

    public void onPlayProgressMS(int i, int i2) {
    }

    public void setOrientation(Object obj, String str) {
    }

    public MBMediaView(Context context) {
        super(context);
        m25725a(context);
    }

    public MBMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25725a(context);
    }

    /* renamed from: a */
    private void m25725a(Context context) {
        try {
            m25742c();
            m25735b();
            this.f21965al = context;
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
        }
    }

    /* renamed from: a */
    private void m25724a() {
        C9641a aVar = this.f21954aa;
        if (aVar != null) {
            aVar.mo63629b((C9673a) null);
        }
    }

    /* renamed from: b */
    private void m25735b() {
        int a = C8658p.m24799a(getContext(), "mbridge_nativex_mbmediaview", "layout");
        if (a == -1) {
            C8672v.m24878d(TAG, "can not find mediaview resource");
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(a, (ViewGroup) null);
        this.f21989y = (RelativeLayout) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_rl_mediaview_root", "id"));
        this.f21988x = (RelativeLayout) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_ll_playerview_container", "id"));
        this.f21932C = (MyImageView) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_my_big_img", "id"));
        this.f21933D = (ProgressBar) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_native_pb", "id"));
        this.f21990z = (RelativeLayout) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_nativex_webview_layout", "id"));
        this.f21930A = (WindVaneWebViewForNV) inflate.findViewById(C8658p.m24799a(getContext(), "mbridge_nativex_webview_layout_webview", "id"));
        this.f21989y.setClickable(true);
        addView(inflate, -1, -1);
    }

    /* renamed from: c */
    private void m25742c() {
        this.f21942M = new Handler() {
            public final void handleMessage(Message message) {
                if (message != null) {
                    try {
                        int i = message.what;
                        if (i == 1) {
                            MBMediaView.this.m25774q();
                        } else if (i == 3) {
                            Object obj = message.obj;
                            if (obj != null && (obj instanceof View)) {
                                if (MBMediaView.this.m25731a((View) obj)) {
                                    MBMediaView.m25738b(MBMediaView.this);
                                }
                            }
                        }
                    } catch (Exception e) {
                        C8672v.m24878d(MBMediaView.TAG, e.getMessage());
                    }
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.f21969c) {
                SensorManager sensorManager = (SensorManager) getContext().getSystemService("sensor");
                this.f21951V = sensorManager;
                this.f21952W = sensorManager.getDefaultSensor(1);
                C8921e eVar = new C8921e();
                this.f21950U = eVar;
                this.f21951V.registerListener(eVar, this.f21952W, 2);
            }
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
            return;
        }
        if (Build.VERSION.SDK_INT >= 11) {
            this.f21973g = isHardwareAccelerated();
        }
        this.f21963aj = getOrientation();
        m25747d();
        this.f21942M.postDelayed(this.f21967an, 300);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            if (this.f21983s != null) {
                if (this.f21987w != null) {
                    this.f21987w.unregisterView();
                }
                this.f21983s.finish();
                this.f21983s = null;
            }
            if (this.f21985u != null) {
                this.f21985u = null;
            }
            if (this.f21984t != null) {
                this.f21984t = null;
            }
            this.f21942M.removeCallbacks(this.f21967an);
            if (this.f21942M != null) {
                this.f21942M.removeCallbacksAndMessages((Object) null);
            }
            if (!(this.f21951V == null || this.f21950U == null)) {
                this.f21951V.unregisterListener(this.f21950U);
            }
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
            return;
        }
        m25724a();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        try {
            this.f21971e = z;
            if (this.f21955ab == C8917a.f22012b && this.f21987w != null) {
                this.f21987w.setIsFrontDesk(z);
            }
            if (this.f21974h) {
                if (this.f21987w == null) {
                    C8672v.m24878d(TAG, "fullscreen playerview is null return");
                } else if (!this.f21971e) {
                    this.f21987w.pause();
                } else if (this.f21987w.isPlaying()) {
                    C8672v.m24876b(TAG, "fullscreen windowfocuse true isPlaying do nothing return");
                } else if (this.f21987w != null && !this.f21987w.isComplete() && !this.f21987w.getIsActiviePause()) {
                    this.f21987w.onClickPlayButton();
                }
            }
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
            return;
        }
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        try {
            this.f21944O = getHeight();
            int width = getWidth();
            this.f21945P = width;
            if (width == 0) {
                this.f21945P = getMeasuredWidth();
            }
            if (this.f21944O == 0) {
                this.f21944O = getMeasuredHeight();
            }
            if (this.f21945P == 0 && this.f21944O == 0) {
                this.f21945P = (int) m25693A();
            }
            if (this.f21955ab == C8917a.f22012b && !this.f21974h) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (this.f21944O == 0 || ((layoutParams != null && layoutParams.height == -2) || (layoutParams != null && layoutParams.height == -1))) {
                    this.f21944O = (int) ((((double) this.f21945P) * this.f21947R) / this.f21946Q);
                }
                m25756h();
            } else if (this.f21955ab == C8917a.BIG_IMAGE && !this.f21974h) {
                m25752f();
            } else if (this.f21955ab == C8917a.GIF && !this.f21974h) {
                m25755g();
            }
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a9 A[Catch:{ all -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010c A[Catch:{ all -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setNativeAd(com.mbridge.msdk.out.Campaign r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L_0x0003
            return
        L_0x0003:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f21943N     // Catch:{ all -> 0x0110 }
            if (r0 == 0) goto L_0x000c
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f21943N     // Catch:{ all -> 0x0110 }
            if (r0 != r9) goto L_0x000c
            return
        L_0x000c:
            r0 = 1
            r8.f21971e = r0     // Catch:{ all -> 0x0110 }
            r8.f21973g = r0     // Catch:{ all -> 0x0110 }
            r0 = 0
            r8.f21974h = r0     // Catch:{ all -> 0x0110 }
            r8.f21975i = r0     // Catch:{ all -> 0x0110 }
            r8.f21976j = r0     // Catch:{ all -> 0x0110 }
            r8.f21982r = r0     // Catch:{ all -> 0x0110 }
            r8.m25791y()     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = (com.mbridge.msdk.foundation.entity.CampaignEx) r9     // Catch:{ all -> 0x0110 }
            r8.f21943N = r9     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx$b r9 = r9.getMediaViewHolder()     // Catch:{ all -> 0x0110 }
            if (r9 != 0) goto L_0x0039
            com.mbridge.msdk.foundation.entity.CampaignEx$b r9 = new com.mbridge.msdk.foundation.entity.CampaignEx$b     // Catch:{ all -> 0x0110 }
            r9.<init>()     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f21943N     // Catch:{ all -> 0x0110 }
            java.util.Map r0 = r0.getAdvImpList()     // Catch:{ all -> 0x0110 }
            r9.f20596l = r0     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f21943N     // Catch:{ all -> 0x0110 }
            r0.setMediaViewHolder(r9)     // Catch:{ all -> 0x0110 }
        L_0x0039:
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r8.f21943N     // Catch:{ all -> 0x0110 }
            int r9 = r9.getAdType()     // Catch:{ all -> 0x0110 }
            r0 = 94
            if (r9 == r0) goto L_0x0073
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r8.f21943N     // Catch:{ all -> 0x0110 }
            int r9 = r9.getAdType()     // Catch:{ all -> 0x0110 }
            r0 = 287(0x11f, float:4.02E-43)
            if (r9 != r0) goto L_0x004e
            goto L_0x0073
        L_0x004e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r9.<init>()     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f21943N     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = r0.getId()     // Catch:{ all -> 0x0110 }
            r9.append(r0)     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f21943N     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = r0.getVideoUrlEncode()     // Catch:{ all -> 0x0110 }
            r9.append(r0)     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f21943N     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = r0.getBidToken()     // Catch:{ all -> 0x0110 }
            r9.append(r0)     // Catch:{ all -> 0x0110 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0110 }
            goto L_0x0097
        L_0x0073:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r9.<init>()     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f21943N     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = r0.getRequestId()     // Catch:{ all -> 0x0110 }
            r9.append(r0)     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f21943N     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = r0.getId()     // Catch:{ all -> 0x0110 }
            r9.append(r0)     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r8.f21943N     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = r0.getVideoUrlEncode()     // Catch:{ all -> 0x0110 }
            r9.append(r0)     // Catch:{ all -> 0x0110 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0110 }
        L_0x0097:
            com.mbridge.msdk.videocommon.download.c r0 = com.mbridge.msdk.videocommon.download.C9645c.getInstance()     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = r8.m25770o()     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.videocommon.download.a r9 = r0.mo63652a(r1, r9)     // Catch:{ all -> 0x0110 }
            r8.f21954aa = r9     // Catch:{ all -> 0x0110 }
            boolean r9 = r8.f21981q     // Catch:{ all -> 0x0110 }
            if (r9 == 0) goto L_0x00ca
            com.iab.omid.library.mmadbridge.adsession.AdSession r9 = r8.f21983s     // Catch:{ all -> 0x0110 }
            r0 = 0
            if (r9 == 0) goto L_0x00be
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r9 = r8.f21987w     // Catch:{ all -> 0x0110 }
            if (r9 == 0) goto L_0x00b7
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r9 = r8.f21987w     // Catch:{ all -> 0x0110 }
            r9.unregisterView()     // Catch:{ all -> 0x0110 }
        L_0x00b7:
            com.iab.omid.library.mmadbridge.adsession.AdSession r9 = r8.f21983s     // Catch:{ all -> 0x0110 }
            r9.finish()     // Catch:{ all -> 0x0110 }
            r8.f21983s = r0     // Catch:{ all -> 0x0110 }
        L_0x00be:
            com.iab.omid.library.mmadbridge.adsession.media.MediaEvents r9 = r8.f21985u     // Catch:{ all -> 0x0110 }
            if (r9 == 0) goto L_0x00c4
            r8.f21985u = r0     // Catch:{ all -> 0x0110 }
        L_0x00c4:
            com.iab.omid.library.mmadbridge.adsession.AdEvents r9 = r8.f21984t     // Catch:{ all -> 0x0110 }
            if (r9 == 0) goto L_0x00ca
            r8.f21984t = r0     // Catch:{ all -> 0x0110 }
        L_0x00ca:
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r8.f21943N     // Catch:{ all -> 0x0110 }
            if (r9 == 0) goto L_0x0108
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r8.f21943N     // Catch:{ all -> 0x0110 }
            boolean r9 = r9.isActiveOm()     // Catch:{ all -> 0x0110 }
            if (r9 == 0) goto L_0x0108
            android.content.Context r0 = r8.getContext()     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r8.f21943N     // Catch:{ all -> 0x0110 }
            java.lang.String r9 = r9.getVideoUrlEncode()     // Catch:{ all -> 0x0110 }
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r8.f21943N     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = r9.getOmid()     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r8.f21943N     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = r9.getRequestId()     // Catch:{ all -> 0x0110 }
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r8.f21943N     // Catch:{ all -> 0x0110 }
            java.lang.String r4 = r9.getId()     // Catch:{ all -> 0x0110 }
            java.lang.String r5 = r8.m25770o()     // Catch:{ all -> 0x0110 }
            java.lang.String r6 = ""
            com.mbridge.msdk.foundation.entity.CampaignEx r9 = r8.f21943N     // Catch:{ all -> 0x0110 }
            java.lang.String r7 = r9.getRequestIdNotice()     // Catch:{ all -> 0x0110 }
            com.iab.omid.library.mmadbridge.adsession.AdSession r9 = com.mbridge.msdk.p075a.C2427b.m5855a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0110 }
            r8.f21983s = r9     // Catch:{ all -> 0x0110 }
        L_0x0108:
            boolean r9 = r8.f21981q     // Catch:{ all -> 0x0110 }
            if (r9 == 0) goto L_0x011a
            r8.m25747d()     // Catch:{ all -> 0x0110 }
            goto L_0x011a
        L_0x0110:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            java.lang.String r0 = "MBMediaView"
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r0, r9)
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.nativex.view.MBMediaView.setNativeAd(com.mbridge.msdk.out.Campaign):void");
    }

    public void setOnMediaViewListener(OnMBMediaViewListener onMBMediaViewListener) {
        this.f21956ac = onMBMediaViewListener;
    }

    public void setOnMediaViewListener(OnMBMediaViewListenerPlus onMBMediaViewListenerPlus) {
        this.f21957ad = onMBMediaViewListenerPlus;
    }

    public void setIsAllowFullScreen(boolean z) {
        this.f21970d = z;
    }

    public void setAllowVideoRefresh(boolean z) {
        this.f21953a = z;
    }

    public void setAllowLoopPlay(boolean z) {
        this.f21968b = z;
    }

    public void setAllowScreenChange(boolean z) {
        this.f21969c = z;
    }

    public void destory() {
        try {
            if (this.f21987w != null) {
                this.f21987w.release();
            }
            m25724a();
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
        }
    }

    /* renamed from: d */
    private void m25747d() {
        try {
            this.f21955ab = m25721a(true);
            changeNoticeURL();
            if (this.f21955ab == C8917a.BIG_IMAGE) {
                if (!(this.f21943N == null || !TextUtils.isEmpty(this.f21943N.getVideoUrlEncode()) || this.f21983s == null)) {
                    this.f21983s.registerAdView(this.f21932C);
                    this.f21984t = AdEvents.createAdEvents(this.f21983s);
                    this.f21983s.start();
                    if (this.f21984t != null) {
                        this.f21984t.impressionOccurred();
                    }
                }
                m25761j();
                m25767m();
            } else if (this.f21955ab == C8917a.f22012b) {
                m25751e();
            } else if (this.f21955ab == C8917a.GIF) {
                m25768n();
                m25765l();
            }
        } catch (Exception e) {
            C8672v.m24874a("omsdk", e.getMessage());
        } catch (Throwable th) {
            C8672v.m24875a(TAG, th.getMessage(), th);
            return;
        }
        this.f21981q = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m25751e() {
        m25792z();
        m25763k();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m25752f() {
        try {
            if (this.f21955ab == C8917a.BIG_IMAGE && this.f21945P != 0 && this.f21949T != 0 && this.f21948S != 0) {
                int i = (this.f21945P * this.f21949T) / this.f21948S;
                if (this.f21932C != null && i != 0) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f21932C.getLayoutParams();
                    layoutParams.width = this.f21945P;
                    layoutParams.height = i;
                    this.f21932C.setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m25755g() {
        try {
            if (this.f21955ab != C8917a.GIF) {
                return;
            }
            if (this.f21945P != 0 && this.f21949T != 0 && this.f21948S != 0) {
                int i = (this.f21945P * this.f21949T) / this.f21948S;
                if (this.f21990z != null && i != 0) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f21990z.getLayoutParams();
                    layoutParams.width = this.f21945P;
                    layoutParams.height = i;
                    layoutParams.addRule(13);
                    this.f21990z.setLayoutParams(layoutParams);
                }
            } else if (this.f21945P != 0 && this.f21990z != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f21990z.getLayoutParams();
                layoutParams2.width = this.f21945P;
                layoutParams2.height = (this.f21945P * 627) / IronSourceConstants.RV_INSTANCE_LOAD_FAILED;
                layoutParams2.addRule(13);
                this.f21990z.setLayoutParams(layoutParams2);
            }
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m25756h() {
        try {
            if (this.f21955ab == C8917a.f22012b && this.f21988x != null) {
                int A = (int) m25693A();
                int j = C8677z.m24951j(getContext());
                if (!this.f21974h) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f21988x.getLayoutParams();
                    layoutParams.width = this.f21945P;
                    layoutParams.height = this.f21944O;
                    layoutParams.addRule(13);
                    this.f21988x.setLayoutParams(layoutParams);
                } else {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f21936G.getLayoutParams();
                    layoutParams2.width = A;
                    layoutParams2.height = j;
                    layoutParams2.addRule(13);
                    this.f21936G.setLayoutParams(layoutParams2);
                }
                m25774q();
                if (!this.f21974h) {
                    m25726a((View) this.f21987w, (float) this.f21945P, (float) this.f21944O);
                } else {
                    m25726a((View) this.f21987w, (float) A, (float) j);
                }
            }
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
        }
    }

    /* renamed from: i */
    private void m25758i() {
        try {
            this.f21987w.showSoundIndicator(this.f21978l);
            this.f21987w.showProgressView(this.f21977k);
            if (this.f21956ac != null) {
                this.f21956ac.onExitFullscreen();
            }
            if (this.f21957ad != null) {
                this.f21957ad.onExitFullscreen();
            }
            if (this.f21985u != null) {
                this.f21985u.playerStateChange(PlayerState.NORMAL);
            }
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58711a(String str) {
        try {
            if (!TextUtils.isEmpty(str) && !this.f21979m.contains(str)) {
                this.f21979m.add(str);
                if (this.f21956ac != null) {
                    this.f21956ac.onVideoStart();
                }
                if (this.f21957ad != null) {
                    this.f21957ad.onVideoStart();
                }
            }
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo58712b(String str) {
        try {
            if (!TextUtils.isEmpty(str) && !this.f21980n.contains(str)) {
                this.f21980n.add(str);
                if (this.f21957ad != null) {
                    this.f21957ad.onVideoComplete();
                }
            }
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
        }
    }

    /* renamed from: j */
    private void m25761j() {
        try {
            C8677z.m24916a((ImageView) this.f21932C);
            this.f21932C.setVisibility(0);
            this.f21988x.setVisibility(8);
            this.f21990z.setVisibility(8);
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
        }
    }

    /* renamed from: k */
    private void m25763k() {
        try {
            this.f21988x.setVisibility(0);
            this.f21932C.setVisibility(8);
            this.f21990z.setVisibility(8);
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m25765l() {
        try {
            this.f21988x.setVisibility(8);
            this.f21932C.setVisibility(8);
            this.f21990z.setVisibility(0);
            this.f21930A.setVisibility(0);
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
        }
    }

    /* renamed from: m */
    private void m25767m() {
        try {
            if (this.f21943N != null) {
                String imageUrl = this.f21943N.getImageUrl();
                if (!C8616ad.m24717a(imageUrl) && getContext() != null) {
                    C8481b.m24310a(C8388a.m23845e().mo56913g()).mo57883a(imageUrl, (C8484c) new C8484c() {
                        public final void onFailedLoad(String str, String str2) {
                        }

                        public final void onSuccessLoad(Bitmap bitmap, String str) {
                            if (MBMediaView.this.f21932C != null && MBMediaView.this.f21955ab == C8917a.BIG_IMAGE) {
                                if (bitmap != null) {
                                    int unused = MBMediaView.this.f21948S = bitmap.getWidth();
                                    int unused2 = MBMediaView.this.f21949T = bitmap.getHeight();
                                    MBMediaView.this.f21932C.setImageUrl(str);
                                    MBMediaView.this.f21932C.setImageBitmap(bitmap);
                                }
                                MBMediaView.this.f21932C.setOnClickListener(new C9676a() {
                                    /* access modifiers changed from: protected */
                                    /* renamed from: a */
                                    public final void mo58499a(View view) {
                                        if (MBMediaView.this.f21965al != null) {
                                            MBMediaView.this.m25736b(MBMediaView.this.f21965al);
                                        } else {
                                            MBMediaView.this.m25736b(view.getContext());
                                        }
                                    }
                                });
                            }
                        }
                    });
                }
            }
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
        }
    }

    /* renamed from: n */
    private void m25768n() {
        try {
            if (this.f21943N != null) {
                String gifUrl = this.f21943N.getGifUrl();
                if (!C8616ad.m24717a(gifUrl) && getContext() != null) {
                    this.f21930A.loadDataWithBaseURL((String) null, "<!DOCTYPE html><html lang=\"en\"><head>  <meta charset=\"UTF-8\">  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">  <title>Document</title>  <style>  *{    margin: 0;    padding: 0;  }  html, body{    width: 100%;    height: 100%;  }  body{    background-image: url('gifUrl');    background-position: center;    background-size: contain;    background-repeat: no-repeat;  }  </style></head><body></body></html>".replace("gifUrl", gifUrl), "text/html", "utf-8", (String) null);
                    this.f21930A.setInterceptTouch(true);
                    this.f21990z.setOnClickListener(new C9676a() {
                        /* access modifiers changed from: protected */
                        /* renamed from: a */
                        public final void mo58499a(View view) {
                            if (MBMediaView.this.f21965al != null) {
                                MBMediaView mBMediaView = MBMediaView.this;
                                mBMediaView.m25736b(mBMediaView.f21965al);
                            } else {
                                MBMediaView.this.m25736b(view.getContext());
                            }
                            C8672v.m24876b(MBMediaView.TAG, "CLICK WEBVIEW LAYOUT ");
                        }
                    });
                }
            }
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public String m25770o() {
        try {
            if (this.f21943N == null || !C8616ad.m24718b(this.f21943N.getCampaignUnitId())) {
                return null;
            }
            return this.f21943N.getCampaignUnitId();
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private C8917a m25721a(boolean z) {
        C8917a aVar = null;
        try {
            if (this.f21943N == null) {
                return null;
            }
            if (C8616ad.m24717a(this.f21943N.getVideoUrlEncode())) {
                if (C8616ad.m24718b(this.f21943N.getImageUrl())) {
                    aVar = C8917a.BIG_IMAGE;
                }
                if (!C8616ad.m24718b(this.f21943N.getGifUrl())) {
                    return aVar;
                }
                if (C8616ad.m24717a(this.f21943N.getImageUrl())) {
                    aVar = C8917a.GIF;
                }
                this.f21930A.setWebViewClient(new C8925g(this));
                m25768n();
                return aVar;
            } else if (Build.VERSION.SDK_INT < 14 || !this.f21973g || this.f21954aa == null) {
                return C8917a.BIG_IMAGE;
            } else {
                if (C8616ad.m24718b(this.f21943N.getVideoUrlEncode()) && C8616ad.m24717a(this.f21943N.getImageUrl())) {
                    return C8917a.f22012b;
                }
                if (!C8616ad.m24718b(this.f21943N.getVideoUrlEncode()) || !C8616ad.m24718b(this.f21943N.getImageUrl())) {
                    return null;
                }
                if (C9670k.m27583a(this.f21954aa, m25778s())) {
                    return C8917a.f22012b;
                }
                C8917a aVar2 = C8917a.BIG_IMAGE;
                if (!z || !this.f21953a) {
                    return aVar2;
                }
                this.f21954aa.mo63629b((C9673a) new C8924f(this));
                return aVar2;
            }
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
            return C8917a.BIG_IMAGE;
        }
    }

    /* renamed from: p */
    private void m25772p() {
        try {
            if (this.f21943N == null) {
                C8672v.m24876b(TAG, "campaign is null addPlayerView return");
            }
            if (!(this.f21987w == null || this.f21987w.getParent() == null)) {
                ((ViewGroup) this.f21987w.getParent()).removeView(this.f21987w);
            }
            m25763k();
            MediaViewPlayerView mediaViewPlayerView = new MediaViewPlayerView(getContext());
            this.f21987w = mediaViewPlayerView;
            mediaViewPlayerView.showProgressView(this.f21977k);
            this.f21987w.showSoundIndicator(this.f21978l);
            if (this.f21972f) {
                this.f21987w.openSound();
            } else {
                this.f21987w.closeSound();
            }
            this.f21987w.setAllowLoopPlay(this.f21968b);
            this.f21987w.initPlayerViewData(m25776r(), this.f21943N, m25783u(), this, this.f21954aa, m25770o());
            this.f21987w.setOnMediaViewPlayerViewListener(new C8919c(this));
            this.f21988x.addView(this.f21987w, -1, -1);
            if (this.f21987w != null) {
                this.f21987w.setOnClickListener(new C9676a() {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public final void mo58499a(View view) {
                        try {
                            if (!MBMediaView.this.f21974h) {
                                MBMediaView.m25748d(MBMediaView.this);
                            }
                            MBMediaView.this.f21987w.showSoundIndicator(true);
                            MBMediaView.this.f21987w.showProgressView(true);
                            if (MBMediaView.this.f21970d && !MBMediaView.this.f21974h && (MBMediaView.this.f21934E == null || MBMediaView.this.f21934E.getParent() == null)) {
                                if (!MBMediaView.this.f21987w.halfLoadingViewisVisible()) {
                                    if (MBMediaView.this.f21987w.isPlaying()) {
                                        MBMediaView.m25757h(MBMediaView.this);
                                        return;
                                    }
                                }
                                C8672v.m24876b(MBMediaView.TAG, "is loading or no playing return;");
                            } else if (MBMediaView.this.f21974h) {
                                C8672v.m24876b(MBMediaView.TAG, "fullScreenShowUI");
                                MBMediaView.m25759i(MBMediaView.this);
                            } else {
                                if (MBMediaView.this.f21965al != null) {
                                    MBMediaView.this.m25736b(MBMediaView.this.f21965al);
                                } else {
                                    MBMediaView.this.m25736b(view.getContext());
                                }
                                if (MBMediaView.this.f21985u != null) {
                                    MBMediaView.this.f21985u.adUserInteraction(InteractionType.CLICK);
                                }
                            }
                        } catch (Throwable th) {
                            C8672v.m24875a(MBMediaView.TAG, th.getMessage(), th);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
            return;
        }
        if (this.f21983s != null) {
            if (this.f21987w != null) {
                this.f21987w.registerView(this.f21983s);
            }
            this.f21984t = AdEvents.createAdEvents(this.f21983s);
            this.f21985u = MediaEvents.createMediaEvents(this.f21983s);
            this.f21983s.start();
            this.f21984t.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
            this.f21987w.setVideoEvents(this.f21985u);
            try {
                if (this.f21984t != null) {
                    this.f21984t.impressionOccurred();
                }
            } catch (Exception e) {
                C8672v.m24874a("omsdk", e.getMessage());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m25774q() {
        try {
            if (getVisibility() == 0) {
                if (m25731a((View) this)) {
                    int i = 0;
                    C2456d t = m25780t();
                    if (t != null) {
                        i = t.mo16313d();
                    }
                    Message obtainMessage = this.f21942M.obtainMessage();
                    obtainMessage.what = 3;
                    obtainMessage.obj = this;
                    this.f21942M.sendMessageDelayed(obtainMessage, (long) ((i * 1000) + 300));
                }
                if (this.f21955ab != C8917a.f22012b) {
                    return;
                }
                if (this.f21987w == null) {
                    m25772p();
                } else if (this.f21943N != this.f21987w.getCampaign()) {
                    this.f21987w.release();
                    m25772p();
                    if (getParent() != null) {
                        ((View) getParent()).invalidate();
                    }
                    requestLayout();
                }
            }
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
        }
    }

    /* renamed from: r */
    private String m25776r() {
        try {
            if (this.f21943N == null) {
                return null;
            }
            if (this.f21954aa != null && this.f21954aa.mo63639f() == 5) {
                String d = this.f21954aa.mo63635d();
                if (new File(d).exists() && this.f21954aa.mo63637e() == C8677z.m24908a(new File(d))) {
                    return d;
                }
            }
            String videoUrlEncode = this.f21943N.getVideoUrlEncode();
            if (C8616ad.m24718b(videoUrlEncode)) {
                return videoUrlEncode;
            }
            return null;
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m25731a(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0) {
                    Rect rect = new Rect();
                    if (!view.getLocalVisibleRect(rect)) {
                        return false;
                    }
                    long height = (long) (rect.height() * rect.width());
                    long height2 = (long) (view.getHeight() * view.getWidth());
                    long j = (long) (((float) height2) * 0.5f);
                    if (height2 > 0 && C8677z.m24956l(getContext()) && this.f21971e && height >= j && isShown()) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                C8672v.m24878d(TAG, th.getMessage());
            }
        }
        return false;
    }

    /* renamed from: s */
    private int m25778s() {
        if (m25780t() != null) {
            return m25780t().mo16314e();
        }
        return 100;
    }

    /* renamed from: t */
    private C2456d m25780t() {
        try {
            if (this.f21943N == null) {
                return null;
            }
            if (C8616ad.m24717a(this.f21943N.getCampaignUnitId())) {
                return null;
            }
            String campaignUnitId = this.f21943N.getCampaignUnitId();
            String h = C8388a.m23845e().mo56914h();
            if (!C8616ad.m24717a(campaignUnitId)) {
                if (!C8616ad.m24717a(h)) {
                    C2456d e = C2445b.m6020a().mo16292e(h, campaignUnitId);
                    if (e != null) {
                        return e;
                    }
                    return C2456d.m6070d(campaignUnitId);
                }
            }
            return C2456d.m6070d(campaignUnitId);
        } catch (Exception e2) {
            C8672v.m24878d(TAG, e2.getMessage());
            return null;
        }
    }

    /* renamed from: u */
    private boolean m25783u() {
        try {
            C2456d t = m25780t();
            if (t == null) {
                return false;
            }
            int i = t.mo16319i();
            if (i == 1) {
                if (C8677z.m24929b(getContext())) {
                    return true;
                }
                return false;
            } else if (i == 2) {
                return false;
            } else {
                if (i == 3) {
                    if (C8677z.m24933c(getContext())) {
                        return true;
                    }
                    return false;
                } else if (C8677z.m24929b(getContext())) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
        }
    }

    public void onPlayStarted(int i) {
        MediaEvents mediaEvents = this.f21985u;
        if (mediaEvents != null) {
            try {
                mediaEvents.start((float) i, this.f21972f ? 1.0f : 0.0f);
            } catch (IllegalArgumentException e) {
                C8672v.m24874a("omsdk", e.getMessage());
            }
        }
    }

    public void onPlayCompleted() {
        MediaEvents mediaEvents = this.f21985u;
        if (mediaEvents != null) {
            mediaEvents.complete();
        }
    }

    public void onPlayError(final String str) {
        try {
            C8672v.m24876b("error", str);
            C890515 r0 = new Runnable() {
                public final void run() {
                    MBMediaView.m25777r(MBMediaView.this);
                    MBMediaView.m25730a(MBMediaView.this, str);
                    NativeController.insertExcludeId(MBMediaView.this.f21943N.getCampaignUnitId(), MBMediaView.this.f21943N);
                }
            };
            if (C8396b.m23890a().mo56951d()) {
                C8498b.m24359a().execute(r0);
            } else {
                r0.run();
            }
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
        }
    }

    public void onBufferingStart(String str) {
        C8672v.m24876b("bufferMsg", str);
        MediaEvents mediaEvents = this.f21985u;
        if (mediaEvents != null) {
            mediaEvents.bufferStart();
        }
    }

    public void onBufferingEnd() {
        C8672v.m24876b("bufferend", "bufferend");
        MediaEvents mediaEvents = this.f21985u;
        if (mediaEvents != null) {
            mediaEvents.bufferFinish();
        }
    }

    public void onPlaySetDataSourceError(String str) {
        C8672v.m24876b("errorstr", str);
    }

    /* renamed from: com.mbridge.msdk.nativex.view.MBMediaView$10 */
    static /* synthetic */ class C889910 {

        /* renamed from: a */
        static final /* synthetic */ int[] f21992a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.mbridge.msdk.nativex.view.mbfullview.BaseView$a[] r0 = com.mbridge.msdk.nativex.view.mbfullview.BaseView.C8936a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21992a = r0
                com.mbridge.msdk.nativex.view.mbfullview.BaseView$a r1 = com.mbridge.msdk.nativex.view.mbfullview.BaseView.C8936a.FULL_MIDDLE_VIEW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21992a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.mbridge.msdk.nativex.view.mbfullview.BaseView$a r1 = com.mbridge.msdk.nativex.view.mbfullview.BaseView.C8936a.FULL_TOP_VIEW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.nativex.view.MBMediaView.C889910.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public View m25784v() {
        try {
            this.f21961ah = new RelativeLayout(getContext());
            this.f21961ah.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            ImageView imageView = new ImageView(getContext());
            this.f21962ai = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C8677z.m24924b(getContext(), 30.0f), C8677z.m24924b(getContext(), 30.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            layoutParams.topMargin = C8677z.m24924b(getContext(), 8.0f);
            layoutParams.rightMargin = C8677z.m24924b(getContext(), 8.0f);
            this.f21962ai.setLayoutParams(layoutParams);
            this.f21962ai.setBackgroundResource(C8658p.m24799a(getContext(), "mbridge_nativex_close", "drawable"));
            this.f21962ai.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    MBMediaView.this.exitFullScreen();
                }
            });
            this.f21931B.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f21961ah.addView(this.f21931B);
            this.f21961ah.addView(this.f21962ai);
            return this.f21961ah;
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
            return null;
        }
    }

    public void exitFullScreen() {
        try {
            m25787w();
            if (this.f21968b) {
                this.f21987w.onClickPlayButton();
            }
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
        }
    }

    public void showEndCardWebViewCloseBtn() {
        ImageView imageView = this.f21962ai;
        if (imageView != null && imageView.getVisibility() != 0) {
            this.f21962ai.setVisibility(0);
        }
    }

    public void hideEndCardWebViewCloseBtn() {
        ImageView imageView = this.f21962ai;
        if (imageView != null && imageView.getVisibility() == 0) {
            this.f21962ai.setVisibility(8);
        }
    }

    /* JADX WARNING: type inference failed for: r0v39, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v23, types: [android.view.View] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m25787w() {
        /*
            r12 = this;
            java.lang.String r0 = "mbridge_full_player_parent"
            java.lang.String r1 = "mbridge_full_rl_playcontainer"
            java.lang.String r2 = "id"
            android.view.View r3 = r12.getRootView()     // Catch:{ Exception -> 0x0238 }
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r3 = r3.findViewById(r4)     // Catch:{ Exception -> 0x0238 }
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3     // Catch:{ Exception -> 0x0238 }
            android.view.View r4 = r12.getRootView()     // Catch:{ Exception -> 0x0238 }
            r5 = 100
            android.view.View r4 = r4.findViewById(r5)     // Catch:{ Exception -> 0x0238 }
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4     // Catch:{ Exception -> 0x0238 }
            android.view.View r5 = r12.getRootView()     // Catch:{ Exception -> 0x0238 }
            r6 = 101(0x65, float:1.42E-43)
            android.view.View r5 = r5.findViewById(r6)     // Catch:{ Exception -> 0x0238 }
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5     // Catch:{ Exception -> 0x0238 }
            android.view.View r6 = r12.getRootView()     // Catch:{ Exception -> 0x0238 }
            r7 = 103(0x67, float:1.44E-43)
            android.view.View r6 = r6.findViewById(r7)     // Catch:{ Exception -> 0x0238 }
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6     // Catch:{ Exception -> 0x0238 }
            if (r6 != 0) goto L_0x0041
            if (r5 == 0) goto L_0x0041
            android.view.View r6 = r5.findViewById(r7)     // Catch:{ Exception -> 0x0238 }
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6     // Catch:{ Exception -> 0x0238 }
        L_0x0041:
            android.view.View r7 = r12.getRootView()     // Catch:{ Exception -> 0x0238 }
            android.content.Context r8 = r12.getContext()     // Catch:{ Exception -> 0x0238 }
            int r8 = com.mbridge.msdk.foundation.tools.C8658p.m24799a(r8, r1, r2)     // Catch:{ Exception -> 0x0238 }
            android.view.View r7 = r7.findViewById(r8)     // Catch:{ Exception -> 0x0238 }
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7     // Catch:{ Exception -> 0x0238 }
            if (r7 != 0) goto L_0x0066
            if (r6 == 0) goto L_0x0066
            android.content.Context r7 = r12.getContext()     // Catch:{ Exception -> 0x0238 }
            int r1 = com.mbridge.msdk.foundation.tools.C8658p.m24799a(r7, r1, r2)     // Catch:{ Exception -> 0x0238 }
            android.view.View r1 = r6.findViewById(r1)     // Catch:{ Exception -> 0x0238 }
            r7 = r1
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7     // Catch:{ Exception -> 0x0238 }
        L_0x0066:
            android.view.View r1 = r12.getRootView()     // Catch:{ Exception -> 0x0238 }
            android.content.Context r8 = r12.getContext()     // Catch:{ Exception -> 0x0238 }
            int r8 = com.mbridge.msdk.foundation.tools.C8658p.m24799a(r8, r0, r2)     // Catch:{ Exception -> 0x0238 }
            android.view.View r1 = r1.findViewById(r8)     // Catch:{ Exception -> 0x0238 }
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1     // Catch:{ Exception -> 0x0238 }
            if (r1 != 0) goto L_0x008b
            if (r7 == 0) goto L_0x008b
            android.content.Context r1 = r12.getContext()     // Catch:{ Exception -> 0x0238 }
            int r0 = com.mbridge.msdk.foundation.tools.C8658p.m24799a(r1, r0, r2)     // Catch:{ Exception -> 0x0238 }
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ Exception -> 0x0238 }
            r1 = r0
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1     // Catch:{ Exception -> 0x0238 }
        L_0x008b:
            android.view.View r0 = r12.getRootView()     // Catch:{ Exception -> 0x0238 }
            android.content.Context r8 = r12.getContext()     // Catch:{ Exception -> 0x0238 }
            java.lang.String r9 = "mbridge_full_pb_loading"
            int r8 = com.mbridge.msdk.foundation.tools.C8658p.m24799a(r8, r9, r2)     // Catch:{ Exception -> 0x0238 }
            android.view.View r0 = r0.findViewById(r8)     // Catch:{ Exception -> 0x0238 }
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0     // Catch:{ Exception -> 0x0238 }
            android.view.View r8 = r12.getRootView()     // Catch:{ Exception -> 0x0238 }
            android.content.Context r9 = r12.getContext()     // Catch:{ Exception -> 0x0238 }
            java.lang.String r10 = "mbridge_full_rl_install"
            int r9 = com.mbridge.msdk.foundation.tools.C8658p.m24799a(r9, r10, r2)     // Catch:{ Exception -> 0x0238 }
            android.view.View r8 = r8.findViewById(r9)     // Catch:{ Exception -> 0x0238 }
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8     // Catch:{ Exception -> 0x0238 }
            android.view.View r9 = r12.getRootView()     // Catch:{ Exception -> 0x0238 }
            android.content.Context r10 = r12.getContext()     // Catch:{ Exception -> 0x0238 }
            java.lang.String r11 = "mbridge_full_ll_pro_dur"
            int r2 = com.mbridge.msdk.foundation.tools.C8658p.m24799a(r10, r11, r2)     // Catch:{ Exception -> 0x0238 }
            android.view.View r2 = r9.findViewById(r2)     // Catch:{ Exception -> 0x0238 }
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2     // Catch:{ Exception -> 0x0238 }
            r9 = 0
            if (r4 == 0) goto L_0x00d1
            android.view.ViewParent r10 = r4.getParent()     // Catch:{ Exception -> 0x0238 }
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10     // Catch:{ Exception -> 0x0238 }
            goto L_0x00d2
        L_0x00d1:
            r10 = r9
        L_0x00d2:
            if (r6 == 0) goto L_0x00d8
            r6.removeView(r2)     // Catch:{ Exception -> 0x0238 }
            goto L_0x00e9
        L_0x00d8:
            if (r2 == 0) goto L_0x00e9
            android.view.ViewParent r11 = r2.getParent()     // Catch:{ Exception -> 0x0238 }
            if (r11 == 0) goto L_0x00e9
            android.view.ViewParent r11 = r2.getParent()     // Catch:{ Exception -> 0x0238 }
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11     // Catch:{ Exception -> 0x0238 }
            r11.removeView(r2)     // Catch:{ Exception -> 0x0238 }
        L_0x00e9:
            android.widget.RelativeLayout r2 = r12.f21961ah     // Catch:{ Exception -> 0x0238 }
            if (r2 == 0) goto L_0x0118
            if (r6 == 0) goto L_0x00f5
            android.widget.RelativeLayout r2 = r12.f21961ah     // Catch:{ Exception -> 0x0238 }
            r6.removeView(r2)     // Catch:{ Exception -> 0x0238 }
            goto L_0x010a
        L_0x00f5:
            android.widget.RelativeLayout r2 = r12.f21961ah     // Catch:{ Exception -> 0x0238 }
            android.view.ViewParent r2 = r2.getParent()     // Catch:{ Exception -> 0x0238 }
            if (r2 == 0) goto L_0x010a
            android.widget.RelativeLayout r2 = r12.f21961ah     // Catch:{ Exception -> 0x0238 }
            android.view.ViewParent r2 = r2.getParent()     // Catch:{ Exception -> 0x0238 }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ Exception -> 0x0238 }
            android.widget.RelativeLayout r11 = r12.f21961ah     // Catch:{ Exception -> 0x0238 }
            r2.removeView(r11)     // Catch:{ Exception -> 0x0238 }
        L_0x010a:
            com.mbridge.msdk.nativex.view.WindVaneWebViewForNV r2 = r12.f21931B     // Catch:{ Exception -> 0x0238 }
            r2.setBackListener(r9)     // Catch:{ Exception -> 0x0238 }
            com.mbridge.msdk.nativex.view.WindVaneWebViewForNV r2 = r12.f21931B     // Catch:{ Exception -> 0x0238 }
            r2.setObject(r9)     // Catch:{ Exception -> 0x0238 }
            r12.f21931B = r9     // Catch:{ Exception -> 0x0238 }
            r12.f21961ah = r9     // Catch:{ Exception -> 0x0238 }
        L_0x0118:
            if (r6 == 0) goto L_0x011e
            r6.removeView(r8)     // Catch:{ Exception -> 0x0238 }
            goto L_0x012f
        L_0x011e:
            if (r8 == 0) goto L_0x012f
            android.view.ViewParent r2 = r8.getParent()     // Catch:{ Exception -> 0x0238 }
            if (r2 == 0) goto L_0x012f
            android.view.ViewParent r2 = r8.getParent()     // Catch:{ Exception -> 0x0238 }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ Exception -> 0x0238 }
            r2.removeView(r8)     // Catch:{ Exception -> 0x0238 }
        L_0x012f:
            if (r6 == 0) goto L_0x0135
            r6.removeView(r0)     // Catch:{ Exception -> 0x0238 }
            goto L_0x0146
        L_0x0135:
            if (r0 == 0) goto L_0x0146
            android.view.ViewParent r2 = r0.getParent()     // Catch:{ Exception -> 0x0238 }
            if (r2 == 0) goto L_0x0146
            android.view.ViewParent r2 = r0.getParent()     // Catch:{ Exception -> 0x0238 }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ Exception -> 0x0238 }
            r2.removeView(r0)     // Catch:{ Exception -> 0x0238 }
        L_0x0146:
            if (r1 == 0) goto L_0x014d
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r0 = r12.f21987w     // Catch:{ Exception -> 0x0238 }
            r1.removeView(r0)     // Catch:{ Exception -> 0x0238 }
        L_0x014d:
            if (r7 == 0) goto L_0x0153
            r7.removeView(r1)     // Catch:{ Exception -> 0x0238 }
            goto L_0x0164
        L_0x0153:
            if (r1 == 0) goto L_0x0164
            android.view.ViewParent r0 = r1.getParent()     // Catch:{ Exception -> 0x0238 }
            if (r0 == 0) goto L_0x0164
            android.view.ViewParent r0 = r1.getParent()     // Catch:{ Exception -> 0x0238 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x0238 }
            r0.removeView(r1)     // Catch:{ Exception -> 0x0238 }
        L_0x0164:
            if (r6 == 0) goto L_0x016a
            r6.removeView(r7)     // Catch:{ Exception -> 0x0238 }
            goto L_0x0187
        L_0x016a:
            if (r7 == 0) goto L_0x017c
            android.view.ViewParent r0 = r7.getParent()     // Catch:{ Exception -> 0x0238 }
            if (r0 == 0) goto L_0x017c
            android.view.ViewParent r0 = r7.getParent()     // Catch:{ Exception -> 0x0238 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x0238 }
            r0.removeView(r7)     // Catch:{ Exception -> 0x0238 }
            goto L_0x0187
        L_0x017c:
            com.mbridge.msdk.nativex.view.mbfullview.BaseView r0 = r12.f21935F     // Catch:{ Exception -> 0x0238 }
            if (r0 == 0) goto L_0x0187
            com.mbridge.msdk.nativex.view.mbfullview.BaseView r0 = r12.f21935F     // Catch:{ Exception -> 0x0238 }
            android.widget.RelativeLayout r1 = r12.f21936G     // Catch:{ Exception -> 0x0238 }
            r0.removeView(r1)     // Catch:{ Exception -> 0x0238 }
        L_0x0187:
            if (r5 == 0) goto L_0x018d
            r5.removeView(r6)     // Catch:{ Exception -> 0x0238 }
            goto L_0x01b9
        L_0x018d:
            if (r6 == 0) goto L_0x019f
            android.view.ViewParent r0 = r6.getParent()     // Catch:{ Exception -> 0x0238 }
            if (r0 == 0) goto L_0x019f
            android.view.ViewParent r0 = r6.getParent()     // Catch:{ Exception -> 0x0238 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x0238 }
            r0.removeView(r6)     // Catch:{ Exception -> 0x0238 }
            goto L_0x01b9
        L_0x019f:
            android.view.View r0 = r12.f21934E     // Catch:{ Exception -> 0x0238 }
            if (r0 == 0) goto L_0x01b9
            android.view.View r0 = r12.f21934E     // Catch:{ Exception -> 0x0238 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x0238 }
            com.mbridge.msdk.nativex.view.mbfullview.BaseView r1 = r12.f21935F     // Catch:{ Exception -> 0x0238 }
            r0.removeView(r1)     // Catch:{ Exception -> 0x0238 }
            android.view.View r0 = r12.f21934E     // Catch:{ Exception -> 0x0238 }
            android.view.ViewParent r0 = r0.getParent()     // Catch:{ Exception -> 0x0238 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x0238 }
            android.view.View r1 = r12.f21934E     // Catch:{ Exception -> 0x0238 }
            r0.removeView(r1)     // Catch:{ Exception -> 0x0238 }
        L_0x01b9:
            if (r3 == 0) goto L_0x01e2
            if (r5 == 0) goto L_0x01c1
            r3.removeView(r5)     // Catch:{ Exception -> 0x0238 }
            goto L_0x01e2
        L_0x01c1:
            android.view.View r0 = r12.f21934E     // Catch:{ Exception -> 0x0238 }
            r3.removeView(r0)     // Catch:{ Exception -> 0x0238 }
            android.view.View r0 = r12.f21934E     // Catch:{ Exception -> 0x0238 }
            android.view.ViewParent r0 = r0.getParent()     // Catch:{ Exception -> 0x0238 }
            if (r0 == 0) goto L_0x01e2
            android.view.View r0 = r12.f21934E     // Catch:{ Exception -> 0x0238 }
            android.view.ViewParent r0 = r0.getParent()     // Catch:{ Exception -> 0x0238 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x0238 }
            android.view.View r1 = r12.f21934E     // Catch:{ Exception -> 0x0238 }
            r0.removeView(r1)     // Catch:{ Exception -> 0x0238 }
            android.view.View r0 = r12.f21934E     // Catch:{ Exception -> 0x0238 }
            r1 = 8
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x0238 }
        L_0x01e2:
            r0 = 0
            r12.setVisibility(r0)     // Catch:{ Exception -> 0x0238 }
            r12.requestLayout()     // Catch:{ Exception -> 0x0238 }
            if (r10 == 0) goto L_0x0215
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r1 = r12.f21987w     // Catch:{ Exception -> 0x0238 }
            android.view.ViewParent r1 = r1.getParent()     // Catch:{ Exception -> 0x0238 }
            if (r1 == 0) goto L_0x0208
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r1 = r12.f21987w     // Catch:{ Exception -> 0x0238 }
            android.view.ViewParent r1 = r1.getParent()     // Catch:{ Exception -> 0x0238 }
            if (r1 == r10) goto L_0x0208
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r1 = r12.f21987w     // Catch:{ Exception -> 0x0238 }
            android.view.ViewParent r1 = r1.getParent()     // Catch:{ Exception -> 0x0238 }
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch:{ Exception -> 0x0238 }
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r2 = r12.f21987w     // Catch:{ Exception -> 0x0238 }
            r1.removeView(r2)     // Catch:{ Exception -> 0x0238 }
        L_0x0208:
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r1 = r12.f21987w     // Catch:{ Exception -> 0x0238 }
            int r2 = r12.f21941L     // Catch:{ Exception -> 0x0238 }
            r10.addView(r1, r2)     // Catch:{ Exception -> 0x0238 }
            r10.removeView(r4)     // Catch:{ Exception -> 0x0238 }
            r10.invalidate()     // Catch:{ Exception -> 0x0238 }
        L_0x0215:
            r12.m25758i()     // Catch:{ Exception -> 0x0238 }
            r12.f21974h = r0     // Catch:{ Exception -> 0x0238 }
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r0 = r12.f21987w     // Catch:{ Exception -> 0x0238 }
            if (r0 == 0) goto L_0x0242
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r0 = r12.f21987w     // Catch:{ Exception -> 0x0238 }
            r0.setExitFullScreen()     // Catch:{ Exception -> 0x0238 }
            boolean r0 = r12.f21972f     // Catch:{ Exception -> 0x0238 }
            if (r0 == 0) goto L_0x022d
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r0 = r12.f21987w     // Catch:{ Exception -> 0x0238 }
            r0.openSound()     // Catch:{ Exception -> 0x0238 }
            goto L_0x0232
        L_0x022d:
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r0 = r12.f21987w     // Catch:{ Exception -> 0x0238 }
            r0.closeSound()     // Catch:{ Exception -> 0x0238 }
        L_0x0232:
            com.mbridge.msdk.nativex.view.MediaViewPlayerView r0 = r12.f21987w     // Catch:{ Exception -> 0x0238 }
            r0.gonePauseView()     // Catch:{ Exception -> 0x0238 }
            goto L_0x0242
        L_0x0238:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "MBMediaView"
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r0)
        L_0x0242:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.nativex.view.MBMediaView.m25787w():void");
    }

    /* renamed from: x */
    private boolean m25789x() {
        try {
            this.f21936G = this.f21935F.getMBridgeFullPlayContainer();
            this.f21940K = this.f21935F.getMBridgeFullPlayerParent();
            this.f21937H = this.f21935F.getMBridgeFullClose();
            this.f21938I = this.f21935F.getMBridgeFullTvInstall();
            this.f21939J = this.f21935F.getMBridgeFullPb();
            return true;
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
            return false;
        }
    }

    /* renamed from: y */
    private void m25791y() {
        try {
            this.f21975i = C8677z.m24949i(getContext()) >= C8677z.m24951j(getContext());
            this.f21976j = this.f21975i;
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
        }
    }

    /* renamed from: z */
    private void m25792z() {
        try {
            if (this.f21943N == null) {
                return;
            }
            if (!C8616ad.m24717a(this.f21943N.getVideoResolution())) {
                String[] split = this.f21943N.getVideoResolution().split("x");
                if (split != null && split.length == 2) {
                    String str = split[0];
                    String str2 = split[1];
                    double b = C8677z.m24922b(str);
                    double b2 = C8677z.m24922b(str2);
                    if (b > 0.0d && b2 > 0.0d) {
                        this.f21946Q = b;
                        this.f21947R = b2;
                    }
                }
            }
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public float m25693A() {
        try {
            float i = (float) C8677z.m24949i(getContext());
            return this.f21975i ? i + ((float) C8677z.m24953k(getContext())) : i;
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
            return 0.0f;
        }
    }

    /* renamed from: B */
    private float m25695B() {
        try {
            float j = (float) C8677z.m24951j(getContext());
            return !this.f21975i ? j + ((float) C8677z.m24953k(getContext())) : j;
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
            return 0.0f;
        }
    }

    /* renamed from: c */
    private boolean m25744c(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    /* renamed from: a */
    private void m25726a(View view, float f, float f2) {
        if (view != null) {
            try {
                double d = 0.0d;
                if (this.f21946Q > 0.0d) {
                    if (this.f21947R > 0.0d) {
                        double d2 = this.f21946Q / this.f21947R;
                        if (f > 0.0f && f2 > 0.0f) {
                            d = (double) (f / f2);
                        }
                        double a = C8677z.m24904a(Double.valueOf(d2));
                        double a2 = C8677z.m24904a(Double.valueOf(d));
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f21988x.getLayoutParams();
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                        boolean z = m25744c(getContext()) && this.f21975i;
                        int i = -1;
                        if (a > a2) {
                            double d3 = (((double) f) * this.f21947R) / this.f21946Q;
                            layoutParams2.width = -1;
                            if (!z) {
                                i = (int) d3;
                            }
                            layoutParams2.height = i;
                            layoutParams2.addRule(13);
                            layoutParams.width = this.f21945P;
                            layoutParams.height = (int) d3;
                            layoutParams.addRule(13);
                        } else if (a < a2) {
                            double d4 = ((double) f2) * d2;
                            layoutParams2.width = z ? -1 : (int) d4;
                            layoutParams2.height = -1;
                            layoutParams2.addRule(13);
                            layoutParams.width = (int) d4;
                            layoutParams.height = this.f21944O;
                            layoutParams.addRule(13);
                        } else {
                            layoutParams2.width = -1;
                            layoutParams2.height = -1;
                            layoutParams.width = this.f21945P;
                            layoutParams.height = this.f21944O;
                            layoutParams.addRule(13);
                        }
                        if (!this.f21974h) {
                            this.f21988x.setLayoutParams(layoutParams);
                        }
                        view.setLayoutParams(layoutParams2);
                        return;
                    }
                }
                m25737b(view);
            } catch (Throwable th) {
                C8672v.m24878d(TAG, th.getMessage());
            }
        }
    }

    /* renamed from: b */
    private void m25737b(View view) {
        if (view != null) {
            try {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                layoutParams.width = -1;
                if (this.f21975i) {
                    layoutParams.height = -1;
                } else {
                    layoutParams.height = (((int) m25693A()) * 9) / 16;
                    layoutParams.addRule(13);
                }
                view.setLayoutParams(layoutParams);
            } catch (Exception e) {
                C8672v.m24878d(TAG, e.getMessage());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m25697C() {
        try {
            if (this.f21937H != null || this.f21962ai != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C8677z.m24924b(getContext(), 30.0f), C8677z.m24924b(getContext(), 30.0f));
                layoutParams.addRule(11);
                layoutParams.addRule(10);
                layoutParams.topMargin = C8677z.m24924b(getContext(), 8.0f);
                layoutParams.rightMargin = C8677z.m24924b(getContext(), 8.0f);
                if (this.f21937H != null) {
                    this.f21937H.setLayoutParams(layoutParams);
                }
                if (this.f21962ai != null) {
                    this.f21962ai.setLayoutParams(layoutParams);
                }
                updateViewManger(false);
            }
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public void m25700D() {
        try {
            if (this.f21937H != null || this.f21962ai != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C8677z.m24924b(getContext(), 30.0f), C8677z.m24924b(getContext(), 30.0f));
                layoutParams.addRule(11);
                layoutParams.addRule(10);
                if (this.f21958ae != 0 || !C8677z.m24749a(getContext())) {
                    layoutParams.rightMargin = C8677z.m24924b(getContext(), 8.0f);
                } else {
                    layoutParams.rightMargin = C8677z.m24953k(getContext()) + C8677z.m24924b(getContext(), 8.0f);
                }
                layoutParams.topMargin = C8677z.m24924b(getContext(), 8.0f);
                if (this.f21937H != null) {
                    this.f21937H.setLayoutParams(layoutParams);
                }
                if (this.f21962ai != null) {
                    this.f21962ai.setLayoutParams(layoutParams);
                }
                updateViewManger(true);
            }
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
        }
    }

    public void updateViewManger(boolean z) {
        C8937a a = C8937a.m25852a(getContext());
        boolean z2 = true;
        int i = 0;
        if (a != null) {
            try {
                this.f21935F.getmAnimationPlayer().clearAnimation();
                a.mo58853a(z, !this.f21987w.isComplete(), this.f21935F);
                a.mo58852a(z, this.f21935F, this.f21958ae);
            } catch (NullPointerException e) {
                e.printStackTrace();
                return;
            }
        }
        if ((this.f21935F instanceof MBridgeTopFullView) && a != null) {
            if (z) {
                z2 = false;
            }
            BaseView baseView = this.f21935F;
            if (baseView instanceof MBridgeTopFullView) {
                MBridgeTopFullView mBridgeTopFullView = (MBridgeTopFullView) baseView;
                if (!z2) {
                    i = 8;
                }
                mBridgeTopFullView.getMBridgeFullViewDisplayIcon().setVisibility(i);
                mBridgeTopFullView.getMBridgeFullViewDisplayTitle().setVisibility(i);
                mBridgeTopFullView.getMBridgeFullViewDisplayDscription().setVisibility(i);
                mBridgeTopFullView.getStarLevelLayoutView().setVisibility(i);
            }
        }
    }

    /* renamed from: E */
    private void m25701E() {
        int i;
        try {
            if (this.f21943N != null && this.f21943N.getNativeVideoTracking() != null) {
                String[] a = this.f21943N.getNativeVideoTracking().mo57753a();
                if (this.f21975i) {
                    i = f21928o;
                } else {
                    i = f21929p;
                }
                for (String str : a) {
                    if (!TextUtils.isEmpty(str)) {
                        C6765a.m20557a(getContext(), this.f21943N, this.f21943N.getCampaignUnitId(), str + "&orienation=" + i, false, false);
                    }
                }
            }
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
        }
    }

    public void changeNoticeURL() {
        String str;
        CampaignEx campaignEx = this.f21943N;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (!TextUtils.isEmpty(noticeUrl)) {
                if (!noticeUrl.contains("is_video")) {
                    if (this.f21955ab == C8917a.f22012b) {
                        str = "1";
                    } else {
                        str = this.f21955ab == C8917a.BIG_IMAGE ? "2" : "";
                    }
                    StringBuilder sb = new StringBuilder(noticeUrl);
                    if (noticeUrl.contains("?")) {
                        sb.append("&is_video=");
                        sb.append(str);
                    } else {
                        sb.append("?is_video=");
                        sb.append(str);
                    }
                    noticeUrl = sb.toString();
                } else if (this.f21955ab == C8917a.f22012b) {
                    if (noticeUrl.contains("is_video=2")) {
                        noticeUrl = noticeUrl.replace("is_video=2", "is_video=1");
                    }
                } else if (this.f21955ab == C8917a.BIG_IMAGE && noticeUrl.contains("is_video=1")) {
                    noticeUrl = noticeUrl.replace("is_video=1", "is_video=2");
                }
                this.f21943N.setNoticeUrl(noticeUrl);
            }
        }
    }

    public String getAddNVT2ToNoticeURL() {
        CampaignEx campaignEx = this.f21943N;
        if (campaignEx == null) {
            return null;
        }
        String noticeUrl = campaignEx.getNoticeUrl();
        if (TextUtils.isEmpty(noticeUrl) || noticeUrl.contains(CampaignEx.JSON_KEY_NV_T2)) {
            return noticeUrl;
        }
        return noticeUrl + "&nv_t2=" + this.f21943N.getNvT2();
    }

    public boolean canShowVideo() {
        if (m25721a(false) == C8917a.f22012b) {
            return true;
        }
        return false;
    }

    /* renamed from: com.mbridge.msdk.nativex.view.MBMediaView$e */
    private class C8921e implements SensorEventListener {
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        private C8921e() {
        }

        public final void onSensorChanged(SensorEvent sensorEvent) {
            int i;
            if (!MBMediaView.this.f21964ak) {
                try {
                    float[] fArr = sensorEvent.values;
                    float f = -fArr[0];
                    float f2 = -fArr[1];
                    float f3 = -fArr[2];
                    if (((f * f) + (f2 * f2)) * 4.0f >= f3 * f3) {
                        i = 90 - Math.round(((float) Math.atan2((double) (-f2), (double) f)) * 57.29578f);
                        while (i >= 360) {
                            i -= 360;
                        }
                        while (i < 0) {
                            i += 360;
                        }
                    } else {
                        i = -1;
                    }
                    float D = MBMediaView.this.m25693A();
                    int j = C8677z.m24951j(MBMediaView.this.getContext());
                    if ((i <= 45 || i >= 135) && (i <= 225 || i >= 315)) {
                        if (((i > 135 && i < 225) || ((i > 315 && i < 360) || ((i >= 0 && i <= 45) || i == -1))) && D <= ((float) j) && MBMediaView.this.f21976j) {
                            boolean unused = MBMediaView.this.f21975i = false;
                            boolean unused2 = MBMediaView.this.f21976j = false;
                            MBMediaView.this.f21942M.postDelayed(new Runnable() {
                                public final void run() {
                                    try {
                                        C8937a.m25852a(MBMediaView.this.getContext()).mo58851a(MBMediaView.this.f21935F, MBMediaView.this.f21975i);
                                        MBMediaView.this.m25697C();
                                        MBMediaView.this.m25756h();
                                        MBMediaView.this.m25752f();
                                        MBMediaView.this.m25755g();
                                        if (MBMediaView.this.f21931B != null) {
                                            MBMediaView.this.f21931B.orientation(MBMediaView.this.f21975i);
                                        }
                                    } catch (Exception e) {
                                        C8672v.m24878d(MBMediaView.TAG, e.getMessage());
                                    }
                                }
                            }, 200);
                        }
                    } else if (D >= ((float) j) && !MBMediaView.this.f21976j) {
                        boolean unused3 = MBMediaView.this.f21975i = true;
                        boolean unused4 = MBMediaView.this.f21976j = true;
                        MBMediaView.this.f21942M.postDelayed(new Runnable() {
                            public final void run() {
                                try {
                                    C8937a.m25852a(MBMediaView.this.getContext()).mo58851a(MBMediaView.this.f21935F, MBMediaView.this.f21975i);
                                    MBMediaView.this.m25700D();
                                    MBMediaView.this.m25756h();
                                    MBMediaView.this.m25752f();
                                    MBMediaView.this.m25755g();
                                    if (MBMediaView.this.f21931B != null) {
                                        MBMediaView.this.f21931B.orientation(MBMediaView.this.f21975i);
                                    }
                                } catch (Exception e) {
                                    C8672v.m24878d(MBMediaView.TAG, e.getMessage());
                                }
                            }
                        }, 200);
                    }
                } catch (Throwable th) {
                    C8672v.m24875a(MBMediaView.TAG, th.getMessage(), th);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public WindVaneWebViewForNV m25703F() {
        try {
            if (this.f21931B != null && this.f21960ag) {
                return this.f21931B;
            }
            if (this.f21960ag) {
                return null;
            }
            m25740b(true);
            return null;
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    private void m25740b(boolean z) {
        try {
            int nvT2 = this.f21943N.getNvT2();
            if (this.f21931B == null) {
                WindVaneWebViewForNV windVaneWebViewForNV = new WindVaneWebViewForNV(getContext());
                this.f21931B = windVaneWebViewForNV;
                windVaneWebViewForNV.setObject(this);
                this.f21931B.setBackListener(new C8897b() {
                    /* renamed from: a */
                    public final void mo58710a() {
                        MBMediaView.this.exitFullScreen();
                    }
                });
                this.f21931B.setWebViewListener(new C8853b() {
                    /* renamed from: a */
                    public final void mo58279a(WebView webView, String str) {
                        super.mo58279a(webView, str);
                        boolean unused = MBMediaView.this.f21959af = true;
                    }

                    /* renamed from: a */
                    public final void mo58277a(WebView webView, int i, String str, String str2) {
                        super.mo58277a(webView, i, str, str2);
                        boolean unused = MBMediaView.this.f21959af = false;
                    }
                });
            }
            if (nvT2 == 3) {
                String str = this.f21943N.getendcard_url();
                if (!TextUtils.isEmpty(str)) {
                    this.f21943N.getMediaViewHolder();
                    if (!str.contains(".zip") || !str.contains("md5filename")) {
                        String b = C9661h.m27556a().mo63674b(str);
                        if (C8616ad.m24718b(b)) {
                            C8672v.m24874a(TAG, "load html...");
                            this.f21960ag = true;
                            this.f21931B.loadDataWithBaseURL(str, b, "text/html", "UTF-8", (String) null);
                            return;
                        }
                        return;
                    }
                    String b2 = C9652g.m27539a().mo63670b(str);
                    if (C8616ad.m24718b(b2)) {
                        this.f21960ag = true;
                        this.f21931B.loadUrl(b2);
                    }
                }
            } else if (nvT2 == 4) {
                this.f21960ag = true;
                if (this.f21943N != null) {
                    BrowserView.MBDownloadListener mBDownloadListener = new BrowserView.MBDownloadListener(this.f21943N);
                    mBDownloadListener.setTitle(this.f21943N.getAppName());
                    this.f21931B.setDownloadListener(mBDownloadListener);
                    this.f21931B.setFilter(new C8920d());
                }
            }
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
        }
    }

    /* renamed from: com.mbridge.msdk.nativex.view.MBMediaView$g */
    private static final class C8925g extends WebViewClient {

        /* renamed from: a */
        WeakReference<MBMediaView> f22021a;

        public C8925g(MBMediaView mBMediaView) {
            this.f22021a = new WeakReference<>(mBMediaView);
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                MBMediaView mBMediaView = (MBMediaView) this.f22021a.get();
                if (mBMediaView != null && mBMediaView.f21955ab != null && mBMediaView.f21955ab == C8917a.BIG_IMAGE) {
                    mBMediaView.m25765l();
                    C8917a unused = mBMediaView.f21955ab = C8917a.GIF;
                    mBMediaView.changeNoticeURL();
                }
            } catch (Exception e) {
                C8672v.m24878d(MBMediaView.TAG, e.getMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.nativex.view.MBMediaView$f */
    private static final class C8924f implements C9673a {

        /* renamed from: a */
        WeakReference<MBMediaView> f22020a;

        /* renamed from: a */
        public final void mo58774a(String str, String str2) {
        }

        public C8924f(MBMediaView mBMediaView) {
            this.f22020a = new WeakReference<>(mBMediaView);
        }

        /* renamed from: a */
        public final void mo58773a(String str) {
            MBMediaView mBMediaView = (MBMediaView) this.f22020a.get();
            if (mBMediaView != null) {
                mBMediaView.f21942M.post(new C8918b(mBMediaView));
            }
        }
    }

    /* renamed from: com.mbridge.msdk.nativex.view.MBMediaView$b */
    private static final class C8918b implements Runnable {

        /* renamed from: a */
        WeakReference<MBMediaView> f22015a;

        public C8918b(MBMediaView mBMediaView) {
            this.f22015a = new WeakReference<>(mBMediaView);
        }

        public final void run() {
            MBMediaView mBMediaView = (MBMediaView) this.f22015a.get();
            if (mBMediaView != null) {
                try {
                    if (mBMediaView.f21955ab != null && mBMediaView.f21955ab == C8917a.BIG_IMAGE) {
                        mBMediaView.m25751e();
                        C8917a unused = mBMediaView.f21955ab = C8917a.f22012b;
                        mBMediaView.changeNoticeURL();
                    }
                } catch (Throwable th) {
                    C8672v.m24875a(MBMediaView.TAG, th.getMessage(), th);
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.nativex.view.MBMediaView$c */
    private static final class C8919c implements C8896a {

        /* renamed from: a */
        WeakReference<MBMediaView> f22016a;

        public C8919c(MBMediaView mBMediaView) {
            this.f22016a = new WeakReference<>(mBMediaView);
        }

        /* renamed from: a */
        public final void mo58704a() {
            MBMediaView mBMediaView = (MBMediaView) this.f22016a.get();
            if (mBMediaView != null) {
                MBMediaView.m25712N(mBMediaView);
            }
        }

        /* renamed from: b */
        public final void mo58706b() {
            MBMediaView mBMediaView = (MBMediaView) this.f22016a.get();
            if (mBMediaView != null) {
                MBMediaView.m25713O(mBMediaView);
            }
        }

        /* renamed from: c */
        public final void mo58708c() {
            MBMediaView mBMediaView = (MBMediaView) this.f22016a.get();
            if (mBMediaView != null) {
                MBMediaView.m25714P(mBMediaView);
            }
        }

        /* renamed from: d */
        public final void mo58709d() {
            MBMediaView mBMediaView = (MBMediaView) this.f22016a.get();
            if (mBMediaView != null) {
                MBMediaView.m25715Q(mBMediaView);
            }
        }

        /* renamed from: a */
        public final void mo58705a(String str) {
            MBMediaView mBMediaView = (MBMediaView) this.f22016a.get();
            if (mBMediaView != null) {
                mBMediaView.mo58711a(str);
            }
        }

        /* renamed from: b */
        public final void mo58707b(String str) {
            MBMediaView mBMediaView = (MBMediaView) this.f22016a.get();
            if (mBMediaView != null) {
                mBMediaView.mo58712b(str);
            }
        }
    }

    public BaseView.C8936a handleViewStyleResult(Context context) {
        int nvT2 = this.f21943N.getNvT2();
        if (nvT2 == 1) {
            m25736b(context);
        } else if (nvT2 == 2 || nvT2 == 3 || nvT2 == 4) {
            return BaseView.C8936a.FULL_MIDDLE_VIEW;
        } else {
            if (nvT2 == 6) {
                return BaseView.C8936a.FULL_TOP_VIEW;
            }
        }
        return null;
    }

    /* renamed from: com.mbridge.msdk.nativex.view.MBMediaView$d */
    private static final class C8920d implements C8856a {
        private C8920d() {
        }

        /* renamed from: a */
        public final boolean mo58583a(String str) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (C8675y.C8676a.m24900a(str)) {
                        C8675y.m24895a(C8388a.m23845e().mo56913g(), str, (NativeListener.NativeTrackingListener) null);
                        return true;
                    } else if (URLUtil.isNetworkUrl(str)) {
                        return false;
                    } else {
                        C8675y.m24897b(C8388a.m23845e().mo56913g(), str, (NativeListener.NativeTrackingListener) null);
                        return true;
                    }
                }
            } catch (Exception e) {
                C8672v.m24878d(MBMediaView.TAG, e.getMessage());
            }
            return false;
        }
    }

    public void setProgressVisibility(boolean z) {
        this.f21977k = z;
        MediaViewPlayerView mediaViewPlayerView = this.f21987w;
        if (mediaViewPlayerView != null) {
            mediaViewPlayerView.showProgressView(z);
        }
    }

    public void setSoundIndicatorVisibility(boolean z) {
        this.f21978l = z;
        MediaViewPlayerView mediaViewPlayerView = this.f21987w;
        if (mediaViewPlayerView != null) {
            mediaViewPlayerView.showSoundIndicator(z);
        }
    }

    public void setVideoSoundOnOff(boolean z) {
        this.f21972f = z;
        MediaViewPlayerView mediaViewPlayerView = this.f21987w;
        if (mediaViewPlayerView == null) {
            return;
        }
        if (z) {
            mediaViewPlayerView.openSound();
        } else {
            mediaViewPlayerView.closeSound();
        }
    }

    public BaseView getFullScreenViewByStyle(Context context, BaseView.C8936a aVar) {
        BaseView baseView;
        BaseView baseView2;
        int i = C889910.f21992a[aVar.ordinal()];
        if (i == 1) {
            baseView2 = new MBridgeFullView(context);
        } else if (i != 2) {
            baseView = null;
            baseView.setStytle(aVar);
            return baseView;
        } else {
            baseView2 = new MBridgeTopFullView(context);
        }
        baseView = baseView2;
        baseView.setStytle(aVar);
        return baseView;
    }

    public void setFullScreenViewBackgroundColor(int i) {
        this.f21986v = i;
    }

    public void setFollowActivityOrientation(boolean z) {
        this.f21964ak = z;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f21964ak && this.f21963aj != configuration.orientation) {
            int i = configuration.orientation;
            this.f21963aj = i;
            boolean z = true;
            this.f21975i = i == 0;
            if (this.f21963aj != 0) {
                z = false;
            }
            this.f21976j = z;
            this.f21942M.postDelayed(new Runnable() {
                public final void run() {
                    try {
                        C8937a.m25852a(MBMediaView.this.getContext()).mo58851a(MBMediaView.this.f21935F, MBMediaView.this.f21975i);
                        if (MBMediaView.this.f21963aj == 0) {
                            MBMediaView.this.m25700D();
                        } else {
                            MBMediaView.this.m25697C();
                        }
                        MBMediaView.this.m25756h();
                        MBMediaView.this.m25752f();
                        MBMediaView.this.m25755g();
                        if (MBMediaView.this.f21931B != null) {
                            MBMediaView.this.f21931B.orientation(MBMediaView.this.f21975i);
                        }
                    } catch (Exception e) {
                        C8672v.m24878d(MBMediaView.TAG, e.getMessage());
                    }
                }
            }, 200);
        }
    }

    public boolean ismCurIsFullScreen() {
        return this.f21974h;
    }

    public void cai(Object obj, String str) {
        C8672v.m24874a(TAG, "cai:" + str);
        if (TextUtils.isEmpty(str)) {
            C8868b.m25603a(obj, "params is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                String optString = new JSONObject(str).optString("packageName");
                if (TextUtils.isEmpty(optString)) {
                    C8868b.m25603a(obj, "packageName is empty");
                }
                int i = C8677z.m24934c(C8388a.m23845e().mo56913g(), optString) ? 1 : 2;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", C8868b.f21850b);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(IronSourceConstants.EVENTS_RESULT, i);
                    jSONObject.put("data", jSONObject2);
                    C8887g.m25669a().mo58688a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    C8868b.m25603a(obj, e.getMessage());
                    C8672v.m24874a(TAG, e.getMessage());
                }
            } catch (JSONException e2) {
                C8868b.m25603a(obj, "exception: " + e2.getLocalizedMessage());
                C8672v.m24875a(TAG, "cai", e2);
            } catch (Throwable th) {
                C8868b.m25603a(obj, "exception: " + th.getLocalizedMessage());
                C8672v.m24875a(TAG, "cai", th);
            }
        }
    }

    public void getEndScreenInfo(Object obj, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f21943N);
            String a = m25723a((List<CampaignEx>) arrayList, m25770o(), "MAL_16.2.21,3.0.1");
            String encodeToString = !TextUtils.isEmpty(a) ? Base64.encodeToString(a.getBytes(), 2) : "";
            C8672v.m24878d(TAG, "getEndScreenInfo-mCampaign.name:" + this.f21943N.getAppName());
            C8887g.m25669a().mo58688a(obj, encodeToString);
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
        }
    }

    public void install(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        try {
            if (this.f21965al != null) {
                m25736b(this.f21965al);
            } else if ((obj instanceof C8881a) && (windVaneWebView = ((C8881a) obj).f21883a) != null) {
                m25736b(windVaneWebView.getContext());
            }
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
        }
    }

    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        C8672v.m24878d(TAG, "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            C8868b.m25603a(obj, "params is null");
            return;
        }
        Context g = C8388a.m23845e().mo56913g();
        if (!TextUtils.isEmpty(str)) {
            if (g == null) {
                try {
                    if ((obj instanceof C8881a) && (windVaneWebView = ((C8881a) obj).f21883a) != null) {
                        g = windVaneWebView.getContext();
                    }
                } catch (Exception e) {
                    C8672v.m24878d(TAG, e.getMessage());
                }
            }
            if (g != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString("url");
                    int optInt = jSONObject.optInt("type");
                    if (optInt == 1) {
                        C6779b.m20645a(g, optString);
                    } else if (optInt == 2) {
                        C6779b.m20647b(g, optString);
                    }
                } catch (JSONException e2) {
                    C8672v.m24878d(TAG, e2.getMessage());
                } catch (Throwable th) {
                    C8672v.m24878d(TAG, th.getMessage());
                }
            }
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                try {
                    new JSONObject(str).optInt("state", 1);
                } catch (Exception e) {
                    C8672v.m24878d(TAG, e.getMessage());
                }
            }
            C8672v.m24878d(TAG, "SHOW CLOSE BTN ");
            showEndCardWebViewCloseBtn();
            C8887g.m25669a().mo58688a(obj, m25722a(0));
        } catch (Exception e2) {
            C8672v.m24878d(TAG, e2.getMessage());
            C8887g.m25669a().mo58690b(obj, m25722a(1));
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        try {
            exitFullScreen();
            C8887g.m25669a().mo58688a(obj, m25722a(0));
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
            C8887g.m25669a().mo58690b(obj, m25722a(1));
        }
    }

    /* renamed from: a */
    private String m25722a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            return "";
        } catch (Throwable unused) {
            C8672v.m24878d(TAG, "code to string is error");
            return "";
        }
    }

    /* renamed from: a */
    private String m25723a(List<CampaignEx> list, String str, String str2) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            JSONArray parseCamplistToJson = CampaignEx.parseCamplistToJson(list);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("campaignList", parseCamplistToJson);
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("sdk_info", str2);
            return jSONObject.toString();
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25736b(Context context) {
        try {
            if (this.f21956ac != null) {
                this.f21956ac.onVideoAdClicked(this.f21943N);
            }
            if (this.f21957ad != null) {
                this.f21957ad.onVideoAdClicked(this.f21943N);
            }
        } catch (Exception e) {
            try {
                C8672v.m24878d(TAG, e.getMessage());
            } catch (Exception e2) {
                C8672v.m24878d(TAG, e2.getMessage());
                return;
            }
        }
        if (this.f21943N == null) {
            return;
        }
        if (!C8616ad.m24717a(m25770o())) {
            if (!this.f21943N.isReportClick()) {
                this.f21943N.setReportClick(true);
                if (!(this.f21943N == null || this.f21943N.getNativeVideoTracking() == null || this.f21943N.getNativeVideoTracking().mo57761e() == null)) {
                    C6765a.m20559a(getContext(), this.f21943N, this.f21943N.getCampaignUnitId(), this.f21943N.getNativeVideoTracking().mo57761e(), false, false);
                }
            }
            C6765a aVar = new C6765a(getContext(), m25770o());
            aVar.mo37044a((NativeListener.NativeTrackingListener) new NativeListener.NativeTrackingListener() {
                public final void onDismissLoading(Campaign campaign) {
                }

                public final void onDownloadFinish(Campaign campaign) {
                }

                public final void onDownloadProgress(int i) {
                }

                public final void onDownloadStart(Campaign campaign) {
                }

                public final boolean onInterceptDefaultLoadingDialog() {
                    return true;
                }

                public final void onShowLoading(Campaign campaign) {
                }

                public final void onStartRedirection(Campaign campaign, String str) {
                    try {
                        MBMediaView.m25769n(MBMediaView.this);
                        MBMediaView.m25771o(MBMediaView.this);
                        MBMediaView.m25729a(MBMediaView.this, campaign, str);
                    } catch (Exception e) {
                        C8672v.m24878d(MBMediaView.TAG, e.getMessage());
                    }
                }

                public final void onRedirectionFailed(Campaign campaign, String str) {
                    try {
                        MBMediaView.m25773p(MBMediaView.this);
                        MBMediaView.m25775q(MBMediaView.this);
                        MBMediaView.m25739b(MBMediaView.this, campaign, str);
                    } catch (Exception e) {
                        C8672v.m24878d(MBMediaView.TAG, e.getMessage());
                    }
                }

                public final void onFinishRedirection(Campaign campaign, String str) {
                    try {
                        MBMediaView.m25773p(MBMediaView.this);
                        MBMediaView.m25775q(MBMediaView.this);
                        MBMediaView.m25743c(MBMediaView.this, campaign, str);
                    } catch (Exception e) {
                        C8672v.m24878d(MBMediaView.TAG, e.getMessage());
                    }
                }
            });
            aVar.mo37041a(this.f21943N);
        }
    }

    public void onPlayProgress(int i, int i2) {
        int i3;
        String str;
        CampaignEx.C8453b mediaViewHolder;
        CampaignEx.C8453b mediaViewHolder2;
        int i4 = i;
        try {
            if (!(this.f21943N == null || (mediaViewHolder2 = this.f21943N.getMediaViewHolder()) == null || mediaViewHolder2.f20592h || mediaViewHolder2.f20596l == null || mediaViewHolder2.f20596l.size() <= 0)) {
                Map<Integer, String> map = mediaViewHolder2.f20596l;
                Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next = it.next();
                    String str2 = (String) next.getValue();
                    if (i4 >= ((Integer) next.getKey()).intValue() && !TextUtils.isEmpty(str2)) {
                        C6765a.m20557a(getContext(), this.f21943N, this.f21943N.getCampaignUnitId(), str2, false, false);
                        it.remove();
                    }
                }
                if (map.size() <= 0) {
                    mediaViewHolder2.f20592h = true;
                }
            }
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
        }
        int i5 = 0;
        try {
            if (!(this.f21943N == null || (mediaViewHolder = this.f21943N.getMediaViewHolder()) == null || mediaViewHolder.f20593i || i2 == 0)) {
                List<Map<Integer, String>> b = this.f21943N.getNativeVideoTracking().mo57754b();
                int i6 = ((i4 + 1) * 100) / i2;
                if (b != null) {
                    int i7 = 0;
                    while (i7 < b.size()) {
                        Map map2 = b.get(i7);
                        if (map2 != null && map2.size() > 0) {
                            Iterator it2 = map2.entrySet().iterator();
                            while (it2.hasNext()) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                int intValue = ((Integer) entry.getKey()).intValue();
                                String str3 = (String) entry.getValue();
                                if (intValue <= i6 && !TextUtils.isEmpty(str3)) {
                                    C6765a.m20559a(getContext(), this.f21943N, this.f21943N.getCampaignUnitId(), new String[]{str3}, false, true);
                                    it2.remove();
                                    b.remove(i7);
                                    i7--;
                                }
                            }
                        }
                        i7++;
                    }
                    if (b.size() <= 0) {
                        mediaViewHolder.f20593i = true;
                    }
                }
            }
        } catch (Throwable unused) {
            C8672v.m24878d(TAG, "reportPlayPercentageData error");
        }
        MediaEvents mediaEvents = this.f21985u;
        if (mediaEvents != null) {
            int i8 = (i4 * 100) / i2;
            int i9 = ((i4 + 1) * 100) / i2;
            if (i8 <= 25 && 25 < i9) {
                mediaEvents.firstQuartile();
            } else if (i8 <= 50 && 50 < i9) {
                this.f21985u.midpoint();
            } else if (i8 <= 75 && 75 < i9) {
                this.f21985u.thirdQuartile();
            }
        }
        if (m25778s() != 100 && !this.f21966am) {
            if (m25780t() != null) {
                i5 = m25780t().mo16315f();
            }
            int s = m25778s();
            if (s != 0) {
                if (i5 > s) {
                    i5 = s / 2;
                }
                if (i5 >= 0 && i4 >= (i3 = (i5 * i2) / 100)) {
                    if (this.f21943N.getAdType() == 94 || this.f21943N.getAdType() == 287) {
                        str = this.f21943N.getRequestId() + this.f21943N.getId() + this.f21943N.getVideoUrlEncode();
                    } else {
                        str = this.f21943N.getId() + this.f21943N.getVideoUrlEncode() + this.f21943N.getBidToken();
                    }
                    C9641a a = C9645c.getInstance().mo63652a(m25770o(), str);
                    if (a != null) {
                        a.mo63643j();
                        this.f21966am = true;
                        C8672v.m24878d(TAG, "CDRate is : " + i3 + " and start download !");
                    }
                }
            }
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m25738b(MBMediaView mBMediaView) {
        CampaignEx campaignEx = mBMediaView.f21943N;
        if (campaignEx != null && campaignEx.getMediaViewHolder() != null) {
            C8388a.m23845e().mo56898a(mBMediaView.getContext());
            C8838b.m25512a(mBMediaView.f21943N, mBMediaView.getContext(), mBMediaView.m25770o(), (C8801a) null);
            CampaignEx.C8453b mediaViewHolder = mBMediaView.f21943N.getMediaViewHolder();
            if (!mediaViewHolder.f20585a && mBMediaView.f21955ab == C8917a.f22012b && C8616ad.m24718b(mBMediaView.f21943N.getImpressionURL())) {
                mediaViewHolder.f20585a = true;
                String impressionURL = mBMediaView.f21943N.getImpressionURL();
                if (!impressionURL.contains("is_video=1")) {
                    StringBuilder sb = new StringBuilder(impressionURL);
                    if (impressionURL.contains("?")) {
                        sb.append("&is_video=1");
                    } else {
                        sb.append("?is_video=1");
                    }
                    impressionURL = sb.toString();
                }
                Context context = mBMediaView.getContext();
                CampaignEx campaignEx2 = mBMediaView.f21943N;
                C6765a.m20558a(context, campaignEx2, campaignEx2.getCampaignUnitId(), impressionURL, false, true, C6772a.f17856g);
            }
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m25748d(MBMediaView mBMediaView) {
        CampaignEx.C8453b mediaViewHolder;
        CampaignEx campaignEx = mBMediaView.f21943N;
        if (campaignEx != null && (mediaViewHolder = campaignEx.getMediaViewHolder()) != null && !mediaViewHolder.f20591g && mBMediaView.f21943N.getNativeVideoTracking() != null && mBMediaView.f21943N.getNativeVideoTracking().mo57775l() != null) {
            mediaViewHolder.f20591g = true;
            Context context = mBMediaView.getContext();
            CampaignEx campaignEx2 = mBMediaView.f21943N;
            C6765a.m20559a(context, campaignEx2, campaignEx2.getCampaignUnitId(), mBMediaView.f21943N.getNativeVideoTracking().mo57775l(), false, false);
        }
    }

    /* renamed from: h */
    static /* synthetic */ void m25757h(MBMediaView mBMediaView) {
        try {
            if (mBMediaView.getRootView() != null) {
                if (mBMediaView.getRootView() instanceof ViewGroup) {
                    BaseView.C8936a handleViewStyleResult = mBMediaView.handleViewStyleResult(mBMediaView.getContext());
                    if (handleViewStyleResult != null) {
                        BaseView fullScreenViewByStyle = mBMediaView.getFullScreenViewByStyle(mBMediaView.getContext(), handleViewStyleResult);
                        mBMediaView.f21935F = fullScreenViewByStyle;
                        if (fullScreenViewByStyle != null) {
                            if (mBMediaView.m25789x()) {
                                C8937a.m25852a(mBMediaView.getContext()).mo58850a(mBMediaView.f21935F.style, mBMediaView.f21943N, mBMediaView.f21935F);
                                mBMediaView.f21974h = true;
                                mBMediaView.f21982r = false;
                                if (mBMediaView.f21987w != null) {
                                    mBMediaView.f21987w.setEnterFullScreen();
                                    mBMediaView.f21987w.setIsActivePause(false);
                                }
                                try {
                                    if (mBMediaView.f21956ac != null) {
                                        mBMediaView.f21956ac.onEnterFullscreen();
                                    }
                                    if (mBMediaView.f21957ad != null) {
                                        mBMediaView.f21957ad.onEnterFullscreen();
                                    }
                                    if (mBMediaView.f21985u != null) {
                                        mBMediaView.f21985u.playerStateChange(PlayerState.FULLSCREEN);
                                    }
                                } catch (Exception e) {
                                    C8672v.m24878d(TAG, e.getMessage());
                                }
                                FrameLayout frameLayout = (FrameLayout) mBMediaView.getRootView().findViewById(16908290);
                                RelativeLayout relativeLayout = new RelativeLayout(mBMediaView.getContext());
                                mBMediaView.f21934E = relativeLayout;
                                relativeLayout.setClickable(true);
                                ViewGroup viewGroup = (ViewGroup) mBMediaView.f21987w.getParent();
                                int childCount = viewGroup.getChildCount();
                                int i = 0;
                                while (true) {
                                    if (i >= childCount) {
                                        break;
                                    } else if (viewGroup.getChildAt(i) == mBMediaView.f21987w) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                                mBMediaView.f21941L = i;
                                FrameLayout frameLayout2 = new FrameLayout(mBMediaView.getContext());
                                frameLayout2.setId(100);
                                viewGroup.addView(frameLayout2, i, new ViewGroup.LayoutParams(mBMediaView.getWidth(), mBMediaView.getHeight()));
                                viewGroup.removeView(mBMediaView.f21987w);
                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                                relativeLayout.setId(101);
                                new RelativeLayout.LayoutParams(-1, -1);
                                mBMediaView.f21940K.addView(mBMediaView.f21987w, new RelativeLayout.LayoutParams(-1, -1));
                                frameLayout.addView(relativeLayout, layoutParams);
                                int i2 = ViewCompat.MEASURED_STATE_MASK;
                                if (C889910.f21992a[mBMediaView.f21935F.style.ordinal()] == 2) {
                                    i2 = -1;
                                }
                                if (mBMediaView.f21986v != 0) {
                                    relativeLayout.setBackgroundColor(mBMediaView.f21986v);
                                } else {
                                    relativeLayout.setBackgroundColor(i2);
                                }
                                mBMediaView.f21935F.setId(103);
                                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                                int[] iArr = new int[2];
                                frameLayout.getLocationInWindow(iArr);
                                int i3 = iArr[1];
                                mBMediaView.f21958ae = i3;
                                if (i3 == 0) {
                                    if (Build.VERSION.SDK_INT >= 23) {
                                        WindowInsets rootWindowInsets = mBMediaView.getRootWindowInsets();
                                        if (rootWindowInsets != null) {
                                            layoutParams2.setMargins(0, rootWindowInsets.getStableInsetTop(), 0, 0);
                                        }
                                    } else {
                                        layoutParams2.setMargins(0, C8677z.m24940e(mBMediaView.getContext()), 0, 0);
                                    }
                                }
                                relativeLayout.addView(mBMediaView.f21935F, layoutParams2);
                                try {
                                    mBMediaView.m25791y();
                                    mBMediaView.m25726a((View) mBMediaView.f21936G, mBMediaView.m25693A(), mBMediaView.m25695B());
                                    C8937a.m25852a(mBMediaView.getContext()).mo58851a(mBMediaView.f21935F, mBMediaView.f21975i);
                                    if (mBMediaView.f21975i) {
                                        mBMediaView.m25700D();
                                    } else {
                                        mBMediaView.m25697C();
                                    }
                                    mBMediaView.f21942M.postDelayed(new Runnable() {
                                        public final void run() {
                                            boolean unused = MBMediaView.this.f21982r = true;
                                            if (MBMediaView.this.f21974h) {
                                                TextView unused2 = MBMediaView.this.f21938I;
                                            }
                                        }
                                    }, 3000);
                                } catch (Throwable th) {
                                    C8672v.m24878d(TAG, th.getMessage());
                                }
                                try {
                                    mBMediaView.f21934E.setFocusableInTouchMode(true);
                                    mBMediaView.f21934E.requestFocus();
                                    mBMediaView.f21934E.setOnKeyListener(new View.OnKeyListener() {
                                        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                                            try {
                                                if (keyEvent.getKeyCode() != 4) {
                                                    return false;
                                                }
                                                MBMediaView.this.m25787w();
                                                return true;
                                            } catch (Throwable th) {
                                                C8672v.m24878d(MBMediaView.TAG, th.getMessage());
                                                return false;
                                            }
                                        }
                                    });
                                    mBMediaView.f21934E.setOnClickListener(new View.OnClickListener() {
                                        public final void onClick(View view) {
                                            MBMediaView.m25759i(MBMediaView.this);
                                        }
                                    });
                                    mBMediaView.f21937H.setOnClickListener(new View.OnClickListener() {
                                        public final void onClick(View view) {
                                            MBMediaView.this.m25787w();
                                        }
                                    });
                                    mBMediaView.f21938I.setOnClickListener(new C9676a() {
                                        /* access modifiers changed from: protected */
                                        /* renamed from: a */
                                        public final void mo58499a(View view) {
                                            try {
                                                MBMediaView.this.m25736b(view.getContext());
                                                if (MBMediaView.this.f21985u != null) {
                                                    MBMediaView.this.f21985u.adUserInteraction(InteractionType.CLICK);
                                                }
                                            } catch (Exception e) {
                                                C8672v.m24878d(MBMediaView.TAG, e.getMessage());
                                            }
                                        }
                                    });
                                } catch (Exception e2) {
                                    C8672v.m24878d(TAG, e2.getMessage());
                                }
                                if (mBMediaView.f21987w != null) {
                                    mBMediaView.f21987w.openSound();
                                }
                                mBMediaView.f21987w.setMediaViewPlayListener(new MediaViewPlayerView.C8934a(mBMediaView.f21987w) {
                                    /* renamed from: a */
                                    public final void mo58760a() {
                                        int nvT2 = MBMediaView.this.f21943N.getNvT2();
                                        if (!MBMediaView.this.f21974h || !(nvT2 == 3 || nvT2 == 4)) {
                                            super.mo58760a();
                                            return;
                                        }
                                        WindVaneWebViewForNV t = MBMediaView.this.m25703F();
                                        if (t != null) {
                                            View u = MBMediaView.this.m25784v();
                                            if (u == null) {
                                                super.mo58760a();
                                                return;
                                            }
                                            if (nvT2 == 3 && MBMediaView.this.f21959af) {
                                                C8937a.m25852a(MBMediaView.this.getContext()).mo58849a(u, MBMediaView.this.f21935F);
                                                Context context = MBMediaView.this.getContext();
                                                CampaignEx s = MBMediaView.this.f21943N;
                                                String campaignUnitId = MBMediaView.this.f21943N.getCampaignUnitId();
                                                if (s != null) {
                                                    try {
                                                        if (!(s.getNativeVideoTracking() == null || s.getNativeVideoTracking().mo57771j() == null)) {
                                                            for (String str : s.getNativeVideoTracking().mo57771j()) {
                                                                if (!TextUtils.isEmpty(str)) {
                                                                    C6765a.m20557a(context, s, campaignUnitId, str, false, true);
                                                                }
                                                            }
                                                        }
                                                    } catch (Exception e) {
                                                        e.printStackTrace();
                                                    }
                                                }
                                            } else if (nvT2 == 4) {
                                                C8937a.m25852a(MBMediaView.this.getContext()).mo58849a(u, MBMediaView.this.f21935F);
                                                String clickURL = MBMediaView.this.f21943N.getClickURL();
                                                if (!TextUtils.isEmpty(clickURL)) {
                                                    C6765a.m20558a(MBMediaView.this.getContext(), MBMediaView.this.f21943N, MBMediaView.this.m25770o(), MBMediaView.this.getAddNVT2ToNoticeURL(), true, false, C6772a.f17858i);
                                                    MBMediaView.this.f21931B.loadUrl(clickURL);
                                                }
                                            } else {
                                                super.mo58760a();
                                                return;
                                            }
                                            t.webViewShow(MBMediaView.this.f21943N, MBMediaView.this.m25770o());
                                            t.orientation(MBMediaView.this.f21975i);
                                            return;
                                        }
                                        super.mo58760a();
                                    }
                                });
                                mBMediaView.m25740b(false);
                                if (mBMediaView.f21943N != null && mBMediaView.f21943N.getMediaViewHolder() != null && !mBMediaView.f21943N.getMediaViewHolder().f20595k && !TextUtils.isEmpty(mBMediaView.f21943N.getCampaignUnitId()) && mBMediaView.f21943N.getNativeVideoTracking() != null && mBMediaView.f21943N.getNativeVideoTracking().mo57753a() != null) {
                                    mBMediaView.f21943N.getMediaViewHolder().f20595k = true;
                                    mBMediaView.m25701E();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            C8672v.m24876b(TAG, "rootView is null");
        } catch (Exception e3) {
            C8672v.m24878d(TAG, e3.getMessage());
        }
    }

    /* renamed from: i */
    static /* synthetic */ void m25759i(MBMediaView mBMediaView) {
        try {
            if (mBMediaView.f21987w != null) {
                mBMediaView.f21987w.onClickPlayerView();
            }
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
        }
    }

    /* renamed from: n */
    static /* synthetic */ void m25769n(MBMediaView mBMediaView) {
        try {
            if (mBMediaView.f21933D != null) {
                mBMediaView.f21933D.setVisibility(0);
            }
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
        }
    }

    /* renamed from: o */
    static /* synthetic */ void m25771o(MBMediaView mBMediaView) {
        try {
            if (mBMediaView.f21939J != null) {
                mBMediaView.f21939J.setVisibility(0);
            }
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m25729a(MBMediaView mBMediaView, Campaign campaign, String str) {
        try {
            if (mBMediaView.f21956ac != null) {
                mBMediaView.f21956ac.onStartRedirection(campaign, str);
            }
            if (mBMediaView.f21957ad != null) {
                mBMediaView.f21957ad.onStartRedirection(campaign, str);
            }
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
        }
    }

    /* renamed from: p */
    static /* synthetic */ void m25773p(MBMediaView mBMediaView) {
        try {
            if (mBMediaView.f21933D != null) {
                mBMediaView.f21933D.setVisibility(8);
            }
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
        }
    }

    /* renamed from: q */
    static /* synthetic */ void m25775q(MBMediaView mBMediaView) {
        try {
            if (mBMediaView.f21939J != null) {
                mBMediaView.f21939J.setVisibility(8);
            }
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m25739b(MBMediaView mBMediaView, Campaign campaign, String str) {
        try {
            if (mBMediaView.f21956ac != null) {
                mBMediaView.f21956ac.onRedirectionFailed(campaign, str);
            }
            if (mBMediaView.f21957ad != null) {
                mBMediaView.f21957ad.onRedirectionFailed(campaign, str);
            }
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m25743c(MBMediaView mBMediaView, Campaign campaign, String str) {
        try {
            if (mBMediaView.f21956ac != null) {
                mBMediaView.f21956ac.onFinishRedirection(campaign, str);
            }
            if (mBMediaView.f21957ad != null) {
                mBMediaView.f21957ad.onFinishRedirection(campaign, str);
            }
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
        }
    }

    /* renamed from: r */
    static /* synthetic */ void m25777r(MBMediaView mBMediaView) {
        CampaignEx campaignEx = mBMediaView.f21943N;
        if (campaignEx != null && campaignEx.getMediaViewHolder() != null && !mBMediaView.f21943N.getMediaViewHolder().f20588d && !TextUtils.isEmpty(mBMediaView.f21943N.getCampaignUnitId()) && mBMediaView.f21943N.getNativeVideoTracking() != null && mBMediaView.f21943N.getNativeVideoTracking().mo57767h() != null) {
            mBMediaView.f21943N.getMediaViewHolder().f20588d = true;
            Context context = mBMediaView.getContext();
            CampaignEx campaignEx2 = mBMediaView.f21943N;
            C6765a.m20559a(context, campaignEx2, campaignEx2.getCampaignUnitId(), mBMediaView.f21943N.getNativeVideoTracking().mo57767h(), false, false);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m25730a(MBMediaView mBMediaView, String str) {
        try {
            C8423p a = C8423p.m24023a((C8412f) C8414g.m23969a(mBMediaView.getContext()));
            C8468m mVar = null;
            if (!TextUtils.isEmpty(mBMediaView.f21943N.getNoticeUrl())) {
                int o = C8660r.m24840o(mBMediaView.getContext());
                mVar = new C8468m("2000021", o, mBMediaView.f21943N.getNoticeUrl(), str, C8660r.m24806a(mBMediaView.getContext(), o));
            } else if (!TextUtils.isEmpty(mBMediaView.f21943N.getClickURL())) {
                int o2 = C8660r.m24840o(mBMediaView.getContext());
                mVar = new C8468m("2000021", o2, mBMediaView.f21943N.getClickURL(), str, C8660r.m24806a(mBMediaView.getContext(), o2));
            }
            if (mVar != null) {
                mVar.mo57846n(mBMediaView.f21943N.getId());
                mVar.mo57828e(mBMediaView.f21943N.getVideoUrlEncode());
                mVar.mo57850p(str);
                mVar.mo57840k(mBMediaView.f21943N.getRequestId());
                mVar.mo57842l(mBMediaView.f21943N.getRequestIdNotice());
                mVar.mo57844m(mBMediaView.m25770o());
                a.mo57056a(mVar);
            }
        } catch (Exception e) {
            C8672v.m24878d(TAG, e.getMessage());
        }
    }

    /* renamed from: N */
    static /* synthetic */ void m25712N(MBMediaView mBMediaView) {
        CampaignEx.C8453b mediaViewHolder;
        CampaignEx campaignEx = mBMediaView.f21943N;
        if (campaignEx != null && (mediaViewHolder = campaignEx.getMediaViewHolder()) != null && !mediaViewHolder.f20586b && mBMediaView.f21943N.getNativeVideoTracking() != null && mBMediaView.f21943N.getNativeVideoTracking().mo57757c() != null) {
            mediaViewHolder.f20586b = true;
            Context context = mBMediaView.getContext();
            CampaignEx campaignEx2 = mBMediaView.f21943N;
            C6765a.m20559a(context, campaignEx2, campaignEx2.getCampaignUnitId(), mBMediaView.f21943N.getNativeVideoTracking().mo57757c(), false, false);
        }
    }

    /* renamed from: O */
    static /* synthetic */ void m25713O(MBMediaView mBMediaView) {
        CampaignEx.C8453b mediaViewHolder;
        CampaignEx campaignEx = mBMediaView.f21943N;
        if (campaignEx != null && (mediaViewHolder = campaignEx.getMediaViewHolder()) != null && !mediaViewHolder.f20587c && mBMediaView.f21943N.getNativeVideoTracking() != null && mBMediaView.f21943N.getNativeVideoTracking().mo57759d() != null) {
            mediaViewHolder.f20587c = true;
            Context context = mBMediaView.getContext();
            CampaignEx campaignEx2 = mBMediaView.f21943N;
            C6765a.m20559a(context, campaignEx2, campaignEx2.getCampaignUnitId(), mBMediaView.f21943N.getNativeVideoTracking().mo57759d(), false, false);
        }
    }

    /* renamed from: P */
    static /* synthetic */ void m25714P(MBMediaView mBMediaView) {
        CampaignEx.C8453b mediaViewHolder;
        CampaignEx campaignEx = mBMediaView.f21943N;
        if (campaignEx != null && (mediaViewHolder = campaignEx.getMediaViewHolder()) != null && !mediaViewHolder.f20589e && mBMediaView.f21943N.getNativeVideoTracking() != null && mBMediaView.f21943N.getNativeVideoTracking().mo57763f() != null) {
            mediaViewHolder.f20589e = true;
            Context context = mBMediaView.getContext();
            CampaignEx campaignEx2 = mBMediaView.f21943N;
            C6765a.m20559a(context, campaignEx2, campaignEx2.getCampaignUnitId(), mBMediaView.f21943N.getNativeVideoTracking().mo57763f(), false, false);
        }
    }

    /* renamed from: Q */
    static /* synthetic */ void m25715Q(MBMediaView mBMediaView) {
        CampaignEx.C8453b mediaViewHolder;
        CampaignEx campaignEx = mBMediaView.f21943N;
        if (campaignEx != null && (mediaViewHolder = campaignEx.getMediaViewHolder()) != null && !mediaViewHolder.f20590f && mBMediaView.f21943N.getNativeVideoTracking() != null && mBMediaView.f21943N.getNativeVideoTracking().mo57765g() != null) {
            mediaViewHolder.f20590f = true;
            Context context = mBMediaView.getContext();
            CampaignEx campaignEx2 = mBMediaView.f21943N;
            C6765a.m20559a(context, campaignEx2, campaignEx2.getCampaignUnitId(), mBMediaView.f21943N.getNativeVideoTracking().mo57765g(), false, false);
        }
    }

    /* renamed from: S */
    static /* synthetic */ void m25717S(MBMediaView mBMediaView) {
        try {
            if (mBMediaView.f21987w != null && mBMediaView.f21987w.hasPrepare() && mBMediaView.f21987w.isPlaying()) {
                if (mBMediaView.f21987w != null) {
                    mBMediaView.f21987w.pause();
                }
            }
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
        }
    }

    /* renamed from: T */
    static /* synthetic */ void m25718T(MBMediaView mBMediaView) {
        try {
            if (mBMediaView.f21987w != null) {
                if (mBMediaView.f21987w.hasPrepare()) {
                    if (!mBMediaView.f21987w.isPlaying()) {
                        if (!mBMediaView.f21987w.isComplete()) {
                            if (mBMediaView.f21987w.hasPrepare()) {
                                mBMediaView.f21987w.startOrPlayVideo();
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            C8672v.m24878d(TAG, th.getMessage());
        }
    }
}
