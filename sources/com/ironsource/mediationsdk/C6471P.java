package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ironsource.mediationsdk.P */
public final class C6471P {

    /* renamed from: a */
    ConcurrentHashMap<String, CopyOnWriteArrayList<C6467N>> f16499a = new ConcurrentHashMap<>();

    /* renamed from: b */
    String f16500b = "";

    /* renamed from: c */
    C6467N f16501c;

    /* renamed from: d */
    ConcurrentHashMap<String, AdInfo> f16502d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private String f16503e = "";

    /* renamed from: f */
    private final List<String> f16504f;

    /* renamed from: g */
    private final int f16505g;

    /* renamed from: h */
    private final Timer f16506h = new Timer();

    public C6471P(List<String> list, int i) {
        this.f16504f = list;
        this.f16505g = i;
    }

    /* renamed from: c */
    private synchronized boolean m19470c() {
        return this.f16501c != null && this.f16501c.f16476b.equals(this.f16503e);
    }

    /* renamed from: d */
    private void m19471d() {
        Iterator<C6467N> it = mo36207a().iterator();
        while (it.hasNext()) {
            C6529ac next = it.next();
            if (!next.equals(this.f16501c)) {
                next.mo36275d();
            }
        }
    }

    /* renamed from: a */
    public final AdInfo mo36206a(String str) {
        if (this.f16502d.containsKey(str)) {
            return this.f16502d.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public final CopyOnWriteArrayList<C6467N> mo36207a() {
        CopyOnWriteArrayList<C6467N> copyOnWriteArrayList = this.f16499a.get(this.f16500b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    /* renamed from: a */
    public final synchronized void mo36208a(C6467N n) {
        IronLog.INTERNAL.verbose("");
        if (this.f16501c != null && !this.f16501c.equals(n)) {
            this.f16501c.mo36275d();
        }
        this.f16501c = n;
    }

    /* renamed from: a */
    public final void mo36209a(String str, ImpressionData impressionData) {
        if (!TextUtils.isEmpty(str) && impressionData != null) {
            this.f16502d.put(str, new AdInfo(impressionData));
        }
    }

    /* renamed from: a */
    public final void mo36210a(CopyOnWriteArrayList<C6467N> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        m19471d();
        this.f16499a.put(str, copyOnWriteArrayList);
        if (!TextUtils.isEmpty(this.f16503e)) {
            if (m19470c()) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose("ad from previous waterfall " + this.f16503e + " is still showing - the current waterfall " + this.f16500b + " will be deleted instead");
                String str2 = this.f16500b;
                this.f16500b = this.f16503e;
                this.f16503e = str2;
            }
            final String str3 = this.f16503e;
            this.f16506h.schedule(new TimerTask() {
                public final void run() {
                    try {
                        IronLog ironLog = IronLog.INTERNAL;
                        ironLog.verbose("removing waterfall with id " + str3 + " from memory");
                        C6471P.this.f16499a.remove(str3);
                        IronLog ironLog2 = IronLog.INTERNAL;
                        ironLog2.verbose("waterfall size is currently " + C6471P.this.f16499a.size());
                        IronLog ironLog3 = IronLog.INTERNAL;
                        ironLog3.verbose("removing adInfo with id " + str3 + " from memory");
                        C6471P.this.f16502d.remove(str3);
                        IronLog ironLog4 = IronLog.INTERNAL;
                        ironLog4.verbose("adInfo size is currently " + C6471P.this.f16502d.size());
                    } finally {
                        cancel();
                    }
                }
            }, (long) this.f16505g);
        }
        this.f16503e = this.f16500b;
        this.f16500b = str;
    }

    /* renamed from: b */
    public final boolean mo36211b() {
        return this.f16499a.size() > 5;
    }

    /* renamed from: b */
    public final synchronized boolean mo36212b(C6467N n) {
        boolean z;
        IronLog.INTERNAL.verbose("");
        if (n != null) {
            if (this.f16501c != null) {
                if (n.mo36190c() != LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK || !this.f16501c.mo36388k().equals(n.mo36388k())) {
                    if ((n.mo36190c() == LoadWhileShowSupportState.NONE || this.f16504f.contains(n.mo36389l())) && this.f16501c.mo36389l().equals(n.mo36389l())) {
                    }
                }
            }
            z = false;
            if (z && n != null) {
                IronLog.INTERNAL.verbose(n.mo36388k() + " does not support load while show and will not be added to the auction request");
            }
        }
        z = true;
        IronLog.INTERNAL.verbose(n.mo36388k() + " does not support load while show and will not be added to the auction request");
        return !z;
    }
}
