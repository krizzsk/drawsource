package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzapq extends zzaqn {
    public zzapq(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2) {
        super(zzapc, "zzBoiLmCSl4qpONTaYkbu2H1+be7dFpyqhOnbG674OZpERvkqiVrsp9nWT5kU4lr", "4H+WN9tI0y+WKEjRpYWQhzjGaRdS7qtgrPx+7wzXofs=", zzali, i, 5);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzl(-1);
        this.zze.zzk(-1);
        int[] iArr = (int[]) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb()});
        synchronized (this.zze) {
            this.zze.zzl((long) iArr[0]);
            this.zze.zzk((long) iArr[1]);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                this.zze.zzj((long) i);
            }
        }
    }
}
