package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaqi extends zzaqn {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzaqi(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2) {
        super(zzapc, "oSBV0gkM1yTotHLC+K1O/2QESKvM1OzdR7LLRpJm660IC9CZK+wk8pHl5h8TdV48", "A3Rh/mKF+88qDRUgTtU47eZJOyPh9v2tsYzP/5oF+dA=", zzali, i, 33);
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
            this.zze.zzU(zzi.longValue());
        }
    }
}
