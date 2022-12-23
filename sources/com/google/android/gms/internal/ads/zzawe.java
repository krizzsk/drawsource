package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzawe implements Parcelable {
    public static final Parcelable.Creator<zzawe> CREATOR = new zzawc();
    private final zzawd[] zza;

    zzawe(Parcel parcel) {
        this.zza = new zzawd[parcel.readInt()];
        int i = 0;
        while (true) {
            zzawd[] zzawdArr = this.zza;
            if (i < zzawdArr.length) {
                zzawdArr[i] = (zzawd) parcel.readParcelable(zzawd.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzawe) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza.length);
        for (zzawd writeParcelable : this.zza) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzawd zzb(int i) {
        return this.zza[i];
    }

    public zzawe(List list) {
        zzawd[] zzawdArr = new zzawd[list.size()];
        this.zza = zzawdArr;
        list.toArray(zzawdArr);
    }
}
