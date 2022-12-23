package com.unity3d.services.core.timer;

import com.unity3d.services.core.lifecycle.C12061c;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.unity3d.services.core.timer.h */
/* compiled from: IntervalTimer */
public class C12134h extends C12125a implements C12130d {

    /* renamed from: j */
    private final Integer f29609j;

    /* renamed from: k */
    private final Integer f29610k;

    /* renamed from: l */
    private Integer f29611l;

    /* renamed from: m */
    private C12132f f29612m;

    /* renamed from: n */
    private final AtomicInteger f29613n = new AtomicInteger(0);

    public C12134h(Integer num, Integer num2, C12132f fVar, C12061c cVar) {
        super(num, (C12133g) null, cVar);
        this.f29609j = num2;
        this.f29612m = fVar;
        int intValue = num2.intValue();
        int intValue2 = num.intValue();
        Integer valueOf = Integer.valueOf(intValue != 0 ? intValue2 / num2.intValue() : intValue2);
        this.f29610k = valueOf;
        this.f29611l = valueOf;
    }

    /* renamed from: a */
    public void mo71291a() {
        super.mo71291a();
        this.f29612m = null;
    }

    /* renamed from: d */
    public void mo71294d() {
        if (this.f29613n.addAndGet(this.f29600c.intValue()) >= this.f29611l.intValue()) {
            mo71300i();
        }
        super.mo71294d();
    }

    /* renamed from: i */
    public void mo71300i() {
        C12132f fVar = this.f29612m;
        if (fVar != null) {
            fVar.mo71215a();
        }
        this.f29611l = Integer.valueOf(this.f29611l.intValue() + this.f29610k.intValue());
    }
}
