package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfug extends zzfue {
    private zzfug() {
        super((zzfud) null);
    }

    /* synthetic */ zzfug(zzfud zzfud) {
        super((zzfud) null);
    }

    /* access modifiers changed from: package-private */
    public final int zza(zzfuh zzfuh) {
        int zzA;
        synchronized (zzfuh) {
            zzA = zzfuh.zzA(zzfuh);
        }
        return zzA;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzfuh zzfuh, @CheckForNull Set set, Set set2) {
        synchronized (zzfuh) {
            if (zzfuh.seenExceptions == null) {
                Set unused = zzfuh.seenExceptions = set2;
            }
        }
    }
}
