package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.gg */
/* compiled from: RootConfig */
public class C6115gg extends C6093fu {
    private static final long DEFAULT_EXPIRY = 86400;
    private static final String DEFAULT_FALLBACK_URL = "https://config.inmobi.com/config-server/v1/config/secure.cfg";
    private static final int DEFAULT_MAX_RETRIES = 3;
    private static final int DEFAULT_RETRY_INTERVAL = 60;
    private static final String DEFAULT_URL = "";
    private static final int DEFAULT_WAIT_TIME = 3;
    private static final Object sAcquisitionLock = new Object();
    private List<C6117a> components = new ArrayList();
    private C6118b gdpr = new C6118b();
    C6119c latestSdkInfo = new C6119c();
    private int maxRetries = 3;
    private boolean monetizationDisabled = false;
    private int retryInterval = 60;
    int waitTime = 3;

    /* renamed from: com.inmobi.media.gg$a */
    /* compiled from: RootConfig */
    public static final class C6117a {
        /* access modifiers changed from: package-private */
        public long expiry;
        /* access modifiers changed from: package-private */
        public String fallbackUrl = C6115gg.DEFAULT_FALLBACK_URL;
        /* access modifiers changed from: package-private */
        public String type;
        /* access modifiers changed from: package-private */
        public String url;
    }

    /* renamed from: com.inmobi.media.gg$b */
    /* compiled from: RootConfig */
    public static final class C6118b {
        boolean transmitRequest = true;
    }

    /* renamed from: com.inmobi.media.gg$c */
    /* compiled from: RootConfig */
    public static final class C6119c {
        String url = C6184hx.m18352e();
        String version = C6184hx.m18347b();
    }

    /* renamed from: b */
    public String mo35278b() {
        return "root";
    }

    /* renamed from: a */
    public static C6225is<C6115gg> m18135a() {
        return new C6225is().mo35433a(new C6230ix("components", C6115gg.class), (C6229iw) new C6227iu(new Constructor<List<C6117a>>() {
            public final /* synthetic */ Object construct() {
                return new ArrayList();
            }
        }, C6117a.class));
    }

    C6115gg(String str) {
        super(str);
    }

    /* renamed from: a */
    public boolean mo35301a(C6115gg ggVar) {
        return ((mo35284g() == null && ggVar.mo35284g() == null) || (mo35284g() != null && mo35284g().equals(ggVar.mo35284g()))) && ggVar.maxRetries == this.maxRetries && ggVar.retryInterval == this.retryInterval && ggVar.waitTime == this.waitTime && ggVar.monetizationDisabled == this.monetizationDisabled;
    }

