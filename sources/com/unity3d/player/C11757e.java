package com.unity3d.player;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.unity3d.player.e */
public final class C11757e extends Fragment {

    /* renamed from: a */
    private final IPermissionRequestCallbacks f28432a;

    /* renamed from: b */
    private final Activity f28433b;

    /* renamed from: c */
    private final Looper f28434c;

    /* renamed from: com.unity3d.player.e$a */
    class C11758a implements Runnable {

        /* renamed from: b */
        private IPermissionRequestCallbacks f28436b;

        /* renamed from: c */
        private String f28437c;

        /* renamed from: d */
        private int f28438d;

        /* renamed from: e */
        private boolean f28439e;

        C11758a(IPermissionRequestCallbacks iPermissionRequestCallbacks, String str, int i, boolean z) {
            this.f28436b = iPermissionRequestCallbacks;
            this.f28437c = str;
            this.f28438d = i;
            this.f28439e = z;
        }

        public final void run() {
            int i = this.f28438d;
            if (i == -1) {
                if (this.f28439e) {
                    this.f28436b.onPermissionDenied(this.f28437c);
                } else {
                    this.f28436b.onPermissionDeniedAndDontAskAgain(this.f28437c);
                }
            } else if (i == 0) {
                this.f28436b.onPermissionGranted(this.f28437c);
            }
        }
    }

    public C11757e() {
        this.f28432a = null;
        this.f28433b = null;
        this.f28434c = null;
    }

    public C11757e(Activity activity, IPermissionRequestCallbacks iPermissionRequestCallbacks) {
        this.f28432a = iPermissionRequestCallbacks;
        this.f28433b = activity;
        this.f28434c = Looper.myLooper();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestPermissions(getArguments().getStringArray("PermissionNames"), 96489);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 96489) {
            if (strArr.length == 0) {
                requestPermissions(getArguments().getStringArray("PermissionNames"), 96489);
                return;
            }
            int i2 = 0;
            while (i2 < strArr.length && i2 < iArr.length) {
                if (!(this.f28432a == null || this.f28433b == null || this.f28434c == null)) {
                    String str = strArr[i2] == null ? "<null>" : strArr[i2];
                    new Handler(this.f28434c).post(new C11758a(this.f28432a, str, iArr[i2], this.f28433b.shouldShowRequestPermissionRationale(str)));
                }
                i2++;
            }
            FragmentTransaction beginTransaction = getActivity().getFragmentManager().beginTransaction();
            beginTransaction.remove(this);
            beginTransaction.commit();
        }
    }
}
