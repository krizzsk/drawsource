package com.tapjoy.internal;

import java.util.Observable;

/* renamed from: com.tapjoy.internal.fu */
public final class C11491fu {

    /* renamed from: a */
    public static final C11492a f27584a = new C11492a();

    /* renamed from: b */
    public static final C11492a f27585b = new C11492a();

    /* renamed from: c */
    public static final C11492a f27586c = new C11492a();

    /* renamed from: d */
    public static final C11492a f27587d = new C11492a();

    /* renamed from: e */
    public static final C11492a f27588e = new C11492a();

    /* renamed from: com.tapjoy.internal.fu$a */
    public static class C11492a extends Observable {
        public final void notifyObservers() {
            setChanged();
            super.notifyObservers();
        }

        public final void notifyObservers(Object obj) {
            setChanged();
            super.notifyObservers(obj);
        }
    }
}
