package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzapy extends zzaqn {
    private final zzaog zzi;
    private final long zzj;
    private final long zzk;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzapy(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2, zzaog zzaog, long j, long j2) {
        super(zzapc, "XdACBmHPjNtNHtvuxJIzO5INAuD0sY2N7kIXkPlZf2/7KHZWQ+7Wr4DDubVydJNF", "y+g//F0lHk9VQdkf/Jc605unsex1+WIt3b6Nn2DqnLo=", zzali, i, 11);
        this.zzi = zzaog;
        this.zzj = j;
        this.zzk = j2;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaog zzaog = this.zzi;
        if (zzaog != null) {
            zzaoe zzaoe = new zzaoe((String) this.zzf.invoke((Object) null, new Object[]{zzaog.zzb(), Long.valueOf(this.zzj), Long.valueOf(this.zzk)}));
            synchronized (this.zze) {
                this.zze.zzy(zzaoe.zza.longValue());
                if (zzaoe.zzb.longValue() >= 0) {
                    this.zze.zzP(zzaoe.zzb.longValue());
                }
                if (zzaoe.zzc.longValue() >= 0) {
                    this.zze.zzf(zzaoe.zzc.longValue());
                }
            }
        }
    }
}
