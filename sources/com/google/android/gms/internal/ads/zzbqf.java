package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbqf implements zzaiu {
    /* access modifiers changed from: private */
    public volatile zzbps zza;
    private final Context zzb;

    public zzbqf(Context context) {
        this.zzb = context;
    }

    static /* bridge */ /* synthetic */ void zzc(zzbqf zzbqf) {
        if (zzbqf.zza != null) {
            zzbqf.zza.disconnect();
            Binder.flushPendingCommands();
        }
    }

    public final zzaix zza(zzajb zzajb) throws zzajk {
        Parcelable.Creator<zzbpt> creator = zzbpt.CREATOR;
        Map zzl = zzajb.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzbpt zzbpt = new zzbpt(zzajb.zzk(), strArr, strArr2);
        long elapsedRealtime = zzt.zzA().elapsedRealtime();
        try {
            zzcga zzcga = new zzcga();
            this.zza = new zzbps(this.zzb, zzt.zzt().zzb(), new zzbqd(this, zzcga), new zzbqe(this, zzcga));
            this.zza.checkAvailabilityAndConnect();
            zzfvl zzo = zzfvc.zzo(zzfvc.zzn(zzcga, new zzbqb(this, zzbpt), zzcfv.zza), (long) ((Integer) zzay.zzc().zzb(zzbhz.zzdz)).intValue(), TimeUnit.MILLISECONDS, zzcfv.zzd);
            zzo.zzc(new zzbqc(this), zzcfv.zza);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            long elapsedRealtime2 = zzt.zzA().elapsedRealtime();
            zze.zza("Http assets remote cache took " + (elapsedRealtime2 - elapsedRealtime) + "ms");
            zzbpv zzbpv = (zzbpv) new zzbzt(parcelFileDescriptor).zza(zzbpv.CREATOR);
            if (zzbpv == null) {
                return null;
            }
            if (zzbpv.zza) {
                throw new zzajk(zzbpv.zzb);
            } else if (zzbpv.zze.length != zzbpv.zzf.length) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = zzbpv.zze;
                    if (i >= strArr3.length) {
                        return new zzaix(zzbpv.zzc, zzbpv.zzd, (Map) hashMap, zzbpv.zzg, zzbpv.zzh);
                    }
                    hashMap.put(strArr3[i], zzbpv.zzf[i]);
                    i++;
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            long elapsedRealtime3 = zzt.zzA().elapsedRealtime();
            zze.zza("Http assets remote cache took " + (elapsedRealtime3 - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            long elapsedRealtime4 = zzt.zzA().elapsedRealtime();
            zze.zza("Http assets remote cache took " + (elapsedRealtime4 - elapsedRealtime) + "ms");
            throw th;
        }
    }
}
