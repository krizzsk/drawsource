package com.ogury.p377ed.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.smaato.sdk.video.vast.model.Creative;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.hg */
public final class C10084hg {

    /* renamed from: a */
    public static final C10084hg f25316a = new C10084hg();

    /* renamed from: b */
    private static final Map<String, C10228lk<C10083hf, C10182ke>> f25317b = Collections.synchronizedMap(new LinkedHashMap());

    private C10084hg() {
    }

    /* renamed from: a */
    public static void m29314a(String str, C10228lk<? super C10083hf, C10182ke> lkVar) {
        C10263mq.m29882b(str, Creative.AD_ID);
        C10263mq.m29882b(lkVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Map<String, C10228lk<C10083hf, C10182ke>> map = f25317b;
        C10263mq.m29879a((Object) map, "listeners");
        map.put(str, lkVar);
    }

    /* renamed from: a */
    public static void m29312a(C10083hf hfVar) {
        C10263mq.m29882b(hfVar, "event");
        C10228lk lkVar = f25317b.get(hfVar.mo64819b());
        if (lkVar != null) {
            lkVar.mo64242a(hfVar);
        }
    }

    /* renamed from: a */
    public static void m29313a(String str) {
        C10263mq.m29882b(str, Creative.AD_ID);
        f25317b.remove(str);
    }
}
