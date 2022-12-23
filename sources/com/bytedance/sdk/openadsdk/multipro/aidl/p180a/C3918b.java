package com.bytedance.sdk.openadsdk.multipro.aidl.p180a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a.b */
/* compiled from: AppOpenAdListenerManagerImpl */
public class C3918b extends C3917a {

    /* renamed from: a */
    private static Map<String, RemoteCallbackList<IAppOpenAdInteractionListener>> f10007a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private static volatile C3918b f10008b;

    /* renamed from: a */
    public static C3918b m12933a() {
        if (f10008b == null) {
            synchronized (C3918b.class) {
                if (f10008b == null) {
                    f10008b = new C3918b();
                }
            }
        }
        return f10008b;
    }

    public synchronized void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException {
        RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
        remoteCallbackList.register(iAppOpenAdInteractionListener);
        f10007a.put(str, remoteCallbackList);
    }

    public void executeAppOpenAdCallback(String str, String str2) throws RemoteException {
        m12934a(str, str2);
    }

    /* renamed from: a */
    private synchronized void m12934a(String str, String str2) {
        RemoteCallbackList remoteCallbackList;
        try {
            if (f10007a != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = f10007a.remove(str);
                } else {
                    remoteCallbackList = f10007a.get(str);
                }
                if (remoteCallbackList != null) {
                    int beginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < beginBroadcast; i++) {
                        IAppOpenAdInteractionListener iAppOpenAdInteractionListener = (IAppOpenAdInteractionListener) remoteCallbackList.getBroadcastItem(i);
                        if (iAppOpenAdInteractionListener != null) {
                            if ("onAdShow".equals(str2)) {
                                iAppOpenAdInteractionListener.onAdShow();
                            } else if ("onAdClicked".equals(str2)) {
                                iAppOpenAdInteractionListener.onAdClicked();
                            } else if ("onAdSkip".equals(str2)) {
                                iAppOpenAdInteractionListener.onAdSkip();
                            } else if ("onAdTimeOver".equals(str2)) {
                                iAppOpenAdInteractionListener.onAdTimeOver();
                            } else if ("recycleRes".equals(str2)) {
                                iAppOpenAdInteractionListener.onDestroy();
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
            C2905l.m8115c("MultiProcess", "appOpenAd1 method " + str2 + " throws Exception :", th);
        }
        return;
    }
}
