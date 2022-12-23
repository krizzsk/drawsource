package com.inmobi.media;

import android.app.Activity;
import android.os.Build;
import android.view.OrientationEventListener;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.inmobi.media.cx */
/* compiled from: InMobiActivityOrientationHandler */
public class C5899cx extends OrientationEventListener {

    /* renamed from: a */
    public HashSet<C5902cz> f14926a;

    /* renamed from: b */
    public Activity f14927b;

    /* renamed from: c */
    private final String f14928c = C5899cx.class.getSimpleName();

    /* renamed from: d */
    private C5923di f14929d = C5923di.m17609a(C6215il.m18448b());

    /* renamed from: a */
    private static int m17548a(byte b) {
        return (b == 3 || b == 4) ? 2 : 1;
    }

    public C5899cx(Activity activity) {
        super(activity.getApplicationContext());
        this.f14927b = activity;
        this.f14926a = new HashSet<>();
    }

    /* renamed from: b */
    private void m17550b() {
        if (this.f14926a.isEmpty()) {
            disable();
        } else {
            enable();
        }
    }

    /* renamed from: a */
    public final void mo34988a(C5902cz czVar) {
        this.f14926a.add(czVar);
        m17550b();
    }

    /* renamed from: b */
    public final void mo34990b(C5902cz czVar) {
        this.f14926a.remove(czVar);
        m17550b();
    }

    /* renamed from: a */
    public final void mo34989a(C5921dg dgVar) {
        if (dgVar != null) {
            if (!dgVar.f14995a) {
                String str = dgVar.f14996b;
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != 729267099) {
                    if (hashCode == 1430647483 && str.equals("landscape")) {
                        c = 0;
                    }
                } else if (str.equals("portrait")) {
                    c = 1;
                }
                if (c == 0) {
                    mo34987a(6);
                } else if (c != 1) {
                    m17551c();
                } else {
                    mo34987a(7);
                }
            } else {
                m17551c();
            }
        }
    }

    /* renamed from: c */
    private void m17551c() {
        if (Build.VERSION.SDK_INT >= 18) {
            mo34987a(13);
        } else {
            mo34987a(2);
        }
    }

    /* renamed from: a */
    public final void mo34986a() {
        boolean z = this.f14927b.getResources().getConfiguration().orientation == m17548a(C6215il.m18448b());
        C5923di a = C5923di.m17609a(C6215il.m18448b());
        if (z && this.f14929d.f15004e != a.f15004e) {
            this.f14929d = a;
            m17549a(a);
        }
    }

    /* renamed from: a */
    private void m17549a(C5923di diVar) {
        Iterator<C5902cz> it = this.f14926a.iterator();
        while (it.hasNext()) {
            it.next().mo34980a(diVar);
        }
    }

    public void onOrientationChanged(int i) {
        mo34986a();
    }

    /* renamed from: a */
    public final void mo34987a(int i) {
        Activity activity = this.f14927b;
        if (activity != null) {
            activity.setRequestedOrientation(i);
        }
    }
}
