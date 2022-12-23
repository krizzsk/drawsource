package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzapw extends zzaqn {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzapw(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2) {
        super(zzapc, "zo8V8X8kshYkxeE23t3OyXdoh3FPhn0ETnxP8vKAUZieFhalf6x5LNoDw8Q1oLRS", "Hf8oHWnCgsj7Y9XZDlAl+qeEGkjuhCtSnXpSHq9fewc=", zzali, i, 22);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzx(zzi.longValue());
        }
    }
}
