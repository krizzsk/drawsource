package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzup extends zzva implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg = zzve.zzf(this.zzd.zzd);
    private final zzut zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    public zzup(int i, zzck zzck, int i2, zzut zzut, int i3, boolean z) {
        super(i, zzck, i2);
        int i4;
        int i5;
        int i6;
        boolean z2;
        this.zzh = zzut;
        int i7 = 0;
        this.zzi = zzve.zzi(i3, false);
        int i8 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i8 >= zzut.zzq.size()) {
                i5 = 0;
                i8 = Integer.MAX_VALUE;
                break;
            }
            i5 = zzve.zza(this.zzd, (String) zzut.zzq.get(i8), false);
            if (i5 > 0) {
                break;
            }
            i8++;
        }
        this.zzk = i8;
        this.zzj = i5;
        int i9 = this.zzd.zzf;
        int i10 = zzut.zzr;
        this.zzl = Integer.bitCount(0);
        zzad zzad = this.zzd;
        int i11 = zzad.zzf;
        this.zzm = true;
        this.zzp = 1 == (zzad.zze & 1);
        this.zzq = zzad.zzz;
        this.zzr = zzad.zzA;
        this.zzs = zzad.zzi;
        if (zzad.zzi != -1) {
            int i12 = zzut.zzt;
        }
        if (zzad.zzz != -1) {
            int i13 = zzut.zzs;
        }
        this.zzf = true;
        String[] zzae = zzeg.zzae();
        int i14 = 0;
        while (true) {
            if (i14 >= zzae.length) {
                i6 = 0;
                i14 = Integer.MAX_VALUE;
                break;
            }
            i6 = zzve.zza(this.zzd, zzae[i14], false);
            if (i6 > 0) {
                break;
            }
            i14++;
        }
        this.zzn = i14;
        this.zzo = i6;
        int i15 = 0;
        while (true) {
            if (i15 < zzut.zzu.size()) {
                String str = this.zzd.zzm;
                if (str != null && str.equals(zzut.zzu.get(i15))) {
                    i4 = i15;
                    break;
                }
                i15++;
            } else {
                break;
            }
        }
        this.zzt = i4;
        this.zzu = (i3 & 128) == 128;
        this.zzv = (i3 & 64) == 64;
        zzut zzut2 = this.zzh;
        if (zzve.zzi(i3, zzut2.zzP) && ((z2 = this.zzf) || zzut2.zzK)) {
            if (zzve.zzi(i3, false) && z2 && this.zzd.zzi != -1) {
                boolean z3 = zzut2.zzA;
                boolean z4 = zzut2.zzz;
                if (zzut2.zzR || !z) {
                    i7 = 2;
                }
            }
            i7 = 1;
        }
        this.zze = i7;
    }

    public final int zzb() {
        return this.zze;
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzva zzva) {
        zzup zzup = (zzup) zzva;
        zzut zzut = this.zzh;
        boolean z = zzut.zzN;
        zzad zzad = this.zzd;
        int i = zzad.zzz;
        if (i == -1) {
            return false;
        }
        zzad zzad2 = zzup.zzd;
        if (i != zzad2.zzz) {
            return false;
        }
        boolean z2 = zzut.zzL;
        String str = zzad.zzm;
        if (str == null || !TextUtils.equals(str, zzad2.zzm)) {
            return false;
        }
        zzut zzut2 = this.zzh;
        boolean z3 = zzut2.zzM;
        int i2 = this.zzd.zzA;
        if (i2 == -1 || i2 != zzup.zzd.zzA) {
            return false;
        }
        boolean z4 = zzut2.zzO;
        return this.zzu == zzup.zzu && this.zzv == zzup.zzv;
    }

    /* renamed from: zza */
    public final int compareTo(zzup zzup) {
        zzfsr zzfsr;
        if (!this.zzf || !this.zzi) {
            zzfsr = zzve.zzb.zza();
        } else {
            zzfsr = zzve.zzb;
        }
        zzfqy zzd = zzfqy.zzj().zzd(this.zzi, zzup.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzup.zzk), zzfsr.zzc().zza()).zzb(this.zzj, zzup.zzj).zzb(this.zzl, zzup.zzl).zzd(this.zzp, zzup.zzp);
        boolean z = zzup.zzm;
        zzfqy zzc = zzd.zzd(true, true).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzup.zzn), zzfsr.zzc().zza()).zzb(this.zzo, zzup.zzo).zzd(this.zzf, zzup.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzup.zzt), zzfsr.zzc().zza());
        Integer valueOf = Integer.valueOf(this.zzs);
        Integer valueOf2 = Integer.valueOf(zzup.zzs);
        boolean z2 = this.zzh.zzz;
        zzfqy zzc2 = zzc.zzc(valueOf, valueOf2, zzve.zzc).zzd(this.zzu, zzup.zzu).zzd(this.zzv, zzup.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzup.zzq), zzfsr).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzup.zzr), zzfsr);
        Integer valueOf3 = Integer.valueOf(this.zzs);
        Integer valueOf4 = Integer.valueOf(zzup.zzs);
        if (!zzeg.zzS(this.zzg, zzup.zzg)) {
            zzfsr = zzve.zzc;
        }
        return zzc2.zzc(valueOf3, valueOf4, zzfsr).zza();
    }
}
