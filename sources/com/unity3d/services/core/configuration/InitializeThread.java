package com.unity3d.services.core.configuration;

import android.os.Build;
import android.os.ConditionVariable;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.token.C11913h;
import com.unity3d.services.core.api.DownloadLatestWebViewStatus;
import com.unity3d.services.core.api.Lifecycle;
import com.unity3d.services.core.cache.C11983a;
import com.unity3d.services.core.connectivity.C12004c;
import com.unity3d.services.core.connectivity.C12007e;
import com.unity3d.services.core.device.reader.C12033a;
import com.unity3d.services.core.device.reader.C12038f;
import com.unity3d.services.core.lifecycle.C12059a;
import com.unity3d.services.core.lifecycle.C12064f;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.properties.C12084a;
import com.unity3d.services.core.properties.C12088d;
import com.unity3d.services.core.request.C12099h;
import com.unity3d.services.core.request.metrics.C12113d;
import com.unity3d.services.core.request.metrics.C12120i;
import com.unity3d.services.core.request.metrics.C12122j;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.WebView;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class InitializeThread extends Thread {

    /* renamed from: a */
    private static InitializeThread f29243a;

    /* renamed from: b */
    private C12000c f29244b;

    /* renamed from: c */
    private String f29245c;

    /* renamed from: d */
    private boolean f29246d = false;

    /* renamed from: e */
    private boolean f29247e = false;

    /* renamed from: f */
    private long f29248f;

    public static class InitializeStateCheckForCachedWebViewUpdate extends C12000c {

        /* renamed from: a */
        private Configuration f29249a;

        public InitializeStateCheckForCachedWebViewUpdate(Configuration configuration) {
            super((C11998a) null);
            this.f29249a = configuration;
        }

        public C12000c execute() {
            try {
                byte[] a = InitializeThread.m32640b(new File(C12088d.m32940m()));
                if (C12080j.m32875a(a).equals(this.f29249a.getWebViewHash())) {
                    return new InitializeStateUpdateCache(this.f29249a, new String(a, "UTF-8"));
                }
            } catch (Exception unused) {
            }
            return new InitializeStateDownloadWebView(this.f29249a);
        }

        public Configuration getConfiguration() {
            return this.f29249a;
        }
    }

    public static class InitializeStateCheckForUpdatedWebView extends C12000c {

        /* renamed from: a */
        private Configuration f29250a;

        /* renamed from: b */
        private byte[] f29251b;

        /* renamed from: c */
        private Configuration f29252c;

        public InitializeStateCheckForUpdatedWebView(Configuration configuration, byte[] bArr, Configuration configuration2) {
            super((C11998a) null);
            this.f29250a = configuration;
            this.f29251b = bArr;
            this.f29252c = configuration2;
        }

        public C12000c execute() {
            try {
                String a = C12080j.m32875a(this.f29251b);
                if (!a.equals(this.f29250a.getWebViewHash())) {
                    C12088d.m32920a(this.f29250a);
                }
                if (!TextUtils.isEmpty(a)) {
                    Configuration configuration = this.f29252c;
                    if (configuration != null) {
                        if (configuration.getWebViewHash() != null && this.f29252c.getWebViewHash().equals(a) && C12088d.m32942o().equals(this.f29252c.getSdkVersion())) {
                            return new InitializeStateCreate(this.f29252c, new String(this.f29251b, "UTF-8"));
                        }
                    }
                    Configuration configuration2 = this.f29250a;
                    if (configuration2 != null && configuration2.getWebViewHash().equals(a)) {
                        return new InitializeStateCreate(this.f29250a, new String(this.f29251b, "UTF-8"));
                    }
                }
            } catch (Exception unused) {
            }
            return new InitializeStateCleanCache(this.f29250a, new InitializeStateLoadWeb(this.f29250a));
        }
    }

    public static class InitializeStateCleanCache extends C12000c {

        /* renamed from: a */
        private Configuration f29253a;

        /* renamed from: b */
        private C12000c f29254b;

        public InitializeStateCleanCache(Configuration configuration, C12000c cVar) {
            super((C11998a) null);
            this.f29253a = configuration;
            this.f29254b = cVar;
        }

        public C12000c execute() {
            try {
                File file = new File(C12088d.m32938k());
                File file2 = new File(C12088d.m32940m());
                file.delete();
                file2.delete();
            } catch (Exception e) {
                C12065a.m32848c("Failure trying to clean cache: " + e.getMessage());
            }
            return this.f29254b;
        }

        public Configuration getConfiguration() {
            return this.f29253a;
        }
    }

    public static class InitializeStateCleanCacheIgnoreError extends InitializeStateCleanCache {
        public InitializeStateCleanCacheIgnoreError(Configuration configuration, C12000c cVar) {
            super(configuration, cVar);
        }

        public C12000c execute() {
            try {
                C12000c execute = super.execute();
                if (!(execute instanceof InitializeStateError)) {
                    return execute;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static class InitializeStateComplete extends C12000c {

        /* renamed from: a */
        private Configuration f29255a;

        public InitializeStateComplete(Configuration configuration) {
            super((C11998a) null);
            this.f29255a = configuration;
        }

        public C12000c execute() {
            for (String moduleConfiguration : this.f29255a.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration2 = this.f29255a.getModuleConfiguration(moduleConfiguration);
                if (moduleConfiguration2 != null) {
                    moduleConfiguration2.initCompleteState(this.f29255a);
                }
            }
            return null;
        }
    }

    public static class InitializeStateConfig extends C12000c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Configuration f29256a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Configuration f29257b;

        /* renamed from: c */
        private int f29258c = 0;

        /* renamed from: d */
        private long f29259d;

        /* renamed from: e */
        private int f29260e;

        /* renamed from: f */
        private double f29261f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C12000c f29262g;

        /* renamed from: com.unity3d.services.core.configuration.InitializeThread$InitializeStateConfig$a */
        class C11996a implements IConfigurationLoaderListener {

            /* renamed from: a */
            final /* synthetic */ Configuration f29263a;

            C11996a(Configuration configuration) {
                this.f29263a = configuration;
            }

            public void onError(String str) {
                C12120i.m33045a().sendMetric(C12122j.m33054a());
                InitializeStateConfig initializeStateConfig = InitializeStateConfig.this;
                C12000c unused = initializeStateConfig.f29262g = initializeStateConfig.executeLegacy(this.f29263a);
            }

            public void onSuccess(Configuration configuration) {
                Configuration unused = InitializeStateConfig.this.f29256a = configuration;
                InitializeStateConfig.this.f29256a.saveToDisk();
                if (InitializeStateConfig.this.f29256a.getDelayWebViewUpdate()) {
                    InitializeStateConfig initializeStateConfig = InitializeStateConfig.this;
                    C12000c unused2 = initializeStateConfig.f29262g = new InitializeStateLoadCacheConfigAndWebView(initializeStateConfig.f29256a, InitializeStateConfig.this.f29257b);
                }
                C11913h.m32461a(InitializeStateConfig.this.f29256a.getUnifiedAuctionToken());
                boolean isNativeWebViewCacheEnabled = InitializeStateConfig.this.f29256a.getExperiments().isNativeWebViewCacheEnabled();
                InitializeStateConfig initializeStateConfig2 = InitializeStateConfig.this;
                C12000c unused3 = initializeStateConfig2.f29262g = isNativeWebViewCacheEnabled ? new InitializeStateCreateWithRemote(initializeStateConfig2.f29256a) : new InitializeStateLoadCache(initializeStateConfig2.f29256a);
            }
        }

        public InitializeStateConfig(Configuration configuration) {
            super((C11998a) null);
            this.f29256a = new Configuration(C12088d.m32930d(), configuration.getExperimentsReader());
            this.f29259d = configuration.getRetryDelay();
            this.f29260e = configuration.getMaxRetries();
            this.f29261f = configuration.getRetryScalingFactor();
            this.f29257b = configuration;
            this.f29262g = null;
        }

        public C12000c execute() {
            C12065a.m32850d("Unity Ads init: load configuration from " + C12088d.m32930d());
            if (this.f29256a.getExperiments() == null || !this.f29256a.getExperiments().isTwoStageInitializationEnabled()) {
                return executeLegacy(this.f29256a);
            }
            return executeWithLoader();
        }

        public C12000c executeLegacy(Configuration configuration) {
            try {
                configuration.mo71034b();
                if (configuration.getDelayWebViewUpdate()) {
                    return new InitializeStateLoadCacheConfigAndWebView(configuration, this.f29257b);
                }
                C12000c initializeStateCreateWithRemote = configuration.getExperiments().isNativeWebViewCacheEnabled() ? new InitializeStateCreateWithRemote(configuration) : new InitializeStateLoadCache(configuration);
                this.f29262g = initializeStateCreateWithRemote;
                return initializeStateCreateWithRemote;
            } catch (Exception e) {
                int i = this.f29258c;
                if (i >= this.f29260e) {
                    return new InitializeStateNetworkError(ErrorState.NetworkConfigRequest, e, this, this.f29257b);
                }
                this.f29259d = (long) (((double) this.f29259d) * this.f29261f);
                this.f29258c = i + 1;
                InitializeEventsMetricSender.getInstance().onRetryConfig();
                return new InitializeStateRetry(this, this.f29259d);
            }
        }

        public C12000c executeWithLoader() {
            PrivacyConfigStorage instance = PrivacyConfigStorage.getInstance();
            IConfigurationLoader configurationLoader = new ConfigurationLoader(new ConfigurationRequestFactory(this.f29256a, new C12033a(new ConfigurationReader(), instance)));
            if (this.f29256a.getExperiments().isPrivacyRequestEnabled()) {
                configurationLoader = new PrivacyConfigurationLoader(configurationLoader, new ConfigurationRequestFactory(this.f29256a, new C12038f(new ConfigurationReader(), instance)), instance);
            }
            try {
                configurationLoader.loadConfiguration(new C11996a(new Configuration(C12088d.m32930d())));
                return this.f29262g;
            } catch (Exception e) {
                int i = this.f29258c;
                if (i >= this.f29260e) {
                    return new InitializeStateNetworkError(ErrorState.NetworkConfigRequest, e, this, this.f29256a);
                }
                this.f29259d = (long) (((double) this.f29259d) * this.f29261f);
                this.f29258c = i + 1;
                InitializeEventsMetricSender.getInstance().onRetryConfig();
                return new InitializeStateRetry(this, this.f29259d);
            }
        }

        public Configuration getConfiguration() {
            return this.f29256a;
        }
    }

    public static class InitializeStateCreate extends C12000c {

        /* renamed from: a */
        private Configuration f29265a;

        /* renamed from: b */
        private String f29266b;

        public InitializeStateCreate(Configuration configuration, String str) {
            super((C11998a) null);
            this.f29265a = configuration;
            this.f29266b = str;
        }

        public C12000c execute() {
            C12065a.m32845b("Unity Ads init: creating webapp");
            Configuration configuration = this.f29265a;
            configuration.setWebViewData(this.f29266b);
            try {
                ErrorState a = C12136a.m33099a(configuration, false);
                if (a == null) {
                    return new InitializeStateComplete(this.f29265a);
                }
                String f = C12136a.m33103c().mo71318f() != null ? C12136a.m33103c().mo71318f() : "Unity Ads WebApp creation failed";
                C12065a.m32848c(f);
                return new InitializeStateError(a, new Exception(f), this.f29265a);
            } catch (IllegalThreadStateException e) {
                C12065a.m32842a("Illegal Thread", (Exception) e);
                return new InitializeStateError(ErrorState.CreateWebApp, e, this.f29265a);
            }
        }

        public Configuration getConfiguration() {
            return this.f29265a;
        }

        public String getWebData() {
            return this.f29266b;
        }
    }

    public static class InitializeStateCreateWithRemote extends C12000c {

        /* renamed from: a */
        private Configuration f29267a;

        public InitializeStateCreateWithRemote(Configuration configuration) {
            super((C11998a) null);
            this.f29267a = configuration;
        }

        public C12000c execute() {
            C12065a.m32845b("Unity Ads init: creating webapp");
            try {
                ErrorState a = C12136a.m33099a(this.f29267a, true);
                if (a == null) {
                    return new InitializeStateComplete(this.f29267a);
                }
                String f = C12136a.m33103c().mo71318f() != null ? C12136a.m33103c().mo71318f() : "Unity Ads WebApp creation failed";
                C12065a.m32848c(f);
                return new InitializeStateError(a, new Exception(f), this.f29267a);
            } catch (IllegalThreadStateException e) {
                C12065a.m32842a("Illegal Thread", (Exception) e);
                return new InitializeStateError(ErrorState.CreateWebApp, e, this.f29267a);
            }
        }

        public Configuration getConfiguration() {
            return this.f29267a;
        }
    }

    public static class InitializeStateDownloadWebView extends C12000c {

        /* renamed from: a */
        private Configuration f29268a;

        /* renamed from: b */
        private int f29269b = 0;

        /* renamed from: c */
        private long f29270c;

        public InitializeStateDownloadWebView(Configuration configuration) {
            super((C11998a) null);
            this.f29268a = configuration;
            this.f29270c = configuration.getRetryDelay();
        }

        public C12000c execute() {
            C12065a.m32850d("Unity Ads init: downloading webapp from " + this.f29268a.getWebViewUrl());
            try {
                try {
                    String n = new C12099h(this.f29268a.getWebViewUrl(), ShareTarget.METHOD_GET, (Map<String, List<String>>) null).mo71260n();
                    String webViewHash = this.f29268a.getWebViewHash();
                    if (n == null || webViewHash == null || !C12080j.m32874a(n).equals(webViewHash)) {
                        return null;
                    }
                    return new InitializeStateUpdateCache(this.f29268a, n);
                } catch (Exception unused) {
                    if (this.f29269b >= this.f29268a.getMaxRetries()) {
                        return null;
                    }
                    long retryScalingFactor = (long) (((double) this.f29270c) * this.f29268a.getRetryScalingFactor());
                    this.f29270c = retryScalingFactor;
                    this.f29269b++;
                    return new InitializeStateRetry(this, retryScalingFactor);
                }
            } catch (Exception e) {
                C12065a.m32842a("Malformed URL", e);
                return null;
            }
        }
    }

    public static class InitializeStateError extends C12000c {

        /* renamed from: a */
        ErrorState f29271a;

        /* renamed from: b */
        Exception f29272b;

        /* renamed from: c */
        protected Configuration f29273c;

        public InitializeStateError(ErrorState errorState, Exception exc, Configuration configuration) {
            super((C11998a) null);
            this.f29271a = errorState;
            this.f29272b = exc;
            this.f29273c = configuration;
        }

        public C12000c execute() {
            C12065a.m32848c("Unity Ads init: halting init in " + this.f29271a.getMetricName() + ": " + this.f29272b.getMessage());
            for (String moduleConfiguration : this.f29273c.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration2 = this.f29273c.getModuleConfiguration(moduleConfiguration);
                if (moduleConfiguration2 != null) {
                    moduleConfiguration2.initErrorState(this.f29273c, this.f29271a, this.f29272b.getMessage());
                }
            }
            return null;
        }
    }

    public static class InitializeStateForceReset extends InitializeStateReset {
        public InitializeStateForceReset() {
            super(new Configuration());
        }

        public C12000c execute() {
            C12088d.m32921a(C12088d.C12089a.NOT_INITIALIZED);
            super.execute();
            return null;
        }
    }

    public static class InitializeStateInitModules extends C12000c {

        /* renamed from: a */
        private Configuration f29274a;

        public InitializeStateInitModules(Configuration configuration) {
            super((C11998a) null);
            this.f29274a = configuration;
        }

        public C12000c execute() {
            for (String moduleConfiguration : this.f29274a.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration2 = this.f29274a.getModuleConfiguration(moduleConfiguration);
                if (moduleConfiguration2 != null && !moduleConfiguration2.initModuleState(this.f29274a)) {
                    return new InitializeStateError(ErrorState.InitModules, new Exception("Unity Ads config server resolves to loopback address (due to ad blocker?)"), this.f29274a);
                }
            }
            return new InitializeStateConfig(this.f29274a);
        }

        public Configuration getConfiguration() {
            return this.f29274a;
        }
    }

    public static class InitializeStateLoadCache extends C12000c {

        /* renamed from: a */
        private Configuration f29275a;

        public InitializeStateLoadCache(Configuration configuration) {
            super((C11998a) null);
            this.f29275a = configuration;
        }

        public C12000c execute() {
            C12065a.m32845b("Unity Ads init: check if webapp can be loaded from local cache");
            try {
                byte[] a = C12080j.m32882a(new File(C12088d.m32940m()));
                String a2 = C12080j.m32875a(a);
                if (a2 == null || !a2.equals(this.f29275a.getWebViewHash())) {
                    return new InitializeStateLoadWeb(this.f29275a);
                }
                try {
                    String str = new String(a, "UTF-8");
                    C12065a.m32850d("Unity Ads init: webapp loaded from local cache");
                    return new InitializeStateCreate(this.f29275a, str);
                } catch (Exception e) {
                    return new InitializeStateError(ErrorState.LoadCache, e, this.f29275a);
                }
            } catch (Exception e2) {
                C12065a.m32845b("Unity Ads init: webapp not found in local cache: " + e2.getMessage());
                return new InitializeStateLoadWeb(this.f29275a);
            }
        }

        public Configuration getConfiguration() {
            return this.f29275a;
        }
    }

    public static class InitializeStateLoadCacheConfigAndWebView extends C12000c {

        /* renamed from: a */
        private Configuration f29276a;

        /* renamed from: b */
        private Configuration f29277b;

        public InitializeStateLoadCacheConfigAndWebView(Configuration configuration, Configuration configuration2) {
            super((C11998a) null);
            this.f29276a = configuration;
            this.f29277b = configuration2;
        }

        public C12000c execute() {
            try {
                return new InitializeStateCheckForUpdatedWebView(this.f29276a, InitializeThread.m32640b(new File(C12088d.m32940m())), this.f29277b);
            } catch (Exception unused) {
                return new InitializeStateCleanCache(this.f29276a, new InitializeStateLoadWeb(this.f29276a));
            }
        }

        public Configuration getConfiguration() {
            return this.f29276a;
        }
    }

    public static class InitializeStateLoadConfigFile extends C12000c {

        /* renamed from: a */
        private Configuration f29278a;

        public InitializeStateLoadConfigFile(Configuration configuration) {
            super((C11998a) null);
            this.f29278a = configuration;
        }

        public C12000c execute() {
            C12065a.m32845b("Unity Ads init: Loading Config File Parameters");
            File file = new File(C12088d.m32938k());
            if (!file.exists()) {
                return new InitializeStateReset(this.f29278a);
            }
            try {
                Configuration configuration = new Configuration(new JSONObject(new String(C12080j.m32882a(file))));
                this.f29278a = configuration;
                return new InitializeStateReset(configuration);
            } catch (Exception unused) {
                C12065a.m32845b("Unity Ads init: Using default configuration parameters");
                return new InitializeStateReset(this.f29278a);
            } catch (Throwable unused2) {
                return new InitializeStateReset(this.f29278a);
            }
        }
    }

    public static class InitializeStateLoadWeb extends C12000c {

        /* renamed from: a */
        private Configuration f29279a;

        /* renamed from: b */
        private int f29280b = 0;

        /* renamed from: c */
        private long f29281c;

        /* renamed from: d */
        private int f29282d;

        /* renamed from: e */
        private double f29283e;

        public InitializeStateLoadWeb(Configuration configuration) {
            super((C11998a) null);
            this.f29279a = configuration;
            this.f29281c = configuration.getRetryDelay();
            this.f29282d = configuration.getMaxRetries();
            this.f29283e = configuration.getRetryScalingFactor();
        }

        public C12000c execute() {
            C12065a.m32850d("Unity Ads init: loading webapp from " + this.f29279a.getWebViewUrl());
            try {
                try {
                    String n = new C12099h(this.f29279a.getWebViewUrl(), ShareTarget.METHOD_GET, (Map<String, List<String>>) null).mo71260n();
                    String webViewHash = this.f29279a.getWebViewHash();
                    if (webViewHash != null && !C12080j.m32874a(n).equals(webViewHash)) {
                        return new InitializeStateError(ErrorState.InvalidHash, new Exception("Invalid webViewHash"), this.f29279a);
                    }
                    if (webViewHash != null) {
                        C12080j.m32881a(new File(C12088d.m32940m()), n);
                    }
                    return new InitializeStateCreate(this.f29279a, n);
                } catch (Exception e) {
                    int i = this.f29280b;
                    if (i >= this.f29282d) {
                        return new InitializeStateNetworkError(ErrorState.NetworkWebviewRequest, e, this, this.f29279a);
                    }
                    this.f29281c = (long) (((double) this.f29281c) * this.f29283e);
                    this.f29280b = i + 1;
                    InitializeEventsMetricSender.getInstance().onRetryWebview();
                    return new InitializeStateRetry(this, this.f29281c);
                }
            } catch (MalformedURLException e2) {
                C12065a.m32842a("Malformed URL", (Exception) e2);
                return new InitializeStateError(ErrorState.MalformedWebviewRequest, e2, this.f29279a);
            }
        }

        public Configuration getConfiguration() {
            return this.f29279a;
        }
    }

    public static class InitializeStateNetworkError extends InitializeStateError implements C12007e {

        /* renamed from: d */
        private static int f29284d;

        /* renamed from: e */
        private static long f29285e;

        /* renamed from: f */
        private ErrorState f29286f;

        /* renamed from: g */
        private C12000c f29287g;

        /* renamed from: h */
        private ConditionVariable f29288h;

        /* renamed from: i */
        private long f29289i;

        /* renamed from: j */
        private int f29290j;

        /* renamed from: k */
        private int f29291k;

        public InitializeStateNetworkError(ErrorState errorState, Exception exc, C12000c cVar, Configuration configuration) {
            super(errorState, exc, configuration);
            this.f29286f = errorState;
            f29284d = 0;
            f29285e = 0;
            this.f29287g = cVar;
            this.f29289i = configuration.getNetworkErrorTimeout();
            this.f29290j = configuration.getMaximumConnectedEvents();
            this.f29291k = configuration.getConnectedEventThreshold();
        }

        /* renamed from: a */
        private boolean m32647a() {
            return System.currentTimeMillis() - f29285e >= ((long) this.f29291k) && f29284d <= this.f29290j;
        }

        public C12000c execute() {
            C12065a.m32848c("Unity Ads init: network error, waiting for connection events");
            this.f29288h = new ConditionVariable();
            C12004c.m32656a((C12007e) this);
            if (this.f29288h.block(this.f29289i)) {
                C12004c.m32659b(this);
                return this.f29287g;
            }
            C12004c.m32659b(this);
            return new InitializeStateError(this.f29286f, new Exception("No connected events within the timeout!"), this.f29273c);
        }

        public void onConnected() {
            f29284d++;
            C12065a.m32845b("Unity Ads init got connected event");
            if (m32647a()) {
                this.f29288h.open();
            }
            if (f29284d > this.f29290j) {
                C12004c.m32659b(this);
            }
            f29285e = System.currentTimeMillis();
        }

        public void onDisconnected() {
            C12065a.m32845b("Unity Ads init got disconnected event");
        }
    }

    public static class InitializeStateReset extends C12000c {

        /* renamed from: a */
        private Configuration f29292a;

        /* renamed from: b */
        private int f29293b;

        /* renamed from: com.unity3d.services.core.configuration.InitializeThread$InitializeStateReset$a */
        class C11997a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12136a f29294a;

            /* renamed from: b */
            final /* synthetic */ ConditionVariable f29295b;

            C11997a(C12136a aVar, ConditionVariable conditionVariable) {
                this.f29294a = aVar;
                this.f29295b = conditionVariable;
            }

            public void run() {
                this.f29294a.mo71319g().destroy();
                this.f29294a.mo71306a((WebView) null);
                this.f29295b.open();
            }
        }

        public InitializeStateReset(Configuration configuration) {
            super((C11998a) null);
            this.f29292a = configuration;
            this.f29293b = configuration.getResetWebappTimeout();
        }

        /* renamed from: a */
        private void m32648a() {
            if (Lifecycle.getLifecycleListener() != null) {
                if (C12084a.m32907d() != null) {
                    C12084a.m32907d().unregisterActivityLifecycleCallbacks(Lifecycle.getLifecycleListener());
                }
                Lifecycle.setLifecycleListener((C12064f) null);
            }
        }

        public C12000c execute() {
            boolean z;
            C12065a.m32845b("Unity Ads init: starting init");
            ConditionVariable conditionVariable = new ConditionVariable();
            C12136a c = C12136a.m33103c();
            if (c != null) {
                c.mo71322j();
                if (c.mo71319g() != null) {
                    C12080j.m32879a((Runnable) new C11997a(c, conditionVariable));
                    z = conditionVariable.block((long) this.f29293b);
                } else {
                    z = true;
                }
                if (!z) {
                    return new InitializeStateError(ErrorState.ResetWebApp, new Exception("Reset failed on opening ConditionVariable"), this.f29292a);
                }
            }
            if (Build.VERSION.SDK_INT > 13) {
                m32648a();
            }
            C12088d.m32919a((C11983a) null);
            if (C12088d.m32913a() == null) {
                return new InitializeStateError(ErrorState.ResetWebApp, new Exception("Cache directory is NULL"), this.f29292a);
            }
            C12088d.m32926b(false);
            for (String moduleConfiguration : this.f29292a.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration2 = this.f29292a.getModuleConfiguration(moduleConfiguration);
                if (moduleConfiguration2 != null) {
                    moduleConfiguration2.resetState(this.f29292a);
                }
            }
            return new InitializeStateInitModules(this.f29292a);
        }

        public Configuration getConfiguration() {
            return this.f29292a;
        }
    }

    public static class InitializeStateRetry extends C12000c {

        /* renamed from: a */
        C12000c f29297a;

        /* renamed from: b */
        long f29298b;

        public InitializeStateRetry(C12000c cVar, long j) {
            super((C11998a) null);
            this.f29297a = cVar;
            this.f29298b = j;
        }

        public C12000c execute() {
            C12065a.m32845b("Unity Ads init: retrying in " + this.f29298b + " milliseconds");
            try {
                Thread.sleep(this.f29298b);
            } catch (Exception e) {
                C12065a.m32842a("Init retry interrupted", e);
            }
            return this.f29297a;
        }
    }

    public static class InitializeStateUpdateCache extends C12000c {

        /* renamed from: a */
        private Configuration f29299a;

        /* renamed from: b */
        private String f29300b;

        public InitializeStateUpdateCache(Configuration configuration, String str) {
            super((C11998a) null);
            this.f29299a = configuration;
            this.f29300b = str;
        }

        public C12000c execute() {
            if (!(this.f29299a == null || this.f29300b == null)) {
                try {
                    C12080j.m32881a(new File(C12088d.m32940m()), this.f29300b);
                    C12080j.m32881a(new File(C12088d.m32938k()), this.f29299a.getJSONString());
                } catch (Exception unused) {
                    return new InitializeStateCleanCacheIgnoreError(this.f29299a, (C12000c) null);
                }
            }
            return null;
        }

        public Configuration getConfiguration() {
            return this.f29299a;
        }
    }

    /* renamed from: com.unity3d.services.core.configuration.InitializeThread$a */
    class C11998a implements Runnable {
        C11998a() {
        }

        public void run() {
            C12088d.m32918a(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK encountered an error during initialization, cancel initialization");
        }
    }

    /* renamed from: com.unity3d.services.core.configuration.InitializeThread$b */
    class C11999b implements Runnable {
        C11999b() {
        }

        public void run() {
            C12088d.m32918a(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to application doesn't have enough memory to initialize Unity Ads SDK");
        }
    }

    /* renamed from: com.unity3d.services.core.configuration.InitializeThread$c */
    private static abstract class C12000c {
        private C12000c() {
        }

        public abstract C12000c execute();

        /* synthetic */ C12000c(C11998a aVar) {
            this();
        }
    }

    private InitializeThread(C12000c cVar) {
        this.f29244b = cVar;
    }

    /* renamed from: a */
    private int m32636a() {
        return 15;
    }

    /* renamed from: b */
    private void m32639b(C12000c cVar) {
        if (this.f29245c != null && !m32642d(cVar) && !this.f29245c.equals("native_retry_state")) {
            C12120i.m33045a().sendMetric(new C12113d(this.f29245c, Long.valueOf(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f29248f)), (Map<String, String>) null));
        }
    }

    /* renamed from: c */
    private void m32641c(C12000c cVar) {
        if (m32642d(cVar)) {
            this.f29247e = true;
        } else {
            if (!this.f29247e) {
                this.f29248f = System.nanoTime();
            }
            this.f29247e = false;
        }
        this.f29245c = m32637a(cVar);
    }

    /* renamed from: d */
    private boolean m32642d(C12000c cVar) {
        return cVar instanceof InitializeStateRetry;
    }

    public static synchronized DownloadLatestWebViewStatus downloadLatestWebView() {
        synchronized (InitializeThread.class) {
            if (f29243a != null) {
                DownloadLatestWebViewStatus downloadLatestWebViewStatus = DownloadLatestWebViewStatus.INIT_QUEUE_NOT_EMPTY;
                return downloadLatestWebViewStatus;
            } else if (C12088d.m32937j() == null) {
                DownloadLatestWebViewStatus downloadLatestWebViewStatus2 = DownloadLatestWebViewStatus.MISSING_LATEST_CONFIG;
                return downloadLatestWebViewStatus2;
            } else {
                InitializeThread initializeThread = new InitializeThread(new InitializeStateCheckForCachedWebViewUpdate(C12088d.m32937j()));
                f29243a = initializeThread;
                initializeThread.setName("UnityAdsDownloadThread");
                f29243a.start();
                DownloadLatestWebViewStatus downloadLatestWebViewStatus3 = DownloadLatestWebViewStatus.BACKGROUND_DOWNLOAD_STARTED;
                return downloadLatestWebViewStatus3;
            }
        }
    }

    public static synchronized void initialize(Configuration configuration) {
        synchronized (InitializeThread.class) {
            if (f29243a == null) {
                InitializeEventsMetricSender.getInstance().didInitStart();
                C12059a.m32830b();
                InitializeThread initializeThread = new InitializeThread(new InitializeStateLoadConfigFile(configuration));
                f29243a = initializeThread;
                initializeThread.setName("UnityAdsInitializeThread");
                f29243a.start();
            }
        }
    }

    public static synchronized void reset() {
        synchronized (InitializeThread.class) {
            if (f29243a == null) {
                InitializeThread initializeThread = new InitializeThread(new InitializeStateForceReset());
                f29243a = initializeThread;
                initializeThread.setName("UnityAdsResetThread");
                f29243a.start();
            }
        }
    }

    public void quit() {
        this.f29246d = true;
    }

    public void run() {
        while (true) {
            try {
                C12000c cVar = this.f29244b;
                if (cVar == null || this.f29246d) {
                    break;
                }
                try {
                    m32641c(cVar);
                    C12000c execute = this.f29244b.execute();
                    this.f29244b = execute;
                    m32639b(execute);
                } catch (Exception e) {
                    C12065a.m32842a("Unity Ads SDK encountered an error during initialization, cancel initialization", e);
                    C12080j.m32879a((Runnable) new C11998a());
                    this.f29244b = new InitializeStateForceReset();
                } catch (OutOfMemoryError e2) {
                    C12065a.m32842a("Unity Ads SDK failed to initialize due to application doesn't have enough memory to initialize Unity Ads SDK", new Exception(e2));
                    C12080j.m32879a((Runnable) new C11999b());
                    this.f29244b = new InitializeStateForceReset();
                }
            } catch (OutOfMemoryError unused) {
            }
        }
        f29243a = null;
    }

    /* renamed from: a */
    private String m32637a(C12000c cVar) {
        if (cVar == null) {
            return null;
        }
        String simpleName = cVar.getClass().getSimpleName();
        if (simpleName.length() == 0) {
            return null;
        }
        String lowerCase = simpleName.substring(m32636a()).toLowerCase();
        StringBuilder sb = new StringBuilder(lowerCase.length() + 7 + 6);
        sb.append("native_");
        sb.append(lowerCase);
        sb.append("_state");
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static byte[] m32640b(File file) throws IOException {
        if (file == null || !file.exists()) {
            throw new IOException("file not found");
        }
        try {
            return C12080j.m32882a(file);
        } catch (IOException unused) {
            throw new IOException("could not read from file");
        }
    }
}
