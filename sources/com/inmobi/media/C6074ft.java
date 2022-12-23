package com.inmobi.media;

import android.graphics.Color;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.exoplayer2.util.MimeTypes;
import com.inmobi.commons.utils.json.Constructor;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ft */
/* compiled from: AdConfig */
public final class C6074ft extends C6093fu {
    private static final String ALLOWED_CONTENT_TYPE = "allowedContentType";
    private static final String DEFAULT_AD_SERVER_URL = "https://ads.inmobi.com/sdk";
    private static final boolean DEFAULT_CCT_ENABLED = true;
    private static final int DEFAULT_FETCH_TIMEOUT = 60;
    private static final int DEFAULT_MAX_POOL_SIZE = 10;
    private static final int DEFAULT_MINIMUM_REFRESH_INTERVAL = 20;
    private static final int DEFAULT_REFRESH_INTERVAL = 60;
    private static final String GESTURE_LIST = "gestures";
    /* access modifiers changed from: private */
    public static final String TAG = C6074ft.class.getSimpleName();
    public C6079a assetCache = new C6079a();
    private Map<String, C6082d> cache;
    public boolean cctEnabled = true;
    public int defaultRefreshInterval = 60;
    public int fetchTimeout = 60;
    public C6083e imai = new C6083e();
    public int maxPoolSize = 10;
    public int minimumRefreshInterval = 20;
    public C6085g mraid = new C6085g();
    public C6087i rendering = new C6087i();
    public C6268jq timeouts = C6268jq.m18631a();
    public String url = DEFAULT_AD_SERVER_URL;
    public C6089k vastVideo = new C6089k();
    public C6091m viewability = new C6091m();

    /* renamed from: com.inmobi.media.ft$a */
    /* compiled from: AdConfig */
    public static final class C6079a {
        public long maxCacheSize = 104857600;
        int maxCachedAssets = 10;
        public int maxRetries = 3;
        public int retryInterval = 1;
        public long timeToLive = 259200;
    }

    /* renamed from: com.inmobi.media.ft$b */
    /* compiled from: AdConfig */
    public static final class C6080b {
        public byte impressionType = 0;
    }

    /* renamed from: com.inmobi.media.ft$c */
    /* compiled from: AdConfig */
    public static final class C6081c {
        public boolean bitrate_mandatory = false;
        public int headerTimeout = 2000;
    }

    /* renamed from: com.inmobi.media.ft$e */
    /* compiled from: AdConfig */
    public static final class C6083e {
        public int maxDbEvents = 500;
        public int maxEventBatch = 10;
        public int maxRetries = 3;
        public long pingCacheExpiry = 10800;
        public int pingInterval = 60;
        public int pingTimeout = 120;
    }

    /* renamed from: com.inmobi.media.ft$f */
    /* compiled from: AdConfig */
    public static final class C6084f {
        public byte impressionType = 1;
    }

    /* renamed from: com.inmobi.media.ft$g */
    /* compiled from: AdConfig */
    public static final class C6085g {
        public long expiry = 432000;
        public int maxRetries = 3;
        public int retryInterval = 60;
        public String url = "https://i.l.inmobicdn.net/sdk/sdk/500/android/mraid.js";
    }

    /* renamed from: com.inmobi.media.ft$h */
    /* compiled from: AdConfig */
    public static final class C6086h {
        public long expiry = 432000;
        public int maxRetries = 3;
        public boolean omidEnabled = true;
        public String partnerKey = "Inmobi";
        public int retryInterval = 60;
        public String url = "https://i.l.inmobicdn.net/sdk/sdk/OMID/omsdk-v1.3.17.js";
        public long webViewRetainTime = 1000;
    }

    /* renamed from: com.inmobi.media.ft$j */
    /* compiled from: AdConfig */
    public static final class C6088j {
        List<String> allowedContentType = new ArrayList(Collections.singletonList("video/mp4"));
        long maxSaveSize = CacheDataSink.DEFAULT_FRAGMENT_SIZE;
    }

    /* renamed from: com.inmobi.media.ft$k */
    /* compiled from: AdConfig */
    public static final class C6089k {
        public List<String> allowedContentType = new ArrayList(Arrays.asList(new String[]{"video/mp4", MimeTypes.IMAGE_JPEG, "image/jpg", "image/gif", "image/png"}));
        public C6081c bitRate = new C6081c();
        public int maxWrapperLimit = 3;
        public long optimalVastVideoSize = 3145728;
        public long vastMaxAssetSize = 31457280;
    }

