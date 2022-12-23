package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2923x;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.component.C3178a;
import com.bytedance.sdk.openadsdk.component.p136c.C3205a;
import com.bytedance.sdk.openadsdk.component.p137d.C3207a;
import com.bytedance.sdk.openadsdk.component.p137d.C3208b;
import com.bytedance.sdk.openadsdk.core.C3446g;
import com.bytedance.sdk.openadsdk.core.C3502k;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3516n;
import com.bytedance.sdk.openadsdk.core.p149e.C3402a;
import com.bytedance.sdk.openadsdk.core.p149e.C3403b;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3433o;
import com.bytedance.sdk.openadsdk.core.p149e.C3436r;
import com.bytedance.sdk.openadsdk.p128b.C3060a;
import com.bytedance.sdk.openadsdk.p174i.p175a.C3788b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.component.c */
/* compiled from: TTAppOpenAdLoadManager */
public class C3200c implements C2923x.C2924a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f7525a = 0;

    /* renamed from: b */
    private AdSlot f7526b;

    /* renamed from: c */
    private final Context f7527c;

    /* renamed from: d */
    private final C3516n<C3060a> f7528d;

    /* renamed from: e */
    private TTAdNative.AppOpenAdListener f7529e;

    /* renamed from: f */
    private C2923x f7530f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C3178a f7531g;

    /* renamed from: h */
    private int f7532h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile int f7533i = 0;

    /* renamed from: j */
    private final AtomicBoolean f7534j = new AtomicBoolean(false);

    /* renamed from: k */
    private C3436r f7535k;

    public C3200c(Context context) {
        if (context != null) {
            this.f7527c = context.getApplicationContext();
        } else {
            this.f7527c = C3513m.m10963a();
        }
        this.f7528d = C3513m.m10971f();
        this.f7531g = C3178a.m9178a(this.f7527c);
    }

    /* renamed from: a */
    public static C3200c m9255a(Context context) {
        return new C3200c(context);
    }

    /* renamed from: a */
    public void mo18860a(AdSlot adSlot, TTAdNative.AppOpenAdListener appOpenAdListener, int i) {
        if (appOpenAdListener != null) {
            if (i <= 0) {
                C2905l.m8111b("TTAppOpenAdLoadManager", "Since the timeout value passed by loadAppOpenAd is <=0, now it is set to the default value of 3500ms");
                i = IronSourceConstants.BN_AUCTION_REQUEST;
            }
            this.f7526b = adSlot;
            this.f7529e = appOpenAdListener;
            this.f7525a = mo18859a(adSlot);
            this.f7532h = i;
            C2923x xVar = new C2923x(C3502k.m10921c().getLooper(), this);
            this.f7530f = xVar;
            xVar.sendEmptyMessageDelayed(1, (long) i);
            m9263b(this.f7526b);
            m9264c(this.f7526b);
        }
    }

    /* renamed from: b */
    private void m9263b(final AdSlot adSlot) {
        long currentTimeMillis = System.currentTimeMillis();
        C3436r rVar = new C3436r();
        this.f7535k = rVar;
        rVar.mo19695a(currentTimeMillis);
        this.f7533i = 1;
        C3433o oVar = new C3433o();
        oVar.f8446g = currentTimeMillis;
        oVar.f8448i = this.f7535k;
        oVar.f8443d = 1;
        this.f7528d.mo19983a(adSlot, oVar, 3, new C3516n.C3517a() {
            /* renamed from: a */
            public void mo18456a(int i, String str) {
                int unused = C3200c.this.f7533i = 3;
                C2905l.m8111b("TTAppOpenAdLoadManager", "try load app open ad from network fail");
                C3200c.this.m9259a(new C3208b(2, 100, i, str));
            }

            /* renamed from: a */
            public void mo18457a(C3402a aVar, C3403b bVar) {
                int unused = C3200c.this.f7533i = 2;
                C2905l.m8111b("TTAppOpenAdLoadManager", "try load app open ad from network success");
                if (aVar == null || aVar.mo19386b() == null || aVar.mo19386b().size() == 0) {
                    int unused2 = C3200c.this.f7533i = 3;
                    C3200c.this.m9259a(new C3208b(2, 100, 20001, C3446g.m10553a(20001)));
                    bVar.mo19391a(-3);
                    C3403b.m10134a(bVar);
                    return;
                }
                C3431n nVar = aVar.mo19386b().get(0);
                if (C3431n.m10311c(nVar)) {
                    C3200c.this.m9261a(nVar, adSlot);
                } else {
                    C3200c.this.m9260a(nVar);
                }
            }
        });
    }

    /* renamed from: c */
    private void m9264c(AdSlot adSlot) {
        C2882e.m8036a(new C2885g("tryGetAppOpenAdFromCache") {
            public void run() {
                if (!C3200c.this.f7531g.mo18840e(C3200c.this.f7525a)) {
                    return;
                }
                if (C3200c.this.f7531g.mo18836b(C3200c.this.f7525a) || C3200c.this.f7531g.mo18839d(C3200c.this.f7525a)) {
                    C3431n f = C3200c.this.f7531g.mo18841f(C3200c.this.f7525a);
                    C3200c.this.f7531g.mo18842g(C3200c.this.f7525a);
                    if (f == null) {
                        C2905l.m8111b("TTAppOpenAdLoadManager", "Cached material resolution failed");
                        return;
                    }
                    C2905l.m8111b("TTAppOpenAdLoadManager", "Cached material resolution success");
                    if (C3431n.m10311c(f)) {
                        if (!TextUtils.isEmpty(C3200c.this.f7531g.mo18826a(f)) || Build.VERSION.SDK_INT < 23) {
                            C3200c.this.m9259a(new C3208b(1, 101, f));
                            return;
                        }
                        C2905l.m8111b("TTAppOpenAdLoadManager", "Video cache path not found");
                        C3205a.m9281b(f);
                    } else if (C3200c.this.f7531g.mo18837b(f)) {
                        C3200c.this.m9259a(new C3208b(1, 101, f));
                    } else {
                        C2905l.m8111b("TTAppOpenAdLoadManager", "Image cache path not found");
                        C3205a.m9281b(f);
                    }
                } else {
                    C3200c.this.f7531g.mo18842g(C3200c.this.f7525a);
                }
            }
        }, 10);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9261a(final C3431n nVar, AdSlot adSlot) {
        this.f7531g.mo18832a(nVar, adSlot, this.f7535k, (C3178a.C3188c) new C3178a.C3188c() {
            /* renamed from: a */
            public void mo18844a() {
                int unused = C3200c.this.f7533i = 4;
                C3200c.this.m9259a(new C3208b(1, 100, nVar));
            }

            /* renamed from: a */
            public void mo18845a(int i, String str) {
                int unused = C3200c.this.f7533i = 5;
                C3200c.this.m9259a(new C3208b(2, 100, 10003, C3446g.m10553a(10003)));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9260a(final C3431n nVar) {
        this.f7531g.mo18833a(nVar, this.f7535k, (C3178a.C3187b) new C3178a.C3187b() {
            /* renamed from: a */
            public void mo18847a(C3788b bVar) {
                int unused = C3200c.this.f7533i = 4;
                C3200c.this.m9259a(new C3208b(1, 100, nVar));
            }

            /* renamed from: a */
            public void mo18846a() {
                int unused = C3200c.this.f7533i = 5;
                C3200c.this.m9259a(new C3208b(2, 100, 10003, C3446g.m10553a(10003)));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9259a(C3208b bVar) {
        int a = bVar.mo18864a();
        int b = bVar.mo18865b();
        if (this.f7534j.get()) {
            if (a == 1 && b == 100) {
                C3178a.m9178a(C3513m.m10963a()).mo18831a(new C3207a(this.f7525a, bVar.mo18866c()));
                C3205a.m9277a(bVar.mo18866c(), 1, this.f7535k);
            }
        } else if (a == 1) {
            C3192b bVar2 = new C3192b(this.f7527c, bVar.mo18866c(), b == 101);
            TTAdNative.AppOpenAdListener appOpenAdListener = this.f7529e;
            if (appOpenAdListener != null) {
                appOpenAdListener.onAppOpenAdLoaded(bVar2);
            }
            this.f7534j.set(true);
            if (b == 101) {
                C3205a.m9278a(bVar.mo18866c(), System.currentTimeMillis() - this.f7535k.mo19693a());
            } else if (b == 100) {
                C3205a.m9277a(bVar.mo18866c(), 0, this.f7535k);
                this.f7531g.mo18830a(this.f7526b);
            }
        } else if (a == 2 || a == 3) {
            TTAdNative.AppOpenAdListener appOpenAdListener2 = this.f7529e;
            if (appOpenAdListener2 != null) {
                appOpenAdListener2.onError(bVar.mo18867d(), bVar.mo18868e());
            }
            this.f7534j.set(true);
            if (a == 3) {
                C3205a.m9274a(this.f7533i, this.f7532h);
            }
        }
    }

    /* renamed from: a */
    public int mo18859a(AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            m9259a(new C3208b(2, 102, 40006, C3446g.m10553a(40006)));
            return 0;
        }
    }

    /* renamed from: a */
    public void mo17240a(Message message) {
        if (message.what == 1 && !this.f7534j.get()) {
            m9259a(new C3208b(3, 102, 10002, C3446g.m10553a(10002)));
        }
    }
}
