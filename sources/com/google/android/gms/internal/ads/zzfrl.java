package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfrl {
    Object[] zza;
    int zzb;
    zzfrk zzc;

    public zzfrl() {
        this(4);
    }

    private final void zzd(int i) {
        int i2 = i + i;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzfrd.zzd(length, i2));
        }
    }

    public final zzfrl zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfqi.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzfrl zzb(java.lang.Iterable r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x000e
            int r0 = r2.zzb
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.zzd(r0)
        L_0x000e:
            java.util.Iterator r3 = r3.iterator()
        L_0x0012:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.zza(r1, r0)
            goto L_0x0012
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfrl.zzb(java.lang.Iterable):com.google.android.gms.internal.ads.zzfrl");
    }

    public final zzfrm zzc() {
        zzfrk zzfrk = this.zzc;
        if (zzfrk == null) {
            zzfsx zzh = zzfsx.zzh(this.zzb, this.zza, this);
            zzfrk zzfrk2 = this.zzc;
            if (zzfrk2 == null) {
                return zzh;
            }
            throw zzfrk2.zza();
        }
        throw zzfrk.zza();
    }

    zzfrl(int i) {
        this.zza = new Object[(i + i)];
        this.zzb = 0;
    }
}
