package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzarm implements zzarj {
    private final zzary[] zza;
    private final zzaye zzb;
    private final zzayc zzc;
    private final Handler zzd;
    private final zzarr zze;
    private final CopyOnWriteArraySet zzf;
    private final zzasd zzg;
    private final zzasc zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private zzase zzo;
    private Object zzp;
    private zzaxq zzq;
    private zzayc zzr;
    private zzarx zzs;
    private zzaro zzt;
    private long zzu;

    public zzarm(zzary[] zzaryArr, zzaye zzaye, zzcio zzcio, byte[] bArr) {
        zzaye zzaye2 = zzaye;
        String str = zzazo.zze;
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.2 [" + str + "]");
        this.zza = zzaryArr;
        if (zzaye2 != null) {
            this.zzb = zzaye2;
            this.zzj = false;
            this.zzk = 1;
            this.zzf = new CopyOnWriteArraySet();
            this.zzc = new zzayc(new zzaxu[2], (byte[]) null);
            this.zzo = zzase.zza;
            this.zzg = new zzasd();
            this.zzh = new zzasc();
            this.zzq = zzaxq.zza;
            this.zzr = this.zzc;
            this.zzs = zzarx.zza;
            this.zzd = new zzarl(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
            this.zzt = new zzaro(0, 0);
            this.zze = new zzarr(zzaryArr, zzaye, zzcio, this.zzj, 0, this.zzd, this.zzt, this, (byte[]) null);
            return;
        }
        throw null;
    }

    public final int zza() {
        return this.zzk;
    }

    public final long zzb() {
        if (this.zzo.zzh() || this.zzl > 0) {
            return this.zzu;
        }
        this.zzo.zzd(this.zzt.zza, this.zzh, false);
        return zzare.zzb(0) + zzare.zzb(this.zzt.zzd);
    }

    public final long zzc() {
        if (this.zzo.zzh() || this.zzl > 0) {
            return this.zzu;
        }
        this.zzo.zzd(this.zzt.zza, this.zzh, false);
        return zzare.zzb(0) + zzare.zzb(this.zzt.zzc);
    }

    public final long zzd() {
        if (this.zzo.zzh()) {
            return -9223372036854775807L;
        }
        zzase zzase = this.zzo;
        zzs();
        return zzare.zzb(zzase.zzg(0, this.zzg, false).zza);
    }

    public final void zze(zzarg zzarg) {
        this.zzf.add(zzarg);
    }

    public final void zzf(zzari... zzariArr) {
        if (!this.zze.zzr()) {
            this.zze.zza(zzariArr);
        } else if (!this.zze.zzq(zzariArr)) {
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzarg) it.next()).zzc(zzarf.zzc(new RuntimeException(new TimeoutException("ExoPlayer3 blockingSendMessages timeout"))));
            }
        }
    }

    public final void zzg() {
        this.zze.zzb();
    }

    public final void zzh(int i) {
        this.zze.zzc(i);
    }

    public final void zzi() {
        this.zze.zzd();
    }

    public final void zzj(zzaxb zzaxb) {
        if (!this.zzo.zzh() || this.zzp != null) {
            this.zzo = zzase.zza;
            this.zzp = null;
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzarg) it.next()).zzf(this.zzo, this.zzp);
            }
        }
        if (this.zzi) {
            this.zzi = false;
            this.zzq = zzaxq.zza;
            this.zzr = this.zzc;
            this.zzb.zzd((Object) null);
            Iterator it2 = this.zzf.iterator();
            while (it2.hasNext()) {
                ((zzarg) it2.next()).zzg(this.zzq, this.zzr);
            }
        }
        this.zzm++;
        this.zze.zzi(zzaxb, true);
    }

    public final void zzk() {
        if (this.zze.zzr()) {
            if (!this.zze.zzs()) {
                Iterator it = this.zzf.iterator();
                while (it.hasNext()) {
                    ((zzarg) it.next()).zzc(zzarf.zzc(new RuntimeException(new TimeoutException("ExoPlayer3 release timeout"))));
                }
            }
            this.zzd.removeCallbacksAndMessages((Object) null);
            return;
        }
        this.zze.zzj();
        this.zzd.removeCallbacksAndMessages((Object) null);
    }

    public final void zzl(zzarg zzarg) {
        this.zzf.remove(zzarg);
    }

    public final void zzm(long j) {
        zzs();
        if (this.zzo.zzh() || this.zzo.zzc() > 0) {
            this.zzl++;
            if (!this.zzo.zzh()) {
                this.zzo.zzg(0, this.zzg, false);
                long zza2 = zzare.zza(j);
                long j2 = this.zzo.zzd(0, this.zzh, false).zzc;
                if (j2 != -9223372036854775807L) {
                    int i = (zza2 > j2 ? 1 : (zza2 == j2 ? 0 : -1));
                }
            }
            this.zzu = j;
            this.zze.zzk(this.zzo, 0, zzare.zza(j));
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzarg) it.next()).zze();
            }
            return;
        }
        throw new zzarv(this.zzo, 0, j);
    }

    public final void zzn(zzari... zzariArr) {
        this.zze.zzl(zzariArr);
    }

    public final void zzo(int i) {
        this.zze.zzm(i);
    }

    public final void zzp(int i) {
        this.zze.zzn(i);
    }

    public final void zzq(boolean z) {
        if (this.zzj != z) {
            this.zzj = z;
            this.zze.zzo(z);
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzarg) it.next()).zzd(z, this.zzk);
            }
        }
    }

    public final void zzr() {
        this.zze.zzp();
    }

    public final int zzs() {
        if (!this.zzo.zzh() && this.zzl <= 0) {
            this.zzo.zzd(this.zzt.zza, this.zzh, false);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final void zzt(Message message) {
        boolean z = true;
        switch (message.what) {
            case 0:
                this.zzm--;
                return;
            case 1:
                this.zzk = message.arg1;
                Iterator it = this.zzf.iterator();
                while (it.hasNext()) {
                    ((zzarg) it.next()).zzd(this.zzj, this.zzk);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                this.zzn = z;
                Iterator it2 = this.zzf.iterator();
                while (it2.hasNext()) {
                    ((zzarg) it2.next()).zza(this.zzn);
                }
                return;
            case 3:
                if (this.zzm == 0) {
                    zzayf zzayf = (zzayf) message.obj;
                    this.zzi = true;
                    this.zzq = zzayf.zza;
                    this.zzr = zzayf.zzb;
                    this.zzb.zzd(zzayf.zzc);
                    Iterator it3 = this.zzf.iterator();
                    while (it3.hasNext()) {
                        ((zzarg) it3.next()).zzg(this.zzq, this.zzr);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.zzl - 1;
                this.zzl = i;
                if (i == 0) {
                    this.zzt = (zzaro) message.obj;
                    if (message.arg1 != 0) {
                        Iterator it4 = this.zzf.iterator();
                        while (it4.hasNext()) {
                            ((zzarg) it4.next()).zze();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.zzl == 0) {
                    this.zzt = (zzaro) message.obj;
                    Iterator it5 = this.zzf.iterator();
                    while (it5.hasNext()) {
                        ((zzarg) it5.next()).zze();
                    }
                    return;
                }
                return;
            case 6:
                zzarq zzarq = (zzarq) message.obj;
                this.zzl -= zzarq.zzd;
                if (this.zzm == 0) {
                    this.zzo = zzarq.zza;
                    this.zzp = zzarq.zzb;
                    this.zzt = zzarq.zzc;
                    Iterator it6 = this.zzf.iterator();
                    while (it6.hasNext()) {
                        ((zzarg) it6.next()).zzf(this.zzo, this.zzp);
                    }
                    return;
                }
                return;
            case 7:
                zzarx zzarx = (zzarx) message.obj;
                if (!this.zzs.equals(zzarx)) {
                    this.zzs = zzarx;
                    Iterator it7 = this.zzf.iterator();
                    while (it7.hasNext()) {
                        ((zzarg) it7.next()).zzb(zzarx);
                    }
                    return;
                }
                return;
            case 8:
                zzarf zzarf = (zzarf) message.obj;
                Iterator it8 = this.zzf.iterator();
                while (it8.hasNext()) {
                    ((zzarg) it8.next()).zzc(zzarf);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
