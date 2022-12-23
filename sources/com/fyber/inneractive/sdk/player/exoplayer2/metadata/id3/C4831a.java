package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a */
public final class C4831a extends C4846h {
    public static final Parcelable.Creator<C4831a> CREATOR = new C4832a();

    /* renamed from: b */
    public final String f12838b;

    /* renamed from: c */
    public final String f12839c;

    /* renamed from: d */
    public final int f12840d;

    /* renamed from: e */
    public final byte[] f12841e;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a$a */
    public class C4832a implements Parcelable.Creator<C4831a> {
        public Object createFromParcel(Parcel parcel) {
            return new C4831a(parcel);
        }

        public Object[] newArray(int i) {
            return new C4831a[i];
        }
    }

    public C4831a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f12838b = str;
        this.f12839c = str2;
        this.f12840d = i;
        this.f12841e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4831a.class != obj.getClass()) {
            return false;
        }
        C4831a aVar = (C4831a) obj;
        if (this.f12840d != aVar.f12840d || !C4991u.m15140a((Object) this.f12838b, (Object) aVar.f12838b) || !C4991u.m15140a((Object) this.f12839c, (Object) aVar.f12839c) || !Arrays.equals(this.f12841e, aVar.f12841e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = (this.f12840d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f12838b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12839c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f12841e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12838b);
        parcel.writeString(this.f12839c);
        parcel.writeInt(this.f12840d);
        parcel.writeByteArray(this.f12841e);
    }

    public C4831a(Parcel parcel) {
        super("APIC");
        this.f12838b = parcel.readString();
        this.f12839c = parcel.readString();
        this.f12840d = parcel.readInt();
        this.f12841e = parcel.createByteArray();
    }
}
