package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzccu extends zzcdo {
    private final Clock zzb;
    private final zzccu zzc = this;
    private final zzgrh zzd;
    private final zzgrh zze;
    private final zzgrh zzf;
    private final zzgrh zzg;
    private final zzgrh zzh;
    private final zzgrh zzi;
    private final zzgrh zzj;
    private final zzgrh zzk;

    /* synthetic */ zzccu(Context context, Clock clock, zzg zzg2, zzcdn zzcdn, zzcct zzcct) {
        this.zzb = clock;
        this.zzd = zzgqv.zza(context);
        this.zze = zzgqv.zza(zzg2);
        zzgqu zza = zzgqv.zza(zzcdn);
        this.zzf = zza;
        this.zzg = zzgqt.zzc(new zzccm(this.zzd, this.zze, zza));
        zzgqu zza2 = zzgqv.zza(clock);
        this.zzh = zza2;
        zzgrh zzc2 = zzgqt.zzc(new zzcco(zza2, this.zze, this.zzf));
        this.zzi = zzc2;
        zzccq zzccq = new zzccq(this.zzh, zzc2);
        this.zzj = zzccq;
        this.zzk = zzgqt.zzc(new zzcdt(this.zzd, zzccq));
    }

    /* access modifiers changed from: package-private */
    public final zzccl zza() {
        return (zzccl) this.zzg.zzb();
    }

    /* access modifiers changed from: package-private */
    public final zzccp zzb() {
        return new zzccp(this.zzb, (zzccn) this.zzi.zzb());
    }

    /* access modifiers changed from: package-private */
    public final zzcds zzc() {
        return (zzcds) this.zzk.zzb();
    }
}
