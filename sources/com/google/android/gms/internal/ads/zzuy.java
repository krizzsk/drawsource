package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzuy extends zzva implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzuy(int i, zzck zzck, int i2, zzut zzut, int i3, String str) {
        super(i, zzck, i2);
        zzfrj zzfrj;
        int i4;
        int i5 = 0;
        this.zzf = zzve.zzi(i3, false);
        int i6 = this.zzd.zze;
        int i7 = zzut.zzx;
        this.zzg = 1 == (i6 & 1);
        this.zzh = (i6 & 2) != 0;
        if (zzut.zzv.isEmpty()) {
            zzfrj = zzfrj.zzp("");
        } else {
            zzfrj = zzut.zzv;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= zzfrj.size()) {
                i8 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            boolean z = zzut.zzy;
            i4 = zzve.zza(this.zzd, (String) zzfrj.get(i8), false);
            if (i4 > 0) {
                break;
            }
            i8++;
        }
        this.zzi = i8;
        this.zzj = i4;
        int i9 = this.zzd.zzf;
        int i10 = zzut.zzw;
        this.zzk = Integer.bitCount(0);
        int i11 = this.zzd.zzf;
        this.zzm = false;
        this.zzl = zzve.zza(this.zzd, str, zzve.zzf(str) == null);
        boolean z2 = this.zzj > 0 || (zzut.zzv.isEmpty() && this.zzk > 0) || this.zzg || (this.zzh && this.zzl > 0);
        if (zzve.zzi(i3, zzut.zzP) && z2) {
            i5 = 1;
        }
        this.zze = i5;
    }

    /* renamed from: zza */
    public final int compareTo(zzuy zzuy) {
        zzfsr zzfsr;
        zzfqy zzd = zzfqy.zzj().zzd(this.zzf, zzuy.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzuy.zzi), zzfsr.zzc().zza()).zzb(this.zzj, zzuy.zzj).zzb(this.zzk, zzuy.zzk).zzd(this.zzg, zzuy.zzg);
        Boolean valueOf = Boolean.valueOf(this.zzh);
        Boolean valueOf2 = Boolean.valueOf(zzuy.zzh);
        if (this.zzj == 0) {
            zzfsr = zzfsr.zzc();
        } else {
            zzfsr = zzfsr.zzc().zza();
        }
        zzfqy zzb = zzd.zzc(valueOf, valueOf2, zzfsr).zzb(this.zzl, zzuy.zzl);
        if (this.zzk == 0) {
            boolean z = zzuy.zzm;
            zzb = zzb.zze(false, false);
        }
        return zzb.zza();
    }

    public final int zzb() {
        return this.zze;
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzva zzva) {
        zzuy zzuy = (zzuy) zzva;
        return false;
    }
}
