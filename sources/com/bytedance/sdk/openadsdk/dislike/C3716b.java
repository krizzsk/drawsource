package com.bytedance.sdk.openadsdk.dislike;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.dislike.C3718c;

/* renamed from: com.bytedance.sdk.openadsdk.dislike.b */
/* compiled from: TTAdDislikeImpl */
public class C3716b implements TTAdDislike {

    /* renamed from: a */
    private final Context f9635a;

    /* renamed from: b */
    private C3431n f9636b;

    /* renamed from: c */
    private C3718c f9637c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TTAdDislike.DislikeInteractionCallback f9638d;

    public C3716b(Context context, C3431n nVar) {
        if (!(context instanceof Activity)) {
            C2905l.m8110b("Dislike Initialization must use activity, please pass in TTAdManager.createAdNative(activity)");
        }
        this.f9635a = context;
        this.f9636b = nVar;
        m12157a();
    }

    /* renamed from: a */
    private void m12157a() {
        C3718c cVar = new C3718c(this.f9635a, this.f9636b);
        this.f9637c = cVar;
        cVar.mo20500a((C3718c.C3724a) new C3718c.C3724a() {
            /* renamed from: a */
            public void mo20495a() {
                C2905l.m8111b("TTAdDislikeImpl", "onDislikeShow: ");
            }

            /* renamed from: a */
            public void mo20496a(int i, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && C3716b.this.f9638d != null) {
                        C3716b.this.f9638d.onSelected(i, filterWord.getName());
                    }
                    C2905l.m8118e("TTAdDislikeImpl", "onDislikeSelected: " + i + ", " + String.valueOf(filterWord.getName()));
                } catch (Throwable th) {
                    C2905l.m8115c("TTAdDislikeImpl", "dislike callback selected error: ", th);
                }
            }

            /* renamed from: b */
            public void mo20497b() {
                C2905l.m8118e("TTAdDislikeImpl", "onDislikeDismiss: ");
                try {
                    if (C3716b.this.f9638d != null) {
                        C3716b.this.f9638d.onCancel();
                    }
                } catch (Throwable th) {
                    C2905l.m8115c("TTAdDislikeImpl", "dislike callback cancel error: ", th);
                }
            }

            /* renamed from: c */
            public void mo20498c() {
                C2905l.m8118e("TTAdDislikeImpl", "onDislikeOptionBack: ");
            }
        });
    }

    public void showDislikeDialog() {
        Context context = this.f9635a;
        if (((context instanceof Activity) && !((Activity) context).isFinishing()) && !this.f9637c.isShowing()) {
            this.f9637c.show();
        }
    }

    /* renamed from: a */
    public void mo20493a(C3431n nVar) {
        this.f9637c.mo20499a(nVar);
    }

    public void setDislikeInteractionCallback(TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        this.f9638d = dislikeInteractionCallback;
    }

    /* renamed from: a */
    public void mo20494a(String str) {
        C3718c cVar = this.f9637c;
        if (cVar != null) {
            cVar.mo20501a(str);
        }
    }
}
