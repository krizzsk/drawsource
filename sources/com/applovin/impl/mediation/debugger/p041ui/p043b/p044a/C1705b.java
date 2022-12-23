package com.applovin.impl.mediation.debugger.p041ui.p043b.p044a;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1717c;
import com.applovin.impl.sdk.C1954j;

/* renamed from: com.applovin.impl.mediation.debugger.ui.b.a.b */
public class C1705b extends C1717c {

    /* renamed from: a */
    private final C1954j.C1955a f2504a;

    /* renamed from: o */
    private final Context f2505o;

    /* renamed from: p */
    private final boolean f2506p;

    public C1705b(C1954j.C1955a aVar, boolean z, Context context) {
        super(C1717c.C1720b.RIGHT_DETAIL);
        this.f2504a = aVar;
        this.f2505o = context;
        this.f2570d = new SpannedString(aVar.mo14490a());
        this.f2506p = z;
    }

    /* renamed from: b */
    public boolean mo13709b() {
        return true;
    }

    /* renamed from: c_ */
    public SpannedString mo13731c_() {
        return new SpannedString(this.f2504a.mo14491b(this.f2505o));
    }

    /* renamed from: d_ */
    public boolean mo13732d_() {
        Boolean a = this.f2504a.mo14489a(this.f2505o);
        if (a != null) {
            return a.equals(Boolean.valueOf(this.f2506p));
        }
        return false;
    }
}
