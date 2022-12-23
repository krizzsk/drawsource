package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import com.inmobi.media.C6113gf;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.gi */
/* compiled from: TelemetryConfig */
public class C6126gi extends C6093fu {
    private static final boolean DEFAULT_DISABLE_GENERAL_EVENTS = false;
    private static final long DEFAULT_EVENT_TTL_SEC = 604800;
    private static final long DEFAULT_INGESTION_LATENCY_SEC = 86400;
    private static final boolean DEFAULT_IS_ENABLED = true;
    private static final int DEFAULT_MAX_BATCH_SIZE = 20;
    private static final int DEFAULT_MAX_EVENTS_TO_PERSIST = 1000;
    private static final int DEFAULT_MAX_RETRIES = 1;
    private static final int DEFAULT_MIN_BATCH_SIZE = 5;
    private static final long DEFAULT_PROCESSING_INTERVAL_SEC = 30;
    private static final long DEFAULT_RETRY_INTERVAL_SEC = 60;
    private static final double DEFAULT_SAMPLING_FACTOR = 0.0d;
    private static final String DEFAULT_URL = "https://telemetry.sdk.inmobi.com/metrics";
    public C6128a assetReporting;
    public C6129b base;
    public boolean disableAllGeneralEvents = false;
    private long eventTTL = DEFAULT_EVENT_TTL_SEC;
    public int maxEventsToPersist = 1000;
    private int maxRetryCount = 1;
    public C6113gf networkType;
    public List<String> priorityEvents;
    private long processingInterval = DEFAULT_PROCESSING_INTERVAL_SEC;
    public double samplingFactor = DEFAULT_SAMPLING_FACTOR;
    public String telemetryUrl = DEFAULT_URL;
    private long txLatency = DEFAULT_INGESTION_LATENCY_SEC;

    /* renamed from: com.inmobi.media.gi$a */
    /* compiled from: TelemetryConfig */
    public static final class C6128a {
        public boolean gif;
        public boolean image;
        public boolean video;
    }

    /* renamed from: b */
    public String mo35278b() {
        return "telemetry";
    }

    /* renamed from: a */
    public static C6225is<C6126gi> m18156a() {
        return new C6225is().mo35433a(new C6230ix("priorityEvents", C6126gi.class), (C6229iw) new C6227iu(new Constructor<List<String>>() {
            public final /* synthetic */ Object construct() {
                return new LinkedList();
            }
        }, String.class));
    }

    C6126gi(String str) {
        super(str);
        LinkedList linkedList = new LinkedList();
        linkedList.add("SessionStarted");
        linkedList.add("ServerFill");
        linkedList.add("ServerNoFill");
        linkedList.add("ServerError");
        linkedList.add("AdLoadFailed");
        linkedList.add("AdLoadSuccessful");
        linkedList.add("BlockAutoRedirection");
        linkedList.add("AssetDownloaded");
        linkedList.add("CrashEventOccurred");
        linkedList.add("InvalidConfig");
        linkedList.add("ConfigFetched");
        linkedList.add("SdkInitialized");
        linkedList.add("AdGetSignalsFailed");
        linkedList.add("AdGetSignalsSucceeded");
        linkedList.add("AdShowFailed");
        linkedList.add("AdLoadCalled");
        linkedList.add("AdLoadDroppedAtSDK");
        linkedList.add("AdShowCalled");
        linkedList.add("AdShowSuccessful");
        linkedList.add("AdImpressionSuccessful");
        this.priorityEvents = linkedList;
        this.base = new C6129b();
        C6113gf gfVar = new C6113gf();
        this.networkType = gfVar;
        gfVar.wifi = new C6113gf.C6114a();
        this.networkType.wifi.retryInterval = DEFAULT_RETRY_INTERVAL_SEC;
        this.networkType.wifi.minBatchSize = 5;
        this.networkType.wifi.maxBatchSize = 20;
        this.networkType.others = new C6113gf.C6114a();
        this.networkType.others.retryInterval = DEFAULT_RETRY_INTERVAL_SEC;
        this.networkType.others.minBatchSize = 5;
        this.networkType.others.maxBatchSize = 20;
        C6128a aVar = new C6128a();
        aVar.video = true;
        aVar.image = false;
        aVar.gif = false;
        this.assetReporting = aVar;
    }

    /* renamed from: d */
    public boolean mo35280d() {
        if (this.telemetryUrl.trim().length() != 0 && (this.telemetryUrl.startsWith("http://") || this.telemetryUrl.startsWith("https://"))) {
            long j = this.txLatency;
            if (j < this.processingInterval || j > this.eventTTL || !this.networkType.mo35298a(this.maxEventsToPersist) || this.processingInterval <= 0 || this.maxRetryCount < 0 || this.txLatency <= 0 || this.eventTTL <= 0 || this.maxEventsToPersist <= 0 || this.samplingFactor < DEFAULT_SAMPLING_FACTOR) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public JSONObject mo35279c() {
        return m18156a().mo35435a(this);
    }

    /* renamed from: e */
    public final C6136gn mo35308e() {
        return new C6136gn(this.maxRetryCount, this.eventTTL, this.processingInterval, this.txLatency, this.networkType.wifi.minBatchSize, this.networkType.wifi.maxBatchSize, this.networkType.others.minBatchSize, this.networkType.others.maxBatchSize, this.networkType.wifi.retryInterval, this.networkType.others.retryInterval);
    }

    /* renamed from: com.inmobi.media.gi$b */
    /* compiled from: TelemetryConfig */
    public static final class C6129b {
        public boolean enabled;

        private C6129b() {
            this.enabled = true;
        }
    }
}
