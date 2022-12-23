package com.unity3d.services.core.webview.bridge;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.services.core.log.C12065a;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.unity3d.services.core.webview.bridge.l */
/* compiled from: WebViewCallback */
public class C12160l implements Parcelable {
    public static final Parcelable.Creator<C12160l> CREATOR = new C12161a();

    /* renamed from: a */
    private boolean f29693a;

    /* renamed from: b */
    private int f29694b;

    /* renamed from: c */
    private String f29695c;

    /* renamed from: com.unity3d.services.core.webview.bridge.l$a */
    /* compiled from: WebViewCallback */
    static class C12161a implements Parcelable.Creator<C12160l> {
        C12161a() {
        }

        /* renamed from: a */
        public C12160l createFromParcel(Parcel parcel) {
            return new C12160l(parcel);
        }

        /* renamed from: a */
        public C12160l[] newArray(int i) {
            return new C12160l[i];
        }
    }

    public C12160l(String str, int i) {
        this.f29695c = str;
        this.f29694b = i;
    }

    /* renamed from: a */
    public void mo71347a(Object... objArr) {
        m33154a(C12144a.OK, (Enum) null, objArr);
    }

    public int describeContents() {
        return 45678;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29695c);
        parcel.writeByte(this.f29693a ? (byte) 1 : 0);
        parcel.writeInt(this.f29694b);
    }

    /* renamed from: a */
    private void m33154a(C12144a aVar, Enum enumR, Object... objArr) {
        String str;
        if (!this.f29693a && (str = this.f29695c) != null && str.length() != 0) {
            this.f29693a = true;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Arrays.asList(objArr));
            arrayList.add(0, this.f29695c);
            C12148e a = C12148e.m33127a(this.f29694b);
            if (a == null) {
                C12065a.m32848c("Couldn't get batch with id: " + mo71345a());
                return;
            }
            a.mo71332a(aVar, enumR, arrayList.toArray());
        }
    }

    public C12160l(Parcel parcel) {
        this.f29695c = parcel.readString();
        this.f29693a = parcel.readByte() != 0;
        this.f29694b = parcel.readInt();
    }

    /* renamed from: a */
    public void mo71346a(Enum enumR, Object... objArr) {
        m33154a(C12144a.ERROR, enumR, objArr);
    }

    /* renamed from: a */
    public int mo71345a() {
        return this.f29694b;
    }
}
