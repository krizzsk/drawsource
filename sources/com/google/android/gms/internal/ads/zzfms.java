package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.google.android.exoplayer2.PlaybackException;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfms {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfmt zzc;
    private final zzfku zzd;
    private final zzfkp zze;
    private zzfmh zzf;
    private final Object zzg = new Object();

    public zzfms(Context context, zzfmt zzfmt, zzfku zzfku, zzfkp zzfkp) {
        this.zzb = context;
        this.zzc = zzfmt;
        this.zzd = zzfku;
        this.zze = zzfkp;
    }

    private final synchronized Class zzd(zzfmi zzfmi) throws zzfmr {
        String zzk = zzfmi.zza().zzk();
        Class cls = (Class) zza.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.zze.zza(zzfmi.zzc())) {
                File zzb2 = zzfmi.zzb();
                if (!zzb2.exists()) {
                    zzb2.mkdirs();
                }
                Class loadClass = new DexClassLoader(zzfmi.zzc().getAbsolutePath(), zzb2.getAbsolutePath(), (String) null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                zza.put(zzk, loadClass);
                return loadClass;
            }
            throw new zzfmr(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e) {
            throw new zzfmr(2026, (Throwable) e);
        } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e2) {
            throw new zzfmr(2008, e2);
        }
    }

    public final zzfkx zza() {
        zzfmh zzfmh;
        synchronized (this.zzg) {
            zzfmh = this.zzf;
        }
        return zzfmh;
    }

    public final zzfmi zzb() {
        synchronized (this.zzg) {
            zzfmh zzfmh = this.zzf;
            if (zzfmh == null) {
                return null;
            }
            zzfmi zzf2 = zzfmh.zzf();
            return zzf2;
        }
    }

    public final boolean zzc(zzfmi zzfmi) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Class zzd2 = zzd(zzfmi);
            zzfmh zzfmh = new zzfmh(zzd2.getDeclaredConstructor(new Class[]{Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE}).newInstance(new Object[]{this.zzb, "msa-r", zzfmi.zze(), null, new Bundle(), 2}), zzfmi, this.zzc, this.zzd);
            if (zzfmh.zzh()) {
                int zze2 = zzfmh.zze();
                if (zze2 == 0) {
                    synchronized (this.zzg) {
                        zzfmh zzfmh2 = this.zzf;
                        if (zzfmh2 != null) {
                            try {
                                zzfmh2.zzg();
                            } catch (zzfmr e) {
                                this.zzd.zzc(e.zza(), -1, e);
                            }
                        }
                        this.zzf = zzfmh;
                    }
                    this.zzd.zzd(3000, System.currentTimeMillis() - currentTimeMillis);
                    return true;
                }
                throw new zzfmr((int) PlaybackException.ERROR_CODE_DECODER_INIT_FAILED, "ci: " + zze2);
            }
            throw new zzfmr((int) TTAdSdk.INIT_LOCAL_FAIL_CODE, "init failed");
        } catch (Exception e2) {
            throw new zzfmr(2004, (Throwable) e2);
        } catch (zzfmr e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - currentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        }
    }
}
