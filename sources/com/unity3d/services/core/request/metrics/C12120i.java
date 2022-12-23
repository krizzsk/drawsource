package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.properties.C12085b;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.unity3d.services.core.request.metrics.i */
/* compiled from: SDKMetrics */
public final class C12120i {

    /* renamed from: a */
    private static C12112c f29589a;

    /* renamed from: b */
    private static C12118g f29590b;

    /* renamed from: c */
    private static final AtomicBoolean f29591c = new AtomicBoolean(false);

    /* renamed from: com.unity3d.services.core.request.metrics.i$a */
    /* compiled from: SDKMetrics */
    private static final class C12121a implements C12112c {

        /* renamed from: a */
        private final String f29592a;

        public C12121a(String str) {
            this.f29592a = str;
        }

        /* renamed from: a */
        public void mo71288a(String str) {
            C12065a.m32845b("Metric " + str + " was skipped from being sent");
        }

        /* renamed from: a */
        public boolean mo71269a() {
            return false;
        }

        /* renamed from: b */
        public String mo71270b() {
            return this.f29592a;
        }

        public void sendMetric(C12113d dVar) {
            C12065a.m32845b("Metric " + dVar + " was skipped from being sent");
        }

        /* renamed from: a */
        public void mo71267a(String str, Map<String, String> map) {
            mo71288a(str);
        }

        /* renamed from: a */
        public void mo71268a(List<C12113d> list) {
            C12065a.m32845b("Metrics: " + list + " was skipped from being sent");
        }

        /* renamed from: a */
        public void mo71266a(C12113d dVar) {
            sendMetric(dVar);
        }
    }

    /* renamed from: a */
    public static synchronized C12112c m33045a() {
        C12118g gVar;
        synchronized (C12120i.class) {
            if (f29589a == null) {
                f29589a = new C12121a((String) null);
            }
            if (f29590b == null) {
                f29590b = new C12118g(f29589a);
            }
            gVar = f29590b;
        }
        return gVar;
    }

    /* renamed from: b */
    public static void m33047b(Configuration configuration) {
        if (configuration == null) {
            C12065a.m32845b("Metrics will not be sent from the device for this session due to misconfiguration");
        } else if (m33046a(configuration)) {
            C12112c cVar = f29589a;
            if (cVar instanceof C12116f) {
                ((C12116f) cVar).mo71282c();
            }
            if (configuration.getMetricSampleRate() >= ((double) (new Random().nextInt(99) + 1))) {
                f29589a = new C12116f(configuration, new C12085b());
            } else {
                C12065a.m32845b("Metrics will not be sent from the device for this session");
                f29589a = new C12121a("nullInstanceMetricsUrl");
            }
            C12118g gVar = f29590b;
            if (gVar == null) {
                f29590b = new C12118g(f29589a);
            } else {
                gVar.mo71284a(f29589a);
            }
            f29590b.mo71286c();
        }
    }

    /* renamed from: a */
    private static boolean m33046a(Configuration configuration) {
        if (TextUtils.isEmpty(configuration.getMetricsUrl()) || !f29591c.compareAndSet(false, true)) {
            return false;
        }
        return true;
    }
}
