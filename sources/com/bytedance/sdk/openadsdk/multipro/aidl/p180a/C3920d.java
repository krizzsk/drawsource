package com.bytedance.sdk.openadsdk.multipro.aidl.p180a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.ICommonPermissionListener;
import java.util.HashMap;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a.d */
/* compiled from: CommonPermissionListenerManagerImpl */
public class C3920d extends C3917a {

    /* renamed from: a */
    private static HashMap<String, RemoteCallbackList<ICommonPermissionListener>> f10011a = new HashMap<>();

    /* renamed from: b */
    private static volatile C3920d f10012b;

    /* renamed from: a */
    public static C3920d m12936a() {
        if (f10012b == null) {
            synchronized (C3920d.class) {
                if (f10012b == null) {
                    f10012b = new C3920d();
                }
            }
        }
        return f10012b;
    }

    public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException {
        if (iCommonPermissionListener != null) {
            C2905l.m8111b("MultiProcess", "CommonPermissionListenerManagerImpl registerPermissionListener");
            RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
            remoteCallbackList.register(iCommonPermissionListener);
            f10011a.put(str, remoteCallbackList);
        }
    }

    public void broadcastPermissionListener(String str, String str2) throws RemoteException {
        C2905l.m8111b("MultiProcess", "00000 CommonPermissionListenerManagerImpl broadcastDialogListener: 00000" + String.valueOf(str) + ", " + str2);
        RemoteCallbackList remove = f10011a.remove(str);
        if (remove != null) {
            int beginBroadcast = remove.beginBroadcast();
            for (int i = 0; i < beginBroadcast; i++) {
                ICommonPermissionListener iCommonPermissionListener = (ICommonPermissionListener) remove.getBroadcastItem(i);
                if (iCommonPermissionListener != null) {
                    C2905l.m8111b("MultiProcess", "CommonPermissionListenerManagerImpl broadcastDialogListener: " + String.valueOf(str) + ", " + str2);
                    if (str2 == null) {
                        iCommonPermissionListener.onGranted();
                    } else {
                        iCommonPermissionListener.onDenied(str2);
                    }
                }
            }
            remove.finishBroadcast();
            remove.kill();
        }
    }
}
