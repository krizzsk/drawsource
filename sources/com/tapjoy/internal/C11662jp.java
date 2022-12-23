package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.jp */
public final class C11662jp {

    /* renamed from: a */
    public static C11662jp f28107a = new C11662jp((String) null);

    /* renamed from: b */
    public String f28108b;

    /* renamed from: c */
    public Throwable f28109c;

    /* renamed from: d */
    private Object[] f28110d;

    public C11662jp(String str) {
        this(str, (Object[]) null, (Throwable) null);
    }

    public C11662jp(String str, Object[] objArr, Throwable th) {
        this.f28108b = str;
        this.f28109c = th;
        if (th == null) {
            this.f28110d = objArr;
        } else if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        } else {
            int length = objArr.length - 1;
            Object[] objArr2 = new Object[length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            this.f28110d = objArr2;
        }
    }
}