    /* renamed from: com.inmobi.media.ft$l */
    /* compiled from: AdConfig */
    public static final class C6090l {
        public int impressionMinPercentageViewed = 50;
        public int impressionMinTimeViewed = 2000;
        public int videoMinPercentagePlay = 50;
    }

    /* renamed from: com.inmobi.media.ft$m */
    /* compiled from: AdConfig */
    public static final class C6091m {
        static final int MIN_IMPRESSION_POLL_INTERVAL_MILLIS = 50;
        static final int MIN_VISIBILITY_THROTTLE_INTERVAL_MILLIS = 50;
        public C6080b banner = new C6080b();
        public int displayMinPercentageAnimate = 67;
        public int impressionMinPercentageViewed = 50;
        public int impressionMinTimeViewed = 1000;
        public int impressionPollIntervalMillis = 250;
        public C6084f interstitial = new C6084f();
        private boolean moatEnabled = true;
        public C6086h omidConfig = new C6086h();
        public C6090l video = new C6090l();
        public int visibilityThrottleMillis = 100;
        public C6092n web = new C6092n();
    }

    /* renamed from: com.inmobi.media.ft$n */
    /* compiled from: AdConfig */
    public static final class C6092n {
        public int impressionMinPercentageViewed = 50;
        public int impressionMinTimeViewed = 1000;
        public int impressionPollIntervalMillis = 1000;
    }

    /* renamed from: b */
    public final String mo35278b() {
        return CampaignUnit.JSON_KEY_ADS;
    }

    /* renamed from: a */
    public static C6225is<C6074ft> m18063a() {
        return new C6225is().mo35433a(new C6230ix("cache", C6074ft.class), (C6229iw) new C6228iv(new Constructor<Map<String, C6082d>>() {
            public final /* synthetic */ Object construct() {
                return new HashMap();
            }
        }, C6082d.class)).mo35433a(new C6230ix(ALLOWED_CONTENT_TYPE, C6088j.class), (C6229iw) new C6227iu(new Constructor<List<String>>() {
            public final /* synthetic */ Object construct() {
                return new ArrayList();
            }
        }, String.class)).mo35433a(new C6230ix(ALLOWED_CONTENT_TYPE, C6089k.class), (C6229iw) new C6227iu(new Constructor<List<String>>() {
            public final /* synthetic */ Object construct() {
                return new ArrayList();
            }
        }, String.class)).mo35433a(new C6230ix(GESTURE_LIST, C6087i.class), (C6229iw) new C6227iu(new Constructor<List<Integer>>() {
            public final /* synthetic */ Object construct() {
                return new ArrayList();
            }
        }, Integer.class));
    }

    C6074ft(String str) {
        super(str);
        HashMap hashMap = new HashMap();
        this.cache = hashMap;
        hashMap.put(TtmlNode.RUBY_BASE, new C6082d());
        this.cache.put("banner", new C6082d());
        this.cache.put("int", new C6082d());
        this.cache.put("native", new C6082d());
    }

