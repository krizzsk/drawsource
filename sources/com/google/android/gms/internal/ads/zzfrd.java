package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzfrd {
    zzfrd() {
    }

    static int zzd(int i, int i2) {
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = highestOneBit + highestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public abstract zzfrd zzb(Object obj);
}
