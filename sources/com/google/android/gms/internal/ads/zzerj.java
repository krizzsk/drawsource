package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzerj implements zzetg {
    private final zzfvm zza;
    private final zzfcd zzb;
    private final PackageInfo zzc;
    private final zzg zzd;

    public zzerj(zzfvm zzfvm, zzfcd zzfcd, PackageInfo packageInfo, zzg zzg) {
        this.zza = zzfvm;
        this.zzb = zzfcd;
        this.zzc = packageInfo;
        this.zzd = zzg;
    }

    public static /* synthetic */ zzerk zzc(zzerj zzerj) {
        ArrayList arrayList = zzerj.zzb.zzg;
        if (arrayList == null) {
            return zzerf.zza;
        }
        return arrayList.isEmpty() ? zzerg.zza : new zzerh(zzerj, arrayList);
    }

    public final int zza() {
        return 26;
    }

    public final zzfvl zzb() {
        return this.zza.zzb(new zzeri(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        if (r9 == 3) goto L_0x0105;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zzd(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.String r0 = "native_version"
            r1 = 3
            r10.putInt(r0, r1)
            java.lang.String r0 = "native_templates"
            r10.putStringArrayList(r0, r9)
            com.google.android.gms.internal.ads.zzfcd r9 = r8.zzb
            java.util.ArrayList r9 = r9.zzh
            java.lang.String r0 = "native_custom_templates"
            r10.putStringArrayList(r0, r9)
            com.google.android.gms.internal.ads.zzfcd r9 = r8.zzb
            com.google.android.gms.internal.ads.zzbkp r9 = r9.zzi
            int r9 = r9.zza
            java.lang.String r0 = "landscape"
            java.lang.String r2 = "portrait"
            java.lang.String r3 = "any"
            java.lang.String r4 = "unknown"
            r5 = 2
            r6 = 1
            if (r9 <= r1) goto L_0x004f
            java.lang.String r9 = "enable_native_media_orientation"
            r10.putBoolean(r9, r6)
            com.google.android.gms.internal.ads.zzfcd r9 = r8.zzb
            com.google.android.gms.internal.ads.zzbkp r9 = r9.zzi
            int r9 = r9.zzh
            if (r9 == r6) goto L_0x0043
            if (r9 == r5) goto L_0x0041
            if (r9 == r1) goto L_0x003f
            r7 = 4
            if (r9 == r7) goto L_0x003c
            r9 = r4
            goto L_0x0044
        L_0x003c:
            java.lang.String r9 = "square"
            goto L_0x0044
        L_0x003f:
            r9 = r2
            goto L_0x0044
        L_0x0041:
            r9 = r0
            goto L_0x0044
        L_0x0043:
            r9 = r3
        L_0x0044:
            boolean r7 = r4.equals(r9)
            if (r7 != 0) goto L_0x004f
            java.lang.String r7 = "native_media_orientation"
            r10.putString(r7, r9)
        L_0x004f:
            com.google.android.gms.internal.ads.zzfcd r9 = r8.zzb
            com.google.android.gms.internal.ads.zzbkp r9 = r9.zzi
            int r9 = r9.zzc
            if (r9 == 0) goto L_0x005f
            if (r9 == r6) goto L_0x005d
            if (r9 == r5) goto L_0x0060
            r0 = r4
            goto L_0x0060
        L_0x005d:
            r0 = r2
            goto L_0x0060
        L_0x005f:
            r0 = r3
        L_0x0060:
            boolean r9 = r4.equals(r0)
            if (r9 != 0) goto L_0x006b
            java.lang.String r9 = "native_image_orientation"
            r10.putString(r9, r0)
        L_0x006b:
            com.google.android.gms.internal.ads.zzfcd r9 = r8.zzb
            com.google.android.gms.internal.ads.zzbkp r9 = r9.zzi
            boolean r9 = r9.zzd
            java.lang.String r0 = "native_multiple_images"
            r10.putBoolean(r0, r9)
            com.google.android.gms.internal.ads.zzfcd r9 = r8.zzb
            com.google.android.gms.internal.ads.zzbkp r9 = r9.zzi
            boolean r9 = r9.zzg
            java.lang.String r0 = "use_custom_mute"
            r10.putBoolean(r0, r9)
            android.content.pm.PackageInfo r9 = r8.zzc
            if (r9 != 0) goto L_0x0087
            r9 = 0
            goto L_0x0089
        L_0x0087:
            int r9 = r9.versionCode
        L_0x0089:
            com.google.android.gms.ads.internal.util.zzg r0 = r8.zzd
            int r0 = r0.zza()
            if (r9 <= r0) goto L_0x009b
            com.google.android.gms.ads.internal.util.zzg r0 = r8.zzd
            r0.zzs()
            com.google.android.gms.ads.internal.util.zzg r0 = r8.zzd
            r0.zzv(r9)
        L_0x009b:
            com.google.android.gms.ads.internal.util.zzg r9 = r8.zzd
            org.json.JSONObject r9 = r9.zzp()
            r0 = 0
            if (r9 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.zzfcd r2 = r8.zzb
            java.lang.String r2 = r2.zzf
            org.json.JSONArray r9 = r9.optJSONArray(r2)
            if (r9 == 0) goto L_0x00b2
            java.lang.String r0 = r9.toString()
        L_0x00b2:
            boolean r9 = android.text.TextUtils.isEmpty(r0)
            if (r9 != 0) goto L_0x00bd
            java.lang.String r9 = "native_advanced_settings"
            r10.putString(r9, r0)
        L_0x00bd:
            com.google.android.gms.internal.ads.zzfcd r9 = r8.zzb
            int r9 = r9.zzk
            if (r9 <= r6) goto L_0x00c8
            java.lang.String r0 = "max_num_ads"
            r10.putInt(r0, r9)
        L_0x00c8:
            com.google.android.gms.internal.ads.zzfcd r9 = r8.zzb
            com.google.android.gms.internal.ads.zzbqs r9 = r9.zzb
            if (r9 == 0) goto L_0x0117
            java.lang.String r0 = r9.zzc
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x010b
            int r0 = r9.zza
            java.lang.String r2 = "p"
            java.lang.String r3 = "l"
            if (r0 < r5) goto L_0x00e5
            int r9 = r9.zzd
            if (r9 == r5) goto L_0x0104
            if (r9 == r1) goto L_0x0105
            goto L_0x0104
        L_0x00e5:
            int r9 = r9.zzb
            if (r9 == r6) goto L_0x0104
            if (r9 == r5) goto L_0x0105
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Instream ad video aspect ratio "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = " is wrong."
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.google.android.gms.internal.ads.zzcfi.zzg(r9)
        L_0x0104:
            r2 = r3
        L_0x0105:
            java.lang.String r9 = "ia_var"
            r10.putString(r9, r2)
            goto L_0x0112
        L_0x010b:
            java.lang.String r9 = r9.zzc
            java.lang.String r0 = "ad_tag"
            r10.putString(r0, r9)
        L_0x0112:
            java.lang.String r9 = "instr"
            r10.putBoolean(r9, r6)
        L_0x0117:
            com.google.android.gms.internal.ads.zzfcd r9 = r8.zzb
            com.google.android.gms.internal.ads.zzbms r9 = r9.zza()
            if (r9 == 0) goto L_0x0124
            java.lang.String r9 = "has_delayed_banner_listener"
            r10.putBoolean(r9, r6)
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzerj.zzd(java.util.ArrayList, android.os.Bundle):void");
    }
}
