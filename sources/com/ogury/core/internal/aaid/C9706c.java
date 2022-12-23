package com.ogury.core.internal.aaid;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Looper;
import android.provider.Settings;
import com.ogury.core.internal.C9717ai;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.ogury.core.internal.aaid.c */
/* compiled from: AdvertisingIdClient.kt */
public final class C9706c {

    /* renamed from: a */
    public static final C9706c f24592a = new C9706c();

    private C9706c() {
    }

    /* renamed from: b */
    private static C9704a m28125b(Context context) {
        C9705b bVar = new C9705b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        ServiceConnection serviceConnection = bVar;
        if (!context.bindService(intent, serviceConnection, 1)) {
            return null;
        }
        try {
            C9707d dVar = new C9707d(bVar.mo64050a(), "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            return new C9704a(dVar.mo64054a(), dVar.mo64055a(true));
        } catch (Exception unused) {
            return null;
        } finally {
            context.unbindService(serviceConnection);
        }
    }

    /* renamed from: c */
    private static C9704a m28126c(Context context) {
        C9705b bVar = new C9705b();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        ServiceConnection serviceConnection = bVar;
        if (!context.bindService(intent, serviceConnection, 1)) {
            return null;
        }
        try {
            C9707d dVar = new C9707d(bVar.mo64050a(), "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            return new C9704a(dVar.mo64054a(), dVar.mo64055a(true));
        } catch (Exception unused) {
            return null;
        } finally {
            context.unbindService(serviceConnection);
        }
    }

    /* renamed from: d */
    private static C9704a m28127d(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            String string = Settings.Secure.getString(contentResolver, TapjoyConstants.TJC_ADVERTISING_ID);
            boolean z = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 0;
            if (string != null) {
                return new C9704a(string, z);
            }
            throw new IllegalStateException("Amazon Fire TV Ad Id is null".toString());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final C9704a mo64053a(Context context) throws Exception {
        C9717ai.m28145b(context, "context");
        if (!C9717ai.m28144a((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
            C9704a b = m28125b(context);
            if (b != null) {
                return b;
            }
            C9704a c = m28126c(context);
            if (c != null) {
                return c;
            }
            C9704a d = m28127d(context);
            if (d != null) {
                return d;
            }
            return null;
        }
        throw new IllegalStateException("Cannot be called from the main thread".toString());
    }
}
