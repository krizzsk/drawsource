package com.ogury.p377ed.internal;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.smaato.sdk.video.vast.model.Creative;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.Arrays;
import java.util.Map;
import p401io.presage.mraid.browser.ShortcutActivity;

/* renamed from: com.ogury.ed.internal.iw */
public final class C10142iw extends C10137it {

    /* renamed from: b */
    public static final C10143a f25465b = new C10143a((byte) 0);

    /* renamed from: c */
    private final Context f25466c;

    /* renamed from: d */
    private final C10078hb f25467d;

    /* renamed from: e */
    private final C10145iy f25468e;

    /* renamed from: f */
    private final C10075gz f25469f;

    /* renamed from: g */
    private final C10084hg f25470g;

    /* renamed from: h */
    private final C10012fa f25471h;

    /* renamed from: i */
    private final C10008ez f25472i;

    /* renamed from: j */
    private C10227lj<C10182ke> f25473j;

    /* renamed from: k */
    private ShortcutActivity.C12488a f25474k = ShortcutActivity.f29819a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10142iw(Context context, C10078hb hbVar, C10145iy iyVar, C10075gz gzVar, C10084hg hgVar, C10012fa faVar, C10008ez ezVar) {
        super(hbVar);
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(hbVar, "mraidCommandExecutor");
        C10263mq.m29882b(iyVar, "mraidViewCommands");
        C10263mq.m29882b(gzVar, "intentHandler");
        C10263mq.m29882b(hgVar, "mraidEventBus");
        C10263mq.m29882b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10263mq.m29882b(ezVar, "androidDevice");
        this.f25466c = context;
        this.f25467d = hbVar;
        this.f25468e = iyVar;
        this.f25469f = gzVar;
        this.f25470g = hgVar;
        this.f25471h = faVar;
        this.f25472i = ezVar;
    }

    /* renamed from: a */
    public final void mo64938a(C10227lj<C10182ke> ljVar) {
        this.f25473j = ljVar;
    }

    /* renamed from: com.ogury.ed.internal.iw$a */
    public static final class C10143a {
        public /* synthetic */ C10143a(byte b) {
            this();
        }

        private C10143a() {
        }
    }

    /* renamed from: b */
    public final void mo64924b(boolean z) {
        if (z) {
            this.f25468e.mo64329q();
        } else {
            this.f25468e.mo64330r();
        }
    }

    /* renamed from: a */
    public final void mo64923a(boolean z) {
        this.f25468e.mo64312b(z);
    }

    /* renamed from: a */
    public final void mo64928a(String str, String str2) {
        C10263mq.m29882b(str2, Creative.AD_ID);
        C10075gz.m29254a(this.f25466c, str);
    }

    /* renamed from: b */
    public final void mo64933b(String str, String str2) {
        C10263mq.m29882b(str2, TJAdUnitConstants.String.CALLBACK_ID);
        boolean c = C10075gz.m29257c(this.f25466c, str);
        boolean z = C10008ez.m28970b() >= 30 && this.f25471h.mo64644h() >= 30;
        C10268mv mvVar = C10268mv.f25610a;
        String format = String.format("{isResolved: %s, hasLimitedPackageVisibility: %s}", Arrays.copyOf(new Object[]{Boolean.valueOf(c), Boolean.valueOf(z)}, 2));
        C10263mq.m29879a((Object) format, "java.lang.String.format(format, *args)");
        this.f25467d.mo64813b(str2, format);
    }

    /* renamed from: a */
    public final void mo64929a(String str, String str2, String str3) {
        C10263mq.m29882b(str2, TJAdUnitConstants.String.CALLBACK_ID);
        C10263mq.m29882b(str3, Creative.AD_ID);
        if (C10075gz.m29256b(this.f25466c, str)) {
            this.f25467d.mo64813b(str2, "{isStarted: true}");
            C10227lj<C10182ke> ljVar = this.f25473j;
            if (ljVar != null) {
                ljVar.mo64355a();
                return;
            }
            return;
        }
        this.f25467d.mo64813b(str2, "{isStarted: false}");
    }

    /* renamed from: a */
    public final void mo64930a(Map<String, String> map, String str) {
        C10263mq.m29882b(map, "params");
        C10263mq.m29882b(str, "args");
        boolean z = true;
        if (str.length() > 0) {
            CharSequence charSequence = map.get("name");
            if (!(charSequence == null || charSequence.length() == 0)) {
                CharSequence charSequence2 = map.get(RewardPlus.ICON);
                if (!(charSequence2 == null || charSequence2.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    ShortcutActivity.C12488a.m33363a(this.f25466c, new C10144ix(String.valueOf(map.get("id")), String.valueOf(map.get("name")), String.valueOf(map.get(RewardPlus.ICON)), str));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo64925a(C9991ek ekVar) {
        C10263mq.m29882b(ekVar, "adUnit");
        C10084hg.m29312a((C10083hf) new C10086hi(ekVar.mo64575b(), ekVar.mo64581e()));
    }

    /* renamed from: a */
    public final void mo64927a(String str) {
        C10263mq.m29882b(str, Creative.AD_ID);
        this.f25468e.mo64308a(str);
    }

    /* renamed from: a */
    public final void mo64926a(C10146iz izVar) {
        this.f25468e.mo64307a(izVar);
    }

    /* renamed from: b */
    public final void mo64931b() {
        this.f25468e.mo64334v();
    }

    /* renamed from: c */
    public final void mo64934c() {
        this.f25468e.mo64332t();
    }

    /* renamed from: c */
    public final void mo64936c(boolean z) {
        this.f25468e.mo64314c(z);
    }

    /* renamed from: a */
    public final void mo64922a() {
        this.f25468e.mo64314c(false);
    }

    /* renamed from: b */
    public final void mo64932b(String str) {
        C10263mq.m29882b(str, Creative.AD_ID);
        C10084hg.m29312a((C10083hf) new C10077ha(str));
    }

    /* renamed from: c */
    public final void mo64935c(String str) {
        C10263mq.m29882b(str, Creative.AD_ID);
        C10084hg.m29312a(new C10083hf(str, "adImpression"));
    }
}
