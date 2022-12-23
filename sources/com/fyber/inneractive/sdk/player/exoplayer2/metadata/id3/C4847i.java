package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.i */
public final class C4847i extends C4846h {
    public static final Parcelable.Creator<C4847i> CREATOR = new C4848a();

    /* renamed from: b */
    public final String f12867b;

    /* renamed from: c */
    public final byte[] f12868c;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.i$a */
    public class C4848a implements Parcelable.Creator<C4847i> {
        public Object createFromParcel(Parcel parcel) {
            return new C4847i(parcel);
        }

        public Object[] newArray(int i) {
            return new C4847i[i];
        }
    }

    public C4847i(String str, byte[] bArr) {
        super("PRIV");
        this.f12867b = str;
        this.f12868c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4847i.class != obj.getClass()) {
            return false;
        }
        C4847i iVar = (C4847i) obj;
        if (!C4991u.m15140a((Object) this.f12867b, (Object) iVar.f12867b) || !Arrays.equals(this.f12868c, iVar.f12868c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f12867b;
        return (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f12868c);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12867b);
        parcel.writeByteArray(this.f12868c);
    }

    public C4847i(Parcel parcel) {
        super("PRIV");
        this.f12867b = parcel.readString();
        this.f12868c = parcel.createByteArray();
    }
}
