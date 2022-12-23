package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzey implements zzep {
    private final zzfm zza = new zzfm();
    private zzfs zzb;
    private String zzc;
    private int zzd = 8000;
    private int zze = 8000;
    private boolean zzf;

    public final zzey zzb(boolean z) {
        this.zzf = true;
        return this;
    }

    public final zzey zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final zzey zzd(int i) {
        this.zze = i;
        return this;
    }

    public final zzey zze(zzfs zzfs) {
        this.zzb = zzfs;
        return this;
    }

    public final zzey zzf(String str) {
        this.zzc = str;
        return this;
    }

    /* renamed from: zzg */
    public final zzfd zza() {
        zzfd zzfd = new zzfd(this.zzc, this.zzd, this.zze, this.zzf, this.zza, (zzfov) null, false, (zzfc) null);
        zzfs zzfs = this.zzb;
        if (zzfs != null) {
            zzfd.zzf(zzfs);
        }
        return zzfd;
    }
}
