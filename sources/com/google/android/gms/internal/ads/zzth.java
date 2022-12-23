package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzth extends zzrb implements zzsy {
    private final zzbb zza;
    private final zzaw zzb;
    private final zzep zzc;
    private final zzpi zzd;
    private final int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;
    private zzfs zzj;
    private final zzte zzk;
    private final zzvz zzl;

    /* synthetic */ zzth(zzbb zzbb, zzep zzep, zzte zzte, zzpi zzpi, zzvz zzvz, int i, zztg zztg, byte[] bArr) {
        zzaw zzaw = zzbb.zzd;
        if (zzaw != null) {
            this.zzb = zzaw;
            this.zza = zzbb;
            this.zzc = zzep;
            this.zzk = zzte;
            this.zzd = zzpi;
            this.zzl = zzvz;
            this.zze = i;
            this.zzf = true;
            this.zzg = -9223372036854775807L;
            return;
        }
        throw null;
    }

    private final void zzv() {
        long j = this.zzg;
        boolean z = this.zzh;
        boolean z2 = this.zzi;
        zzbb zzbb = this.zza;
        zztu zztu = r1;
        zztu zztu2 = new zztu(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0, 0, z, false, false, (Object) null, zzbb, z2 ? zzbb.zzf : null);
        zzo(this.zzf ? new zztd(this, zztu) : zztu);
    }

    public final void zzB(zzry zzry) {
        ((zztc) zzry).zzK();
    }

    public final zzry zzD(zzsa zzsa, zzvv zzvv, long j) {
        zzeq zza2 = this.zzc.zza();
        zzfs zzfs = this.zzj;
        if (zzfs != null) {
            zza2.zzf(zzfs);
        }
        Uri uri = this.zzb.zza;
        zzte zzte = this.zzk;
        zzb();
        zzrd zzrd = new zzrd(zzte.zza);
        zzpi zzpi = this.zzd;
        zzpc zzc2 = zzc(zzsa);
        zzvz zzvz = this.zzl;
        zzsj zze2 = zze(zzsa);
        String str = this.zzb.zzf;
        return new zztc(uri, zza2, zzrd, zzpi, zzc2, zzvz, zze2, this, zzvv, (String) null, this.zze, (byte[]) null);
    }

    public final void zza(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.zzg;
        }
        if (this.zzf || this.zzg != j || this.zzh != z || this.zzi != z2) {
            this.zzg = j;
            this.zzh = z;
            this.zzi = z2;
            this.zzf = false;
            zzv();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzn(zzfs zzfs) {
        this.zzj = zzfs;
        if (Looper.myLooper() != null) {
            zzb();
            zzv();
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void zzq() {
    }

    public final void zzw() {
    }

    public final zzbb zzz() {
        return this.zza;
    }
}
