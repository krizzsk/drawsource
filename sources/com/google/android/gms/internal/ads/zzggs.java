package com.google.android.gms.internal.ads;

import java.util.List;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzggs extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzggs zzb;
    private String zze = "";
    private zzgkz zzf = zzaJ();

    static {
        zzggs zzggs = new zzggs();
        zzb = zzggs;
        zzgkq.zzaP(zzggs.class, zzggs);
    }

    private zzggs() {
    }

    public static zzggs zzc() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzgfr.class});
        } else if (i2 == 3) {
            return new zzggs();
        } else {
            if (i2 == 4) {
                return new zzggr((zzggq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final List zzd() {
        return this.zzf;
    }
}
