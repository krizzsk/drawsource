package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2401c;
import com.bykv.p054vk.openvk.component.video.api.p073e.C2410a;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.C3446g;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3516n;
import com.bytedance.sdk.openadsdk.core.bannerexpress.C3378a;
import com.bytedance.sdk.openadsdk.core.bannerexpress.C3387b;
import com.bytedance.sdk.openadsdk.core.p149e.C3402a;
import com.bytedance.sdk.openadsdk.core.p149e.C3403b;
import com.bytedance.sdk.openadsdk.core.p149e.C3417k;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3433o;
import com.bytedance.sdk.openadsdk.core.video.p163d.C3624a;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p170h.C3753b;
import com.bytedance.sdk.openadsdk.p170h.p171a.C3752b;
import com.bytedance.sdk.openadsdk.p174i.C3783a;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import com.bytedance.sdk.openadsdk.p174i.p175a.C3784a;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.d */
/* compiled from: ExpressAdLoadManager */
public class C3541d {

    /* renamed from: j */
    private static Set<C3541d> f8924j = Collections.synchronizedSet(new HashSet());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public AdSlot f8925a;

    /* renamed from: b */
    private final C3516n f8926b = C3513m.m10971f();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f8927c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TTAdNative.NativeExpressAdListener f8928d;

    /* renamed from: e */
    private final AtomicBoolean f8929e = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List<C3431n> f8930f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List<C3431n> f8931g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3544a f8932h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f8933i = 5;

    /* renamed from: k */
    private ScheduledFuture<?> f8934k = null;

    /* renamed from: l */
    private ScheduledFuture<?> f8935l = null;

    /* renamed from: m */
    private ScheduledFuture<?> f8936m = null;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f8937n = 0;

    /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.d$a */
    /* compiled from: ExpressAdLoadManager */
    public interface C3544a {
        /* renamed from: a */
        void mo19358a();

        /* renamed from: a */
        void mo19359a(List<C3431n> list);
    }

    private C3541d(Context context) {
        if (context != null) {
            this.f8927c = context.getApplicationContext();
        } else {
            this.f8927c = C3513m.m10963a();
        }
        f8924j.add(this);
    }

    /* renamed from: a */
    public static C3541d m11124a(Context context) {
        return new C3541d(context);
    }

    /* renamed from: a */
    public void mo20089a(AdSlot adSlot, int i, TTAdNative.NativeExpressAdListener nativeExpressAdListener, int i2) {
        mo20090a(adSlot, i, nativeExpressAdListener, (C3544a) null, i2);
    }

    /* renamed from: a */
    public void mo20090a(AdSlot adSlot, int i, TTAdNative.NativeExpressAdListener nativeExpressAdListener, C3544a aVar, int i2) {
        this.f8937n = System.currentTimeMillis();
        if (this.f8929e.get()) {
            C2905l.m8118e("ExpressAdLoadManager", "express ad is loading...");
            return;
        }
        this.f8933i = i;
        this.f8929e.set(true);
        this.f8925a = adSlot;
        this.f8928d = nativeExpressAdListener;
        this.f8932h = aVar;
        m11131a(adSlot, nativeExpressAdListener);
    }

