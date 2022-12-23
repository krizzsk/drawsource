package p401io.presage.interstitial.p402ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p377ed.internal.C10044g;
import com.ogury.p377ed.internal.C10069gv;
import com.ogury.p377ed.internal.C10082he;
import com.ogury.p377ed.internal.C10083hf;
import com.ogury.p377ed.internal.C10084hg;
import com.ogury.p377ed.internal.C10263mq;
import com.ogury.p377ed.internal.C10269mw;
import com.ogury.p377ed.internal.C10329s;
import com.ogury.p377ed.internal.C9816aj;
import com.ogury.p377ed.internal.C9835ap;
import com.ogury.p377ed.internal.C9925da;
import com.ogury.p377ed.internal.C9929dd;
import com.ogury.p377ed.internal.C9981eb;
import com.ogury.p377ed.internal.C9992el;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.presage.interstitial.ui.InterstitialActivity */
public class InterstitialActivity extends Activity implements C9929dd {

    /* renamed from: a */
    public static final C12487a f29814a = new C12487a((byte) 0);

    /* renamed from: b */
    private C9816aj f29815b;

    /* renamed from: c */
    private C9925da f29816c = C9925da.f24975a;

    /* renamed from: d */
    private boolean f29817d;

    /* renamed from: e */
    private boolean f29818e = true;

    /* renamed from: a */
    private static boolean m33352a(Bundle bundle) {
        return bundle != null;
    }

    /* renamed from: io.presage.interstitial.ui.InterstitialActivity$a */
    public static final class C12487a implements C9835ap {
        public /* synthetic */ C12487a(byte b) {
            this();
        }

        private C12487a() {
        }

        /* renamed from: a */
        public final void mo64362a(Context context, String str, C9981eb ebVar, List<C9981eb> list) {
            C10263mq.m29882b(context, "context");
            C10263mq.m29882b(str, "expandCacheItemId");
            C10263mq.m29882b(ebVar, "ad");
            C10263mq.m29882b(list, "notDisplayedAds");
            Intent a = m33357a(ebVar, list, context);
            a.putExtra("mode", 1);
            a.putExtra("expand_cache_item_id", str);
            context.startActivity(a);
        }

        /* renamed from: a */
        public final void mo64361a(Context context, C9981eb ebVar, List<C9981eb> list) {
            C10263mq.m29882b(context, "context");
            C10263mq.m29882b(ebVar, "ad");
            C10263mq.m29882b(list, "notDisplayedAds");
            OguryIntegrationLogger.m28105d("[Ads][Activity] Prepare and start Activity");
            context.startActivity(m33357a(ebVar, list, context));
        }

        /* renamed from: a */
        private static Intent m33357a(C9981eb ebVar, List<C9981eb> list, Context context) {
            Intent intent = new Intent(context, m33358a(ebVar));
            intent.putExtra("ad", ebVar);
            intent.putExtra("not_displayed_ads", new ArrayList(list));
            intent.addFlags(268435456);
            return intent;
        }

        /* renamed from: a */
        private static Class<?> m33358a(C9981eb ebVar) {
            if (m33359a()) {
                return InterstitialActivity.class;
            }
            return ebVar.mo64533n() ? InterstitialAndroid8TransparentActivity.class : InterstitialAndroid8RotableActivity.class;
        }

        /* renamed from: a */
        private static boolean m33359a() {
            return Build.VERSION.SDK_INT != 26;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (m33352a(bundle)) {
            finish();
            return;
        }
        m33354c();
        try {
            List<C9981eb> b = m33353b();
            C9981eb a = m33351a();
            if (a != null) {
                this.f29817d = C9992el.m28924a(a);
                Intent intent = getIntent();
                C10263mq.m29879a((Object) intent, SDKConstants.PARAM_INTENT);
                C10069gv gvVar = new C10069gv(this, intent, a, b);
                C10044g a2 = gvVar.mo64791a();
                a2.setDisplayedInFullScreen(true);
                this.f29815b = gvVar.mo64792b();
                setContentView(a2);
                return;
            }
            throw new IllegalStateException("Ad not sent to interstitial activity");
        } catch (Throwable th) {
            OguryIntegrationLogger.m28106e(C10263mq.m29874a("[Ads][Activity] onCreate() failed (", (Object) th.getMessage()));
            this.f29818e = false;
            C9925da.m28653a(th);
            finish();
        }
    }

    /* renamed from: a */
    private final C9981eb m33351a() {
        Serializable serializableExtra = getIntent().getSerializableExtra("ad");
        if (serializableExtra instanceof C9981eb) {
            return (C9981eb) serializableExtra;
        }
        return null;
    }

    /* renamed from: b */
    private final List<C9981eb> m33353b() {
        Serializable serializableExtra = getIntent().getSerializableExtra("not_displayed_ads");
        if (serializableExtra != null) {
            return C10269mw.m29901b(serializableExtra);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<io.presage.common.network.models.Ad>");
    }

    /* renamed from: c */
    private final void m33354c() {
        getWindow().setFlags(16777216, 16777216);
    }

    /* renamed from: a */
    public void mo72541a(C9981eb ebVar) {
        String str = null;
        if (C10263mq.m29881a((Object) ebVar == null ? null : ebVar.mo64509d(), (Object) "landscape")) {
            setRequestedOrientation(0);
            return;
        }
        if (ebVar != null) {
            str = ebVar.mo64509d();
        }
        if (C10263mq.m29881a((Object) str, (Object) "portrait")) {
            setRequestedOrientation(1);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f29817d) {
            C10329s sVar = C10329s.f25652a;
            C10329s.m29986b(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (this.f29817d) {
            C10329s sVar = C10329s.f25652a;
            C10329s.m29986b(false);
        }
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C9816aj ajVar = this.f29815b;
        if (ajVar != null) {
            ajVar.mo64309a(isFinishing());
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f29818e) {
            C9816aj ajVar = this.f29815b;
            if (ajVar != null) {
                ajVar.mo64325m();
            }
        } else {
            m33355d();
        }
        this.f29815b = null;
    }

    public void onBackPressed() {
        C9816aj ajVar = this.f29815b;
        if (ajVar == null ? true : ajVar.mo64326n()) {
            super.onBackPressed();
        }
    }

    /* renamed from: d */
    private final void m33355d() {
        C9981eb a = m33351a();
        if (a != null) {
            C10084hg hgVar = C10084hg.f25316a;
            C10084hg.m29312a((C10083hf) new C10082he(a.mo64503b()));
            C10084hg hgVar2 = C10084hg.f25316a;
            C10084hg.m29313a(a.mo64503b());
        }
    }
}
