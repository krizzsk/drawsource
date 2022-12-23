package com.inmobi.ads.rendering;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.inmobi.media.C5879cs;
import com.inmobi.media.C5897cw;
import com.inmobi.media.C5899cx;
import com.inmobi.media.C5902cz;
import com.inmobi.media.C5921dg;
import com.inmobi.media.C5951dx;
import com.inmobi.media.C6074ft;
import com.inmobi.media.C6093fu;
import com.inmobi.media.C6130gj;
import com.inmobi.media.C6167hk;
import com.inmobi.media.C6183hw;
import com.inmobi.media.C6192i;
import com.inmobi.media.C6195ic;
import com.inmobi.media.C6215il;
import com.inmobi.media.C6234j;
import com.inmobi.media.C6301q;
import com.inmobi.media.C6321s;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.vungle.warren.model.ReportDBAdapter;
import java.util.Set;

public class InMobiAdActivity extends Activity {

    /* renamed from: c */
    private static final String f19587c = InMobiAdActivity.class.getSimpleName();

    /* renamed from: d */
    private static SparseArray<C6234j> f19588d = new SparseArray<>();

    /* renamed from: e */
    private static C6301q f19589e;

    /* renamed from: f */
    private static C6321s f19590f;

    /* renamed from: a */
    public C5899cx f19591a;

    /* renamed from: b */
    public boolean f19592b = false;

    /* renamed from: g */
    private C5897cw f19593g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C6301q f19594h;

    /* renamed from: i */
    private int f19595i;

    /* renamed from: j */
    private boolean f19596j = false;

    /* renamed from: a */
    public static int m23146a(C6234j jVar) {
        int hashCode = jVar.hashCode();
        f19588d.put(hashCode, jVar);
        return hashCode;
    }

    /* renamed from: a */
    public static void m23150a(Object obj) {
        f19588d.remove(obj.hashCode());
    }

    /* renamed from: a */
    public static void m23148a(C6301q qVar) {
        f19589e = qVar;
    }

