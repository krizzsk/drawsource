package com.google.android.gms.internal.ads;

import android.support.p003v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzavk {
    private static final int[] zza = {zzazo.zzg("isom"), zzazo.zzg("iso2"), zzazo.zzg("iso3"), zzazo.zzg("iso4"), zzazo.zzg("iso5"), zzazo.zzg("iso6"), zzazo.zzg("avc1"), zzazo.zzg("hvc1"), zzazo.zzg("hev1"), zzazo.zzg("mp41"), zzazo.zzg("mp42"), zzazo.zzg("3g2a"), zzazo.zzg("3g2b"), zzazo.zzg("3gr6"), zzazo.zzg("3gs6"), zzazo.zzg("3ge6"), zzazo.zzg("3gg6"), zzazo.zzg("M4V "), zzazo.zzg("M4A "), zzazo.zzg("f4v "), zzazo.zzg("kddi"), zzazo.zzg("M4VP"), zzazo.zzg("qt  "), zzazo.zzg("MSNV")};

    public static boolean zza(zzatv zzatv) throws IOException, InterruptedException {
        return zzc(zzatv, true);
    }

    public static boolean zzb(zzatv zzatv) throws IOException, InterruptedException {
        return zzc(zzatv, false);
    }

    private static boolean zzc(zzatv zzatv, boolean z) throws IOException, InterruptedException {
        boolean z2;
        zzatv zzatv2 = zzatv;
        long zzc = zzatv.zzc();
        if (zzc == -1 || zzc > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            zzc = 4096;
        }
        int i = (int) zzc;
        zzazh zzazh = new zzazh(64);
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= i) {
                break;
            }
            zzazh.zzs(8);
            zzatv.zzg(zzazh.zza, 0, 8, false);
            long zzm = zzazh.zzm();
            int zze = zzazh.zze();
            int i3 = 16;
            if (zzm == 1) {
                zzatv.zzg(zzazh.zza, 8, 8, false);
                zzazh.zzu(16);
                zzm = zzazh.zzn();
            } else {
                i3 = 8;
            }
            long j = (long) i3;
            if (zzm < j) {
                return false;
            }
            i2 += i3;
            if (zze != zzaut.zzE) {
                if (zze == zzaut.zzN || zze == zzaut.zzP) {
                    z2 = true;
                } else if ((((long) i2) + zzm) - j >= ((long) i)) {
                    break;
                } else {
                    int i4 = (int) (zzm - j);
                    i2 += i4;
                    if (zze == zzaut.zzd) {
                        if (i4 < 8) {
                            return false;
                        }
                        zzazh.zzs(i4);
                        zzatv.zzg(zzazh.zza, 0, i4, false);
                        int i5 = i4 >> 2;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                break;
                            }
                            if (i6 == 1) {
                                zzazh.zzw(4);
                            } else {
                                int zze2 = zzazh.zze();
                                if ((zze2 >>> 8) == zzazo.zzg("3gp")) {
                                    break;
                                }
                                int[] iArr = zza;
                                int length = iArr.length;
                                for (int i7 = 0; i7 < 24; i7++) {
                                    if (iArr[i7] == zze2) {
                                        break;
                                    }
                                }
                                continue;
                            }
                            i6++;
                        }
                        z3 = true;
                        if (!z3) {
                            return false;
                        }
                    } else if (i4 != 0) {
                        zzatv.zzf(i4, false);
                    }
                }
            }
        }
        z2 = false;
        if (!z3 || z != z2) {
            return false;
        }
        return true;
    }
}
