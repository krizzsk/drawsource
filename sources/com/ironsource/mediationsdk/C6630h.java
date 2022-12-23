package com.ironsource.mediationsdk;

import android.content.Context;
import android.util.Pair;
import com.ironsource.environment.p204e.C6387c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.server.C6729b;
import com.ironsource.mediationsdk.utils.C6736c;
import com.ironsource.mediationsdk.utils.C6741g;
import com.ironsource.mediationsdk.utils.C6755p;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.h */
public final class C6630h {

    /* renamed from: a */
    C6632i f17188a;

    /* renamed from: b */
    ISBannerSize f17189b;

    /* renamed from: c */
    private final String f17190c = "1";

    /* renamed from: d */
    private final String f17191d = "102";

    /* renamed from: e */
    private final String f17192e = "103";

    /* renamed from: f */
    private final String f17193f = "102";

    /* renamed from: g */
    private final String f17194g = "GenericNotifications";

    /* renamed from: h */
    private String f17195h;

    /* renamed from: i */
    private String f17196i;

    /* renamed from: j */
    private C6736c f17197j;

    /* renamed from: k */
    private C6629g f17198k;

    /* renamed from: com.ironsource.mediationsdk.h$a */
    public static class C6631a implements Runnable {

        /* renamed from: a */
        private WeakReference<C6629g> f17199a;

        /* renamed from: b */
        private int f17200b;

        /* renamed from: c */
        private String f17201c;

        /* renamed from: d */
        private String f17202d;

        /* renamed from: e */
        private List<C6729b> f17203e;

        /* renamed from: f */
        private C6729b f17204f;

        /* renamed from: g */
        private JSONObject f17205g;

        /* renamed from: h */
        private JSONObject f17206h;

        /* renamed from: i */
        private long f17207i;

        /* renamed from: j */
        private int f17208j;

        /* renamed from: k */
        private String f17209k = "other";

        /* renamed from: l */
        private int f17210l;

        /* renamed from: m */
        private String f17211m = "";

        /* renamed from: n */
        private int f17212n = 0;

        /* renamed from: o */
        private final URL f17213o;

        /* renamed from: p */
        private final JSONObject f17214p;

        /* renamed from: q */
        private final boolean f17215q;

        /* renamed from: r */
        private final int f17216r;

        /* renamed from: s */
        private final long f17217s;

        /* renamed from: t */
        private final boolean f17218t;

        /* renamed from: u */
        private final boolean f17219u;

        /* renamed from: v */
        private final int f17220v;

        C6631a(C6629g gVar, URL url, JSONObject jSONObject, boolean z, int i, long j, boolean z2, boolean z3, int i2) {
            this.f17199a = new WeakReference<>(gVar);
            this.f17213o = url;
            this.f17214p = jSONObject;
            this.f17215q = z;
            this.f17216r = i;
            this.f17217s = j;
            this.f17218t = z2;
            this.f17219u = z3;
            this.f17220v = i2;
        }

        /* renamed from: a */
        private static String m20190a(HttpURLConnection httpURLConnection) {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
            }
        }

