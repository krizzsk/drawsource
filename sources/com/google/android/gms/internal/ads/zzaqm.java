package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaqm {
    protected static final String zza = zzaqm.class.getSimpleName();
    private final zzapc zzb;
    private final String zzc;
    private final String zzd;
    private volatile Method zze = null;
    private final Class[] zzf;
    private final CountDownLatch zzg = new CountDownLatch(1);

    public zzaqm(zzapc zzapc, String str, String str2, Class... clsArr) {
        this.zzb = zzapc;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = clsArr;
        zzapc.zzk().submit(new zzaql(this));
    }

    static /* bridge */ /* synthetic */ void zzb(zzaqm zzaqm) {
        CountDownLatch countDownLatch;
        try {
            zzapc zzapc = zzaqm.zzb;
            Class loadClass = zzapc.zzi().loadClass(zzaqm.zzc(zzapc.zzu(), zzaqm.zzc));
            if (loadClass == null) {
                countDownLatch = zzaqm.zzg;
            } else {
                zzaqm.zze = loadClass.getMethod(zzaqm.zzc(zzaqm.zzb.zzu(), zzaqm.zzd), zzaqm.zzf);
                if (zzaqm.zze == null) {
                    countDownLatch = zzaqm.zzg;
                }
                countDownLatch = zzaqm.zzg;
            }
        } catch (zzaoh | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
        } catch (NullPointerException unused2) {
            countDownLatch = zzaqm.zzg;
        } catch (Throwable th) {
            zzaqm.zzg.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzaoh, UnsupportedEncodingException {
        return new String(this.zzb.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zze != null) {
            return this.zze;
        }
        try {
            if (!this.zzg.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.zze;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
