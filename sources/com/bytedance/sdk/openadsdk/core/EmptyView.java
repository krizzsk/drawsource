package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.C2900j;
import com.bytedance.sdk.component.utils.C2923x;
import com.bytedance.sdk.openadsdk.core.p144b.C3362c;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class EmptyView extends View implements C2923x.C2924a {

    /* renamed from: a */
    private boolean f7985a;

    /* renamed from: b */
    private boolean f7986b;

    /* renamed from: c */
    private C3332a f7987c;

    /* renamed from: d */
    private View f7988d;

    /* renamed from: e */
    private List<View> f7989e;

    /* renamed from: f */
    private List<View> f7990f;

    /* renamed from: g */
    private boolean f7991g;

    /* renamed from: h */
    private int f7992h;

    /* renamed from: i */
    private final Handler f7993i = new C2923x(Looper.getMainLooper(), this);

    /* renamed from: j */
    private final AtomicBoolean f7994j = new AtomicBoolean(true);

    /* renamed from: com.bytedance.sdk.openadsdk.core.EmptyView$a */
    public interface C3332a {
        /* renamed from: a */
        void mo19271a();

        /* renamed from: a */
        void mo19272a(View view);

        /* renamed from: a */
        void mo19273a(boolean z);

        /* renamed from: b */
        void mo19274b();
    }

    public EmptyView(Context context, View view) {
        super(C3513m.m10963a());
        this.f7988d = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C3332a aVar = this.f7987c;
        if (aVar != null) {
            aVar.mo19273a(z);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9912d();
        this.f7991g = false;
        m9910b();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        m9910b();
    }

    /* renamed from: b */
    private void m9910b() {
        C3332a aVar;
        if (this.f7994j.getAndSet(false) && (aVar = this.f7987c) != null) {
            aVar.mo19271a();
        }
    }

    /* renamed from: c */
    private void m9911c() {
        C3332a aVar;
        if (!this.f7994j.getAndSet(true) && (aVar = this.f7987c) != null) {
            aVar.mo19274b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m9913e();
        this.f7991g = true;
        m9911c();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m9911c();
    }

    public void setRefClickViews(List<View> list) {
        this.f7989e = list;
    }

    public void setRefCreativeViews(List<View> list) {
        this.f7990f = list;
    }

    /* renamed from: a */
    public void mo19259a() {
        mo19260a(this.f7989e, (C3362c) null);
        mo19260a(this.f7990f, (C3362c) null);
    }

    /* renamed from: a */
    public void mo19260a(List<View> list, C3362c cVar) {
        if (C2900j.m8098b(list)) {
            for (View next : list) {
                if (next != null) {
                    next.setOnClickListener(cVar);
                    next.setOnTouchListener(cVar);
                }
            }
        }
    }

    /* renamed from: d */
    private void m9912d() {
        if (this.f7986b && !this.f7985a) {
            this.f7985a = true;
            this.f7993i.sendEmptyMessage(1);
        }
    }

    /* renamed from: e */
    private void m9913e() {
        if (this.f7985a) {
            this.f7993i.removeCallbacksAndMessages((Object) null);
            this.f7985a = false;
        }
    }

    public void setNeedCheckingShow(boolean z) {
        this.f7986b = z;
        if (!z && this.f7985a) {
            m9913e();
        } else if (z && !this.f7985a) {
            m9912d();
        }
    }

    public void setCallback(C3332a aVar) {
        this.f7987c = aVar;
    }

    public void setAdType(int i) {
        this.f7992h = i;
    }

    /* renamed from: a */
    public void mo17240a(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                boolean c = C3898x.m12780c(C3513m.m10963a(), C3513m.m10963a().getPackageName());
                if (C3703x.m12105a(this.f7988d, 20, this.f7992h) || !c) {
                    this.f7993i.sendEmptyMessageDelayed(2, 1000);
                } else if (!this.f7991g) {
                    setNeedCheckingShow(true);
                }
            }
        } else if (!this.f7985a) {
        } else {
            if (C3703x.m12105a(this.f7988d, 20, this.f7992h)) {
                m9913e();
                this.f7993i.sendEmptyMessageDelayed(2, 1000);
                C3332a aVar = this.f7987c;
                if (aVar != null) {
                    aVar.mo19272a(this.f7988d);
                    return;
                }
                return;
            }
            this.f7993i.sendEmptyMessageDelayed(1, 1000);
        }
    }
}
