package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.webview.C12136a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.unity3d.services.core.webview.bridge.f */
/* compiled from: NativeCallback */
public class C12149f {

    /* renamed from: a */
    private static AtomicInteger f29663a = new AtomicInteger(0);

    /* renamed from: b */
    private Method f29664b;

    /* renamed from: c */
    private String f29665c = (this.f29664b.getName().toUpperCase(Locale.US) + "_" + f29663a.getAndIncrement());

    public C12149f(Method method) {
        this.f29664b = method;
    }

    /* renamed from: a */
    public String mo71337a() {
        return this.f29665c;
    }

    /* renamed from: a */
    public void mo71338a(String str, Object... objArr) throws InvocationTargetException, IllegalAccessException, IllegalArgumentException {
        Object[] objArr2;
        try {
            C12144a valueOf = C12144a.valueOf(str);
            if (objArr == null) {
                objArr2 = new Object[]{valueOf};
            } else {
                ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
                arrayList.add(0, valueOf);
                objArr2 = arrayList.toArray();
            }
            this.f29664b.invoke((Object) null, objArr2);
            C12136a.m33103c().mo71314b(this);
        } catch (Exception e) {
            C12065a.m32848c("Illegal status");
            C12136a.m33103c().mo71314b(this);
            throw e;
        }
    }
}
