package com.applovin.impl.sdk.network;

import androidx.core.util.Consumer;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.network.C2004e;
import com.applovin.impl.sdk.p052d.C1881f;
import com.applovin.impl.sdk.utils.C2050h;
import com.applovin.impl.sdk.utils.C2090m;
import com.applovin.impl.sdk.utils.C2098r;
import com.applovin.impl.sdk.utils.C2099s;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.SAXException;

/* renamed from: com.applovin.impl.sdk.network.b */
public class C1995b {

    /* renamed from: a */
    private static final List<String> f3802a = Arrays.asList(new String[]{"5.0/i", "4.0/ad", "1.0/mediate"});
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1969m f3803b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2102v f3804c;

    /* renamed from: d */
    private final C2004e f3805d;

    /* renamed from: com.applovin.impl.sdk.network.b$a */
    public static class C1997a {

        /* renamed from: a */
        private long f3806a;

        /* renamed from: b */
        private long f3807b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m4618a(long j) {
            this.f3806a = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m4620b(long j) {
            this.f3807b = j;
        }

        /* renamed from: a */
        public long mo14698a() {
            return this.f3806a;
        }

        /* renamed from: b */
        public long mo14699b() {
            return this.f3807b;
        }
    }

    /* renamed from: com.applovin.impl.sdk.network.b$b */
    private class C1998b<T> implements Consumer<C2004e.C2010c> {

        /* renamed from: b */
        private final String f3809b;

        /* renamed from: c */
        private final C2000c<T> f3810c;

        /* renamed from: d */
        private final String f3811d;

        /* renamed from: e */
        private final T f3812e;

        /* renamed from: f */
        private final boolean f3813f;

        /* renamed from: g */
        private final long f3814g;

        /* renamed from: h */
        private final C1997a f3815h;

        /* renamed from: i */
        private final C1999c<T> f3816i;

        private C1998b(String str, C2000c<T> cVar, String str2, T t, boolean z, long j, C1997a aVar, C1999c<T> cVar2) {
            this.f3809b = str;
            this.f3810c = cVar;
            this.f3811d = str2;
            this.f3812e = t;
            this.f3813f = z;
            this.f3814g = j;
            this.f3815h = aVar;
            this.f3816i = cVar2;
        }

        /* renamed from: a */
        public void accept(C2004e.C2010c cVar) {
            Throwable th;
            C1999c<T> cVar2;
            Object obj = null;
            int i = 0;
            try {
                i = cVar.mo14755a();
                if (i > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f3814g;
                    if (i < 200 || i >= 400) {
                        cVar2 = this.f3816i;
                    } else {
                        if (this.f3815h != null) {
                            this.f3815h.m4618a(currentTimeMillis);
                        }
                        C1995b.this.m4614a(this.f3811d, this.f3809b, i, this.f3814g);
                        String b = cVar.mo14756b();
                        if (Utils.isDspDemoApp(C1995b.this.f3803b.mo14520L())) {
                            String str = "";
                            String str2 = b != null ? b : str;
                            if (this.f3810c.mo14708e() != null) {
                                str = this.f3810c.mo14708e().toString();
                            }
                            C1995b.this.f3803b.mo14557ag().mo14486a(str2, this.f3809b, str);
                        }
                        if (b != null) {
                            if (C2102v.m5104a()) {
                                C1995b.this.f3804c.mo15010a("ConnectionManager", b);
                            }
                            if (this.f3815h != null) {
                                this.f3815h.m4620b((long) b.length());
                            }
                            if (this.f3813f) {
                                String a = C2090m.m5045a(b, C1995b.this.f3803b.mo14597z());
                                if (a == null) {
                                    HashMap hashMap = new HashMap(2);
                                    hashMap.put("request", StringUtils.getHostAndPath(this.f3809b));
                                    hashMap.put("response", b);
                                    C1995b.this.f3803b.mo14594w().trackEvent("rdf", hashMap);
                                }
                                b = a;
                            }
                            try {
                                this.f3816i.mo13587a(C1995b.this.m4609a(b, this.f3812e), i);
                                return;
                            } catch (Throwable th2) {
                                String str3 = "Unable to parse response from " + C1995b.this.m4611a(this.f3809b);
                                if (C2102v.m5104a()) {
                                    C1995b.this.f3804c.mo15013b("ConnectionManager", str3, th2);
                                }
                                C1995b.this.f3803b.mo14527T().mo14351a(C1881f.f3473i);
                                this.f3816i.mo13585a(AppLovinErrorCodes.INVALID_RESPONSE, str3, null);
                                return;
                            }
                        } else {
                            this.f3816i.mo13587a(this.f3812e, i);
                            return;
                        }
                    }
                } else {
                    C1995b.this.m4615a(this.f3811d, this.f3809b, i, this.f3814g, (Throwable) null);
                    cVar2 = this.f3816i;
                }
                cVar2.mo13585a(i, (String) null, null);
                return;
            } catch (MalformedURLException e) {
                int i2 = i;
                if (this.f3812e != null) {
                    C1995b.this.m4615a(this.f3811d, this.f3809b, i2, this.f3814g, (Throwable) e);
                    this.f3816i.mo13585a(-901, e.getMessage(), null);
                    return;
                }
                C1995b.this.m4614a(this.f3811d, this.f3809b, i2, this.f3814g);
                this.f3816i.mo13587a(this.f3812e, -901);
                return;
            } catch (Throwable unused) {
            }
            C1995b.this.m4615a(this.f3811d, this.f3809b, i, this.f3814g, th);
            this.f3816i.mo13585a(i, th.getMessage(), obj);
        }
    }

