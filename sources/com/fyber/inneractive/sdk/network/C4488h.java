package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: com.fyber.inneractive.sdk.network.h */
public class C4488h {
    /* renamed from: a */
    public InputStream mo24676a(InputStream inputStream, boolean z) {
        if (z) {
            try {
                IAlog.m16446a("HttpExecutorImpl: getInputStream found gzip encoding", new Object[0]);
                return new GZIPInputStream(inputStream);
            } catch (Exception unused) {
                return null;
            }
        } else {
            IAlog.m16446a("HttpExecutorImpl: getInputStream no gzip encoding", new Object[0]);
            return new BufferedInputStream(inputStream);
        }
    }

    /* renamed from: a */
    public C4493j mo24675a(InputStream inputStream, int i, String str, Map<String, List<String>> map, String str2) throws C4515q0, C4473b {
        try {
            C4493j jVar = new C4493j(inputStream, i, str, map, str2);
            if (jVar.f11042a / 100 != 5) {
                return jVar;
            }
            throw new C4473b(String.format("server returned error %d", new Object[]{Integer.valueOf(jVar.f11042a)}));
        } catch (C4473b e) {
            IAlog.m16445a("failed executing network request", e, new Object[0]);
            throw new C4473b((Throwable) e);
        } catch (Exception e2) {
            IAlog.m16445a("failed reading network response", e2, new Object[0]);
            throw new C4515q0(e2);
        }
    }
}
