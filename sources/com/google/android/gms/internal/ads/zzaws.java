package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzaws implements zzayv {
    final /* synthetic */ zzawv zza;
    private final Uri zzb;
    private final zzayj zzc;
    private final zzawt zzd;
    private final zzazb zze;
    private final zzaub zzf;
    private volatile boolean zzg;
    private boolean zzh;
    private long zzi;
    /* access modifiers changed from: private */
    public long zzj;

    public zzaws(zzawv zzawv, Uri uri, zzayj zzayj, zzawt zzawt, zzazb zzazb) {
        this.zza = zzawv;
        if (uri != null) {
            this.zzb = uri;
            if (zzayj != null) {
                this.zzc = zzayj;
                if (zzawt != null) {
                    this.zzd = zzawt;
                    this.zze = zzazb;
                    this.zzf = new zzaub();
                    this.zzh = true;
                    this.zzj = -1;
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public final void zzb() {
        this.zzg = true;
    }

    public final void zzc() throws IOException, InterruptedException {
        zzatv zzatv;
        long j;
        while (!this.zzg) {
            int i = 0;
            try {
                long j2 = this.zzf.zza;
                zzayj zzayj = this.zzc;
                zzayl zzayl = r4;
                long j3 = j2;
                zzayl zzayl2 = new zzayl(this.zzb, (byte[]) null, j2, j2, -1, (String) null, 0);
                long zzb2 = zzayj.zzb(zzayl);
                this.zzj = zzb2;
                if (zzb2 != -1) {
                    j = j3;
                    zzb2 += j;
                    this.zzj = zzb2;
                } else {
                    j = j3;
                }
                zzatv = new zzatv(this.zzc, j, zzb2);
                try {
                    zzatw zzb3 = this.zzd.zzb(zzatv, this.zzc.zzc());
                    if (this.zzh) {
                        zzb3.zze(j, this.zzi);
                        this.zzh = false;
                    }
                    int i2 = 0;
                    long j4 = j;
                    while (true) {
                        if (i2 != 0) {
                            break;
                        }
                        try {
                            if (this.zzg) {
                                i2 = 0;
                                break;
                            }
                            this.zze.zza();
                            i2 = zzb3.zzf(zzatv, this.zzf);
                            if (zzatv.zzd() > this.zza.zzg + j4) {
                                j4 = zzatv.zzd();
                                this.zze.zzb();
                                zzawv zzawv = this.zza;
                                zzawv.zzm.post(zzawv.zzl);
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = i2;
                            if (!(i == 1 || zzatv == null)) {
                                this.zzf.zza = zzatv.zzd();
                            }
                            zzazo.zzm(this.zzc);
                            throw th;
                        }
                    }
                    if (i2 != 1) {
                        this.zzf.zza = zzatv.zzd();
                        i = i2;
                    }
                    zzazo.zzm(this.zzc);
                    if (i != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.zzf.zza = zzatv.zzd();
                    zzazo.zzm(this.zzc);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                zzatv = null;
                this.zzf.zza = zzatv.zzd();
                zzazo.zzm(this.zzc);
                throw th;
            }
        }
    }

    public final void zzd(long j, long j2) {
        this.zzf.zza = j;
        this.zzi = j2;
        this.zzh = true;
    }

    public final boolean zze() {
        return this.zzg;
    }
}
