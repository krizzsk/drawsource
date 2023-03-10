package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzty {
    public static final zzty zza = new zzty(new zzck[0]);
    public static final zzl zzb = zztx.zza;
    public final int zzc;
    private final zzfrj zzd;
    private int zze;

    public zzty(zzck... zzckArr) {
        this.zzd = zzfrj.zzn(zzckArr);
        this.zzc = zzckArr.length;
        int i = 0;
        while (i < this.zzd.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.zzd.size(); i3++) {
                if (((zzck) this.zzd.get(i)).equals(this.zzd.get(i3))) {
                    zzdn.zza("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzty zzty = (zzty) obj;
            return this.zzc == zzty.zzc && this.zzd.equals(zzty.zzd);
        }
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int hashCode = this.zzd.hashCode();
        this.zze = hashCode;
        return hashCode;
    }

    public final int zza(zzck zzck) {
        int indexOf = this.zzd.indexOf(zzck);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final zzck zzb(int i) {
        return (zzck) this.zzd.get(i);
    }
}
