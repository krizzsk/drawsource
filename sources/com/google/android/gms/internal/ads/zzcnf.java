package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzd;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.ads.nonagon.signalgeneration.zzc;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzcnf implements zzcsm {
    @Nullable
    private static zzcnf zza;

    private static synchronized zzcnf zzC(Context context, @Nullable zzbua zzbua, int i, boolean z, int i2, zzcoh zzcoh) {
        synchronized (zzcnf.class) {
            zzcnf zzcnf = zza;
            if (zzcnf != null) {
                return zzcnf;
            }
            zzbhz.zzc(context);
            zzfcw zzd = zzfcw.zzd(context);
            zzcfo zzc = zzd.zzc(221908000, false, i2);
            zzd.zze(zzbua);
            zzcpr zzcpr = new zzcpr((zzcpq) null);
            zzcng zzcng = new zzcng();
            zzcng.zzd(zzc);
            zzcng.zzc(context);
            zzcpr.zzb(new zzcni(zzcng, (zzcnh) null));
            zzcpr.zzc(new zzcre(zzcoh, (byte[]) null));
            zzcnf zza2 = zzcpr.zza();
            zzt.zzo().zzr(context, zzc);
            zzt.zzc().zzi(context);
            zzt.zzp().zzj(context);
            zzt.zzp().zzi(context);
            zzd.zza(context);
            zzt.zzb().zzd(context);
            zzt.zzv().zzb(context);
            zzcdo.zzd(context);
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzfg)).booleanValue()) {
                if (!((Boolean) zzay.zzc().zzb(zzbhz.zzas)).booleanValue()) {
                    zzbdm zzbdm = new zzbdm(new zzbds(context));
                    zzedo zzedo = new zzedo(new zzedk(context), zza2.zzz());
                    zzt.zzp();
                    new zzeek(context, zzc, zzbdm, zzedo, UUID.randomUUID().toString(), zza2.zzx()).zzb(zzt.zzo().zzh().zzP());
                }
            }
            zza = zza2;
            return zza2;
        }
    }

    public static zzcnf zza(Context context, @Nullable zzbua zzbua, int i) {
        return zzC(context, zzbua, 221908000, false, i, new zzcoh());
    }

    public abstract Executor zzA();

    public abstract ScheduledExecutorService zzB();

    public abstract zzcrp zzb();

    public abstract zzcux zzc();

    public abstract zzcvi zzd();

    public abstract zzcwr zze();

    public abstract zzdei zzf();

    public abstract zzdkx zzg();

    public abstract zzdlt zzh();

    public abstract zzdsx zzi();

    public abstract zzdxp zzj();

    public abstract zzdzb zzk();

    public abstract zzefa zzl();

    public abstract zzc zzm();

    public abstract zzg zzn();

    public abstract zzaa zzo();

    public final zzety zzp(zzbzv zzbzv, int i) {
        return zzq(new zzevk(zzbzv, i));
    }

    /* access modifiers changed from: protected */
    public abstract zzety zzq(zzevk zzevk);

    public abstract zzewj zzr();

    public abstract zzexx zzs();

    public abstract zzezq zzt();

    public abstract zzfbe zzu();

    public abstract zzfcp zzv();

    public abstract zzfcz zzw();

    public abstract zzfgp zzx();

    public abstract zzfhu zzy();

    public abstract zzfvm zzz();
}
