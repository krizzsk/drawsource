package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzrj extends zzrb {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzfs zzc;

    protected zzrj() {
    }

    /* access modifiers changed from: protected */
    public final void zzj() {
        for (zzri zzri : this.zza.values()) {
            zzri.zza.zzi(zzri.zzb);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzl() {
        for (zzri zzri : this.zza.values()) {
            zzri.zza.zzk(zzri.zzb);
        }
    }

    /* access modifiers changed from: protected */
    public void zzn(zzfs zzfs) {
        this.zzc = zzfs;
        this.zzb = zzeg.zzC((Handler.Callback) null);
    }

    /* access modifiers changed from: protected */
    public void zzq() {
        for (zzri zzri : this.zza.values()) {
            zzri.zza.zzp(zzri.zzb);
            zzri.zza.zzs(zzri.zzc);
            zzri.zza.zzr(zzri.zzc);
        }
        this.zza.clear();
    }

    /* access modifiers changed from: protected */
    public zzsa zzv(Object obj, zzsa zzsa) {
        throw null;
    }

    public void zzw() throws IOException {
        for (zzri zzri : this.zza.values()) {
            zzri.zza.zzw();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void zzx(Object obj, zzsc zzsc, zzci zzci);

    /* access modifiers changed from: protected */
    public final void zzy(Object obj, zzsc zzsc) {
        zzcw.zzd(!this.zza.containsKey(obj));
        zzrg zzrg = new zzrg(this, obj);
        zzrh zzrh = new zzrh(this, obj);
        this.zza.put(obj, new zzri(zzsc, zzrg, zzrh));
        Handler handler = this.zzb;
        if (handler != null) {
            zzsc.zzh(handler, zzrh);
            Handler handler2 = this.zzb;
            if (handler2 != null) {
                zzsc.zzg(handler2, zzrh);
                zzsc.zzm(zzrg, this.zzc, zzb());
                if (!zzt()) {
                    zzsc.zzi(zzrg);
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }
}
