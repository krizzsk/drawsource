package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaqc extends zzaqn {
    public zzaqc(zzapc zzapc, String str, String str2, zzali zzali, int i, int i2) {
        super(zzapc, "sQRnRw5AtmLjG4zPuRRzbU9KCNWkvhkIESw7dU0UKjciZOTbDwuGbxSLRs8Rwqdx", "QTFg2pa0CDlg9dgYpioKGLNjWwgLSvJpA082RZAjjog=", zzali, i, 73);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb()})).booleanValue();
            zzali zzali = this.zze;
            if (true == booleanValue) {
                i = 2;
            }
            zzali.zzad(i);
        } catch (InvocationTargetException unused) {
            this.zze.zzad(3);
        }
    }
}
