package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ironsource.p199d.C6356a;
import org.json.JSONObject;

class BroadcastReceiverStrategy$1 extends BroadcastReceiver {

    /* renamed from: a */
    private /* synthetic */ C8329a f20291a;

    BroadcastReceiverStrategy$1(C8329a aVar) {
        this.f20291a = aVar;
    }

    public void onReceive(Context context, Intent intent) {
        String a = C6356a.m18974a(context);
        if (a.equals("none")) {
            this.f20291a.f20292a.mo56518a();
            return;
        }
        C8332d dVar = this.f20291a.f20292a;
        new JSONObject();
        dVar.mo56519a(a);
    }
}
