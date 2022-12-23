package com.bytedance.sdk.openadsdk.p133c;

import android.util.SparseArray;
import com.bytedance.sdk.component.utils.C2905l;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.sdk.openadsdk.c.a */
/* compiled from: BaseHook */
public abstract class C3147a implements C3149c {

    /* renamed from: a */
    private SparseArray<Method> f7388a;

    /* renamed from: b */
    private Object f7389b;

    /* renamed from: a */
    public abstract String mo18777a();

    /* renamed from: a */
    public <T> T mo18776a(int i, Object... objArr) {
        Object obj;
        Method method = this.f7388a.get(i);
        if (method == null || (obj = this.f7389b) == null) {
            String a = mo18777a();
            C2905l.m8117d(a, "call method " + i + " failed for null ");
            return null;
        }
        try {
            if (obj instanceof Class) {
                return method.invoke((Object) null, objArr);
            }
            return method.invoke(obj, objArr);
        } catch (Throwable th) {
            String a2 = mo18777a();
            C2905l.m8117d(a2, "call method " + i + " failed: " + th.getMessage());
            return null;
        }
    }
}
