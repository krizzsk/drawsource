package com.ironsource.p196a;

import android.net.Uri;
import android.util.Log;
import androidx.browser.trusted.sharing.ShareTarget;
import com.ironsource.p199d.C6357b;
import com.ironsource.p199d.C6360c;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.ironsource.a.b */
public final class C6341b {

    /* renamed from: a */
    C6339a f16061a;

    /* renamed from: b */
    private C6343c f16062b;

    /* renamed from: c */
    private C6344d f16063c;

    /* renamed from: d */
    private ExecutorService f16064d;

    public C6341b(C6339a aVar, C6343c cVar) {
        if (aVar == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        } else if (aVar.f16052d != null) {
            this.f16061a = aVar;
            this.f16062b = cVar;
            this.f16063c = aVar.f16052d;
            this.f16064d = Executors.newSingleThreadExecutor();
        } else {
            throw new InvalidParameterException("Null formatter not supported ");
        }
    }

    /* renamed from: a */
    private static void m18961a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo35740a(String str) {
        if (this.f16061a.f16053e) {
            Log.d("EventsTracker", str);
        }
    }

    /* renamed from: a */
    public final void mo35741a(String str, Map<String, Object> map) {
        mo35740a(String.format(Locale.ENGLISH, "%s %s", new Object[]{str, map.toString()}));
        if (this.f16061a.f16050b && !str.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put("eventname", str);
            m18961a((Map<String, Object>) hashMap, this.f16062b.mo35743a());
            m18961a((Map<String, Object>) hashMap, map);
            final String a = this.f16063c.mo35744a(hashMap);
            this.f16064d.submit(new Runnable() {
                public final void run() {
                    try {
                        C6360c cVar = new C6360c();
                        ArrayList arrayList = new ArrayList(C6341b.this.f16061a.f16054f);
                        if (ShareTarget.METHOD_POST.equals(C6341b.this.f16061a.f16051c)) {
                            cVar = C6357b.m18988a(C6341b.this.f16061a.f16049a, a, arrayList);
                        } else if (ShareTarget.METHOD_GET.equals(C6341b.this.f16061a.f16051c)) {
                            String str = C6341b.this.f16061a.f16049a;
                            String str2 = a;
                            Uri build = Uri.parse(str).buildUpon().encodedQuery(str2).build();
                            C6357b.C6358a.C6359a aVar = new C6357b.C6358a.C6359a();
                            aVar.f16090b = build.toString();
                            aVar.f16092d = str2;
                            aVar.f16091c = ShareTarget.METHOD_GET;
                            aVar.mo35855a(arrayList);
                            cVar = C6357b.m18987a(aVar.mo35856a());
                        }
                        C6341b bVar = C6341b.this;
                        bVar.mo35740a("response status code: " + cVar.f16096a);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
