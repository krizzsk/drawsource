package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgrj extends CustomTabsServiceConnection {
    private final WeakReference zza;

    public zzgrj(zzbix zzbix, byte[] bArr) {
        this.zza = new WeakReference(zzbix);
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbix zzbix = (zzbix) this.zza.get();
        if (zzbix != null) {
            zzbix.zzc(customTabsClient);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zzbix zzbix = (zzbix) this.zza.get();
        if (zzbix != null) {
            zzbix.zzd();
        }
    }
}
