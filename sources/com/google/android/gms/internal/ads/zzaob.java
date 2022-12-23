package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaob extends zzaoa {
    protected zzaob(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static zzaob zzs(String str, Context context, boolean z) {
        zzq(context, false);
        return new zzaob(context, str, false);
    }

    @Deprecated
    public static zzaob zzt(String str, Context context, boolean z, int i) {
        zzq(context, z);
        return new zzaob(context, str, z);
    }

    /* access modifiers changed from: protected */
    public final List zzo(zzapc zzapc, Context context, zzali zzali, zzalb zzalb) {
        if (zzapc.zzk() == null || !this.zzt) {
            return super.zzo(zzapc, context, zzali, (zzalb) null);
        }
        int zza = zzapc.zza();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zzo(zzapc, context, zzali, (zzalb) null));
        arrayList.add(new zzapt(zzapc, "Za6LxNnVxz2lEtZQYrJ2QLB5PwaCpmcdWBAdgk+Rc+b6fjcW8QKpJ7ITar8M3xU9", "2mbuydE9pw99Ld1EHQbedo6oUJcW1o/QWNiH9X+lcIw=", zzali, zza, 24));
        return arrayList;
    }
}
