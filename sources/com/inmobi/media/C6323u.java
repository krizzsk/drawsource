package com.inmobi.media;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.inmobi.media.u */
/* compiled from: EmbeddedBrowserCustomView */
public class C6323u extends RelativeLayout {

    /* renamed from: a */
    private static final String f15998a = C6323u.class.getSimpleName();

    /* renamed from: b */
    private final int f15999b = 48;

    /* renamed from: c */
    private int f16000c = -1;

    /* renamed from: d */
    private C6327y f16001d;

    /* renamed from: e */
    private C6326x f16002e;

    /* renamed from: f */
    private C6322t f16003f = null;

    public C6323u(Context context) {
        super(context);
    }

    public void setEmbeddedBrowserUpdateListener(C6326x xVar) {
        this.f16002e = xVar;
    }

    public void setUserLeftApplicationListener(C6322t tVar) {
        this.f16003f = tVar;
    }

    public C6322t getUserLeftApplicationListener() {
        return this.f16003f;
    }

    /* renamed from: a */
    public final void mo35697a(String str, C6324v vVar, boolean z) {
        if (this.f16001d == null) {
            C6327y yVar = new C6327y(getContext());
            this.f16001d = yVar;
            yVar.setId(C6192i.f15633h);
        }
        boolean z2 = true;
        if (this.f16000c != str.hashCode()) {
            if (vVar == C6324v.URL) {
                this.f16001d.loadUrl(str);
            } else {
                this.f16001d.loadData(str, "text/html", "UTF-8");
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            layoutParams.addRule(2, C6192i.f15628c);
            if (findViewById(C6192i.f15633h) != null) {
                this.f16001d.setLayoutParams(layoutParams);
            } else {
                addView(this.f16001d, layoutParams);
            }
            this.f16000c = str.hashCode();
        }
        if (z) {
            if (findViewById(C6192i.f15628c) == null) {
                z2 = false;
            }
            if (!z2) {
                float f = C6215il.m18444a().f15674c;
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(0);
                linearLayout.setId(C6192i.f15628c);
                linearLayout.setWeightSum(100.0f);
                linearLayout.setBackgroundResource(17301658);
                linearLayout.setBackgroundColor(-7829368);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (48.0f * f));
                layoutParams2.addRule(12);
                addView(linearLayout, layoutParams2);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
                layoutParams3.weight = 25.0f;
                C5879cs csVar = new C5879cs(getContext(), f, (byte) 2);
                csVar.setId(C6192i.f15634i);
                csVar.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return C6323u.this.m18941d(view, motionEvent);
                    }
                });
                linearLayout.addView(csVar, layoutParams3);
                C5879cs csVar2 = new C5879cs(getContext(), f, (byte) 3);
                csVar2.setId(C6192i.f15637l);
                csVar2.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return C6323u.this.m18940c(view, motionEvent);
                    }
                });
                linearLayout.addView(csVar2, layoutParams3);
                C5879cs csVar3 = new C5879cs(getContext(), f, (byte) 4);
                csVar3.setId(C6192i.f15636k);
                csVar3.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return C6323u.this.m18939b(view, motionEvent);
                    }
                });
                linearLayout.addView(csVar3, layoutParams3);
                C5879cs csVar4 = new C5879cs(getContext(), f, (byte) 6);
                csVar4.setId(C6192i.f15635j);
                csVar4.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return C6323u.this.m18938a(view, motionEvent);
                    }
                });
                linearLayout.addView(csVar4, layoutParams3);
                return;
            }
            return;
        }
        View findViewById = findViewById(C6192i.f15628c);
        if (findViewById != null) {
            removeView(findViewById);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ boolean m18941d(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            mo35696a();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo35696a() {
        C6326x xVar = this.f16002e;
        if (xVar != null) {
            xVar.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ boolean m18940c(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            C6327y yVar = this.f16001d;
            if (yVar != null) {
                yVar.reload();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ boolean m18939b(View view, MotionEvent motionEvent) {
        if (this.f16001d == null) {
            mo35696a();
            return true;
        } else if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (this.f16001d.canGoBack()) {
                this.f16001d.goBack();
            } else {
                mo35696a();
            }
            return true;
        } else {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m18938a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (this.f16001d.canGoForward()) {
                this.f16001d.goForward();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    /* renamed from: b */
    public final void mo35698b() {
        C6327y yVar = this.f16001d;
        if (yVar != null) {
            yVar.destroy();
        }
        this.f16001d = null;
        this.f16002e = null;
        this.f16003f = null;
        removeAllViews();
    }
}
