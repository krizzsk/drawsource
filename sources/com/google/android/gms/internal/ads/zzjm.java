package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzjm {
    private final zzmu zza;
    private final List zzb = new ArrayList();
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final zzjl zze;
    /* access modifiers changed from: private */
    public final zzsj zzf = new zzsj();
    /* access modifiers changed from: private */
    public final zzpc zzg = new zzpc();
    private final HashMap zzh = new HashMap();
    private final Set zzi = new HashSet();
    private boolean zzj;
    private zzfs zzk;
    private zztt zzl = new zztt(0);

    public zzjm(zzjl zzjl, zzkh zzkh, Handler handler, zzmu zzmu) {
        this.zza = zzmu;
        this.zze = zzjl;
        this.zzf.zzb(handler, zzkh);
        this.zzg.zzb(handler, zzkh);
    }

    private final void zzp(int i, int i2) {
        while (i < this.zzb.size()) {
            ((zzjk) this.zzb.get(i)).zzd += i2;
            i++;
        }
    }

    private final void zzq(zzjk zzjk) {
        zzjj zzjj = (zzjj) this.zzh.get(zzjk);
        if (zzjj != null) {
            zzjj.zza.zzi(zzjj.zzb);
        }
    }

    private final void zzr() {
        Iterator it = this.zzi.iterator();
        while (it.hasNext()) {
            zzjk zzjk = (zzjk) it.next();
            if (zzjk.zzc.isEmpty()) {
                zzq(zzjk);
                it.remove();
            }
        }
    }

    private final void zzs(zzjk zzjk) {
        if (zzjk.zze && zzjk.zzc.isEmpty()) {
            zzjj zzjj = (zzjj) this.zzh.remove(zzjk);
            if (zzjj != null) {
                zzjj.zza.zzp(zzjj.zzb);
                zzjj.zza.zzs(zzjj.zzc);
                zzjj.zza.zzr(zzjj.zzc);
                this.zzi.remove(zzjk);
                return;
            }
            throw null;
        }
    }

    private final void zzt(zzjk zzjk) {
        zzrv zzrv = zzjk.zza;
        zzjh zzjh = new zzjh(this);
        zzji zzji = new zzji(this, zzjk);
        this.zzh.put(zzjk, new zzjj(zzrv, zzjh, zzji));
        zzrv.zzh(new Handler(zzeg.zzD(), (Handler.Callback) null), zzji);
        zzrv.zzg(new Handler(zzeg.zzD(), (Handler.Callback) null), zzji);
        zzrv.zzm(zzjh, this.zzk, this.zza);
    }

    private final void zzu(int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= i) {
                zzjk zzjk = (zzjk) this.zzb.remove(i2);
                this.zzd.remove(zzjk.zzb);
                zzp(i2, -zzjk.zza.zzA().zzc());
                zzjk.zze = true;
                if (this.zzj) {
                    zzs(zzjk);
                }
            } else {
                return;
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzci zzb() {
        if (this.zzb.isEmpty()) {
            return zzci.zza;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zzb.size(); i2++) {
            zzjk zzjk = (zzjk) this.zzb.get(i2);
            zzjk.zzd = i;
            i += zzjk.zza.zzA().zzc();
        }
        return new zzjr(this.zzb, this.zzl, (byte[]) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzsc zzsc, zzci zzci) {
        this.zze.zzh();
    }

    public final void zzf(zzfs zzfs) {
        zzcw.zzf(!this.zzj);
        this.zzk = zzfs;
        for (int i = 0; i < this.zzb.size(); i++) {
            zzjk zzjk = (zzjk) this.zzb.get(i);
            zzt(zzjk);
            this.zzi.add(zzjk);
        }
        this.zzj = true;
    }

    public final void zzg() {
        for (zzjj zzjj : this.zzh.values()) {
            try {
                zzjj.zza.zzp(zzjj.zzb);
            } catch (RuntimeException e) {
                zzdn.zza("MediaSourceList", "Failed to release child source.", e);
            }
            zzjj.zza.zzs(zzjj.zzc);
            zzjj.zza.zzr(zzjj.zzc);
        }
        this.zzh.clear();
        this.zzi.clear();
        this.zzj = false;
    }

    public final void zzh(zzry zzry) {
        zzjk zzjk = (zzjk) this.zzc.remove(zzry);
        if (zzjk != null) {
            zzjk.zza.zzB(zzry);
            zzjk.zzc.remove(((zzrs) zzry).zza);
            if (!this.zzc.isEmpty()) {
                zzr();
            }
            zzs(zzjk);
            return;
        }
        throw null;
    }

    public final boolean zzi() {
        return this.zzj;
    }

    public final zzci zzj(int i, List list, zztt zztt) {
        if (!list.isEmpty()) {
            this.zzl = zztt;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                zzjk zzjk = (zzjk) list.get(i2 - i);
                if (i2 > 0) {
                    zzjk zzjk2 = (zzjk) this.zzb.get(i2 - 1);
                    zzjk.zzc(zzjk2.zzd + zzjk2.zza.zzA().zzc());
                } else {
                    zzjk.zzc(0);
                }
                zzp(i2, zzjk.zza.zzA().zzc());
                this.zzb.add(i2, zzjk);
                this.zzd.put(zzjk.zzb, zzjk);
                if (this.zzj) {
                    zzt(zzjk);
                    if (this.zzc.isEmpty()) {
                        this.zzi.add(zzjk);
                    } else {
                        zzq(zzjk);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzci zzk(int i, int i2, int i3, zztt zztt) {
        zzcw.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzci zzl(int i, int i2, zztt zztt) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= zza()) {
            z = true;
        }
        zzcw.zzd(z);
        this.zzl = zztt;
        zzu(i, i2);
        return zzb();
    }

    public final zzci zzm(List list, zztt zztt) {
        zzu(0, this.zzb.size());
        return zzj(this.zzb.size(), list, zztt);
    }

    public final zzci zzn(zztt zztt) {
        int zza2 = zza();
        if (zztt.zzc() != zza2) {
            zztt = zztt.zzf().zzg(0, zza2);
        }
        this.zzl = zztt;
        return zzb();
    }

    public final zzry zzo(zzsa zzsa, zzvv zzvv, long j) {
        Object obj = ((Pair) zzsa.zza).first;
        zzsa zzc2 = zzsa.zzc(((Pair) zzsa.zza).second);
        zzjk zzjk = (zzjk) this.zzd.get(obj);
        if (zzjk != null) {
            this.zzi.add(zzjk);
            zzjj zzjj = (zzjj) this.zzh.get(zzjk);
            if (zzjj != null) {
                zzjj.zza.zzk(zzjj.zzb);
            }
            zzjk.zzc.add(zzc2);
            zzrs zzC = zzjk.zza.zzD(zzc2, zzvv, j);
            this.zzc.put(zzC, zzjk);
            zzr();
            return zzC;
        }
        throw null;
    }
}