        /* JADX WARNING: type inference failed for: r0v22, types: [java.net.URLConnection] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0255  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m20191a() {
            /*
                r17 = this;
                r1 = r17
                java.lang.String r2 = "decompression error"
                java.lang.String r3 = "decryption error"
                java.lang.String r4 = "other"
                java.util.Date r0 = new java.util.Date
                r0.<init>()
                long r5 = r0.getTime()
                r1.f17207i = r5
                r5 = 0
                int r0 = r1.f17212n     // Catch:{ Exception -> 0x02a1 }
                r6 = 1015(0x3f7, float:1.422E-42)
                r7 = 1
                if (r0 != r6) goto L_0x001d
                r0 = r7
                goto L_0x001f
            L_0x001d:
                int r0 = r1.f17220v     // Catch:{ Exception -> 0x02a1 }
            L_0x001f:
                r1.f17210l = r0     // Catch:{ Exception -> 0x02a1 }
                r1.f17208j = r5
                r0 = 0
                r8 = r0
            L_0x0025:
                int r0 = r1.f17208j
                int r9 = r1.f17216r
                if (r0 >= r9) goto L_0x0297
                java.util.Date r0 = new java.util.Date     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                r0.<init>()     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                long r9 = r0.getTime()     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.lang.String r11 = "Auction Handler: auction trial "
                r0.<init>(r11)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                int r11 = r1.f17208j     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                int r11 = r11 + r7
                r0.append(r11)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.lang.String r11 = " out of "
                r0.append(r11)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                int r11 = r1.f17216r     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                r0.append(r11)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.lang.String r11 = " max trials"
                r0.append(r11)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.lang.String r0 = r0.toString()     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r12 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                r11.log(r12, r0, r5)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.net.URL r0 = r1.f17213o     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                long r11 = r1.f17217s     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                int r11 = (int) r11     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                r12 = r0
                java.net.HttpURLConnection r12 = (java.net.HttpURLConnection) r12     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.lang.String r0 = "POST"
                r12.setRequestMethod(r0)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                java.lang.String r0 = "Content-Type"
                java.lang.String r13 = "application/json; charset=utf-8"
                r12.setRequestProperty(r0, r13)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                r12.setReadTimeout(r11)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                r12.setDoInput(r7)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                r12.setDoOutput(r7)     // Catch:{ SocketTimeoutException -> 0x0266, Exception -> 0x023f }
                org.json.JSONObject r8 = r1.f17214p     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                boolean r11 = r1.f17218t     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.io.OutputStream r13 = r12.getOutputStream()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.io.OutputStreamWriter r14 = new java.io.OutputStreamWriter     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = "UTF-8"
                r14.<init>(r13, r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.io.BufferedWriter r15 = new java.io.BufferedWriter     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r15.<init>(r14)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r16 = ""
                int r0 = r1.f17210l     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r5 = 2
                if (r0 != r5) goto L_0x00c7
                com.ironsource.mediationsdk.utils.g r0 = com.ironsource.mediationsdk.utils.C6741g.m20413a()     // Catch:{ JSONException -> 0x00a5 }
                java.lang.String r16 = r0.mo36971d()     // Catch:{ JSONException -> 0x00a5 }
                goto L_0x00c7
            L_0x00a5:
                r0 = move-exception
                java.lang.String r5 = r0.getLocalizedMessage()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r1.f17211m = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r1.f17212n = r6     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r1.f17210l = r7     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r7 = "get encrypted session key exception "
                r6.<init>(r7)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r6.append(r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = r6.toString()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r5.error(r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
            L_0x00c7:
                java.lang.String r0 = r8.toString()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r5 = r17.m20192b()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                if (r11 == 0) goto L_0x00dd
                com.ironsource.mediationsdk.logger.IronLog r6 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r7 = "compressing and encrypting auction request"
                r6.verbose(r7)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.compressAndEncrypt(r5, r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                goto L_0x00e1
            L_0x00dd:
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.encode(r5, r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
            L_0x00e1:
                int r5 = r1.f17210l     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r6 = 2
                if (r5 != r6) goto L_0x00f5
                java.lang.String r5 = "{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}"
                java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r6 = 0
                r7[r6] = r16     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r6 = 1
                r7[r6] = r0     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = java.lang.String.format(r5, r7)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                goto L_0x0101
            L_0x00f5:
                java.lang.String r5 = "{\"request\" : \"%1$s\"}"
                r6 = 1
                java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r6 = 0
                r7[r6] = r0     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = java.lang.String.format(r5, r7)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
            L_0x0101:
                r15.write(r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r15.flush()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r15.close()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r14.close()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r13.close()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                int r0 = r12.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r5 = 200(0xc8, float:2.8E-43)
                if (r0 == r5) goto L_0x0157
                r5 = 1001(0x3e9, float:1.403E-42)
                r1.f17200b = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r6 = "Auction status not 200 error, error code response from server - "
                r5.<init>(r6)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r5.append(r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = r5.toString()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r1.f17201c = r0     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r5 = r1.f17201c     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r0.error(r5)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r12.disconnect()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                int r0 = r1.f17208j     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                int r5 = r1.f17216r     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r6 = 1
                int r5 = r5 - r6
                if (r0 >= r5) goto L_0x0154
                long r5 = r1.f17217s     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.util.Date r0 = new java.util.Date     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r0.<init>()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                long r7 = r0.getTime()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                long r7 = r7 - r9
                long r5 = r5 - r7
                r7 = 0
                int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r0 <= 0) goto L_0x0154
                android.os.SystemClock.sleep(r5)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
            L_0x0154:
                r8 = r12
                goto L_0x028b
            L_0x0157:
                java.lang.String r0 = m20190a(r12)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                boolean r5 = r1.f17215q     // Catch:{ JSONException -> 0x01e0 }
                boolean r6 = r1.f17219u     // Catch:{ JSONException -> 0x01e0 }
                boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x01e0 }
                if (r7 != 0) goto L_0x01d8
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01e0 }
                r7.<init>(r0)     // Catch:{ JSONException -> 0x01e0 }
                if (r5 == 0) goto L_0x01b0
                java.lang.String r0 = r17.m20192b()     // Catch:{ JSONException -> 0x01e0 }
                int r5 = r1.f17210l     // Catch:{ JSONException -> 0x01e0 }
                r8 = 2
                if (r5 != r8) goto L_0x0178
                java.lang.String r5 = "ct"
                goto L_0x017a
            L_0x0178:
                java.lang.String r5 = "response"
            L_0x017a:
                java.lang.String r5 = r7.getString(r5)     // Catch:{ JSONException -> 0x01e0 }
                if (r6 == 0) goto L_0x0199
                com.ironsource.mediationsdk.logger.IronLog r6 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ JSONException -> 0x01e0 }
                java.lang.String r7 = "decrypting and decompressing auction response"
                r6.verbose(r7)     // Catch:{ JSONException -> 0x01e0 }
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.decryptAndDecompress(r0, r5)     // Catch:{ JSONException -> 0x01e0 }
                if (r0 == 0) goto L_0x0193
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01e0 }
                r5.<init>(r0)     // Catch:{ JSONException -> 0x01e0 }
                goto L_0x01a8
            L_0x0193:
                org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x01e0 }
                r0.<init>(r2)     // Catch:{ JSONException -> 0x01e0 }
                throw r0     // Catch:{ JSONException -> 0x01e0 }
            L_0x0199:
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.decode(r0, r5)     // Catch:{ JSONException -> 0x01e0 }
                boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x01e0 }
                if (r5 != 0) goto L_0x01aa
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01e0 }
                r5.<init>(r0)     // Catch:{ JSONException -> 0x01e0 }
            L_0x01a8:
                r7 = r5
                goto L_0x01b0
            L_0x01aa:
                org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x01e0 }
                r0.<init>(r3)     // Catch:{ JSONException -> 0x01e0 }
                throw r0     // Catch:{ JSONException -> 0x01e0 }
            L_0x01b0:
                com.ironsource.mediationsdk.C6625f.m20163a()     // Catch:{ JSONException -> 0x01e0 }
                com.ironsource.mediationsdk.f$a r0 = com.ironsource.mediationsdk.C6625f.m20162a((org.json.JSONObject) r7)     // Catch:{ JSONException -> 0x01e0 }
                java.lang.String r5 = r0.f17175a     // Catch:{ JSONException -> 0x01e0 }
                r1.f17202d = r5     // Catch:{ JSONException -> 0x01e0 }
                java.util.List<com.ironsource.mediationsdk.server.b> r5 = r0.f17176b     // Catch:{ JSONException -> 0x01e0 }
                r1.f17203e = r5     // Catch:{ JSONException -> 0x01e0 }
                com.ironsource.mediationsdk.server.b r5 = r0.f17177c     // Catch:{ JSONException -> 0x01e0 }
                r1.f17204f = r5     // Catch:{ JSONException -> 0x01e0 }
                org.json.JSONObject r5 = r0.f17178d     // Catch:{ JSONException -> 0x01e0 }
                r1.f17205g = r5     // Catch:{ JSONException -> 0x01e0 }
                org.json.JSONObject r5 = r0.f17179e     // Catch:{ JSONException -> 0x01e0 }
                r1.f17206h = r5     // Catch:{ JSONException -> 0x01e0 }
                int r5 = r0.f17180f     // Catch:{ JSONException -> 0x01e0 }
                r1.f17200b = r5     // Catch:{ JSONException -> 0x01e0 }
                java.lang.String r0 = r0.f17181g     // Catch:{ JSONException -> 0x01e0 }
                r1.f17201c = r0     // Catch:{ JSONException -> 0x01e0 }
                r12.disconnect()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r2 = 1
                return r2
            L_0x01d8:
                org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x01e0 }
                java.lang.String r5 = "empty response"
                r0.<init>(r5)     // Catch:{ JSONException -> 0x01e0 }
                throw r0     // Catch:{ JSONException -> 0x01e0 }
            L_0x01e0:
                r0 = move-exception
                java.lang.String r5 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                if (r5 == 0) goto L_0x01f9
                java.lang.String r5 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                boolean r5 = r5.equalsIgnoreCase(r3)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                if (r5 == 0) goto L_0x01f9
                r5 = 1003(0x3eb, float:1.406E-42)
                r1.f17200b = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r5 = "Auction decryption error"
                r1.f17201c = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
            L_0x01f9:
                java.lang.String r5 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                if (r5 == 0) goto L_0x0212
                java.lang.String r5 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                boolean r5 = r5.equalsIgnoreCase(r2)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                if (r5 == 0) goto L_0x0212
                r5 = 1008(0x3f0, float:1.413E-42)
                r1.f17200b = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r5 = "Auction decompression error"
            L_0x020f:
                r1.f17201c = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                goto L_0x0219
            L_0x0212:
                r5 = 1002(0x3ea, float:1.404E-42)
                r1.f17200b = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r5 = "Auction parsing error"
                goto L_0x020f
            L_0x0219:
                java.lang.String r5 = "parsing"
                r1.f17209k = r5     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r7 = "Auction handle response exception "
                r6.<init>(r7)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r6.append(r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                java.lang.String r0 = r6.toString()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r5.error(r0)     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r12.disconnect()     // Catch:{ SocketTimeoutException -> 0x023c, Exception -> 0x0239 }
                r2 = 0
                return r2
            L_0x0239:
                r0 = move-exception
                r8 = r12
                goto L_0x0240
            L_0x023c:
                r0 = move-exception
                r8 = r12
                goto L_0x0267
            L_0x023f:
                r0 = move-exception
            L_0x0240:
                com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r5 = "getting exception "
                r3.<init>(r5)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.error(r3)
                if (r8 == 0) goto L_0x0258
                r8.disconnect()
            L_0x0258:
                r2 = 1000(0x3e8, float:1.401E-42)
                r1.f17200b = r2
                java.lang.String r0 = r0.getMessage()
                r1.f17201c = r0
                r1.f17209k = r4
                r2 = 0
                return r2
            L_0x0266:
                r0 = move-exception
            L_0x0267:
                if (r8 == 0) goto L_0x026c
                r8.disconnect()
            L_0x026c:
                r5 = 1006(0x3ee, float:1.41E-42)
                r1.f17200b = r5
                java.lang.String r5 = "Connection timed out"
                r1.f17201c = r5
                com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r7 = "Auction socket timeout exception "
                r6.<init>(r7)
                java.lang.String r0 = r0.getMessage()
                r6.append(r0)
                java.lang.String r0 = r6.toString()
                r5.error(r0)
            L_0x028b:
                int r0 = r1.f17208j
                r5 = 1
                int r0 = r0 + r5
                r1.f17208j = r0
                r7 = r5
                r5 = 0
                r6 = 1015(0x3f7, float:1.422E-42)
                goto L_0x0025
            L_0x0297:
                r5 = r7
                int r9 = r9 - r5
                r1.f17208j = r9
                java.lang.String r0 = "trials_fail"
                r1.f17209k = r0
                r2 = 0
                return r2
            L_0x02a1:
                r0 = move-exception
                r2 = r5
                r3 = 1007(0x3ef, float:1.411E-42)
                r1.f17200b = r3
                java.lang.String r3 = r0.getMessage()
                r1.f17201c = r3
                r1.f17208j = r2
                r1.f17209k = r4
                com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "Auction request exception "
                r4.<init>(r5)
                java.lang.String r0 = r0.getMessage()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r3.error(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6630h.C6631a.m20191a():boolean");
        }

        /* renamed from: b */
        private String m20192b() {
            return this.f17210l == 2 ? C6741g.m20413a().mo36970c() : C6741g.m20413a().mo36969b();
        }