    /* renamed from: com.applovin.impl.sdk.network.b$c */
    public interface C1999c<T> {
        /* renamed from: a */
        void mo13585a(int i, String str, T t);

        /* renamed from: a */
        void mo13587a(T t, int i);
    }

    public C1995b(C1969m mVar) {
        this.f3803b = mVar;
        this.f3804c = mVar.mo14509A();
        C2004e eVar = new C2004e(mVar);
        this.f3805d = eVar;
        eVar.mo14740a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m4606a(Throwable th) {
        if (th instanceof UnknownHostException) {
            return -1009;
        }
        if (th instanceof SocketTimeoutException) {
            return -1001;
        }
        if (th instanceof IOException) {
            return -100;
        }
        return th instanceof JSONException ? -104 : -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public <T> T m4609a(String str, T t) throws JSONException, SAXException, ClassCastException {
        if (t == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (t instanceof JSONObject) {
                return new JSONObject(str);
            }
            if (t instanceof C2098r) {
                return C2099s.m5089a(str, this.f3803b);
            }
            if (t instanceof String) {
                return str;
            }
            if (C2102v.m5104a()) {
                C2102v vVar = this.f3804c;
                vVar.mo15016e("ConnectionManager", "Failed to process response of type '" + t.getClass().getName() + "'");
            }
        }
        return t;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m4611a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4614a(String str, String str2, int i, long j) {
        if (C2102v.m5104a()) {
            C2102v vVar = this.f3804c;
            vVar.mo15014c("ConnectionManager", "Successful " + str + " returned " + i + " in " + (((float) (System.currentTimeMillis() - j)) / 1000.0f) + " s over " + C2050h.m4965f(this.f3803b) + " to " + m4611a(str2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4615a(String str, String str2, int i, long j, Throwable th) {
        if (C2102v.m5104a()) {
            C2102v vVar = this.f3804c;
            vVar.mo15013b("ConnectionManager", "Failed " + str + " returned " + i + " in " + (((float) (System.currentTimeMillis() - j)) / 1000.0f) + " s over " + C2050h.m4965f(this.f3803b) + " to " + m4611a(str2), th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x01f3 A[Catch:{ all -> 0x01cb, all -> 0x0295 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0231 A[Catch:{ all -> 0x01cb, all -> 0x0295 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> void mo14697a(com.applovin.impl.sdk.network.C2000c<T> r23, com.applovin.impl.sdk.network.C1995b.C1997a r24, com.applovin.impl.sdk.network.C1995b.C1999c<T> r25) {
        /*
            r22 = this;
            r13 = r22
            r14 = r25
            if (r23 == 0) goto L_0x02c9
            java.lang.String r0 = r23.mo14701a()
            java.lang.String r15 = r23.mo14704b()
            if (r0 == 0) goto L_0x02c1
            if (r15 == 0) goto L_0x02b9
            if (r14 == 0) goto L_0x02b1
            java.lang.String r1 = r0.toLowerCase()
            java.lang.String r2 = "http"
            boolean r1 = r1.startsWith(r2)
            r12 = 0
            java.lang.String r2 = "ConnectionManager"
            if (r1 != 0) goto L_0x0048
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Requested postback submission to non HTTP endpoint "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = "; skipping..."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            boolean r1 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r1 == 0) goto L_0x0042
            com.applovin.impl.sdk.C2102v.m5110i(r2, r0)
        L_0x0042:
            r1 = -900(0xfffffffffffffc7c, float:NaN)
            r14.mo13585a(r1, r0, r12)
            return
        L_0x0048:
            com.applovin.impl.sdk.m r1 = r13.f3803b
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r3 = com.applovin.impl.sdk.p051c.C1867b.f3221cQ
            java.lang.Object r1 = r1.mo14534a(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0077
            java.lang.String r1 = "https://"
            boolean r3 = r0.contains(r1)
            if (r3 != 0) goto L_0x0077
            boolean r3 = com.applovin.impl.sdk.C2102v.m5104a()
            if (r3 == 0) goto L_0x0071
            com.applovin.impl.sdk.m r3 = r13.f3803b
            com.applovin.impl.sdk.v r3 = r3.mo14509A()
            java.lang.String r4 = "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting..."
            r3.mo15015d(r2, r4)
        L_0x0071:
            java.lang.String r3 = "http://"
            java.lang.String r0 = r0.replace(r3, r1)
        L_0x0077:
            java.util.HashMap r1 = new java.util.HashMap
            r3 = 2
            r1.<init>(r3)
            boolean r7 = r23.mo14719n()
            com.applovin.impl.sdk.m r3 = r13.f3803b
            long r3 = com.applovin.impl.sdk.utils.Utils.getServerAdjustedUnixTimestampMillis(r3)
            java.util.Map r5 = r23.mo14706c()
            if (r5 == 0) goto L_0x0097
            java.util.Map r5 = r23.mo14706c()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x009d
        L_0x0097:
            int r5 = r23.mo14714i()
            if (r5 < 0) goto L_0x0100
        L_0x009d:
            java.util.Map r5 = r23.mo14706c()
            com.applovin.impl.sdk.m r6 = r13.f3803b
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r8 = com.applovin.impl.sdk.p051c.C1867b.f3288df
            java.lang.Object r6 = r6.mo14534a(r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r5 == 0) goto L_0x00c6
            int r8 = r23.mo14714i()
            if (r8 < 0) goto L_0x00c6
            int r8 = r23.mo14714i()
            if (r8 <= 0) goto L_0x00c6
            int r8 = r23.mo14714i()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "current_retry_attempt"
            r5.put(r9, r8)
        L_0x00c6:
            boolean r6 = r6.booleanValue()
            if (r7 == 0) goto L_0x00fc
            com.applovin.impl.sdk.m r8 = r13.f3803b
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r9 = com.applovin.impl.sdk.p051c.C1867b.f3289dg
            java.lang.Object r8 = r8.mo14534a(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            java.lang.String r5 = com.applovin.impl.sdk.utils.Utils.encodeUrlMap(r5, r6, r8)
            com.applovin.impl.sdk.m r6 = r13.f3803b
            java.lang.String r6 = r6.mo14597z()
            java.lang.String r6 = com.applovin.impl.sdk.utils.C2090m.m5046a((java.lang.String) r5, (java.lang.String) r6, (long) r3)
            boolean r8 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r5)
            if (r8 == 0) goto L_0x00f5
            if (r6 != 0) goto L_0x00f5
            java.lang.String r8 = "query"
            r1.put(r8, r5)
        L_0x00f5:
            java.lang.String r5 = "p"
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.appendQueryParameter(r0, r5, r6)
            goto L_0x0100
        L_0x00fc:
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.appendQueryParameters(r0, r5, r6)
        L_0x0100:
            r11 = r0
            long r16 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(r11)     // Catch:{ all -> 0x0295 }
            java.util.List<java.lang.String> r5 = f3802a     // Catch:{ all -> 0x0295 }
            java.lang.Boolean r0 = com.applovin.impl.sdk.utils.StringUtils.endsWith(r0, r5)     // Catch:{ all -> 0x0295 }
            boolean r5 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x0295 }
            if (r5 == 0) goto L_0x0150
            com.applovin.impl.sdk.v r5 = r13.f3804c     // Catch:{ all -> 0x0295 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0295 }
            r6.<init>()     // Catch:{ all -> 0x0295 }
            java.lang.String r8 = "Sending "
            r6.append(r8)     // Catch:{ all -> 0x0295 }
            r6.append(r15)     // Catch:{ all -> 0x0295 }
            java.lang.String r8 = " request to id=#"
            r6.append(r8)     // Catch:{ all -> 0x0295 }
            int r8 = r11.hashCode()     // Catch:{ all -> 0x0295 }
            r6.append(r8)     // Catch:{ all -> 0x0295 }
            java.lang.String r8 = " \""
            r6.append(r8)     // Catch:{ all -> 0x0295 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0295 }
            if (r0 == 0) goto L_0x013d
            r0 = r11
            goto L_0x0141
        L_0x013d:
            java.lang.String r0 = com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(r11)     // Catch:{ all -> 0x0295 }
        L_0x0141:
            r6.append(r0)     // Catch:{ all -> 0x0295 }
            java.lang.String r0 = "\"..."
            r6.append(r0)     // Catch:{ all -> 0x0295 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0295 }
            r5.mo15014c(r2, r0)     // Catch:{ all -> 0x0295 }
        L_0x0150:
            com.applovin.impl.sdk.network.e$b$a r0 = new com.applovin.impl.sdk.network.e$b$a     // Catch:{ all -> 0x0295 }
            r0.<init>()     // Catch:{ all -> 0x0295 }
            com.applovin.impl.sdk.network.e$b$a r0 = r0.mo14748a((java.lang.String) r11)     // Catch:{ all -> 0x0295 }
            com.applovin.impl.sdk.network.e$b$a r0 = r0.mo14754b((java.lang.String) r15)     // Catch:{ all -> 0x0295 }
            java.util.Map r5 = r23.mo14707d()     // Catch:{ all -> 0x0295 }
            com.applovin.impl.sdk.network.e$b$a r0 = r0.mo14750a((java.util.Map<java.lang.String, java.lang.String>) r5)     // Catch:{ all -> 0x0295 }
            int r5 = r23.mo14715j()     // Catch:{ all -> 0x0295 }
            com.applovin.impl.sdk.network.e$b$a r10 = r0.mo14746a((int) r5)     // Catch:{ all -> 0x0295 }
            org.json.JSONObject r0 = r23.mo14708e()     // Catch:{ all -> 0x0295 }
            if (r0 == 0) goto L_0x0238
            if (r7 == 0) goto L_0x0197
            org.json.JSONObject r0 = r23.mo14708e()     // Catch:{ all -> 0x0295 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0295 }
            com.applovin.impl.sdk.m r5 = r13.f3803b     // Catch:{ all -> 0x0295 }
            java.lang.String r5 = r5.mo14597z()     // Catch:{ all -> 0x0295 }
            java.lang.String r0 = com.applovin.impl.sdk.utils.C2090m.m5046a((java.lang.String) r0, (java.lang.String) r5, (long) r3)     // Catch:{ all -> 0x0295 }
            if (r0 != 0) goto L_0x019f
            java.lang.String r3 = "body"
            org.json.JSONObject r4 = r23.mo14708e()     // Catch:{ all -> 0x0295 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0295 }
            r1.put(r3, r4)     // Catch:{ all -> 0x0295 }
            goto L_0x019f
        L_0x0197:
            org.json.JSONObject r0 = r23.mo14708e()     // Catch:{ all -> 0x0295 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0295 }
        L_0x019f:
            r3 = r0
            boolean r0 = r23.mo14720o()     // Catch:{ all -> 0x0295 }
            java.lang.String r4 = "UTF-8"
            if (r0 == 0) goto L_0x01ec
            if (r3 == 0) goto L_0x01ec
            int r0 = r3.length()     // Catch:{ all -> 0x0295 }
            com.applovin.impl.sdk.m r5 = r13.f3803b     // Catch:{ all -> 0x0295 }
            com.applovin.impl.sdk.c.b<java.lang.Integer> r6 = com.applovin.impl.sdk.p051c.C1867b.f3352et     // Catch:{ all -> 0x0295 }
            java.lang.Object r5 = r5.mo14534a(r6)     // Catch:{ all -> 0x0295 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x0295 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0295 }
            if (r0 <= r5) goto L_0x01ec
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r4)     // Catch:{ all -> 0x01cb }
            byte[] r0 = r3.getBytes(r0)     // Catch:{ all -> 0x01cb }
            byte[] r0 = com.applovin.impl.sdk.utils.Utils.gzip(r0)     // Catch:{ all -> 0x01cb }
            goto L_0x01ed
        L_0x01cb:
            r0 = move-exception
            boolean r5 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x0295 }
            if (r5 == 0) goto L_0x01ec
            com.applovin.impl.sdk.v r5 = r13.f3804c     // Catch:{ all -> 0x0295 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0295 }
            r6.<init>()     // Catch:{ all -> 0x0295 }
            java.lang.String r8 = "Failed to gzip POST body for request "
            r6.append(r8)     // Catch:{ all -> 0x0295 }
            java.lang.String r8 = r13.m4611a((java.lang.String) r11)     // Catch:{ all -> 0x0295 }
            r6.append(r8)     // Catch:{ all -> 0x0295 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0295 }
            r5.mo15013b(r2, r6, r0)     // Catch:{ all -> 0x0295 }
        L_0x01ec:
            r0 = r12
        L_0x01ed:
            boolean r5 = com.applovin.impl.sdk.C2102v.m5104a()     // Catch:{ all -> 0x0295 }
            if (r5 == 0) goto L_0x0215
            com.applovin.impl.sdk.v r5 = r13.f3804c     // Catch:{ all -> 0x0295 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0295 }
            r6.<init>()     // Catch:{ all -> 0x0295 }
            java.lang.String r8 = "Request to "
            r6.append(r8)     // Catch:{ all -> 0x0295 }
            java.lang.String r8 = r13.m4611a((java.lang.String) r11)     // Catch:{ all -> 0x0295 }
            r6.append(r8)     // Catch:{ all -> 0x0295 }
            java.lang.String r8 = " is "
            r6.append(r8)     // Catch:{ all -> 0x0295 }
            r6.append(r3)     // Catch:{ all -> 0x0295 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0295 }
            r5.mo15012b(r2, r6)     // Catch:{ all -> 0x0295 }
        L_0x0215:
            java.lang.String r2 = "Content-Type"
            java.lang.String r5 = "application/json; charset=utf-8"
            r10.mo14749a(r2, r5)     // Catch:{ all -> 0x0295 }
            boolean r2 = r23.mo14720o()     // Catch:{ all -> 0x0295 }
            if (r2 == 0) goto L_0x022f
            if (r0 == 0) goto L_0x022f
            java.lang.String r2 = "Content-Encoding"
            java.lang.String r3 = "gzip"
            r10.mo14749a(r2, r3)     // Catch:{ all -> 0x0295 }
            r10.mo14752a((byte[]) r0)     // Catch:{ all -> 0x0295 }
            goto L_0x0238
        L_0x022f:
            if (r3 == 0) goto L_0x0238
            byte[] r0 = r3.getBytes(r4)     // Catch:{ all -> 0x0295 }
            r10.mo14752a((byte[]) r0)     // Catch:{ all -> 0x0295 }
        L_0x0238:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0295 }
            if (r0 != 0) goto L_0x0252
            java.lang.String r0 = "request"
            java.lang.String r2 = com.applovin.impl.sdk.utils.StringUtils.getHostAndPath(r11)     // Catch:{ all -> 0x0295 }
            r1.put(r0, r2)     // Catch:{ all -> 0x0295 }
            com.applovin.impl.sdk.m r0 = r13.f3803b     // Catch:{ all -> 0x0295 }
            com.applovin.sdk.AppLovinEventService r0 = r0.mo14594w()     // Catch:{ all -> 0x0295 }
            java.lang.String r2 = "ref"
            r0.trackEvent(r2, r1)     // Catch:{ all -> 0x0295 }
        L_0x0252:
            com.applovin.impl.sdk.network.e r0 = r13.f3805d     // Catch:{ all -> 0x0295 }
            com.applovin.impl.sdk.network.b$b r8 = new com.applovin.impl.sdk.network.b$b     // Catch:{ all -> 0x0295 }
            java.lang.Object r6 = r23.mo14711g()     // Catch:{ all -> 0x0295 }
            r18 = 0
            r1 = r8
            r2 = r22
            r3 = r11
            r4 = r23
            r5 = r15
            r19 = r8
            r8 = r16
            r20 = r10
            r10 = r24
            r21 = r11
            r11 = r25
            r14 = r12
            r12 = r18
            r1.<init>(r3, r4, r5, r6, r7, r8, r10, r11)     // Catch:{ all -> 0x0293 }
            r2 = r19
            r1 = r20
            com.applovin.impl.sdk.network.e$b$a r1 = r1.mo14747a((androidx.core.util.Consumer<com.applovin.impl.sdk.network.C2004e.C2010c>) r2)     // Catch:{ all -> 0x0293 }
            com.applovin.impl.sdk.m r2 = r13.f3803b     // Catch:{ all -> 0x0293 }
            com.applovin.impl.sdk.e.o r2 = r2.mo14526S()     // Catch:{ all -> 0x0293 }
            java.util.concurrent.Executor r2 = r2.mo14434b()     // Catch:{ all -> 0x0293 }
            com.applovin.impl.sdk.network.e$b$a r1 = r1.mo14751a((java.util.concurrent.Executor) r2)     // Catch:{ all -> 0x0293 }
            com.applovin.impl.sdk.network.e$b r1 = r1.mo14753a()     // Catch:{ all -> 0x0293 }
            r0.mo14741a(r1)     // Catch:{ all -> 0x0293 }
            goto L_0x02b0
        L_0x0293:
            r0 = move-exception
            goto L_0x0299
        L_0x0295:
            r0 = move-exception
            r21 = r11
            r14 = r12
        L_0x0299:
            r4 = 0
            r1 = r22
            r2 = r15
            r3 = r21
            r5 = r16
            r7 = r0
            r1.m4615a((java.lang.String) r2, (java.lang.String) r3, (int) r4, (long) r5, (java.lang.Throwable) r7)
            r1 = 0
            java.lang.String r0 = r0.getMessage()
            r2 = r25
            r3 = r14
            r2.mo13585a(r1, r0, r3)
        L_0x02b0:
            return
        L_0x02b1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No callback specified"
            r0.<init>(r1)
            throw r0
        L_0x02b9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No method specified"
            r0.<init>(r1)
            throw r0
        L_0x02c1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No endpoint specified"
            r0.<init>(r1)
            throw r0
        L_0x02c9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "No request specified"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.network.C1995b.mo14697a(com.applovin.impl.sdk.network.c, com.applovin.impl.sdk.network.b$a, com.applovin.impl.sdk.network.b$c):void");
    }
}