    /* renamed from: a */
    private void m11131a(final AdSlot adSlot, TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
        if (adSlot != null) {
            C3433o oVar = new C3433o();
            oVar.f8445f = 2;
            this.f8926b.mo19983a(adSlot, oVar, this.f8933i, new C3516n.C3517a() {
                /* renamed from: a */
                public void mo18456a(int i, String str) {
                    C3541d.this.m11128a(i, str);
                }

                /* renamed from: a */
                public void mo18457a(C3402a aVar, C3403b bVar) {
                    if (aVar.mo19386b() == null || aVar.mo19386b().isEmpty()) {
                        C3541d.this.m11128a(-3, C3446g.m10553a(-3));
                        bVar.mo19391a(-3);
                        C3403b.m10134a(bVar);
                        return;
                    }
                    List unused = C3541d.this.f8930f = aVar.mo19386b();
                    List unused2 = C3541d.this.f8931g = aVar.mo19386b();
                    C3541d.this.m11130a(adSlot);
                    C3541d dVar = C3541d.this;
                    dVar.m11129a(dVar.f8937n);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11130a(AdSlot adSlot) {
        List<C3431n> list = this.f8930f;
        if (list != null) {
            for (C3431n next : list) {
                if (next.mo19581ao() && next.mo19523P() != null && !next.mo19523P().isEmpty()) {
                    for (C3417k next2 : next.mo19523P()) {
                        if (!TextUtils.isEmpty(next2.mo19468a())) {
                            C3792d.m12395a().mo20616c().mo20601a(new C3783a(next2.mo19468a(), next2.mo19479g()), C3784a.m12355b(), next2.mo19472b(), next2.mo19475c(), (String) null);
                        }
                    }
                }
                if (!(!C3431n.m10311c(next) || next.mo19517J() == null || next.mo19517J().mo15953i() == null)) {
                    if (C3513m.m10973h().mo19840b(String.valueOf(C3898x.m12794f(next))) && C3513m.m10973h().mo19830G()) {
                        C2401c a = C3431n.m10306a(CacheDirFactory.getICacheDir(next.mo19560aD()).mo15661a(), next);
                        a.mo15970a("material_meta", next);
                        a.mo15970a("ad_slot", adSlot);
                        C3624a.m11584a(a, (C2410a.C2411a) null);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11129a(final long j) {
        if (this.f8929e.getAndSet(false)) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C3541d.this.f8931g == null || C3541d.this.f8931g.size() <= 0) {
                        if (C3541d.this.f8928d != null) {
                            C3541d.this.f8928d.onError(108, C3446g.m10553a(108));
                            C3541d.this.m11127a(108);
                        }
                        if (C3541d.this.f8932h != null) {
                            C3541d.this.f8932h.mo19358a();
                        }
                    } else {
                        if (C3541d.this.f8928d != null) {
                            ArrayList arrayList = new ArrayList(C3541d.this.f8931g.size());
                            for (C3431n a : C3541d.this.f8931g) {
                                arrayList.add(C3541d.this.m11122a(a));
                            }
                            if (!arrayList.isEmpty()) {
                                if (!TextUtils.isEmpty(C3541d.this.f8925a.getBidAdm())) {
                                    C3090e.m8905a((C3431n) C3541d.this.f8931g.get(0), C3898x.m12769b(C3541d.this.f8933i), System.currentTimeMillis() - C3541d.this.f8937n);
                                } else {
                                    C3090e.m8915b(C3541d.this.f8927c, (C3431n) C3541d.this.f8931g.get(0), C3898x.m12769b(C3541d.this.f8925a.getDurationSlotType()), j);
                                }
                                C3541d.this.f8928d.onNativeExpressAdLoad(arrayList);
                            } else {
                                C3541d.this.f8928d.onError(103, C3446g.m10553a(103));
                                C3541d.this.m11127a(103);
                            }
                        }
                        if (C3541d.this.f8932h != null) {
                            C3541d.this.f8932h.mo19359a(C3541d.this.f8931g);
                        }
                    }
                    C3541d.this.m11126a();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11127a(int i) {
        List<C3431n> list = this.f8930f;
        C3752b e = C3752b.m12257b().mo20542a(this.f8933i).mo20547c(this.f8925a.getCodeId()).mo20551e((list == null || list.size() <= 0) ? "" : C3898x.m12806h(this.f8930f.get(0)));
        e.mo20545b(i).mo20553f(C3446g.m10553a(i));
        C3753b.m12287a().mo20575b(e);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11128a(int i, String str) {
        if (this.f8929e.getAndSet(false)) {
            TTAdNative.NativeExpressAdListener nativeExpressAdListener = this.f8928d;
            if (nativeExpressAdListener != null) {
                nativeExpressAdListener.onError(i, str);
            }
            C3544a aVar = this.f8932h;
            if (aVar != null) {
                aVar.mo19358a();
            }
            m11126a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public TTNativeExpressAd m11122a(C3431n nVar) {
        if (this.f8933i != 1) {
            return null;
        }
        if (nVar.mo19517J() != null) {
            return new C3387b(this.f8927c, nVar, this.f8925a);
        }
        return new C3378a(this.f8927c, nVar, this.f8925a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11126a() {
        List<C3431n> list = this.f8930f;
        if (list != null) {
            list.clear();
        }
        List<C3431n> list2 = this.f8931g;
        if (list2 != null) {
            list2.clear();
        }
        m11136a(true);
        m11140b(true);
        m11142c(true);
        m11139b();
    }

    /* renamed from: a */
    private void m11136a(boolean z) {
        try {
            if (this.f8935l != null && !this.f8935l.isCancelled()) {
                boolean cancel = this.f8935l.cancel(z);
                C2905l.m8118e("ExpressAdLoadManager", "CheckValidFutureTask-->cancel......success=" + cancel);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private void m11140b(boolean z) {
        try {
            if (this.f8936m != null && !this.f8936m.isCancelled()) {
                boolean cancel = this.f8936m.cancel(z);
                C2905l.m8111b("ExpressAdLoadManager", "CheckValidDoneFutureTask-->cancel.....success=" + cancel);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private void m11142c(boolean z) {
        try {
            if (this.f8934k != null && !this.f8934k.isCancelled()) {
                boolean cancel = this.f8934k.cancel(z);
                C2905l.m8118e("ExpressAdLoadManager", "TimeOutFutureTask-->cancel......success=" + cancel);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private void m11139b() {
        f8924j.remove(this);
    }
}
