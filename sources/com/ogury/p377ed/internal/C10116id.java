package com.ogury.p377ed.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ogury.ed.internal.id */
public final class C10116id {

    /* renamed from: a */
    public static final C10116id f25410a = new C10116id();

    /* renamed from: b */
    private static final Map<String, C10115ic> f25411b = new ConcurrentHashMap();

    /* renamed from: c */
    private static Handler f25412c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private static final Runnable f25413d = $$Lambda$id$clsWNa_MEVgRz0b4PPKC1NFHoZg.INSTANCE;

    /* renamed from: e */
    private static Integer f25414e;

    /* renamed from: f */
    private static C10029fn f25415f = C10029fn.f25239a;

    private C10116id() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m29482d() {
        m29480c();
    }

    /* renamed from: a */
    public static void m29475a(C10120ig igVar) {
        C10263mq.m29882b(igVar, "presageAdGateway");
        Iterator<Map.Entry<String, C10115ic>> it = f25411b.entrySet().iterator();
        while (it.hasNext()) {
            if (C10263mq.m29881a(((C10115ic) it.next().getValue()).mo64893a().get(), (Object) igVar)) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public static void m29476a(String str) {
        C10263mq.m29882b(str, "cacheId");
        Iterator<Map.Entry<String, C10115ic>> it = f25411b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (C10263mq.m29881a(next.getKey(), (Object) str)) {
                it.remove();
                C10120ig igVar = (C10120ig) ((C10115ic) next.getValue()).mo64893a().get();
                if (igVar != null) {
                    igVar.mo64903b(((C10115ic) next.getValue()).mo64895c());
                }
            }
        }
    }

    /* renamed from: a */
    public static void m29474a(C10115ic icVar) {
        C10263mq.m29882b(icVar, "mraidCacheItem");
        m29479b(icVar);
        f25411b.put(icVar.mo64895c().mo64495a(), icVar);
        m29478b();
    }

    /* renamed from: b */
    private static void m29479b(C10115ic icVar) {
        if (f25414e == null) {
            Context context = icVar.mo64894b().getContext();
            C10263mq.m29879a((Object) context, "mraidCacheItem.webView.context");
            C10028fm a = C10029fn.m29114a(context);
            if (a != null) {
                f25414e = a.mo64710f() > 0 ? Integer.valueOf(a.mo64710f()) : null;
            }
        }
    }

    /* renamed from: a */
    public static void m29473a() {
        Iterator<Map.Entry<String, C10115ic>> it = f25411b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (m29481c((C10115ic) next.getValue())) {
                it.remove();
                C9943di diVar = C9943di.f25015a;
                C9943di.m28717a((C9942dh) new C9953dl("expired", ((C10115ic) next.getValue()).mo64895c()));
                C10120ig igVar = (C10120ig) ((C10115ic) next.getValue()).mo64893a().get();
                if (igVar != null) {
                    igVar.mo64902a(((C10115ic) next.getValue()).mo64895c());
                }
            }
        }
    }

    /* renamed from: c */
    private static boolean m29481c(C10115ic icVar) {
        Context context = icVar.mo64894b().getContext();
        C10263mq.m29879a((Object) context, "mraidCacheItem.webView.context");
        C10028fm a = C10029fn.m29114a(context);
        return a != null && System.currentTimeMillis() - icVar.mo64896d() > a.mo64716j();
    }

    /* renamed from: b */
    public static C10158jh m29477b(String str) {
        C10263mq.m29882b(str, "cacheId");
        C10158jh jhVar = null;
        if (f25411b.containsKey(str)) {
            C10115ic icVar = f25411b.get(str);
            if (icVar != null) {
                jhVar = icVar.mo64894b();
            }
            f25411b.remove(str);
        }
        return jhVar;
    }

    /* renamed from: b */
    private static void m29478b() {
        Iterator<Map.Entry<String, C10115ic>> it = f25411b.entrySet().iterator();
        while (it.hasNext()) {
            if (((C10115ic) it.next().getValue()).mo64893a().get() == null) {
                it.remove();
            }
        }
        f25412c.removeCallbacksAndMessages((Object) null);
        if (!f25411b.isEmpty()) {
            f25412c.postDelayed(f25413d, 1200000);
        }
    }

    /* renamed from: c */
    private static void m29480c() {
        C10263mq.m29874a("clean cache ", (Object) Integer.valueOf(f25411b.size()));
        m29473a();
        m29478b();
        C10263mq.m29874a("after cache ", (Object) Integer.valueOf(f25411b.size()));
    }
}
