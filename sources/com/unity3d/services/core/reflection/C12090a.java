package com.unity3d.services.core.reflection;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.unity3d.services.core.reflection.a */
/* compiled from: GenericBridge */
public abstract class C12090a {

    /* renamed from: a */
    private final String f29491a = mo70785g();

    /* renamed from: b */
    private final Map<String, Class<?>[]> f29492b;

    /* renamed from: c */
    private final Map<String, Method> f29493c;

    /* renamed from: d */
    private boolean f29494d = false;

    public C12090a(Map<String, Class<?>[]> map) {
        this.f29492b = map;
        this.f29493c = new HashMap();
        m32951d();
    }

    /* renamed from: a */
    private Method m32949a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (Exception e) {
            C12065a.m32843a("ERROR: Could not find method %s in %s", str, cls.getName() + " " + e.getLocalizedMessage());
            C12136a.m33103c().mo71310a((Enum) C12143b.GMA, (Enum) GMAEvent.METHOD_ERROR, new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    private Method m32950b(String str) {
        return this.f29493c.get(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m32951d() {
        /*
            r9 = this;
            java.util.Map r0 = r9.mo71237h()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 1
            r3 = r2
        L_0x000f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0052
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            java.lang.Class[] r5 = (java.lang.Class[]) r5
            java.lang.Class r6 = r9.mo71235e()     // Catch:{ Exception -> 0x003b }
            java.lang.Object r7 = r4.getKey()     // Catch:{ Exception -> 0x003b }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x003b }
            java.lang.reflect.Method r6 = r9.m32949a((java.lang.Class<?>) r6, (java.lang.String) r7, (java.lang.Class<?>[]) r5)     // Catch:{ Exception -> 0x003b }
            if (r6 == 0) goto L_0x000f
            java.util.Map<java.lang.String, java.lang.reflect.Method> r7 = r9.f29493c     // Catch:{ Exception -> 0x003b }
            java.lang.Object r8 = r4.getKey()     // Catch:{ Exception -> 0x003b }
            r7.put(r8, r6)     // Catch:{ Exception -> 0x003b }
            goto L_0x000f
        L_0x003b:
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r6 = r9.f29491a
            r3[r1] = r6
            java.lang.Object r4 = r4.getKey()
            r3[r2] = r4
            r4 = 2
            r3[r4] = r5
            java.lang.String r4 = "ERROR: Could not find %s class with method %s and parameters : %s"
            com.unity3d.services.core.log.C12065a.m32843a((java.lang.String) r4, (java.lang.Object[]) r3)
            r3 = r1
            goto L_0x000f
        L_0x0052:
            r9.f29494d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.reflection.C12090a.m32951d():void");
    }

    /* renamed from: e */
    public Class<?> mo71235e() {
        try {
            return Class.forName(this.f29491a);
        } catch (ClassNotFoundException e) {
            C12065a.m32843a("ERROR: Could not find Class %s %s", this.f29491a, e.getLocalizedMessage());
            return null;
        }
    }

    /* renamed from: f */
    public boolean mo71236f() {
        if (mo71235e() == null) {
            C12065a.m32843a("ERROR: Could not find class %s", this.f29491a);
            return false;
        }
        if (!this.f29494d) {
            m32951d();
        }
        if (this.f29493c.size() == mo71237h().size()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract String mo70785g();

    /* renamed from: h */
    public Map<String, Class<?>[]> mo71237h() {
        return this.f29492b;
    }

    /* renamed from: b */
    public void mo71234b(String str, Object obj, Object... objArr) {
        Method b = m32950b(str);
        if (b == null) {
            C12065a.m32843a("ERROR: Could not find method %s", str);
            return;
        }
        try {
            b.invoke(obj, objArr);
        } catch (Exception e) {
            C12065a.m32843a("ERROR: Could not invoke method %s : %s", str, e.getLocalizedMessage());
        }
    }

    /* renamed from: a */
    public <T> T mo71233a(String str, Object obj, Object... objArr) {
        Method b = m32950b(str);
        if (b == null) {
            C12065a.m32843a("ERROR: Could not find method %s", str);
            return null;
        }
        try {
            return b.invoke(obj, objArr);
        } catch (Exception e) {
            C12065a.m32843a("ERROR: Could not invoke method %s : %s", str, e.getLocalizedMessage());
            return null;
        }
    }
}
