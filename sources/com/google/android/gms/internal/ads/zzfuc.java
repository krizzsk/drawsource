package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
abstract class zzfuc extends zzfuh {
    private static final Logger zza = Logger.getLogger(zzfuc.class.getName());
    @CheckForNull
    private zzfre zzb;
    private final boolean zzc;
    private final boolean zze;

    zzfuc(zzfre zzfre, boolean z, boolean z2) {
        super(zzfre.size());
        if (zzfre != null) {
            this.zzb = zzfre;
            this.zzc = z;
            this.zze = z2;
            return;
        }
        throw null;
    }

    private final void zzG(int i, Future future) {
        try {
            zzg(i, zzfvc.zzp(future));
        } catch (ExecutionException e) {
            zzI(e.getCause());
        } catch (Error | RuntimeException e2) {
            zzI(e2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzH */
    public final void zzy(@CheckForNull zzfre zzfre) {
        int zzB = zzB();
        int i = 0;
        zzfou.zzi(zzB >= 0, "Less than 0 remaining futures");
        if (zzB == 0) {
            if (zzfre != null) {
                zzfti zze2 = zzfre.iterator();
                while (zze2.hasNext()) {
                    Future future = (Future) zze2.next();
                    if (!future.isCancelled()) {
                        zzG(i, future);
                    }
                    i++;
                }
            }
            zzF();
            zzv();
            zzz(2);
        }
    }

    private final void zzI(Throwable th) {
        if (th == null) {
            throw null;
        } else if (this.zzc && !zze(th) && zzK(zzE(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }

    private static void zzJ(Throwable th) {
        zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean zzK(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    public final String zza() {
        zzfre zzfre = this.zzb;
        if (zzfre == null) {
            return super.zza();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("futures=");
        sb.append(zzfre);
        return "futures=".concat(zzfre.toString());
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzfre zzfre = this.zzb;
        boolean z = true;
        zzz(1);
        boolean isCancelled = isCancelled();
        if (zzfre == null) {
            z = false;
        }
        if (z && isCancelled) {
            boolean zzu = zzu();
            zzfti zze2 = zzfre.iterator();
            while (zze2.hasNext()) {
                ((Future) zze2.next()).cancel(zzu);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzf(Set set) {
        if (set == null) {
            throw null;
        } else if (!isCancelled()) {
            Throwable zzp = zzp();
            zzp.getClass();
            zzK(set, zzp);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void zzg(int i, Object obj);

    /* access modifiers changed from: package-private */
    public abstract void zzv();

    /* access modifiers changed from: package-private */
    public final void zzw() {
        zzfre zzfre = this.zzb;
        zzfre.getClass();
        if (zzfre.isEmpty()) {
            zzv();
        } else if (this.zzc) {
            zzfti zze2 = this.zzb.iterator();
            int i = 0;
            while (zze2.hasNext()) {
                zzfvl zzfvl = (zzfvl) zze2.next();
                zzfvl.zzc(new zzfua(this, zzfvl, i), zzfuq.INSTANCE);
                i++;
            }
        } else {
            zzfub zzfub = new zzfub(this, this.zze ? this.zzb : null);
            zzfti zze3 = this.zzb.iterator();
            while (zze3.hasNext()) {
                ((zzfvl) zze3.next()).zzc(zzfub, zzfuq.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzx(zzfvl zzfvl, int i) {
        try {
            if (zzfvl.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i, zzfvl);
            }
        } finally {
            zzy((zzfre) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void zzz(int i) {
        this.zzb = null;
    }
}
