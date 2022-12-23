package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3918b;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3919c;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3920d;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3921e;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3922f;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3923g;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h;
import com.bytedance.sdk.openadsdk.p178l.C3898x;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a */
/* compiled from: BinderPool */
public class C3912a {

    /* renamed from: c */
    private static C3912a f9995c = new C3912a();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static C3925b f9996d;

    /* renamed from: a */
    private Context f9997a = C3513m.m10963a().getApplicationContext();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public IBinderPool f9998b;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f9999e = 0;

    /* renamed from: f */
    private ServiceConnection f10000f = new ServiceConnection() {
        public void onServiceDisconnected(ComponentName componentName) {
            C2905l.m8114c("MultiProcess", "BinderPool......onServiceDisconnected");
        }

        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            C2882e.m8036a(new C2885g("onServiceConnected") {
                public void run() {
                    IBinderPool unused = C3912a.this.f9998b = IBinderPool.Stub.asInterface(iBinder);
                    try {
                        C3912a.this.f9998b.asBinder().linkToDeath(C3912a.this.f10001g, 0);
                    } catch (RemoteException e) {
                        C2905l.m8115c("MultiProcess", "onServiceConnected throws :", e);
                    }
                    C2905l.m8111b("MultiProcess", "onServiceConnected - binderService consume time ：" + (System.currentTimeMillis() - C3912a.this.f9999e));
                    if (C3912a.f9996d != null) {
                        C3912a.f9996d.mo18159a();
                    }
                }
            }, 5);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: g */
    public IBinder.DeathRecipient f10001g = new IBinder.DeathRecipient() {
        public void binderDied() {
            C2882e.m8036a(new C2885g("binderDied") {
                public void run() {
                    C2905l.m8117d("MultiProcess", "binder died.");
                    C3912a.this.f9998b.asBinder().unlinkToDeath(C3912a.this.f10001g, 0);
                    IBinderPool unused = C3912a.this.f9998b = null;
                    C3912a.this.m12929c();
                }
            }, 5);
        }
    };

    private C3912a() {
        m12929c();
    }

    /* renamed from: a */
    public static C3912a m12924a(Context context) {
        return f9995c;
    }

    /* renamed from: a */
    public static void m12925a(C3925b bVar) {
        f9996d = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m12929c() {
        if (C3948b.m12959c()) {
            C2905l.m8114c("MultiProcess", "BinderPool......connectBinderPoolService");
            mo20783a();
        }
    }

    /* renamed from: a */
    public IBinder mo20782a(int i) {
        IBinder iBinder = null;
        try {
            if (!C3948b.m12959c()) {
                if (i == 0) {
                    iBinder = C3924h.m12942a();
                } else if (i == 1) {
                    iBinder = C3922f.m12939a();
                } else if (i == 2) {
                    iBinder = C3919c.m12935a();
                } else if (i == 4) {
                    iBinder = C3920d.m12936a();
                } else if (i == 5) {
                    iBinder = C3923g.m12941a();
                } else if (i == 6) {
                    iBinder = C3921e.m12937a();
                } else if (i == 7) {
                    iBinder = C3918b.m12933a();
                }
                return iBinder;
            }
            try {
                if (this.f9998b != null) {
                    iBinder = this.f9998b.queryBinder(i);
                }
            } catch (RemoteException e) {
                e.printStackTrace();
                C3898x.m12820l("queryBinder error");
            }
            return iBinder;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo20783a() {
        this.f9997a.bindService(new Intent(this.f9997a, BinderPoolService.class), this.f10000f, 1);
        this.f9999e = System.currentTimeMillis();
    }
}
