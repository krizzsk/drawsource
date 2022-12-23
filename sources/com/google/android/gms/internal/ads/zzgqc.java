package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public class zzgqc extends zzgqf implements zzako {
    zzakp zza;
    protected final String zzb = "moov";

    public zzgqc(String str) {
    }

    public final String zza() {
        return this.zzb;
    }

    public final void zzb(zzgqg zzgqg, ByteBuffer byteBuffer, long j, zzakl zzakl) throws IOException {
        zzgqg.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzd = zzgqg;
        this.zzf = zzgqg.zzb();
        zzgqg.zze(zzgqg.zzb() + j);
        this.zzg = zzgqg.zzb();
        this.zzc = zzakl;
    }

    public final void zzc(zzakp zzakp) {
        this.zza = zzakp;
    }
}