    /* renamed from: c */
    public final JSONObject mo35279c() {
        return m18063a().mo35435a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:169:0x0297 A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo35280d() {
        /*
            r10 = this;
            int r0 = r10.maxPoolSize
            r1 = 0
            if (r0 > 0) goto L_0x0006
            return r1
        L_0x0006:
            com.inmobi.media.jq r0 = r10.timeouts
            r0.mo35507j()
            java.lang.String r0 = r10.url
            java.lang.String r2 = "http://"
            boolean r0 = r0.startsWith(r2)
            java.lang.String r3 = "https://"
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = r10.url
            boolean r0 = r0.startsWith(r3)
            if (r0 == 0) goto L_0x0298
        L_0x001f:
            int r0 = r10.minimumRefreshInterval
            if (r0 < 0) goto L_0x0298
            int r4 = r10.defaultRefreshInterval
            if (r4 < 0) goto L_0x0298
            if (r0 > r4) goto L_0x0298
            int r0 = r10.fetchTimeout
            if (r0 > 0) goto L_0x002f
            goto L_0x0298
        L_0x002f:
            java.util.Map<java.lang.String, com.inmobi.media.ft$d> r0 = r10.cache
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0039:
            boolean r4 = r0.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0059
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            com.inmobi.media.ft$d r4 = (com.inmobi.media.C6074ft.C6082d) r4
            long r8 = r4.timeToLive
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r5 = r1
        L_0x0056:
            if (r5 != 0) goto L_0x0039
            return r1
        L_0x0059:
            com.inmobi.media.ft$e r0 = r10.imai
            int r0 = r0.maxDbEvents
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.ft$e r0 = r10.imai
            int r0 = r0.maxEventBatch
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.ft$e r0 = r10.imai
            int r0 = r0.maxRetries
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.ft$e r0 = r10.imai
            int r0 = r0.pingInterval
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.ft$e r0 = r10.imai
            int r0 = r0.pingTimeout
            if (r0 <= 0) goto L_0x0298
            com.inmobi.media.ft$e r0 = r10.imai
            long r8 = r0.pingCacheExpiry
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0081
            goto L_0x0298
        L_0x0081:
            com.inmobi.media.ft$g r0 = r10.mraid
            long r8 = r0.expiry
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.ft$g r0 = r10.mraid
            int r0 = r0.retryInterval
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.ft$g r0 = r10.mraid
            int r0 = r0.maxRetries
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.ft$g r0 = r10.mraid
            java.lang.String r0 = r0.url
            boolean r0 = r0.startsWith(r2)
            if (r0 != 0) goto L_0x00ab
            com.inmobi.media.ft$g r0 = r10.mraid
            java.lang.String r0 = r0.url
            boolean r0 = r0.startsWith(r3)
            if (r0 != 0) goto L_0x00ab
            goto L_0x0298
        L_0x00ab:
            com.inmobi.media.jq r0 = r10.timeouts
            int r0 = r0.mo35505h()
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.jq r0 = r10.timeouts
            int r0 = r0.mo35498b()
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.jq r0 = r10.timeouts
            int r0 = r0.mo35500c()
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.jq r0 = r10.timeouts
            int r0 = r0.mo35501d()
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.jq r0 = r10.timeouts
            int r0 = r0.mo35502e()
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.jq r0 = r10.timeouts
            int r0 = r0.mo35503f()
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.jq r0 = r10.timeouts
            int r0 = r0.mo35504g()
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.jq r0 = r10.timeouts
            int r0 = r0.mo35506i()
            if (r0 >= 0) goto L_0x00ed
            goto L_0x0298
        L_0x00ed:
            com.inmobi.media.ft$i r0 = r10.rendering
            int r0 = r0.picHeight
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.ft$i r0 = r10.rendering
            int r0 = r0.picWidth
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.ft$i r0 = r10.rendering
            int r0 = r0.picQuality
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.ft$i r0 = r10.rendering
            int r0 = r0.maxVibrationDuration
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.ft$i r0 = r10.rendering
            int r0 = r0.maxVibrationPatternLength
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.ft$i r0 = r10.rendering
            com.inmobi.media.ft$j r0 = r0.savecontent
            long r2 = r0.maxSaveSize
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.ft$i r0 = r10.rendering
            java.lang.String r0 = r0.webviewBackground
            if (r0 == 0) goto L_0x0298
            com.inmobi.media.ft$i r0 = r10.rendering
            java.lang.String r0 = r0.webviewBackground
            java.lang.String r0 = r0.trim()
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0298
            com.inmobi.media.ft$i r0 = r10.rendering
            long r2 = r0.delayedRedirection
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0298
            com.inmobi.media.ft$i r0 = r10.rendering
            long r2 = r0.userTouchResetTime
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.ft$i r0 = r10.rendering
            java.util.List r0 = r0.gestures
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x014f
            goto L_0x0298
        L_0x014f:
            com.inmobi.media.ft$i r0 = r10.rendering     // Catch:{ IllegalArgumentException -> 0x0298 }
            java.lang.String r0 = r0.webviewBackground     // Catch:{ IllegalArgumentException -> 0x0298 }
            android.graphics.Color.parseColor(r0)     // Catch:{ IllegalArgumentException -> 0x0298 }
            com.inmobi.media.ft$g r0 = r10.mraid
            int r0 = r0.maxRetries
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.ft$g r0 = r10.mraid
            int r0 = r0.retryInterval
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.ft$g r0 = r10.mraid
            java.lang.String r0 = r0.url
            if (r0 == 0) goto L_0x0298
            com.inmobi.media.ft$g r0 = r10.mraid
            java.lang.String r0 = r0.url
            java.lang.String r0 = r0.trim()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0178
            goto L_0x0298
        L_0x0178:
            com.inmobi.media.ft$m r0 = r10.viewability
            int r0 = r0.impressionMinPercentageViewed
            if (r0 <= 0) goto L_0x0235
            com.inmobi.media.ft$m r0 = r10.viewability
            int r0 = r0.impressionMinPercentageViewed
            r2 = 100
            if (r0 > r2) goto L_0x0235
            com.inmobi.media.ft$m r0 = r10.viewability
            int r0 = r0.impressionMinTimeViewed
            if (r0 < 0) goto L_0x0235
            com.inmobi.media.ft$m r0 = r10.viewability
            int r0 = r0.displayMinPercentageAnimate
            if (r0 <= 0) goto L_0x0235
            com.inmobi.media.ft$m r0 = r10.viewability
            int r0 = r0.displayMinPercentageAnimate
            if (r0 > r2) goto L_0x0235
            com.inmobi.media.ft$m r0 = r10.viewability
            com.inmobi.media.ft$l r0 = r0.video
            int r0 = r0.impressionMinPercentageViewed
            if (r0 <= 0) goto L_0x0235
            com.inmobi.media.ft$m r0 = r10.viewability
            com.inmobi.media.ft$l r0 = r0.video
            int r0 = r0.impressionMinPercentageViewed
            if (r0 > r2) goto L_0x0235
            com.inmobi.media.ft$m r0 = r10.viewability
            com.inmobi.media.ft$n r0 = r0.web
            int r0 = r0.impressionMinPercentageViewed
            if (r0 <= 0) goto L_0x0235
            com.inmobi.media.ft$m r0 = r10.viewability
            com.inmobi.media.ft$n r0 = r0.web
            int r0 = r0.impressionMinPercentageViewed
            if (r0 > r2) goto L_0x0235
            com.inmobi.media.ft$m r0 = r10.viewability
            com.inmobi.media.ft$n r0 = r0.web
            int r0 = r0.impressionPollIntervalMillis
            if (r0 <= 0) goto L_0x0235
            com.inmobi.media.ft$m r0 = r10.viewability
            com.inmobi.media.ft$n r0 = r0.web
            int r0 = r0.impressionMinTimeViewed
            if (r0 < 0) goto L_0x0235
            com.inmobi.media.ft$m r0 = r10.viewability
            com.inmobi.media.ft$l r0 = r0.video
            int r0 = r0.impressionMinTimeViewed
            if (r0 < 0) goto L_0x0235
            com.inmobi.media.ft$m r0 = r10.viewability
            com.inmobi.media.ft$l r0 = r0.video
            int r0 = r0.videoMinPercentagePlay
            if (r0 <= 0) goto L_0x0235
            com.inmobi.media.ft$m r0 = r10.viewability
            com.inmobi.media.ft$l r0 = r0.video
            int r0 = r0.videoMinPercentagePlay
            if (r0 > r2) goto L_0x0235
            com.inmobi.media.ft$m r0 = r10.viewability
            int r0 = r0.visibilityThrottleMillis
            r2 = 50
            if (r0 < r2) goto L_0x0235
            com.inmobi.media.ft$m r0 = r10.viewability
            int r0 = r0.visibilityThrottleMillis
            int r0 = r0 * 5
            com.inmobi.media.ft$m r3 = r10.viewability
            int r3 = r3.impressionMinTimeViewed
            if (r0 > r3) goto L_0x0235
            com.inmobi.media.ft$m r0 = r10.viewability
            int r0 = r0.impressionPollIntervalMillis
            if (r0 < r2) goto L_0x0235
            com.inmobi.media.ft$m r0 = r10.viewability
            int r0 = r0.impressionPollIntervalMillis
            int r0 = r0 * 4
            com.inmobi.media.ft$m r2 = r10.viewability
            int r2 = r2.impressionMinTimeViewed
            if (r0 > r2) goto L_0x0235
            com.inmobi.media.ft$m r0 = r10.viewability
            com.inmobi.media.ft$h r0 = r0.omidConfig
            if (r0 == 0) goto L_0x022f
            int r2 = r0.maxRetries
            if (r2 < 0) goto L_0x022f
            int r2 = r0.retryInterval
            if (r2 < 0) goto L_0x022f
            java.lang.String r2 = r0.url
            if (r2 == 0) goto L_0x022f
            java.lang.String r2 = r0.url
            java.lang.String r2 = r2.trim()
            int r2 = r2.length()
            if (r2 == 0) goto L_0x022f
            java.lang.String r0 = r0.partnerKey
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x022d
            goto L_0x022f
        L_0x022d:
            r0 = r1
            goto L_0x0230
        L_0x022f:
            r0 = r5
        L_0x0230:
            if (r0 == 0) goto L_0x0233
            goto L_0x0235
        L_0x0233:
            r0 = r1
            goto L_0x0236
        L_0x0235:
            r0 = r5
        L_0x0236:
            if (r0 == 0) goto L_0x0239
            return r1
        L_0x0239:
            com.inmobi.media.ft$k r0 = r10.vastVideo
            long r2 = r0.optimalVastVideoSize
            r8 = 31457280(0x1e00000, double:1.55419614E-316)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0298
            com.inmobi.media.ft$k r0 = r10.vastVideo
            long r2 = r0.optimalVastVideoSize
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0298
            com.inmobi.media.ft$k r0 = r10.vastVideo
            int r0 = r0.maxWrapperLimit
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.ft$k r0 = r10.vastVideo
            long r2 = r0.vastMaxAssetSize
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0298
            com.inmobi.media.ft$k r0 = r10.vastVideo
            long r2 = r0.vastMaxAssetSize
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x026d
            goto L_0x0298
        L_0x026d:
            com.inmobi.media.ft$a r0 = r10.assetCache
            int r0 = r0.retryInterval
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.ft$a r0 = r10.assetCache
            int r0 = r0.maxCachedAssets
            r2 = 20
            if (r0 > r2) goto L_0x0298
            com.inmobi.media.ft$a r0 = r10.assetCache
            int r0 = r0.maxCachedAssets
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.ft$a r0 = r10.assetCache
            long r2 = r0.timeToLive
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.ft$a r0 = r10.assetCache
            long r2 = r0.maxCacheSize
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0298
            com.inmobi.media.ft$a r0 = r10.assetCache
            int r0 = r0.maxRetries
            if (r0 < 0) goto L_0x0298
            return r5
        L_0x0298:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6074ft.mo35280d():boolean");
    }

    /* renamed from: a */
    public final C6082d mo35277a(String str) {
        C6082d dVar = this.cache.get(str);
        if (dVar != null) {
            return dVar;
        }
        C6082d dVar2 = this.cache.get(TtmlNode.RUBY_BASE);
        return dVar2 == null ? new C6082d() : dVar2;
    }

    /* renamed from: com.inmobi.media.ft$d */
    /* compiled from: AdConfig */
    public static final class C6082d {
        public long timeToLive = 3300;

        C6082d() {
        }
    }

    /* renamed from: com.inmobi.media.ft$i */
    /* compiled from: AdConfig */
    public static final class C6087i {
        static final short DEFAULT_NETWORK_LOAD_LIMIT = 50;
        public static final int DEFAULT_TOUCH_RESET_TIME = 4;
        public static final byte NETWORK_LOAD_LIMIT_DISABLED = -1;
        public boolean autoRedirectionEnforcement = true;
        public int bannerNetworkLoadsLimit = 50;
        /* access modifiers changed from: private */
        public long delayedRedirection = 5;
        public boolean enablePubMuteControl = false;
        public List<Integer> gestures = new ArrayList(Arrays.asList(new Integer[]{0, 1, 2, 3, 4, 5}));
        int maxVibrationDuration = 5;
        int maxVibrationPatternLength = 20;
        public int otherNetworkLoadsLimit = -1;
        int picHeight = 480;
        int picQuality = 100;
        int picWidth = 320;
        C6088j savecontent = new C6088j();
        public boolean shouldRenderPopup = false;
        public long userTouchResetTime = 4;
        /* access modifiers changed from: package-private */
        public String webviewBackground = "#00000000";

        /* renamed from: a */
        public final int mo35281a() {
            try {
                return Color.parseColor(this.webviewBackground);
            } catch (IllegalArgumentException unused) {
                String unused2 = C6074ft.TAG;
                return Color.parseColor("#00000000");
            }
        }
    }
}
