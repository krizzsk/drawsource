package com.bytedance.sdk.openadsdk.core.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.d */
/* compiled from: VideoOnTouchLayout */
public class C3696d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3698a f9574a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f9575b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f9576c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f9577d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public float f9578e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f9579f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f9580g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f9581h = true;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f9582i = false;

    /* renamed from: j */
    private final View.OnTouchListener f9583j = new View.OnTouchListener() {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!C3696d.this.f9574a.mo20294o()) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int action = motionEvent.getAction();
                if (action == 0) {
                    C3696d dVar = C3696d.this;
                    boolean unused = dVar.f9584k = dVar.m12067a(motionEvent);
                    float unused2 = C3696d.this.f9577d = x;
                    float unused3 = C3696d.this.f9578e = y;
                    int unused4 = C3696d.this.f9579f = (int) x;
                    int unused5 = C3696d.this.f9580g = (int) y;
                    boolean unused6 = C3696d.this.f9581h = true;
                    if (C3696d.this.f9574a != null && C3696d.this.f9576c && !C3696d.this.f9575b) {
                        C3696d.this.f9574a.mo20272a(view, true);
                    }
                } else if (action == 1) {
                    if (Math.abs(x - ((float) C3696d.this.f9579f)) > 20.0f || Math.abs(y - ((float) C3696d.this.f9580g)) > 20.0f) {
                        boolean unused7 = C3696d.this.f9581h = false;
                    }
                    if (!C3696d.this.f9575b) {
                        boolean unused8 = C3696d.this.f9581h = true;
                    }
                    boolean unused9 = C3696d.this.f9582i = false;
                    float unused10 = C3696d.this.f9577d = 0.0f;
                    float unused11 = C3696d.this.f9578e = 0.0f;
                    int unused12 = C3696d.this.f9579f = 0;
                    if (C3696d.this.f9574a != null) {
                        C3696d.this.f9574a.mo20272a(view, C3696d.this.f9581h);
                    }
                    boolean unused13 = C3696d.this.f9584k = false;
                } else if (action != 2) {
                    if (action == 3) {
                        boolean unused14 = C3696d.this.f9584k = false;
                    }
                } else if (C3696d.this.f9575b && !C3696d.this.f9584k) {
                    float abs = Math.abs(x - C3696d.this.f9577d);
                    float abs2 = Math.abs(y - C3696d.this.f9578e);
                    if (!C3696d.this.f9582i) {
                        if (abs <= 20.0f && abs2 <= 20.0f) {
                            return true;
                        }
                        boolean unused15 = C3696d.this.f9582i = true;
                    }
                    if (C3696d.this.f9574a != null) {
                        C3696d.this.f9574a.mo20293n();
                    }
                    float unused16 = C3696d.this.f9577d = x;
                    float unused17 = C3696d.this.f9578e = y;
                }
                if (C3696d.this.f9575b || !C3696d.this.f9576c) {
                    return true;
                }
                return false;
            } else if (C3696d.this.f9575b || !C3696d.this.f9576c) {
                return true;
            } else {
                return false;
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f9584k;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.d$a */
    /* compiled from: VideoOnTouchLayout */
    public interface C3698a {
        /* renamed from: a */
        void mo20272a(View view, boolean z);

        /* renamed from: n */
        void mo20293n();

        /* renamed from: o */
        boolean mo20294o();
    }

    public C3696d(C3698a aVar) {
        this.f9574a = aVar;
    }

    /* renamed from: a */
    public void mo20474a(View view) {
        if (view != null) {
            view.setOnTouchListener(this.f9583j);
        }
    }

    /* renamed from: a */
    public void mo20475a(boolean z) {
        this.f9576c = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m12067a(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int c = C3904y.m12877c(C3513m.m10963a().getApplicationContext());
        int d = C3904y.m12881d(C3513m.m10963a().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f = (float) c;
        if (rawX > f * 0.01f && rawX < f * 0.99f) {
            float f2 = (float) d;
            if (rawY <= 0.01f * f2 || rawY >= f2 * 0.99f) {
                return true;
            }
            return false;
        }
        return true;
    }
}
