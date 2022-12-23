package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b */
public final class C4833b extends C4846h {
    public static final Parcelable.Creator<C4833b> CREATOR = new C4834a();

    /* renamed from: b */
    public final byte[] f12842b;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b$a */
    public class C4834a implements Parcelable.Creator<C4833b> {
        public Object createFromParcel(Parcel parcel) {
            return new C4833b(parcel);
        }

        public Object[] newArray(int i) {
            return new C4833b[i];
        }
    }

    public C4833b(String str, byte[] bArr) {
        super(str);
        this.f12842b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4833b.class != obj.getClass()) {
            return false;
        }
        C4833b bVar = (C4833b) obj;
        if (!this.f12866a.equals(bVar.f12866a) || !Arrays.equals(this.f12842b, bVar.f12842b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f12866a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f12842b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12866a);
        parcel.writeByteArray(this.f12842b);
    }

    public C4833b(Parcel parcel) {
        super(parcel.readString());
        this.f12842b = parcel.createByteArray();
    }
}
