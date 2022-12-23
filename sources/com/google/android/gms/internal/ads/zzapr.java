package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzapr extends zzaqn {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzapr(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2) {
        super(zzapc, "NuaVE443qhtP6/N+u8tA8HilHNLFyQFq7pn4MjW5OGwcdLTSMQ1k8XjYehsxVeon", "z5NXQuc0uiNSVbndYdMaUlJv3uv2TfesAU8D9T9pl4E=", zzali, i, 44);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzn(zzi.longValue());
        }
    }
}
