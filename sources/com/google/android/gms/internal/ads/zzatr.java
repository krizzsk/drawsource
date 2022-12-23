package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzatr implements Parcelable {
    public static final Parcelable.Creator<zzatr> CREATOR = new zzatq();
    public final String zza;
    public final byte[] zzb;
    public final boolean zzc;
    private int zzd;
    /* access modifiers changed from: private */
    public final UUID zze;

    zzatr(Parcel parcel) {
        this.zze = new UUID(parcel.readLong(), parcel.readLong());
        this.zza = parcel.readString();
        this.zzb = parcel.createByteArray();
        this.zzc = parcel.readByte() != 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzatr)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzatr zzatr = (zzatr) obj;
        return this.zza.equals(zzatr.zza) && zzazo.zzo(this.zze, zzatr.zze) && Arrays.equals(this.zzb, zzatr.zzb);
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        int hashCode = (((this.zze.hashCode() * 31) + this.zza.hashCode()) * 31) + Arrays.hashCode(this.zzb);
        this.zzd = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zze.getMostSignificantBits());
        parcel.writeLong(this.zze.getLeastSignificantBits());
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeByte(this.zzc ? (byte) 1 : 0);
    }

    public zzatr(UUID uuid, String str, byte[] bArr, boolean z) {
        if (uuid != null) {
            this.zze = uuid;
            this.zza = str;
            if (bArr != null) {
                this.zzb = bArr;
                this.zzc = false;
                return;
            }
            throw null;
        }
        throw null;
    }
}
