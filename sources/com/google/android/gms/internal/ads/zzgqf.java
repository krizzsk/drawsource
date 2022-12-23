package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public class zzgqf implements Iterator, Closeable, zzakp {
    private static final zzako zza = new zzgqe("eof ");
    private static final zzgqm zzb = zzgqm.zzb(zzgqf.class);
    protected zzakl zzc;
    protected zzgqg zzd;
    zzako zze = null;
    long zzf = 0;
    long zzg = 0;
    private final List zzh = new ArrayList();

    public void close() throws IOException {
    }

    public final boolean hasNext() {
        zzako zzako = this.zze;
        if (zzako == zza) {
            return false;
        }
        if (zzako != null) {
            return true;
        }
        try {
            this.zze = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zze = zza;
            return false;
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.zzh.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((zzako) this.zzh.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: zzd */
    public final zzako next() {
        zzako zzb2;
        zzako zzako = this.zze;
        if (zzako == null || zzako == zza) {
            zzgqg zzgqg = this.zzd;
            if (zzgqg == null || this.zzf >= this.zzg) {
                this.zze = zza;
                throw new NoSuchElementException();
            }
            try {
                synchronized (zzgqg) {
                    this.zzd.zze(this.zzf);
                    zzb2 = this.zzc.zzb(this.zzd, this);
                    this.zzf = this.zzd.zzb();
                }
                return zzb2;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        } else {
            this.zze = null;
            return zzako;
        }
    }

    public final List zze() {
        return (this.zzd == null || this.zze == zza) ? this.zzh : new zzgql(this.zzh, this);
    }

    public final void zzf(zzgqg zzgqg, long j, zzakl zzakl) throws IOException {
        this.zzd = zzgqg;
        this.zzf = zzgqg.zzb();
        zzgqg.zze(zzgqg.zzb() + j);
        this.zzg = zzgqg.zzb();
        this.zzc = zzakl;
    }
}
