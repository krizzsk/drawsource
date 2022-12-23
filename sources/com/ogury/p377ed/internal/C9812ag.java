package com.ogury.p377ed.internal;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import p401io.presage.C12482R;

/* renamed from: com.ogury.ed.internal.ag */
public final class C9812ag {

    /* renamed from: a */
    private final C9816aj f24734a;

    /* renamed from: b */
    private final ViewGroup f24735b;

    /* renamed from: c */
    private final C9967dv f24736c;

    /* renamed from: d */
    private final String f24737d;

    /* renamed from: e */
    private ImageButton f24738e = new ImageButton(this.f24735b.getContext());

    /* renamed from: f */
    private Handler f24739f = new Handler(Looper.getMainLooper());

    public C9812ag(C9816aj ajVar, ViewGroup viewGroup, C9967dv dvVar, String str) {
        C10263mq.m29882b(ajVar, "adController");
        C10263mq.m29882b(viewGroup, "root");
        C10263mq.m29882b(dvVar, "presageApi");
        C10263mq.m29882b(str, "closeButtonCallUrl");
        this.f24734a = ajVar;
        this.f24735b = viewGroup;
        this.f24736c = dvVar;
        this.f24737d = str;
        m28279d();
    }

    /* renamed from: d */
    private final void m28279d() {
        m28281f();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 5;
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        this.f24738e.setLayoutParams(layoutParams2);
        this.f24738e.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C9812ag.m28278a(C9812ag.this, view);
            }
        });
        this.f24738e.setVisibility(8);
        this.f24735b.addView(this.f24738e, layoutParams2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m28278a(C9812ag agVar, View view) {
        C10263mq.m29882b(agVar, "this$0");
        agVar.f24734a.mo64331s();
        agVar.m28280e();
    }

    /* renamed from: e */
    private final void m28280e() {
        if (this.f24737d.length() > 0) {
            this.f24736c.mo64488a(this.f24737d);
        }
    }

    /* renamed from: f */
    private final void m28281f() {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f24738e.setBackground((Drawable) null);
        } else {
            this.f24738e.setBackgroundResource(0);
        }
        this.f24738e.setImageResource(C12482R.C12483drawable.btn_presage_mraid_close);
    }

    /* renamed from: a */
    public final void mo64295a(long j) {
        this.f24739f.postDelayed(new Runnable() {
            public final void run() {
                C9812ag.m28277a(C9812ag.this);
            }
        }, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m28277a(C9812ag agVar) {
        C10263mq.m29882b(agVar, "this$0");
        agVar.mo64294a();
    }

    /* renamed from: a */
    public final void mo64294a() {
        this.f24738e.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo64296b() {
        this.f24739f.removeCallbacksAndMessages((Object) null);
        this.f24738e.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo64297c() {
        this.f24739f.removeCallbacksAndMessages((Object) null);
    }
}
