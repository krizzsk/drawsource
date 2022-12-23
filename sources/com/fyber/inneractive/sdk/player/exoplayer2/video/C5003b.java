package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.b */
public final class C5003b implements Parcelable {
    public static final Parcelable.Creator<C5003b> CREATOR = new C5004a();

    /* renamed from: a */
    public final int f13336a;

    /* renamed from: b */
    public final int f13337b;

    /* renamed from: c */
    public final int f13338c;

    /* renamed from: d */
    public final byte[] f13339d;

    /* renamed from: e */
    public int f13340e;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.b$a */
    public class C5004a implements Parcelable.Creator<C5003b> {
        public Object createFromParcel(Parcel parcel) {
            return new C5003b(parcel);
        }

        public Object[] newArray(int i) {
            return new C5003b[0];
        }
    }

    public C5003b(int i, int i2, int i3, byte[] bArr) {
        this.f13336a = i;
        this.f13337b = i2;
        this.f13338c = i3;
        this.f13339d = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5003b.class == obj.getClass()) {
            C5003b bVar = (C5003b) obj;
            return this.f13336a == bVar.f13336a && this.f13337b == bVar.f13337b && this.f13338c == bVar.f13338c && Arrays.equals(this.f13339d, bVar.f13339d);
        }
    }

    public int hashCode() {
        if (this.f13340e == 0) {
            this.f13340e = ((((((this.f13336a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f13337b) * 31) + this.f13338c) * 31) + Arrays.hashCode(this.f13339d);
        }
        return this.f13340e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f13336a);
        sb.append(", ");
        sb.append(this.f13337b);
        sb.append(", ");
        sb.append(this.f13338c);
        sb.append(", ");
        sb.append(this.f13339d != null);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13336a);
        parcel.writeInt(this.f13337b);
        parcel.writeInt(this.f13338c);
        parcel.writeInt(this.f13339d != null ? 1 : 0);
        byte[] bArr = this.f13339d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public C5003b(Parcel parcel) {
        this.f13336a = parcel.readInt();
        this.f13337b = parcel.readInt();
        this.f13338c = parcel.readInt();
        this.f13339d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
