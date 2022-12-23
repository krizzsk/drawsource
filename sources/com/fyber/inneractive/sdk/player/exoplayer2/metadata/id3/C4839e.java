package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.e */
public final class C4839e extends C4846h {
    public static final Parcelable.Creator<C4839e> CREATOR = new C4840a();

    /* renamed from: b */
    public final String f12854b;

    /* renamed from: c */
    public final String f12855c;

    /* renamed from: d */
    public final String f12856d;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.e$a */
    public class C4840a implements Parcelable.Creator<C4839e> {
        public Object createFromParcel(Parcel parcel) {
            return new C4839e(parcel);
        }

        public Object[] newArray(int i) {
            return new C4839e[i];
        }
    }

    public C4839e(String str, String str2, String str3) {
        super("COMM");
        this.f12854b = str;
        this.f12855c = str2;
        this.f12856d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4839e.class != obj.getClass()) {
            return false;
        }
        C4839e eVar = (C4839e) obj;
        if (!C4991u.m15140a((Object) this.f12855c, (Object) eVar.f12855c) || !C4991u.m15140a((Object) this.f12854b, (Object) eVar.f12854b) || !C4991u.m15140a((Object) this.f12856d, (Object) eVar.f12856d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f12854b;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f12855c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12856d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12866a);
        parcel.writeString(this.f12854b);
        parcel.writeString(this.f12856d);
    }

    public C4839e(Parcel parcel) {
        super("COMM");
        this.f12854b = parcel.readString();
        this.f12855c = parcel.readString();
        this.f12856d = parcel.readString();
    }
}
