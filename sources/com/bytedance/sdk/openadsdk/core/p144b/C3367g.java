package com.bytedance.sdk.openadsdk.core.p144b;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.core.p144b.C3362c;
import com.bytedance.sdk.openadsdk.core.p154j.C3473a;

/* renamed from: com.bytedance.sdk.openadsdk.core.b.g */
/* compiled from: VastClickListenerWrapper */
public abstract class C3367g extends C3362c {

    /* renamed from: a */
    private final String f8106a;

    /* renamed from: b */
    private final C3473a f8107b;

    /* renamed from: c */
    private C3362c f8108c;

    /* renamed from: a */
    public abstract void mo19064a();

    public C3367g(String str, C3473a aVar) {
        this(str, aVar, (C3362c) null);
    }

    public C3367g(String str, C3473a aVar, C3362c cVar) {
        this.f8106a = str;
        this.f8107b = aVar;
        this.f8108c = cVar;
    }

    /* renamed from: a */
    public void mo19327a(C3362c cVar) {
        this.f8108c = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18383a(View view, float f, float f2, float f3, float f4, SparseArray<C3362c.C3363a> sparseArray, boolean z) {
        View view2 = view;
        C3473a aVar = this.f8107b;
        if (aVar != null) {
            aVar.mo19900e(this.f8106a);
        }
        if (view2 != null) {
            if (view.getId() == C2914t.m8158e(view.getContext(), "tt_reward_ad_appname")) {
                view.setTag("VAST_TITLE");
            } else if (view.getId() == C2914t.m8158e(view.getContext(), "tt_reward_ad_description")) {
                view.setTag("VAST_DESCRIPTION");
            } else {
                view.setTag(this.f8106a);
            }
        }
        C3362c cVar = this.f8108c;
        if (cVar != null) {
            cVar.f8079w = this.f8079w;
            this.f8108c.f8080x = this.f8080x;
            this.f8108c.f8081y = this.f8081y;
            this.f8108c.f8082z = this.f8081y;
            this.f8108c.f8069A = this.f8081y;
            this.f8108c.mo18383a(view, f, f2, f3, f4, sparseArray, z);
        }
        mo19064a();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }
}
