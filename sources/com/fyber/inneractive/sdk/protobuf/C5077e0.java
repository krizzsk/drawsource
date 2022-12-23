package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5194z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.e0 */
public class C5077e0 extends C5067c<String> implements C5082f0, RandomAccess {

    /* renamed from: b */
    public final List<Object> f13545b;

    static {
        new C5077e0(10).f13527a = false;
    }

    public C5077e0(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    /* renamed from: a */
    public C5082f0 mo25797a() {
        return this.f13527a ? new C5144p1(this) : this;
    }

    public void add(int i, Object obj) {
        mo25769e();
        this.f13545b.add(i, (String) obj);
        this.modCount++;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(this.f13545b.size(), collection);
    }

    /* renamed from: b */
    public C5194z.C5205j mo25786b(int i) {
        if (i >= this.f13545b.size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f13545b);
            return new C5077e0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public List<?> mo25801c() {
        return Collections.unmodifiableList(this.f13545b);
    }

    public void clear() {
        mo25769e();
        this.f13545b.clear();
        this.modCount++;
    }

    public Object get(int i) {
        String str;
        Object obj = this.f13545b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C5093i) {
            C5093i iVar = (C5093i) obj;
            str = iVar.mo25918i();
            if (iVar.mo25912e()) {
                this.f13545b.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, C5194z.f13762a);
            if (C5161s1.m16048a(bArr)) {
                this.f13545b.set(i, str);
            }
        }
        return str;
    }

    public Object remove(int i) {
        mo25769e();
        Object remove = this.f13545b.remove(i);
        this.modCount++;
        return m15317a(remove);
    }

    public Object set(int i, Object obj) {
        mo25769e();
        return m15317a(this.f13545b.set(i, (String) obj));
    }

    public int size() {
        return this.f13545b.size();
    }

    public C5077e0(ArrayList<Object> arrayList) {
        this.f13545b = arrayList;
    }

    /* renamed from: a */
    public void mo25799a(C5093i iVar) {
        mo25769e();
        this.f13545b.add(iVar);
        this.modCount++;
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        mo25769e();
        if (collection instanceof C5082f0) {
            collection = ((C5082f0) collection).mo25801c();
        }
        boolean addAll = this.f13545b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: a */
    public Object mo25798a(int i) {
        return this.f13545b.get(i);
    }

    /* renamed from: a */
    public static String m15317a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C5093i) {
            return ((C5093i) obj).mo25918i();
        }
        return new String((byte[]) obj, C5194z.f13762a);
    }
}
