package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzeoc implements zzetf {
    public final /* synthetic */ ArrayList zza;

    public /* synthetic */ zzeoc(ArrayList arrayList) {
        this.zza = arrayList;
    }

    public final void zzf(Object obj) {
        ((Bundle) obj).putStringArrayList("ad_types", this.zza);
    }
}
