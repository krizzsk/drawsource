package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaau implements zzyr {
    private final zzdy zza = new zzdy(6);
    private zzyu zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzf = -1;
    private zzacr zzg;
    private zzys zzh;
    private zzaax zzi;
    private zzaeo zzj;

    private final int zze(zzys zzys) throws IOException {
        this.zza.zzC(2);
        ((zzyl) zzys).zzm(this.zza.zzH(), 0, 2, false);
        return this.zza.zzo();
    }

    private final void zzf() {
        zzg(new zzbk[0]);
        zzyu zzyu = this.zzb;
        if (zzyu != null) {
            zzyu.zzB();
            this.zzb.zzL(new zzzt(-9223372036854775807L, 0));
            this.zzc = 6;
            return;
        }
        throw null;
    }

    public final int zza(zzys zzys, zzzr zzzr) throws IOException {
        String zzv;
        zzaaw zza2;
        long j;
        zzys zzys2 = zzys;
        zzzr zzzr2 = zzzr;
        int i = this.zzc;
        if (i == 0) {
            this.zza.zzC(2);
            ((zzyl) zzys2).zzn(this.zza.zzH(), 0, 2, false);
            int zzo = this.zza.zzo();
            this.zzd = zzo;
            if (zzo == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                } else {
                    zzf();
                }
            } else if ((zzo < 65488 || zzo > 65497) && zzo != 65281) {
                this.zzc = 1;
            }
            return 0;
        } else if (i != 1) {
            zzacr zzacr = null;
            if (i == 2) {
                if (this.zzd == 65505) {
                    zzdy zzdy = new zzdy(this.zze);
                    ((zzyl) zzys2).zzn(zzdy.zzH(), 0, this.zze, false);
                    if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzdy.zzv(0)) && (zzv = zzdy.zzv(0)) != null) {
                        long zzd2 = zzys.zzd();
                        if (!(zzd2 == -1 || (zza2 = zzaba.zza(zzv)) == null || zza2.zzb.size() < 2)) {
                            long j2 = -1;
                            long j3 = -1;
                            long j4 = -1;
                            long j5 = -1;
                            boolean z = false;
                            for (int size = zza2.zzb.size() - 1; size >= 0; size--) {
                                zzaav zzaav = (zzaav) zza2.zzb.get(size);
                                z |= "video/mp4".equals(zzaav.zza);
                                if (size == 0) {
                                    zzd2 -= zzaav.zzd;
                                    j = 0;
                                } else {
                                    j = zzd2 - zzaav.zzc;
                                }
                                long j6 = zzd2;
                                zzd2 = j;
                                long j7 = j6;
                                if (z && zzd2 != j7) {
                                    j5 = j7 - zzd2;
                                    j4 = zzd2;
                                    z = false;
                                }
                                if (size == 0) {
                                    j3 = j7;
                                }
                                if (size == 0) {
                                    j2 = zzd2;
                                }
                            }
                            zzacr = (j4 == -1 || j5 == -1 || j2 == -1 || j3 == -1) ? null : new zzacr(j2, j3, zza2.zza, j4, j5);
                        }
                        this.zzg = zzacr;
                        if (zzacr != null) {
                            this.zzf = zzacr.zzd;
                        }
                    }
                } else {
                    ((zzyl) zzys2).zzo(this.zze, false);
                }
                this.zzc = 0;
                return 0;
            } else if (i == 4) {
                long zzf2 = zzys.zzf();
                long j8 = this.zzf;
                if (zzf2 == j8) {
                    if (!zzys2.zzm(this.zza.zzH(), 0, 1, true)) {
                        zzf();
                    } else {
                        zzys.zzj();
                        if (this.zzj == null) {
                            this.zzj = new zzaeo(0);
                        }
                        zzaax zzaax = new zzaax(zzys2, this.zzf);
                        this.zzi = zzaax;
                        if (this.zzj.zzd(zzaax)) {
                            zzaeo zzaeo = this.zzj;
                            long j9 = this.zzf;
                            zzyu zzyu = this.zzb;
                            if (zzyu != null) {
                                zzaeo.zzb(new zzaaz(j9, zzyu));
                                zzbk[] zzbkArr = new zzbk[1];
                                zzacr zzacr2 = this.zzg;
                                if (zzacr2 != null) {
                                    zzbkArr[0] = zzacr2;
                                    zzg(zzbkArr);
                                    this.zzc = 5;
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            zzf();
                        }
                    }
                    return 0;
                }
                zzzr2.zza = j8;
                return 1;
            } else if (i == 5) {
                if (this.zzi == null || zzys2 != this.zzh) {
                    this.zzh = zzys2;
                    this.zzi = new zzaax(zzys2, this.zzf);
                }
                zzaeo zzaeo2 = this.zzj;
                if (zzaeo2 != null) {
                    int zza3 = zzaeo2.zza(this.zzi, zzzr2);
                    if (zza3 == 1) {
                        zzzr2.zza += this.zzf;
                    }
                    return zza3;
                }
                throw null;
            } else if (i == 6) {
                return -1;
            } else {
                throw new IllegalStateException();
            }
        } else {
            this.zza.zzC(2);
            ((zzyl) zzys2).zzn(this.zza.zzH(), 0, 2, false);
            this.zze = this.zza.zzo() - 2;
            this.zzc = 2;
            return 0;
        }
    }

    public final void zzb(zzyu zzyu) {
        this.zzb = zzyu;
    }

    public final boolean zzd(zzys zzys) throws IOException {
        if (zze(zzys) != 65496) {
            return false;
        }
        int zze2 = zze(zzys);
        this.zzd = zze2;
        if (zze2 == 65504) {
            this.zza.zzC(2);
            zzyl zzyl = (zzyl) zzys;
            zzyl.zzm(this.zza.zzH(), 0, 2, false);
            zzyl.zzl(this.zza.zzo() - 2, false);
            zze2 = zze(zzys);
            this.zzd = zze2;
        }
        if (zze2 == 65505) {
            zzyl zzyl2 = (zzyl) zzys;
            zzyl2.zzl(2, false);
            this.zza.zzC(6);
            zzyl2.zzm(this.zza.zzH(), 0, 6, false);
            if (this.zza.zzs() == 1165519206 && this.zza.zzo() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzaeo zzaeo = this.zzj;
            if (zzaeo != null) {
                zzaeo.zzc(j, j2);
                return;
            }
            throw null;
        }
    }

    private final void zzg(zzbk... zzbkArr) {
        zzyu zzyu = this.zzb;
        if (zzyu != null) {
            zzzy zzv = zzyu.zzv(1024, 4);
            zzab zzab = new zzab();
            zzab.zzz(MimeTypes.IMAGE_JPEG);
            zzab.zzM(new zzbl(zzbkArr));
            zzv.zzk(zzab.zzY());
            return;
        }
        throw null;
    }
}
