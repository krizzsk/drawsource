package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgmq implements Iterator {
    private final ArrayDeque zza;
    private zzgjd zzb;

    /* synthetic */ zzgmq(zzgji zzgji, zzgmp zzgmp) {
        if (zzgji instanceof zzgms) {
            zzgms zzgms = (zzgms) zzgji;
            ArrayDeque arrayDeque = new ArrayDeque(zzgms.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzgms);
            this.zzb = zzb(zzgms.zzd);
            return;
        }
        this.zza = null;
        this.zzb = (zzgjd) zzgji;
    }

    private final zzgjd zzb(zzgji zzgji) {
        while (zzgji instanceof zzgms) {
            zzgms zzgms = (zzgms) zzgji;
            this.zza.push(zzgms);
            zzgji = zzgms.zzd;
        }
        return (zzgjd) zzgji;
    }

    public final boolean hasNext() {
        return this.zzb != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: zza */
    public final zzgjd next() {
        zzgjd zzgjd;
        zzgjd zzgjd2 = this.zzb;
        if (zzgjd2 != null) {
            do {
                ArrayDeque arrayDeque = this.zza;
                zzgjd = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    this.zzb = zzgjd;
                } else {
                    zzgjd = zzb(((zzgms) this.zza.pop()).zze);
                }
            } while (zzgjd.zzD());
            this.zzb = zzgjd;
            return zzgjd2;
        }
        throw new NoSuchElementException();
    }
}
