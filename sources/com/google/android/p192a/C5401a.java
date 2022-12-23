package com.google.android.p192a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.a.a */
/* compiled from: BaseProxy */
public class C5401a implements IInterface {

    /* renamed from: a */
    private final IBinder f14252a;

    /* renamed from: b */
    private final String f14253b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    protected C5401a(IBinder iBinder) {
        this.f14252a = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo26646a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f14253b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f14252a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Parcel mo26648b(Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f14252a.transact(1, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
