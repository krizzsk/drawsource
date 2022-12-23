package com.applovin.impl.communicator;

import android.content.Context;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f2008a;

    /* renamed from: b */
    private final ScheduledThreadPoolExecutor f2009b;

    /* renamed from: c */
    private final Map<String, Queue<CommunicatorMessageImpl>> f2010c = new HashMap();

    /* renamed from: d */
    private final Object f2011d = new Object();

    public MessagingServiceImpl(Context context) {
        this.f2008a = context;
        this.f2009b = m2955a();
    }

    /* renamed from: a */
    private Queue<CommunicatorMessageImpl> m2954a(String str) {
        LinkedList linkedList;
        synchronized (this.f2011d) {
            Queue queue = this.f2010c.get(str);
            linkedList = queue != null ? new LinkedList(queue) : new LinkedList();
        }
        return linkedList;
    }

    /* renamed from: a */
    private ScheduledThreadPoolExecutor m2955a() {
        return new ScheduledThreadPoolExecutor(4, new ThreadFactory() {
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "AppLovinSdk:com.applovin.communicator");
                thread.setPriority(10);
                thread.setDaemon(true);
                return thread;
            }
        });
    }

    /* renamed from: a */
    private void m2956a(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (appLovinCommunicatorMessage.sticky) {
            synchronized (this.f2011d) {
                Queue queue = this.f2010c.get(appLovinCommunicatorMessage.getTopic());
                if (queue != null) {
                    queue.add(appLovinCommunicatorMessage);
                    if (queue.size() > 100) {
                        queue.remove();
                    }
                } else {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(appLovinCommunicatorMessage);
                    this.f2010c.put(appLovinCommunicatorMessage.getTopic(), linkedList);
                }
            }
        }
    }

    /* renamed from: a */
    private void m2957a(final CommunicatorMessageImpl communicatorMessageImpl) {
        this.f2009b.execute(new Runnable() {
            public void run() {
                AppLovinBroadcastManager.getInstance(MessagingServiceImpl.this.f2008a).sendBroadcastSync(communicatorMessageImpl, (Map<String, Object>) null);
            }
        });
    }

    public void maybeFlushStickyMessages(String str) {
        for (CommunicatorMessageImpl a : m2954a(str)) {
            m2957a(a);
        }
    }

    public void publish(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        m2957a((CommunicatorMessageImpl) appLovinCommunicatorMessage);
        m2956a(appLovinCommunicatorMessage);
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }
}
