package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.vast.C4381a;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.model.vast.f */
public class C4424f {

    /* renamed from: a */
    public Integer f10883a;

    /* renamed from: b */
    public Integer f10884b;

    /* renamed from: c */
    public String f10885c;

    /* renamed from: d */
    public C4427i f10886d;

    /* renamed from: e */
    public String f10887e;

    /* renamed from: f */
    public String f10888f;

    /* renamed from: g */
    public String f10889g;

    /* renamed from: h */
    public List<String> f10890h;

    /* renamed from: i */
    public C4381a.C4382a f10891i;

    /* renamed from: j */
    public List<C4434p> f10892j;

    public String toString() {
        StringBuilder sb = new StringBuilder("Companion: ");
        sb.append(" w:");
        sb.append(this.f10883a);
        sb.append(" h:");
        sb.append(this.f10884b);
        sb.append(" ctr:");
        sb.append(this.f10889g);
        sb.append(" clt:");
        sb.append(this.f10890h);
        if (!TextUtils.isEmpty(this.f10888f)) {
            sb.append(" html:");
            sb.append(this.f10888f);
        }
        if (this.f10886d != null) {
            sb.append(" static:");
            sb.append(this.f10886d.f10902b);
            sb.append("creative:");
            sb.append(this.f10886d.f10901a);
        }
        if (!TextUtils.isEmpty(this.f10887e)) {
            sb.append(" iframe:");
            sb.append(this.f10887e);
        }
        sb.append(" events:");
        sb.append(this.f10892j);
        if (this.f10891i != null) {
            sb.append(" reason:");
            sb.append(this.f10891i.f10780a);
        }
        return sb.toString();
    }
}
