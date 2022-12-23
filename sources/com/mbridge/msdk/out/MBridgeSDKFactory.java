package com.mbridge.msdk.out;

import com.mbridge.msdk.system.C9196a;

public class MBridgeSDKFactory {
    private static C9196a instance;

    private MBridgeSDKFactory() {
    }

    public static C9196a getMBridgeSDK() {
        if (instance == null) {
            synchronized (MBridgeSDKFactory.class) {
                if (instance == null) {
                    instance = new C9196a();
                }
            }
        }
        return instance;
    }
}
