package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzjf {
    private final zzcf zza = new zzcf();
    private final zzch zzb = new zzch();
    private final zzkh zzc;
    private final Handler zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjc zzh;
    private zzjc zzi;
    private zzjc zzj;
    private int zzk;
    private Object zzl;
    private long zzm;

    public zzjf(zzkh zzkh, Handler handler) {
        this.zzc = zzkh;
        this.zzd = handler;
    }

    private final boolean zzA(zzci zzci, zzsa zzsa) {
        if (!zzC(zzsa)) {
            return false;
        }
        int i = zzci.zzn(zzsa.zza, this.zza).zzd;
        if (zzci.zze(i, this.zzb, 0).zzp == zzci.zza(zzsa.zza)) {
            return true;
        }
        return false;
    }

    private final boolean zzB(zzci zzci) {
        zzjc zzjc = this.zzh;
        if (zzjc == null) {
            return true;
        }
        int zza2 = zzci.zza(zzjc.zzb);
        while (true) {
            zza2 = zzci.zzi(zza2, this.zza, this.zzb, this.zzf, this.zzg);
            while (zzjc.zzg() != null && !zzjc.zzf.zzg) {
                zzjc = zzjc.zzg();
            }
            zzjc zzg2 = zzjc.zzg();
            if (zza2 == -1 || zzg2 == null || zzci.zza(zzg2.zzb) != zza2) {
                boolean zzm2 = zzm(zzjc);
                zzjc.zzf = zzg(zzci, zzjc.zzf);
            } else {
                zzjc = zzg2;
            }
        }
        boolean zzm22 = zzm(zzjc);
        zzjc.zzf = zzg(zzci, zzjc.zzf);
        if (!zzm22) {
            return true;
        }
        return false;
    }

    private static final boolean zzC(zzsa zzsa) {
        return !zzsa.zzb() && zzsa.zze == -1;
    }

    private final long zzs(zzci zzci, Object obj, int i) {
        zzci.zzn(obj, this.zza);
        this.zza.zzh(i);
        this.zza.zzj(i);
        return 0;
    }

    private final zzjd zzt(zzci zzci, zzjc zzjc, long j) {
        long j2;
        zzci zzci2 = zzci;
        zzjd zzjd = zzjc.zzf;
        long zze2 = (zzjc.zze() + zzjd.zze) - j;
        if (zzjd.zzg) {
            long j3 = 0;
            int zzi2 = zzci.zzi(zzci2.zza(zzjd.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzi2 == -1) {
                return null;
            }
            int i = zzci2.zzd(zzi2, this.zza, true).zzd;
            Object obj = this.zza.zzc;
            if (obj != null) {
                long j4 = zzjd.zza.zzd;
                if (zzci2.zze(i, this.zzb, 0).zzo == zzi2) {
                    Pair zzm2 = zzci.zzm(this.zzb, this.zza, i, -9223372036854775807L, Math.max(0, zze2));
                    if (zzm2 == null) {
                        return null;
                    }
                    obj = zzm2.first;
                    long longValue = ((Long) zzm2.second).longValue();
                    zzjc zzg2 = zzjc.zzg();
                    if (zzg2 == null || !zzg2.zzb.equals(obj)) {
                        j4 = this.zze;
                        this.zze = 1 + j4;
                    } else {
                        j4 = zzg2.zzf.zza.zzd;
                    }
                    j2 = longValue;
                    j3 = -9223372036854775807L;
                } else {
                    j2 = 0;
                }
                zzsa zzx = zzx(zzci, obj, j2, j4, this.zzb, this.zza);
                if (!(j3 == -9223372036854775807L || zzjd.zzc == -9223372036854775807L)) {
                    zzci2.zzn(zzjd.zza.zza, this.zza).zzb();
                }
                return zzu(zzci, zzx, j3, j2);
            }
            throw null;
        }
        zzsa zzsa = zzjd.zza;
        zzci2.zzn(zzsa.zza, this.zza);
        if (zzsa.zzb()) {
            int i2 = zzsa.zzb;
            if (this.zza.zza(i2) == -1) {
                return null;
            }
            int zzf2 = this.zza.zzf(i2, zzsa.zzc);
            if (zzf2 < 0) {
                return zzv(zzci, zzsa.zza, i2, zzf2, zzjd.zzc, zzsa.zzd);
            }
            long j5 = zzjd.zzc;
            if (j5 == -9223372036854775807L) {
                zzch zzch = this.zzb;
                zzcf zzcf = this.zza;
                Pair zzm3 = zzci.zzm(zzch, zzcf, zzcf.zzd, -9223372036854775807L, Math.max(0, zze2));
                if (zzm3 == null) {
                    return null;
                }
                j5 = ((Long) zzm3.second).longValue();
            }
            zzs(zzci2, zzsa.zza, zzsa.zzb);
            return zzw(zzci, zzsa.zza, Math.max(0, j5), zzjd.zzc, zzsa.zzd);
        }
        int zze3 = this.zza.zze(zzsa.zze);
        this.zza.zzl(zzsa.zze);
        if (zze3 != this.zza.zza(zzsa.zze)) {
            return zzv(zzci, zzsa.zza, zzsa.zze, zze3, zzjd.zze, zzsa.zzd);
        }
        zzs(zzci2, zzsa.zza, zzsa.zze);
        return zzw(zzci, zzsa.zza, 0, zzjd.zze, zzsa.zzd);
    }

    private final zzjd zzu(zzci zzci, zzsa zzsa, long j, long j2) {
        zzsa zzsa2 = zzsa;
        zzci zzci2 = zzci;
        zzci.zzn(zzsa2.zza, this.zza);
        if (zzsa.zzb()) {
            return zzv(zzci, zzsa2.zza, zzsa2.zzb, zzsa2.zzc, j, zzsa2.zzd);
        }
        return zzw(zzci, zzsa2.zza, j2, j, zzsa2.zzd);
    }

    private final zzjd zzv(zzci zzci, Object obj, int i, int i2, long j, long j2) {
        zzsa zzsa = new zzsa(obj, i, i2, j2);
        long zzg2 = zzci.zzn(zzsa.zza, this.zza).zzg(zzsa.zzb, zzsa.zzc);
        if (i2 == this.zza.zze(i)) {
            this.zza.zzi();
        }
        this.zza.zzl(zzsa.zzb);
        return new zzjd(zzsa, (zzg2 == -9223372036854775807L || zzg2 > 0) ? 0 : Math.max(0, -1 + zzg2), j, -9223372036854775807L, zzg2, false, false, false, false);
    }

    private final zzjd zzw(zzci zzci, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        zzci zzci2 = zzci;
        Object obj2 = obj;
        long j7 = j;
        zzci2.zzn(obj2, this.zza);
        int zzc2 = this.zza.zzc(j7);
        if (zzc2 == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzl(zzc2);
        }
        zzsa zzsa = new zzsa(obj2, j3, zzc2);
        boolean zzC = zzC(zzsa);
        boolean zzA = zzA(zzci2, zzsa);
        boolean zzz = zzz(zzci2, zzsa, zzC);
        if (zzc2 != -1) {
            this.zza.zzl(zzc2);
        }
        if (zzc2 != -1) {
            this.zza.zzh(zzc2);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = this.zza.zze;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && j7 >= j5) {
            j7 = Math.max(0, j5 - 1);
        }
        return new zzjd(zzsa, j7, j2, j6, j5, false, zzC, zzA, zzz);
    }

    private static zzsa zzx(zzci zzci, Object obj, long j, long j2, zzch zzch, zzcf zzcf) {
        zzci.zzn(obj, zzcf);
        zzci.zze(zzcf.zzd, zzch, 0);
        zzci.zza(obj);
        if (zzcf.zze == 0) {
            zzcf.zzb();
        }
        zzci.zzn(obj, zzcf);
        int zzd2 = zzcf.zzd(j);
        if (zzd2 == -1) {
            return new zzsa(obj, j2, zzcf.zzc(j));
        }
        return new zzsa(obj, zzd2, zzcf.zze(zzd2), j2);
    }

    private final void zzy() {
        zzsa zzsa;
        zzfrg zzi2 = zzfrj.zzi();
        for (zzjc zzjc = this.zzh; zzjc != null; zzjc = zzjc.zzg()) {
            zzi2.zze(zzjc.zzf.zza);
        }
        zzjc zzjc2 = this.zzi;
        if (zzjc2 == null) {
            zzsa = null;
        } else {
            zzsa = zzjc2.zzf.zza;
        }
        this.zzd.post(new zzje(this, zzi2, zzsa));
    }

    private final boolean zzz(zzci zzci, zzsa zzsa, boolean z) {
        int zza2 = zzci.zza(zzsa.zza);
        if (!zzci.zze(zzci.zzd(zza2, this.zza, false).zzd, this.zzb, 0).zzi) {
            if (zzci.zzi(zza2, this.zza, this.zzb, this.zzf, this.zzg) != -1 || !z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final zzjc zza() {
        zzjc zzjc = this.zzh;
        if (zzjc == null) {
            return null;
        }
        if (zzjc == this.zzi) {
            this.zzi = zzjc.zzg();
        }
        zzjc.zzn();
        int i = this.zzk - 1;
        this.zzk = i;
        if (i == 0) {
            this.zzj = null;
            zzjc zzjc2 = this.zzh;
            this.zzl = zzjc2.zzb;
            this.zzm = zzjc2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzjc zzb() {
        zzjc zzjc = this.zzi;
        boolean z = false;
        if (!(zzjc == null || zzjc.zzg() == null)) {
            z = true;
        }
        zzcw.zzf(z);
        this.zzi = this.zzi.zzg();
        zzy();
        return this.zzi;
    }

    public final zzjc zzc() {
        return this.zzj;
    }

    public final zzjc zzd() {
        return this.zzh;
    }

    public final zzjc zze() {
        return this.zzi;
    }

    public final zzjd zzf(long j, zzjn zzjn) {
        zzjc zzjc = this.zzj;
        if (zzjc != null) {
            return zzt(zzjn.zza, zzjc, j);
        }
        return zzu(zzjn.zza, zzjn.zzb, zzjn.zzc, zzjn.zzs);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzjd zzg(com.google.android.gms.internal.ads.zzci r19, com.google.android.gms.internal.ads.zzjd r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzsa r3 = r2.zza
            boolean r12 = zzC(r3)
            boolean r13 = r0.zzA(r1, r3)
            boolean r14 = r0.zzz(r1, r3, r12)
            com.google.android.gms.internal.ads.zzsa r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzcf r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0037
            int r1 = r3.zze
            if (r1 != r4) goto L_0x0030
            goto L_0x0037
        L_0x0030:
            com.google.android.gms.internal.ads.zzcf r9 = r0.zza
            r9.zzh(r1)
            r9 = r5
            goto L_0x0038
        L_0x0037:
            r9 = r7
        L_0x0038:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzcf r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzg(r5, r6)
        L_0x0048:
            r7 = r9
            r9 = r5
            goto L_0x0057
        L_0x004b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0052
            r7 = r5
            r9 = r7
            goto L_0x0057
        L_0x0052:
            com.google.android.gms.internal.ads.zzcf r1 = r0.zza
            long r5 = r1.zze
            goto L_0x0048
        L_0x0057:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L_0x0065
            com.google.android.gms.internal.ads.zzcf r1 = r0.zza
            int r4 = r3.zzb
            r1.zzl(r4)
            goto L_0x006e
        L_0x0065:
            int r1 = r3.zze
            if (r1 == r4) goto L_0x006e
            com.google.android.gms.internal.ads.zzcf r4 = r0.zza
            r4.zzl(r1)
        L_0x006e:
            com.google.android.gms.internal.ads.zzjd r15 = new com.google.android.gms.internal.ads.zzjd
            long r4 = r2.zzb
            long r1 = r2.zzc
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjf.zzg(com.google.android.gms.internal.ads.zzci, com.google.android.gms.internal.ads.zzjd):com.google.android.gms.internal.ads.zzjd");
    }

    public final zzsa zzh(zzci zzci, Object obj, long j) {
        long j2;
        int zza2;
        int i = zzci.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 == null || (zza2 = zzci.zza(obj2)) == -1 || zzci.zzd(zza2, this.zza, false).zzd != i) {
            zzjc zzjc = this.zzh;
            while (true) {
                if (zzjc == null) {
                    zzjc zzjc2 = this.zzh;
                    while (true) {
                        if (zzjc2 != null) {
                            int zza3 = zzci.zza(zzjc2.zzb);
                            if (zza3 != -1 && zzci.zzd(zza3, this.zza, false).zzd == i) {
                                j2 = zzjc2.zzf.zza.zzd;
                                break;
                            }
                            zzjc2 = zzjc2.zzg();
                        } else {
                            j2 = this.zze;
                            this.zze = 1 + j2;
                            if (this.zzh == null) {
                                this.zzl = obj;
                                this.zzm = j2;
                            }
                        }
                    }
                } else if (zzjc.zzb.equals(obj)) {
                    j2 = zzjc.zzf.zza.zzd;
                    break;
                } else {
                    zzjc = zzjc.zzg();
                }
            }
        } else {
            j2 = this.zzm;
        }
        long j3 = j2;
        zzci.zzn(obj, this.zza);
        zzci.zze(this.zza.zzd, this.zzb, 0);
        int zza4 = zzci.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzch zzch = this.zzb;
            if (zza4 < zzch.zzo) {
                return zzx(zzci, obj3, j, j3, zzch, this.zza);
            }
            zzci.zzd(zza4, this.zza, true);
            this.zza.zzb();
            zzcf zzcf = this.zza;
            if (zzcf.zzd(zzcf.zze) == -1 || (obj3 = this.zza.zzc) != null) {
                zza4--;
            } else {
                throw null;
            }
        }
    }

    public final void zzi() {
        if (this.zzk != 0) {
            zzjc zzjc = this.zzh;
            zzcw.zzb(zzjc);
            this.zzl = zzjc.zzb;
            this.zzm = zzjc.zzf.zza.zzd;
            while (zzjc != null) {
                zzjc.zzn();
                zzjc = zzjc.zzg();
            }
            this.zzh = null;
            this.zzj = null;
            this.zzi = null;
            this.zzk = 0;
            zzy();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(zzfrg zzfrg, zzsa zzsa) {
        this.zzc.zzT(zzfrg.zzg(), zzsa);
    }

    public final void zzk(long j) {
        zzjc zzjc = this.zzj;
        if (zzjc != null) {
            zzjc.zzm(j);
        }
    }

    public final boolean zzl(zzry zzry) {
        zzjc zzjc = this.zzj;
        return zzjc != null && zzjc.zza == zzry;
    }

    public final boolean zzm(zzjc zzjc) {
        boolean z = false;
        zzcw.zzf(zzjc != null);
        if (zzjc.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzjc;
        while (zzjc.zzg() != null) {
            zzjc = zzjc.zzg();
            if (zzjc == this.zzi) {
                this.zzi = this.zzh;
                z = true;
            }
            zzjc.zzn();
            this.zzk--;
        }
        this.zzj.zzo((zzjc) null);
        zzy();
        return z;
    }

    public final boolean zzn() {
        zzjc zzjc = this.zzj;
        if (zzjc == null) {
            return true;
        }
        if (zzjc.zzf.zzi || !zzjc.zzr() || this.zzj.zzf.zze == -9223372036854775807L) {
            return false;
        }
        return this.zzk < 100;
    }

    public final boolean zzo(zzci zzci, long j, long j2) {
        zzjd zzjd;
        long j3;
        boolean z;
        zzci zzci2 = zzci;
        zzjc zzjc = this.zzh;
        zzjc zzjc2 = null;
        while (zzjc != null) {
            zzjd zzjd2 = zzjc.zzf;
            if (zzjc2 == null) {
                zzjd = zzg(zzci2, zzjd2);
                long j4 = j;
            } else {
                zzjd zzt = zzt(zzci2, zzjc2, j);
                if (zzt == null) {
                    return !zzm(zzjc2);
                }
                if (zzjd2.zzb != zzt.zzb || !zzjd2.zza.equals(zzt.zza)) {
                    return !zzm(zzjc2);
                }
                zzjd = zzt;
            }
            zzjc.zzf = zzjd.zza(zzjd2.zzc);
            long j5 = zzjd2.zze;
            long j6 = zzjd.zze;
            if (j5 == -9223372036854775807L || j5 == j6) {
                zzjc2 = zzjc;
                zzjc = zzjc.zzg();
            } else {
                zzjc.zzq();
                long j7 = zzjd.zze;
                if (j7 == -9223372036854775807L) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = j7 + zzjc.zze();
                }
                if (zzjc == this.zzi) {
                    boolean z2 = zzjc.zzf.zzf;
                    if (j2 == Long.MIN_VALUE || j2 >= j3) {
                        z = true;
                        return zzm(zzjc) && !z;
                    }
                }
                z = false;
                if (zzm(zzjc)) {
                }
            }
        }
        return true;
    }

    public final boolean zzp(zzci zzci, int i) {
        this.zzf = i;
        return zzB(zzci);
    }

    public final boolean zzq(zzci zzci, boolean z) {
        this.zzg = z;
        return zzB(zzci);
    }

    public final zzjc zzr(zzju[] zzjuArr, zzvm zzvm, zzvv zzvv, zzjm zzjm, zzjd zzjd, zzvn zzvn) {
        long j;
        zzjc zzjc = this.zzj;
        if (zzjc == null) {
            j = 1000000000000L;
            zzjd zzjd2 = zzjd;
        } else {
            j = (zzjc.zze() + zzjc.zzf.zze) - zzjd.zzb;
        }
        zzjc zzjc2 = new zzjc(zzjuArr, j, zzvm, zzvv, zzjm, zzjd, zzvn, (byte[]) null);
        zzjc zzjc3 = this.zzj;
        if (zzjc3 != null) {
            zzjc3.zzo(zzjc2);
        } else {
            this.zzh = zzjc2;
            this.zzi = zzjc2;
        }
        this.zzl = null;
        this.zzj = zzjc2;
        this.zzk++;
        zzy();
        return zzjc2;
    }
}
