package com.mbridge.msdk.p219d;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.C8463h;
import com.mbridge.msdk.foundation.p298db.C8410e;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8421n;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.reward.adapter.C9132b;
import com.mbridge.msdk.reward.adapter.C9154d;
import com.mbridge.msdk.videocommon.p375d.C9637a;
import com.mbridge.msdk.videocommon.p375d.C9638b;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.mbridge.msdk.d.a */
/* compiled from: LoopTimer */
public final class C6798a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public long f17961a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f17962b;

    /* renamed from: c */
    private LinkedList<C8463h> f17963c;

    /* renamed from: d */
    private LinkedList<C8463h> f17964d;

    /* renamed from: e */
    private int f17965e;

    /* renamed from: f */
    private int f17966f;

    /* renamed from: g */
    private C8410e f17967g;

    /* renamed from: h */
    private C9637a f17968h;

    /* renamed from: i */
    private C8421n f17969i;

    /* renamed from: j */
    private C8414g f17970j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Handler f17971k;

    /* renamed from: com.mbridge.msdk.d.a$a */
    /* compiled from: LoopTimer */
    static class C6801a {

        /* renamed from: a */
        static C6798a f17975a = new C6798a();
    }

    private C6798a() {
        this.f17962b = false;
        this.f17963c = new LinkedList<>();
        this.f17964d = new LinkedList<>();
        this.f17965e = 0;
        this.f17966f = 0;
        this.f17971k = new Handler() {
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void handleMessage(android.os.Message r5) {
                /*
                    r4 = this;
                    com.mbridge.msdk.d.a r0 = com.mbridge.msdk.p219d.C6798a.this
                    monitor-enter(r0)
                    int r5 = r5.what     // Catch:{ all -> 0x0036 }
                    r1 = 1
                    if (r5 == r1) goto L_0x0012
                    r1 = 2
                    if (r5 == r1) goto L_0x000c
                    goto L_0x0034
                L_0x000c:
                    com.mbridge.msdk.d.a r5 = com.mbridge.msdk.p219d.C6798a.this     // Catch:{ all -> 0x0036 }
                    com.mbridge.msdk.p219d.C6798a.m20719c(r5)     // Catch:{ all -> 0x0036 }
                    goto L_0x0034
                L_0x0012:
                    com.mbridge.msdk.d.a r5 = com.mbridge.msdk.p219d.C6798a.this     // Catch:{ all -> 0x0036 }
                    boolean r5 = r5.f17962b     // Catch:{ all -> 0x0036 }
                    if (r5 == 0) goto L_0x001c
                    monitor-exit(r0)     // Catch:{ all -> 0x0036 }
                    return
                L_0x001c:
                    com.mbridge.msdk.d.a r5 = com.mbridge.msdk.p219d.C6798a.this     // Catch:{ all -> 0x0036 }
                    com.mbridge.msdk.d.a r2 = com.mbridge.msdk.p219d.C6798a.this     // Catch:{ all -> 0x0036 }
                    long r2 = r2.f17961a     // Catch:{ all -> 0x0036 }
                    com.mbridge.msdk.p219d.C6798a.m20714a((com.mbridge.msdk.p219d.C6798a) r5, (long) r2)     // Catch:{ all -> 0x0036 }
                    android.os.Message r5 = r4.obtainMessage(r1)     // Catch:{ all -> 0x0036 }
                    com.mbridge.msdk.d.a r1 = com.mbridge.msdk.p219d.C6798a.this     // Catch:{ all -> 0x0036 }
                    long r1 = r1.f17961a     // Catch:{ all -> 0x0036 }
                    r4.sendMessageDelayed(r5, r1)     // Catch:{ all -> 0x0036 }
                L_0x0034:
                    monitor-exit(r0)     // Catch:{ all -> 0x0036 }
                    return
                L_0x0036:
                    r5 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0036 }
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.p219d.C6798a.C67991.handleMessage(android.os.Message):void");
            }
        };
    }

    /* renamed from: a */
    private boolean m20717a(C8463h hVar) {
        boolean z = false;
        if (hVar == null || TextUtils.isEmpty(hVar.mo57749a())) {
            return false;
        }
        String a = hVar.mo57749a();
        try {
            if (this.f17967g != null) {
                long j = 0;
                if (this.f17968h != null) {
                    j = this.f17968h.mo63541d();
                }
                int a2 = this.f17967g.mo56979a(a, j);
                if (a2 != -1) {
                    if (a2 != 1) {
                    }
                } else if (!TextUtils.isEmpty(a)) {
                    if (this.f17963c != null && this.f17963c.contains(a)) {
                        this.f17963c.remove(a);
                    } else if (this.f17964d != null && this.f17964d.contains(a)) {
                        this.f17964d.remove(a);
                    }
                    if (this.f17969i != null) {
                        this.f17969i.mo57046a(a);
                    }
                }
                try {
                    this.f17971k.sendMessage(this.f17971k.obtainMessage(2));
                    return false;
                } catch (Throwable th) {
                    th = th;
                }
            }
            return true;
        } catch (Throwable th2) {
            th = th2;
            z = true;
            C8672v.m24875a("LoopTimer", th.getMessage(), th);
            return z;
        }
    }

    /* renamed from: a */
    private void m20715a(String str, String str2, boolean z) {
        try {
            Context g = C8388a.m23845e().mo56913g();
            if (g != null) {
                final C9154d dVar = new C9154d(g, str, str2);
                dVar.mo61347b(z);
                dVar.mo61318a((C9132b) new C9132b() {
                    /* renamed from: a */
                    public final void mo37116a() {
                    }

                    /* renamed from: a */
                    public final void mo37117a(String str) {
                        C6798a.this.f17971k.sendMessage(C6798a.this.f17971k.obtainMessage(2));
                        dVar.mo61318a((C9132b) null);
                    }

                    /* renamed from: b */
                    public final void mo37118b(String str) {
                        C6798a.this.f17971k.sendMessage(C6798a.this.f17971k.obtainMessage(2));
                        dVar.mo61318a((C9132b) null);
                    }
                });
                dVar.mo61338a(1, 8000, false);
            }
        } catch (Exception e) {
            C8672v.m24875a("LoopTimer", e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public final void mo37113a(String str, String str2) {
        if (!this.f17963c.contains(str2)) {
            this.f17963c.add(new C8463h(str, str2, 94));
            C8421n nVar = this.f17969i;
            if (nVar != null) {
                nVar.mo57047a(str, str2, 94);
            }
        }
    }

    /* renamed from: b */
    public final void mo37114b(String str, String str2) {
        if (!this.f17964d.contains(str2)) {
            this.f17964d.add(new C8463h(str, str2, 287));
            C8421n nVar = this.f17969i;
            if (nVar != null) {
                nVar.mo57047a(str, str2, 287);
            }
        }
    }

    /* renamed from: a */
    public final void mo37112a(long j) {
        if (this.f17970j == null) {
            this.f17970j = C8414g.m23969a(C8388a.m23845e().mo56913g());
        }
        if (this.f17969i == null) {
            this.f17969i = C8421n.m24010a((C8412f) this.f17970j);
        }
        List<C8463h> a = this.f17969i.mo57045a(287);
        if (a != null) {
            this.f17964d.addAll(a);
            for (C8463h next : a) {
                mo37114b(next.mo57750b(), next.mo57749a());
            }
        }
        List<C8463h> a2 = this.f17969i.mo57045a(94);
        if (a2 != null) {
            this.f17963c.addAll(a2);
            for (C8463h next2 : a2) {
                mo37113a(next2.mo57750b(), next2.mo57749a());
            }
        }
        if (this.f17967g == null) {
            this.f17967g = C8410e.m23925a((C8412f) this.f17970j);
        }
        if (this.f17968h == null) {
            this.f17968h = C9638b.m27377a().mo63556b();
        }
        this.f17961a = j;
        this.f17962b = false;
        Handler handler = this.f17971k;
        handler.sendMessageDelayed(handler.obtainMessage(1), this.f17961a);
    }

    /* renamed from: a */
    static /* synthetic */ void m20714a(C6798a aVar, long j) {
        LinkedList<C8463h> linkedList = aVar.f17963c;
        if (linkedList == null || linkedList.size() <= 0 || aVar.f17965e == 0 || aVar.f17963c.size() <= aVar.f17965e) {
            LinkedList<C8463h> linkedList2 = aVar.f17964d;
            if (linkedList2 == null || linkedList2.size() <= 0 || aVar.f17966f == 0 || aVar.f17964d.size() == aVar.f17966f) {
                aVar.f17966f = 0;
                aVar.f17965e = 0;
                Handler handler = aVar.f17971k;
                handler.sendMessage(handler.obtainMessage(2));
            }
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m20719c(C6798a aVar) {
        try {
            if (aVar.f17963c != null && aVar.f17963c.size() > 0 && aVar.f17965e < aVar.f17963c.size()) {
                C8463h hVar = aVar.f17963c.get(aVar.f17965e);
                aVar.f17965e++;
                if (aVar.m20717a(hVar)) {
                    aVar.m20715a(hVar.mo57750b(), hVar.mo57749a(), false);
                }
            } else if (aVar.f17964d != null && aVar.f17964d.size() > 0 && aVar.f17966f < aVar.f17964d.size()) {
                C8463h hVar2 = aVar.f17964d.get(aVar.f17966f);
                aVar.f17966f++;
                if (aVar.m20717a(hVar2)) {
                    aVar.m20715a(hVar2.mo57750b(), hVar2.mo57749a(), true);
                }
            }
        } catch (Throwable th) {
            C8672v.m24875a("LoopTimer", th.getMessage(), th);
        }
    }
}
