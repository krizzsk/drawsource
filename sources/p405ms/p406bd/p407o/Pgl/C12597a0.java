package p405ms.p406bd.p407o.Pgl;

import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p405ms.p406bd.p407o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.a0 */
final class C12597a0 extends pblb.pgla {
    C12597a0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo16452a(int i, long j, String str, Object obj) throws Throwable {
        Throwable b = C12645y0.m33544a().mo74938b();
        if (b == null) {
            return null;
        }
        StackTraceElement[] stackTrace = b.getStackTrace();
        if (stackTrace.length < 4) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 1; i2 < 4; i2++) {
            if (stackTrace[i2] != null && !TextUtils.isEmpty(stackTrace[i2].getClassName())) {
                Class<?> cls = Class.forName(stackTrace[i2].getClassName());
                C12645y0 a = C12645y0.m33544a();
                String methodName = stackTrace[i2].getMethodName();
                if (a != null) {
                    ArrayList arrayList2 = new ArrayList();
                    if (!TextUtils.isEmpty(methodName)) {
                        for (Method method : cls.getDeclaredMethods()) {
                            if (method != null && method.getName().equals(methodName)) {
                                arrayList2.add(method);
                            }
                        }
                    }
                    arrayList.addAll(arrayList2);
                } else {
                    throw null;
                }
            }
        }
        return arrayList;
    }
}
