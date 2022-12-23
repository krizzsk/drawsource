package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgkm;
import com.google.android.gms.internal.ads.zzgkq;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public class zzgkm<MessageType extends zzgkq<MessageType, BuilderType>, BuilderType extends zzgkm<MessageType, BuilderType>> extends zzgiq<MessageType, BuilderType> {
    protected zzgkq zza;
    protected boolean zzb = false;
    private final zzgkq zzc;

    protected zzgkm(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (zzgkq) messagetype.zzb(4, (Object) null, (Object) null);
    }

    private static final void zza(zzgkq zzgkq, zzgkq zzgkq2) {
        zzgmi.zza().zzb(zzgkq.getClass()).zzg(zzgkq, zzgkq2);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ zzgiq zzag(zzgir zzgir) {
        zzaj((zzgkq) zzgir);
        return this;
    }

    /* renamed from: zzai */
    public final zzgkm zzaf() {
        zzgkm zzgkm = (zzgkm) this.zzc.zzb(5, (Object) null, (Object) null);
        zzgkm.zzaj(zzan());
        return zzgkm;
    }

    public final zzgkm zzaj(zzgkq zzgkq) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zza(this.zza, zzgkq);
        return this;
    }

    public final zzgkm zzak(byte[] bArr, int i, int i2, zzgkc zzgkc) throws zzglc {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        try {
            zzgmi.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i2, new zzgiu(zzgkc));
            return this;
        } catch (zzglc e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw zzglc.zzj();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    public final MessageType zzal() {
        MessageType zzam = zzan();
        if (zzam.zzaR()) {
            return zzam;
        }
        throw new zzgnj(zzam);
    }

    /* renamed from: zzam */
    public MessageType zzan() {
        if (this.zzb) {
            return this.zza;
        }
        zzgkq zzgkq = this.zza;
        zzgmi.zza().zzb(zzgkq.getClass()).zzf(zzgkq);
        this.zzb = true;
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public void zzap() {
        zzgkq zzgkq = (zzgkq) this.zza.zzb(4, (Object) null, (Object) null);
        zza(zzgkq, this.zza);
        this.zza = zzgkq;
    }

    public final /* synthetic */ zzgma zzbh() {
        return this.zzc;
    }
}
