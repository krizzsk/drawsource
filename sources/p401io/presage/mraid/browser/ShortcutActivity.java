package p401io.presage.mraid.browser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.ogury.p377ed.internal.C10099hr;
import com.ogury.p377ed.internal.C10101hs;
import com.ogury.p377ed.internal.C10103ht;
import com.ogury.p377ed.internal.C10104hu;
import com.ogury.p377ed.internal.C10141iv;
import com.ogury.p377ed.internal.C10144ix;
import com.ogury.p377ed.internal.C10182ke;
import com.ogury.p377ed.internal.C10227lj;
import com.ogury.p377ed.internal.C10263mq;
import com.ogury.p377ed.internal.C10264mr;
import com.ogury.p377ed.internal.C9908cp;
import com.ogury.p377ed.internal.C9929dd;

/* renamed from: io.presage.mraid.browser.ShortcutActivity */
public class ShortcutActivity extends Activity implements C9929dd {

    /* renamed from: a */
    public static final C12488a f29819a = new C12488a((byte) 0);

    /* renamed from: b */
    private C10099hr.C10100a f29820b = C10099hr.f25354a;

    /* renamed from: c */
    private C10099hr f29821c;

    /* renamed from: io.presage.mraid.browser.ShortcutActivity$a */
    public static final class C12488a {
        public /* synthetic */ C12488a(byte b) {
            this();
        }

        private C12488a() {
        }

        /* renamed from: io.presage.mraid.browser.ShortcutActivity$a$a */
        static final class C12489a extends C10264mr implements C10227lj<C10182ke> {

            /* renamed from: a */
            final /* synthetic */ Context f29822a;

            /* renamed from: b */
            final /* synthetic */ C10144ix f29823b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12489a(Context context, C10144ix ixVar) {
                super(0);
                this.f29822a = context;
                this.f29823b = ixVar;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo64355a() {
                m33364b();
                return C10182ke.f25542a;
            }

            /* renamed from: b */
            private void m33364b() {
                new C10101hs(this.f29822a, this.f29823b).mo64853a();
            }
        }

        /* renamed from: a */
        public static void m33363a(Context context, C10144ix ixVar) {
            C10263mq.m29882b(context, "context");
            C10263mq.m29882b(ixVar, "shortcutIcon");
            C9908cp.C9909a aVar = C9908cp.f24951a;
            C9908cp.C9909a.m28615a(new C12489a(context, ixVar)).mo64445a((C10227lj<C10182ke>) C12490b.f29824a);
        }

        /* renamed from: io.presage.mraid.browser.ShortcutActivity$a$b */
        static final class C12490b extends C10264mr implements C10227lj<C10182ke> {

            /* renamed from: a */
            public static final C12490b f29824a = new C12490b();

            C12490b() {
                super(0);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo64355a() {
                return C10182ke.f25542a;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        Bundle extras;
        String string;
        Bundle extras2;
        super.onCreate(bundle);
        Context context = this;
        FrameLayout frameLayout = new FrameLayout(context);
        Intent intent = getIntent();
        String str2 = "";
        if (intent == null || (extras2 = intent.getExtras()) == null || (str = extras2.getString("args", str2)) == null) {
            str = str2;
        }
        Intent intent2 = getIntent();
        if (!(intent2 == null || (extras = intent2.getExtras()) == null || (string = extras.getString("identifier", str2)) == null)) {
            str2 = string;
        }
        Context applicationContext = getApplicationContext();
        C10263mq.m29879a((Object) applicationContext, "this.applicationContext");
        C10099hr a = C10099hr.C10100a.m29389a(new C10104hu(context), this, new C10141iv(applicationContext, new C10103ht(this), new C12491b(this)));
        this.f29821c = a;
        if (!a.mo64852a(str, str2, frameLayout)) {
            Toast.makeText(context, "Invalid shortcut", 0).show();
            finish();
            return;
        }
        setContentView(frameLayout);
    }

    /* renamed from: io.presage.mraid.browser.ShortcutActivity$b */
    static final class C12491b extends C10264mr implements C10227lj<C10182ke> {

        /* renamed from: a */
        final /* synthetic */ ShortcutActivity f29825a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12491b(ShortcutActivity shortcutActivity) {
            super(0);
            this.f29825a = shortcutActivity;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64355a() {
            m33367b();
            return C10182ke.f25542a;
        }

        /* renamed from: b */
        private void m33367b() {
            this.f29825a.finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C10099hr hrVar = this.f29821c;
        if (hrVar != null) {
            hrVar.mo64851a();
        }
    }
}
