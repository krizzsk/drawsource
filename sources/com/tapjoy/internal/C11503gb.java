package com.tapjoy.internal;

import com.smaato.sdk.core.injections.CoreLightModuleInterface;
import com.tapjoy.internal.C11527gm;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.gb */
public final class C11503gb extends C11527gm {

    /* renamed from: a */
    static final Map<String, String> f27609a = Collections.unmodifiableMap(new HashMap());

    /* renamed from: c */
    private final C11527gm.C11528a f27610c = mo70075a("BuildConfig");

    /* renamed from: d */
    private final C11527gm.C11528a f27611d = mo70075a("ServerFinal");

    /* renamed from: e */
    private final C11527gm.C11528a f27612e;

    /* renamed from: f */
    private final C11527gm.C11528a f27613f;

    /* renamed from: g */
    private final C11527gm.C11528a f27614g;

    C11503gb() {
        C11527gm.C11528a a = mo70075a("AppRuntime");
        this.f27612e = a;
        a.f27694b = new ConcurrentHashMap();
        this.f27613f = mo70075a("ConnectFlags");
        this.f27614g = mo70075a("ServerDefault");
        C11527gm.C11528a a2 = mo70075a("SDKDefault");
        HashMap hashMap = new HashMap();
        hashMap.put("placement_request_content_retry_timeout", -1);
        hashMap.put("placement_request_content_retry_backoff", Arrays.asList(new Number[]{0L, 500L, 10000L, Double.valueOf(2.0d)}));
        a2.f27694b = hashMap;
    }

    /* renamed from: a */
    public final void mo70034a(@Nullable Map map) {
        Map<String, Object> map2;
        Map<String, Object> map3 = null;
        if (map != null) {
            map3 = (Map) map.get("final");
            map2 = (Map) map.get(CoreLightModuleInterface.NAME_DEFAULT_HTTP_HANDLER);
        } else {
            map2 = null;
        }
        this.f27611d.f27694b = map3;
        this.f27614g.f27694b = map2;
        setChanged();
    }

    /* renamed from: a */
    public final void mo70033a(Hashtable<String, ?> hashtable) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : hashtable.entrySet()) {
            String str = f27609a.get(next.getKey());
            if (str == null) {
                str = (String) next.getKey();
            }
            this.f27612e.f27694b.remove(str);
            hashMap.put(str, next.getValue());
        }
        this.f27613f.f27694b = hashMap;
        setChanged();
    }
}
