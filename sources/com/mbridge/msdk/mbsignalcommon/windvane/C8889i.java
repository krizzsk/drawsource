package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.mbsignalcommon.p340c.C8861a;
import java.util.regex.Pattern;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.i */
/* compiled from: WindVaneSignalCommunication */
public final class C8889i implements Handler.Callback, C8883c {

    /* renamed from: a */
    protected Pattern f21910a;

    /* renamed from: b */
    protected String f21911b;

    /* renamed from: c */
    protected final int f21912c = 1;

    /* renamed from: d */
    protected Context f21913d;

    /* renamed from: e */
    protected WindVaneWebView f21914e;

    /* renamed from: f */
    protected Handler f21915f;

    public C8889i(Context context) {
        this.f21913d = context;
        this.f21915f = new Handler(Looper.getMainLooper(), this);
    }

    /* renamed from: a */
    public final void mo58677a(WindVaneWebView windVaneWebView) {
        this.f21914e = windVaneWebView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58679b(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 2
            r1 = 0
            r2 = 1
            if (r8 != 0) goto L_0x000d
            goto L_0x006c
        L_0x000d:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r3 = r7.f21914e
            com.mbridge.msdk.mbsignalcommon.windvane.a r3 = com.mbridge.msdk.mbsignalcommon.mraid.C8874c.m25635a(r3, r8)
            if (r3 == 0) goto L_0x001a
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r8 = r7.f21914e
            r3.f21883a = r8
            goto L_0x006d
        L_0x001a:
            java.util.regex.Pattern r3 = r7.f21910a
            java.util.regex.Matcher r8 = r3.matcher(r8)
            boolean r3 = r8.matches()
            if (r3 == 0) goto L_0x006c
            com.mbridge.msdk.mbsignalcommon.windvane.a r3 = new com.mbridge.msdk.mbsignalcommon.windvane.a
            r3.<init>()
            int r4 = r8.groupCount()
            r5 = 5
            if (r4 < r5) goto L_0x0038
            java.lang.String r5 = r8.group(r5)
            r3.f21888f = r5
        L_0x0038:
            r5 = 3
            if (r4 < r5) goto L_0x006c
            java.lang.String r4 = r8.group(r2)
            r3.f21886d = r4
            java.lang.String r4 = r8.group(r0)
            r3.f21889g = r4
            java.lang.String r8 = r8.group(r5)
            r3.f21887e = r8
            java.util.HashMap<java.lang.String, java.lang.String> r8 = com.mbridge.msdk.mbsignalcommon.base.C8860e.f21840k
            if (r8 == 0) goto L_0x0067
            java.util.HashMap<java.lang.String, java.lang.String> r8 = com.mbridge.msdk.mbsignalcommon.base.C8860e.f21840k
            java.lang.String r4 = r3.f21887e
            boolean r8 = r8.containsKey(r4)
            if (r8 == 0) goto L_0x0067
            java.util.HashMap<java.lang.String, java.lang.String> r8 = com.mbridge.msdk.mbsignalcommon.base.C8860e.f21840k
            java.lang.String r4 = r3.f21887e
            java.lang.Object r8 = r8.get(r4)
            java.lang.String r8 = (java.lang.String) r8
            r3.f21887e = r8
        L_0x0067:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r8 = r7.f21914e
            r3.f21883a = r8
            goto L_0x006d
        L_0x006c:
            r3 = r1
        L_0x006d:
            if (r3 != 0) goto L_0x0070
            return
        L_0x0070:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r8 = r3.f21883a
            if (r8 != 0) goto L_0x0075
            goto L_0x007d
        L_0x0075:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r8 = r3.f21883a
            java.lang.String r1 = r3.f21886d
            java.lang.Object r1 = r8.getJsObject(r1)
        L_0x007d:
            if (r1 != 0) goto L_0x0080
            goto L_0x00c9
        L_0x0080:
            android.content.Context r8 = r7.f21913d     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            java.lang.Class r4 = r1.getClass()     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            java.lang.String r4 = r4.getName()     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            com.mbridge.msdk.mbsignalcommon.c.a$c r8 = com.mbridge.msdk.mbsignalcommon.p340c.C8861a.m25577a(r8, r4)     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            java.lang.String r4 = r3.f21887e     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            r5 = 0
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r0[r5] = r6     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r0[r2] = r5     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            com.mbridge.msdk.mbsignalcommon.c.a$d r8 = r8.mo58594a(r4, r0)     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            r8.mo58596a()     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            if (r1 == 0) goto L_0x00c9
            boolean r0 = r1 instanceof com.mbridge.msdk.mbsignalcommon.windvane.C8888h     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            if (r0 == 0) goto L_0x00c9
            r3.f21884b = r1     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            r3.f21885c = r8     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            r3.f21884b = r1     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            android.os.Message r8 = android.os.Message.obtain()     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            r8.what = r2     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            r8.obj = r3     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            android.os.Handler r0 = r7.f21915f     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            r0.sendMessage(r8)     // Catch:{ a -> 0x00c5, Exception -> 0x00c0 }
            goto L_0x00c9
        L_0x00c0:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x00c9
        L_0x00c5:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbsignalcommon.windvane.C8889i.mo58679b(java.lang.String):void");
    }

    public final boolean handleMessage(Message message) {
        String str;
        C8881a aVar = (C8881a) message.obj;
        if (aVar == null) {
            return false;
        }
        try {
            if (message.what != 1) {
                return false;
            }
            Object obj = aVar.f21884b;
            C8861a.C8866d dVar = aVar.f21885c;
            Object[] objArr = new Object[2];
            objArr[0] = aVar;
            if (TextUtils.isEmpty(aVar.f21888f)) {
                str = JsonUtils.EMPTY_JSON;
            } else {
                str = aVar.f21888f;
            }
            objArr[1] = str;
            dVar.mo58595a(obj, objArr);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final boolean mo58678a(String str) {
        if (!C8890j.m25678a(str)) {
            return false;
        }
        this.f21910a = C8890j.m25679b(str);
        this.f21911b = str;
        return true;
    }
}
