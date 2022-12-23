package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.sdk.p281d.C8265b;

@Deprecated
public class SSAFactory {
    public static C8285f getPublisherInstance(Activity activity) {
        return C8265b.m23538a((Context) activity);
    }

    public static C8285f getPublisherTestInstance(Activity activity, int i) {
        return C8265b.m23539a((Context) activity, i);
    }
}
