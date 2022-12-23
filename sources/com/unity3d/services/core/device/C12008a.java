package com.unity3d.services.core.device;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.unity3d.services.core.log.C12065a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.unity3d.services.core.device.a */
/* compiled from: AdvertisingId */
public class C12008a {

    /* renamed from: a */
    private static C12008a f29324a;

    /* renamed from: b */
    private String f29325b = null;

    /* renamed from: c */
    private boolean f29326c = false;

    /* renamed from: com.unity3d.services.core.device.a$c */
    /* compiled from: AdvertisingId */
    private class C12013c implements ServiceConnection {

        /* renamed from: a */
        boolean f29328a;

        /* renamed from: b */
        private final BlockingQueue<IBinder> f29329b;

        private C12013c() {
            this.f29328a = false;
            this.f29329b = new LinkedBlockingQueue();
        }

        /* renamed from: a */
        public IBinder mo71154a() throws InterruptedException {
            if (!this.f29328a) {
                this.f29328a = true;
                return this.f29329b.take();
            }
            throw new IllegalStateException();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f29329b.put(iBinder);
            } catch (InterruptedException unused) {
                C12065a.m32845b("Couldn't put service to binder que");
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: a */
    public static String m32668a() {
        return m32670b().f29325b;
    }

    /* renamed from: b */
    private static C12008a m32670b() {
        if (f29324a == null) {
            f29324a = new C12008a();
        }
        return f29324a;
    }

    /* renamed from: c */
    public static boolean m32672c() {
        return m32670b().f29326c;
    }

    /* renamed from: a */
    private void m32669a(Context context) {
        boolean z;
        C12013c cVar = new C12013c();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            z = context.bindService(intent, cVar, 1);
        } catch (Exception e) {
            C12065a.m32842a("Couldn't bind to identifier service intent", e);
            z = false;
        }
        if (z) {
            try {
                C12010b a = C12010b.C12011a.m32675a(cVar.mo71154a());
                this.f29325b = a.mo71151a();
                this.f29326c = a.mo71152a(true);
            } catch (Exception e2) {
                C12065a.m32842a("Couldn't get advertising info", e2);
                if (!z) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    context.unbindService(cVar);
                }
                throw th;
            }
        }
        if (!z) {
            return;
        }
        context.unbindService(cVar);
    }

    /* renamed from: b */
    public static void m32671b(Context context) {
        m32670b().m32669a(context);
    }

    /* renamed from: com.unity3d.services.core.device.a$b */
    /* compiled from: AdvertisingId */
    private interface C12010b extends IInterface {
        /* renamed from: a */
        String mo71151a() throws RemoteException;

        /* renamed from: a */
        boolean mo71152a(boolean z) throws RemoteException;

        /* renamed from: com.unity3d.services.core.device.a$b$a */
        /* compiled from: AdvertisingId */
        public static abstract class C12011a extends Binder implements C12010b {
            /* renamed from: a */
            public static C12010b m32675a(IBinder iBinder) {
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof C12010b)) {
                    return new C12012a(iBinder);
                }
                return (C12010b) queryLocalInterface;
            }

            /* renamed from: com.unity3d.services.core.device.a$b$a$a */
            /* compiled from: AdvertisingId */
            private static class C12012a implements C12010b {

                /* renamed from: a */
                private final IBinder f29327a;

                C12012a(IBinder iBinder) {
                    this.f29327a = iBinder;
                }

                /* renamed from: a */
                public String mo71151a() throws RemoteException {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        this.f29327a.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        return obtain2.readString();
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }

                public IBinder asBinder() {
                    return this.f29327a;
                }

                /* renamed from: a */
                public boolean mo71152a(boolean z) throws RemoteException {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        obtain.writeInt(z ? 1 : 0);
                        boolean z2 = false;
                        this.f29327a.transact(2, obtain, obtain2, 0);
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            z2 = true;
                        }
                        return z2;
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }
            }
        }
    }
}
