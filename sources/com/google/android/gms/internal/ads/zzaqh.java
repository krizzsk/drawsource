package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaqh extends zzaqn {
    private final zzapj zzi;
    private long zzj;

    public zzaqh(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2, zzapj zzapj) {
        super(zzapc, "03Rb8b+VDPWNz2ZsdwvaSzyRMvfwK65RukwsWnYSmw87NOTFb26HoizUZBquofyN", "4NlIZpWANWCeruMUGSc5tEkf3o6K0hyRt+/1nSu0QU8=", zzali, i, 53);
        this.zzi = zzapj;
        if (zzapj != null) {
            this.zzj = zzapj.zza();
        }
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            this.zze.zzO(((Long) this.zzf.invoke((Object) null, new Object[]{Long.valueOf(this.zzj)})).longValue());
        }
    }
}
