package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzsj {
    public final int zza;
    public final zzsa zzb;
    private final CopyOnWriteArrayList zzc;

    public zzsj() {
        this(new CopyOnWriteArrayList(), 0, (zzsa) null, 0);
    }

    private zzsj(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzsa zzsa, long j) {
        this.zzc = copyOnWriteArrayList;
        this.zza = i;
        this.zzb = zzsa;
    }

    private static final long zzn(long j) {
        long zzz = zzeg.zzz(j);
        if (zzz == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzz;
    }

    public final zzsj zza(int i, zzsa zzsa, long j) {
        return new zzsj(this.zzc, i, zzsa, 0);
    }

    public final void zzc(zzrw zzrw) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsi zzsi = (zzsi) it.next();
            zzeg.zzX(zzsi.zza, new zzsd(this, zzsi.zzb, zzrw));
        }
    }

    public final void zzd(int i, zzad zzad, int i2, Object obj, long j) {
        zzc(new zzrw(1, i, zzad, 0, (Object) null, zzn(j), -9223372036854775807L));
    }

    public final void zze(zzrr zzrr, zzrw zzrw) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsi zzsi = (zzsi) it.next();
            zzeg.zzX(zzsi.zza, new zzse(this, zzsi.zzb, zzrr, zzrw));
        }
    }

    public final void zzf(zzrr zzrr, int i, int i2, zzad zzad, int i3, Object obj, long j, long j2) {
        zzrr zzrr2 = zzrr;
        zze(zzrr, new zzrw(1, -1, (zzad) null, 0, (Object) null, zzn(j), zzn(j2)));
    }

    public final void zzg(zzrr zzrr, zzrw zzrw) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsi zzsi = (zzsi) it.next();
            zzeg.zzX(zzsi.zza, new zzsh(this, zzsi.zzb, zzrr, zzrw));
        }
    }

    public final void zzh(zzrr zzrr, int i, int i2, zzad zzad, int i3, Object obj, long j, long j2) {
        zzrr zzrr2 = zzrr;
        zzg(zzrr, new zzrw(1, -1, (zzad) null, 0, (Object) null, zzn(j), zzn(j2)));
    }

    public final void zzi(zzrr zzrr, zzrw zzrw, IOException iOException, boolean z) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsi zzsi = (zzsi) it.next();
            zzeg.zzX(zzsi.zza, new zzsf(this, zzsi.zzb, zzrr, zzrw, iOException, z));
        }
    }

    public final void zzj(zzrr zzrr, int i, int i2, zzad zzad, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        zzrr zzrr2 = zzrr;
        zzi(zzrr, new zzrw(1, -1, (zzad) null, 0, (Object) null, zzn(j), zzn(j2)), iOException, z);
    }

    public final void zzk(zzrr zzrr, zzrw zzrw) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsi zzsi = (zzsi) it.next();
            zzeg.zzX(zzsi.zza, new zzsg(this, zzsi.zzb, zzrr, zzrw));
        }
    }

    public final void zzl(zzrr zzrr, int i, int i2, zzad zzad, int i3, Object obj, long j, long j2) {
        zzrr zzrr2 = zzrr;
        zzk(zzrr, new zzrw(1, -1, (zzad) null, 0, (Object) null, zzn(j), zzn(j2)));
    }

    public final void zzm(zzsk zzsk) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsi zzsi = (zzsi) it.next();
            if (zzsi.zzb == zzsk) {
                this.zzc.remove(zzsi);
            }
        }
    }

    public final void zzb(Handler handler, zzsk zzsk) {
        if (zzsk != null) {
            this.zzc.add(new zzsi(handler, zzsk));
            return;
        }
        throw null;
    }
}
