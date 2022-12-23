package com.bytedance.sdk.component.p108d.p111c.p112a.p114b;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.p108d.C2834p;
import com.bytedance.sdk.component.p108d.p111c.p112a.C2779b;

/* renamed from: com.bytedance.sdk.component.d.c.a.b.d */
/* compiled from: MemoryCacheWrapper */
public class C2785d implements C2834p {

    /* renamed from: a */
    private final C2834p f6219a;

    /* renamed from: b */
    private final C2779b f6220b;

    public C2785d(C2834p pVar) {
        this(pVar, (C2779b) null);
    }

    public C2785d(C2834p pVar, C2779b bVar) {
        this.f6219a = pVar;
        this.f6220b = bVar;
    }

    /* renamed from: a */
    public boolean mo17522a(String str, Bitmap bitmap) {
        boolean a = this.f6219a.mo17522a(str, bitmap);
        C2779b bVar = this.f6220b;
        if (bVar != null) {
            bVar.mo17579a(str, Boolean.valueOf(a));
        }
        return a;
    }

    /* renamed from: a */
    public Bitmap mo17521a(String str) {
        Bitmap bitmap = (Bitmap) this.f6219a.mo17521a(str);
        C2779b bVar = this.f6220b;
        if (bVar != null) {
            bVar.mo17580b(str, bitmap);
        }
        return bitmap;
    }

    /* renamed from: b */
    public boolean mo17523b(String str) {
        return this.f6219a.mo17523b(str);
    }
}
