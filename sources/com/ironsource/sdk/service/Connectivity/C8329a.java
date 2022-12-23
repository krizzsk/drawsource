package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.Connectivity.a */
public final class C8329a implements C8331c {

    /* renamed from: a */
    final C8332d f20292a;

    /* renamed from: b */
    private BroadcastReceiver f20293b = new BroadcastReceiverStrategy$1(this);

    public C8329a(C8332d dVar) {
        this.f20292a = dVar;
    }

    /* renamed from: a */
    public final void mo56767a() {
        this.f20293b = null;
    }

    /* renamed from: a */
    public final void mo56768a(Context context) {
        try {
            context.registerReceiver(this.f20293b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo56769b(Context context) {
        try {
            context.unregisterReceiver(this.f20293b);
        } catch (IllegalArgumentException unused) {
        } catch (Exception e) {
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e);
        }
    }

    /* renamed from: c */
    public final JSONObject mo56770c(Context context) {
        return new JSONObject();
    }
}
