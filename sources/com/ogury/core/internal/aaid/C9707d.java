package com.ogury.core.internal.aaid;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ogury.core.internal.C9717ai;

/* renamed from: com.ogury.core.internal.aaid.d */
/* compiled from: AdvertisingInterface.kt */
public final class C9707d implements IInterface {

    /* renamed from: a */
    private final IBinder f24593a;

    /* renamed from: b */
    private final String f24594b;

    public C9707d(IBinder iBinder, String str) {
        C9717ai.m28145b(iBinder, "binder");
        C9717ai.m28145b(str, "descriptor");
        this.f24593a = iBinder;
        this.f24594b = str;
    }

    /* renamed from: a */
    public final String mo64054a() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C9717ai.m28143a((Object) obtain, "Parcel.obtain()");
        Parcel obtain2 = Parcel.obtain();
        C9717ai.m28143a((Object) obtain2, "Parcel.obtain()");
        try {
            obtain.writeInterfaceToken(this.f24594b);
            this.f24593a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            if (readString == null) {
                readString = "";
            }
            return readString;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f24593a;
    }

    /* renamed from: a */
    public final boolean mo64055a(boolean z) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C9717ai.m28143a((Object) obtain, "Parcel.obtain()");
        Parcel obtain2 = Parcel.obtain();
        C9717ai.m28143a((Object) obtain2, "Parcel.obtain()");
        try {
            obtain.writeInterfaceToken(this.f24594b);
            boolean z2 = true;
            obtain.writeInt(1);
            this.f24593a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z2 = false;
            }
            return z2;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
