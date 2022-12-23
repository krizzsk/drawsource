package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.cache.C4178b;
import com.fyber.inneractive.sdk.network.C4485f0;
import com.fyber.inneractive.sdk.network.C4501m0;
import com.fyber.inneractive.sdk.network.C4521u;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.fyber.inneractive.sdk.config.i */
public class C4253i {

    /* renamed from: a */
    public final Context f10458a;

    /* renamed from: b */
    public C4252h f10459b = new C4252h();

    /* renamed from: c */
    public List<C4255b> f10460c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public boolean f10461d = false;

    /* renamed from: e */
    public final C4178b f10462e = new C4178b();

    /* renamed from: com.fyber.inneractive.sdk.config.i$a */
    public class C4254a implements C4521u<C4252h> {
        public C4254a() {
        }

        /* renamed from: a */
        public void mo24154a(Object obj, Exception exc, boolean z) {
            C4252h hVar = (C4252h) obj;
            if (hVar != null) {
                C4253i iVar = C4253i.this;
                iVar.getClass();
                if (!hVar.equals(iVar.f10459b)) {
                    iVar.f10461d = true;
                    iVar.f10459b = hVar;
                    for (C4255b onGlobalConfigChanged : iVar.f10460c) {
                        onGlobalConfigChanged.onGlobalConfigChanged(iVar, iVar.f10459b);
                    }
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.i$b */
    public interface C4255b {
        void onGlobalConfigChanged(C4253i iVar, C4252h hVar);
    }

    public C4253i(Context context) {
        this.f10458a = context;
    }

    /* renamed from: a */
    public C4252h mo24276a() {
        return this.f10459b;
    }

    /* renamed from: b */
    public void mo24277b() {
        C4485f0 f0Var = new C4485f0(new C4254a(), this.f10458a, this.f10462e);
        IAConfigManager.f10324J.f10354t.f11186a.offer(f0Var);
        f0Var.mo24642a(C4501m0.QUEUED);
    }
}
