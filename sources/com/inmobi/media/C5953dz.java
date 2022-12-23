package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.inmobi.media.dz */
/* compiled from: ViewableAd */
public abstract class C5953dz {

    /* renamed from: a */
    protected C6234j f15088a;

    /* renamed from: b */
    C5954a f15089b;

    /* renamed from: c */
    protected C6074ft f15090c;

    /* renamed from: d */
    private WeakReference<View> f15091d;

    /* renamed from: a */
    public abstract View mo35067a(View view, ViewGroup viewGroup, boolean z);

    /* renamed from: a */
    public abstract void mo35069a(byte b);

    /* renamed from: a */
    public abstract void mo35070a(Context context, byte b);

    /* renamed from: a */
    public abstract void mo35072a(Map<View, FriendlyObstructionPurpose> map);

    /* renamed from: c */
    public View mo35074c() {
        return null;
    }

    /* renamed from: d */
    public abstract void mo35075d();

    /* renamed from: com.inmobi.media.dz$a */
    /* compiled from: ViewableAd */
    public static abstract class C5954a {

        /* renamed from: a */
        public boolean f15092a;

        /* renamed from: a */
        public abstract View mo35077a(View view, ViewGroup viewGroup, boolean z, C6301q qVar);

        /* renamed from: a */
        public void mo35078a() {
            if (!this.f15092a) {
                this.f15092a = true;
            }
        }
    }

    public C5953dz(C6234j jVar) {
        this.f15088a = jVar;
        this.f15090c = jVar.getAdConfig();
    }

    /* renamed from: a */
    public C5954a mo35068a() {
        return this.f15089b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35071a(View view) {
        this.f15091d = new WeakReference<>(view);
    }

    /* renamed from: b */
    public View mo35073b() {
        WeakReference<View> weakReference = this.f15091d;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* renamed from: e */
    public void mo35076e() {
        WeakReference<View> weakReference = this.f15091d;
        if (weakReference != null) {
            weakReference.clear();
        }
    }
}
