package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfek {
    private final zzfdo zza;
    private final zzfei zzb;
    private final zzfdk zzc;
    /* access modifiers changed from: private */
    public final ArrayDeque zzd;
    /* access modifiers changed from: private */
    public zzfeq zze;
    /* access modifiers changed from: private */
    public int zzf = 1;

    public zzfek(zzfdo zzfdo, zzfdk zzfdk, zzfei zzfei) {
        this.zza = zzfdo;
        this.zzc = zzfdk;
        this.zzb = zzfei;
        this.zzd = new ArrayDeque();
        this.zzc.zzb(new zzfef(this));
    }

    /* access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfm)).booleanValue()) {
            if (!zzt.zzo().zzh().zzh().zzh()) {
                this.zzd.clear();
                return;
            }
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfej zzfej = (zzfej) this.zzd.pollFirst();
                if (zzfej == null || (zzfej.zza() != null && this.zza.zze(zzfej.zza()))) {
                    zzfeq zzfeq = new zzfeq(this.zza, this.zzb, zzfej);
                    this.zze = zzfeq;
                    zzfeq.zzd(new zzfeg(this, zzfej));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized zzfvl zza(zzfej zzfej) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzfej);
    }

    public final synchronized void zze(zzfej zzfej) {
        this.zzd.add(zzfej);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
