package com.unity3d.services.store.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.store.C12165b;
import com.unity3d.services.store.gpbl.C12206c;
import com.unity3d.services.store.listeners.C12216e;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.unity3d.services.store.core.b */
/* compiled from: StoreLifecycleListener */
public class C12173b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final ArrayList<String> f29732a;

    /* renamed from: b */
    private final C12206c f29733b;

    /* renamed from: c */
    private final C12216e f29734c = new C12216e(C12165b.PURCHASES_ON_RESUME_RESULT, C12165b.PURCHASES_ON_RESUME_ERROR);

    public C12173b(ArrayList<String> arrayList, C12206c cVar) {
        this.f29732a = arrayList;
        this.f29733b = cVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
        try {
            Iterator<String> it = this.f29732a.iterator();
            while (it.hasNext()) {
                this.f29733b.mo71393a(it.next(), this.f29734c);
            }
        } catch (ClassNotFoundException e) {
            C12065a.m32851e("Couldn't fetch purchases onActivityResumed. " + e.getMessage());
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
