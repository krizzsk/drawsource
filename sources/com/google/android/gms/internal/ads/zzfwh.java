package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfwh {
    private final OutputStream zza;

    private zzfwh(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzfwh zzb(OutputStream outputStream) {
        return new zzfwh(outputStream);
    }

    public final void zza(zzgfw zzgfw) throws IOException {
        try {
            zzgfw.zzav(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
