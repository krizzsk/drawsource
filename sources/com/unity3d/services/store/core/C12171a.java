package com.unity3d.services.store.core;

import com.unity3d.services.ads.gmascar.handlers.C11859e;
import com.unity3d.services.store.C12164a;
import com.unity3d.services.store.C12165b;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONException;

/* renamed from: com.unity3d.services.store.core.a */
/* compiled from: StoreExceptionHandler */
public class C12171a {

    /* renamed from: a */
    private final C11859e f29728a;

    public C12171a(C11859e eVar) {
        this.f29728a = eVar;
    }

    /* renamed from: a */
    public void mo71360a(C12165b bVar, int i, Exception exc) {
        m33177a(bVar, m33176a(exc), i, exc);
    }

    /* renamed from: a */
    private void m33177a(C12165b bVar, C12164a aVar, int i, Exception exc) {
        this.f29728a.handleError(new C12174c(bVar, exc.getMessage(), Integer.valueOf(i), aVar, exc.getMessage()));
    }

    /* renamed from: a */
    private C12164a m33176a(Exception exc) {
        C12164a aVar = C12164a.UNKNOWN_ERROR;
        if (exc instanceof NoSuchMethodException) {
            return C12164a.NO_SUCH_METHOD;
        }
        if (exc instanceof IllegalAccessException) {
            return C12164a.ILLEGAL_ACCESS;
        }
        if (exc instanceof JSONException) {
            return C12164a.JSON_ERROR;
        }
        if (exc instanceof InvocationTargetException) {
            return C12164a.INVOCATION_TARGET;
        }
        return exc instanceof ClassNotFoundException ? C12164a.CLASS_NOT_FOUND : aVar;
    }
}
