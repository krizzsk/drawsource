package com.tapjoy.internal;

import com.tapjoy.internal.C11397ej;
import com.tapjoy.internal.C11397ej.C11398a;
import java.io.IOException;
import java.io.Serializable;

/* renamed from: com.tapjoy.internal.ej */
public abstract class C11397ej<M extends C11397ej<M, B>, B extends C11398a<M, B>> implements Serializable {

    /* renamed from: a */
    transient int f27208a = 0;

    /* renamed from: b */
    protected transient int f27209b = 0;

    /* renamed from: c */
    private final transient C11400el<M> f27210c;

    /* renamed from: d */
    private final transient C11648je f27211d;

    protected C11397ej(C11400el<M> elVar, C11648je jeVar) {
        if (elVar == null) {
            throw new NullPointerException("adapter == null");
        } else if (jeVar != null) {
            this.f27210c = elVar;
            this.f27211d = jeVar;
        } else {
            throw new NullPointerException("unknownFields == null");
        }
    }

    /* renamed from: a */
    public final C11648je mo69846a() {
        C11648je jeVar = this.f27211d;
        if (jeVar != null) {
            return jeVar;
        }
        return C11648je.f28077b;
    }

    public String toString() {
        return C11400el.m31149c(this);
    }

    /* renamed from: com.tapjoy.internal.ej$a */
    public static abstract class C11398a<T extends C11397ej<T, B>, B extends C11398a<T, B>> {

        /* renamed from: a */
        C11645jb f27212a;

        /* renamed from: b */
        C11417en f27213b;

        protected C11398a() {
        }

        /* renamed from: a */
        public final C11398a<T, B> mo69849a(C11648je jeVar) {
            if (jeVar.mo70282c() > 0) {
                if (this.f27213b == null) {
                    this.f27212a = new C11645jb();
                    this.f27213b = new C11417en(this.f27212a);
                }
                try {
                    this.f27213b.mo69866a(jeVar);
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
            return this;
        }

        /* renamed from: a */
        public final C11398a<T, B> mo69848a(int i, C11395ei eiVar, Object obj) {
            if (this.f27213b == null) {
                this.f27212a = new C11645jb();
                this.f27213b = new C11417en(this.f27212a);
            }
            try {
                eiVar.mo69845a().mo69855a(this.f27213b, i, obj);
                return this;
            } catch (IOException unused) {
                throw new AssertionError();
            }
        }

        /* renamed from: a */
        public final C11648je mo69850a() {
            C11645jb jbVar = this.f27212a;
            return jbVar != null ? new C11648je(jbVar.clone().mo70272h()) : C11648je.f28077b;
        }
    }
}
