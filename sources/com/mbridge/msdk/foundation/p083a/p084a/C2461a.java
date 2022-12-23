package com.mbridge.msdk.foundation.p083a.p084a;

import android.content.Context;
import android.content.SharedPreferences;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.controller.C8396b;
import com.mbridge.msdk.foundation.same.p301b.C8476c;
import com.mbridge.msdk.foundation.same.p301b.C8478e;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.FastKV;

/* renamed from: com.mbridge.msdk.foundation.a.a.a */
/* compiled from: SharedPerferenceManager */
public class C2461a {

    /* renamed from: a */
    public static final String f5166a = C2461a.class.getSimpleName();

    /* renamed from: e */
    private static C2461a f5167e;

    /* renamed from: b */
    SharedPreferences f5168b;

    /* renamed from: c */
    FastKV f5169c;

    /* renamed from: d */
    private final boolean f5170d = C8396b.m23890a().mo56951d();

    private C2461a() {
    }

    /* renamed from: a */
    public static synchronized C2461a m6124a() {
        C2461a aVar;
        synchronized (C2461a.class) {
            if (f5167e == null) {
                f5167e = new C2461a();
            }
            aVar = f5167e;
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo16388a(String str, String str2) {
        try {
            Context g = C8388a.m23845e().mo56913g();
            if (g != null) {
                if (this.f5170d) {
                    if (this.f5169c == null) {
                        try {
                            this.f5169c = new FastKV.Builder(C8478e.m24306b(C8476c.MBRIDGE_700_CONFIG), "mbridge").build();
                        } catch (Exception unused) {
                            this.f5169c = null;
                        }
                    }
                }
                if (this.f5169c != null) {
                    try {
                        this.f5169c.putString(str, str2);
                    } catch (Exception unused2) {
                    }
                } else {
                    if (this.f5168b == null && g != null) {
                        this.f5168b = g.getSharedPreferences("mbridge", 0);
                    }
                    SharedPreferences.Editor edit = this.f5168b.edit();
                    edit.putString(str, str2);
                    edit.apply();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo16386a(String str, int i) {
        try {
            Context g = C8388a.m23845e().mo56913g();
            if (g != null) {
                if (this.f5170d) {
                    if (this.f5169c == null) {
                        try {
                            this.f5169c = new FastKV.Builder(C8478e.m24306b(C8476c.MBRIDGE_700_CONFIG), "mbridge").build();
                        } catch (Exception unused) {
                            this.f5169c = null;
                        }
                    }
                }
                if (this.f5169c != null) {
                    try {
                        this.f5169c.putInt(str, i);
                    } catch (Exception unused2) {
                    }
                } else {
                    if (this.f5168b == null && g != null) {
                        this.f5168b = g.getSharedPreferences("mbridge", 0);
                    }
                    SharedPreferences.Editor edit = this.f5168b.edit();
                    edit.putInt(str, i);
                    edit.apply();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo16387a(String str, long j) {
        try {
            Context g = C8388a.m23845e().mo56913g();
            if (g == null) {
                C8672v.m24878d(f5166a, "context is null in put");
                return;
            }
            if (this.f5170d) {
                if (this.f5169c == null) {
                    try {
                        this.f5169c = new FastKV.Builder(C8478e.m24306b(C8476c.MBRIDGE_700_CONFIG), "mbridge").build();
                    } catch (Exception unused) {
                        this.f5169c = null;
                    }
                }
            }
            if (this.f5169c != null) {
                try {
                    this.f5169c.putLong(str, j);
                } catch (Exception unused2) {
                }
            } else {
                if (this.f5168b == null && g != null) {
                    this.f5168b = g.getSharedPreferences("mbridge", 0);
                }
                SharedPreferences.Editor edit = this.f5168b.edit();
                edit.putLong(str, j);
                edit.apply();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:23|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        return 0L;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0046 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Long mo16385a(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0063 }
            android.content.Context r2 = r2.mo56913g()     // Catch:{ Exception -> 0x0063 }
            if (r2 != 0) goto L_0x0018
            java.lang.String r7 = f5166a     // Catch:{ Exception -> 0x0063 }
            java.lang.String r2 = "context is null in get"
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r7, r2)     // Catch:{ Exception -> 0x0063 }
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0063 }
            return r7
        L_0x0018:
            boolean r3 = r6.f5170d     // Catch:{ Exception -> 0x0063 }
            java.lang.String r4 = "mbridge"
            if (r3 == 0) goto L_0x0037
            com.mbridge.msdk.foundation.tools.FastKV r3 = r6.f5169c     // Catch:{ Exception -> 0x0063 }
            if (r3 != 0) goto L_0x0037
            com.mbridge.msdk.foundation.tools.FastKV$Builder r3 = new com.mbridge.msdk.foundation.tools.FastKV$Builder     // Catch:{ Exception -> 0x0034 }
            com.mbridge.msdk.foundation.same.b.c r5 = com.mbridge.msdk.foundation.same.p301b.C8476c.MBRIDGE_700_CONFIG     // Catch:{ Exception -> 0x0034 }
            java.lang.String r5 = com.mbridge.msdk.foundation.same.p301b.C8478e.m24306b(r5)     // Catch:{ Exception -> 0x0034 }
            r3.<init>(r5, r4)     // Catch:{ Exception -> 0x0034 }
            com.mbridge.msdk.foundation.tools.FastKV r3 = r3.build()     // Catch:{ Exception -> 0x0034 }
            r6.f5169c = r3     // Catch:{ Exception -> 0x0034 }
            goto L_0x0037
        L_0x0034:
            r3 = 0
            r6.f5169c = r3     // Catch:{ Exception -> 0x0063 }
        L_0x0037:
            com.mbridge.msdk.foundation.tools.FastKV r3 = r6.f5169c     // Catch:{ Exception -> 0x0063 }
            if (r3 == 0) goto L_0x004b
            com.mbridge.msdk.foundation.tools.FastKV r2 = r6.f5169c     // Catch:{ Exception -> 0x0046 }
            long r2 = r2.getLong(r7, r0)     // Catch:{ Exception -> 0x0046 }
            java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0046 }
            return r7
        L_0x0046:
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0063 }
            return r7
        L_0x004b:
            android.content.SharedPreferences r3 = r6.f5168b     // Catch:{ Exception -> 0x0063 }
            if (r3 != 0) goto L_0x0058
            if (r2 == 0) goto L_0x0058
            r3 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r4, r3)     // Catch:{ Exception -> 0x0063 }
            r6.f5168b = r2     // Catch:{ Exception -> 0x0063 }
        L_0x0058:
            android.content.SharedPreferences r2 = r6.f5168b     // Catch:{ Exception -> 0x0063 }
            long r2 = r2.getLong(r7, r0)     // Catch:{ Exception -> 0x0063 }
            java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0063 }
            return r7
        L_0x0063:
            r7 = move-exception
            r7.printStackTrace()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p083a.p084a.C2461a.mo16385a(java.lang.String):java.lang.Long");
    }

    /* renamed from: b */
    public final int mo16389b(String str, int i) {
        try {
            Context g = C8388a.m23845e().mo56913g();
            if (g == null) {
                return i;
            }
            if (this.f5170d) {
                if (this.f5169c == null) {
                    try {
                        this.f5169c = new FastKV.Builder(C8478e.m24306b(C8476c.MBRIDGE_700_CONFIG), "mbridge").build();
                    } catch (Exception unused) {
                        this.f5169c = null;
                    }
                }
            }
            if (this.f5169c != null) {
                try {
                    return this.f5169c.getInt(str, i);
                } catch (Exception unused2) {
                    return i;
                }
            } else {
                if (this.f5168b == null) {
                    this.f5168b = g.getSharedPreferences("mbridge", 0);
                }
                return this.f5168b.getInt(str, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0028 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo16390b(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x004c }
            android.content.Context r1 = r1.mo56913g()     // Catch:{ Exception -> 0x004c }
            if (r1 != 0) goto L_0x000c
            return r0
        L_0x000c:
            boolean r2 = r5.f5170d     // Catch:{ Exception -> 0x004c }
            java.lang.String r3 = "mbridge"
            if (r2 == 0) goto L_0x002a
            com.mbridge.msdk.foundation.tools.FastKV r2 = r5.f5169c     // Catch:{ Exception -> 0x004c }
            if (r2 != 0) goto L_0x002a
            com.mbridge.msdk.foundation.tools.FastKV$Builder r2 = new com.mbridge.msdk.foundation.tools.FastKV$Builder     // Catch:{ Exception -> 0x0028 }
            com.mbridge.msdk.foundation.same.b.c r4 = com.mbridge.msdk.foundation.same.p301b.C8476c.MBRIDGE_700_CONFIG     // Catch:{ Exception -> 0x0028 }
            java.lang.String r4 = com.mbridge.msdk.foundation.same.p301b.C8478e.m24306b(r4)     // Catch:{ Exception -> 0x0028 }
            r2.<init>(r4, r3)     // Catch:{ Exception -> 0x0028 }
            com.mbridge.msdk.foundation.tools.FastKV r2 = r2.build()     // Catch:{ Exception -> 0x0028 }
            r5.f5169c = r2     // Catch:{ Exception -> 0x0028 }
            goto L_0x002a
        L_0x0028:
            r5.f5169c = r0     // Catch:{ Exception -> 0x004c }
        L_0x002a:
            com.mbridge.msdk.foundation.tools.FastKV r2 = r5.f5169c     // Catch:{ Exception -> 0x004c }
            java.lang.String r4 = ""
            if (r2 == 0) goto L_0x0038
            com.mbridge.msdk.foundation.tools.FastKV r0 = r5.f5169c     // Catch:{ Exception -> 0x0037 }
            java.lang.String r6 = r0.getString(r6, r4)     // Catch:{ Exception -> 0x0037 }
            return r6
        L_0x0037:
            return r4
        L_0x0038:
            android.content.SharedPreferences r2 = r5.f5168b     // Catch:{ Exception -> 0x004c }
            if (r2 != 0) goto L_0x0045
            if (r1 == 0) goto L_0x0045
            r2 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r2)     // Catch:{ Exception -> 0x004c }
            r5.f5168b = r1     // Catch:{ Exception -> 0x004c }
        L_0x0045:
            android.content.SharedPreferences r1 = r5.f5168b     // Catch:{ Exception -> 0x004c }
            java.lang.String r6 = r1.getString(r6, r4)     // Catch:{ Exception -> 0x004c }
            return r6
        L_0x004c:
            r6 = move-exception
            r6.printStackTrace()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p083a.p084a.C2461a.mo16390b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public final void mo16391c(String str) {
        Context g = C8388a.m23845e().mo56913g();
        if (g != null) {
            if (this.f5170d && this.f5169c == null) {
                try {
                    this.f5169c = new FastKV.Builder(C8478e.m24306b(C8476c.MBRIDGE_700_CONFIG), "mbridge").build();
                } catch (Exception unused) {
                    this.f5169c = null;
                }
            }
            FastKV fastKV = this.f5169c;
            if (fastKV != null) {
                try {
                    fastKV.remove(str);
                } catch (Exception unused2) {
                }
            } else {
                if (this.f5168b == null && g != null) {
                    this.f5168b = g.getSharedPreferences("mbridge", 0);
                }
                this.f5168b.edit().remove(str).apply();
            }
        }
    }
}
