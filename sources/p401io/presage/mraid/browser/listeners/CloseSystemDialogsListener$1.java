package p401io.presage.mraid.browser.listeners;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ogury.p377ed.internal.C10110hy;
import com.ogury.p377ed.internal.C10263mq;

/* renamed from: io.presage.mraid.browser.listeners.CloseSystemDialogsListener$1 */
public final class CloseSystemDialogsListener$1 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C10110hy f29826a;

    public CloseSystemDialogsListener$1(C10110hy hyVar) {
        this.f29826a = hyVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(intent, SDKConstants.PARAM_INTENT);
        if (this.f29826a.f25391b.mo64848d()) {
            this.f29826a.m29445c();
        }
    }
}
