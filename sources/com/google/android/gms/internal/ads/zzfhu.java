package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfhu implements Runnable {
    public static Boolean zza;
    private final Context zzb;
    private final zzcfo zzc;
    private final zzfhz zzd = zzfic.zzc();
    private String zze;
    private int zzf;
    private final zzdtz zzg;
    private boolean zzh = false;
    private final zzect zzi;
    private final zzcah zzj;

    public zzfhu(Context context, zzcfo zzcfo, zzdtz zzdtz, zzect zzect, zzcah zzcah, byte[] bArr) {
        this.zzb = context;
        this.zzc = zzcfo;
        this.zzg = zzdtz;
        this.zzi = zzect;
        this.zzj = zzcah;
    }

    public static synchronized boolean zza() {
        boolean booleanValue;
        synchronized (zzfhu.class) {
            if (zza == null) {
                boolean z = false;
                if (!((Boolean) zzbji.zzb.zze()).booleanValue()) {
                    zza = false;
                } else {
                    if (Math.random() < ((Double) zzbji.zza.zze()).doubleValue()) {
                        z = true;
                    }
                    zza = Boolean.valueOf(z);
                }
            }
            booleanValue = zza.booleanValue();
        }
        return booleanValue;
    }

    private final synchronized void zzc() {
        if (!this.zzh) {
            this.zzh = true;
            if (zza()) {
                zzt.zzp();
                this.zze = zzs.zzo(this.zzb);
                this.zzf = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzb);
                long intValue = (long) ((Integer) zzay.zzc().zzb(zzbhz.zzho)).intValue();
                zzcfv.zzd.scheduleAtFixedRate(this, intValue, intValue, TimeUnit.MILLISECONDS);
            }
        }
    }

    private final synchronized void zzd() {
        try {
            new zzecs(this.zzb, this.zzc.zza, this.zzj, Binder.getCallingUid(), (byte[]) null).zza(new zzecq((String) zzay.zzc().zzb(zzbhz.zzhn), 60000, new HashMap(), ((zzfic) this.zzd.zzal()).zzaw(), "application/x-protobuf"));
            this.zzd.zzc();
        } catch (Exception e) {
            if (!(e instanceof zzdzl) || ((zzdzl) e).zza() != 3) {
                zzt.zzo().zzs(e, "CuiMonitor.sendCuiPing");
            } else {
                this.zzd.zzc();
            }
        }
    }

    public final synchronized void run() {
        if (zza()) {
            if (this.zzd.zza() != 0) {
                zzd();
            }
        }
    }

    public final synchronized void zzb(zzfhl zzfhl) {
        if (!this.zzh) {
            zzc();
        }
        if (zza()) {
            if (zzfhl != null) {
                if (this.zzd.zza() < ((Integer) zzay.zzc().zzb(zzbhz.zzhp)).intValue()) {
                    zzfhz zzfhz = this.zzd;
                    zzfia zza2 = zzfib.zza();
                    zzfhw zza3 = zzfhx.zza();
                    zza3.zzo(zzfhl.zzh());
                    zza3.zzl(zzfhl.zzg());
                    zza3.zze(zzfhl.zzb());
                    zza3.zzq(3);
                    zza3.zzk(this.zzc.zza);
                    zza3.zza(this.zze);
                    zza3.zzi(Build.VERSION.RELEASE);
                    zza3.zzm(Build.VERSION.SDK_INT);
                    zza3.zzp(zzfhl.zzj());
                    zza3.zzh(zzfhl.zza());
                    zza3.zzc((long) this.zzf);
                    zza3.zzn(zzfhl.zzi());
                    zza3.zzb(zzfhl.zzc());
                    zza3.zzd(zzfhl.zzd());
                    zza3.zzf(zzfhl.zze());
                    zza3.zzg(this.zzg.zzc(zzfhl.zze()));
                    zza3.zzj(zzfhl.zzf());
                    zza2.zza(zza3);
                    zzfhz.zzb(zza2);
                }
            }
        }
    }
}
