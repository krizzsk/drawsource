package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3918b;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3919c;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3920d;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3921e;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3922f;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3923g;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h;

public class BinderPoolService extends Service {

    /* renamed from: a */
    private Binder f9994a = new C3911a();

    public void onCreate() {
        super.onCreate();
        C2905l.m8111b("MultiProcess", "BinderPoolService has been created ! ");
    }

    public IBinder onBind(Intent intent) {
        C2905l.m8111b("MultiProcess", "BinderPoolService onBind ! ");
        return this.f9994a;
    }

    public void onDestroy() {
        super.onDestroy();
        C2905l.m8111b("MultiProcess", "BinderPoolService is destroy ! ");
    }

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService$a */
    public static class C3911a extends IBinderPool.Stub {
        public IBinder queryBinder(int i) throws RemoteException {
            C2905l.m8114c("MultiProcess", "queryBinder...........binderCode=" + i);
            if (i == 0) {
                return C3924h.m12942a();
            }
            if (i == 1) {
                return C3922f.m12939a();
            }
            if (i == 2) {
                return C3919c.m12935a();
            }
            if (i == 4) {
                return C3920d.m12936a();
            }
            if (i == 5) {
                return C3923g.m12941a();
            }
            if (i == 6) {
                return C3921e.m12937a();
            }
            if (i != 7) {
                return null;
            }
            return C3918b.m12933a();
        }
    }
}