    /* renamed from: a */
    public static void m23149a(C6321s sVar) {
        f19590f = sVar;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        C5897cw cwVar;
        super.onResume();
        if (!this.f19592b) {
            int i = this.f19595i;
            if (100 == i) {
                C6301q qVar = this.f19594h;
                if (qVar != null && qVar.getFullScreenEventsListener() != null) {
                    try {
                        if (!this.f19596j) {
                            this.f19596j = true;
                            this.f19594h.getFullScreenEventsListener().mo35462a(this.f19594h);
                        }
                    } catch (Exception unused) {
                    }
                }
            } else if (102 == i && (cwVar = this.f19593g) != null && cwVar.f14916b != null) {
                cwVar.f14916b.mo34972c();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        C5897cw cwVar;
        super.onStart();
        if (!this.f19592b && 102 == this.f19595i && (cwVar = this.f19593g) != null && cwVar.f14916b != null) {
            cwVar.f14916b.mo34971b();
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f19596j = false;
        this.f19594h = null;
        setIntent(intent);
        C5897cw cwVar = this.f19593g;
        if (cwVar != null) {
            cwVar.mo34979a(intent, f19588d);
            if (cwVar.f14916b != null) {
                cwVar.f14916b.mo34971b();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C6321s sVar;
        C6074ft ftVar;
        C6074ft ftVar2;
        super.onCreate(bundle);
        if (!C6183hw.m18318a()) {
            finish();
            C6195ic.m18378a((byte) 2, "InMobi", "Session not found, AdActivity will be closed");
            return;
        }
        this.f19596j = false;
        if (Build.VERSION.SDK_INT >= 29) {
            C6215il.m18446a((Context) this);
        }
        this.f19595i = getIntent().getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
        this.f19591a = new C5899cx(this);
        int i = this.f19595i;
        if (i == 100) {
            String stringExtra = getIntent().getStringExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL");
            long longExtra = getIntent().getLongExtra(ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID, Long.MIN_VALUE);
            boolean booleanExtra = getIntent().getBooleanExtra("allowAutoRedirection", false);
            String stringExtra2 = getIntent().getStringExtra("impressionId");
            String stringExtra3 = getIntent().getStringExtra("creativeId");
            C6321s sVar2 = C6301q.f15888a;
            C6301q qVar = f19589e;
            if (qVar != null) {
                sVar2 = qVar.getListener();
                ftVar2 = f19589e.getAdConfig();
            } else {
                ftVar2 = (C6074ft) C6093fu.m18077a(CampaignUnit.JSON_KEY_ADS, C6183hw.m18332f());
                C6321s sVar3 = f19590f;
                if (sVar3 != null) {
                    ftVar = ftVar2;
                    sVar = sVar3;
                    C6301q qVar2 = r1;
                    C6301q qVar3 = new C6301q(this, (byte) 1, (Set<C5951dx>) null, stringExtra2, Boolean.TRUE, "DEFAULT");
                    this.f19594h = qVar2;
                    qVar2.setPlacementId(longExtra);
                    this.f19594h.setCreativeId(stringExtra3);
                    this.f19594h.setAllowAutoRedirection(booleanExtra);
                    this.f19594h.setShouldFireRenderBeacon(false);
                    this.f19594h.mo35576a(sVar, ftVar, false, false);
                    RelativeLayout relativeLayout = new RelativeLayout(this);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(10);
                    layoutParams.addRule(2, C6192i.f15628c);
                    relativeLayout.setBackgroundColor(-1);
                    relativeLayout.addView(this.f19594h, layoutParams);
                    float f = C6215il.m18444a().f15674c;
                    LinearLayout linearLayout = new LinearLayout(this);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (48.0f * f));
                    linearLayout.setOrientation(0);
                    linearLayout.setId(C6192i.f15628c);
                    linearLayout.setWeightSum(100.0f);
                    linearLayout.setBackgroundResource(17301658);
                    linearLayout.setBackgroundColor(-7829368);
                    layoutParams2.addRule(12);
                    relativeLayout.addView(linearLayout, layoutParams2);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
                    layoutParams3.weight = 25.0f;
                    C5879cs csVar = new C5879cs(this, f, (byte) 2);
                    csVar.setOnTouchListener(new View.OnTouchListener() {
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            if (motionEvent.getAction() == 1) {
                                view.setBackgroundColor(-7829368);
                                InMobiAdActivity.this.f19592b = true;
                                InMobiAdActivity.this.finish();
                                return true;
                            }
                            if (motionEvent.getAction() == 0) {
                                view.setBackgroundColor(-16711681);
                            }
                            return true;
                        }
                    });
                    linearLayout.addView(csVar, layoutParams3);
                    C5879cs csVar2 = new C5879cs(this, f, (byte) 3);
                    csVar2.setOnTouchListener(new View.OnTouchListener() {
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            if (motionEvent.getAction() == 1) {
                                view.setBackgroundColor(-7829368);
                                InMobiAdActivity.this.f19594h.reload();
                                return true;
                            }
                            if (motionEvent.getAction() == 0) {
                                view.setBackgroundColor(-16711681);
                            }
                            return true;
                        }
                    });
                    linearLayout.addView(csVar2, layoutParams3);
                    C5879cs csVar3 = new C5879cs(this, f, (byte) 4);
                    csVar3.setOnTouchListener(new View.OnTouchListener() {
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            if (motionEvent.getAction() == 1) {
                                view.setBackgroundColor(-7829368);
                                if (InMobiAdActivity.this.f19594h.canGoBack()) {
                                    InMobiAdActivity.this.f19594h.goBack();
                                } else {
                                    InMobiAdActivity.this.f19592b = true;
                                    InMobiAdActivity.this.finish();
                                }
                                return true;
                            }
                            if (motionEvent.getAction() == 0) {
                                view.setBackgroundColor(-16711681);
                            }
                            return true;
                        }
                    });
                    linearLayout.addView(csVar3, layoutParams3);
                    C5879cs csVar4 = new C5879cs(this, f, (byte) 6);
                    csVar4.setOnTouchListener(new View.OnTouchListener() {
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            if (motionEvent.getAction() == 1) {
                                view.setBackgroundColor(-7829368);
                                if (InMobiAdActivity.this.f19594h.canGoForward()) {
                                    InMobiAdActivity.this.f19594h.goForward();
                                }
                                return true;
                            }
                            if (motionEvent.getAction() == 0) {
                                view.setBackgroundColor(-16711681);
                            }
                            return true;
                        }
                    });
                    linearLayout.addView(csVar4, layoutParams3);
                    setContentView(relativeLayout);
                    this.f19594h.loadUrl(stringExtra);
                    this.f19594h.setFullScreenActivityContext(this);
                    this.f19591a.mo34988a((C5902cz) this.f19594h);
                }
            }
            sVar = sVar2;
            ftVar = ftVar2;
            try {
                C6301q qVar22 = qVar3;
                C6301q qVar32 = new C6301q(this, (byte) 1, (Set<C5951dx>) null, stringExtra2, Boolean.TRUE, "DEFAULT");
                this.f19594h = qVar22;
                qVar22.setPlacementId(longExtra);
                this.f19594h.setCreativeId(stringExtra3);
                this.f19594h.setAllowAutoRedirection(booleanExtra);
                this.f19594h.setShouldFireRenderBeacon(false);
                this.f19594h.mo35576a(sVar, ftVar, false, false);
                RelativeLayout relativeLayout2 = new RelativeLayout(this);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams4.addRule(10);
                layoutParams4.addRule(2, C6192i.f15628c);
                relativeLayout2.setBackgroundColor(-1);
                relativeLayout2.addView(this.f19594h, layoutParams4);
                float f2 = C6215il.m18444a().f15674c;
                LinearLayout linearLayout2 = new LinearLayout(this);
                RelativeLayout.LayoutParams layoutParams22 = new RelativeLayout.LayoutParams(-1, (int) (48.0f * f2));
                linearLayout2.setOrientation(0);
                linearLayout2.setId(C6192i.f15628c);
                linearLayout2.setWeightSum(100.0f);
                linearLayout2.setBackgroundResource(17301658);
                linearLayout2.setBackgroundColor(-7829368);
                layoutParams22.addRule(12);
                relativeLayout2.addView(linearLayout2, layoutParams22);
                LinearLayout.LayoutParams layoutParams32 = new LinearLayout.LayoutParams(-1, -1);
                layoutParams32.weight = 25.0f;
                C5879cs csVar5 = new C5879cs(this, f2, (byte) 2);
                csVar5.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 1) {
                            view.setBackgroundColor(-7829368);
                            InMobiAdActivity.this.f19592b = true;
                            InMobiAdActivity.this.finish();
                            return true;
                        }
                        if (motionEvent.getAction() == 0) {
                            view.setBackgroundColor(-16711681);
                        }
                        return true;
                    }
                });
                linearLayout2.addView(csVar5, layoutParams32);
                C5879cs csVar22 = new C5879cs(this, f2, (byte) 3);
                csVar22.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 1) {
                            view.setBackgroundColor(-7829368);
                            InMobiAdActivity.this.f19594h.reload();
                            return true;
                        }
                        if (motionEvent.getAction() == 0) {
                            view.setBackgroundColor(-16711681);
                        }
                        return true;
                    }
                });
                linearLayout2.addView(csVar22, layoutParams32);
                C5879cs csVar32 = new C5879cs(this, f2, (byte) 4);
                csVar32.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 1) {
                            view.setBackgroundColor(-7829368);
                            if (InMobiAdActivity.this.f19594h.canGoBack()) {
                                InMobiAdActivity.this.f19594h.goBack();
                            } else {
                                InMobiAdActivity.this.f19592b = true;
                                InMobiAdActivity.this.finish();
                            }
                            return true;
                        }
                        if (motionEvent.getAction() == 0) {
                            view.setBackgroundColor(-16711681);
                        }
                        return true;
                    }
                });
                linearLayout2.addView(csVar32, layoutParams32);
                C5879cs csVar42 = new C5879cs(this, f2, (byte) 6);
                csVar42.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 1) {
                            view.setBackgroundColor(-7829368);
                            if (InMobiAdActivity.this.f19594h.canGoForward()) {
                                InMobiAdActivity.this.f19594h.goForward();
                            }
                            return true;
                        }
                        if (motionEvent.getAction() == 0) {
                            view.setBackgroundColor(-16711681);
                        }
                        return true;
                    }
                });
                linearLayout2.addView(csVar42, layoutParams32);
                setContentView(relativeLayout2);
                this.f19594h.loadUrl(stringExtra);
                this.f19594h.setFullScreenActivityContext(this);
                this.f19591a.mo34988a((C5902cz) this.f19594h);
            } catch (Exception e) {
                C6130gj.m18161a().mo35310a(new C6167hk(e));
                sVar.mo34403a();
                finish();
            }
        } else if (i == 102) {
            C5897cw cwVar = new C5897cw(this);
            this.f19593g = cwVar;
            this.f19591a.mo34988a((C5902cz) cwVar);
            this.f19593g.mo34979a(getIntent(), f19588d);
        }
    }

    public void onStop() {
        C5897cw cwVar;
        super.onStop();
        if (!this.f19592b && (cwVar = this.f19593g) != null && cwVar.f14916b != null) {
            cwVar.f14916b.mo34973d();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (this.f19592b) {
            int i = this.f19595i;
            if (100 == i) {
                C6301q qVar = this.f19594h;
                if (!(qVar == null || qVar.getFullScreenEventsListener() == null)) {
                    try {
                        this.f19594h.getFullScreenEventsListener().mo35463b(this.f19594h);
                        this.f19594h.destroy();
                        if (this.f19591a != null) {
                            this.f19591a.mo34990b(this.f19594h);
                        }
                        this.f19594h = null;
                    } catch (Exception unused) {
                    }
                }
            } else if (102 == i) {
                C5897cw cwVar = this.f19593g;
                if (cwVar != null) {
                    C5899cx cxVar = this.f19591a;
                    if (cxVar != null) {
                        cxVar.mo34990b(cwVar);
                    }
                    this.f19593g.mo34978a();
                }
                this.f19593g = null;
            }
        } else {
            int i2 = this.f19595i;
            if (100 != i2 && 102 == i2) {
                C5897cw cwVar2 = this.f19593g;
                if (cwVar2 != null) {
                    C5899cx cxVar2 = this.f19591a;
                    if (cxVar2 != null) {
                        cxVar2.mo34990b(cwVar2);
                    }
                    this.f19593g.mo34978a();
                }
                this.f19593g = null;
            }
        }
        C5899cx cxVar3 = this.f19591a;
        if (cxVar3 != null) {
            cxVar3.f14926a.clear();
            cxVar3.disable();
            cxVar3.f14927b = null;
        }
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C5899cx cxVar = this.f19591a;
        if (cxVar != null) {
            cxVar.mo34986a();
        }
    }

    public void onMultiWindowModeChanged(boolean z) {
        C5897cw cwVar;
        super.onMultiWindowModeChanged(z);
        if (!z && (cwVar = this.f19593g) != null) {
            C5921dg orientationProperties = cwVar.f14917c instanceof C6301q ? ((C6301q) cwVar.f14917c).getOrientationProperties() : null;
            C5899cx cxVar = this.f19591a;
            if (cxVar != null) {
                cxVar.mo34989a(orientationProperties);
            }
        }
    }

    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        super.onMultiWindowModeChanged(z, configuration);
        onMultiWindowModeChanged(z);
    }

    /* renamed from: a */
    public final void mo56274a(C5921dg dgVar) {
        C5899cx cxVar = this.f19591a;
        if (cxVar != null) {
            cxVar.mo34989a(dgVar);
        }
    }

    public void onBackPressed() {
        int i = this.f19595i;
        if (i == 102) {
            C5897cw cwVar = this.f19593g;
            if (cwVar != null && cwVar.f14916b != null) {
                cwVar.f14916b.mo34975f();
            }
        } else if (i == 100) {
            this.f19592b = true;
            finish();
        }
    }
}
