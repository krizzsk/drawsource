package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzet {
    private Uri zza;
    private final int zzb = 1;
    private Map zzc = Collections.emptyMap();
    private long zzd;
    private int zze;

    public final zzet zza(int i) {
        this.zze = 6;
        return this;
    }

    public final zzet zzb(Map map) {
        this.zzc = map;
        return this;
    }

    public final zzet zzc(long j) {
        this.zzd = j;
        return this;
    }

    public final zzet zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzev zze() {
        if (this.zza != null) {
            return new zzev(this.zza, 0, 1, (byte[]) null, this.zzc, this.zzd, -1, (String) null, this.zze, (Object) null, (zzeu) null);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
