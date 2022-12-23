package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdyj {
    private boolean zza = false;
    private boolean zzb = false;
    /* access modifiers changed from: private */
    public boolean zzc = false;
    /* access modifiers changed from: private */
    public final long zzd;
    /* access modifiers changed from: private */
    public final zzcga zze = new zzcga();
    private final Context zzf;
    private final WeakReference zzg;
    private final zzduc zzh;
    /* access modifiers changed from: private */
    public final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    /* access modifiers changed from: private */
    public final zzdwq zzl;
    private final zzcfo zzm;
    private final Map zzn = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public final zzdik zzo;
    /* access modifiers changed from: private */
    public final zzfhu zzp;
    private boolean zzq = true;

    public zzdyj(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzduc zzduc, ScheduledExecutorService scheduledExecutorService, zzdwq zzdwq, zzcfo zzcfo, zzdik zzdik, zzfhu zzfhu) {
        this.zzh = zzduc;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdwq;
        this.zzm = zzcfo;
        this.zzo = zzdik;
        this.zzp = zzfhu;
        this.zzd = zzt.zzA().elapsedRealtime();
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static /* bridge */ /* synthetic */ void zzj(zzdyj zzdyj, String str) {
        zzdyj zzdyj2 = zzdyj;
        int i = 5;
        zzfhh zza2 = zzfhg.zza(zzdyj2.zzf, 5);
        zza2.zzf();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                zzfhh zza3 = zzfhg.zza(zzdyj2.zzf, i);
                zza3.zzf();
                zza3.zzc(next);
                Object obj = new Object();
                zzcga zzcga = new zzcga();
                zzfvl zzo2 = zzfvc.zzo(zzcga, ((Long) zzay.zzc().zzb(zzbhz.zzbz)).longValue(), TimeUnit.SECONDS, zzdyj2.zzk);
                zzdyj2.zzl.zzc(next);
                zzdyj2.zzo.zzc(next);
                long elapsedRealtime = zzt.zzA().elapsedRealtime();
                zzdya zzdya = r1;
                zzfvl zzfvl = zzo2;
                zzdya zzdya2 = new zzdya(zzdyj, obj, zzcga, next, elapsedRealtime, zza3);
                zzfvl.zzc(zzdya, zzdyj2.zzi);
                arrayList.add(zzfvl);
                zzdyi zzdyi = new zzdyi(zzdyj, obj, next, elapsedRealtime, zza3, zzcga);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbqq(optString, bundle));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdyj2.zzv(next, false, "", 0);
                try {
                    zzdyj2.zzj.execute(new zzdye(zzdyj, zzdyj2.zzh.zzc(next, new JSONObject()), zzdyi, arrayList2, next));
                } catch (zzfci unused2) {
                    try {
                        zzdyi.zze("Failed to create Adapter.");
                    } catch (RemoteException e) {
                        zzcfi.zzh("", e);
                    }
                }
                i = 5;
            }
            zzfvc.zza(arrayList).zza(new zzdyb(zzdyj2, zza2), zzdyj2.zzi);
        } catch (JSONException e2) {
            zze.zzb("Malformed CLD response", e2);
            zzdyj2.zzo.zza("MalformedJson");
            zzdyj2.zzl.zza("MalformedJson");
            zzdyj2.zze.zze(e2);
            zzt.zzo().zzt(e2, "AdapterInitializer.updateAdapterStatus");
            zzfhu zzfhu = zzdyj2.zzp;
            zza2.zze(false);
            zzfhu.zzb(zza2.zzj());
        }
    }

    private final synchronized zzfvl zzu() {
        String zzc2 = zzt.zzo().zzh().zzh().zzc();
        if (!TextUtils.isEmpty(zzc2)) {
            return zzfvc.zzi(zzc2);
        }
        zzcga zzcga = new zzcga();
        zzt.zzo().zzh().zzq(new zzdyf(this, zzcga));
        return zzcga;
    }

    /* access modifiers changed from: private */
    public final void zzv(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzbqg(str, z, i, str2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzf(zzfhh zzfhh) throws Exception {
        this.zze.zzd(true);
        zzfhu zzfhu = this.zzp;
        zzfhh.zze(true);
        zzfhu.zzb(zzfhh.zzj());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbqg zzbqg = (zzbqg) this.zzn.get(str);
            arrayList.add(new zzbqg(str, zzbqg.zzb, zzbqg.zzc, zzbqg.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        synchronized (this) {
            if (!this.zzc) {
                zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (zzt.zzA().elapsedRealtime() - this.zzd));
                this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                this.zze.zze(new Exception());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        com.google.android.gms.internal.ads.zzcfi.zzh("", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3.zze("Failed to initialize adapter. " + r5 + " does not implement the initialize() method.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zzn(com.google.android.gms.internal.ads.zzfcy r2, com.google.android.gms.internal.ads.zzbqk r3, java.util.List r4, java.lang.String r5) {
        /*
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.zzg     // Catch:{ zzfci -> 0x0011 }
            java.lang.Object r0 = r0.get()     // Catch:{ zzfci -> 0x0011 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ zzfci -> 0x0011 }
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            android.content.Context r0 = r1.zzf     // Catch:{ zzfci -> 0x0011 }
        L_0x000d:
            r2.zzi(r0, r3, r4)     // Catch:{ zzfci -> 0x0011 }
            return
        L_0x0011:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x002b }
            r2.<init>()     // Catch:{ RemoteException -> 0x002b }
            java.lang.String r4 = "Failed to initialize adapter. "
            r2.append(r4)     // Catch:{ RemoteException -> 0x002b }
            r2.append(r5)     // Catch:{ RemoteException -> 0x002b }
            java.lang.String r4 = " does not implement the initialize() method."
            r2.append(r4)     // Catch:{ RemoteException -> 0x002b }
            java.lang.String r2 = r2.toString()     // Catch:{ RemoteException -> 0x002b }
            r3.zze(r2)     // Catch:{ RemoteException -> 0x002b }
            return
        L_0x002b:
            r2 = move-exception
            java.lang.String r3 = ""
            com.google.android.gms.internal.ads.zzcfi.zzh(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdyj.zzn(com.google.android.gms.internal.ads.zzfcy, com.google.android.gms.internal.ads.zzbqk, java.util.List, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(zzcga zzcga) {
        this.zzi.execute(new zzdxy(this, zzcga));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(Object obj, zzcga zzcga, String str, long j, zzfhh zzfhh) {
        synchronized (obj) {
            if (!zzcga.isDone()) {
                zzv(str, false, "Timeout.", (int) (zzt.zzA().elapsedRealtime() - j));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzfhu zzfhu = this.zzp;
                zzfhh.zze(false);
                zzfhu.zzb(zzfhh.zzj());
                zzcga.zzd(false);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbju.zza.zze()).booleanValue()) {
            if (this.zzm.zzc >= ((Integer) zzay.zzc().zzb(zzbhz.zzby)).intValue() && this.zzq) {
                if (!this.zza) {
                    synchronized (this) {
                        if (!this.zza) {
                            this.zzl.zzf();
                            this.zzo.zzf();
                            this.zze.zzc(new zzdxz(this), this.zzi);
                            this.zza = true;
                            zzfvl zzu = zzu();
                            this.zzk.schedule(new zzdyc(this), ((Long) zzay.zzc().zzb(zzbhz.zzbA)).longValue(), TimeUnit.SECONDS);
                            zzfvc.zzr(zzu, new zzdyh(this), this.zzi);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        if (!this.zza) {
            zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
            this.zze.zzd(false);
            this.zza = true;
            this.zzb = true;
        }
    }

    public final void zzs(zzbqn zzbqn) {
        this.zze.zzc(new zzdyd(this, zzbqn), this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
