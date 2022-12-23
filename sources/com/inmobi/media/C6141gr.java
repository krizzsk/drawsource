package com.inmobi.media;

import androidx.browser.trusted.sharing.ShareTarget;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.gr */
/* compiled from: EventSubmitter */
public class C6141gr {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f15487a = C6141gr.class.getSimpleName();

    /* renamed from: b */
    private static ScheduledExecutorService f15488b;

    /* renamed from: com.inmobi.media.gr$a */
    /* compiled from: EventSubmitter */
    static class C6143a {

        /* renamed from: a */
        static final C6141gr f15499a = new C6141gr((byte) 0);
    }

    /* synthetic */ C6141gr(byte b) {
        this();
    }

    /* renamed from: a */
    public static C6141gr m18197a() {
        return C6143a.f15499a;
    }

    private C6141gr() {
        f15488b = Executors.newSingleThreadScheduledExecutor();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35329a(C6138gp gpVar, String str, int i, int i2, long j, C6236ja jaVar, C6144gs gsVar, boolean z) {
        C6138gp gpVar2 = gpVar;
        int i3 = i;
        int i4 = i2;
        if (!C6196id.m18389a() || !C6183hw.m18338j()) {
            gsVar.mo35326a(gpVar2, false);
            return;
        }
        final C6156ha haVar = new C6156ha(ShareTarget.METHOD_POST, str, jaVar);
        HashMap hashMap = new HashMap();
        hashMap.put("payload", gpVar2.f15473b);
        haVar.mo35341c(hashMap);
        int i5 = i3 - i4;
        if (i5 > 0) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("X-im-retry-count", String.valueOf(i5));
            haVar.mo35338a((Map<String, String>) hashMap2);
        }
        haVar.f15539t = false;
        haVar.f15534o = false;
        long j2 = 0;
        if (z) {
            if (i4 != i3) {
                j2 = ((long) Math.pow(2.0d, (double) i5)) * j;
            }
        } else if (i4 != i3) {
            j2 = j;
        }
        long j3 = j2;
        final int i6 = i2;
        final C6138gp gpVar3 = gpVar;
        final String str2 = str;
        final int i7 = i;
        final long j4 = j;
        final C6236ja jaVar2 = jaVar;
        final C6144gs gsVar2 = gsVar;
        final boolean z2 = z;
        f15488b.schedule(new Runnable() {
            public final void run() {
                C6157hb a = new C6159hd(haVar).mo35353a();
                if (!a.mo35349a()) {
                    gsVar2.mo35325a(gpVar3);
                } else if (i6 > 1) {
                    String unused = C6141gr.f15487a;
                    a.mo35350b();
                    C6141gr.this.mo35329a(gpVar3, str2, i7, i6 - 1, j4, jaVar2, gsVar2, z2);
                } else {
                    gsVar2.mo35326a(gpVar3, true);
                }
            }
        }, j3, TimeUnit.SECONDS);
    }
}
