package com.applovin.communicator;

import android.content.Context;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.communicator.C1571a;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import java.util.Collections;
import java.util.List;

public final class AppLovinCommunicator {

    /* renamed from: a */
    private static AppLovinCommunicator f1537a;

    /* renamed from: b */
    private static final Object f1538b = new Object();

    /* renamed from: c */
    private C1969m f1539c;

    /* renamed from: d */
    private C2102v f1540d;

    /* renamed from: e */
    private final C1571a f1541e;

    /* renamed from: f */
    private final MessagingServiceImpl f1542f;

    private AppLovinCommunicator(Context context) {
        this.f1541e = new C1571a(context);
        this.f1542f = new MessagingServiceImpl(context);
    }

    /* renamed from: a */
    private void m2385a(String str) {
        C2102v vVar = this.f1540d;
        if (vVar != null) {
            vVar.mo15012b("AppLovinCommunicator", str);
        }
    }

    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f1538b) {
            if (f1537a == null) {
                f1537a = new AppLovinCommunicator(context.getApplicationContext());
            }
        }
        return f1537a;
    }

    /* renamed from: a */
    public void mo12816a(C1969m mVar) {
        this.f1539c = mVar;
        this.f1540d = mVar.mo14509A();
        if (C2102v.m5104a()) {
            m2385a("Attached SDK instance: " + mVar + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f1542f;
    }

    public boolean hasSubscriber(String str) {
        return this.f1541e.mo13272a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f1539c.mo14557ag().mo14488a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, (List<String>) Collections.singletonList(str));
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String next : list) {
            if (this.f1541e.mo13271a(appLovinCommunicatorSubscriber, next)) {
                this.f1542f.maybeFlushStickyMessages(next);
            } else if (C2102v.m5104a()) {
                m2385a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + next);
            }
        }
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f1539c + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, (List<String>) Collections.singletonList(str));
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String next : list) {
            if (C2102v.m5104a()) {
                m2385a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + next);
            }
            this.f1541e.mo13273b(appLovinCommunicatorSubscriber, next);
        }
    }
}
