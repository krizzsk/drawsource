package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
abstract class zzfum extends zzfuc {
    @CheckForNull
    private List zza;

    zzfum(zzfre zzfre, boolean z) {
        super(zzfre, true, true);
        List list;
        if (zzfre.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = zzfrx.zza(zzfre.size());
        }
        for (int i = 0; i < zzfre.size(); i++) {
            list.add((Object) null);
        }
        this.zza = list;
    }

    /* access modifiers changed from: package-private */
    public abstract Object zzG(List list);

    /* access modifiers changed from: package-private */
    public final void zzg(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzful(obj));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzv() {
        List list = this.zza;
        if (list != null) {
            zzd(zzG(list));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzz(int i) {
        super.zzz(i);
        this.zza = null;
    }
}
