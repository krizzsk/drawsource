package com.mbridge.msdk.videocommon.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetStateOnReceive extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                    C9645c.getInstance().mo63655a(false);
                } else if (activeNetworkInfo.getType() == 1) {
                    C9645c.getInstance().mo63661b(true);
                } else if (activeNetworkInfo.getType() == 0) {
                    C9645c.getInstance().mo63654a();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
