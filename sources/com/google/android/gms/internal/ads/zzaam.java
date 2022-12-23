package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaam implements zzyr {
    public static final zzyy zza = zzaal.zza;
    private final byte[] zzb;
    private final zzdy zzc;
    private final zzyz zzd;
    private zzyu zze;
    private zzzy zzf;
    private int zzg;
    private zzbl zzh;
    private zzze zzi;
    private int zzj;
    private int zzk;
    private zzaak zzl;
    private int zzm;
    private long zzn;

    public zzaam() {
        this(0);
    }

    public zzaam(int i) {
        this.zzb = new byte[42];
        this.zzc = new zzdy(new byte[32768], 0);
        this.zzd = new zzyz();
        this.zzg = 0;
    }

    private final long zze(zzdy zzdy, boolean z) {
        boolean z2;
        if (this.zzi != null) {
            int zzc2 = zzdy.zzc();
            while (zzc2 <= zzdy.zzd() - 16) {
                zzdy.zzF(zzc2);
                if (zzza.zzc(zzdy, this.zzi, this.zzk, this.zzd)) {
                    zzdy.zzF(zzc2);
                    return this.zzd.zza;
                }
                zzc2++;
            }
            if (z) {
                while (zzc2 <= zzdy.zzd() - this.zzj) {
                    zzdy.zzF(zzc2);
                    try {
                        z2 = zzza.zzc(zzdy, this.zzi, this.zzk, this.zzd);
                    } catch (IndexOutOfBoundsException unused) {
                        z2 = false;
                    }
                    if (zzdy.zzc() <= zzdy.zzd() && z2) {
                        zzdy.zzF(zzc2);
                        return this.zzd.zza;
                    }
                    zzc2++;
                }
                zzdy.zzF(zzdy.zzd());
                return -1;
            }
            zzdy.zzF(zzc2);
            return -1;
        }
        throw null;
    }

    private final void zzf() {
        long j = this.zzn;
        zzze zzze = this.zzi;
        int i = zzeg.zza;
        this.zzf.zzs((j * 1000000) / ((long) zzze.zze), 1, this.zzm, 0, (zzzx) null);
    }

    public final void zzb(zzyu zzyu) {
        this.zze = zzyu;
        this.zzf = zzyu.zzv(0, 1);
        zzyu.zzB();
    }

    public final boolean zzd(zzys zzys) throws IOException {
        zzzb.zza(zzys, false);
        zzdy zzdy = new zzdy(4);
        ((zzyl) zzys).zzm(zzdy.zzH(), 0, 4, false);
        if (zzdy.zzs() == 1716281667) {
            return true;
        }
        return false;
    }

    public final void zzc(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.zzg = 0;
        } else {
            zzaak zzaak = this.zzl;
            if (zzaak != null) {
                zzaak.zzd(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.zzn = j3;
        this.zzm = 0;
        this.zzc.zzC(0);
    }

    public final int zza(zzys zzys, zzzr zzzr) throws IOException {
        boolean zzl2;
        zzzu zzzu;
        zzys zzys2 = zzys;
        int i = this.zzg;
        boolean z = true;
        if (i == 0) {
            zzys.zzj();
            long zze2 = zzys.zze();
            zzbl zza2 = zzzb.zza(zzys2, true);
            ((zzyl) zzys2).zzo((int) (zzys.zze() - zze2), false);
            this.zzh = zza2;
            this.zzg = 1;
            return 0;
        } else if (i == 1) {
            ((zzyl) zzys2).zzm(this.zzb, 0, 42, false);
            zzys.zzj();
            this.zzg = 2;
            return 0;
        } else if (i == 2) {
            zzdy zzdy = new zzdy(4);
            ((zzyl) zzys2).zzn(zzdy.zzH(), 0, 4, false);
            if (zzdy.zzs() == 1716281667) {
                this.zzg = 3;
                return 0;
            }
            throw zzbp.zza("Failed to read FLAC stream marker.", (Throwable) null);
        } else if (i == 3) {
            zzze zzze = this.zzi;
            do {
                zzys.zzj();
                zzdx zzdx = new zzdx(new byte[4], 4);
                zzyl zzyl = (zzyl) zzys2;
                zzyl.zzm(zzdx.zza, 0, 4, false);
                zzl2 = zzdx.zzl();
                int zzc2 = zzdx.zzc(7);
                int zzc3 = zzdx.zzc(24) + 4;
                if (zzc2 == 0) {
                    byte[] bArr = new byte[38];
                    zzyl.zzn(bArr, 0, 38, false);
                    zzze = new zzze(bArr, 4);
                } else if (zzze == null) {
                    throw new IllegalArgumentException();
                } else if (zzc2 == 3) {
                    zzdy zzdy2 = new zzdy(zzc3);
                    zzyl.zzn(zzdy2.zzH(), 0, zzc3, false);
                    zzze = zzze.zzf(zzzb.zzb(zzdy2));
                } else if (zzc2 == 4) {
                    zzdy zzdy3 = new zzdy(zzc3);
                    zzyl.zzn(zzdy3.zzH(), 0, zzc3, false);
                    zzdy3.zzG(4);
                    zzze = zzze.zzg(Arrays.asList(zzaae.zzc(zzdy3, false, false).zzb));
                } else if (zzc2 == 6) {
                    zzdy zzdy4 = new zzdy(zzc3);
                    zzyl.zzn(zzdy4.zzH(), 0, zzc3, false);
                    zzdy4.zzG(4);
                    zzze = zzze.zze(zzfrj.zzp(zzabg.zzb(zzdy4)));
                } else {
                    zzyl.zzo(zzc3, false);
                }
                int i2 = zzeg.zza;
                this.zzi = zzze;
            } while (!zzl2);
            if (zzze != null) {
                this.zzj = Math.max(zzze.zzc, 6);
                this.zzf.zzk(this.zzi.zzc(this.zzb, this.zzh));
                this.zzg = 4;
                return 0;
            }
            throw null;
        } else if (i == 4) {
            zzys.zzj();
            zzdy zzdy5 = new zzdy(2);
            ((zzyl) zzys2).zzm(zzdy5.zzH(), 0, 2, false);
            int zzo = zzdy5.zzo();
            if ((zzo >> 2) == 16382) {
                zzys.zzj();
                this.zzk = zzo;
                zzyu zzyu = this.zze;
                int i3 = zzeg.zza;
                long zzf2 = zzys.zzf();
                long zzd2 = zzys.zzd();
                zzze zzze2 = this.zzi;
                if (zzze2 != null) {
                    if (zzze2.zzk != null) {
                        zzzu = new zzzc(zzze2, zzf2);
                    } else if (zzd2 == -1 || zzze2.zzj <= 0) {
                        zzzu = new zzzt(zzze2.zza(), 0);
                    } else {
                        zzaak zzaak = new zzaak(zzze2, this.zzk, zzf2, zzd2);
                        this.zzl = zzaak;
                        zzzu = zzaak.zzb();
                    }
                    zzyu.zzL(zzzu);
                    this.zzg = 5;
                    return 0;
                }
                throw null;
            }
            zzys.zzj();
            throw zzbp.zza("First frame does not start with sync code.", (Throwable) null);
        } else if (this.zzf != null) {
            zzze zzze3 = this.zzi;
            if (zzze3 != null) {
                zzaak zzaak2 = this.zzl;
                if (zzaak2 != null && zzaak2.zze()) {
                    return zzaak2.zza(zzys2, zzzr);
                }
                if (this.zzn == -1) {
                    this.zzn = zzza.zzb(zzys2, zzze3);
                    return 0;
                }
                zzdy zzdy6 = this.zzc;
                int zzd3 = zzdy6.zzd();
                if (zzd3 < 32768) {
                    int zza3 = zzys2.zza(zzdy6.zzH(), zzd3, 32768 - zzd3);
                    if (zza3 != -1) {
                        z = false;
                    }
                    if (!z) {
                        this.zzc.zzE(zzd3 + zza3);
                    } else if (this.zzc.zza() == 0) {
                        zzf();
                        return -1;
                    }
                } else {
                    z = false;
                }
                zzdy zzdy7 = this.zzc;
                int zzc4 = zzdy7.zzc();
                int i4 = this.zzm;
                int i5 = this.zzj;
                if (i4 < i5) {
                    zzdy7.zzG(Math.min(i5 - i4, zzdy7.zza()));
                }
                long zze3 = zze(this.zzc, z);
                zzdy zzdy8 = this.zzc;
                int zzc5 = zzdy8.zzc() - zzc4;
                zzdy8.zzF(zzc4);
                zzzw.zzb(this.zzf, this.zzc, zzc5);
                this.zzm += zzc5;
                if (zze3 != -1) {
                    zzf();
                    this.zzm = 0;
                    this.zzn = zze3;
                }
                zzdy zzdy9 = this.zzc;
                if (zzdy9.zza() >= 16) {
                    return 0;
                }
                int zza4 = zzdy9.zza();
                System.arraycopy(zzdy9.zzH(), zzdy9.zzc(), zzdy9.zzH(), 0, zza4);
                this.zzc.zzF(0);
                this.zzc.zzE(zza4);
                return 0;
            }
            throw null;
        } else {
            throw null;
        }
    }
}
