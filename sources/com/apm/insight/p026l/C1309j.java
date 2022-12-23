package com.apm.insight.p026l;

import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.apm.insight.l.j */
public final class C1309j {

    /* renamed from: a */
    private static final Set<String> f1321a;

    static {
        HashSet hashSet = new HashSet();
        f1321a = hashSet;
        hashSet.add("HeapTaskDaemon");
        f1321a.add("ThreadPlus");
        f1321a.add("ApiDispatcher");
        f1321a.add("ApiLocalDispatcher");
        f1321a.add("AsyncLoader");
        f1321a.add("AsyncTask");
        f1321a.add("Binder");
        f1321a.add("PackageProcessor");
        f1321a.add("SettingsObserver");
        f1321a.add("WifiManager");
        f1321a.add("JavaBridge");
        f1321a.add("Compiler");
        f1321a.add("Signal Catcher");
        f1321a.add("GC");
        f1321a.add("ReferenceQueueDaemon");
        f1321a.add("FinalizerDaemon");
        f1321a.add("FinalizerWatchdogDaemon");
        f1321a.add("CookieSyncManager");
        f1321a.add("RefQueueWorker");
        f1321a.add("CleanupReference");
        f1321a.add("VideoManager");
        f1321a.add("DBHelper-AsyncOp");
        f1321a.add("InstalledAppTracker2");
        f1321a.add("AppData-AsyncOp");
        f1321a.add("IdleConnectionMonitor");
        f1321a.add("LogReaper");
        f1321a.add("ActionReaper");
        f1321a.add("Okio Watchdog");
        f1321a.add("CheckWaitingQueue");
        f1321a.add("NPTH-CrashTimer");
        f1321a.add("NPTH-JavaCallback");
        f1321a.add("NPTH-LocalParser");
        f1321a.add("ANR_FILE_MODIFY");
    }

    /* renamed from: a */
    public static Set<String> m1850a() {
        return f1321a;
    }

    /* renamed from: a */
    public static boolean m1851a(Throwable th) {
        if (th == null) {
            return true;
        }
        try {
            return (th instanceof ConnectTimeoutException) || (th instanceof SocketTimeoutException) || (th instanceof BindException) || (th instanceof ConnectException) || (th instanceof NoRouteToHostException) || (th instanceof PortUnreachableException) || (th instanceof SocketException) || (th instanceof UnknownHostException) || (th instanceof ProtocolException) || (th instanceof SSLException);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }
}
