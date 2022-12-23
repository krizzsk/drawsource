package com.bytedance.sdk.openadsdk.multipro.aidl.p180a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a.e */
/* compiled from: DislikeClosedListenerManagerImpl */
public class C3921e extends C3917a {

    /* renamed from: a */
    public static ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> f10013a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static volatile C3921e f10014b;

    /* renamed from: a */
    public static C3921e m12937a() {
        if (f10014b == null) {
            synchronized (C3921e.class) {
                if (f10014b == null) {
                    f10014b = new C3921e();
                }
            }
        }
        return f10014b;
    }

    public synchronized void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
        RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
        remoteCallbackList.register(iDislikeClosedListener);
        f10013a.put(str, remoteCallbackList);
    }

    public void unregisterDisLikeClosedListener(String str) throws RemoteException {
        if (!TextUtils.isEmpty(str)) {
            f10013a.remove(str);
        }
    }

    public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
        m12938a(str, str2);
    }

    /* renamed from: a */
    private synchronized void m12938a(String str, String str2) {
        RemoteCallbackList remoteCallbackList;
        try {
            if (!(f10013a == null || (remoteCallbackList = f10013a.get(str)) == null)) {
                int beginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i = 0; i < beginBroadcast; i++) {
                    IDislikeClosedListener iDislikeClosedListener = (IDislikeClosedListener) remoteCallbackList.getBroadcastItem(i);
                    if (iDislikeClosedListener != null && "onItemClickClosed".equals(str2)) {
                        iDislikeClosedListener.onItemClickClosed();
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th) {
            C2905l.m8115c("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th);
        }
        return;
    }
}
