package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzesv implements zzetg {
    private final zzfvm zza;
    private final Context zzb;
    private final zzcfo zzc;

    public zzesv(zzfvm zzfvm, Context context, zzcfo zzcfo) {
        this.zza = zzfvm;
        this.zzb = context;
        this.zzc = zzcfo;
    }

    public final int zza() {
        return 35;
    }

    public final zzfvl zzb() {
        return this.zza.zzb(new zzesu(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzesw zzc() throws Exception {
        int i;
        boolean isCallerInstantApp = Wrappers.packageManager(this.zzb).isCallerInstantApp();
        zzt.zzp();
        boolean zzA = zzs.zzA(this.zzb);
        String str = this.zzc.zza;
        zzt.zzp();
        boolean zzB = zzs.zzB();
        zzt.zzp();
        ApplicationInfo applicationInfo = this.zzb.getApplicationInfo();
        if (applicationInfo == null) {
            i = 0;
        } else {
            i = applicationInfo.targetSdkVersion;
        }
        return new zzesw(isCallerInstantApp, zzA, str, zzB, i, DynamiteModule.getRemoteVersion(this.zzb, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(this.zzb, ModuleDescriptor.MODULE_ID));
    }
}
