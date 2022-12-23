package com.bytedance.sdk.openadsdk.multipro.aidl.p180a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.ICommonDialogListener;
import java.util.HashMap;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a.c */
/* compiled from: CommonDialogListenerManagerImpl */
public class C3919c extends C3917a {

    /* renamed from: a */
    public static HashMap<String, RemoteCallbackList<ICommonDialogListener>> f10009a = new HashMap<>();

    /* renamed from: b */
    private static volatile C3919c f10010b;

    /* renamed from: a */
    public static C3919c m12935a() {
        if (f10010b == null) {
            synchronized (C3919c.class) {
                if (f10010b == null) {
                    f10010b = new C3919c();
                }
            }
        }
        return f10010b;
    }

    public void registerDialogListener(String str, ICommonDialogListener iCommonDialogListener) throws RemoteException {
        if (iCommonDialogListener != null) {
            RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
            remoteCallbackList.register(iCommonDialogListener);
            f10009a.put(str, remoteCallbackList);
        }
    }

    public void broadcastDialogListener(String str, int i) throws RemoteException {
        RemoteCallbackList remove = f10009a.remove(str);
        if (remove != null) {
            int beginBroadcast = remove.beginBroadcast();
            for (int i2 = 0; i2 < beginBroadcast; i2++) {
                ICommonDialogListener iCommonDialogListener = (ICommonDialogListener) remove.getBroadcastItem(i2);
                if (iCommonDialogListener != null) {
                    if (i == 1) {
                        iCommonDialogListener.onDialogBtnYes();
                    } else if (i == 2) {
                        iCommonDialogListener.onDialogBtnNo();
                    } else if (i != 3) {
                        iCommonDialogListener.onDialogCancel();
                    } else {
                        iCommonDialogListener.onDialogCancel();
                    }
                }
            }
            remove.finishBroadcast();
            remove.kill();
        }
    }
}
