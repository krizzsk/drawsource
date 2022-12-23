package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzrb implements zzsc {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzsj zzc = new zzsj();
    private final zzpc zzd = new zzpc();
    private Looper zze;
    private zzci zzf;
    private zzmu zzg;

    public final /* synthetic */ zzci zzG() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final zzmu zzb() {
        zzmu zzmu = this.zzg;
        zzcw.zzb(zzmu);
        return zzmu;
    }

    /* access modifiers changed from: protected */
    public final zzpc zzc(zzsa zzsa) {
        return this.zzd.zza(0, zzsa);
    }

    /* access modifiers changed from: protected */
    public final zzpc zzd(int i, zzsa zzsa) {
        return this.zzd.zza(i, zzsa);
    }

    /* access modifiers changed from: protected */
    public final zzsj zze(zzsa zzsa) {
        return this.zzc.zza(0, zzsa, 0);
    }

    /* access modifiers changed from: protected */
    public final zzsj zzf(int i, zzsa zzsa, long j) {
        return this.zzc.zza(i, zzsa, 0);
    }

    public final void zzi(zzsb zzsb) {
        boolean isEmpty = this.zzb.isEmpty();
        this.zzb.remove(zzsb);
        if ((!isEmpty) && this.zzb.isEmpty()) {
            zzj();
        }
    }

    /* access modifiers changed from: protected */
    public void zzj() {
    }

    public final void zzk(zzsb zzsb) {
        if (this.zze != null) {
            boolean isEmpty = this.zzb.isEmpty();
            this.zzb.add(zzsb);
            if (isEmpty) {
                zzl();
                return;
            }
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzl() {
    }

    public final void zzm(zzsb zzsb, zzfs zzfs, zzmu zzmu) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z = true;
        if (!(looper == null || looper == myLooper)) {
            z = false;
        }
        zzcw.zzd(z);
        this.zzg = zzmu;
        zzci zzci = this.zzf;
        this.zza.add(zzsb);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzsb);
            zzn(zzfs);
        } else if (zzci != null) {
            zzk(zzsb);
            zzsb.zza(this, zzci);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void zzn(zzfs zzfs);

    /* access modifiers changed from: protected */
    public final void zzo(zzci zzci) {
        this.zzf = zzci;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzsb) arrayList.get(i)).zza(this, zzci);
        }
    }

    public final void zzp(zzsb zzsb) {
        this.zza.remove(zzsb);
        if (this.zza.isEmpty()) {
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
            this.zzb.clear();
            zzq();
            return;
        }
        zzi(zzsb);
    }

    /* access modifiers changed from: protected */
    public abstract void zzq();

    public final void zzr(zzpd zzpd) {
        this.zzd.zzc(zzpd);
    }

    public final void zzs(zzsk zzsk) {
        this.zzc.zzm(zzsk);
    }

    /* access modifiers changed from: protected */
    public final boolean zzt() {
        return !this.zzb.isEmpty();
    }

    public final /* synthetic */ boolean zzu() {
        return true;
    }

    public final void zzg(Handler handler, zzpd zzpd) {
        if (zzpd != null) {
            this.zzd.zzb(handler, zzpd);
            return;
        }
        throw null;
    }

    public final void zzh(Handler handler, zzsk zzsk) {
        if (zzsk != null) {
            this.zzc.zzb(handler, zzsk);
            return;
        }
        throw null;
    }
}
