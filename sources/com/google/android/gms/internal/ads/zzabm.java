package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzabm extends zzacb {
    public static final Parcelable.Creator<zzabm> CREATOR = new zzabl();
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    zzabm(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = zzeg.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = (byte[]) zzeg.zzG(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzabm zzabm = (zzabm) obj;
            return this.zzc == zzabm.zzc && zzeg.zzS(this.zza, zzabm.zza) && zzeg.zzS(this.zzb, zzabm.zzb) && Arrays.equals(this.zzd, zzabm.zzd);
        }
    }

    public final int hashCode() {
        int i = (this.zzc + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.zza;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzb;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.zzd);
    }

    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String str3 = this.zzb;
        return str + ": mimeType=" + str2 + ", description=" + str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public final void zza(zzbf zzbf) {
        zzbf.zza(this.zzd, this.zzc);
    }

    public zzabm(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = bArr;
    }
}
