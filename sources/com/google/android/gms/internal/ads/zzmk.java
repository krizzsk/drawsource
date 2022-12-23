package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzmk {
    private final zzcf zza;
    /* access modifiers changed from: private */
    public zzfrj zzb = zzfrj.zzo();
    private zzfrm zzc = zzfrm.zzd();
    private zzsa zzd;
    private zzsa zze;
    private zzsa zzf;

    public zzmk(zzcf zzcf) {
        this.zza = zzcf;
    }

    private static zzsa zzj(zzcb zzcb, zzfrj zzfrj, zzsa zzsa, zzcf zzcf) {
        zzci zzn = zzcb.zzn();
        int zzg = zzcb.zzg();
        Object zzf2 = zzn.zzo() ? null : zzn.zzf(zzg);
        int zzc2 = (zzcb.zzs() || zzn.zzo()) ? -1 : zzn.zzd(zzg, zzcf, false).zzc(zzeg.zzv(zzcb.zzl()));
        for (int i = 0; i < zzfrj.size(); i++) {
            zzsa zzsa2 = (zzsa) zzfrj.get(i);
            if (zzm(zzsa2, zzf2, zzcb.zzs(), zzcb.zzd(), zzcb.zze(), zzc2)) {
                return zzsa2;
            }
        }
        if (zzfrj.isEmpty() && zzsa != null) {
            if (zzm(zzsa, zzf2, zzcb.zzs(), zzcb.zzd(), zzcb.zze(), zzc2)) {
                return zzsa;
            }
        }
        return null;
    }

    private final void zzk(zzfrl zzfrl, zzsa zzsa, zzci zzci) {
        if (zzsa != null) {
            if (zzci.zza(zzsa.zza) != -1) {
                zzfrl.zza(zzsa, zzci);
                return;
            }
            zzci zzci2 = (zzci) this.zzc.get(zzsa);
            if (zzci2 != null) {
                zzfrl.zza(zzsa, zzci2);
            }
        }
    }

    private final void zzl(zzci zzci) {
        zzfrl zzfrl = new zzfrl();
        if (this.zzb.isEmpty()) {
            zzk(zzfrl, this.zze, zzci);
            if (!zzfoq.zza(this.zzf, this.zze)) {
                zzk(zzfrl, this.zzf, zzci);
            }
            if (!zzfoq.zza(this.zzd, this.zze) && !zzfoq.zza(this.zzd, this.zzf)) {
                zzk(zzfrl, this.zzd, zzci);
            }
        } else {
            for (int i = 0; i < this.zzb.size(); i++) {
                zzk(zzfrl, (zzsa) this.zzb.get(i), zzci);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfrl, this.zzd, zzci);
            }
        }
        this.zzc = zzfrl.zzc();
    }

    private static boolean zzm(zzsa zzsa, Object obj, boolean z, int i, int i2, int i3) {
        if (!zzsa.zza.equals(obj)) {
            return false;
        }
        if (z) {
            if (!(zzsa.zzb == i && zzsa.zzc == i2)) {
                return false;
            }
        } else if (!(zzsa.zzb == -1 && zzsa.zze == i3)) {
            return false;
        }
        return true;
    }

    public final zzci zza(zzsa zzsa) {
        return (zzci) this.zzc.get(zzsa);
    }

    public final zzsa zzb() {
        return this.zzd;
    }

    public final zzsa zzc() {
        Object obj;
        Object next;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfrj zzfrj = this.zzb;
        if (!(zzfrj instanceof List)) {
            Iterator it = zzfrj.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else if (!zzfrj.isEmpty()) {
            obj = zzfrj.get(zzfrj.size() - 1);
        } else {
            throw new NoSuchElementException();
        }
        return (zzsa) obj;
    }

    public final zzsa zzd() {
        return this.zze;
    }

    public final zzsa zze() {
        return this.zzf;
    }

    public final void zzg(zzcb zzcb) {
        this.zzd = zzj(zzcb, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zzsa zzsa, zzcb zzcb) {
        this.zzb = zzfrj.zzm(list);
        if (!list.isEmpty()) {
            this.zze = (zzsa) list.get(0);
            if (zzsa != null) {
                this.zzf = zzsa;
            } else {
                throw null;
            }
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzcb, this.zzb, this.zze, this.zza);
        }
        zzl(zzcb.zzn());
    }

    public final void zzi(zzcb zzcb) {
        this.zzd = zzj(zzcb, this.zzb, this.zze, this.zza);
        zzl(zzcb.zzn());
    }
}
