package p401io.presage.common.profig.schedule;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.ogury.p377ed.internal.C10015fc;
import com.ogury.p377ed.internal.C10263mq;

/* renamed from: io.presage.common.profig.schedule.ProfigSyncIntentService */
public final class ProfigSyncIntentService extends IntentService {

    /* renamed from: a */
    public static final C12485a f29807a = new C12485a((byte) 0);

    public ProfigSyncIntentService() {
        super("ProfigService");
    }

    /* renamed from: io.presage.common.profig.schedule.ProfigSyncIntentService$a */
    public static final class C12485a {
        public /* synthetic */ C12485a(byte b) {
            this();
        }

        private C12485a() {
        }

        /* renamed from: a */
        public static void m33348a(Context context) {
            C10263mq.m29882b(context, "context");
            try {
                C10015fc.C10016a aVar = C10015fc.f25180a;
                Context applicationContext = context.getApplicationContext();
                C10263mq.m29879a((Object) applicationContext, "context.applicationContext");
                aVar.mo64648a(applicationContext).mo64647b();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onHandleIntent(Intent intent) {
        Context applicationContext = getApplicationContext();
        C10263mq.m29879a((Object) applicationContext, "applicationContext");
        C12485a.m33348a(applicationContext);
    }
}
