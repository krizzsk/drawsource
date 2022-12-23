package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgfw extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgfw zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgkz zzf = zzaJ();

    static {
        zzgfw zzgfw = new zzgfw();
        zzb = zzgfw;
        zzgkq.zzaP(zzgfw.class, zzgfw);
    }

    private zzgfw() {
    }

    public static zzgft zzd() {
        return (zzgft) zzb.zzay();
    }

    public static zzgfw zzf(InputStream inputStream, zzgkc zzgkc) throws IOException {
        return (zzgfw) zzgkq.zzaE(zzb, inputStream, zzgkc);
    }

    public static zzgfw zzg(byte[] bArr, zzgkc zzgkc) throws zzglc {
        return (zzgfw) zzgkq.zzaF(zzb, bArr, zzgkc);
    }

    static /* synthetic */ void zzj(zzgfw zzgfw, zzgfv zzgfv) {
        zzgfv.getClass();
        zzgkz zzgkz = zzgfw.zzf;
        if (!zzgkz.zzc()) {
            zzgfw.zzf = zzgkq.zzaK(zzgkz);
        }
        zzgfw.zzf.add(zzgfv);
    }

    public final int zza() {
        return this.zzf.size();
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzgfv.class});
        } else if (i2 == 3) {
            return new zzgfw();
        } else {
            if (i2 == 4) {
                return new zzgft((zzgfs) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int zzc() {
        return this.zze;
    }

    public final List zzh() {
        return this.zzf;
    }
}
