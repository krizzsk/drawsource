package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzcj;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfcw {
    private static zzfcw zza;
    private final Context zzb;
    private final zzcj zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzfcw(Context context, zzcj zzcj) {
        this.zzb = context;
        this.zzc = zzcj;
    }

    static zzcj zza(Context context) {
        try {
            return zzci.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context}));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            zze.zzh("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    public static zzfcw zzd(Context context) {
        synchronized (zzfcw.class) {
            zzfcw zzfcw = zza;
            if (zzfcw != null) {
                return zzfcw;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbjr.zzb.zze()).longValue();
            zzcj zzcj = null;
            if (longValue > 0 && longValue <= 221908400) {
                zzcj = zza(applicationContext);
            }
            zzfcw zzfcw2 = new zzfcw(applicationContext, zzcj);
            zza = zzfcw2;
            return zzfcw2;
        }
    }

    public final zzbua zzb() {
        return (zzbua) this.zzd.get();
    }

    public final zzcfo zzc(int i, boolean z, int i2) {
        zzt.zzp();
        boolean zzA = zzs.zzA(this.zzb);
        zzcfo zzcfo = new zzcfo(221908000, i2, true, zzA);
        if (!((Boolean) zzbjr.zzc.zze()).booleanValue()) {
            return zzcfo;
        }
        zzcj zzcj = this.zzc;
        zzeh zzeh = null;
        if (zzcj != null) {
            try {
                zzeh = zzcj.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        if (zzeh == null) {
            return zzcfo;
        }
        return new zzcfo(221908000, zzeh.zza(), true, zzA);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(com.google.android.gms.internal.ads.zzbua r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbjb r0 = com.google.android.gms.internal.ads.zzbjr.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0023
            com.google.android.gms.ads.internal.client.zzcj r0 = r3.zzc
            if (r0 != 0) goto L_0x0015
        L_0x0013:
            r0 = r1
            goto L_0x0019
        L_0x0015:
            com.google.android.gms.internal.ads.zzbua r0 = r0.getAdapterCreator()     // Catch:{ RemoteException -> 0x0013 }
        L_0x0019:
            java.util.concurrent.atomic.AtomicReference r2 = r3.zzd
            if (r0 != 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r4 = r0
        L_0x001f:
            com.google.android.gms.internal.ads.zzfcv.zza(r2, r1, r4)
            return
        L_0x0023:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd
            com.google.android.gms.internal.ads.zzfcv.zza(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfcw.zze(com.google.android.gms.internal.ads.zzbua):void");
    }
}
