package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeog implements zzetg {
    private final zzfvm zza;
    private final zzduc zzb;
    private final zzdyj zzc;
    private final zzeoj zzd;

    public zzeog(zzfvm zzfvm, zzduc zzduc, zzdyj zzdyj, zzeoj zzeoj) {
        this.zza = zzfvm;
        this.zzb = zzduc;
        this.zzc = zzdyj;
        this.zzd = zzeoj;
    }

    public final int zza() {
        return 1;
    }

    public final zzfvl zzb() {
        if (zzfpi.zzd((String) zzay.zzc().zzb(zzbhz.zzbk)) || this.zzd.zzb() || !this.zzc.zzt()) {
            return zzfvc.zzi(new zzeoi(new Bundle(), (zzeoh) null));
        }
        this.zzd.zza(true);
        return this.zza.zzb(new zzeof(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:4|5|6|7|8|(1:10)|11|12|(1:14)|15|16|21|19|1) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x004d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005c */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053 A[Catch:{ zzfci -> 0x005c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzeoi zzc() throws java.lang.Exception {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbhr r0 = com.google.android.gms.internal.ads.zzbhz.zzbk
            com.google.android.gms.internal.ads.zzbhx r1 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ";"
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0060
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.zzduc r3 = r7.zzb     // Catch:{ zzfci -> 0x001f }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ zzfci -> 0x001f }
            r4.<init>()     // Catch:{ zzfci -> 0x001f }
            com.google.android.gms.internal.ads.zzfcy r3 = r3.zzc(r2, r4)     // Catch:{ zzfci -> 0x001f }
            r3.zzA()     // Catch:{ zzfci -> 0x001f }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ zzfci -> 0x001f }
            r4.<init>()     // Catch:{ zzfci -> 0x001f }
            com.google.android.gms.internal.ads.zzbwg r5 = r3.zzf()     // Catch:{ zzfci -> 0x004d }
            if (r5 == 0) goto L_0x004d
            java.lang.String r6 = "sdk_version"
            java.lang.String r5 = r5.toString()     // Catch:{ zzfci -> 0x004d }
            r4.putString(r6, r5)     // Catch:{ zzfci -> 0x004d }
        L_0x004d:
            com.google.android.gms.internal.ads.zzbwg r3 = r3.zze()     // Catch:{ zzfci -> 0x005c }
            if (r3 == 0) goto L_0x005c
            java.lang.String r5 = "adapter_version"
            java.lang.String r3 = r3.toString()     // Catch:{ zzfci -> 0x005c }
            r4.putString(r5, r3)     // Catch:{ zzfci -> 0x005c }
        L_0x005c:
            r1.putBundle(r2, r4)     // Catch:{ zzfci -> 0x001f }
            goto L_0x001f
        L_0x0060:
            com.google.android.gms.internal.ads.zzeoi r0 = new com.google.android.gms.internal.ads.zzeoi
            r2 = 0
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeog.zzc():com.google.android.gms.internal.ads.zzeoi");
    }
}
