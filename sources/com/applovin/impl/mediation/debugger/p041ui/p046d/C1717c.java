package com.applovin.impl.mediation.debugger.p041ui.p046d;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.utils.C2048f;
import com.applovin.sdk.C2271R;

/* renamed from: com.applovin.impl.mediation.debugger.ui.d.c */
public class C1717c {

    /* renamed from: b */
    protected C1720b f2568b;

    /* renamed from: c */
    protected boolean f2569c;

    /* renamed from: d */
    protected SpannedString f2570d;

    /* renamed from: e */
    protected SpannedString f2571e;

    /* renamed from: f */
    protected String f2572f;

    /* renamed from: g */
    protected String f2573g;

    /* renamed from: h */
    protected int f2574h;

    /* renamed from: i */
    protected int f2575i;

    /* renamed from: j */
    protected int f2576j;

    /* renamed from: k */
    protected int f2577k;

    /* renamed from: l */
    protected int f2578l;

    /* renamed from: m */
    protected int f2579m;

    /* renamed from: n */
    protected boolean f2580n;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.d.c$a */
    public static class C1719a {

        /* renamed from: a */
        final C1720b f2581a;

        /* renamed from: b */
        boolean f2582b;

        /* renamed from: c */
        SpannedString f2583c;

        /* renamed from: d */
        SpannedString f2584d;

        /* renamed from: e */
        String f2585e;

        /* renamed from: f */
        String f2586f;

        /* renamed from: g */
        int f2587g = 0;

        /* renamed from: h */
        int f2588h = 0;

        /* renamed from: i */
        int f2589i = ViewCompat.MEASURED_STATE_MASK;

        /* renamed from: j */
        int f2590j = ViewCompat.MEASURED_STATE_MASK;

        /* renamed from: k */
        int f2591k = 0;

        /* renamed from: l */
        int f2592l = 0;

        /* renamed from: m */
        boolean f2593m;

        public C1719a(C1720b bVar) {
            this.f2581a = bVar;
        }

        /* renamed from: a */
        public C1719a mo13761a(int i) {
            this.f2588h = i;
            return this;
        }

        /* renamed from: a */
        public C1719a mo13762a(Context context) {
            this.f2588h = C2271R.C2272drawable.applovin_ic_disclosure_arrow;
            this.f2592l = C2048f.m4936a(C2271R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        /* renamed from: a */
        public C1719a mo13763a(SpannedString spannedString) {
            this.f2583c = spannedString;
            return this;
        }

        /* renamed from: a */
        public C1719a mo13764a(String str) {
            return mo13763a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        /* renamed from: a */
        public C1719a mo13765a(boolean z) {
            this.f2582b = z;
            return this;
        }

        /* renamed from: a */
        public C1717c mo13766a() {
            return new C1717c(this);
        }

        /* renamed from: b */
        public C1719a mo13767b(int i) {
            this.f2590j = i;
            return this;
        }

        /* renamed from: b */
        public C1719a mo13768b(SpannedString spannedString) {
            this.f2584d = spannedString;
            return this;
        }

        /* renamed from: b */
        public C1719a mo13769b(String str) {
            return mo13768b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        /* renamed from: b */
        public C1719a mo13770b(boolean z) {
            this.f2593m = z;
            return this;
        }

        /* renamed from: c */
        public C1719a mo13771c(int i) {
            this.f2592l = i;
            return this;
        }

        /* renamed from: c */
        public C1719a mo13772c(String str) {
            this.f2585e = str;
            return this;
        }

        /* renamed from: d */
        public C1719a mo13773d(String str) {
            this.f2586f = str;
            return this;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.d.c$b */
    public enum C1720b {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);
        

        /* renamed from: g */
        private final int f2601g;

        private C1720b(int i) {
            this.f2601g = i;
        }

        /* renamed from: a */
        public int mo13774a() {
            return this.f2601g;
        }

        /* renamed from: b */
        public int mo13775b() {
            if (this == SECTION) {
                return C2271R.layout.list_section;
            }
            if (this == SECTION_CENTERED) {
                return C2271R.layout.list_section_centered;
            }
            if (this == SIMPLE) {
                return 17367043;
            }
            return this == DETAIL ? C2271R.layout.list_item_detail : C2271R.layout.list_item_right_detail;
        }
    }

    private C1717c(C1719a aVar) {
        this.f2574h = 0;
        this.f2575i = 0;
        this.f2576j = ViewCompat.MEASURED_STATE_MASK;
        this.f2577k = ViewCompat.MEASURED_STATE_MASK;
        this.f2578l = 0;
        this.f2579m = 0;
        this.f2568b = aVar.f2581a;
        this.f2569c = aVar.f2582b;
        this.f2570d = aVar.f2583c;
        this.f2571e = aVar.f2584d;
        this.f2572f = aVar.f2585e;
        this.f2573g = aVar.f2586f;
        this.f2574h = aVar.f2587g;
        this.f2575i = aVar.f2588h;
        this.f2576j = aVar.f2589i;
        this.f2577k = aVar.f2590j;
        this.f2578l = aVar.f2591k;
        this.f2579m = aVar.f2592l;
        this.f2580n = aVar.f2593m;
    }

    protected C1717c(C1720b bVar) {
        this.f2574h = 0;
        this.f2575i = 0;
        this.f2576j = ViewCompat.MEASURED_STATE_MASK;
        this.f2577k = ViewCompat.MEASURED_STATE_MASK;
        this.f2578l = 0;
        this.f2579m = 0;
        this.f2568b = bVar;
    }

    /* renamed from: a */
    public static C1719a m3600a(C1720b bVar) {
        return new C1719a(bVar);
    }

    /* renamed from: h */
    public static int m3601h() {
        return C1720b.COUNT.mo13774a();
    }

    /* renamed from: p */
    public static C1719a m3602p() {
        return m3600a(C1720b.RIGHT_DETAIL);
    }

    /* renamed from: b */
    public boolean mo13709b() {
        return this.f2569c;
    }

    /* renamed from: c */
    public int mo13710c() {
        return this.f2577k;
    }

    /* renamed from: c_ */
    public SpannedString mo13731c_() {
        return this.f2571e;
    }

    /* renamed from: d_ */
    public boolean mo13732d_() {
        return this.f2580n;
    }

    /* renamed from: e */
    public int mo13727e() {
        return this.f2574h;
    }

    /* renamed from: f */
    public int mo13728f() {
        return this.f2575i;
    }

    /* renamed from: g */
    public int mo13729g() {
        return this.f2579m;
    }

    /* renamed from: i */
    public int mo13754i() {
        return this.f2568b.mo13774a();
    }

    /* renamed from: j */
    public int mo13755j() {
        return this.f2568b.mo13775b();
    }

    /* renamed from: k */
    public SpannedString mo13756k() {
        return this.f2570d;
    }

    /* renamed from: l */
    public String mo13757l() {
        return this.f2572f;
    }

    /* renamed from: m */
    public String mo13758m() {
        return this.f2573g;
    }

    /* renamed from: n */
    public int mo13759n() {
        return this.f2576j;
    }

    /* renamed from: o */
    public int mo13760o() {
        return this.f2578l;
    }
}
