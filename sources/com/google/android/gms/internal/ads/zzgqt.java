package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgqt implements zzgrh, zzgqo {
    private static final Object zza = new Object();
    private volatile zzgrh zzb;
    private volatile Object zzc = zza;

    private zzgqt(zzgrh zzgrh) {
        this.zzb = zzgrh;
    }

    public static zzgqo zza(zzgrh zzgrh) {
        if (zzgrh instanceof zzgqo) {
            return (zzgqo) zzgrh;
        }
        if (zzgrh != null) {
            return new zzgqt(zzgrh);
        }
        throw null;
    }

    public static zzgrh zzc(zzgrh zzgrh) {
        if (zzgrh == null) {
            throw null;
        } else if (zzgrh instanceof zzgqt) {
            return zzgrh;
        } else {
            return new zzgqt(zzgrh);
        }
    }

    public final Object zzb() {
        Object obj = this.zzc;
        if (obj == zza) {
            synchronized (this) {
                obj = this.zzc;
                if (obj == zza) {
                    obj = this.zzb.zzb();
                    Object obj2 = this.zzc;
                    if (obj2 != zza) {
                        if (obj2 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                    }
                    this.zzc = obj;
                    this.zzb = null;
                }
            }
        }
        return obj;
    }
}
