package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.properties.C12085b;
import com.unity3d.services.core.properties.C12088d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.unity3d.services.core.request.metrics.g */
/* compiled from: MetricSenderWithBatch */
public class C12118g implements C12112c {

    /* renamed from: a */
    private final LinkedBlockingQueue<C12113d> f29583a = new LinkedBlockingQueue<>();

    /* renamed from: b */
    private C12112c f29584b;

    /* renamed from: c */
    private final C12085b f29585c = new C12085b();

    public C12118g(C12112c cVar) {
        this.f29584b = cVar;
    }

    /* renamed from: a */
    public void mo71284a(C12112c cVar) {
        this.f29584b = cVar;
    }

    /* renamed from: b */
    public String mo71270b() {
        C12112c cVar = this.f29584b;
        if (cVar == null) {
            return null;
        }
        return cVar.mo71270b();
    }

    /* renamed from: c */
    public void mo71286c() {
        mo71268a((List<C12113d>) new ArrayList());
    }

    public void sendMetric(C12113d dVar) {
        mo71268a((List<C12113d>) new ArrayList(Collections.singletonList(dVar)));
    }

    /* renamed from: a */
    public boolean mo71269a() {
        return this.f29584b.mo71269a();
    }

    /* renamed from: a */
    public void mo71285a(String str, String str2, Map<String, String> map) {
        if (str == null || str.isEmpty()) {
            C12065a.m32845b("Metric event not sent due to being null or empty: " + str);
            return;
        }
        mo71268a((List<C12113d>) new ArrayList(Collections.singletonList(new C12113d(str, str2, map))));
    }

    /* renamed from: a */
    public void mo71267a(String str, Map<String, String> map) {
        mo71285a(str, (String) null, map);
    }

    /* renamed from: a */
    public synchronized void mo71268a(List<C12113d> list) {
        this.f29583a.addAll(list);
        if (!TextUtils.isEmpty(this.f29584b.mo71270b()) && this.f29583a.size() > 0) {
            ArrayList arrayList = new ArrayList();
            this.f29583a.drainTo(arrayList);
            this.f29584b.mo71268a((List<C12113d>) arrayList);
        }
    }

    /* renamed from: a */
    public void mo71266a(C12113d dVar) {
        if (dVar != null && dVar.mo71273b() != null) {
            dVar.mo71273b().put("state", this.f29585c.mo71232a(C12088d.m32932e()));
            sendMetric(dVar);
        }
    }
}
