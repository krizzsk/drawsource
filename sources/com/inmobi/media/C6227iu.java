package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import java.util.List;

/* renamed from: com.inmobi.media.iu */
/* compiled from: ListRule */
public final class C6227iu<E> extends C6229iw<List<E>> {

    /* renamed from: a */
    private Class<E> f15704a;

    public C6227iu(Constructor<List<E>> constructor, Class<E> cls) {
        super(constructor);
        this.f15704a = cls;
    }

    /* renamed from: a */
    public final List<E> mo35436a() {
        return (List) this.f15706b.construct();
    }

    /* renamed from: b */
    public final Class<E> mo35437b() {
        return this.f15704a;
    }
}
