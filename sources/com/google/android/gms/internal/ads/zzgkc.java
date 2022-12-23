package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgkc {
    static final zzgkc zza = new zzgkc(true);
    private static volatile boolean zzb = false;
    private static volatile zzgkc zzc;
    private static volatile zzgkc zzd;
    private final Map zze;

    zzgkc() {
        this.zze = new HashMap();
    }

    public static zzgkc zza() {
        zzgkc zzgkc = zzc;
        if (zzgkc == null) {
            synchronized (zzgkc.class) {
                zzgkc = zzc;
                if (zzgkc == null) {
                    zzgkc = zza;
                    zzc = zzgkc;
                }
            }
        }
        return zzgkc;
    }

    public final zzgko zzc(zzgma zzgma, int i) {
        return (zzgko) this.zze.get(new zzgkb(zzgma, i));
    }

    zzgkc(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzgkc zzb() {
        Class<zzgkc> cls = zzgkc.class;
        zzgkc zzgkc = zzd;
        if (zzgkc != null) {
            return zzgkc;
        }
        synchronized (cls) {
            zzgkc zzgkc2 = zzd;
            if (zzgkc2 != null) {
                return zzgkc2;
            }
            zzgkc zzb2 = zzgkk.zzb(cls);
            zzd = zzb2;
            return zzb2;
        }
    }
}
