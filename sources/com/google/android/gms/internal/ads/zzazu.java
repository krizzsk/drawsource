package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzazu extends Surface {
    private static boolean zza;
    private static boolean zzb;
    private final zzazs zzc;
    private boolean zzd;

    /* synthetic */ zzazu(zzazs zzazs, SurfaceTexture surfaceTexture, boolean z, zzazt zzazt) {
        super(surfaceTexture);
        this.zzc = zzazs;
    }

    public static zzazu zza(Context context, boolean z) {
        if (zzazo.zza >= 17) {
            boolean z2 = true;
            if (z && !zzb(context)) {
                z2 = false;
            }
            zzayz.zze(z2);
            return new zzazs().zza(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    public static synchronized boolean zzb(Context context) {
        boolean z;
        synchronized (zzazu.class) {
            if (!zzb) {
                if (zzazo.zza >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (zzazo.zza != 24 || ((!zzazo.zzd.startsWith("SM-G950") && !zzazo.zzd.startsWith("SM-G955")) || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
                            z2 = true;
                        }
                    }
                    zza = z2;
                }
                zzb = true;
            }
            z = zza;
        }
        return z;
    }

    public final void release() {
        super.release();
        synchronized (this.zzc) {
            if (!this.zzd) {
                this.zzc.zzb();
                this.zzd = true;
            }
        }
    }
}
