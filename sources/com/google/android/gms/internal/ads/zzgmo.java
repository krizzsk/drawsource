package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgmo {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgmo() {
    }

    static /* bridge */ /* synthetic */ zzgji zza(zzgmo zzgmo, zzgji zzgji, zzgji zzgji2) {
        zzgmo.zzb(zzgji);
        zzgmo.zzb(zzgji2);
        zzgji zzgji3 = (zzgji) zzgmo.zza.pop();
        while (!zzgmo.zza.isEmpty()) {
            zzgji3 = new zzgms((zzgji) zzgmo.zza.pop(), zzgji3);
        }
        return zzgji3;
    }

    private final void zzb(zzgji zzgji) {
        if (zzgji.zzh()) {
            int zzc = zzc(zzgji.zzd());
            int zzc2 = zzgms.zzc(zzc + 1);
            if (this.zza.isEmpty() || ((zzgji) this.zza.peek()).zzd() >= zzc2) {
                this.zza.push(zzgji);
                return;
            }
            int zzc3 = zzgms.zzc(zzc);
            zzgji zzgji2 = (zzgji) this.zza.pop();
            while (!this.zza.isEmpty() && ((zzgji) this.zza.peek()).zzd() < zzc3) {
                zzgji2 = new zzgms((zzgji) this.zza.pop(), zzgji2);
            }
            zzgms zzgms = new zzgms(zzgji2, zzgji);
            while (!this.zza.isEmpty() && ((zzgji) this.zza.peek()).zzd() < zzgms.zzc(zzc(zzgms.zzd()) + 1)) {
                zzgms = new zzgms((zzgji) this.zza.pop(), zzgms);
            }
            this.zza.push(zzgms);
        } else if (zzgji instanceof zzgms) {
            zzgms zzgms2 = (zzgms) zzgji;
            zzb(zzgms2.zzd);
            zzb(zzgms2.zze);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(zzgji.getClass()))));
        }
    }

    private static final int zzc(int i) {
        int binarySearch = Arrays.binarySearch(zzgms.zza, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* synthetic */ zzgmo(zzgmn zzgmn) {
    }
}
