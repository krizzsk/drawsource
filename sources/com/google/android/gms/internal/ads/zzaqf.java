package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaqf extends zzaqn {
    private final StackTraceElement[] zzi;

    public zzaqf(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzapc, "aZvf8nokSQAvHIIdmzwu8civ2+qb07zM1ZEz6qZf1UzLfoKt8BndVgmiOXFGATXV", "1Q5N5QhnMtop76rkewUHBq0dfu+Fpixkwg9xHoBYaMc=", zzali, i, 45);
        this.zzi = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.zzi;
        if (obj != null) {
            int i = 1;
            zzaou zzaou = new zzaou((String) this.zzf.invoke((Object) null, new Object[]{obj}));
            synchronized (this.zze) {
                this.zze.zzE(zzaou.zza.longValue());
                if (zzaou.zzb.booleanValue()) {
                    zzali zzali = this.zze;
                    if (true != zzaou.zzc.booleanValue()) {
                        i = 2;
                    }
                    zzali.zzab(i);
                } else {
                    this.zze.zzab(3);
                }
            }
        }
    }
}
