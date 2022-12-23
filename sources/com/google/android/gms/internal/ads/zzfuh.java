package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzftt;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
abstract class zzfuh extends zzftt.zzi {
    private static final zzfue zzaW;
    private static final Logger zzaX;
    private volatile int remaining;
    /* access modifiers changed from: private */
    @CheckForNull
    public volatile Set<Throwable> seenExceptions = null;

    static {
        Throwable th;
        zzfue zzfue;
        Class<zzfuh> cls = zzfuh.class;
        zzaX = Logger.getLogger(cls.getName());
        try {
            zzfue = new zzfuf(AtomicReferenceFieldUpdater.newUpdater(cls, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(cls, "remaining"));
            th = null;
        } catch (Error | RuntimeException e) {
            zzfue = new zzfug((zzfud) null);
            th = e;
        }
        zzaW = zzfue;
        if (th != null) {
            zzaX.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzfuh(int i) {
        this.remaining = i;
    }

    static /* synthetic */ int zzA(zzfuh zzfuh) {
        int i = zzfuh.remaining - 1;
        zzfuh.remaining = i;
        return i;
    }

    /* access modifiers changed from: package-private */
    public final int zzB() {
        return zzaW.zza(this);
    }

    /* access modifiers changed from: package-private */
    public final Set zzE() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(newSetFromMap);
        zzaW.zzb(this, (Set) null, newSetFromMap);
        Set<Throwable> set2 = this.seenExceptions;
        set2.getClass();
        return set2;
    }

    /* access modifiers changed from: package-private */
    public final void zzF() {
        this.seenExceptions = null;
    }

    /* access modifiers changed from: package-private */
    public abstract void zzf(Set set);
}
