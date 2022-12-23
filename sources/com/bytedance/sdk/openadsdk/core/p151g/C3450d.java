package com.bytedance.sdk.openadsdk.core.p151g;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.p178l.C3886o;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.sdk.openadsdk.core.g.d */
/* compiled from: PermissionsManager */
public class C3450d {

    /* renamed from: a */
    private static final String f8499a = C3450d.class.getSimpleName();

    /* renamed from: e */
    private static C3450d f8500e = null;

    /* renamed from: f */
    private static final Map<String, Integer> f8501f = new HashMap();

    /* renamed from: b */
    private final Set<String> f8502b = new HashSet(1);

    /* renamed from: c */
    private final List<WeakReference<C3451e>> f8503c = new ArrayList(1);

    /* renamed from: d */
    private final List<C3451e> f8504d = new ArrayList(1);

    /* renamed from: a */
    public static C3450d m10560a() {
        if (f8500e == null) {
            f8500e = new C3450d();
        }
        return f8500e;
    }

    private C3450d() {
        m10564b();
    }

    /* renamed from: b */
    private synchronized void m10564b() {
        if (Build.VERSION.SDK_INT > 28) {
            m10567c();
            return;
        }
        for (Field field : Manifest.permission.class.getFields()) {
            String str = null;
            try {
                str = (String) field.get("");
            } catch (IllegalAccessException e) {
                Log.e(f8499a, "Could not access field", e);
            }
            this.f8502b.add(str);
        }
    }

