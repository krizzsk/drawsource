package com.bytedance.sdk.openadsdk.p177k;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2900j;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p153i.C3470e;
import com.bytedance.sdk.openadsdk.p178l.C3885n;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.bytedance.sdk.openadsdk.k.b */
/* compiled from: TrackAdUrlImpl */
public class C3841b implements C3840a {

    /* renamed from: a */
    private final Context f9886a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3849g f9887b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ExecutorService f9888c = Executors.newSingleThreadExecutor();

    public C3841b(Context context, C3849g gVar) {
        this.f9886a = context;
        this.f9887b = gVar;
    }

    /* renamed from: c */
    public Context mo20697c() {
        Context context = this.f9886a;
        return context == null ? C3513m.m10963a() : context;
    }

    /* renamed from: a */
    public void mo20695a(final List<String> list) {
        if (C3470e.m10697a()) {
            C2882e.m8042b(new C2885g("trackUrls") {
                public void run() {
                    if (C2900j.m8098b(list)) {
                        for (String fVar : list) {
                            new C3844a(new C3848f(C3885n.m12675a() + "_" + System.currentTimeMillis(), fVar, 5)).executeOnExecutor(C3841b.this.f9888c, new Void[0]);
                        }
                    }
                }
            }, 5);
        }
    }

    /* renamed from: a */
    public void mo20694a() {
        C2882e.m8041b((C2885g) new C2885g("trackFailedUrls") {
            public void run() {
                C3841b.this.m12544b(C3841b.this.f9887b.mo20707a());
            }
        });
    }

