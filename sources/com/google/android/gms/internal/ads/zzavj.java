package com.google.android.gms.internal.ads;

import android.support.p003v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzavj implements zzatw, zzaud {
    public static final zzaty zza = new zzavh();
    private static final int zzb = zzazo.zzg("qt  ");
    private final zzazh zzc = new zzazh(zzazf.zza);
    private final zzazh zzd = new zzazh(4);
    private final zzazh zze = new zzazh(16);
    private final Stack zzf = new Stack();
    private int zzg;
    private int zzh;
    private long zzi;
    private int zzj;
    private zzazh zzk;
    private int zzl;
    private int zzm;
    private zzatx zzn;
    private zzavi[] zzo;
    private long zzp;
    private boolean zzq;

    private final void zzh() {
        this.zzg = 0;
        this.zzj = 0;
    }

    private final void zzi(long j) throws zzarw {
        zzawe zzawe;
        zzawe zzawe2;
        zzaua zzaua;
        zzavl zza2;
        while (!this.zzf.isEmpty() && ((zzaur) this.zzf.peek()).zza == j) {
            zzaur zzaur = (zzaur) this.zzf.pop();
            if (zzaur.zzaR == zzaut.zzE) {
                ArrayList arrayList = new ArrayList();
                zzaua zzaua2 = new zzaua();
                zzaus zzb2 = zzaur.zzb(zzaut.zzaC);
                if (zzb2 != null) {
                    zzawe = zzava.zzc(zzb2, this.zzq);
                    if (zzawe != null) {
                        zzaua2.zzb(zzawe);
                    }
                } else {
                    zzawe = null;
                }
                long j2 = -9223372036854775807L;
                long j3 = Long.MAX_VALUE;
                int i = 0;
                while (i < zzaur.zzc.size()) {
                    zzaur zzaur2 = (zzaur) zzaur.zzc.get(i);
                    if (zzaur2.zzaR == zzaut.zzG && (zza2 = zzava.zza(zzaur2, zzaur.zzb(zzaut.zzF), -9223372036854775807L, (zzats) null, this.zzq)) != null) {
                        zzavo zzb3 = zzava.zzb(zza2, zzaur2.zza(zzaut.zzH).zza(zzaut.zzI).zza(zzaut.zzJ), zzaua2);
                        if (zzb3.zza != 0) {
                            zzavi zzavi = new zzavi(zza2, zzb3, this.zzn.zzbi(i, zza2.zzb));
                            zzart zze2 = zza2.zzf.zze(zzb3.zzd + 30);
                            if (zza2.zzb == 1) {
                                if (zzaua2.zza()) {
                                    zze2 = zze2.zzd(zzaua2.zzb, zzaua2.zzc);
                                }
                                if (zzawe != null) {
                                    zze2 = zze2.zzf(zzawe);
                                }
                            }
                            zzavi.zzc.zza(zze2);
                            zzaua = zzaua2;
                            zzawe2 = zzawe;
                            long max = Math.max(j2, zza2.zze);
                            arrayList.add(zzavi);
                            long j4 = zzb3.zzb[0];
                            if (j4 < j3) {
                                j2 = max;
                                j3 = j4;
                            } else {
                                j2 = max;
                            }
                            i++;
                            zzaua2 = zzaua;
                            zzawe = zzawe2;
                        }
                    }
                    zzaua = zzaua2;
                    zzawe2 = zzawe;
                    i++;
                    zzaua2 = zzaua;
                    zzawe = zzawe2;
                }
                this.zzp = j2;
                this.zzo = (zzavi[]) arrayList.toArray(new zzavi[arrayList.size()]);
                this.zzn.zzb();
                this.zzn.zzc(this);
                this.zzf.clear();
                this.zzg = 2;
            } else if (!this.zzf.isEmpty()) {
                ((zzaur) this.zzf.peek()).zzc(zzaur);
            }
        }
        if (this.zzg != 2) {
            zzh();
        }
    }

    public final long zza() {
        return this.zzp;
    }

    public final long zzb(long j) {
        long j2 = Long.MAX_VALUE;
        for (zzavi zzavi : this.zzo) {
            zzavo zzavo = zzavi.zzb;
            int zza2 = zzavo.zza(j);
            if (zza2 == -1) {
                zza2 = zzavo.zzb(j);
            }
            long j3 = zzavo.zzb[zza2];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    public final boolean zzc() {
        return true;
    }

    public final void zzd(zzatx zzatx) {
        this.zzn = zzatx;
    }

    public final void zze(long j, long j2) {
        this.zzf.clear();
        this.zzj = 0;
        this.zzl = 0;
        this.zzm = 0;
        if (j == 0) {
            zzh();
            return;
        }
        zzavi[] zzaviArr = this.zzo;
        if (zzaviArr != null) {
            for (zzavi zzavi : zzaviArr) {
                zzavo zzavo = zzavi.zzb;
                int zza2 = zzavo.zza(j2);
                if (zza2 == -1) {
                    zza2 = zzavo.zzb(j2);
                }
                zzavi.zzd = zza2;
            }
        }
    }

    public final boolean zzg(zzatv zzatv) throws IOException, InterruptedException {
        return zzavk.zzb(zzatv);
    }

    public final int zzf(zzatv zzatv, zzaub zzaub) throws IOException, InterruptedException {
        zzavi[] zzaviArr;
        boolean z;
        boolean z2;
        zzatv zzatv2 = zzatv;
        zzaub zzaub2 = zzaub;
        while (true) {
            int i = this.zzg;
            if (i == 0) {
                if (this.zzj == 0) {
                    if (!zzatv2.zzh(this.zze.zza, 0, 8, true)) {
                        return -1;
                    }
                    this.zzj = 8;
                    this.zze.zzv(0);
                    this.zzi = this.zze.zzm();
                    this.zzh = this.zze.zze();
                }
                if (this.zzi == 1) {
                    zzatv2.zzh(this.zze.zza, 8, 8, false);
                    this.zzj += 8;
                    this.zzi = this.zze.zzn();
                }
                int i2 = this.zzh;
                if (i2 == zzaut.zzE || i2 == zzaut.zzG || i2 == zzaut.zzH || i2 == zzaut.zzI || i2 == zzaut.zzJ || i2 == zzaut.zzS) {
                    long zzd2 = (zzatv.zzd() + this.zzi) - ((long) this.zzj);
                    this.zzf.add(new zzaur(this.zzh, zzd2));
                    if (this.zzi == ((long) this.zzj)) {
                        zzi(zzd2);
                    } else {
                        zzh();
                    }
                } else {
                    int i3 = this.zzh;
                    if (i3 == zzaut.zzU || i3 == zzaut.zzF || i3 == zzaut.zzV || i3 == zzaut.zzW || i3 == zzaut.zzao || i3 == zzaut.zzap || i3 == zzaut.zzaq || i3 == zzaut.zzT || i3 == zzaut.zzar || i3 == zzaut.zzas || i3 == zzaut.zzat || i3 == zzaut.zzau || i3 == zzaut.zzav || i3 == zzaut.zzR || i3 == zzaut.zzd || i3 == zzaut.zzaC) {
                        zzayz.zze(this.zzj == 8);
                        zzayz.zze(this.zzi <= 2147483647L);
                        this.zzk = new zzazh((int) this.zzi);
                        System.arraycopy(this.zze.zza, 0, this.zzk.zza, 0, 8);
                    } else {
                        this.zzk = null;
                    }
                    this.zzg = 1;
                }
            } else if (i != 1) {
                long j = Long.MAX_VALUE;
                int i4 = -1;
                int i5 = 0;
                while (true) {
                    zzaviArr = this.zzo;
                    if (i5 >= zzaviArr.length) {
                        break;
                    }
                    zzavi zzavi = zzaviArr[i5];
                    int i6 = zzavi.zzd;
                    zzavo zzavo = zzavi.zzb;
                    if (i6 != zzavo.zza) {
                        long j2 = zzavo.zzb[i6];
                        if (j2 < j) {
                            i4 = i5;
                            j = j2;
                        }
                    }
                    i5++;
                }
                if (i4 == -1) {
                    return -1;
                }
                zzavi zzavi2 = zzaviArr[i4];
                zzauf zzauf = zzavi2.zzc;
                int i7 = zzavi2.zzd;
                zzavo zzavo2 = zzavi2.zzb;
                long j3 = zzavo2.zzb[i7];
                int i8 = zzavo2.zzc[i7];
                if (zzavi2.zza.zzg == 1) {
                    j3 += 8;
                    i8 -= 8;
                }
                long zzd3 = (j3 - zzatv.zzd()) + ((long) this.zzl);
                if (zzd3 < 0 || zzd3 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                    zzaub2.zza = j3;
                    return 1;
                }
                int i9 = (int) zzd3;
                boolean z3 = false;
                zzatv2.zzi(i9, false);
                int i10 = zzavi2.zza.zzk;
                if (i10 == 0) {
                    while (true) {
                        int i11 = this.zzl;
                        if (i11 >= i8) {
                            break;
                        }
                        int zzd4 = zzauf.zzd(zzatv2, i8 - i11, false);
                        this.zzl += zzd4;
                        this.zzm -= zzd4;
                    }
                } else {
                    byte[] bArr = this.zzd.zza;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    int i12 = 4 - i10;
                    while (this.zzl < i8) {
                        int i13 = this.zzm;
                        if (i13 == 0) {
                            zzatv2.zzh(this.zzd.zza, i12, i10, z3);
                            this.zzd.zzv(z3 ? 1 : 0);
                            this.zzm = this.zzd.zzi();
                            this.zzc.zzv(z3);
                            zzauf.zzb(this.zzc, 4);
                            this.zzl += 4;
                            i8 += i12;
                        } else {
                            int zzd5 = zzauf.zzd(zzatv2, i13, z3);
                            this.zzl += zzd5;
                            this.zzm -= zzd5;
                            z3 = false;
                        }
                    }
                }
                int i14 = i8;
                zzavo zzavo3 = zzavi2.zzb;
                zzauf.zzc(zzavo3.zze[i7], zzavo3.zzf[i7], i14, 0, (zzaue) null);
                zzavi2.zzd++;
                this.zzl = 0;
                this.zzm = 0;
                return 0;
            } else {
                long j4 = this.zzi;
                int i15 = this.zzj;
                long j5 = j4 - ((long) i15);
                long zzd6 = zzatv.zzd() + j5;
                zzazh zzazh = this.zzk;
                if (zzazh != null) {
                    zzatv2.zzh(zzazh.zza, i15, (int) j5, false);
                    if (this.zzh == zzaut.zzd) {
                        zzazh zzazh2 = this.zzk;
                        zzazh2.zzv(8);
                        if (zzazh2.zze() == zzb) {
                            z2 = true;
                        } else {
                            zzazh2.zzw(4);
                            while (true) {
                                if (zzazh2.zza() > 0) {
                                    if (zzazh2.zze() == zzb) {
                                        break;
                                    }
                                } else {
                                    z2 = false;
                                    break;
                                }
                            }
                            z2 = true;
                        }
                        this.zzq = z2;
                    } else if (!this.zzf.isEmpty()) {
                        ((zzaur) this.zzf.peek()).zzd(new zzaus(this.zzh, this.zzk));
                    }
                } else if (j5 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                    zzatv2.zzi((int) j5, false);
                } else {
                    zzaub2.zza = zzatv.zzd() + j5;
                    z = true;
                    zzi(zzd6);
                    if (z && this.zzg != 2) {
                        return 1;
                    }
                }
                z = false;
                zzi(zzd6);
                return 1;
            }
        }
    }
}
