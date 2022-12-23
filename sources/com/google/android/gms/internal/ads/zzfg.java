package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfg extends zzek {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzfg() {
        super(false);
    }

    public final int zza(byte[] bArr, int i, int i2) throws zzff {
        if (i2 == 0) {
            return 0;
        }
        if (this.zzc == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            int i3 = zzeg.zza;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(this.zzc, (long) i2));
            if (read > 0) {
                this.zzc -= (long) read;
                zzg(read);
            }
            return read;
        } catch (IOException e) {
            throw new zzff(e, 2000);
        }
    }

    public final long zzb(zzev zzev) throws zzff {
        Uri uri = zzev.zza;
        this.zzb = uri;
        zzi(zzev);
        int i = 2006;
        try {
            String path = uri.getPath();
            if (path != null) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(path, CampaignEx.JSON_KEY_AD_R);
                this.zza = randomAccessFile;
                try {
                    randomAccessFile.seek(zzev.zzf);
                    long j = zzev.zzg;
                    if (j == -1) {
                        j = this.zza.length() - zzev.zzf;
                    }
                    this.zzc = j;
                    if (j >= 0) {
                        this.zzd = true;
                        zzj(zzev);
                        return this.zzc;
                    }
                    throw new zzff((String) null, (Throwable) null, 2008);
                } catch (IOException e) {
                    throw new zzff(e, 2000);
                }
            } else {
                throw null;
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new zzff(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e2, 1004);
            }
            if (zzeg.zza < 21 || !zzfe.zzb(e2.getCause())) {
                i = 2005;
            }
            throw new zzff(e2, i);
        } catch (SecurityException e3) {
            throw new zzff(e3, 2006);
        } catch (RuntimeException e4) {
            throw new zzff(e4, 2000);
        }
    }

    public final Uri zzc() {
        return this.zzb;
    }

    public final void zzd() throws zzff {
        this.zzb = null;
        try {
            RandomAccessFile randomAccessFile = this.zza;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzh();
            }
        } catch (IOException e) {
            throw new zzff(e, 2000);
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzh();
            }
            throw th;
        }
    }
}
