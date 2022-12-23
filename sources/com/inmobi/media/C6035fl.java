package com.inmobi.media;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.google.common.base.Ascii;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.fl */
/* compiled from: NativeVideoController */
public class C6035fl extends FrameLayout {

    /* renamed from: b */
    private static final String f15292b = C6035fl.class.getSimpleName();

    /* renamed from: a */
    boolean f15293a;

    /* renamed from: c */
    private C6296o f15294c;

    /* renamed from: d */
    private C6037a f15295d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C6038fm f15296e;

    /* renamed from: f */
    private C5879cs f15297f;

    /* renamed from: g */
    private C5879cs f15298g;

    /* renamed from: h */
    private ProgressBar f15299h;

    /* renamed from: i */
    private RelativeLayout f15300i;

    /* renamed from: j */
    private boolean f15301j;

    /* renamed from: k */
    private float f15302k;

    /* renamed from: l */
    private final View.OnClickListener f15303l;

    public C6035fl(Context context) {
        this(context, (byte) 0);
    }

    private C6035fl(Context context, byte b) {
        this(context, 0);
    }

    private C6035fl(Context context, char c) {
        super(context, (AttributeSet) null, 0);
        this.f15301j = false;
        this.f15303l = new View.OnClickListener() {
            public final void onClick(View view) {
                C6035fl.m17947c(C6035fl.this);
            }
        };
        this.f15300i = new RelativeLayout(getContext());
        addView(this.f15300i, new RelativeLayout.LayoutParams(-1, -1));
        this.f15300i.setPadding(0, 0, 0, 0);
        if (this.f15300i != null) {
            this.f15302k = C6215il.m18444a().f15674c;
            this.f15297f = new C5879cs(getContext(), this.f15302k, (byte) 9);
            this.f15298g = new C5879cs(getContext(), this.f15302k, Ascii.f18309VT);
            ProgressBar progressBar = new ProgressBar(getContext(), (AttributeSet) null, 16842872);
            this.f15299h = progressBar;
            progressBar.setScaleY(0.8f);
            m17948e();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12, -1);
            float f = C6215il.m18444a().f15674c;
            layoutParams.setMargins(0, (int) (-6.0f * f), 0, (int) (f * -8.0f));
            LayerDrawable layerDrawable = (LayerDrawable) this.f15299h.getProgressDrawable();
            if (layerDrawable != null) {
                layerDrawable.getDrawable(0).setColorFilter(-1, PorterDuff.Mode.SRC_IN);
                layerDrawable.getDrawable(2).setColorFilter(-327674, PorterDuff.Mode.SRC_IN);
            }
            this.f15300i.addView(this.f15299h, layoutParams);
        }
        this.f15295d = new C6037a(this);
    }

    public void setMediaPlayer(C6038fm fmVar) {
        this.f15296e = fmVar;
        C5869cj cjVar = (C5869cj) fmVar.getTag();
        if (cjVar != null && cjVar.f14819B && !cjVar.mo34866a()) {
            this.f15301j = true;
            this.f15300i.removeView(this.f15298g);
            this.f15300i.removeView(this.f15297f);
            m17949f();
        }
    }

    /* renamed from: e */
    private void m17948e() {
        float f = this.f15302k;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (f * 30.0f), (int) (f * 30.0f));
        layoutParams.addRule(9, -1);
        layoutParams.addRule(12, -1);
        this.f15300i.addView(this.f15297f, layoutParams);
        this.f15297f.setOnClickListener(this.f15303l);
    }

    /* renamed from: f */
    private void m17949f() {
        float f = this.f15302k;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (f * 30.0f), (int) (f * 30.0f));
        layoutParams.addRule(9, -1);
        layoutParams.addRule(12, -1);
        this.f15300i.addView(this.f15298g, layoutParams);
        this.f15298g.setOnClickListener(this.f15303l);
    }

    /* renamed from: a */
    public final void mo35192a() {
        if (!this.f15293a) {
            m17950g();
            this.f15293a = true;
            C5869cj cjVar = (C5869cj) this.f15296e.getTag();
            if (cjVar != null) {
                int i = 4;
                this.f15297f.setVisibility(cjVar.f14819B ? 0 : 4);
                ProgressBar progressBar = this.f15299h;
                if (cjVar.f14821D) {
                    i = 0;
                }
                progressBar.setVisibility(i);
            }
            setVisibility(0);
        }
        this.f15295d.sendEmptyMessage(2);
    }

    /* renamed from: b */
    public final void mo35193b() {
        if (this.f15293a) {
            try {
                this.f15295d.removeMessages(2);
                setVisibility(8);
            } catch (IllegalArgumentException e) {
                C6130gj.m18161a().mo35310a(new C6167hk(e));
            }
            this.f15293a = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m17950g() {
        C6038fm fmVar = this.f15296e;
        if (fmVar != null) {
            int currentPosition = fmVar.getCurrentPosition();
            int duration = this.f15296e.getDuration();
            ProgressBar progressBar = this.f15299h;
            if (progressBar != null && duration != 0) {
                progressBar.setProgress((currentPosition * 100) / duration);
            }
        }
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        C6038fm fmVar = this.f15296e;
        if (fmVar == null || !fmVar.mo35212f()) {
            return false;
        }
        if (this.f15293a) {
            mo35193b();
            return false;
        }
        mo35192a();
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0;
        if (keyCode == 79 || keyCode == 85 || keyCode == 62) {
            if (z) {
                if (this.f15296e.isPlaying()) {
                    this.f15296e.pause();
                } else {
                    this.f15296e.start();
                }
                mo35192a();
            }
            return true;
        } else if (keyCode == 126) {
            if (z && !this.f15296e.isPlaying()) {
                this.f15296e.start();
                mo35192a();
            }
            return true;
        } else if (keyCode == 86 || keyCode == 127) {
            if (z && this.f15296e.isPlaying()) {
                this.f15296e.pause();
                mo35192a();
            }
            return true;
        } else if (keyCode == 25 || keyCode == 24 || keyCode == 164 || keyCode == 27) {
            return super.dispatchKeyEvent(keyEvent);
        } else {
            mo35192a();
            return super.dispatchKeyEvent(keyEvent);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C6035fl.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C6035fl.class.getName());
    }

    /* renamed from: com.inmobi.media.fl$a */
    /* compiled from: NativeVideoController */
    static final class C6037a extends Handler {

        /* renamed from: a */
        private final WeakReference<C6035fl> f15305a;

        C6037a(C6035fl flVar) {
            this.f15305a = new WeakReference<>(flVar);
        }

        public final void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
                return;
            }
            C6035fl flVar = (C6035fl) this.f15305a.get();
            if (flVar != null) {
                flVar.m17950g();
                if (flVar.f15293a && flVar.f15296e.isPlaying()) {
                    sendMessageDelayed(obtainMessage(2), 200);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo35194c() {
        if (this.f15296e != null) {
            this.f15301j = false;
            this.f15300i.removeView(this.f15298g);
            this.f15300i.removeView(this.f15297f);
            m17948e();
        }
    }

    /* renamed from: d */
    public final void mo35195d() {
        if (this.f15296e != null) {
            this.f15301j = true;
            this.f15300i.removeView(this.f15297f);
            this.f15300i.removeView(this.f15298g);
            m17949f();
        }
    }

    public void setVideoAd(C6296o oVar) {
        this.f15294c = oVar;
    }

    public Map<View, FriendlyObstructionPurpose> getFriendlyViews() {
        HashMap hashMap = new HashMap();
        hashMap.put(this.f15299h, FriendlyObstructionPurpose.VIDEO_CONTROLS);
        hashMap.put(this.f15297f, FriendlyObstructionPurpose.VIDEO_CONTROLS);
        hashMap.put(this.f15298g, FriendlyObstructionPurpose.VIDEO_CONTROLS);
        return hashMap;
    }

    /* renamed from: c */
    static /* synthetic */ void m17947c(C6035fl flVar) {
        C6296o oVar;
        C6296o oVar2;
        C6038fm fmVar = flVar.f15296e;
        if (fmVar != null) {
            C5869cj cjVar = (C5869cj) fmVar.getTag();
            if (flVar.f15301j) {
                flVar.f15296e.mo35228i();
                flVar.f15301j = false;
                flVar.f15300i.removeView(flVar.f15298g);
                flVar.f15300i.removeView(flVar.f15297f);
                flVar.m17948e();
                if (cjVar != null && (oVar2 = flVar.f15294c) != null) {
                    try {
                        oVar2.mo35569f(cjVar);
                        cjVar.f14818A = true;
                    } catch (Exception e) {
                        C6130gj.m18161a().mo35310a(new C6167hk(e));
                    }
                }
            } else {
                flVar.f15296e.mo35227h();
                flVar.f15301j = true;
                flVar.f15300i.removeView(flVar.f15297f);
                flVar.f15300i.removeView(flVar.f15298g);
                flVar.m17949f();
                if (cjVar != null && (oVar = flVar.f15294c) != null) {
                    try {
                        oVar.mo35568e(cjVar);
                        cjVar.f14818A = false;
                    } catch (Exception e2) {
                        C6130gj.m18161a().mo35310a(new C6167hk(e2));
                    }
                }
            }
        }
    }
}
