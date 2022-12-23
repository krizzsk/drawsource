package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.k */
public final class C4851k extends C4846h {
    public static final Parcelable.Creator<C4851k> CREATOR = new C4852a();

    /* renamed from: b */
    public final String f12871b;

    /* renamed from: c */
    public final String f12872c;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.k$a */
    public class C4852a implements Parcelable.Creator<C4851k> {
        public Object createFromParcel(Parcel parcel) {
            return new C4851k(parcel);
        }

        public Object[] newArray(int i) {
            return new C4851k[i];
        }
    }

    public C4851k(String str, String str2, String str3) {
        super(str);
        this.f12871b = str2;
        this.f12872c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4851k.class != obj.getClass()) {
            return false;
        }
        C4851k kVar = (C4851k) obj;
        if (!this.f12866a.equals(kVar.f12866a) || !C4991u.m15140a((Object) this.f12871b, (Object) kVar.f12871b) || !C4991u.m15140a((Object) this.f12872c, (Object) kVar.f12872c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.f12866a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f12871b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12872c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12866a);
        parcel.writeString(this.f12871b);
        parcel.writeString(this.f12872c);
    }

    public C4851k(Parcel parcel) {
        super(parcel.readString());
        this.f12871b = parcel.readString();
        this.f12872c = parcel.readString();
    }
}
