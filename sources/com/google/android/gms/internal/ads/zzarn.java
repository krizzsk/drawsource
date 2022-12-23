package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzarn {
    public final zzawz zza;
    public final Object zzb;
    public final int zzc;
    public final zzaxl[] zzd;
    public final boolean[] zze;
    public final long zzf;
    public int zzg;
    public long zzh;
    public boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public zzarn zzl;
    public zzayf zzm;
    private final zzary[] zzn;
    private final zzarz[] zzo;
    private final zzaye zzp;
    private final zzaxb zzq;
    private zzayf zzr;
    private final zzcio zzs;

    public final long zza(long j, boolean z) {
        return zzb(j, false, new boolean[2]);
    }

    public final long zzb(long j, boolean z, boolean[] zArr) {
        zzayc zzayc = this.zzm.zzb;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= 2) {
                break;
            }
            boolean[] zArr2 = this.zze;
            if (z || !this.zzm.zza(this.zzr, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long zzB = this.zza.zzB(zzayc.zzb(), this.zze, this.zzd, zArr, j);
        this.zzr = this.zzm;
        this.zzk = false;
        int i2 = 0;
        while (true) {
            zzaxl[] zzaxlArr = this.zzd;
            if (i2 < 2) {
                if (zzaxlArr[i2] != null) {
                    zzayz.zze(zzayc.zza(i2) != null);
                    this.zzk = true;
                } else {
                    zzayz.zze(zzayc.zza(i2) == null);
                }
                i2++;
            } else {
                this.zzs.zzd(this.zzn, this.zzm.zza, zzayc);
                return zzB;
            }
        }
    }

    public final void zzc() {
        try {
            this.zzq.zzc(this.zza);
        } catch (RuntimeException e) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e);
        }
    }

    public final boolean zzd() {
        return this.zzj && (!this.zzk || this.zza.zzg() == Long.MIN_VALUE);
    }

    public final boolean zze() throws zzarf {
        zzayf zzc2 = this.zzp.zzc(this.zzo, this.zza.zzn());
        zzayf zzayf = this.zzr;
        if (zzayf != null) {
            int i = 0;
            while (i < 2) {
                if (zzc2.zza(zzayf, i)) {
                    i++;
                }
            }
            return false;
        }
        this.zzm = zzc2;
        return true;
    }

    public zzarn(zzary[] zzaryArr, zzarz[] zzarzArr, long j, zzaye zzaye, zzcio zzcio, zzaxb zzaxb, Object obj, int i, int i2, boolean z, long j2, byte[] bArr) {
        this.zzn = zzaryArr;
        this.zzo = zzarzArr;
        this.zzf = j;
        this.zzp = zzaye;
        this.zzs = zzcio;
        this.zzq = zzaxb;
        if (obj != null) {
            this.zzb = obj;
            this.zzc = i;
            this.zzg = i2;
            this.zzi = z;
            this.zzh = j2;
            this.zzd = new zzaxl[2];
            this.zze = new boolean[2];
            this.zza = zzaxb.zze(i2, zzcio.zzl());
            return;
        }
        throw null;
    }
}
