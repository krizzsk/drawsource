package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzepc implements zzetg {
    private static final Object zza = new Object();
    private final String zzb;
    private final String zzc;
    private final zzczk zzd;
    private final zzfdi zze;
    private final zzfcd zzf;
    private final zzg zzg = zzt.zzo().zzh();
    private final zzdwc zzh;

    public zzepc(String str, String str2, zzczk zzczk, zzfdi zzfdi, zzfcd zzfcd, zzdwc zzdwc) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzczk;
        this.zze = zzfdi;
        this.zzf = zzfcd;
        this.zzh = zzdwc;
    }

    public final int zza() {
        return 12;
    }

    public final zzfvl zzb() {
        Bundle bundle = new Bundle();
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzgw)).booleanValue()) {
            this.zzh.zza().put("seq_num", this.zzb);
        }
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzeB)).booleanValue()) {
            this.zzd.zzg(this.zzf.zzd);
            bundle.putAll(this.zze.zzb());
        }
        return zzfvc.zzi(new zzepb(this, bundle));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Bundle bundle, Bundle bundle2) {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzeB)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzeA)).booleanValue()) {
                synchronized (zza) {
                    this.zzd.zzg(this.zzf.zzd);
                    bundle2.putBundle("quality_signals", this.zze.zzb());
                }
            } else {
                this.zzd.zzg(this.zzf.zzd);
                bundle2.putBundle("quality_signals", this.zze.zzb());
            }
        }
        bundle2.putString("seq_num", this.zzb);
        if (!this.zzg.zzP()) {
            bundle2.putString("session_id", this.zzc);
        }
    }
}
