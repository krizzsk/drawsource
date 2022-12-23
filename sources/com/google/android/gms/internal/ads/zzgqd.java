package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzgqd extends zzgqb implements zzako {
    private int zza;

    protected zzgqd(String str) {
        super("mvhd");
    }

    public final int zzh() {
        if (!this.zzc) {
            zzg();
        }
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final long zzi(ByteBuffer byteBuffer) {
        this.zza = zzakn.zzc(byteBuffer.get());
        zzakn.zzd(byteBuffer);
        byteBuffer.get();
        return 4;
    }
}
