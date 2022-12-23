package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzakm extends zzgqf implements Closeable {
    private static final zzgqm zza = zzgqm.zzb(zzakm.class);

    public zzakm(zzgqg zzgqg, zzakl zzakl) throws IOException {
        zzf(zzgqg, zzgqg.zzc(), zzakl);
    }

    public final void close() throws IOException {
    }

    public final String toString() {
        String obj = this.zzd.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
