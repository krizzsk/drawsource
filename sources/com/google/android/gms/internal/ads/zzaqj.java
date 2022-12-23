package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaqj extends zzaqn {
    public zzaqj(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2) {
        super(zzapc, "tGUqnRBT0Z8VLsYZLT0IoD5T4HRaaLpJNvmxlM5fu89BQ2YOdHgaf4qUlK58s24H", "LZbLZn8XvuN809srP2sgyvIe+LVffcIatfOggVsL/5c=", zzali, i, 48);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzae(3);
        boolean booleanValue = ((Boolean) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb()})).booleanValue();
        synchronized (this.zze) {
            if (booleanValue) {
                this.zze.zzae(2);
            } else {
                this.zze.zzae(1);
            }
        }
    }
}
