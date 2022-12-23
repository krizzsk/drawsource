package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaxf implements zzaxb {
    private final zzaxb[] zza;
    private final ArrayList zzb;
    private final zzasd zzc = new zzasd();
    private zzaxa zzd;
    private zzase zze;
    private int zzf = -1;
    private zzaxe zzg;

    public zzaxf(zzaxb... zzaxbArr) {
        this.zza = zzaxbArr;
        this.zzb = new ArrayList(Arrays.asList(zzaxbArr));
    }

    static /* bridge */ /* synthetic */ void zzf(zzaxf zzaxf, int i, zzase zzase, Object obj) {
        zzaxe zzaxe;
        if (zzaxf.zzg == null) {
            for (int i2 = 0; i2 <= 0; i2++) {
                zzase.zzg(i2, zzaxf.zzc, false);
            }
            int i3 = zzaxf.zzf;
            if (i3 == -1) {
                zzaxf.zzf = 1;
            } else if (i3 != 1) {
                zzaxe = new zzaxe(1);
                zzaxf.zzg = zzaxe;
            }
            zzaxe = null;
            zzaxf.zzg = zzaxe;
        }
        if (zzaxf.zzg == null) {
            zzaxf.zzb.remove(zzaxf.zza[i]);
            if (i == 0) {
                zzaxf.zze = zzase;
            }
            if (zzaxf.zzb.isEmpty()) {
                zzaxf.zzd.zzg(zzaxf.zze, (Object) null);
            }
        }
    }

    public final void zza() throws IOException {
        zzaxe zzaxe = this.zzg;
        if (zzaxe == null) {
            for (zzaxb zza2 : this.zza) {
                zza2.zza();
            }
            return;
        }
        throw zzaxe;
    }

    public final void zzb(zzarj zzarj, boolean z, zzaxa zzaxa) {
        this.zzd = zzaxa;
        int i = 0;
        while (true) {
            zzaxb[] zzaxbArr = this.zza;
            if (i < zzaxbArr.length) {
                zzaxbArr[i].zzb(zzarj, false, new zzaxd(this, i));
                i++;
            } else {
                return;
            }
        }
    }

    public final void zzc(zzawz zzawz) {
        zzaxc zzaxc = (zzaxc) zzawz;
        int i = 0;
        while (true) {
            zzaxb[] zzaxbArr = this.zza;
            if (i < zzaxbArr.length) {
                zzaxbArr[i].zzc(zzaxc.zza[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final void zzd() {
        for (zzaxb zzd2 : this.zza) {
            zzd2.zzd();
        }
    }

    public final zzawz zze(int i, zzaym zzaym) {
        int length = this.zza.length;
        zzawz[] zzawzArr = new zzawz[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzawzArr[i2] = this.zza[i2].zze(i, zzaym);
        }
        return new zzaxc(zzawzArr);
    }
}
