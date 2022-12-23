package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzflz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzflz> CREATOR = new zzfma();
    public final int zza;
    public final byte[] zzb;

    zzflz(int i, byte[] bArr) {
        this.zza = i;
        this.zzb = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzflz(byte[] bArr) {
        this(1, bArr);
    }
}
