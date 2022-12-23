package com.applovin.impl.mediation.debugger.p041ui.p042a;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.mediation.debugger.p037b.p038a.C1665a;
import com.applovin.impl.mediation.debugger.p037b.p038a.C1666b;
import com.applovin.impl.mediation.debugger.p037b.p038a.C1669e;
import com.applovin.impl.mediation.debugger.p041ui.p043b.p044a.C1704a;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1717c;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1721d;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1724e;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.a.b */
class C1687b extends C1721d {

    /* renamed from: a */
    private final C1665a f2458a;

    /* renamed from: b */
    private final C1666b f2459b;

    /* renamed from: d */
    private final List<C1717c> f2460d = m3492c();

    /* renamed from: e */
    private final List<C1717c> f2461e = m3493d();

    /* renamed from: f */
    private final List<C1717c> f2462f = m3494e();

    /* renamed from: com.applovin.impl.mediation.debugger.ui.a.b$a */
    class C1688a extends C1704a {

        /* renamed from: o */
        private final C1666b f2464o;

        C1688a(C1666b bVar, String str, boolean z) {
            super(bVar.mo13629a().mo13641c(), C1687b.this.f2604c);
            this.f2464o = bVar;
            this.f2570d = StringUtils.createSpannedString(bVar.mo13629a().mo13640b(), ViewCompat.MEASURED_STATE_MASK, 18, 1);
            this.f2571e = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f2569c = z;
        }

        /* renamed from: a */
        public C1666b mo13708a() {
            return this.f2464o;
        }

        /* renamed from: b */
        public boolean mo13709b() {
            return this.f2569c;
        }

        /* renamed from: c */
        public int mo13710c() {
            return -12303292;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.a.b$b */
    enum C1689b {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    C1687b(C1665a aVar, C1666b bVar, Context context) {
        super(context);
        this.f2458a = aVar;
        this.f2459b = bVar;
        notifyDataSetChanged();
    }

    /* renamed from: c */
    private List<C1717c> m3492c() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(m3495f());
        arrayList.add(m3496g());
        if (this.f2459b != null) {
            arrayList.add(m3497h());
        }
        return arrayList;
    }

    /* renamed from: d */
    private List<C1717c> m3493d() {
        C1666b bVar = this.f2459b;
        if (bVar != null && !bVar.mo13631c()) {
            return new ArrayList();
        }
        List<C1666b> a = this.f2458a.mo13627e().mo13634a();
        ArrayList arrayList = new ArrayList(a.size());
        for (C1666b next : a) {
            C1666b bVar2 = this.f2459b;
            if (bVar2 == null || bVar2.mo13629a().mo13639a().equals(next.mo13629a().mo13639a())) {
                arrayList.add(new C1688a(next, next.mo13630b() != null ? next.mo13630b().mo13645a() : "", this.f2459b == null));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    private List<C1717c> m3494e() {
        C1666b bVar = this.f2459b;
        if (bVar != null && bVar.mo13631c()) {
            return new ArrayList();
        }
        List<C1666b> b = this.f2458a.mo13627e().mo13635b();
        ArrayList arrayList = new ArrayList(b.size());
        for (C1666b next : b) {
            C1666b bVar2 = this.f2459b;
            if (bVar2 == null || bVar2.mo13629a().mo13639a().equals(next.mo13629a().mo13639a())) {
                arrayList.add(new C1688a(next, (String) null, this.f2459b == null));
                for (C1669e next2 : next.mo13632d()) {
                    arrayList.add(C1717c.m3602p().mo13764a(next2.mo13645a()).mo13769b(next2.mo13646b()).mo13770b(true).mo13766a());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private C1717c m3495f() {
        return C1717c.m3602p().mo13764a("ID").mo13769b(this.f2458a.mo13622a()).mo13766a();
    }

    /* renamed from: g */
    private C1717c m3496g() {
        return C1717c.m3602p().mo13764a("Ad Format").mo13769b(this.f2458a.mo13624c()).mo13766a();
    }

    /* renamed from: h */
    private C1717c m3497h() {
        return C1717c.m3602p().mo13764a("Selected Network").mo13769b(this.f2459b.mo13629a().mo13640b()).mo13766a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo13703a(int i) {
        return (i == C1689b.INFO.ordinal() ? this.f2460d : i == C1689b.BIDDERS.ordinal() ? this.f2461e : this.f2462f).size();
    }

    /* renamed from: a */
    public String mo13704a() {
        return this.f2458a.mo13623b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo13705b() {
        return C1689b.COUNT.ordinal();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1717c mo13706b(int i) {
        return i == C1689b.INFO.ordinal() ? new C1724e("INFO") : i == C1689b.BIDDERS.ordinal() ? new C1724e("BIDDERS") : new C1724e("WATERFALL");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public List<C1717c> mo13707c(int i) {
        return i == C1689b.INFO.ordinal() ? this.f2460d : i == C1689b.BIDDERS.ordinal() ? this.f2461e : this.f2462f;
    }
}
