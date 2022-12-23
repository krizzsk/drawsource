package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbyy implements zzbza {
    static zzbza zza = null;
    static zzbza zzb = null;
    private static final Object zzc = new Object();
    private final Object zzd = new Object();
    private final Context zze;
    private final WeakHashMap zzf = new WeakHashMap();
    private final ExecutorService zzg;
    private final zzcfo zzh;

    protected zzbyy(Context context, zzcfo zzcfo) {
        zzfnv.zza();
        this.zzg = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zze = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzh = zzcfo;
    }

    public static zzbza zza(Context context) {
        synchronized (zzc) {
            if (zza == null) {
                if (((Boolean) zzbjx.zze.zze()).booleanValue()) {
                    if (!((Boolean) zzay.zzc().zzb(zzbhz.zzgz)).booleanValue()) {
                        zza = new zzbyy(context, zzcfo.zza());
                    }
                }
                zza = new zzbyz();
            }
        }
        return zza;
    }

    public static zzbza zzb(Context context, zzcfo zzcfo) {
        synchronized (zzc) {
            if (zzb == null) {
                if (((Boolean) zzbjx.zze.zze()).booleanValue()) {
                    if (!((Boolean) zzay.zzc().zzb(zzbhz.zzgz)).booleanValue()) {
                        zzbyy zzbyy = new zzbyy(context, zzcfo);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzbyy.zzd) {
                                zzbyy.zzf.put(thread, true);
                            }
                            thread.setUncaughtExceptionHandler(new zzbyx(zzbyy, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzbyw(zzbyy, Thread.getDefaultUncaughtExceptionHandler()));
                        zzb = zzbyy;
                    }
                }
                zzb = new zzbyz();
            }
        }
        return zzb;
    }

    /* access modifiers changed from: protected */
    public final void zzc(Thread thread, Throwable th) {
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= zzcfb.zzn(stackTraceElement.getClassName());
                    z2 |= getClass().getName().equals(stackTraceElement.getClassName());
                }
            }
            if (z && !z2) {
                zze(th, "", 1.0f);
            }
        }
    }

    public final void zzd(Throwable th, String str) {
        zze(th, str, 1.0f);
    }

    public final void zze(Throwable th, String str, float f) {
        boolean z;
        String str2;
        if (zzcfb.zzf(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            double d = (double) f;
            double random = Math.random();
            int i = f > 0.0f ? (int) (1.0f / f) : 1;
            if (random < d) {
                ArrayList<String> arrayList = new ArrayList<>();
                try {
                    z = Wrappers.packageManager(this.zze).isCallerInstantApp();
                } catch (Throwable th2) {
                    zzcfi.zzh("Error fetching instant app info", th2);
                    z = false;
                }
                try {
                    str2 = this.zze.getPackageName();
                } catch (Throwable unused) {
                    zzcfi.zzj("Cannot obtain package name, proceeding.");
                    str2 = "unknown";
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    str4 = str3 + " " + str4;
                }
                arrayList.add(appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.zzh.zza).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", stringWriter2).appendQueryParameter("eids", TextUtils.join(",", zzbhz.zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "458339781").appendQueryParameter(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT, "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzbjx.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze))).appendQueryParameter("lite", true != this.zzh.zze ? "0" : "1").toString());
                for (String zzbyv : arrayList) {
                    this.zzg.execute(new zzbyv(new zzcfn((String) null), zzbyv));
                }
            }
        }
    }
}
