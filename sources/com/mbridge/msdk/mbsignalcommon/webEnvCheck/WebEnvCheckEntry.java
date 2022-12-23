package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.p078c.p080b.C2449b;

public class WebEnvCheckEntry {
    public void check(Context context) {
        WindVaneWebView windVaneWebView = new WindVaneWebView(context);
        windVaneWebView.loadDataWithBaseURL((String) null, "<html><script>" + C2449b.m6046a().mo16300b() + "</script></html>", "text/html", "utf-8", (String) null);
    }
}
