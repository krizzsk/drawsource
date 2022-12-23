package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfyg extends zzgar {
    final /* synthetic */ zzfyh zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfyg(zzfyh zzfyh, Class cls) {
        super(cls);
        this.zza = zzfyh;
    }

    public final /* bridge */ /* synthetic */ zzgma zza(zzgma zzgma) throws GeneralSecurityException {
        zzgdl zzgdl = (zzgdl) zzgma;
        zzgdh zzc = zzgdi.zzc();
        zzc.zzb(0);
        zzc.zza(zzgji.zzv(zzgik.zza(32)));
        return (zzgdi) zzc.zzal();
    }

    public final /* synthetic */ zzgma zzb(zzgji zzgji) throws zzglc {
        return zzgdl.zzd(zzgji, zzgkc.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new zzgaq(zzgdl.zzc(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new zzgaq(zzgdl.zzc(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgma) throws GeneralSecurityException {
        zzgdl zzgdl = (zzgdl) zzgma;
    }
}
