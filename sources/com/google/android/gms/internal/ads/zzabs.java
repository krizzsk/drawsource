package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzabs extends zzacb {
    public static final Parcelable.Creator<zzabs> CREATOR = new zzabr();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzacb[] zze;

    zzabs(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = zzeg.zza;
        this.zza = readString;
        boolean z = true;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() == 0 ? false : z;
        this.zzd = (String[]) zzeg.zzG(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.zze = new zzacb[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.zze[i2] = (zzacb) parcel.readParcelable(zzacb.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzabs zzabs = (zzabs) obj;
            return this.zzb == zzabs.zzb && this.zzc == zzabs.zzc && zzeg.zzS(this.zza, zzabs.zza) && Arrays.equals(this.zzd, zzabs.zzd) && Arrays.equals(this.zze, zzabs.zze);
        }
    }

    public final int hashCode() {
        int i = ((((this.zzb ? 1 : 0) + true) * 31) + (this.zzc ? 1 : 0)) * 31;
        String str = this.zza;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : 0);
        parcel.writeByte(this.zzc ? (byte) 1 : 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzacb writeParcelable : this.zze) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public zzabs(String str, boolean z, boolean z2, String[] strArr, zzacb[] zzacbArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzacbArr;
    }
}
