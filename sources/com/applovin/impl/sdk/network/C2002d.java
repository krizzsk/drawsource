package com.applovin.impl.sdk.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.network.d */
public class C2002d extends BroadcastReceiver {

    /* renamed from: a */
    private final List<C2003a> f3846a = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.applovin.impl.sdk.network.d$a */
    public interface C2003a {
        /* renamed from: a */
        void mo14601a();

        /* renamed from: b */
        void mo14602b();
    }

    public C2002d(Context context) {
        context.getApplicationContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* renamed from: a */
    private static boolean m4661a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        Object obj = extras.get("networkInfo");
        if (obj instanceof NetworkInfo) {
            return ((NetworkInfo) obj).isConnected();
        }
        return false;
    }

    /* renamed from: a */
    public void mo14737a(C2003a aVar) {
        this.f3846a.add(aVar);
    }

    /* renamed from: b */
    public void mo14738b(C2003a aVar) {
        this.f3846a.remove(aVar);
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") && !isInitialStickyBroadcast()) {
            ArrayList arrayList = new ArrayList(this.f3846a);
            boolean a = m4661a(intent);
            Iterator it = arrayList.iterator();
            if (a) {
                while (it.hasNext()) {
                    ((C2003a) it.next()).mo14601a();
                }
                return;
            }
            while (it.hasNext()) {
                ((C2003a) it.next()).mo14602b();
            }
        }
    }
}
