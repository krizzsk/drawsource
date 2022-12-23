package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzabe {
    private final ByteArrayOutputStream zza = new ByteArrayOutputStream(512);
    private final DataOutputStream zzb = new DataOutputStream(this.zza);

    private static void zzb(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzabd zzabd) {
        this.zza.reset();
        try {
            zzb(this.zzb, zzabd.zza);
            String str = zzabd.zzb;
            if (str == null) {
                str = "";
            }
            zzb(this.zzb, str);
            this.zzb.writeLong(zzabd.zzc);
            this.zzb.writeLong(zzabd.zzd);
            this.zzb.write(zzabd.zze);
            this.zzb.flush();
            return this.zza.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
