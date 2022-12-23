package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.environment.C6393h;
import com.ironsource.environment.p204e.C6385a;
import com.ironsource.sdk.controller.C8202x;
import com.ironsource.sdk.p278a.C8100a;
import com.ironsource.sdk.p278a.C8104d;
import com.ironsource.sdk.p278a.C8106f;
import com.ironsource.sdk.p280c.C8123d;
import com.ironsource.sdk.p281d.C8265b;
import com.ironsource.sdk.p285g.C8290b;
import com.ironsource.sdk.p285g.C8293d;
import com.ironsource.sdk.p287i.C8308a;
import com.ironsource.sdk.p288j.C8320g;
import com.ironsource.sdk.utils.C8345d;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;

public class ControllerActivity extends Activity implements C8201w, C8320g {

    /* renamed from: a */
    private static final String f19706a = ControllerActivity.class.getSimpleName();

    /* renamed from: b */
    private static String f19707b = "removeWebViewContainerView | mContainer is null";

    /* renamed from: c */
    private static String f19708c = "removeWebViewContainerView | view is null";
    public int currentRequestedRotation = -1;

    /* renamed from: d */
    private String f19709d;

    /* renamed from: e */
    private C8202x f19710e;

    /* renamed from: f */
    private RelativeLayout f19711f;

    /* renamed from: g */
    private FrameLayout f19712g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f19713h = false;