    /* renamed from: c */
    public JSONObject mo35279c() {
        return m18135a().mo35435a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a1, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a3, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a7, code lost:
        if (r8.gdpr == null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a9, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ab, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo35280d() {
        /*
            r8 = this;
            java.util.List<com.inmobi.media.gg$a> r0 = r8.components
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r8.maxRetries
            if (r0 < 0) goto L_0x00af
            int r0 = r8.retryInterval
            if (r0 < 0) goto L_0x00af
            int r0 = r8.waitTime
            if (r0 >= 0) goto L_0x0014
            goto L_0x00af
        L_0x0014:
            com.inmobi.media.gg$c r0 = r8.latestSdkInfo
            java.lang.String r0 = r0.version
            java.lang.String r0 = r0.trim()
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00af
            com.inmobi.media.gg$c r0 = r8.latestSdkInfo
            java.lang.String r0 = r0.url
            java.lang.String r2 = "http://"
            boolean r0 = r0.startsWith(r2)
            if (r0 != 0) goto L_0x003c
            com.inmobi.media.gg$c r0 = r8.latestSdkInfo
            java.lang.String r0 = r0.url
            java.lang.String r2 = "https://"
            boolean r0 = r0.startsWith(r2)
            if (r0 != 0) goto L_0x003c
            goto L_0x00af
        L_0x003c:
            java.lang.Object r0 = sAcquisitionLock
            monitor-enter(r0)
            r2 = r1
        L_0x0040:
            java.util.List<com.inmobi.media.gg$a> r3 = r8.components     // Catch:{ all -> 0x00ac }
            int r3 = r3.size()     // Catch:{ all -> 0x00ac }
            if (r2 >= r3) goto L_0x00a4
            java.util.List<com.inmobi.media.gg$a> r3 = r8.components     // Catch:{ all -> 0x00ac }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x00ac }
            com.inmobi.media.gg$a r3 = (com.inmobi.media.C6115gg.C6117a) r3     // Catch:{ all -> 0x00ac }
            java.lang.String r4 = r3.type     // Catch:{ all -> 0x00ac }
            if (r4 == 0) goto L_0x00a2
            long r4 = r3.expiry     // Catch:{ all -> 0x00ac }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x00ac }
            if (r4 != 0) goto L_0x005d
            goto L_0x00a2
        L_0x005d:
            java.lang.String r4 = r3.type     // Catch:{ all -> 0x00ac }
            java.lang.String r4 = r4.trim()     // Catch:{ all -> 0x00ac }
            int r4 = r4.length()     // Catch:{ all -> 0x00ac }
            if (r4 != 0) goto L_0x006b
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            return r1
        L_0x006b:
            long r4 = r3.expiry     // Catch:{ all -> 0x00ac }
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x00a0
            long r4 = r3.expiry     // Catch:{ all -> 0x00ac }
            r6 = 864000(0xd2f00, double:4.268727E-318)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x007d
            goto L_0x00a0
        L_0x007d:
            java.lang.String r4 = r3.url     // Catch:{ all -> 0x00ac }
            boolean r4 = m18136c(r4)     // Catch:{ all -> 0x00ac }
            if (r4 == 0) goto L_0x0087
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            return r1
        L_0x0087:
            java.lang.String r4 = "root"
            java.lang.String r5 = r3.type     // Catch:{ all -> 0x00ac }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ac }
            if (r4 == 0) goto L_0x009d
            java.lang.String r3 = r3.fallbackUrl     // Catch:{ all -> 0x00ac }
            boolean r3 = m18136c(r3)     // Catch:{ all -> 0x00ac }
            if (r3 == 0) goto L_0x009d
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            return r1
        L_0x009d:
            int r2 = r2 + 1
            goto L_0x0040
        L_0x00a0:
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            return r1
        L_0x00a2:
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            return r1
        L_0x00a4:
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            com.inmobi.media.gg$b r0 = r8.gdpr
            if (r0 == 0) goto L_0x00ab
            r0 = 1
            return r0
        L_0x00ab:
            return r1
        L_0x00ac:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            throw r1
        L_0x00af:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6115gg.mo35280d():boolean");
    }

    /* renamed from: c */
    private static boolean m18136c(String str) {
        if (str == null || str.trim().length() == 0) {
            return true;
        }
        return !str.startsWith("http://") && !str.startsWith("https://");
    }

    /* renamed from: a */
    public long mo35300a(String str) {
        synchronized (sAcquisitionLock) {
            for (int i = 0; i < this.components.size(); i++) {
                C6117a aVar = this.components.get(i);
                if (str.equals(aVar.type)) {
                    long b = aVar.expiry;
                    return b;
                }
            }
            return DEFAULT_EXPIRY;
        }
    }

    /* renamed from: e */
    public int mo35303e() {
        return this.maxRetries;
    }

    /* renamed from: h */
    public int mo35304h() {
        return this.retryInterval;
    }

    /* renamed from: i */
    public boolean mo35305i() {
        return this.monetizationDisabled;
    }

    /* renamed from: j */
    public boolean mo35306j() {
        C6118b bVar = this.gdpr;
        return bVar == null || bVar.transmitRequest;
    }

    /* renamed from: b */
    public String mo35302b(String str) {
        synchronized (sAcquisitionLock) {
            for (int i = 0; i < this.components.size(); i++) {
                C6117a aVar = this.components.get(i);
                if (str.equals(aVar.type)) {
                    String c = aVar.url;
                    return c;
                }
            }
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final String mo35307k() {
        synchronized (sAcquisitionLock) {
            for (C6117a next : this.components) {
                if ("root".equals(next.type)) {
                    String d = next.fallbackUrl;
                    return d;
                }
            }
            return DEFAULT_FALLBACK_URL;
        }
    }
}
