package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcer {
    /* access modifiers changed from: private */
    public final Object zza = new Object();
    private final zzj zzb = new zzj();
    private final zzcev zzc = new zzcev(zzaw.zzd(), this.zzb);
    private boolean zzd = false;
    /* access modifiers changed from: private */
    public Context zze;
    /* access modifiers changed from: private */
    public zzcfo zzf;
    /* access modifiers changed from: private */
    public zzbie zzg = null;
    private Boolean zzh = null;
    private final AtomicInteger zzi = new AtomicInteger(0);
    private final zzceq zzj = new zzceq((zzcep) null);
    private final Object zzk = new Object();
    private zzfvl zzl;
    /* access modifiers changed from: private */
    public final AtomicBoolean zzm = new AtomicBoolean();

    public final int zza() {
        return this.zzi.get();
    }

    public final Context zzc() {
        return this.zze;
    }

    public final Resources zzd() {
        if (this.zzf.zzd) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzil)).booleanValue()) {
                return zzcfm.zza(this.zze).getResources();
            }
            zzcfm.zza(this.zze).getResources();
            return null;
        } catch (zzcfl e) {
            zze.zzk("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final zzbie zzf() {
        zzbie zzbie;
        synchronized (this.zza) {
            zzbie = this.zzg;
        }
        return zzbie;
    }

    public final zzcev zzg() {
        return this.zzc;
    }

    public final zzg zzh() {
        zzj zzj2;
        synchronized (this.zza) {
            zzj2 = this.zzb;
        }
        return zzj2;
    }

    public final zzfvl zzj() {
        if (this.zze != null) {
            if (!((Boolean) zzay.zzc().zzb(zzbhz.zzcj)).booleanValue()) {
                synchronized (this.zzk) {
                    zzfvl zzfvl = this.zzl;
                    if (zzfvl != null) {
                        return zzfvl;
                    }
                    zzfvl zzb2 = zzcfv.zza.zzb(new zzcem(this));
                    this.zzl = zzb2;
                    return zzb2;
                }
            }
        }
        return zzfvc.zzi(new ArrayList());
    }

    public final Boolean zzk() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzh;
        }
        return bool;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzm() throws Exception {
        Context zza2 = zzcaj.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(zza2).getPackageInfo(zza2.getApplicationInfo().packageName, 4096);
            if (!(packageInfo.requestedPermissions == null || packageInfo.requestedPermissionsFlags == null)) {
                for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(packageInfo.requestedPermissions[i]);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void zzo() {
        this.zzj.zza();
    }

    public final void zzp() {
        this.zzi.decrementAndGet();
    }

    public final void zzq() {
        this.zzi.incrementAndGet();
    }

    public final void zzr(Context context, zzcfo zzcfo) {
        zzbie zzbie;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = zzcfo;
                zzt.zzb().zzc(this.zzc);
                this.zzb.zzr(this.zze);
                zzbyy.zzb(this.zze, this.zzf);
                zzt.zze();
                if (!((Boolean) zzbjj.zzc.zze()).booleanValue()) {
                    zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbie = null;
                } else {
                    zzbie = new zzbie();
                }
                this.zzg = zzbie;
                if (zzbie != null) {
                    zzcfy.zza(new zzcen(this).zzb(), "AppState.registerCsiReporter");
                }
                if (PlatformVersion.isAtLeastO()) {
                    if (((Boolean) zzay.zzc().zzb(zzbhz.zzhc)).booleanValue()) {
                        ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzceo(this));
                    }
                }
                this.zzd = true;
                zzj();
            }
        }
        zzt.zzp().zzc(context, zzcfo.zza);
    }

    public final void zzs(Throwable th, String str) {
        zzbyy.zzb(this.zze, this.zzf).zze(th, str, ((Double) zzbjx.zzg.zze()).floatValue());
    }

    public final void zzt(Throwable th, String str) {
        zzbyy.zzb(this.zze, this.zzf).zzd(th, str);
    }

    public final void zzu(Boolean bool) {
        synchronized (this.zza) {
            this.zzh = bool;
        }
    }

    public final boolean zzv(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzhc)).booleanValue()) {
                return this.zzm.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
