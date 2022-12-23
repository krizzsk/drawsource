package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.p192a.C5401a;
import com.google.android.p192a.C5402b;
import com.google.android.p192a.C5403c;

public interface IGetInstallReferrerService extends IInterface {

    public static abstract class Stub extends C5402b implements IGetInstallReferrerService {

        public static class Proxy extends C5401a implements IGetInstallReferrerService {
            Proxy(IBinder iBinder) {
                super(iBinder);
            }

            /* renamed from: c */
            public final Bundle mo31620c(Bundle bundle) throws RemoteException {
                Parcel a = mo26646a();
                C5403c.m16655b(a, bundle);
                Parcel b = mo26648b(a);
                Bundle bundle2 = (Bundle) C5403c.m16654a(b, Bundle.CREATOR);
                b.recycle();
                return bundle2;
            }
        }

        /* renamed from: b */
        public static IGetInstallReferrerService m16707b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof IGetInstallReferrerService) {
                return (IGetInstallReferrerService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo26649a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            Bundle c = mo31620c((Bundle) C5403c.m16654a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            C5403c.m16656c(parcel2, c);
            return true;
        }
    }

    /* renamed from: c */
    Bundle mo31620c(Bundle bundle) throws RemoteException;
}