    /* renamed from: c */
    private void m10567c() {
        PackageInfo packageInfo;
        String[] strArr;
        Context a = C3513m.m10963a();
        if (a != null) {
            try {
                PackageManager packageManager = a.getPackageManager();
                String packageName = a.getPackageName();
                if (packageManager != null && (packageInfo = packageManager.getPackageInfo(packageName, 4096)) != null && (strArr = packageInfo.requestedPermissions) != null) {
                    if (strArr.length != 0) {
                        for (int i = 0; i < strArr.length; i++) {
                            if (!TextUtils.isEmpty(strArr[i])) {
                                this.f8502b.add(strArr[i]);
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private synchronized void m10562a(String[] strArr, C3451e eVar) {
        if (eVar != null) {
            eVar.mo19735a(strArr);
            this.f8504d.add(eVar);
            this.f8503c.add(new WeakReference(eVar));
        }
    }

    /* renamed from: a */
    private synchronized void m10561a(C3451e eVar) {
        Iterator<WeakReference<C3451e>> it = this.f8503c.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            if (next.get() == eVar || next.get() == null) {
                it.remove();
            }
        }
        Iterator<C3451e> it2 = this.f8504d.iterator();
        while (it2.hasNext()) {
            if (it2.next() == eVar) {
                it2.remove();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0034, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo19734a(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            if (r4 != 0) goto L_0x0006
            monitor-exit(r3)
            return r0
        L_0x0006:
            boolean r1 = com.bytedance.sdk.openadsdk.p178l.C3886o.m12684e()     // Catch:{ all -> 0x0035 }
            r2 = 1
            if (r1 == 0) goto L_0x0024
            boolean r1 = com.bytedance.sdk.openadsdk.core.p151g.C3447a.m10555a(r4, r5)     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0022
            int r4 = com.bytedance.sdk.openadsdk.core.p151g.C3448b.m10558a(r4, r5)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0021
            java.util.Set<java.lang.String> r4 = r3.f8502b     // Catch:{ all -> 0x0035 }
            boolean r4 = r4.contains(r5)     // Catch:{ all -> 0x0035 }
            if (r4 != 0) goto L_0x0022
        L_0x0021:
            r0 = r2
        L_0x0022:
            monitor-exit(r3)
            return r0
        L_0x0024:
            int r4 = com.bytedance.sdk.openadsdk.core.p151g.C3448b.m10558a(r4, r5)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0032
            java.util.Set<java.lang.String> r4 = r3.f8502b     // Catch:{ all -> 0x0035 }
            boolean r4 = r4.contains(r5)     // Catch:{ all -> 0x0035 }
            if (r4 != 0) goto L_0x0033
        L_0x0032:
            r0 = r2
        L_0x0033:
            monitor-exit(r3)
            return r0
        L_0x0035:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p151g.C3450d.mo19734a(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: a */
    public synchronized void mo19732a(Activity activity, String[] strArr, C3451e eVar) {
        if (activity != null) {
            try {
                m10562a(strArr, eVar);
                if (Build.VERSION.SDK_INT < 23) {
                    m10565b(activity, strArr, eVar);
                } else {
                    List<String> c = m10566c(activity, strArr, eVar);
                    if (c.isEmpty()) {
                        m10561a(eVar);
                    } else {
                        C3448b.m10559a(activity, (String[]) c.toArray(new String[c.size()]), 1);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            return;
        }
        return;
    }

    /* renamed from: b */
    private void m10565b(Activity activity, String[] strArr, C3451e eVar) {
        boolean z;
        for (String str : strArr) {
            if (eVar != null) {
                try {
                    if (!this.f8502b.contains(str)) {
                        z = eVar.mo19737a(str, C3449c.NOT_FOUND);
                    } else if (C3448b.m10558a(activity, str) != 0) {
                        z = eVar.mo19737a(str, C3449c.DENIED);
                    } else {
                        z = eVar.mo19737a(str, C3449c.GRANTED);
                    }
                    if (z) {
                        break;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        m10561a(eVar);
    }

    /* renamed from: c */
    private List<String> m10566c(Activity activity, String[] strArr, C3451e eVar) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (!this.f8502b.contains(str)) {
                if (eVar != null) {
                    eVar.mo19737a(str, C3449c.NOT_FOUND);
                }
            } else if (!mo19734a((Context) activity, str)) {
                arrayList.add(str);
            } else if (eVar != null) {
                eVar.mo19737a(str, C3449c.GRANTED);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized void mo19733a(Activity activity, String[] strArr, int[] iArr) {
        try {
            new ArrayList(3);
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String str = strArr[i];
                if ((iArr[i] == -1 || (C3886o.m12684e() && !C3447a.m10555a(activity, str))) && iArr[i] != -1) {
                    iArr[i] = -1;
                }
            }
            m10563a(strArr, iArr, (String[]) null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r0.remove();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10563a(java.lang.String[] r6, int[] r7, java.lang.String[] r8) {
        /*
            r5 = this;
            int r8 = r6.length     // Catch:{ all -> 0x0047 }
            int r0 = r7.length     // Catch:{ all -> 0x0047 }
            if (r0 >= r8) goto L_0x0005
            int r8 = r7.length     // Catch:{ all -> 0x0047 }
        L_0x0005:
            java.util.List<java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.core.g.e>> r0 = r5.f8503c     // Catch:{ all -> 0x0047 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0047 }
        L_0x000b:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0034
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0047 }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x0047 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0047 }
            com.bytedance.sdk.openadsdk.core.g.e r1 = (com.bytedance.sdk.openadsdk.core.p151g.C3451e) r1     // Catch:{ all -> 0x0047 }
            r2 = 0
        L_0x001e:
            if (r2 >= r8) goto L_0x000b
            if (r1 == 0) goto L_0x0030
            r3 = r6[r2]     // Catch:{ all -> 0x0047 }
            r4 = r7[r2]     // Catch:{ all -> 0x0047 }
            boolean r3 = r1.mo19736a((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x0047 }
            if (r3 == 0) goto L_0x002d
            goto L_0x0030
        L_0x002d:
            int r2 = r2 + 1
            goto L_0x001e
        L_0x0030:
            r0.remove()     // Catch:{ all -> 0x0047 }
            goto L_0x000b
        L_0x0034:
            java.util.List<com.bytedance.sdk.openadsdk.core.g.e> r6 = r5.f8504d     // Catch:{ all -> 0x0047 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0047 }
        L_0x003a:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0047 }
            if (r7 == 0) goto L_0x004b
            r6.next()     // Catch:{ all -> 0x0047 }
            r6.remove()     // Catch:{ all -> 0x0047 }
            goto L_0x003a
        L_0x0047:
            r6 = move-exception
            r6.printStackTrace()
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p151g.C3450d.m10563a(java.lang.String[], int[], java.lang.String[]):void");
    }
}
