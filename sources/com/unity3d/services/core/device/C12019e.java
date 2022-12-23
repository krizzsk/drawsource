package com.unity3d.services.core.device;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.unity3d.services.core.log.C12065a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.unity3d.services.core.device.e */
/* compiled from: OpenAdvertisingId */
public class C12019e {

    /* renamed from: a */
    private static C12019e f29346a;

    /* renamed from: b */
    private String f29347b = null;

    /* renamed from: c */
    private boolean f29348c = false;

    /* renamed from: com.unity3d.services.core.device.e$c */
    /* compiled from: OpenAdvertisingId */
    private class C12024c implements ServiceConnection {

        /* renamed from: a */
        boolean f29350a;

        /* renamed from: b */
        private final BlockingQueue<IBinder> f29351b;

        private C12024c() {
            this.f29350a = false;
            this.f29351b = new LinkedBlockingQueue();
        }

        /* renamed from: a */
        public IBinder mo71160a() throws InterruptedException {
            if (!this.f29350a) {
                this.f29350a = true;
                return this.f29351b.take();
            }
            throw new IllegalStateException();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f29351b.put(iBinder);
            } catch (InterruptedException unused) {
                C12065a.m32845b("Couldn't put service to binder que");
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: a */
    private static C12019e m32746a() {
        if (f29346a == null) {
            f29346a = new C12019e();
        }
        return f29346a;
    }

    /* renamed from: b */
    public static void m32748b(Context context) {
        if (Build.MANUFACTURER.toUpperCase().equals("HUAWEI")) {
            m32746a().m32747a(context);
        }
    }

    /* renamed from: c */
    public static String m32750c() {
        return m32746a().f29347b;
    }

    /* renamed from: b */
    public static boolean m32749b() {
        return m32746a().f29348c;
    }

    /* renamed from: a */
    private void m32747a(Context context) {
        C12024c cVar = new C12024c();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        try {
            if (context.bindService(intent, cVar, 1)) {
                try {
                    C12021b a = C12021b.C12022a.m32753a(cVar.mo71160a());
                    this.f29347b = a.mo71157a();
                    this.f29348c = a.mo71158a(true);
                } catch (Exception e) {
                    C12065a.m32842a("Couldn't get openAdvertising info", e);
                } catch (Throwable th) {
                    context.unbindService(cVar);
                    throw th;
                }
                context.unbindService(cVar);
            }
        } catch (Exception e2) {
            C12065a.m32842a("Couldn't bind to identifier service intent", e2);
        }
    }

    /* renamed from: com.unity3d.services.core.device.e$b */
    /* compiled from: OpenAdvertisingId */
    private interface C12021b extends IInterface {
        /* renamed from: a */
        String mo71157a() throws RemoteException;

        /* renamed from: a */
        boolean mo71158a(boolean z) throws RemoteException;

        /* renamed from: com.unity3d.services.core.device.e$b$a */
        /* compiled from: OpenAdvertisingId */
        public static abstract class C12022a extends Binder implements C12021b {
            /* renamed from: a */
            public static C12021b m32753a(IBinder iBinder) {
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof C12021b)) {
                    return new C12023a(iBinder);
                }
                return (C12021b) queryLocalInterface;
            }

            /* renamed from: com.unity3d.services.core.device.e$b$a$a */
            /* compiled from: OpenAdvertisingId */
            private static class C12023a implements C12021b {

                /* renamed from: a */
                private final IBinder f29349a;

                C12023a(IBinder iBinder) {
                    this.f29349a = iBinder;
                }

                /* renamed from: a */
                public String mo71157a() throws RemoteException {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                        this.f29349a.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        return obtain2.readString();
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }

                public IBinder asBinder() {
                    return this.f29349a;
                }

                /* renamed from: a */
                public boolean mo71158a(boolean z) throws RemoteException {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                        obtain.writeInt(z ? 1 : 0);
                        boolean z2 = false;
                        this.f29349a.transact(2, obtain, obtain2, 0);
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
