package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzex implements zzeq {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzeq zzc;
    private zzeq zzd;
    private zzeq zze;
    private zzeq zzf;
    private zzeq zzg;
    private zzeq zzh;
    private zzeq zzi;
    private zzeq zzj;
    private zzeq zzk;

    public zzex(Context context, zzeq zzeq) {
        this.zza = context.getApplicationContext();
        this.zzc = zzeq;
    }

    private final zzeq zzg() {
        if (this.zze == null) {
            zzej zzej = new zzej(this.zza);
            this.zze = zzej;
            zzh(zzej);
        }
        return this.zze;
    }

    private final void zzh(zzeq zzeq) {
        for (int i = 0; i < this.zzb.size(); i++) {
            zzeq.zzf((zzfs) this.zzb.get(i));
        }
    }

    private static final void zzi(zzeq zzeq, zzfs zzfs) {
        if (zzeq != null) {
            zzeq.zzf(zzfs);
        }
    }

    public final long zzb(zzev zzev) throws IOException {
        zzeq zzeq;
        zzcw.zzf(this.zzk == null);
        String scheme = zzev.zza.getScheme();
        if (zzeg.zzV(zzev.zza)) {
            String path = zzev.zza.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzfg zzfg = new zzfg();
                    this.zzd = zzfg;
                    zzh(zzfg);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzg();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzg();
        } else if ("content".equals(scheme)) {
            if (this.zzf == null) {
                zzen zzen = new zzen(this.zza);
                this.zzf = zzen;
                zzh(zzen);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzeq zzeq2 = (zzeq) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.zzg = zzeq2;
                    zzh(zzeq2);
                } catch (ClassNotFoundException unused) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzfu zzfu = new zzfu(2000);
                this.zzh = zzfu;
                zzh(zzfu);
            }
            this.zzk = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                zzeo zzeo = new zzeo();
                this.zzi = zzeo;
                zzh(zzeo);
            }
            this.zzk = this.zzi;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzfq zzfq = new zzfq(this.zza);
                    this.zzj = zzfq;
                    zzh(zzfq);
                }
                zzeq = this.zzj;
            } else {
                zzeq = this.zzc;
            }
            this.zzk = zzeq;
        }
        return this.zzk.zzb(zzev);
    }

    public final Uri zzc() {
        zzeq zzeq = this.zzk;
        if (zzeq == null) {
            return null;
        }
        return zzeq.zzc();
    }

    public final void zzd() throws IOException {
        zzeq zzeq = this.zzk;
        if (zzeq != null) {
            try {
                zzeq.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    public final Map zze() {
        zzeq zzeq = this.zzk;
        return zzeq == null ? Collections.emptyMap() : zzeq.zze();
    }

    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        zzeq zzeq = this.zzk;
        if (zzeq != null) {
            return zzeq.zza(bArr, i, i2);
        }
        throw null;
    }

    public final void zzf(zzfs zzfs) {
        if (zzfs != null) {
            this.zzc.zzf(zzfs);
            this.zzb.add(zzfs);
            zzi(this.zzd, zzfs);
            zzi(this.zze, zzfs);
            zzi(this.zzf, zzfs);
            zzi(this.zzg, zzfs);
            zzi(this.zzh, zzfs);
            zzi(this.zzi, zzfs);
            zzi(this.zzj, zzfs);
            return;
        }
        throw null;
    }
}
