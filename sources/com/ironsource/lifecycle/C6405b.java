package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* renamed from: com.ironsource.lifecycle.b */
public final class C6405b extends Fragment {

    /* renamed from: a */
    C6406a f16205a;

    /* renamed from: com.ironsource.lifecycle.b$a */
    interface C6406a {
        /* renamed from: a */
        void mo35918a(Activity activity);

        /* renamed from: b */
        void mo35919b(Activity activity);
    }

    /* renamed from: a */
    static C6405b m19158a(Activity activity) {
        return (C6405b) activity.getFragmentManager().findFragmentByTag("com.ironsource.lifecycle.IronsourceLifecycleFragment");
    }

    /* renamed from: b */
    static void m19159b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager != null && fragmentManager.findFragmentByTag("com.ironsource.lifecycle.IronsourceLifecycleFragment") == null) {
            fragmentManager.beginTransaction().add(new C6405b(), "com.ironsource.lifecycle.IronsourceLifecycleFragment").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f16205a != null) {
            getActivity();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f16205a = null;
    }

    public final void onPause() {
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        C6406a aVar = this.f16205a;
        if (aVar != null) {
            aVar.mo35919b(getActivity());
        }
    }

    public final void onStart() {
        super.onStart();
        C6406a aVar = this.f16205a;
        if (aVar != null) {
            aVar.mo35918a(getActivity());
        }
    }

    public final void onStop() {
        super.onStop();
    }
}
