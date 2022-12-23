package com.google.android.gms.internal.ads;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaqa extends zzaqn {
    private static volatile String zzi;
    private static final Object zzj = new Object();

    public zzaqa(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2) {
        super(zzapc, "DNoIUzNgQ+tGaWufI617pdeOeFxPy3ypVgJRNb/REDqvDPWkZ+hwt80uPBr78PA1", "keEhYPq98yaHF5Dzpggt8ckKDSAXe9vFpWufiQ8oXDY=", zzali, i, 1);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzA(ExifInterface.LONGITUDE_EAST);
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (String) this.zzf.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzA(zzi);
        }
    }
}
