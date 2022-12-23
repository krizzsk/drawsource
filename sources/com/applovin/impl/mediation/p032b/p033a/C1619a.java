package com.applovin.impl.mediation.p032b.p033a;

import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.C2089l;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.applovin.impl.mediation.b.a.a */
public class C1619a {

    /* renamed from: a */
    private final C2089l<Integer> f2214a = new C2089l<>();

    /* renamed from: b */
    private final TreeSet<Integer> f2215b = new TreeSet<>();

    /* renamed from: c */
    private final Map<Integer, MaxAd> f2216c = new HashMap();

    /* renamed from: d */
    private int f2217d;

    /* renamed from: e */
    private int f2218e;

    public C1619a(MaxAdPlacerSettings maxAdPlacerSettings) {
        m3215a(maxAdPlacerSettings);
    }

    /* renamed from: a */
    private int m3214a(int i, boolean z) {
        int d = this.f2214a.mo14959d(Integer.valueOf(i));
        if (!z) {
            int i2 = i + d;
            while (d < this.f2214a.size() && i2 >= this.f2214a.mo14948a(d).intValue()) {
                i2++;
                d++;
            }
        }
        return d;
    }

    /* renamed from: a */
    private void m3215a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            C2102v.m5110i("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f2214a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (maxAdPlacerSettings.isRepeatingEnabled()) {
            int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
            if (this.f2214a.isEmpty()) {
                this.f2214a.add(Integer.valueOf(repeatingInterval - 1));
            }
            int intValue = this.f2214a.mo14947a().intValue();
            while (true) {
                intValue += repeatingInterval;
                if (this.f2214a.size() < maxAdPlacerSettings.getMaxAdCount()) {
                    this.f2214a.add(Integer.valueOf(intValue));
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    private void m3216c(int i, int i2) {
        if (this.f2216c.containsKey(Integer.valueOf(i))) {
            this.f2216c.put(Integer.valueOf(i2), this.f2216c.get(Integer.valueOf(i)));
            this.f2215b.add(Integer.valueOf(i2));
            this.f2216c.remove(Integer.valueOf(i));
            this.f2215b.remove(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public int mo13536a() {
        int i = this.f2217d;
        if (!(i == -1 || this.f2218e == -1)) {
            while (i <= this.f2218e) {
                if (mo13540a(i) && !mo13543b(i)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo13537a(int i, int i2) {
        this.f2217d = i;
        this.f2218e = i2;
    }

    /* renamed from: a */
    public void mo13538a(MaxAd maxAd, int i) {
        this.f2216c.put(Integer.valueOf(i), maxAd);
        this.f2215b.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo13539a(Collection<Integer> collection) {
        for (Integer next : collection) {
            this.f2216c.remove(next);
            this.f2215b.remove(next);
        }
    }

    /* renamed from: a */
    public boolean mo13540a(int i) {
        return this.f2214a.contains(Integer.valueOf(i));
    }

    /* renamed from: b */
    public Collection<Integer> mo13541b() {
        return new TreeSet(this.f2215b);
    }

    /* renamed from: b */
    public void mo13542b(int i, int i2) {
        mo13551i(i);
        mo13550h(i2);
    }

    /* renamed from: b */
    public boolean mo13543b(int i) {
        return this.f2215b.contains(Integer.valueOf(i));
    }

    /* renamed from: c */
    public MaxAd mo13544c(int i) {
        return this.f2216c.get(Integer.valueOf(i));
    }

    /* renamed from: c */
    public void mo13545c() {
        this.f2216c.clear();
        this.f2215b.clear();
    }

    /* renamed from: d */
    public Collection<Integer> mo13546d(int i) {
        return new TreeSet(this.f2215b.tailSet(Integer.valueOf(i), false));
    }

    /* renamed from: e */
    public int mo13547e(int i) {
        if (i == 0) {
            return 0;
        }
        return i + m3214a(i - 1, false);
    }

    /* renamed from: f */
    public int mo13548f(int i) {
        return i + m3214a(i, false);
    }

    /* renamed from: g */
    public int mo13549g(int i) {
        if (mo13540a(i)) {
            return -1;
        }
        return i - m3214a(i, true);
    }

    /* renamed from: h */
    public void mo13550h(int i) {
        int c = this.f2214a.mo14955c(Integer.valueOf(i));
        for (int size = this.f2214a.size() - 1; size >= c; size--) {
            Integer a = this.f2214a.mo14948a(size);
            int intValue = a.intValue() + 1;
            m3216c(a.intValue(), intValue);
            this.f2214a.mo14949a(size, Integer.valueOf(intValue));
        }
    }

    /* renamed from: i */
    public void mo13551i(int i) {
        int c = this.f2214a.mo14955c(Integer.valueOf(i));
        if (mo13540a(i)) {
            this.f2216c.remove(Integer.valueOf(i));
            this.f2215b.remove(Integer.valueOf(i));
            this.f2214a.mo14954b(c);
        }
        while (c < this.f2214a.size()) {
            Integer a = this.f2214a.mo14948a(c);
            int intValue = a.intValue() - 1;
            m3216c(a.intValue(), intValue);
            this.f2214a.mo14949a(c, Integer.valueOf(intValue));
            c++;
        }
    }
}
