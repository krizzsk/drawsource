package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcxd extends zzcvv {
    private final zzbms zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzcxd(zzcxw zzcxw, zzbms zzbms, Runnable runnable, Executor executor) {
        super(zzcxw);
        this.zzc = zzbms;
        this.zzd = runnable;
        this.zze = executor;
    }

    static /* synthetic */ void zzi(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet((Object) null);
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void zzW() {
        this.zze.execute(new zzcxc(this, new zzcxb(new AtomicReference(this.zzd))));
    }

    public final int zza() {
        return 0;
    }

    public final View zzc() {
        return null;
    }

    public final zzdk zzd() {
        return null;
    }

    public final zzfbm zze() {
        return null;
    }

    public final zzfbm zzf() {
        return null;
    }

    public final void zzg() {
    }

    public final void zzh(ViewGroup viewGroup, zzq zzq) {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(Runnable runnable) {
        try {
            if (!this.zzc.zzb(ObjectWrapper.wrap(runnable))) {
                zzi(((zzcxb) runnable).zza);
            }
        } catch (RemoteException unused) {
            zzi(((zzcxb) runnable).zza);
        }
    }
}
