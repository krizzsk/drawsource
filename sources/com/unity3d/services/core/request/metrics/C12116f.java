package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.properties.C12085b;
import com.unity3d.services.core.properties.C12088d;
import com.unity3d.services.core.request.C12099h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.request.metrics.f */
/* compiled from: MetricSender */
public class C12116f implements C12112c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12114e f29576a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f29577b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f29578c;

    /* renamed from: d */
    private final ExecutorService f29579d = Executors.newSingleThreadExecutor();

    /* renamed from: e */
    private final C12085b f29580e;

    /* renamed from: com.unity3d.services.core.request.metrics.f$a */
    /* compiled from: MetricSender */
    class C12117a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f29581a;

        C12117a(List list) {
            this.f29581a = list;
        }

        public void run() {
            try {
                String jSONObject = new JSONObject(new C12119h(C12116f.this.f29578c, C12116f.this.f29576a, this.f29581a).mo71287a()).toString();
                C12099h hVar = new C12099h(C12116f.this.f29577b, ShareTarget.METHOD_POST, (Map<String, List<String>>) null);
                hVar.mo71247a(jSONObject);
                hVar.mo71260n();
                if (hVar.mo71256j() / 100 == 2) {
                    C12065a.m32845b("Metric " + this.f29581a + " sent to " + C12116f.this.f29577b);
                    return;
                }
                C12065a.m32845b("Metric " + this.f29581a + " failed to send with response code: " + hVar.mo71256j());
            } catch (Exception e) {
                C12065a.m32845b("Metric " + this.f29581a + " failed to send from exception: " + e.getMessage());
            }
        }
    }

    public C12116f(Configuration configuration, C12085b bVar) {
        this.f29577b = configuration.getMetricsUrl();
        this.f29578c = String.valueOf((int) Math.round(configuration.getMetricSampleRate()));
        this.f29580e = bVar;
        C12114e eVar = new C12114e();
        this.f29576a = eVar;
        eVar.mo71278a(configuration);
    }

    /* renamed from: a */
    public boolean mo71269a() {
        return true;
    }

    public void sendMetric(C12113d dVar) {
        mo71268a((List<C12113d>) new ArrayList(Collections.singletonList(dVar)));
    }

    /* renamed from: a */
    public void mo71267a(String str, Map<String, String> map) {
        if (str == null || str.isEmpty()) {
            C12065a.m32845b("Metric event not sent due to being null or empty: " + str);
            return;
        }
        mo71281a(str, (String) null, map);
    }

    /* renamed from: b */
    public String mo71270b() {
        return this.f29577b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo71282c() {
        this.f29576a.mo71279d();
        this.f29579d.shutdown();
    }

    /* renamed from: a */
    public void mo71281a(String str, String str2, Map<String, String> map) {
        mo71268a((List<C12113d>) new ArrayList(Collections.singletonList(new C12113d(str, str2, map))));
    }

    /* renamed from: a */
    public void mo71268a(List<C12113d> list) {
        if (list == null || list.size() <= 0) {
            C12065a.m32845b("Metrics event not send due to being null or empty");
        } else if (TextUtils.isEmpty(this.f29577b)) {
            C12065a.m32845b("Metrics: " + list + " was not sent to null or empty endpoint: " + this.f29577b);
        } else if (this.f29579d.isShutdown()) {
            C12065a.m32845b("Metrics " + list + " was not sent due to misconfiguration");
        } else {
            this.f29579d.submit(new C12117a(list));
        }
    }

    /* renamed from: a */
    public void mo71266a(C12113d dVar) {
        if (dVar != null && dVar.mo71273b() != null) {
            dVar.mo71273b().put("state", this.f29580e.mo71232a(C12088d.m32932e()));
            sendMetric(dVar);
        }
    }
}
