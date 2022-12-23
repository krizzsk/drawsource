package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzzi {
    private final zzdy zza = new zzdy(10);

    public final zzbl zza(zzys zzys, zzaby zzaby) throws IOException {
        zzbl zzbl = null;
        int i = 0;
        while (true) {
            try {
                ((zzyl) zzys).zzm(this.zza.zzH(), 0, 10, false);
                this.zza.zzF(0);
                if (this.zza.zzm() != 4801587) {
                    break;
                }
                this.zza.zzG(3);
                int zzj = this.zza.zzj();
                int i2 = zzj + 10;
                if (zzbl == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.zza.zzH(), 0, bArr, 0, 10);
                    ((zzyl) zzys).zzm(bArr, 10, zzj, false);
                    zzbl = zzaca.zza(bArr, i2, zzaby, new zzabb());
                } else {
                    ((zzyl) zzys).zzl(zzj, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zzys.zzj();
        ((zzyl) zzys).zzl(i, false);
        return zzbl;
    }
}
