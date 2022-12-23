package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzffx {
    /* access modifiers changed from: private */
    public static final zzfvl zza = zzfvc.zzi((Object) null);
    /* access modifiers changed from: private */
    public final zzfvm zzb;
    /* access modifiers changed from: private */
    public final ScheduledExecutorService zzc;
    /* access modifiers changed from: private */
    public final zzffy zzd;

    public zzffx(zzfvm zzfvm, ScheduledExecutorService scheduledExecutorService, zzffy zzffy) {
        this.zzb = zzfvm;
        this.zzc = scheduledExecutorService;
        this.zzd = zzffy;
    }

    public final zzffn zza(Object obj, zzfvl... zzfvlArr) {
        return new zzffn(this, obj, Arrays.asList(zzfvlArr), (zzffm) null);
    }

    public final zzffw zzb(Object obj, zzfvl zzfvl) {
        return new zzffw(this, obj, (String) null, zzfvl, Collections.singletonList(zzfvl), zzfvl, (zzffv) null);
    }

    /* access modifiers changed from: protected */
    public abstract String zzf(Object obj);
}
