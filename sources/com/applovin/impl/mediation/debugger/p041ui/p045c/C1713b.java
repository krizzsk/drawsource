package com.applovin.impl.mediation.debugger.p041ui.p045c;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.mediation.debugger.p037b.p039b.C1670a;
import com.applovin.impl.mediation.debugger.p037b.p039b.C1671b;
import com.applovin.impl.mediation.debugger.p037b.p039b.C1674c;
import com.applovin.impl.mediation.debugger.p037b.p039b.C1675d;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1717c;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1721d;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1724e;
import com.applovin.impl.sdk.utils.C2048f;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.C2271R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.c.b */
public class C1713b extends C1721d {

    /* renamed from: a */
    private final C1671b f2546a;

    /* renamed from: b */
    private List<C1717c> f2547b;

    /* renamed from: d */
    private final List<C1717c> f2548d;

    /* renamed from: e */
    private final List<C1717c> f2549e;

    /* renamed from: f */
    private final List<C1717c> f2550f;

    /* renamed from: g */
    private final List<C1717c> f2551g;

    /* renamed from: h */
    private SpannedString f2552h;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.c.b$a */
    public enum C1714a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    C1713b(C1671b bVar, Context context) {
        super(context);
        this.f2546a = bVar;
        if (bVar.mo13651a() == C1671b.C1672a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f2552h = new SpannedString(spannableString);
        } else {
            this.f2552h = new SpannedString("");
        }
        this.f2547b = m3582d();
        this.f2548d = m3578a(bVar.mo13669r());
        this.f2549e = m3577a(bVar.mo13671t());
        this.f2550f = m3580b(bVar.mo13670s());
        this.f2551g = m3587h();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    private int m3575a(boolean z) {
        return z ? C2271R.C2272drawable.applovin_ic_check_mark_bordered : C2271R.C2272drawable.applovin_ic_x_mark;
    }

    /* renamed from: a */
    private C1717c m3576a(C1671b.C1673b bVar) {
        C1717c.C1719a p = C1717c.m3602p();
        if (bVar == C1671b.C1673b.READY) {
            p.mo13762a(this.f2604c);
        }
        return p.mo13764a("Test Mode").mo13769b(bVar.mo13679a()).mo13767b(bVar.mo13680b()).mo13773d(bVar.mo13681c()).mo13765a(true).mo13766a();
    }

