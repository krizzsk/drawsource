package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.view.View;
import com.fyber.inneractive.sdk.C4109R;
import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.measurement.C4401a;
import com.fyber.inneractive.sdk.model.vast.C4425g;
import com.fyber.inneractive.sdk.p191ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.renderers.C5216g;
import com.fyber.inneractive.sdk.util.C5270f0;
import com.fyber.inneractive.sdk.util.C5276g;
import com.fyber.inneractive.sdk.util.C5309q0;
import com.fyber.inneractive.sdk.web.C5347c;
import com.fyber.inneractive.sdk.web.C5349d;

/* renamed from: com.fyber.inneractive.sdk.player.controller.c */
public class C4575c {

    /* renamed from: a */
    public IAmraidWebViewController f11345a;

    /* renamed from: b */
    public C5349d.C5356g f11346b = C5349d.C5356g.INLINE;

    /* renamed from: c */
    public UnitDisplayType f11347c;

    /* renamed from: d */
    public C5349d.C5353d f11348d = C5349d.C5353d.ENABLED;

    /* renamed from: e */
    public boolean f11349e;

    /* renamed from: com.fyber.inneractive.sdk.player.controller.c$a */
    public static /* synthetic */ class C4576a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11350a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f11351b;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|5|6|7|8|9|11|12|(3:13|14|16)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
        static {
            /*
                com.fyber.inneractive.sdk.model.vast.g[] r0 = com.fyber.inneractive.sdk.model.vast.C4425g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11351b = r0
                r1 = 1
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                int[] r2 = f11351b     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2[r0] = r0     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r2 = f11351b     // Catch:{ NoSuchFieldError -> 0x0017 }
                r3 = 3
                r2[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r2 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f11350a = r2
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r3 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r1 = f11350a     // Catch:{ NoSuchFieldError -> 0x0032 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r2 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C4575c.C4576a.<clinit>():void");
        }
    }

    public C4575c(Context context, UnitDisplayType unitDisplayType, boolean z, int i, int i2, C4288z zVar, C4425g gVar) {
        mo24809a(unitDisplayType, z);
        try {
            this.f11345a = new IAmraidWebViewController(context, C5276g.m16480a(unitDisplayType, IAConfigManager.m13176b().mo24276a()), this.f11346b, this.f11348d, C5349d.C5357h.AD_CONTROLLED, true, (C4401a) null);
            mo24810a(gVar);
            C5270f0.m16471a().mo26369a(context, (View) this.f11345a.mo26424a(), (C5270f0.C5275e) this.f11345a);
            this.f11345a.mo26432c();
            C5309q0 a = C5216g.m16213a(i, i2, zVar);
            this.f11345a.setAdDefaultSize(a.f14037a, a.f14038b);
        } catch (Throwable unused) {
            this.f11345a = null;
        }
    }

    /* renamed from: a */
    public void mo24809a(UnitDisplayType unitDisplayType, boolean z) {
        this.f11347c = unitDisplayType;
        this.f11349e = z;
        int i = C4576a.f11350a[unitDisplayType.ordinal()];
        if (i == 1 || i == 2) {
            this.f11348d = C5349d.C5353d.ENABLED;
            if (z) {
                this.f11346b = C5349d.C5356g.INTERSTITIAL;
                return;
            }
            return;
        }
        this.f11348d = C5349d.C5353d.ENABLED;
    }

    /* renamed from: a */
    public final void mo24810a(C4425g gVar) {
        C5347c cVar = this.f11345a.f14079b;
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            cVar.setId(C4109R.C4111id.inneractive_vast_endcard_gif);
        } else if (ordinal == 1) {
            cVar.setId(C4109R.C4111id.inneractive_vast_endcard_iframe);
        } else if (ordinal == 2) {
            cVar.setId(C4109R.C4111id.inneractive_vast_endcard_html);
        }
    }
}
