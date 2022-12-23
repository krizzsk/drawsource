package com.ironsource.sdk.p290k;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.environment.C6363a;
import com.ironsource.sdk.p285g.C8299e;
import com.ironsource.sdk.p286h.C8305c;
import com.ironsource.sdk.utils.Logger;

/* renamed from: com.ironsource.sdk.k.a */
public final class C8321a extends Handler {

    /* renamed from: a */
    public C8326c f20271a;

    public C8321a(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        if (this.f20271a == null) {
            Logger.m23749i("DownloadHandler", "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            if (message.what != 1016) {
                this.f20271a.mo56467a((C8305c) message.obj, new C8299e(message.what, C6363a.C63641.m19002a(message.what)));
                return;
            }
            this.f20271a.mo56466a((C8305c) message.obj);
        } catch (Throwable th) {
            Logger.m23749i("DownloadHandler", "handleMessage | Got exception: " + th.getMessage());
            th.printStackTrace();
        }
    }
}