    /* renamed from: a */
    private List<C1717c> m3577a(C1674c cVar) {
        ArrayList arrayList = new ArrayList(1);
        if (cVar.mo13682a()) {
            boolean b = cVar.mo13683b();
            arrayList.add(C1717c.m3600a(b ? C1717c.C1720b.RIGHT_DETAIL : C1717c.C1720b.DETAIL).mo13764a("Cleartext Traffic").mo13768b(b ? null : this.f2552h).mo13773d(cVar.mo13684c()).mo13761a(m3575a(b)).mo13771c(m3579b(b)).mo13765a(true ^ b).mo13766a());
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<C1717c> m3578a(List<C1675d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (C1675d next : list) {
                boolean c = next.mo13687c();
                arrayList.add(C1717c.m3600a(c ? C1717c.C1720b.RIGHT_DETAIL : C1717c.C1720b.DETAIL).mo13764a(next.mo13685a()).mo13768b(c ? null : this.f2552h).mo13773d(next.mo13686b()).mo13761a(m3575a(c)).mo13771c(m3579b(c)).mo13765a(!c).mo13766a());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private int m3579b(boolean z) {
        return C2048f.m4936a(z ? C2271R.color.applovin_sdk_checkmarkColor : C2271R.color.applovin_sdk_xmarkColor, this.f2604c);
    }

    /* renamed from: b */
    private List<C1717c> m3580b(List<C1670a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (C1670a next : list) {
                boolean c = next.mo13649c();
                arrayList.add(C1717c.m3600a(c ? C1717c.C1720b.RIGHT_DETAIL : C1717c.C1720b.DETAIL).mo13764a(next.mo13647a()).mo13768b(c ? null : this.f2552h).mo13773d(next.mo13648b()).mo13761a(m3575a(c)).mo13771c(m3579b(c)).mo13765a(!c).mo13766a());
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private C1717c m3581c(List<String> list) {
        return C1717c.m3602p().mo13764a("Region/VPN Required").mo13769b(CollectionUtils.implode(list, ", ", list.size())).mo13766a();
    }

    /* renamed from: d */
    private List<C1717c> m3582d() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(m3583e());
        arrayList.add(m3585f());
        arrayList.add(m3586g());
        return arrayList;
    }

    /* renamed from: e */
    private C1717c m3583e() {
        C1717c.C1719a b = C1717c.m3602p().mo13764a("SDK").mo13769b(this.f2546a.mo13661j());
        if (TextUtils.isEmpty(this.f2546a.mo13661j())) {
            b.mo13761a(m3575a(this.f2546a.mo13655d())).mo13771c(m3579b(this.f2546a.mo13655d()));
        }
        return b.mo13766a();
    }

    /* renamed from: e */
    private String m3584e(int i) {
        return (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() == i || MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() == i || MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() == i) ? "Initialized" : MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i ? "Failure" : MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i ? "Initializing..." : "Not Initialized";
    }

    /* renamed from: f */
    private C1717c m3585f() {
        C1717c.C1719a b = C1717c.m3602p().mo13764a("Adapter").mo13769b(this.f2546a.mo13662k());
        if (TextUtils.isEmpty(this.f2546a.mo13662k())) {
            b.mo13761a(m3575a(this.f2546a.mo13656e())).mo13771c(m3579b(this.f2546a.mo13656e()));
        }
        return b.mo13766a();
    }

    /* renamed from: g */
    private C1717c m3586g() {
        return C1717c.m3602p().mo13764a("Initialization Status").mo13769b(m3584e(this.f2546a.mo13652b())).mo13765a(false).mo13766a();
    }

    /* renamed from: h */
    private List<C1717c> m3587h() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f2546a.mo13673u())) {
            arrayList.add(C1717c.m3600a(C1717c.C1720b.DETAIL).mo13764a(this.f2546a.mo13673u()).mo13766a());
        }
        if (this.f2546a.mo13653c() != C1671b.C1673b.NOT_SUPPORTED) {
            if (this.f2546a.mo13665n() != null) {
                arrayList.add(m3581c(this.f2546a.mo13665n()));
            }
            arrayList.add(m3576a(this.f2546a.mo13653c()));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo13703a(int i) {
        return (i == C1714a.INTEGRATIONS.ordinal() ? this.f2547b : i == C1714a.PERMISSIONS.ordinal() ? this.f2548d : i == C1714a.CONFIGURATION.ordinal() ? this.f2549e : i == C1714a.DEPENDENCIES.ordinal() ? this.f2550f : this.f2551g).size();
    }

    /* renamed from: a */
    public C1671b mo13704a() {
        return this.f2546a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo13705b() {
        return C1714a.COUNT.ordinal();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1717c mo13706b(int i) {
        return i == C1714a.INTEGRATIONS.ordinal() ? new C1724e("INTEGRATIONS") : i == C1714a.PERMISSIONS.ordinal() ? new C1724e("PERMISSIONS") : i == C1714a.CONFIGURATION.ordinal() ? new C1724e("CONFIGURATION") : i == C1714a.DEPENDENCIES.ordinal() ? new C1724e("DEPENDENCIES") : new C1724e("TEST ADS");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public List<C1717c> mo13707c(int i) {
        return i == C1714a.INTEGRATIONS.ordinal() ? this.f2547b : i == C1714a.PERMISSIONS.ordinal() ? this.f2548d : i == C1714a.CONFIGURATION.ordinal() ? this.f2549e : i == C1714a.DEPENDENCIES.ordinal() ? this.f2550f : this.f2551g;
    }

    /* renamed from: c */
    public void mo13746c() {
        this.f2547b = m3582d();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }
}
