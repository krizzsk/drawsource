package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdhf {
    private final Set zza;
    private final Set zzb;
    private final Set zzc;
    private final Set zzd;
    private final Set zze;
    private final Set zzf;
    private final Set zzg;
    private final Set zzh;
    private final Set zzi;
    private final Set zzj;
    private final Set zzk;
    private final Set zzl;
    private final Set zzm;
    private final Set zzn;
    private final zzeyx zzo;
    private zzdbv zzp;
    private zzeiq zzq;

    /* synthetic */ zzdhf(zzdhd zzdhd, zzdhe zzdhe) {
        this.zza = zzdhd.zzc;
        this.zzb = zzdhd.zzd;
        this.zzd = zzdhd.zzf;
        this.zze = zzdhd.zzg;
        this.zzc = zzdhd.zze;
        this.zzf = zzdhd.zzh;
        this.zzg = zzdhd.zza;
        this.zzh = zzdhd.zzi;
        this.zzi = zzdhd.zzl;
        this.zzj = zzdhd.zzj;
        this.zzk = zzdhd.zzk;
        this.zzl = zzdhd.zzm;
        this.zzo = zzdhd.zzo;
        this.zzm = zzdhd.zzn;
        this.zzn = zzdhd.zzb;
    }

    public final zzdbv zza(Set set) {
        if (this.zzp == null) {
            this.zzp = new zzdbv(set);
        }
        return this.zzp;
    }

    public final zzeiq zzb(Clock clock, zzeir zzeir, zzefi zzefi, zzfii zzfii) {
        if (this.zzq == null) {
            this.zzq = new zzeiq(clock, zzeir, zzefi, zzfii);
        }
        return this.zzq;
    }

    public final zzeyx zzc() {
        return this.zzo;
    }

    public final Set zzd() {
        return this.zzm;
    }

    public final Set zze() {
        return this.zza;
    }

    public final Set zzf() {
        return this.zzh;
    }

    public final Set zzg() {
        return this.zzi;
    }

    public final Set zzh() {
        return this.zzd;
    }

    public final Set zzi() {
        return this.zzc;
    }

    public final Set zzj() {
        return this.zzf;
    }

    /* access modifiers changed from: package-private */
    public final Set zzk() {
        return this.zzg;
    }

    public final Set zzl() {
        return this.zzj;
    }

    public final Set zzm() {
        return this.zze;
    }

    public final Set zzn() {
        return this.zzl;
    }

    public final Set zzo() {
        return this.zzn;
    }

    public final Set zzp() {
        return this.zzk;
    }

    /* access modifiers changed from: package-private */
    public final Set zzq() {
        return this.zzb;
    }
}
