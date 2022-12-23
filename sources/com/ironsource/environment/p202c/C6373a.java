package com.ironsource.environment.p202c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.C6363a;
import com.ironsource.environment.C6393h;
import com.ironsource.environment.p204e.C6387c;
import com.ironsource.p199d.C6356a;
import com.vungle.warren.VungleApiClient;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.environment.c.a */
public final class C6373a {

    /* renamed from: a */
    public ConcurrentHashMap<String, Object> f16141a;

    /* renamed from: b */
    AtomicBoolean f16142b;

    /* renamed from: c */
    public AtomicBoolean f16143c;

    /* renamed from: com.ironsource.environment.c.a$a */
    public static class C6375a {

        /* renamed from: a */
        public static volatile C6373a f16146a = new C6373a((byte) 0);
    }

    private C6373a() {
        this.f16142b = new AtomicBoolean(false);
        this.f16143c = new AtomicBoolean(false);
        this.f16141a = new ConcurrentHashMap<>();
    }

    /* synthetic */ C6373a(byte b) {
        this();
    }

    /* renamed from: a */
    private void m19040a(String str) {
        try {
            this.f16141a.remove(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private boolean m19041b(String str) {
        try {
            return this.f16141a.containsKey(str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    private void m19042c(final Context context) {
        if (!this.f16142b.get()) {
            try {
                this.f16142b.set(true);
                C6387c.m19071b(new Runnable() {
                    public final void run() {
                        String[] C;
                        try {
                            C6373a aVar = C6373a.this;
                            Context context = context;
                            if (!(context == null || (C = C6393h.m19090C(context)) == null || C.length != 2)) {
                                String str = C[0];
                                Boolean valueOf = Boolean.valueOf(C[1]);
                                if (!TextUtils.isEmpty(str)) {
                                    aVar.mo35884a(VungleApiClient.GAID, str);
                                    aVar.mo35884a("lat", valueOf);
                                }
                            }
                        } catch (Exception unused) {
                        }
                        C6373a.this.f16142b.set(false);
                    }
                }, 0);
            } catch (Exception unused) {
                this.f16142b.set(false);
            }
        }
    }

    /* renamed from: a */
    public final JSONObject mo35883a(Context context) {
        mo35885b(context);
        return new JSONObject(C6376b.m19046a(this.f16141a));
    }

    /* renamed from: a */
    public void mo35884a(String str, Object obj) {
        if (str != null && obj != null) {
            try {
                if (obj instanceof Boolean) {
                    obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                }
                this.f16141a.put(str, obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void mo35885b(Context context) {
        if (context != null) {
            m19042c(context);
            String B = C6393h.m19089B(context);
            if (!TextUtils.isEmpty(B)) {
                mo35884a("asid", B);
            } else if (m19041b("asid")) {
                m19040a("asid");
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                mo35884a("lang", language.toUpperCase());
            }
            String c = C6393h.m19103c();
            if (!TextUtils.isEmpty(c)) {
                mo35884a("tz", c);
            }
            String a = C6356a.m18974a(context);
            if (!TextUtils.isEmpty(a) && !a.equals("none")) {
                mo35884a("connt", a);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                mo35884a("vpn", Boolean.valueOf(C6356a.m18979c(context)));
            }
            String j = C6393h.m19119j(context);
            if (!TextUtils.isEmpty(j)) {
                mo35884a("icc", j);
            }
            mo35884a("vol", Float.valueOf(C6393h.m19123l(context)));
            mo35884a("dfs", String.valueOf(C6393h.m19131p()));
            mo35884a("scrnw", Integer.valueOf(C6393h.m19121k()));
            mo35884a("scrnh", Integer.valueOf(C6393h.m19124l()));
            mo35884a("ltime", String.valueOf(C6393h.m19094a()));
            mo35884a("tzoff", String.valueOf(C6393h.m19100b()));
            mo35884a("mcc", Integer.valueOf(C6363a.C63641.m19014c(context)));
            mo35884a("mnc", Integer.valueOf(C6363a.C63641.m19017d(context)));
            mo35884a("sdcrd", Boolean.valueOf(C6393h.m19107d()));
            mo35884a("chrg", Boolean.valueOf(C6393h.m19110e(context)));
            mo35884a("chrgt", Integer.valueOf(C6393h.m19112f(context)));
            mo35884a("apm", Boolean.valueOf(C6393h.m19114g(context)));
            mo35884a("owp", Boolean.valueOf(C6393h.m19116h(context)));
            mo35884a("rt", Boolean.valueOf(C6393h.m19120j()));
            mo35884a("sscl", String.valueOf(C6393h.m19129o()));
            mo35884a("bat", Integer.valueOf(C6393h.m19141v(context)));
            mo35884a("lpm", Boolean.valueOf(C6393h.m19142w(context)));
            mo35884a("apor", C6393h.m19128n(context));
            mo35884a("ua", C6393h.m19136r());
            int D = C6393h.m19091D(context);
            if (D >= 0) {
                mo35884a("tca", Integer.valueOf(D));
            }
            String E = C6393h.m19092E(context);
            if (E != null) {
                mo35884a("tcs", E);
            }
        }
    }
}
