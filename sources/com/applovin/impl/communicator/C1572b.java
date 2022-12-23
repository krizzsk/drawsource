package com.applovin.impl.communicator;

import android.content.Context;
import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C2102v;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.communicator.b */
public class C1572b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private boolean f2018a = true;

    /* renamed from: b */
    private final String f2019b;

    /* renamed from: c */
    private final WeakReference<AppLovinCommunicatorSubscriber> f2020c;

    /* renamed from: d */
    private final Set<CommunicatorMessageImpl> f2021d = new LinkedHashSet();

    /* renamed from: e */
    private final Object f2022e = new Object();

    C1572b(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f2019b = str;
        this.f2020c = new WeakReference<>(appLovinCommunicatorSubscriber);
    }

    /* renamed from: a */
    public String mo13274a() {
        return this.f2019b;
    }

    /* renamed from: a */
    public void mo13275a(boolean z) {
        this.f2018a = z;
    }

    /* renamed from: b */
    public AppLovinCommunicatorSubscriber mo13276b() {
        return (AppLovinCommunicatorSubscriber) this.f2020c.get();
    }

    /* renamed from: c */
    public boolean mo13277c() {
        return this.f2018a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1572b)) {
            return false;
        }
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f2020c.get();
        C1572b bVar = (C1572b) obj;
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = (AppLovinCommunicatorSubscriber) bVar.f2020c.get();
        if (mo13274a().equals(bVar.mo13274a())) {
            if (appLovinCommunicatorSubscriber != null) {
                if (appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2)) {
                    return true;
                }
            } else if (appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f2019b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f2020c.get();
        return (hashCode * 31) + (appLovinCommunicatorSubscriber != null ? appLovinCommunicatorSubscriber.hashCode() : 0);
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if (mo13276b() != null) {
            CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
            boolean z = false;
            synchronized (this.f2022e) {
                if (!this.f2021d.contains(communicatorMessageImpl)) {
                    this.f2021d.add(communicatorMessageImpl);
                    z = true;
                }
            }
            if (z) {
                mo13276b().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
            }
        } else if (C2102v.m5104a()) {
            C2102v.m5110i("AppLovinCommunicator", "Message received for GC'd subscriber");
        }
    }
}
