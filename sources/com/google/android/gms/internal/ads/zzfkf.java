package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfkf implements zzfjk {
    private static final zzfkf zza = new zzfkf();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public static Handler zzc = null;
    /* access modifiers changed from: private */
    public static final Runnable zzd = new zzfkb();
    /* access modifiers changed from: private */
    public static final Runnable zze = new zzfkc();
    private final List zzf = new ArrayList();
    private int zzg;
    private final zzfjm zzh = new zzfjm();
    private final zzfjy zzi = new zzfjy();
    /* access modifiers changed from: private */
    public final zzfjz zzj = new zzfjz(new zzfki());
    private long zzk;

    zzfkf() {
    }

    public static zzfkf zzd() {
        return zza;
    }

    static /* bridge */ /* synthetic */ void zzg(zzfkf zzfkf) {
        zzfkf.zzg = 0;
        zzfkf.zzk = System.nanoTime();
        zzfkf.zzi.zzi();
        long nanoTime = System.nanoTime();
        zzfjl zza2 = zzfkf.zzh.zza();
        if (zzfkf.zzi.zze().size() > 0) {
            Iterator it = zzfkf.zzi.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zzfjt.zza(0, 0, 0, 0);
                View zza4 = zzfkf.zzi.zza(str);
                zzfjl zzb2 = zzfkf.zzh.zzb();
                String zzc2 = zzfkf.zzi.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzfjt.zzb(zza5, str);
                    zzfjt.zze(zza5, zzc2);
                    zzfjt.zzc(zza3, zza5);
                }
                zzfjt.zzh(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfkf.zzj.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzfkf.zzi.zzf().size() > 0) {
            JSONObject zza6 = zzfjt.zza(0, 0, 0, 0);
            zzfkf.zzk((View) null, zza2, zza6, 1);
            zzfjt.zzh(zza6);
            zzfkf.zzj.zzd(zza6, zzfkf.zzi.zzf(), nanoTime);
        } else {
            zzfkf.zzj.zzb();
        }
        zzfkf.zzi.zzg();
        long nanoTime2 = System.nanoTime() - zzfkf.zzk;
        if (zzfkf.zzf.size() > 0) {
            for (zzfke zzfke : zzfkf.zzf) {
                int i = zzfkf.zzg;
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfke.zzb();
                if (zzfke instanceof zzfkd) {
                    int i2 = zzfkf.zzg;
                    ((zzfkd) zzfke).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzfjl zzfjl, JSONObject jSONObject, int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        zzfjl.zzb(view, jSONObject, this, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    public final void zza(View view, zzfjl zzfjl, JSONObject jSONObject) {
        int zzj2;
        if (zzfjw.zzb(view) == null && (zzj2 = this.zzi.zzj(view)) != 3) {
            JSONObject zza2 = zzfjl.zza(view);
            zzfjt.zzc(jSONObject, zza2);
            String zzd2 = this.zzi.zzd(view);
            if (zzd2 != null) {
                zzfjt.zzb(zza2, zzd2);
                this.zzi.zzh();
            } else {
                zzfjx zzb2 = this.zzi.zzb(view);
                if (zzb2 != null) {
                    zzfjt.zzd(zza2, zzb2);
                }
                zzk(view, zzfjl, zza2, zzj2);
            }
            this.zzg++;
        }
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfka(this));
    }
}
