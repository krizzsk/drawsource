package com.unity3d.services.core.request;

import android.os.Bundle;
import com.unity3d.services.core.log.C12065a;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.unity3d.services.core.request.k */
/* compiled from: WebRequestRunnable */
public class C12103k implements Runnable {

    /* renamed from: a */
    private C12099h f29525a;

    /* renamed from: b */
    private boolean f29526b = false;

    /* renamed from: c */
    private final String f29527c;

    /* renamed from: d */
    private final String f29528d;

    /* renamed from: e */
    private final String f29529e;

    /* renamed from: f */
    private final int f29530f;

    /* renamed from: g */
    private final int f29531g;

    /* renamed from: h */
    private final Map<String, List<String>> f29532h;

    /* renamed from: i */
    private final C12094c f29533i;

    public C12103k(String str, String str2, String str3, int i, int i2, Map<String, List<String>> map, C12094c cVar) {
        this.f29527c = str;
        this.f29528d = str2;
        this.f29529e = str3;
        this.f29530f = i;
        this.f29531g = i2;
        this.f29532h = map;
        this.f29533i = cVar;
    }

    /* renamed from: a */
    public void mo71261a(boolean z) {
        C12099h hVar;
        this.f29526b = z;
        if (z && (hVar = this.f29525a) != null) {
            hVar.mo71245a();
        }
    }

    public void run() {
        C12065a.m32845b("Handling request message: " + this.f29527c + " type=" + this.f29528d);
        try {
            m32988a(this.f29527c, this.f29528d, this.f29532h, this.f29529e, this.f29530f, this.f29531g);
        } catch (MalformedURLException e) {
            C12065a.m32842a("Malformed URL", (Exception) e);
            m32986a("Malformed URL");
        }
    }

    /* renamed from: a */
    private void m32988a(String str, String str2, Map<String, List<String>> map, String str3, int i, int i2) throws MalformedURLException {
        if (!this.f29526b) {
            C12099h hVar = new C12099h(str, str2, map, i, i2);
            this.f29525a = hVar;
            if (str3 != null) {
                hVar.mo71247a(str3);
            }
            try {
                String n = this.f29525a.mo71260n();
                if (!this.f29525a.mo71259m()) {
                    Bundle bundle = new Bundle();
                    for (String next : this.f29525a.mo71257k().keySet()) {
                        if (next != null && !next.contentEquals("null")) {
                            String[] strArr = new String[this.f29525a.mo71257k().get(next).size()];
                            for (int i3 = 0; i3 < this.f29525a.mo71257k().get(next).size(); i3++) {
                                strArr[i3] = (String) this.f29525a.mo71257k().get(next).get(i3);
                            }
                            bundle.putStringArray(next, strArr);
                        }
                    }
                    if (!this.f29525a.mo71259m()) {
                        m32987a(n, this.f29525a.mo71256j(), m32985a(bundle));
                    }
                }
            } catch (Exception e) {
                C12065a.m32842a("Error completing request", e);
                m32986a(e.getClass().getName() + ": " + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    private void m32987a(String str, int i, Map<String, List<String>> map) {
        this.f29533i.mo71019a(this.f29527c, str, i, map);
    }

    /* renamed from: a */
    private void m32986a(String str) {
        this.f29533i.mo71018a(this.f29527c, str);
    }

    /* renamed from: a */
    private Map<String, List<String>> m32985a(Bundle bundle) {
        if (bundle.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            String[] stringArray = bundle.getStringArray(str);
            if (stringArray != null) {
                hashMap.put(str, new ArrayList(Arrays.asList(stringArray)));
            }
        }
        return hashMap;
    }
}
