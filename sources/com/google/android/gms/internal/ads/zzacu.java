package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzacu implements zzbk {
    public static final Parcelable.Creator<zzacu> CREATOR = new zzacs();
    public final float zza;
    public final int zzb;

    public zzacu(float f, int i) {
        this.zza = f;
        this.zzb = i;
    }

    /* synthetic */ zzacu(Parcel parcel, zzact zzact) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzacu zzacu = (zzacu) obj;
            return this.zza == zzacu.zza && this.zzb == zzacu.zzb;
        }
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb;
    }

    public final String toString() {
        float f = this.zza;
        int i = this.zzb;
        return "smta: captureFrameRate=" + f + ", svcTemporalLayerCount=" + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    public final /* synthetic */ void zza(zzbf zzbf) {
    }
}
