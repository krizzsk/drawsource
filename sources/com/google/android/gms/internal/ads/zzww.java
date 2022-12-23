package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzww extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzwu zzd;
    private boolean zze;

    /* synthetic */ zzww(zzwu zzwu, SurfaceTexture surfaceTexture, boolean z, zzwv zzwv) {
        super(surfaceTexture);
        this.zzd = zzwu;
        this.zza = z;
    }

    public static zzww zza(Context context, boolean z) {
        int i = 0;
        boolean z2 = true;
        if (z && !zzb(context)) {
            z2 = false;
        }
        zzcw.zzf(z2);
        zzwu zzwu = new zzwu();
        if (z) {
            i = zzb;
        }
        return zzwu.zza(i);
    }

    public static synchronized boolean zzb(Context context) {
        int i;
        synchronized (zzww.class) {
            if (!zzc) {
                int i2 = 2;
                if (zzeg.zza >= 24) {
                    if (zzeg.zza < 26) {
                        if (!"samsung".equals(zzeg.zzc)) {
                            if ("XT1650".equals(zzeg.zzd)) {
                            }
                        }
                    }
                    if (zzeg.zza >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                            String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                            if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                                i2 = 1;
                            }
                            zzb = i2;
                            zzc = true;
                        }
                    }
                }
                i2 = 0;
                zzb = i2;
                zzc = true;
            }
            i = zzb;
        }
        return i != 0;
    }

    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