    /* renamed from: b */
    public void mo20696b() {
        try {
            this.f9888c.shutdownNow();
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m12544b(List<C3848f> list) {
        if (C2900j.m8098b(list)) {
            for (C3848f aVar : list) {
                new C3844a(aVar).executeOnExecutor(this.f9888c, new Void[0]);
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.k.b$a */
    /* compiled from: TrackAdUrlImpl */
    private class C3844a extends AsyncTask<Void, Void, Void> {

        /* renamed from: b */
        private final C3848f f9893b;

        private C3844a(C3848f fVar) {
            this.f9893b = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo20701a(String str) {
            return !TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"));
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:22|23|24|25|26|27|30|(3:32|33|(3:49|35|(1:37)(0)))|38|(1:40)|41|(3:51|43|(1:45)(0))(3:46|54|48)) */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
            r4 = null;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x007b */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0085 A[SYNTHETIC, Splitter:B:32:0x0085] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00bd A[Catch:{ all -> 0x0029 }] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0118 A[Catch:{ all -> 0x0029 }] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ec A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Void... r4) {
            /*
                r3 = this;
                boolean r4 = com.bytedance.sdk.openadsdk.core.p153i.C3470e.m10697a()
                r0 = 0
                if (r4 != 0) goto L_0x0008
                return r0
            L_0x0008:
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f9893b
                java.lang.String r4 = r4.mo20705b()
                boolean r4 = r3.mo20701a((java.lang.String) r4)
                if (r4 != 0) goto L_0x0015
                return r0
            L_0x0015:
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f9893b
                int r4 = r4.mo20706c()
                if (r4 != 0) goto L_0x0029
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.p177k.C3841b.this
                com.bytedance.sdk.openadsdk.k.g r4 = r4.f9887b
                com.bytedance.sdk.openadsdk.k.f r1 = r3.f9893b
                r4.mo20710c(r1)
                return r0
            L_0x0029:
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f9893b
                int r4 = r4.mo20706c()
                if (r4 <= 0) goto L_0x0125
                boolean r4 = r3.isCancelled()
                if (r4 != 0) goto L_0x0125
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f9893b     // Catch:{ all -> 0x0029 }
                int r4 = r4.mo20706c()     // Catch:{ all -> 0x0029 }
                r1 = 5
                if (r4 != r1) goto L_0x004b
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.p177k.C3841b.this     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.g r4 = r4.f9887b     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.f r1 = r3.f9893b     // Catch:{ all -> 0x0029 }
                r4.mo20708a(r1)     // Catch:{ all -> 0x0029 }
            L_0x004b:
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.p177k.C3841b.this     // Catch:{ all -> 0x0029 }
                android.content.Context r4 = r4.mo20697c()     // Catch:{ all -> 0x0029 }
                boolean r4 = com.bytedance.sdk.component.utils.C2909o.m8133a((android.content.Context) r4)     // Catch:{ all -> 0x0029 }
                if (r4 != 0) goto L_0x0059
                goto L_0x0125
            L_0x0059:
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f9893b     // Catch:{ all -> 0x0029 }
                java.lang.String r4 = r4.mo20705b()     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.i.d r1 = com.bytedance.sdk.openadsdk.p174i.C3792d.m12395a()     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.component.e.a r1 = r1.mo20615b()     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.component.e.b.b r1 = r1.mo17684c()     // Catch:{ all -> 0x0029 }
                java.lang.String r4 = com.bytedance.sdk.openadsdk.p178l.C3896v.m12743b(r4)     // Catch:{ all -> 0x0029 }
                r1.mo17711a((java.lang.String) r4)     // Catch:{ all -> 0x0029 }
                java.lang.String r4 = "User-Agent"
                java.lang.String r2 = com.bytedance.sdk.openadsdk.p178l.C3898x.m12768b()     // Catch:{ Exception -> 0x007b }
                r1.mo17714b(r4, r2)     // Catch:{ Exception -> 0x007b }
            L_0x007b:
                com.bytedance.sdk.component.e.b r4 = r1.mo17707a()     // Catch:{ all -> 0x0080 }
                goto L_0x0081
            L_0x0080:
                r4 = r0
            L_0x0081:
                java.lang.String r1 = "trackurl"
                if (r4 == 0) goto L_0x00b7
                boolean r4 = r4.mo17701f()     // Catch:{ all -> 0x0029 }
                if (r4 == 0) goto L_0x00b7
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.p177k.C3841b.this     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.g r4 = r4.f9887b     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f9893b     // Catch:{ all -> 0x0029 }
                r4.mo20710c(r2)     // Catch:{ all -> 0x0029 }
                boolean r4 = com.bytedance.sdk.component.utils.C2905l.m8116c()     // Catch:{ all -> 0x0029 }
                if (r4 == 0) goto L_0x0125
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
                r4.<init>()     // Catch:{ all -> 0x0029 }
                java.lang.String r2 = "track success : "
                r4.append(r2)     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f9893b     // Catch:{ all -> 0x0029 }
                java.lang.String r2 = r2.mo20705b()     // Catch:{ all -> 0x0029 }
                r4.append(r2)     // Catch:{ all -> 0x0029 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.component.utils.C2905l.m8114c(r1, r4)     // Catch:{ all -> 0x0029 }
                goto L_0x0125
            L_0x00b7:
                boolean r4 = com.bytedance.sdk.component.utils.C2905l.m8116c()     // Catch:{ all -> 0x0029 }
                if (r4 == 0) goto L_0x00d7
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
                r4.<init>()     // Catch:{ all -> 0x0029 }
                java.lang.String r2 = "track fail : "
                r4.append(r2)     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f9893b     // Catch:{ all -> 0x0029 }
                java.lang.String r2 = r2.mo20705b()     // Catch:{ all -> 0x0029 }
                r4.append(r2)     // Catch:{ all -> 0x0029 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.component.utils.C2905l.m8114c(r1, r4)     // Catch:{ all -> 0x0029 }
            L_0x00d7:
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f9893b     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f9893b     // Catch:{ all -> 0x0029 }
                int r2 = r2.mo20706c()     // Catch:{ all -> 0x0029 }
                int r2 = r2 + -1
                r4.mo20704a(r2)     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f9893b     // Catch:{ all -> 0x0029 }
                int r4 = r4.mo20706c()     // Catch:{ all -> 0x0029 }
                if (r4 != 0) goto L_0x0118
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.p177k.C3841b.this     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.g r4 = r4.f9887b     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f9893b     // Catch:{ all -> 0x0029 }
                r4.mo20710c(r2)     // Catch:{ all -> 0x0029 }
                boolean r4 = com.bytedance.sdk.component.utils.C2905l.m8116c()     // Catch:{ all -> 0x0029 }
                if (r4 == 0) goto L_0x0125
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
                r4.<init>()     // Catch:{ all -> 0x0029 }
                java.lang.String r2 = "track fail and delete : "
                r4.append(r2)     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f9893b     // Catch:{ all -> 0x0029 }
                java.lang.String r2 = r2.mo20705b()     // Catch:{ all -> 0x0029 }
                r4.append(r2)     // Catch:{ all -> 0x0029 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.component.utils.C2905l.m8114c(r1, r4)     // Catch:{ all -> 0x0029 }
                goto L_0x0125
            L_0x0118:
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.p177k.C3841b.this     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.g r4 = r4.f9887b     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.f r1 = r3.f9893b     // Catch:{ all -> 0x0029 }
                r4.mo20709b(r1)     // Catch:{ all -> 0x0029 }
                goto L_0x0029
            L_0x0125:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p177k.C3841b.C3844a.doInBackground(java.lang.Void[]):java.lang.Void");
        }
    }

    /* renamed from: d */
    public static C3840a m12545d() {
        return C3846d.m12555c();
    }
}
