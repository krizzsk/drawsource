package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.utils.v */
/* compiled from: TTNetworkUtils */
public class C2917v {

    /* renamed from: a */
    private static final Object f6540a = new Object();

    /* renamed from: b */
    private static final Map<C2920b, Object> f6541b = new ConcurrentHashMap();

    /* renamed from: c */
    private static AtomicBoolean f6542c = new AtomicBoolean(false);

    /* renamed from: d */
    private static volatile int f6543d = -1;

    /* renamed from: e */
    private static volatile long f6544e = 0;

    /* renamed from: f */
    private static volatile int f6545f = 60000;

    /* renamed from: g */
    private static C2910p f6546g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final AtomicBoolean f6547h = new AtomicBoolean(false);

    /* renamed from: i */
    private static Handler f6548i;

    /* renamed from: com.bytedance.sdk.component.utils.v$b */
    /* compiled from: TTNetworkUtils */
    public interface C2920b {
        /* renamed from: a */
        void mo17829a(Context context, Intent intent, boolean z);
    }

    /* renamed from: a */
    public static int m8175a(Context context, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (f6544e + j <= elapsedRealtime) {
            return m8174a(context);
        }
        if (f6543d == -1) {
            return m8174a(context);
        }
        if (elapsedRealtime - f6544e >= ((long) f6545f)) {
            m8182c(context);
        }
        return f6543d;
    }

    /* renamed from: c */
    private static void m8182c(final Context context) {
        if (f6547h.compareAndSet(false, true)) {
            C2882e.m8035a((C2885g) new C2885g("getNetworkType") {
                public void run() {
                    C2917v.m8174a(context);
                    C2917v.f6547h.set(false);
                }
            });
        }
    }

    /* renamed from: a */
    public static int m8174a(Context context) {
        f6543d = m8180b(context);
        f6544e = SystemClock.elapsedRealtime();
        return f6543d;
    }

    /* renamed from: b */
    public static int m8180b(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            if (!activeNetworkInfo.isAvailable()) {
                return 0;
            }
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (telephonyManager.getNetworkType()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        if (f6546g == null || !f6546g.mo17819a(context, telephonyManager)) {
                            return 5;
                        }
                        return 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        if (TextUtils.isEmpty(subtypeName) || (!subtypeName.equalsIgnoreCase("TD-SCDMA") && !subtypeName.equalsIgnoreCase("WCDMA") && !subtypeName.equalsIgnoreCase("CDMA2000"))) {
                            return 1;
                        }
                        return 3;
                }
            } else if (type != 1) {
                return 1;
            } else {
                return 4;
            }
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* renamed from: a */
    public static void m8179a(C2920b bVar, Context context) {
        if (bVar != null) {
            if (!f6542c.get()) {
                try {
                    context.registerReceiver(new C2921c(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    f6542c.set(true);
                } catch (Throwable unused) {
                }
            }
            f6541b.put(bVar, f6540a);
        }
    }

    /* renamed from: a */
    public static void m8178a(C2920b bVar) {
        if (bVar != null) {
            f6541b.remove(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m8181b(Context context, Intent intent) {
        m8182c(context);
        boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
        if (booleanExtra) {
            f6543d = 0;
        }
        Map<C2920b, Object> map = f6541b;
        if (map != null && map.size() > 0) {
            f6548i = new C2919a(context, intent, !booleanExtra);
            for (C2920b next : f6541b.keySet()) {
                if (!(next == null || f6548i == null)) {
                    Message obtain = Message.obtain();
                    obtain.obj = next;
                    f6548i.sendMessage(obtain);
                }
            }
            f6548i = null;
        }
    }

    /* renamed from: com.bytedance.sdk.component.utils.v$c */
    /* compiled from: TTNetworkUtils */
    private static class C2921c extends BroadcastReceiver {
        private C2921c() {
        }

        public void onReceive(Context context, Intent intent) {
            C2917v.m8181b(context, intent);
        }
    }

    /* renamed from: com.bytedance.sdk.component.utils.v$a */
    /* compiled from: TTNetworkUtils */
    private static class C2919a extends Handler {

        /* renamed from: a */
        private final Context f6550a;

        /* renamed from: b */
        private final Intent f6551b;

        /* renamed from: c */
        private final boolean f6552c;

        public C2919a(Context context, Intent intent, boolean z) {
            super(Looper.getMainLooper());
            this.f6550a = context;
            this.f6551b = intent;
            this.f6552c = z;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message != null && (message.obj instanceof C2920b)) {
                ((C2920b) message.obj).mo17829a(this.f6550a, this.f6551b, this.f6552c);
            }
        }
    }
}