        public final void run() {
            boolean a = m20191a();
            C6629g gVar = (C6629g) this.f17199a.get();
            if (gVar != null) {
                long time = new Date().getTime() - this.f17207i;
                if (a) {
                    gVar.mo36169a(this.f17203e, this.f17202d, this.f17204f, this.f17205g, this.f17206h, this.f17208j + 1, time, this.f17212n, this.f17211m);
                } else {
                    gVar.mo36163a(this.f17200b, this.f17201c, this.f17208j + 1, this.f17209k, time);
                }
            }
        }
    }

    public C6630h(C6632i iVar) {
        this.f17188a = iVar;
    }

    @Deprecated
    public C6630h(String str, C6736c cVar, C6629g gVar) {
        this.f17195h = str;
        this.f17197j = cVar;
        this.f17198k = gVar;
        this.f17196i = IronSourceUtils.getSessionId();
    }

    /* renamed from: a */
    private JSONObject m20182a(Context context, Map<String, Object> map, List<String> list, C6636j jVar, int i, boolean z, IronSourceSegment ironSourceSegment) {
        new JSONObject();
        C6755p c = C6459L.m19304a().f16419i.f17750c.f17356e.mo56487c();
        JSONObject a = m20183a(ironSourceSegment);
        boolean z2 = c.f17792d;
        C6625f a2 = C6625f.m20163a();
        if (z2) {
            return a2.mo36658a(this.f17195h, z, map, list, jVar, i, this.f17189b, a);
        }
        JSONObject a3 = a2.mo36657a(context, map, list, jVar, i, this.f17196i, this.f17197j, this.f17189b, a);
        a3.put("adUnit", this.f17195h);
        a3.put("doNotEncryptResponse", z ? "false" : "true");
        return a3;
    }

    /* renamed from: a */
    private static JSONObject m20183a(IronSourceSegment ironSourceSegment) {
        JSONObject jSONObject = new JSONObject();
        if (ironSourceSegment == null) {
            return null;
        }
        Vector<Pair<String, String>> a = ironSourceSegment.mo36082a();
        for (int i = 0; i < a.size(); i++) {
            try {
                jSONObject.put((String) a.get(i).first, a.get(i).second);
            } catch (JSONException e) {
                e.printStackTrace();
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception " + e.getMessage());
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m20184a(C6729b bVar, int i, C6729b bVar2) {
        for (String a : bVar.mo36947f()) {
            String a2 = C6625f.m20163a().mo36656a(a, i, bVar, "", "", "");
            C6625f.m20163a();
            C6625f.m20168a("reportLoadSuccess", bVar.mo36942a(), a2);
        }
        if (bVar2 != null) {
            for (String a3 : bVar2.mo36947f()) {
                String a4 = C6625f.m20163a().mo36656a(a3, i, bVar, "", "102", "");
                C6625f.m20163a();
                C6625f.m20168a("reportLoadSuccess", "GenericNotifications", a4);
            }
        }
    }

    /* renamed from: a */
    public static void m20185a(C6729b bVar, int i, C6729b bVar2, String str) {
        for (String a : bVar.mo36945d()) {
            String a2 = C6625f.m20163a().mo36656a(a, i, bVar, "", "", str);
            C6625f.m20163a();
            C6625f.m20168a("reportImpression", bVar.mo36942a(), a2);
        }
        if (bVar2 != null) {
            for (String a3 : bVar2.mo36945d()) {
                String a4 = C6625f.m20163a().mo36656a(a3, i, bVar, "", "102", str);
                C6625f.m20163a();
                C6625f.m20168a("reportImpression", "GenericNotifications", a4);
            }
        }
    }

    /* renamed from: a */
    public static void m20186a(ArrayList<String> arrayList, ConcurrentHashMap<String, C6729b> concurrentHashMap, int i, C6729b bVar, C6729b bVar2) {
        Iterator<String> it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals(bVar2.mo36942a())) {
                z2 = i == 2;
                z = true;
            } else {
                int i2 = i;
                C6729b bVar3 = concurrentHashMap.get(next);
                String c = bVar3.mo36944c();
                String str = z ? z2 ? "102" : "103" : "1";
                for (String a : bVar3.mo36946e()) {
                    String a2 = C6625f.m20163a().mo36656a(a, i, bVar2, c, str, "");
                    C6625f.m20163a();
                    C6625f.m20168a("reportAuctionLose", bVar3.mo36942a(), a2);
                }
            }
        }
        int i3 = i;
        if (bVar != null) {
            for (String a3 : bVar.mo36946e()) {
                String a4 = C6625f.m20163a().mo36656a(a3, i, bVar2, "", "102", "");
                C6625f.m20163a();
                C6625f.m20168a("reportAuctionLose", "GenericNotifications", a4);
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo36662a(Context context, Map<String, Object> map, List<String> list, C6636j jVar, int i, IronSourceSegment ironSourceSegment) {
        try {
            boolean z = true;
            if (IronSourceUtils.getSerr() != 1) {
                z = false;
            }
            boolean z2 = z;
            JSONObject a = m20182a(context, map, list, jVar, i, z2, ironSourceSegment);
            C6387c.f16171a.mo35897c(new C6631a(this.f17198k, new URL(this.f17197j.f17571d), a, z2, this.f17197j.f17573f, this.f17197j.f17576i, this.f17197j.f17584q, this.f17197j.f17585r, this.f17197j.f17586s));
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("execute auction exception " + e.getMessage());
            this.f17198k.mo36163a(1000, e.getMessage(), 0, "other", 0);
        }
    }

    /* renamed from: a */
    public final void mo36663a(CopyOnWriteArrayList<C6529ac> copyOnWriteArrayList, ConcurrentHashMap<String, C6729b> concurrentHashMap, int i, C6729b bVar, C6729b bVar2) {
        ArrayList arrayList = new ArrayList();
        Iterator<C6529ac> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo36388k());
        }
        m20186a((ArrayList<String>) arrayList, concurrentHashMap, i, bVar, bVar2);
    }

    /* renamed from: a */
    public final boolean mo36664a() {
        return this.f17188a.f17221a.f17573f > 0;
    }
}
