package com.mbridge.msdk.foundation.same.p302c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.same.p300a.C8470a;
import com.mbridge.msdk.foundation.same.p300a.C8472c;
import com.mbridge.msdk.foundation.same.p302c.C8485d;
import com.mbridge.msdk.foundation.same.p304e.C8493b;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8675y;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.c.b */
/* compiled from: CommonImageLoader */
public final class C8481b {

    /* renamed from: a */
    private static C8481b f20808a;

    /* renamed from: b */
    private C8493b f20809b;

    /* renamed from: c */
    private C8472c<String, Bitmap> f20810c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public LinkedHashMap<String, List<C8484c>> f20811d = new LinkedHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f20812e = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            try {
                if (message.what == 1) {
                    String string = message.getData().getString("message_key");
                    Bitmap a = C8480a.m24308a(message.getData().getString("message_bitmap"));
                    C8481b.this.mo57882a(string, a);
                    LinkedList linkedList = (LinkedList) C8481b.this.f20811d.get(string);
                    if (linkedList != null) {
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            C8484c cVar = (C8484c) it.next();
                            if (cVar != null) {
                                cVar.onSuccessLoad(a, string);
                            }
                        }
                    }
                    C8481b.this.f20811d.remove(string);
                } else if (message.what == 2) {
                    String string2 = message.getData().getString("message_key");
                    String string3 = message.getData().getString("message_message");
                    LinkedList linkedList2 = (LinkedList) C8481b.this.f20811d.get(string2);
                    if (linkedList2 != null) {
                        Iterator it2 = linkedList2.iterator();
                        while (it2.hasNext()) {
                            C8484c cVar2 = (C8484c) it2.next();
                            if (cVar2 != null) {
                                cVar2.onFailedLoad(string3, string2);
                            }
                        }
                    }
                    C8481b.this.f20811d.remove(string2);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    };

    /* renamed from: a */
    public final void mo57882a(String str, Bitmap bitmap) {
        if (m24316d(str) == null && bitmap != null) {
            this.f20810c.mo37077a(str, bitmap);
        }
    }

    /* renamed from: d */
    private Bitmap m24316d(String str) {
        return this.f20810c.mo37079b(str);
    }

    private C8481b(Context context) {
        this.f20809b = new C8493b(context);
        C2440a f = C2445b.m6020a().mo16294f(C8388a.m23845e().mo56914h());
        int i = 10;
        int t = f != null ? f.mo16257t() : 10;
        this.f20810c = new C8470a(((int) Runtime.getRuntime().maxMemory()) / (t > 0 ? t : i));
    }

    /* renamed from: a */
    public static C8481b m24310a(Context context) {
        if (f20808a == null) {
            f20808a = new C8481b(context);
        }
        return f20808a;
    }

    /* renamed from: a */
    public final void mo57881a() {
        this.f20810c.mo37080b();
        LinkedHashMap<String, List<C8484c>> linkedHashMap = this.f20811d;
        if (linkedHashMap != null) {
            linkedHashMap.clear();
        }
    }

    /* renamed from: b */
    public static void m24315b() {
        f20808a.mo57885c();
    }

    /* renamed from: a */
    public final void mo57883a(String str, C8484c cVar) {
        String a = C8675y.m24893a(str);
        if (!C8677z.m24920a(str) && !C8677z.m24920a(str) && !C8677z.m24920a(a)) {
            File file = new File(a);
            Bitmap d = m24316d(str);
            if (d != null && !d.isRecycled()) {
                cVar.onSuccessLoad(d, str);
            } else if (file.exists()) {
                Bitmap a2 = C8480a.m24308a(a);
                if (a2 == null || a2.isRecycled()) {
                    m24313a(str, str, a, true, false, cVar);
                    return;
                }
                mo57882a(str, a2);
                cVar.onSuccessLoad(a2, str);
            } else {
                m24313a(str, str, a, false, false, cVar);
            }
        }
    }

    /* renamed from: a */
    public final Bitmap mo57880a(String str) {
        Bitmap a;
        if (C8677z.m24920a(str)) {
            return null;
        }
        String a2 = C8675y.m24893a(str);
        File file = new File(a2);
        if (m24316d(str) != null) {
            return m24316d(str);
        }
        if (!file.exists() || (a = C8480a.m24308a(a2)) == null) {
            return null;
        }
        mo57882a(str, a);
        return a;
    }

    /* renamed from: b */
    public final boolean mo57884b(String str) {
        if (C8677z.m24920a(str)) {
            return false;
        }
        File file = new File(C8675y.m24893a(str));
        if (m24316d(str) == null && !file.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m24313a(String str, String str2, String str3, boolean z, boolean z2, C8484c cVar) {
        if (!this.f20811d.containsKey(str2)) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(cVar);
            this.f20811d.put(str2, linkedList);
            this.f20809b.mo57903a(m24311a(str, str2, str3, z, z2));
            return;
        }
        LinkedList linkedList2 = (LinkedList) this.f20811d.get(str2);
        if (linkedList2 != null && !linkedList2.contains(cVar)) {
            linkedList2.add(cVar);
        }
    }

    /* renamed from: a */
    private C8485d m24311a(String str, String str2, String str3, boolean z, boolean z2) {
        C84832 r6 = new C8485d.C8487a() {
            /* renamed from: a */
            public final void mo57888a(String str, String str2) {
                Message obtainMessage = C8481b.this.f20812e.obtainMessage();
                obtainMessage.what = 1;
                Bundle bundle = new Bundle();
                bundle.putString("message_key", str);
                bundle.putString("message_bitmap", str2);
                obtainMessage.setData(bundle);
                C8481b.this.f20812e.sendMessage(obtainMessage);
            }

            /* renamed from: b */
            public final void mo57889b(String str, String str2) {
                Message obtainMessage = C8481b.this.f20812e.obtainMessage();
                obtainMessage.what = 2;
                Bundle bundle = new Bundle();
                bundle.putString("message_key", str);
                bundle.putString("message_message", str2);
                obtainMessage.setData(bundle);
                C8481b.this.f20812e.sendMessage(obtainMessage);
            }
        };
        C8485d dVar = new C8485d(str, str2, str3);
        dVar.mo57891a(z);
        dVar.mo57890a((C8485d.C8487a) r6);
        return dVar;
    }

    /* renamed from: c */
    public final void mo57885c() {
        C8472c<String, Bitmap> cVar = this.f20810c;
        if (cVar != null) {
            cVar.mo37080b();
        }
    }

    /* renamed from: c */
    public final void mo57886c(String str) {
        try {
            if (this.f20810c != null && this.f20810c.mo37075a().contains(str)) {
                this.f20810c.mo37076a(str);
            }
        } catch (Throwable th) {
            C8672v.m24878d("ImageLoader", th.getMessage());
        }
    }
}
