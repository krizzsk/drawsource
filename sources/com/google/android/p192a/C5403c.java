package com.google.android.p192a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.a.c */
/* compiled from: Codecs */
public final class C5403c {
    static {
        C5403c.class.getClassLoader();
    }

    private C5403c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m16654a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m16655b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: c */
    public static void m16656c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 1);
    }
}
