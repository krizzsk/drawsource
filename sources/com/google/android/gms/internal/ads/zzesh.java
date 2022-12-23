package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzesh implements zzetf {
    private final String zza;

    public zzesh(String str) {
        this.zza = str;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        ((Bundle) obj).putString("rtb", this.zza);
    }
}
