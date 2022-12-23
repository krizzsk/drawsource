package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeao implements zzebm {
    /* access modifiers changed from: private */
    public static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdzp zzb;
    private final zzfvm zzc;
    private final zzfcd zzd;
    private final ScheduledExecutorService zze;
    /* access modifiers changed from: private */
    public final zzeds zzf;
    private final zzfhs zzg;
    private final Context zzh;

    zzeao(Context context, zzfcd zzfcd, zzdzp zzdzp, zzfvm zzfvm, ScheduledExecutorService scheduledExecutorService, zzeds zzeds, zzfhs zzfhs) {
        this.zzh = context;
        this.zzd = zzfcd;
        this.zzb = zzdzp;
        this.zzc = zzfvm;
        this.zze = scheduledExecutorService;
        this.zzf = zzeds;
        this.zzg = zzfhs;
    }

    public final zzfvl zzb(zzbzv zzbzv) {
        zzfvl zzb2 = this.zzb.zzb(zzbzv);
        zzfhh zza2 = zzfhg.zza(this.zzh, 11);
        zzfhr.zzd(zzb2, zza2);
        zzfvl zzn = zzfvc.zzn(zzb2, new zzeal(this), this.zzc);
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzex)).booleanValue()) {
            zzn = zzfvc.zzg(zzfvc.zzo(zzn, (long) ((Integer) zzay.zzc().zzb(zzbhz.zzey)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, zzeam.zza, zzcfv.zzf);
        }
        zzfhr.zza(zzn, this.zzg, zza2);
        zzfvc.zzr(zzn, new zzean(this), zzcfv.zzf);
        return zzn;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(InputStream inputStream) throws Exception {
        return zzfvc.zzi(new zzfbx(new zzfbu(this.zzd), zzfbw.zza(new InputStreamReader(inputStream))));
    }
}
