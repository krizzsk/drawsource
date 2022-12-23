package com.ironsource.mediationsdk.utils;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C6611b;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.utils.e */
public final class C6738e {

    /* renamed from: a */
    public Map<String, Integer> f17588a;

    /* renamed from: b */
    C6737d f17589b;

    /* renamed from: c */
    public IronSourceLoggerManager f17590c;

    /* renamed from: d */
    private Map<String, Integer> f17591d;

    /* renamed from: e */
    private Map<String, String> f17592e;

    /* renamed from: f */
    private String f17593f;

    /* renamed from: g */
    private Timer f17594g = null;

    public C6738e(String str, C6737d dVar) {
        this.f17593f = str;
        this.f17589b = dVar;
        this.f17588a = new HashMap();
        this.f17591d = new HashMap();
        this.f17592e = new HashMap();
        this.f17590c = IronSourceLoggerManager.getLogger();
        mo36962a();
    }

    /* renamed from: a */
    private void m20398a(String str, int i) {
        this.f17591d.put(str, Integer.valueOf(i));
        this.f17592e.put(str, m20401c());
        IronSourceUtils.saveIntToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m20404e(str), i);
        IronSourceUtils.saveStringToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m20405f(str), m20401c());
    }

    /* renamed from: b */
    private int m20399b(String str) {
        if (!m20401c().equalsIgnoreCase(m20402c(str))) {
            mo36964a(str);
        }
        return m20403d(str);
    }

    /* renamed from: b */
    private static Date m20400b() {
        Random random = new Random();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, random.nextInt(10));
        gregorianCalendar.set(13, random.nextInt(60));
        gregorianCalendar.set(14, random.nextInt(1000));
        gregorianCalendar.add(5, 1);
        return gregorianCalendar.getTime();
    }

    /* renamed from: c */
    private static String m20401c() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    /* renamed from: c */
    private String m20402c(String str) {
        if (this.f17592e.containsKey(str)) {
            return this.f17592e.get(str);
        }
        String stringFromSharedPrefs = IronSourceUtils.getStringFromSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m20405f(str), m20401c());
        this.f17592e.put(str, stringFromSharedPrefs);
        return stringFromSharedPrefs;
    }

    /* renamed from: d */
    private int m20403d(String str) {
        if (this.f17591d.containsKey(str)) {
            return this.f17591d.get(str).intValue();
        }
        int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m20404e(str), 0);
        this.f17591d.put(str, Integer.valueOf(intFromSharedPrefs));
        return intFromSharedPrefs;
    }

    /* renamed from: e */
    private static String m20404e(String str) {
        return str + "_counter";
    }

    /* renamed from: f */
    private static String m20405f(String str) {
        return str + "_day";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36962a() {
        Timer timer = this.f17594g;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.f17594g = timer2;
        timer2.schedule(new TimerTask() {
            public final void run() {
                C6738e eVar = C6738e.this;
                synchronized (eVar) {
                    try {
                        for (String a : eVar.f17588a.keySet()) {
                            eVar.mo36964a(a);
                        }
                        eVar.f17589b.mo36041g();
                        eVar.mo36962a();
                    } catch (Exception e) {
                        eVar.f17590c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "onTimerTick", e);
                    }
                }
            }
        }, m20400b());
    }

    /* renamed from: a */
    public final void mo36963a(C6611b bVar) {
        synchronized (this) {
            try {
                String d = mo36967d(bVar);
                if (this.f17588a.containsKey(d)) {
                    m20398a(d, m20399b(d) + 1);
                }
            } catch (Exception e) {
                this.f17590c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "increaseShowCounter", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36964a(String str) {
        this.f17591d.put(str, 0);
        this.f17592e.put(str, m20401c());
        IronSourceUtils.saveIntToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m20404e(str), 0);
        IronSourceUtils.saveStringToSharedPrefs(ContextProvider.getInstance().getApplicationContext(), m20405f(str), m20401c());
    }

    /* renamed from: b */
    public final boolean mo36965b(C6611b bVar) {
        synchronized (this) {
            boolean z = false;
            try {
                String d = mo36967d(bVar);
                if (!this.f17588a.containsKey(d)) {
                    return false;
                }
                if (m20401c().equalsIgnoreCase(m20402c(d))) {
                    return false;
                }
                if (this.f17588a.get(d).intValue() <= m20403d(d)) {
                    z = true;
                }
                return z;
            } catch (Exception e) {
                this.f17590c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "shouldSendCapReleasedEvent", e);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo36966c(C6611b bVar) {
        synchronized (this) {
            boolean z = false;
            try {
                String d = mo36967d(bVar);
                if (!this.f17588a.containsKey(d)) {
                    return false;
                }
                if (this.f17588a.get(d).intValue() <= m20399b(d)) {
                    z = true;
                }
                return z;
            } catch (Exception e) {
                this.f17590c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "isCapped", e);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public String mo36967d(C6611b bVar) {
        return this.f17593f + "_" + bVar.f17121f + "_" + bVar.mo36622j();
    }
}
