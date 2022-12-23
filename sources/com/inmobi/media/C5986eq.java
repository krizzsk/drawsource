package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.common.net.HttpHeaders;
import com.inmobi.media.C6074ft;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.inmobi.media.eq */
/* compiled from: OmidServiceJsFetcher */
public class C5986eq {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f15176a = C5986eq.class.getSimpleName();

    /* renamed from: a */
    public static void m17816a(final C6074ft.C6086h hVar) {
        String str = hVar.url;
        final int i = hVar.maxRetries;
        final int i2 = hVar.retryInterval;
        if (str != null) {
            final C6156ha haVar = new C6156ha(ShareTarget.METHOD_GET, str);
            HashMap hashMap = new HashMap();
            hashMap.put(HttpHeaders.ACCEPT_ENCODING, "gzip");
            haVar.f15539t = false;
            haVar.f15534o = false;
            haVar.mo35338a((Map<String, String>) hashMap);
            new Thread(new Runnable() {
                public final void run() {
                    if (C5986eq.m17817b(C6074ft.C6086h.this)) {
                        int i = 0;
                        while (i <= i) {
                            String unused = C5986eq.f15176a;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            C6157hb a = new C6159hd(haVar).mo35353a();
                            try {
                                C6244je.m18561a().mo35474a(haVar.mo35347g());
                                C6244je.m18561a().mo35475b(a.mo35352d());
                                C6244je.m18561a().mo35476c(SystemClock.elapsedRealtime() - elapsedRealtime);
                            } catch (Exception unused2) {
                                String unused3 = C5986eq.f15176a;
                            }
                            Context c = C6183hw.m18324c();
                            if (a.mo35349a()) {
                                String unused4 = C5986eq.f15176a;
                                i++;
                                if (i <= i) {
                                    try {
                                        Thread.sleep((long) (i2 * 1000));
                                    } catch (InterruptedException unused5) {
                                        String unused6 = C5986eq.f15176a;
                                    }
                                } else {
                                    return;
                                }
                            } else if (c != null) {
                                C6198if ifVar = new C6198if(c, "omid_js_store");
                                List list = a.f15543c.get("Content-Encoding");
                                if (list == null || !((String) list.get(0)).equals("gzip")) {
                                    ifVar.mo35417b("omid_js_string", a.mo35350b());
                                    String unused7 = C5986eq.f15176a;
                                    return;
                                }
                                String unused8 = C5986eq.f15176a;
                                byte[] a2 = C6196id.m18391a(a.mo35351c());
                                if (a2 != null) {
                                    try {
                                        ifVar.mo35417b("omid_js_string", new String(a2, "UTF-8"));
                                        String unused9 = C5986eq.f15176a;
                                        return;
                                    } catch (UnsupportedEncodingException unused10) {
                                        String unused11 = C5986eq.f15176a;
                                        String unused12 = C5986eq.f15176a;
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
            }).start();
        }
    }

    /* renamed from: b */
    static /* synthetic */ boolean m17817b(C6074ft.C6086h hVar) {
        Context c = C6183hw.m18324c();
        if (c == null) {
            return false;
        }
        return (System.currentTimeMillis() / 1000) - new C6198if(c, "omid_js_store").mo35409a() > hVar.expiry;
    }
}
