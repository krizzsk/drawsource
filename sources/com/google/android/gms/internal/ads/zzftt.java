package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzftt<V> extends zzfwd implements zzfvl<V> {
    private static final Logger zzaU;
    /* access modifiers changed from: private */
    public static final zza zzaV;
    private static final Object zzaY = new Object();
    static final boolean zzd;
    /* access modifiers changed from: private */
    @CheckForNull
    public volatile zzd listeners;
    /* access modifiers changed from: private */
    @CheckForNull
    public volatile Object value;
    /* access modifiers changed from: private */
    @CheckForNull
    public volatile zzk waiters;

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    abstract class zza {
        /* synthetic */ zza(C68441 r1) {
        }

        /* access modifiers changed from: package-private */
        public abstract zzd zza(zzftt zzftt, zzd zzd);

        /* access modifiers changed from: package-private */
        public abstract zzk zzb(zzftt zzftt, zzk zzk);

        /* access modifiers changed from: package-private */
        public abstract void zzc(zzk zzk, @CheckForNull zzk zzk2);

        /* access modifiers changed from: package-private */
        public abstract void zzd(zzk zzk, Thread thread);

        /* access modifiers changed from: package-private */
        public abstract boolean zze(zzftt zzftt, @CheckForNull zzd zzd, zzd zzd2);

        /* access modifiers changed from: package-private */
        public abstract boolean zzf(zzftt zzftt, @CheckForNull Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean zzg(zzftt zzftt, @CheckForNull zzk zzk, @CheckForNull zzk zzk2);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    final class zzb {
        @CheckForNull
        static final zzb zza;
        @CheckForNull
        static final zzb zzb;
        final boolean zzc;
        @CheckForNull
        final Throwable zzd;

        static {
            if (zzftt.zzd) {
                zzb = null;
                zza = null;
                return;
            }
            zzb = new zzb(false, (Throwable) null);
            zza = new zzb(true, (Throwable) null);
        }

        zzb(boolean z, @CheckForNull Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") {
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        zzc(Throwable th) {
            if (th != null) {
                this.zzb = th;
                return;
            }
            throw null;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    final class zzd {
        static final zzd zza = new zzd();
        @CheckForNull
        zzd next;
        @CheckForNull
        final Runnable zzb;
        @CheckForNull
        final Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<zzftt, zzk> zzc;
        final AtomicReferenceFieldUpdater<zzftt, zzd> zzd;
        final AtomicReferenceFieldUpdater<zzftt, Object> zze;

        zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super((C68441) null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public final zzd zza(zzftt zzftt, zzd zzd2) {
            return this.zzd.getAndSet(zzftt, zzd2);
        }

        /* access modifiers changed from: package-private */
        public final zzk zzb(zzftt zzftt, zzk zzk) {
            return this.zzc.getAndSet(zzftt, zzk);
        }

        /* access modifiers changed from: package-private */
        public final void zzc(zzk zzk, @CheckForNull zzk zzk2) {
            this.zzb.lazySet(zzk, zzk2);
        }

        /* access modifiers changed from: package-private */
        public final void zzd(zzk zzk, Thread thread) {
            this.zza.lazySet(zzk, thread);
        }

        /* access modifiers changed from: package-private */
        public final boolean zze(zzftt zzftt, @CheckForNull zzd zzd2, zzd zzd3) {
            return zzftu.zza(this.zzd, zzftt, zzd2, zzd3);
        }

        /* access modifiers changed from: package-private */
        public final boolean zzf(zzftt zzftt, @CheckForNull Object obj, Object obj2) {
            return zzftu.zza(this.zze, zzftt, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zzg(zzftt zzftt, @CheckForNull zzk zzk, @CheckForNull zzk zzk2) {
            return zzftu.zza(this.zzc, zzftt, zzk, zzk2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    final class zzf<V> implements Runnable {
        final zzftt<V> zza;
        final zzfvl<? extends V> zzb;

        zzf(zzftt zzftt, zzfvl zzfvl) {
            this.zza = zzftt;
            this.zzb = zzfvl;
        }

        public final void run() {
            if (this.zza.value == this) {
                if (zzftt.zzaV.zzf(this.zza, this, zzftt.zzf(this.zzb))) {
                    zzftt.zzy(this.zza);
                }
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    final class zzg extends zza {
        private zzg() {
            super((C68441) null);
        }

        /* synthetic */ zzg(C68441 r1) {
            super((C68441) null);
        }

        /* access modifiers changed from: package-private */
        public final zzd zza(zzftt zzftt, zzd zzd) {
            zzd zzi;
            synchronized (zzftt) {
                zzi = zzftt.listeners;
                if (zzi != zzd) {
                    zzd unused = zzftt.listeners = zzd;
                }
            }
            return zzi;
        }

        /* access modifiers changed from: package-private */
        public final zzk zzb(zzftt zzftt, zzk zzk) {
            zzk zzk2;
            synchronized (zzftt) {
                zzk2 = zzftt.waiters;
                if (zzk2 != zzk) {
                    zzk unused = zzftt.waiters = zzk;
                }
            }
            return zzk2;
        }

        /* access modifiers changed from: package-private */
        public final void zzc(zzk zzk, @CheckForNull zzk zzk2) {
            zzk.next = zzk2;
        }

        /* access modifiers changed from: package-private */
        public final void zzd(zzk zzk, Thread thread) {
            zzk.thread = thread;
        }

        /* access modifiers changed from: package-private */
        public final boolean zze(zzftt zzftt, @CheckForNull zzd zzd, zzd zzd2) {
            synchronized (zzftt) {
                if (zzftt.listeners != zzd) {
                    return false;
                }
                zzd unused = zzftt.listeners = zzd2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean zzf(zzftt zzftt, @CheckForNull Object obj, Object obj2) {
            synchronized (zzftt) {
                if (zzftt.value != obj) {
                    return false;
                }
                Object unused = zzftt.value = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean zzg(zzftt zzftt, @CheckForNull zzk zzk, @CheckForNull zzk zzk2) {
            synchronized (zzftt) {
                if (zzftt.waiters != zzk) {
                    return false;
                }
                zzk unused = zzftt.waiters = zzk2;
                return true;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    interface zzh<V> extends zzfvl<V> {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    abstract class zzi<V> extends zzftt<V> implements zzh<V> {
        zzi() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    final class zzj extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x006a, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:?, code lost:
            r0 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.ads.zzftt.zzj.C68461());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
        static {
            /*
                sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
                goto L_0x0010
            L_0x0005:
                com.google.android.gms.internal.ads.zzftt$zzj$1 r0 = new com.google.android.gms.internal.ads.zzftt$zzj$1     // Catch:{ PrivilegedActionException -> 0x005e }
                r0.<init>()     // Catch:{ PrivilegedActionException -> 0x005e }
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x005e }
                sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x005e }
            L_0x0010:
                java.lang.Class<com.google.android.gms.internal.ads.zzftt> r1 = com.google.android.gms.internal.ads.zzftt.class
                java.lang.String r2 = "waiters"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                long r2 = r0.objectFieldOffset(r2)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                zzc = r2     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                java.lang.String r2 = "listeners"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                long r2 = r0.objectFieldOffset(r2)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                zzb = r2     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                java.lang.String r2 = "value"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                zzd = r1     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                java.lang.Class<com.google.android.gms.internal.ads.zzftt$zzk> r1 = com.google.android.gms.internal.ads.zzftt.zzk.class
                java.lang.String r2 = "thread"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                zze = r1     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                java.lang.Class<com.google.android.gms.internal.ads.zzftt$zzk> r1 = com.google.android.gms.internal.ads.zzftt.zzk.class
                java.lang.String r2 = "next"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                zzf = r1     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                zza = r0     // Catch:{ NoSuchFieldException -> 0x0057, RuntimeException -> 0x0055 }
                return
            L_0x0055:
                r0 = move-exception
                throw r0
            L_0x0057:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005e:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftt.zzj.<clinit>():void");
        }

        private zzj() {
            super((C68441) null);
        }

        /* synthetic */ zzj(C68441 r1) {
            super((C68441) null);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        final com.google.android.gms.internal.ads.zzftt.zzd zza(com.google.android.gms.internal.ads.zzftt r3, com.google.android.gms.internal.ads.zzftt.zzd r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.android.gms.internal.ads.zzftt$zzd r0 = r3.listeners
                if (r4 != r0) goto L_0x0007
                return r0
            L_0x0007:
                boolean r1 = r2.zze(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftt.zzj.zza(com.google.android.gms.internal.ads.zzftt, com.google.android.gms.internal.ads.zzftt$zzd):com.google.android.gms.internal.ads.zzftt$zzd");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        final com.google.android.gms.internal.ads.zzftt.zzk zzb(com.google.android.gms.internal.ads.zzftt r3, com.google.android.gms.internal.ads.zzftt.zzk r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.android.gms.internal.ads.zzftt$zzk r0 = r3.waiters
                if (r4 != r0) goto L_0x0007
                return r0
            L_0x0007:
                boolean r1 = r2.zzg(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftt.zzj.zzb(com.google.android.gms.internal.ads.zzftt, com.google.android.gms.internal.ads.zzftt$zzk):com.google.android.gms.internal.ads.zzftt$zzk");
        }

        /* access modifiers changed from: package-private */
        public final void zzc(zzk zzk, @CheckForNull zzk zzk2) {
            zza.putObject(zzk, zzf, zzk2);
        }

        /* access modifiers changed from: package-private */
        public final void zzd(zzk zzk, Thread thread) {
            zza.putObject(zzk, zze, thread);
        }

        /* access modifiers changed from: package-private */
        public final boolean zze(zzftt zzftt, @CheckForNull zzd zzd2, zzd zzd3) {
            return zzftv.zza(zza, zzftt, zzb, zzd2, zzd3);
        }

        /* access modifiers changed from: package-private */
        public final boolean zzf(zzftt zzftt, @CheckForNull Object obj, Object obj2) {
            return zzftv.zza(zza, zzftt, zzd, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zzg(zzftt zzftt, @CheckForNull zzk zzk, @CheckForNull zzk zzk2) {
            return zzftv.zza(zza, zzftt, zzc, zzk, zzk2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    final class zzk {
        static final zzk zza = new zzk(false);
        @CheckForNull
        volatile zzk next;
        @CheckForNull
        volatile Thread thread;

        zzk() {
            zzftt.zzaV.zzd(this, Thread.currentThread());
        }

        zzk(boolean z) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zza2;
        Class<zzftt> cls = zzftt.class;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzd = z;
        zzaU = Logger.getLogger(cls.getName());
        try {
            zza2 = new zzj((C68441) null);
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e) {
            try {
                th2 = e;
                zza2 = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(cls, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(cls, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "value"));
                th = null;
            } catch (Error | RuntimeException e2) {
                th = e2;
                th2 = e;
                zza2 = new zzg((C68441) null);
            }
        }
        zzaV = zza2;
        if (th != null) {
            zzaU.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzaU.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    protected zzftt() {
    }

    private final void zzA(zzk zzk2) {
        zzk2.thread = null;
        while (true) {
            zzk zzk3 = this.waiters;
            if (zzk3 != zzk.zza) {
                zzk zzk4 = null;
                while (zzk3 != null) {
                    zzk zzk5 = zzk3.next;
                    if (zzk3.thread != null) {
                        zzk4 = zzk3;
                    } else if (zzk4 != null) {
                        zzk4.next = zzk5;
                        if (zzk4.thread == null) {
                        }
                    } else if (!zzaV.zzg(this, zzk3, zzk5)) {
                    }
                    zzk3 = zzk5;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzB(Object obj) throws ExecutionException {
        if (obj instanceof zzb) {
            Throwable th = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        } else if (obj == zzaY) {
            return null;
        } else {
            return obj;
        }
    }

    /* access modifiers changed from: private */
    public static Object zzf(zzfvl zzfvl) {
        Throwable zzp;
        if (zzfvl instanceof zzh) {
            Object obj = ((zzftt) zzfvl).value;
            if (obj instanceof zzb) {
                zzb zzb2 = (zzb) obj;
                if (zzb2.zzc) {
                    Throwable th = zzb2.zzd;
                    obj = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            obj.getClass();
            return obj;
        } else if ((zzfvl instanceof zzfwd) && (zzp = ((zzfwd) zzfvl).zzp()) != null) {
            return new zzc(zzp);
        } else {
            boolean isCancelled = zzfvl.isCancelled();
            if ((!zzd) && isCancelled) {
                zzb zzb3 = zzb.zzb;
                zzb3.getClass();
                return zzb3;
            }
            try {
                Object zzg2 = zzg(zzfvl);
                if (!isCancelled) {
                    return zzg2 == null ? zzaY : zzg2;
                }
                return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + zzfvl));
            } catch (ExecutionException e) {
                if (!isCancelled) {
                    return new zzc(e.getCause());
                }
                StringBuilder sb = new StringBuilder();
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(zzfvl);
                return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzfvl)), e));
            } catch (CancellationException e2) {
                if (isCancelled) {
                    return new zzb(false, e2);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb2.append(zzfvl);
                return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzfvl)), e2));
            } catch (Error | RuntimeException e3) {
                return new zzc(e3);
            }
        }
    }

    private static Object zzg(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzv(StringBuilder sb) {
        try {
            Object zzg2 = zzg(this);
            sb.append("SUCCESS, result=[");
            if (zzg2 == null) {
                sb.append("null");
            } else if (zzg2 == this) {
                sb.append("this future");
            } else {
                sb.append(zzg2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzg2)));
            }
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void zzw(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb.append(", setFuture=[");
            zzx(sb, ((zzf) obj).zzb);
            sb.append("]");
        } else {
            try {
                str = zzfpi.zza(zza());
            } catch (RuntimeException | StackOverflowError e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Exception thrown from implementation: ");
                Class<?> cls = e.getClass();
                sb2.append(cls);
                str = "Exception thrown from implementation: ".concat(String.valueOf(cls));
            }
            if (str != null) {
                sb.append(", info=[");
                sb.append(str);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzv(sb);
        }
    }

    private final void zzx(StringBuilder sb, @CheckForNull Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException | StackOverflowError e) {
                sb.append("Exception thrown from implementation: ");
                sb.append(e.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    /* access modifiers changed from: private */
    public static void zzy(zzftt<V> zzftt) {
        zzd zzd2 = null;
        while (true) {
            for (zzk zzb2 = zzaV.zzb(zzftt, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            zzftt.zzb();
            zzd zzd3 = zzd2;
            zzd zza2 = zzaV.zza(zzftt, zzd.zza);
            zzd zzd4 = zzd3;
            while (zza2 != null) {
                zzd zzd5 = zza2.next;
                zza2.next = zzd4;
                zzd4 = zza2;
                zza2 = zzd5;
            }
            while (true) {
                if (zzd4 != null) {
                    zzd2 = zzd4.next;
                    Runnable runnable = zzd4.zzb;
                    runnable.getClass();
                    if (runnable instanceof zzf) {
                        zzf zzf2 = (zzf) runnable;
                        zzftt = zzf2.zza;
                        if (zzftt.value == zzf2) {
                            if (zzaV.zzf(zzftt, zzf2, zzf(zzf2.zzb))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = zzd4.zzc;
                        executor.getClass();
                        zzz(runnable, executor);
                    }
                    zzd4 = zzd2;
                } else {
                    return;
                }
            }
        }
    }

    private static void zzz(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = zzaU;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.zzfvl<? extends V>, com.google.android.gms.internal.ads.zzfvl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0008
            r3 = r2
            goto L_0x0009
        L_0x0008:
            r3 = r1
        L_0x0009:
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzftt.zzf
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0064
            boolean r3 = zzd
            if (r3 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzftt$zzb r3 = new com.google.android.gms.internal.ads.zzftt$zzb
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0029
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzftt$zzb r3 = com.google.android.gms.internal.ads.zzftt.zzb.zza
            goto L_0x0026
        L_0x0024:
            com.google.android.gms.internal.ads.zzftt$zzb r3 = com.google.android.gms.internal.ads.zzftt.zzb.zzb
        L_0x0026:
            r3.getClass()
        L_0x0029:
            r4 = r7
            r5 = r1
        L_0x002b:
            com.google.android.gms.internal.ads.zzftt$zza r6 = zzaV
            boolean r6 = r6.zzf(r4, r0, r3)
            if (r6 == 0) goto L_0x005d
            if (r8 == 0) goto L_0x0038
            r4.zzr()
        L_0x0038:
            zzy(r4)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzftt.zzf
            if (r4 == 0) goto L_0x005b
            com.google.android.gms.internal.ads.zzftt$zzf r0 = (com.google.android.gms.internal.ads.zzftt.zzf) r0
            com.google.android.gms.internal.ads.zzfvl<? extends V> r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzftt.zzh
            if (r4 == 0) goto L_0x0058
            r4 = r0
            com.google.android.gms.internal.ads.zzftt r4 = (com.google.android.gms.internal.ads.zzftt) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L_0x0050
            r5 = r2
            goto L_0x0051
        L_0x0050:
            r5 = r1
        L_0x0051:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzftt.zzf
            r5 = r5 | r6
            if (r5 == 0) goto L_0x005b
            r5 = r2
            goto L_0x002b
        L_0x0058:
            r0.cancel(r8)
        L_0x005b:
            r1 = r2
            goto L_0x0064
        L_0x005d:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzftt.zzf
            if (r6 != 0) goto L_0x002b
            r1 = r5
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftt.cancel(boolean):boolean");
    }

    public Object get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                return zzB(obj2);
            }
            zzk zzk2 = this.waiters;
            if (zzk2 != zzk.zza) {
                zzk zzk3 = new zzk();
                do {
                    zzaV.zzc(zzk3, zzk2);
                    if (zzaV.zzg(this, zzk2, zzk3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                zzA(zzk3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof zzf))));
                        return zzB(obj);
                    }
                    zzk2 = this.waiters;
                } while (zzk2 != zzk.zza);
            }
            Object obj3 = this.value;
            obj3.getClass();
            return zzB(obj3);
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.value instanceof zzb;
    }

    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof zzf)) & (obj != null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzv(sb);
        } else {
            zzw(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    public String zza() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* access modifiers changed from: protected */
    public void zzb() {
    }

    public void zzc(Runnable runnable, Executor executor) {
        zzd zzd2;
        zzfou.zzc(runnable, "Runnable was null.");
        zzfou.zzc(executor, "Executor was null.");
        if (isDone() || (zzd2 = this.listeners) == zzd.zza) {
            zzz(runnable, executor);
        }
        zzd zzd3 = new zzd(runnable, executor);
        do {
            zzd3.next = zzd2;
            if (!zzaV.zze(this, zzd2, zzd3)) {
                zzd2 = this.listeners;
            } else {
                return;
            }
        } while (zzd2 != zzd.zza);
        zzz(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public boolean zzd(Object obj) {
        if (obj == null) {
            obj = zzaY;
        }
        if (!zzaV.zzf(this, (Object) null, obj)) {
            return false;
        }
        zzy(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean zze(Throwable th) {
        if (th != null) {
            if (!zzaV.zzf(this, (Object) null, new zzc(th))) {
                return false;
            }
            zzy(this);
            return true;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    public final Throwable zzp() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void zzr() {
    }

    /* access modifiers changed from: package-private */
    public final void zzs(@CheckForNull Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzu());
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzt(zzfvl zzfvl) {
        zzc zzc2;
        if (zzfvl != null) {
            Object obj = this.value;
            if (obj == null) {
                if (zzfvl.isDone()) {
                    if (!zzaV.zzf(this, (Object) null, zzf(zzfvl))) {
                        return false;
                    }
                    zzy(this);
                    return true;
                }
                zzf zzf2 = new zzf(this, zzfvl);
                if (zzaV.zzf(this, (Object) null, zzf2)) {
                    try {
                        zzfvl.zzc(zzf2, zzfuq.INSTANCE);
                    } catch (Error | RuntimeException e) {
                        try {
                            zzc2 = new zzc(e);
                        } catch (Error | RuntimeException unused) {
                            zzc2 = zzc.zza;
                        }
                        zzaV.zzf(this, zzf2, zzc2);
                    }
                    return true;
                }
                obj = this.value;
            }
            if (obj instanceof zzb) {
                zzfvl.cancel(((zzb) obj).zzc);
            }
            return false;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final boolean zzu() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }

    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) && (!(obj instanceof zzf))) {
                return zzB(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                zzk zzk2 = this.waiters;
                if (zzk2 != zzk.zza) {
                    zzk zzk3 = new zzk();
                    do {
                        zzaV.zzc(zzk3, zzk2);
                        if (zzaV.zzg(this, zzk2, zzk3)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                                        return zzB(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    zzA(zzk3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzA(zzk3);
                        } else {
                            zzk2 = this.waiters;
                        }
                    } while (zzk2 != zzk.zza);
                }
                Object obj3 = this.value;
                obj3.getClass();
                return zzB(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.value;
                if ((obj4 != null) && (!(obj4 instanceof zzf))) {
                    return zzB(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String zzftt = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                if (i != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (i > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + zzftt);
        }
        throw new InterruptedException();
    }
}
