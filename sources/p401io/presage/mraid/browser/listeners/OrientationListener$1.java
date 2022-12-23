package p401io.presage.mraid.browser.listeners;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ogury.p377ed.internal.C10113ia;
import com.ogury.p377ed.internal.C10263mq;

/* renamed from: io.presage.mraid.browser.listeners.OrientationListener$1 */
public final class OrientationListener$1 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C10113ia f29827a;

    public OrientationListener$1(C10113ia iaVar) {
        this.f29827a = iaVar;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(intent, SDKConstants.PARAM_INTENT);
        if (C10263mq.m29881a((Object) "android.intent.action.CONFIGURATION_CHANGED", (Object) intent.getAction()) && this.f29827a.f25404c != (i = context.getResources().getConfiguration().orientation)) {
            this.f29827a.f25404c = i;
            this.f29827a.m29466c();
        }
    }
}
