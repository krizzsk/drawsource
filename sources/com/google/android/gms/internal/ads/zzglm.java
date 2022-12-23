package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzglm extends zzglo {
    private zzglm() {
        super((zzgln) null);
    }

    /* synthetic */ zzglm(zzgll zzgll) {
        super((zzgln) null);
    }

    /* access modifiers changed from: package-private */
    public final List zza(Object obj, long j) {
        zzgkz zzgkz = (zzgkz) zzgnu.zzh(obj, j);
        if (zzgkz.zzc()) {
            return zzgkz;
        }
        int size = zzgkz.size();
        zzgkz zzd = zzgkz.zzd(size == 0 ? 10 : size + size);
        zzgnu.zzv(obj, j, zzd);
        return zzd;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j) {
        ((zzgkz) zzgnu.zzh(obj, j)).zzb();
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Object obj, Object obj2, long j) {
        zzgkz zzgkz = (zzgkz) zzgnu.zzh(obj, j);
        zzgkz zzgkz2 = (zzgkz) zzgnu.zzh(obj2, j);
        int size = zzgkz.size();
        int size2 = zzgkz2.size();
        if (size > 0 && size2 > 0) {
            if (!zzgkz.zzc()) {
                zzgkz = zzgkz.zzd(size2 + size);
            }
            zzgkz.addAll(zzgkz2);
        }
        if (size > 0) {
            zzgkz2 = zzgkz;
        }
        zzgnu.zzv(obj, j, zzgkz2);
    }
}
