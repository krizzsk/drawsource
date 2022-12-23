package com.inmobi.media;

import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;
import com.iab.omid.library.inmobi.Omid;
import com.inmobi.media.C6187hz;
import com.inmobi.media.C6207ij;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.jo */
/* compiled from: UnifiedSdk */
public final class C6258jo {

    /* renamed from: a */
    public static boolean f15769a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f15770b = C6258jo.class.getSimpleName();

    /* renamed from: c */
    private static C6187hz.C6191c f15771c = new C6260a((byte) 0);

    /* renamed from: a */
    public static boolean m18612a() {
        try {
            CustomTabsClient.class.getName();
            Omid.class.getName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    /* renamed from: b */
    public static void m18614b(Context context) {
        C6187hz a = C6187hz.m18359a();
        if (a != null) {
            a.mo35398a(context, f15771c);
        }
    }

    /* renamed from: com.inmobi.media.jo$a */
    /* compiled from: UnifiedSdk */
    static class C6260a implements C6187hz.C6191c {
        private C6260a() {
        }

        /* synthetic */ C6260a(byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo35407a(final boolean z) {
            C6183hw.m18322b(z);
            C6183hw.m18316a((Runnable) new Runnable() {
                public final void run() {
                    if (z) {
                        C6258jo.m18617d();
                    } else {
                        C6258jo.m18613b();
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public static void m18616c(final Context context) {
        if (!f15769a) {
            C6094fv.m18086a();
            C6168hl.m18270a().mo35378b();
            C6232iz.m18518a().mo35443b();
            C6207ij ijVar = C6207ij.C6209a.f15663a;
            C6210ik.m18441n();
            C6183hw.m18316a((Runnable) new Runnable() {
                public final void run() {
                    if (C6184hx.m18349b(context) && C6237jb.m18543b(context).isEmpty()) {
                        C6184hx.m18345a(context, false);
                    }
                    C6221ip.m18470a();
                    C6272jt.m18655c();
                    C6215il.m18452d();
                    C6258jo.m18617d();
                    try {
                        C5806bi.m17300a().mo34779b();
                        C5806bi.m17300a().mo34781d();
                    } catch (Exception unused) {
                        String unused2 = C6258jo.f15770b;
                    }
                    C6258jo.f15769a = true;
                }
            });
        }
    }

    /* renamed from: b */
    public static void m18613b() {
        try {
            C6094fv.m18092b();
            C6168hl a = C6168hl.m18270a();
            C6168hl.f15571a.set(true);
            if (a.f15575c != null) {
                C6139gq gqVar = a.f15575c;
                if (gqVar.f15480e != null) {
                    gqVar.f15480e.shutdownNow();
                    gqVar.f15480e = null;
                }
                gqVar.f15476a.set(false);
                gqVar.f15477b.set(true);
                gqVar.f15479d.clear();
                gqVar.f15478c.clear();
                a.f15575c = null;
            }
            C6246jf.m18571a().mo35478c();
            C5806bi.m17300a().mo34780c();
        } catch (Exception unused) {
            C6195ic.m18378a((byte) 1, f15770b, "SDK encountered unexpected error while stopping internal components");
        }
    }

    /* renamed from: a */
    public static void m18611a(C6256jm jmVar) {
        ObjectOutputStream objectOutputStream;
        FileOutputStream fileOutputStream = null;
        try {
            C6183hw.m18340l();
            Context c = C6183hw.m18324c();
            if (c != null) {
                File file = new File(C6183hw.m18325c(c), "asConfigs");
                if (file.exists()) {
                    file.delete();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    objectOutputStream = new ObjectOutputStream(fileOutputStream2);
                } catch (IOException unused) {
                    objectOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = null;
                    fileOutputStream = fileOutputStream2;
                    C6196id.m18386a((Closeable) fileOutputStream);
                    C6196id.m18386a((Closeable) objectOutputStream);
                    throw th;
                }
                try {
                    objectOutputStream.writeObject(jmVar);
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    C6196id.m18386a((Closeable) fileOutputStream);
                    C6196id.m18386a((Closeable) objectOutputStream);
                    throw th;
                }
                fileOutputStream = fileOutputStream2;
                C6196id.m18386a((Closeable) fileOutputStream);
                C6196id.m18386a((Closeable) objectOutputStream);
            }
        } catch (IOException unused3) {
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream = null;
            C6196id.m18386a((Closeable) fileOutputStream);
            C6196id.m18386a((Closeable) objectOutputStream);
            throw th;
        }
        objectOutputStream = null;
        C6196id.m18386a((Closeable) fileOutputStream);
        C6196id.m18386a((Closeable) objectOutputStream);
    }

    /* renamed from: c */
    public static C6256jm m18615c() {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        Throwable th;
        C6256jm jmVar;
        FileInputStream fileInputStream2 = null;
        try {
            if (C6183hw.m18324c() != null) {
                File file = new File(C6183hw.m18325c(C6183hw.m18324c()), "asConfigs");
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        objectInputStream = new ObjectInputStream(fileInputStream);
                        try {
                            jmVar = (C6256jm) objectInputStream.readObject();
                            fileInputStream2 = fileInputStream;
                            C6196id.m18386a((Closeable) fileInputStream2);
                            C6196id.m18386a((Closeable) objectInputStream);
                            return jmVar;
                        } catch (IOException | ClassNotFoundException unused) {
                            C6196id.m18386a((Closeable) fileInputStream);
                            C6196id.m18386a((Closeable) objectInputStream);
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            C6196id.m18386a((Closeable) fileInputStream);
                            C6196id.m18386a((Closeable) objectInputStream);
                            throw th;
                        }
                    } catch (IOException | ClassNotFoundException unused2) {
                        objectInputStream = null;
                        C6196id.m18386a((Closeable) fileInputStream);
                        C6196id.m18386a((Closeable) objectInputStream);
                        return null;
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                        objectInputStream = null;
                        th = th4;
                        C6196id.m18386a((Closeable) fileInputStream);
                        C6196id.m18386a((Closeable) objectInputStream);
                        throw th;
                    }
                }
            }
            objectInputStream = null;
            jmVar = null;
            C6196id.m18386a((Closeable) fileInputStream2);
            C6196id.m18386a((Closeable) objectInputStream);
            return jmVar;
        } catch (IOException | ClassNotFoundException unused3) {
            objectInputStream = null;
            fileInputStream = null;
            C6196id.m18386a((Closeable) fileInputStream);
            C6196id.m18386a((Closeable) objectInputStream);
            return null;
        } catch (Throwable th5) {
            fileInputStream = null;
            th = th5;
            objectInputStream = null;
            C6196id.m18386a((Closeable) fileInputStream);
            C6196id.m18386a((Closeable) objectInputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m18610a(Context context) {
        if (C6184hx.m18343a(context) == null || !C6184hx.m18343a(context).equals(C6184hx.m18347b())) {
            C6184hx.m18345a(context, C6237jb.m18541a(context));
            C6184hx.m18344a(context, C6184hx.m18347b());
            Context applicationContext = context.getApplicationContext();
            File b = C6183hw.m18319b(applicationContext);
            File c = C6183hw.m18325c(applicationContext);
            C6183hw.m18315a(b, (String) null);
            C6183hw.m18315a(c, (String) null);
            C6183hw.m18328d(applicationContext);
            if (!b.mkdir()) {
                b.isDirectory();
            }
            if (!c.mkdir()) {
                c.isDirectory();
            }
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m18617d() {
        try {
            C6232iz.m18518a().mo35443b();
            C6207ij ijVar = C6207ij.C6209a.f15663a;
            C6094fv.m18086a();
            C5820bn.m17365a().mo34794b();
            C6130gj a = C6130gj.m18161a();
            C6130gj.f15441a.set(false);
            a.f15443b = (C6111gd) C6094fv.m18084a("crashReporting", C6183hw.m18332f(), a);
            a.f15445d = a.f15443b.url;
            if (a.f15444c.mo35314a() > 0) {
                a.mo35311b();
            }
            C6168hl.m18270a().mo35378b();
            C6246jf.m18571a().mo35477b();
            C5806bi.m17300a().mo34779b();
            C6168hl.m18270a().mo35377a("SessionStarted", (Map<String, Object>) new HashMap());
        } catch (Exception unused) {
            C6195ic.m18378a((byte) 2, f15770b, "SDK encountered unexpected error while starting internal components");
        }
    }
}
