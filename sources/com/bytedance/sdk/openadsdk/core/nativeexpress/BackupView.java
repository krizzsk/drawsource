package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.C2909o;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p144b.C3359a;
import com.bytedance.sdk.openadsdk.core.p144b.C3360b;
import com.bytedance.sdk.openadsdk.core.p149e.C3414j;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.dislike.C3716b;
import com.bytedance.sdk.openadsdk.p128b.C3100j;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;

public abstract class BackupView extends FrameLayout {

    /* renamed from: a */
    private C3100j f8805a;
    /* access modifiers changed from: protected */

    /* renamed from: b */
    public Context f8806b;
    /* access modifiers changed from: protected */

    /* renamed from: c */
    public C3431n f8807c;

    /* renamed from: d */
    protected C3716b f8808d;

    /* renamed from: e */
    protected TTDislikeDialogAbstract f8809e;
    /* access modifiers changed from: protected */

    /* renamed from: f */
    public String f8810f = "embeded_ad";

    /* renamed from: g */
    protected int f8811g;

    /* renamed from: h */
    protected int f8812h;

    /* renamed from: i */
    protected int f8813i;

    /* renamed from: j */
    protected boolean f8814j = true;

    /* renamed from: k */
    protected boolean f8815k = true;

    /* renamed from: l */
    protected String f8816l;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo19169a(View view, int i, C3414j jVar);

    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    public BackupView(Context context) {
        super(context);
        setTag("tt_express_backup_fl_tag_26");
    }

    public BackupView(Context context, String str) {
        super(context);
        this.f8816l = str;
        setTag("tt_express_backup_fl_tag_26");
    }

    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public void setDislikeInner(TTAdDislike tTAdDislike) {
        if (tTAdDislike instanceof C3716b) {
            this.f8808d = (C3716b) tTAdDislike;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        C3431n nVar;
        if (!(tTDislikeDialogAbstract == null || (nVar = this.f8807c) == null)) {
            tTDislikeDialogAbstract.setMaterialMeta(nVar);
        }
        this.f8809e = tTDislikeDialogAbstract;
    }

    /* renamed from: a */
    public void mo19328a() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f8809e;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        C3716b bVar = this.f8808d;
        if (bVar != null) {
            bVar.showDislikeDialog();
        } else {
            TTDelegateActivity.m8479a(this.f8807c, (String) null);
        }
    }

    /* access modifiers changed from: protected */
    public String getNameOrSource() {
        C3431n nVar = this.f8807c;
        if (nVar == null) {
            return "";
        }
        if (nVar.mo19567aa() != null && !TextUtils.isEmpty(this.f8807c.mo19567aa().mo19404b())) {
            return this.f8807c.mo19567aa().mo19404b();
        }
        if (!TextUtils.isEmpty(this.f8807c.mo19518K())) {
            return this.f8807c.mo19518K();
        }
        return "";
    }

    /* access modifiers changed from: protected */
    public String getTitle() {
        if (this.f8807c.mo19567aa() != null && !TextUtils.isEmpty(this.f8807c.mo19567aa().mo19404b())) {
            return this.f8807c.mo19567aa().mo19404b();
        }
        if (!TextUtils.isEmpty(this.f8807c.mo19518K())) {
            return this.f8807c.mo19518K();
        }
        return !TextUtils.isEmpty(this.f8807c.mo19528U()) ? this.f8807c.mo19528U() : "";
    }

    /* access modifiers changed from: protected */
    public String getDescription() {
        if (!TextUtils.isEmpty(this.f8807c.mo19528U())) {
            return this.f8807c.mo19528U();
        }
        return !TextUtils.isEmpty(this.f8807c.mo19529V()) ? this.f8807c.mo19529V() : "";
    }

    public float getRealWidth() {
        return (float) C3904y.m12882d(this.f8806b, (float) this.f8811g);
    }

    public float getRealHeight() {
        return (float) C3904y.m12882d(this.f8806b, (float) this.f8812h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19991a(View view, boolean z) {
        C3360b bVar;
        if (view != null) {
            if (z) {
                Context context = this.f8806b;
                C3431n nVar = this.f8807c;
                String str = this.f8810f;
                bVar = new C3359a(context, nVar, str, C3898x.m12747a(str));
            } else {
                Context context2 = this.f8806b;
                C3431n nVar2 = this.f8807c;
                String str2 = this.f8810f;
                bVar = new C3360b(context2, nVar2, str2, C3898x.m12747a(str2));
            }
            view.setOnTouchListener(bVar);
            view.setOnClickListener(bVar);
            bVar.mo19310a((C3528a) new C3528a() {
                /* renamed from: a */
                public void mo20002a(View view, int i, C3414j jVar) {
                    BackupView.this.mo19169a(view, i, jVar);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public View getVideoView() {
        NativeVideoTsView nativeVideoTsView;
        C3431n nVar = this.f8807c;
        if (!(nVar == null || this.f8806b == null)) {
            if (C3431n.m10311c(nVar)) {
                try {
                    nativeVideoTsView = new NativeVideoTsView(this.f8806b, this.f8807c, this.f8810f, true, false, this.f8805a);
                    nativeVideoTsView.setVideoCacheUrl(this.f8816l);
                    nativeVideoTsView.setControllerStatusCallBack(new NativeVideoTsView.C3630b() {
                        /* renamed from: a */
                        public void mo18858a(boolean z, long j, long j2, long j3, boolean z2) {
                        }
                    });
                    nativeVideoTsView.setIsAutoPlay(this.f8814j);
                    nativeVideoTsView.setIsQuiet(this.f8815k);
                } catch (Throwable unused) {
                }
                if (C3431n.m10311c(this.f8807c) || nativeVideoTsView == null || !nativeVideoTsView.mo20207a(0, true, false)) {
                    return null;
                }
                return nativeVideoTsView;
            }
            nativeVideoTsView = null;
            if (C3431n.m10311c(this.f8807c)) {
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19989a(int i) {
        this.f8815k = C3513m.m10973h().mo19837a(this.f8813i);
        int c = C3513m.m10973h().mo19841c(i);
        if (3 == c) {
            this.f8814j = false;
            return;
        }
        int c2 = C2909o.m8136c(C3513m.m10963a());
        if (1 == c && C3898x.m12793e(c2)) {
            this.f8814j = true;
        } else if (2 == c) {
            if (C3898x.m12798f(c2) || C3898x.m12793e(c2) || C3898x.m12803g(c2)) {
                this.f8814j = true;
            }
        } else if (5 != c) {
        } else {
            if (C3898x.m12793e(c2) || C3898x.m12803g(c2)) {
                this.f8814j = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19990a(View view) {
        C3431n nVar = this.f8807c;
        if (nVar != null && nVar.mo19517J() != null && view != null) {
            if (this.f8807c.mo19646p() != 1 || !this.f8814j) {
                mo19991a(view, false);
            } else {
                mo19991a(view, true);
            }
        }
    }
}
