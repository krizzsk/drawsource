package com.bytedance.sdk.openadsdk.multipro.aidl.p180a;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a.h */
/* compiled from: RewardAdVideoListenerManagerImpl */
public class C3924h extends C3917a {

    /* renamed from: a */
    private static Map<String, RemoteCallbackList<IRewardAdInteractionListener>> f10018a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private static volatile C3924h f10019b;

    /* renamed from: a */
    public static C3924h m12942a() {
        Class<C3924h> cls = C3924h.class;
        if (f10019b == null) {
            synchronized (cls) {
                if (f10019b == null) {
                    f10019b = new C3924h();
                }
            }
        }
        return f10019b;
    }

    /* renamed from: a */
    private synchronized void m12943a(String str, String str2, boolean z, int i, String str3, int i2, String str4) {
        String str5 = str;
        String str6 = str2;
        synchronized (this) {
            try {
                if (f10018a != null) {
                    RemoteCallbackList remoteCallbackList = (RemoteCallbackList) ("recycleRes".equals(str2) ? f10018a.remove(str) : f10018a.get(str));
                    if (remoteCallbackList != null) {
                        int beginBroadcast = remoteCallbackList.beginBroadcast();
                        for (int i3 = 0; i3 < beginBroadcast; i3++) {
                            IRewardAdInteractionListener iRewardAdInteractionListener = (IRewardAdInteractionListener) remoteCallbackList.getBroadcastItem(i3);
                            if (iRewardAdInteractionListener != null) {
                                if ("onAdShow".equals(str2)) {
                                    iRewardAdInteractionListener.onAdShow();
                                } else if ("onAdClose".equals(str2)) {
                                    iRewardAdInteractionListener.onAdClose();
                                } else if ("onVideoComplete".equals(str2)) {
                                    iRewardAdInteractionListener.onVideoComplete();
                                } else if ("onVideoError".equals(str2)) {
                                    iRewardAdInteractionListener.onVideoError();
                                } else if ("onAdVideoBarClick".equals(str2)) {
                                    iRewardAdInteractionListener.onAdVideoBarClick();
                                } else if ("onRewardVerify".equals(str2)) {
                                    iRewardAdInteractionListener.onRewardVerify(z, i, str3, i2, str4);
                                } else if ("onSkippedVideo".equals(str2)) {
                                    iRewardAdInteractionListener.onSkippedVideo();
                                } else if ("recycleRes".equals(str2)) {
                                    iRewardAdInteractionListener.onDestroy();
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
                C2905l.m8115c("MultiProcess", "reward2 '" + str2 + "'  throws Exception :", th);
            }
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = 'J';
        r1 = '7';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        switch(r1) {
            case 55: goto L_0x000f;
            case 56: goto L_0x0026;
            case 57: goto L_0x0026;
            default: goto L_0x000e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r2 = r2.toCharArray();
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r0 >= r2.length) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r2[r0] = (char) (r2[r0] ^ r0);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        return new java.lang.String(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String h1659536876613dc(java.lang.String r2) {
        /*
        L_0x0000:
            r0 = 73
            r1 = 96
        L_0x0004:
            switch(r0) {
                case 72: goto L_0x0026;
                case 73: goto L_0x0008;
                case 74: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x002b
        L_0x0008:
            switch(r1) {
                case 94: goto L_0x0000;
                case 95: goto L_0x0026;
                case 96: goto L_0x0026;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r1) {
                case 55: goto L_0x000f;
                case 56: goto L_0x0026;
                case 57: goto L_0x0026;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0000
        L_0x000f:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L_0x0014:
            int r1 = r2.length
            if (r0 >= r1) goto L_0x0020
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0020:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L_0x0026:
            r0 = 74
            r1 = 55
            goto L_0x0004
        L_0x002b:
            r0 = 72
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3924h.h1659536876613dc(java.lang.String):java.lang.String");
    }

    public void executeRewardVideoCallback(String str, String str2, boolean z, int i, String str3, int i2, String str4) throws RemoteException {
        m12943a(str, str2, z, i, str3, i2, str4);
    }

    public synchronized void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException {
        RemoteCallbackList remoteCallbackList = new RemoteCallbackList();
        remoteCallbackList.register(iRewardAdInteractionListener);
        f10018a.put(str, remoteCallbackList);
    }
}
