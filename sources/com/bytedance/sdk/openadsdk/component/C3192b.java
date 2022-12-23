package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2889b;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;
import com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3580t;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3912a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3918b;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181b.C3926a;
import com.bytedance.sdk.openadsdk.p178l.C3885n;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.component.b */
/* compiled from: TTAppOpenAdImpl */
public class C3192b implements TTAppOpenAd {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f7500a;

    /* renamed from: b */
    private final C3431n f7501b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public TTAppOpenAd.AppOpenAdInteractionListener f7502c;

    /* renamed from: d */
    private final AtomicBoolean f7503d = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final String f7504e;

    /* renamed from: f */
    private final boolean f7505f;

    public C3192b(Context context, C3431n nVar, boolean z) {
        this.f7500a = context;
        this.f7501b = nVar;
        this.f7505f = z;
        this.f7504e = C3885n.m12675a();
    }

    public void setOpenAdInteractionListener(TTAppOpenAd.AppOpenAdInteractionListener appOpenAdInteractionListener) {
        this.f7502c = appOpenAdInteractionListener;
        m9230a();
    }

    /* renamed from: a */
    private void m9230a() {
        if (C3948b.m12959c()) {
            C2882e.m8044c(new C2885g("AppOpenAd_registerMultiProcessListener") {
                public void run() {
                    C3912a a = C3912a.m12924a(C3192b.this.f7500a);
                    if (C3192b.this.f7502c != null) {
                        C2905l.m8111b("MultiProcess", "start registerAppOpenListener ! ");
                        IListenerManager asInterface = C3918b.asInterface(a.mo20782a(7));
                        if (asInterface != null) {
                            try {
                                asInterface.registerAppOpenAdListener(C3192b.this.f7504e, new C3926a(C3192b.this.f7502c));
                                TTAppOpenAd.AppOpenAdInteractionListener unused = C3192b.this.f7502c = null;
                                C2905l.m8111b("MultiProcess", "end registerAppOpenAdListener ! ");
                            } catch (RemoteException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }, 5);
        }
    }

    public void showAppOpenAd(Activity activity) {
        Context context;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        int i = 1;
        if (!this.f7503d.getAndSet(true)) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                if (activity != null) {
                    context = activity;
                } else {
                    context = this.f7500a;
                }
                if (context == null) {
                    context = C3513m.m10963a();
                }
                int i2 = 0;
                try {
                    i2 = activity.getWindowManager().getDefaultDisplay().getRotation();
                } catch (Exception unused) {
                }
                Intent intent = new Intent(context, TTAppOpenAdActivity.class);
                intent.putExtra("orientation_angle", i2);
                if (!this.f7505f) {
                    i = 2;
                }
                intent.putExtra("ad_source", i);
                if (C3948b.m12959c()) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.f7501b.mo19584ar().toString());
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.f7504e);
                } else {
                    C3580t.m11322a().mo20140h();
                    C3580t.m11322a().mo20130a(this.f7501b);
                    C3580t.m11322a().mo20127a(this.f7502c);
                    this.f7502c = null;
                }
                C2889b.m8066a(context, intent, new C2889b.C2890a() {
                    /* renamed from: a */
                    public void mo17808a() {
                        C2905l.m8111b("TTAppOpenAdImpl", "app open ad startActivitySuccess");
                    }

                    /* renamed from: a */
                    public void mo17809a(Throwable th) {
                        C2905l.m8111b("TTAppOpenAdImpl", "app open ad startActivityFail");
                    }
                });
                return;
            }
            C2905l.m8118e("TTAppOpenAdImpl", "showTTAppOpenAd error: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
        }
    }
}
