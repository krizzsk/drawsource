package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzadt extends zzadv {
    public final long zza;
    public final List zzb = new ArrayList();
    public final List zzc = new ArrayList();

    public zzadt(int i, long j) {
        super(i);
        this.zza = j;
    }

    public final String toString() {
        String zzf = zzf(this.zzd);
        String arrays = Arrays.toString(this.zzb.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        return zzf + " leaves: " + arrays + " containers: " + arrays2;
    }

    public final zzadt zza(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzadt zzadt = (zzadt) this.zzc.get(i2);
            if (zzadt.zzd == i) {
                return zzadt;
            }
        }
        return null;
    }

    public final zzadu zzb(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzadu zzadu = (zzadu) this.zzb.get(i2);
            if (zzadu.zzd == i) {
                return zzadu;
            }
        }
        return null;
    }

    public final void zzc(zzadt zzadt) {
        this.zzc.add(zzadt);
    }

    public final void zzd(zzadu zzadu) {
        this.zzb.add(zzadu);
    }
}
