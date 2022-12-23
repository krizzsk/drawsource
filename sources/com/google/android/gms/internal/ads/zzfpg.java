package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzfpg {
    /* access modifiers changed from: private */
    public final zzfoh zza;
    private final zzfpf zzb;

    private zzfpg(zzfpf zzfpf) {
        zzfog zzfog = zzfog.zza;
        this.zzb = zzfpf;
        this.zza = zzfog;
    }

    public static zzfpg zzb(int i) {
        return new zzfpg(new zzfpc(TTAdSdk.INIT_LOCAL_FAIL_CODE));
    }

    public static zzfpg zzc(zzfoh zzfoh) {
        return new zzfpg(new zzfpa(zzfoh));
    }

    /* access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        if (charSequence != null) {
            return new zzfpd(this, charSequence);
        }
        throw null;
    }

    public final List zzf(CharSequence charSequence) {
        Iterator zzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzg.hasNext()) {
            arrayList.add((String) zzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
