package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfyq extends zzgar {
    final /* synthetic */ zzfyr zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfyq(zzfyr zzfyr, Class cls) {
        super(cls);
        this.zza = zzfyr;
    }

    public final /* bridge */ /* synthetic */ zzgma zza(zzgma zzgma) throws GeneralSecurityException {
        zzggy zzggy = (zzggy) zzgma;
        zzggu zzc = zzggv.zzc();
        zzc.zzb(0);
        zzc.zza(zzgji.zzv(zzgik.zza(32)));
        return (zzggv) zzc.zzal();
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzggy.zzd(zzgji, zzgkc.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new zzgaq(zzggy.zzc(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new zzgaq(zzggy.zzc(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzggy zzggy = (zzggy) zzgma;
    }
}
