package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzgqb implements zzako {
    private static final zzgqm zza = zzgqm.zzb(zzgqb.class);
    protected final String zzb;
    boolean zzc;
    boolean zzd;
    long zze;
    long zzf = -1;
    zzgqg zzg;
    private zzakp zzh;
    private ByteBuffer zzi;
    private ByteBuffer zzj = null;

    protected zzgqb(String str) {
        this.zzb = str;
        this.zzd = true;
        this.zzc = true;
    }

    private final synchronized void zzd() {
        if (!this.zzd) {
            try {
                zzgqm zzgqm = zza;
                String str = this.zzb;
                zzgqm.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.zzi = this.zzg.zzd(this.zze, this.zzf);
                this.zzd = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final void zzb(zzgqg zzgqg, ByteBuffer byteBuffer, long j, zzakl zzakl) throws IOException {
        this.zze = zzgqg.zzb();
        byteBuffer.remaining();
        this.zzf = j;
        this.zzg = zzgqg;
        zzgqg.zze(zzgqg.zzb() + j);
        this.zzd = false;
        this.zzc = false;
        zzg();
    }

    public final void zzc(zzakp zzakp) {
        this.zzh = zzakp;
    }

    /* access modifiers changed from: protected */
    public abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        zzd();
        zzgqm zzgqm = zza;
        String str = this.zzb;
        zzgqm.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.zzi;
        if (byteBuffer != null) {
            this.zzc = true;
            byteBuffer.rewind();
            zzf(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzj = byteBuffer.slice();
            }
            this.zzi = null;
        }
    }
}
