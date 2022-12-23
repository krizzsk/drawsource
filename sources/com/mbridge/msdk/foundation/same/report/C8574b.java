package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.controller.C8396b;
import com.mbridge.msdk.foundation.p298db.BatchReportDao;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.same.net.p312g.C8550d;
import com.mbridge.msdk.foundation.same.report.p316d.C8596a;
import com.mbridge.msdk.foundation.same.report.p316d.C8597b;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.mbridge.msdk.foundation.same.report.b */
/* compiled from: MBBatchReportManager */
public final class C8574b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f21060a = C8574b.class.getSimpleName();

    /* renamed from: b */
    private static volatile C8574b f21061b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f21062c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f21063d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f21064e = 30;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f21065f = 5000;

    /* renamed from: g */
    private String f21066g = C8543d.m24463a().f20952a;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public BatchReportDao f21067h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public AtomicInteger f21068i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Stack<Long> f21069j;

    /* renamed from: k */
    private Executor f21070k = Executors.newSingleThreadExecutor();

    private C8574b() {
        C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
        if (b != null) {
            this.f21064e = b.mo16190ah();
            this.f21065f = (long) (b.mo16191ai() * 1000);
            this.f21063d = b.mo16192aj() != 1 ? false : true;
        }
        if (this.f21063d) {
            this.f21068i = new AtomicInteger(0);
            this.f21069j = new Stack<>();
            this.f21067h = BatchReportDao.getInstance(C8388a.m23845e().mo56913g());
            HandlerThread handlerThread = new HandlerThread("mb_batch_report_thread");
            handlerThread.start();
            this.f21062c = new Handler(handlerThread.getLooper()) {
                public final void handleMessage(Message message) {
                    Bundle data;
                    int i = message.what;
                    if (i == 1) {
                        Bundle data2 = message.getData();
                        if (C8574b.this.f21062c != null && C8574b.this.f21067h != null && data2 != null) {
                            C8574b.this.f21062c.removeMessages(2);
                            long currentTimeMillis = System.currentTimeMillis();
                            C8574b.m24578a(C8574b.this, C8574b.this.f21067h.getBatchReportMessages(currentTimeMillis), currentTimeMillis);
                            C8574b.this.f21068i.set(0);
                        }
                    } else if (i == 2) {
                        Bundle data3 = message.getData();
                        if (C8574b.this.f21062c != null && C8574b.this.f21067h != null && data3 != null) {
                            C8574b.this.f21062c.removeMessages(1);
                            long j = data3.getLong("last_report_time");
                            C8574b.m24578a(C8574b.this, C8574b.this.f21067h.getBatchReportMessages(j), j);
                        }
                    } else if (i == 3 && (data = message.getData()) != null) {
                        C8574b.m24580b(C8574b.this, data.getParcelableArrayList("report_message"), data.getLong("last_report_time"));
                    }
                }
            };
        }
    }

    /* renamed from: a */
    public static C8574b m24577a() {
        if (f21061b == null) {
            synchronized (C8574b.class) {
                if (f21061b == null) {
                    f21061b = new C8574b();
                }
            }
        }
        return f21061b;
    }

    /* renamed from: b */
    public final void mo58053b() {
        Handler handler;
        if (this.f21063d && (handler = this.f21062c) != null && !handler.hasMessages(1)) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            this.f21062c.sendMessageDelayed(obtain, 5000);
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo58054c() {
        return this.f21063d;
    }

    /* renamed from: a */
    public final synchronized void mo58052a(final String str) {
        C85773 r0 = new Runnable() {
            public final void run() {
                if (C8574b.this.f21067h != null && C8574b.this.f21063d) {
                    String d = C8574b.f21060a;
                    C8672v.m24874a(d, "接收到上报数据： " + str);
                    C8574b.this.f21067h.addReportMessage(str);
                    if (C8574b.this.f21062c != null && C8574b.this.f21065f > 0 && !C8574b.this.f21062c.hasMessages(1)) {
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        C8574b.this.f21062c.sendMessageDelayed(obtain, C8574b.this.f21065f);
                    }
                    if (C8574b.this.f21068i.incrementAndGet() >= C8574b.this.f21064e && C8574b.this.f21062c != null) {
                        Message obtain2 = Message.obtain();
                        Bundle bundle = new Bundle();
                        bundle.putLong("last_report_time", System.currentTimeMillis());
                        obtain2.setData(bundle);
                        obtain2.what = 2;
                        C8574b.this.f21062c.sendMessage(obtain2);
                        C8574b.this.f21068i.set(0);
                    }
                }
            }
        };
        if (!C8396b.m23890a().mo56951d()) {
            r0.run();
        } else if (this.f21070k != null) {
            this.f21070k.execute(r0);
        } else {
            r0.run();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m24578a(C8574b bVar, ArrayList arrayList, long j) {
        if (arrayList != null && arrayList.size() > 0) {
            Message obtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("report_message", arrayList);
            bundle.putLong("last_report_time", j);
            obtain.setData(bundle);
            obtain.what = 3;
            bVar.f21062c.sendMessage(obtain);
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m24580b(C8574b bVar, final ArrayList arrayList, final long j) {
        Context g;
        if (arrayList != null && arrayList.size() > 0 && (g = C8388a.m23845e().mo56913g()) != null) {
            C8550d a = C8598e.m24658a(g);
            a.mo57981a("app_id", C8388a.m23845e().mo56914h());
            a.mo57981a("m_sdk", "msdk");
            a.mo57981a("lqswt", String.valueOf(1));
            StringBuilder sb = new StringBuilder();
            C2440a f = C2445b.m6020a().mo16294f(C8388a.m23845e().mo56914h());
            for (int i = 0; i < arrayList.size(); i++) {
                BatchReportMessage batchReportMessage = (BatchReportMessage) arrayList.get(i);
                if (batchReportMessage != null) {
                    String str = batchReportMessage.getReportMessage() + "&ts=" + batchReportMessage.getTimestamp();
                    if (C8598e.m24569a(f, str)) {
                        sb.append(str);
                        if (i >= 0 && i < arrayList.size() - 1) {
                            sb.append("\n");
                        }
                    }
                }
            }
            try {
                a.mo57981a("data", URLEncoder.encode(sb.toString(), "utf-8"));
                new C8596a(C8388a.m23845e().mo56913g()).mo57978c(0, bVar.f21066g, a, new C8597b() {
                    /* renamed from: a */
                    public final void mo37053a(String str) {
                        try {
                            if (C8574b.this.f21067h != null) {
                                C8574b.this.f21067h.deleteBatchReportMessagesByTimestamp(j);
                            }
                        } catch (Exception e) {
                            C8672v.m24878d(C8574b.f21060a, e.getMessage());
                        }
                        synchronized (C8574b.this.f21069j) {
                            C8574b.this.f21069j.clear();
                        }
                    }

                    /* renamed from: b */
                    public final void mo37054b(String str) {
                        Stack d;
                        synchronized (C8574b.this.f21069j) {
                            C8574b.this.f21069j.add(Long.valueOf(j));
                            if (C8574b.this.f21067h != null) {
                                C8574b.this.f21067h.updateMessagesReportState(arrayList);
                            }
                            if (C8574b.this.f21069j.size() >= 5) {
                                try {
                                    C8574b.this.f21069j.pop();
                                    long longValue = ((Long) C8574b.this.f21069j.pop()).longValue();
                                    C8574b.this.f21069j.clear();
                                    if (C8574b.this.f21067h != null) {
                                        C8574b.this.f21067h.deleteBatchReportMessagesByTimestamp(longValue);
                                    }
                                    d = C8574b.this.f21069j;
                                } catch (Exception e) {
                                    try {
                                        C8672v.m24878d(C8574b.f21060a, e.getMessage());
                                        d = C8574b.this.f21069j;
                                    } catch (Throwable th) {
                                        C8574b.this.f21069j.clear();
                                        throw th;
                                    }
                                }
                                d.clear();
                            }
                        }
                    }
                });
            } catch (Exception e) {
                C8672v.m24878d(f21060a, e.getMessage());
            }
        }
    }
}
