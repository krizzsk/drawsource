package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaps extends zzaqn {
    private final long zzi;

    public zzaps(zzapc zzapc, String str, String str2, zzali zzali, long j, int i, int i2) {
        super(zzapc, "FmiCZESJMiUiPEVFp8/sySGg9zk5i1lJsy88E60+KsD4lJB1UVftaJnD830H1Cnc", "B8qnIZWGEs7xms3SbQDilR0QM+SibSnQfZbTzlo06bE=", zzali, i, 25);
        this.zzi = j;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke((Object) null, new Object[0])).longValue();
        synchronized (this.zze) {
            this.zze.zzs(longValue);
            long j = this.zzi;
            if (j != 0) {
                this.zze.zzS(longValue - j);
                this.zze.zzT(this.zzi);
            }
        }
    }
}
