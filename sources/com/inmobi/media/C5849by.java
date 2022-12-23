package com.inmobi.media;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.by */
/* compiled from: NativeContainerAsset */
public final class C5849by extends C5847bw implements Iterable<C5847bw> {

    /* renamed from: A */
    public byte f14739A;
    /* access modifiers changed from: package-private */

    /* renamed from: B */
    public C5847bw[] f14740B;
    /* access modifiers changed from: package-private */

    /* renamed from: C */
    public int f14741C;

    /* renamed from: z */
    public long f14742z;

    public final Iterator<C5847bw> iterator() {
        return new C5850a();
    }

    public C5849by(String str, String str2, C5848bx bxVar, byte b, JSONObject jSONObject, byte b2) {
        this(str, str2, bxVar, new LinkedList(), b, jSONObject, b2);
    }

    public C5849by(String str, String str2, C5848bx bxVar, List<C5868ci> list, byte b, JSONObject jSONObject, byte b2) {
        super(str, str2, "CONTAINER", bxVar, list);
        this.f14742z = 0;
        this.f14708f = jSONObject;
        this.f14740B = new C5847bw[1];
        this.f14711i = b;
        this.f14741C = 0;
        this.f14739A = b2;
    }

    /* renamed from: a */
    public final boolean mo34835a() {
        return "root".equalsIgnoreCase(this.f14706d);
    }

    /* renamed from: b */
    public final boolean mo34836b() {
        return "card_scrollable".equalsIgnoreCase(this.f14706d);
    }

    /* renamed from: com.inmobi.media.by$a */
    /* compiled from: NativeContainerAsset */
    class C5850a implements Iterator<C5847bw> {

        /* renamed from: b */
        private int f14744b = 0;

        public C5850a() {
        }

        public final boolean hasNext() {
            return this.f14744b < C5849by.this.f14741C;
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }

        public final /* synthetic */ Object next() {
            C5847bw[] b = C5849by.this.f14740B;
            int i = this.f14744b;
            this.f14744b = i + 1;
            return b[i];
        }
    }

    /* renamed from: a */
    public final C5847bw mo34834a(int i) {
        if (i < 0 || i >= this.f14741C) {
            return null;
        }
        return this.f14740B[i];
    }
}
