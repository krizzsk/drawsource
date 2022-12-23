package com.bytedance.sdk.openadsdk.multipro.aidl.p180a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a.f */
/* compiled from: FullScreenVideoListenerManagerImpl */
public class C3922f extends C3917a {

    /* renamed from: a */
    private static Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> f10015a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private static volatile C3922f f10016b;

    /* renamed from: a */
    public static C3922f m12939a() {
        if (f10016b == null) {
            synchronized (C3922f.class) {
                if (f10016b == null) {
                    f10016b = new C3922f();
                }
            }
        }
        return f10016b;
    }

    public synchronized void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException {
        RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
        remoteCallbackList.register(iFullScreenVideoAdInteractionListener);
        f10015a.put(str, remoteCallbackList);
    }

    public void executeFullVideoCallback(String str, String str2) throws RemoteException {
        m12940a(str, str2);
    }

    /* renamed from: a */
    private synchronized void m12940a(String str, String str2) {
        RemoteCallbackList remoteCallbackList;
        try {
            if (f10015a != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = f10015a.remove(str);
                } else {
                    remoteCallbackList = f10015a.get(str);
                }
                if (remoteCallbackList != null) {
                    int beginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < beginBroadcast; i++) {
                        IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener = (IFullScreenVideoAdInteractionListener) remoteCallbackList.getBroadcastItem(i);
                        if (iFullScreenVideoAdInteractionListener != null) {
                            if ("onAdShow".equals(str2)) {
                                iFullScreenVideoAdInteractionListener.onAdShow();
                            } else if ("onAdClose".equals(str2)) {
                                iFullScreenVideoAdInteractionListener.onAdClose();
                            } else if ("onVideoComplete".equals(str2)) {
                                iFullScreenVideoAdInteractionListener.onVideoComplete();
                            } else if ("onSkippedVideo".equals(str2)) {
                                iFullScreenVideoAdInteractionListener.onSkippedVideo();
                            } else if ("onAdVideoBarClick".equals(str2)) {
                                iFullScreenVideoAdInteractionListener.onAdVideoBarClick();
                            } else if ("recycleRes".equals(str2)) {
                                iFullScreenVideoAdInteractionListener.onDestroy();
                            }
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList.kill();
                    }
                }
            }
        } catch (Throwable th) {
            C2905l.m8115c("MultiProcess", "fullScreen1 method " + str2 + " throws Exception :", th);
        }
        return;
    }
}
