package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzetv implements zzetg {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final zzcei zze;

    public zzetv(zzcei zzcei, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, byte[] bArr) {
        this.zze = zzcei;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
    }

    public final int zza() {
        return 40;
    }

    public final zzfvl zzb() {
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzaO)).booleanValue()) {
            return zzfvc.zzh(new Exception("Did not ad Ad ID into query param."));
        }
        return zzfvc.zzf((zzfut) zzfvc.zzo(zzfvc.zzm(zzfut.zzv(this.zze.zza(this.zza, this.zzd)), zzett.zza, this.zzc), ((Long) zzay.zzc().zzb(zzbhz.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzetu(this), this.zzc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzetw zzc(Throwable th) {
        String str;
        zzaw.zzb();
        ContentResolver contentResolver = this.zza.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Settings.Secure.getString(contentResolver, "android_id");
        }
        return new zzetw((AdvertisingIdClient.Info) null, str);
    }
}
