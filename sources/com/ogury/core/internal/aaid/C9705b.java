package com.ogury.core.internal.aaid;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.ogury.core.internal.C9717ai;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.ogury.core.internal.aaid.b */
/* compiled from: AdvertisingConnection.kt */
public final class C9705b implements ServiceConnection {

    /* renamed from: a */
    private final LinkedBlockingQueue<IBinder> f24590a = new LinkedBlockingQueue<>(1);

    /* renamed from: b */
    private boolean f24591b;

    public final void onServiceDisconnected(ComponentName componentName) {
        C9717ai.m28145b(componentName, "name");
    }

    /* renamed from: a */
    public final IBinder mo64050a() throws InterruptedException {
        if (!this.f24591b) {
            this.f24591b = true;
            IBinder take = this.f24590a.take();
            if (take != null) {
                return take;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.IBinder");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C9717ai.m28145b(componentName, "name");
        C9717ai.m28145b(iBinder, NotificationCompat.CATEGORY_SERVICE);
        try {
            this.f24590a.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }
}
