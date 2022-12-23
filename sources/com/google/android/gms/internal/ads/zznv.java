package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zznv implements zzmy {
    protected zzmw zzb;
    protected zzmw zzc;
    private zzmw zzd = zzmw.zza;
    private zzmw zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zznv() {
        ByteBuffer byteBuffer = zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzmw zzmw = zzmw.zza;
        this.zze = zzmw;
        this.zzb = zzmw;
        this.zzc = zzmw;
    }

    public final zzmw zza(zzmw zzmw) throws zzmx {
        this.zzd = zzmw;
        this.zze = zzi(zzmw);
        return zzg() ? this.zze : zzmw.zza;
    }

    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zza;
        return byteBuffer;
    }

    public final void zzc() {
        this.zzg = zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    public final void zzf() {
        zzc();
        this.zzf = zza;
        this.zzd = zzmw.zza;
        zzmw zzmw = zzmw.zza;
        this.zze = zzmw;
        this.zzb = zzmw;
        this.zzc = zzmw;
        zzm();
    }

    public boolean zzg() {
        return this.zze != zzmw.zza;
    }

    public boolean zzh() {
        return this.zzh && this.zzg == zza;
    }

    /* access modifiers changed from: protected */
    public zzmw zzi(zzmw zzmw) throws zzmx {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final ByteBuffer zzj(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    /* access modifiers changed from: protected */
    public void zzk() {
    }

    /* access modifiers changed from: protected */
    public void zzl() {
    }

    /* access modifiers changed from: protected */
    public void zzm() {
    }

    /* access modifiers changed from: protected */
    public final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}