    /* renamed from: i */
    private String f19714i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Handler f19715j = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Runnable f19716k = new Runnable() {
        public final void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.f19713h));
        }
    };

    /* renamed from: l */
    private RelativeLayout.LayoutParams f19717l = new RelativeLayout.LayoutParams(-1, -1);

    /* renamed from: m */
    private C8290b f19718m;

    /* renamed from: n */
    private boolean f19719n;

    /* renamed from: o */
    private boolean f19720o;

    /* renamed from: a */
    private void m23238a() {
        Logger.m23749i(f19706a, "clearWebviewController");
        C8202x xVar = this.f19710e;
        if (xVar == null) {
            Logger.m23749i(f19706a, "clearWebviewController, null");
            return;
        }
        xVar.f19978j = C8202x.C8258g.Gone;
        this.f19710e.f19980l = null;
        this.f19710e.f19990v = null;
        this.f19710e.mo56502a(this.f19714i, "onDestroy");
    }

    /* renamed from: a */
    private void m23239a(String str) {
        if (str == null) {
            return;
        }
        if ("landscape".equalsIgnoreCase(str)) {
            m23242b();
        } else if ("portrait".equalsIgnoreCase(str)) {
            m23244c();
        } else if ("device".equalsIgnoreCase(str)) {
            if (C6393h.m19134q(this)) {
                setRequestedOrientation(1);
            }
        } else if (getRequestedOrientation() == -1) {
            setRequestedOrientation(4);
        }
    }

    /* renamed from: b */
    private void m23242b() {
        int k = C6393h.m19122k(this);
        Logger.m23749i(f19706a, "setInitiateLandscapeOrientation");
        if (k == 0) {
            Logger.m23749i(f19706a, "ROTATION_0");
            setRequestedOrientation(0);
        } else if (k == 2) {
            Logger.m23749i(f19706a, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (k == 3) {
            Logger.m23749i(f19706a, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (k == 1) {
            Logger.m23749i(f19706a, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        } else {
            Logger.m23749i(f19706a, "No Rotation");
        }
    }

    /* renamed from: c */
    private void m23244c() {
        int k = C6393h.m19122k(this);
        Logger.m23749i(f19706a, "setInitiatePortraitOrientation");
        if (k == 0) {
            Logger.m23749i(f19706a, "ROTATION_0");
            setRequestedOrientation(1);
        } else if (k == 2) {
            Logger.m23749i(f19706a, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (k == 1) {
            Logger.m23749i(f19706a, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (k == 3) {
            Logger.m23749i(f19706a, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        } else {
            Logger.m23749i(f19706a, "No Rotation");
        }
    }

    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        Logger.m23749i(f19706a, "onBackPressed");
        new C8308a();
        if (!C8308a.m23666a(this)) {
            super.onBackPressed();
        }
    }

    public void onCloseRequested() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Logger.m23749i(f19706a, "onCreate");
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            C8202x xVar = (C8202x) C8265b.m23538a((Context) this).f20120a.f19781a;
            this.f19710e = xVar;
            xVar.f19977i.setId(1);
            this.f19710e.f19990v = this;
            this.f19710e.f19980l = this;
            Intent intent = getIntent();
            this.f19714i = intent.getStringExtra("productType");
            this.f19713h = intent.getBooleanExtra("immersive", false);
            this.f19709d = intent.getStringExtra("adViewId");
            this.f19719n = false;
            this.f19720o = intent.getBooleanExtra("ctrWVPauseResume", false);
            if (this.f19713h) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
                    public final void onSystemUiVisibilityChange(int i) {
                        if ((i & InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                            ControllerActivity.this.f19715j.removeCallbacks(ControllerActivity.this.f19716k);
                            ControllerActivity.this.f19715j.postDelayed(ControllerActivity.this.f19716k, 500);
                        }
                    }
                });
                runOnUiThread(this.f19716k);
            }
            if (!TextUtils.isEmpty(this.f19714i) && C8293d.C8298e.OfferWall.toString().equalsIgnoreCase(this.f19714i)) {
                if (bundle != null) {
                    C8290b bVar = (C8290b) bundle.getParcelable("state");
                    if (bVar != null) {
                        this.f19718m = bVar;
                        this.f19710e.mo56499a(bVar);
                    }
                    finish();
                } else {
                    this.f19718m = this.f19710e.f19981m;
                }
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f19711f = relativeLayout;
            setContentView(relativeLayout, this.f19717l);
            String str = this.f19709d;
            this.f19712g = !(!TextUtils.isEmpty(str) && !str.equals(Integer.toString(1))) ? this.f19710e.f19977i : C8345d.m23775a(getApplicationContext(), C8123d.m23224a().mo56345a(str).mo56331b());
            if (this.f19711f.findViewById(1) == null && this.f19712g.getParent() != null) {
                finish();
            }
            Intent intent2 = getIntent();
            String stringExtra = intent2.getStringExtra("orientation_set_flag");
            intent2.getIntExtra("rotation_set_flag", 0);
            m23239a(stringExtra);
            this.f19711f.addView(this.f19712g, this.f19717l);
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        Logger.m23749i(f19706a, "onDestroy");
        try {
            if (this.f19711f != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f19712g.getParent();
                View findViewById = this.f19709d == null ? viewGroup2.findViewById(1) : C8123d.m23224a().mo56345a(this.f19709d).mo56331b();
                if (findViewById != null) {
                    if (isFinishing() && (viewGroup = (ViewGroup) findViewById.getParent()) != null) {
                        viewGroup.removeView(findViewById);
                    }
                    viewGroup2.removeView(this.f19712g);
                    if (!this.f19719n) {
                        Logger.m23749i(f19706a, "onDestroy | destroyedFromBackground");
                        m23238a();
                        return;
                    }
                    return;
                }
                throw new Exception(f19708c);
            }
            throw new Exception(f19707b);
        } catch (Exception e) {
            C8104d.m23161a(C8106f.f19637p, (Map<String, Object>) new C8100a().mo56293a("callfailreason", e.getMessage()).f19613a);
            String str = f19706a;
            Logger.m23749i(str, "removeWebViewContainerView fail " + e.getMessage());
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.f19710e.f19976h != null) {
                this.f19710e.f19975g.onHideCustomView();
                return true;
            }
        }
        if (this.f19713h && (i == 25 || i == 24)) {
            this.f19715j.removeCallbacks(this.f19716k);
            this.f19715j.postDelayed(this.f19716k, 500);
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onOrientationChanged(String str, int i) {
        m23239a(str);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        String str = f19706a;
        Logger.m23749i(str, "onPause, isFinishing=" + isFinishing());
        C6385a.f16166a.mo35892b(new Runnable((AudioManager) getSystemService("audio")) {

            /* renamed from: a */
            private /* synthetic */ AudioManager f19930a;

            {
                this.f19930a = r1;
            }

            public final void run() {
                try {
                    this.f19930a.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        C8202x xVar = this.f19710e;
        if (xVar != null) {
            xVar.mo56425b((Context) this);
            if (!this.f19720o) {
                this.f19710e.mo56513k();
            }
            this.f19710e.mo56503a(false, "main");
            this.f19710e.mo56502a(this.f19714i, "onPause");
        }
        if (isFinishing()) {
            this.f19719n = true;
            m23238a();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Logger.m23749i(f19706a, "onResume");
        C8202x xVar = this.f19710e;
        if (xVar != null) {
            xVar.mo56411a((Context) this);
            if (!this.f19720o) {
                this.f19710e.mo56514l();
            }
            this.f19710e.mo56503a(true, "main");
            this.f19710e.mo56502a(this.f19714i, "onResume");
        }
        C6385a.f16166a.mo35892b(new Runnable((AudioManager) getSystemService("audio")) {

            /* renamed from: a */
            private /* synthetic */ AudioManager f19931a;

            {
                this.f19931a = r1;
            }

            public final void run() {
                try {
                    this.f19931a.requestAudioFocus((AudioManager.OnAudioFocusChangeListener) null, 3, 2);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.f19714i) && C8293d.C8298e.OfferWall.toString().equalsIgnoreCase(this.f19714i)) {
            this.f19718m.f20205d = true;
            bundle.putParcelable("state", this.f19718m);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        Logger.m23749i(f19706a, "onStart");
        C8202x xVar = this.f19710e;
        if (xVar != null) {
            xVar.mo56502a(this.f19714i, "onStart");
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        Logger.m23749i(f19706a, "onStop");
        C8202x xVar = this.f19710e;
        if (xVar != null) {
            xVar.mo56502a(this.f19714i, "onStop");
        }
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.m23749i(f19706a, "onUserLeaveHint");
        C8202x xVar = this.f19710e;
        if (xVar != null) {
            xVar.mo56502a(this.f19714i, "onUserLeaveHint");
        }
    }

    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f19713h && z) {
            runOnUiThread(this.f19716k);
        }
    }

    public void setRequestedOrientation(int i) {
        if (this.currentRequestedRotation != i) {
            String str = f19706a;
            Logger.m23749i(str, "Rotation: Req = " + i + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i;
            super.setRequestedOrientation(i);
        }
    }

    public void toggleKeepScreen(boolean z) {
        runOnUiThread(z ? new Runnable() {
            public final void run() {
                ControllerActivity.this.getWindow().addFlags(128);
            }
        } : new Runnable() {
            public final void run() {
                ControllerActivity.this.getWindow().clearFlags(128);
            }
        });
    }
}
