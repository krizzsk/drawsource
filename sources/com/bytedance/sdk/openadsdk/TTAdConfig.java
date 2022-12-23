package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bykv.p054vk.openvk.component.video.api.C2397b;
import com.bytedance.sdk.openadsdk.core.C3513m;

public final class TTAdConfig {

    /* renamed from: a */
    private String f6645a;

    /* renamed from: b */
    private String f6646b;

    /* renamed from: c */
    private boolean f6647c;

    /* renamed from: d */
    private String f6648d;

    /* renamed from: e */
    private String f6649e;

    /* renamed from: f */
    private int f6650f;

    /* renamed from: g */
    private boolean f6651g;

    /* renamed from: h */
    private boolean f6652h;

    /* renamed from: i */
    private boolean f6653i;

    /* renamed from: j */
    private boolean f6654j;

    /* renamed from: k */
    private String[] f6655k;

    /* renamed from: l */
    private boolean f6656l;

    /* renamed from: m */
    private int f6657m;

    /* renamed from: n */
    private int f6658n;

    /* renamed from: o */
    private int f6659o;

    /* renamed from: p */
    private String f6660p;

    /* renamed from: q */
    private int f6661q;

    /* renamed from: r */
    private int f6662r;

    private TTAdConfig() {
        this.f6647c = false;
        this.f6650f = 0;
        boolean z = true;
        this.f6651g = true;
        this.f6652h = false;
        this.f6653i = Build.VERSION.SDK_INT < 14 ? false : z;
        this.f6654j = false;
        this.f6656l = false;
        this.f6657m = -1;
        this.f6658n = -1;
        this.f6659o = -1;
    }

    public void setPackageName(String str) {
        this.f6660p = str;
    }

    public String getPackageName() {
        return this.f6660p;
    }

    public void setCoppa(int i) {
        this.f6657m = i;
    }

    public int getCoppa() {
        return this.f6657m;
    }

    public void setGDPR(int i) {
        this.f6658n = i;
    }

    public int getGDPR() {
        return this.f6658n;
    }

    public void setCcpa(int i) {
        this.f6659o = i;
    }

    public int getCcpa() {
        return this.f6659o;
    }

    public String getAppId() {
        return this.f6645a;
    }

    public void setAppId(String str) {
        this.f6645a = str;
    }

    public String getAppName() {
        String str = this.f6646b;
        if (str == null || str.isEmpty()) {
            this.f6646b = m8261a(C3513m.m10963a());
        }
        return this.f6646b;
    }

    public void setAppName(String str) {
        this.f6646b = str;
    }

    public int getAppIconId() {
        return this.f6662r;
    }

    public void setAppIcon(int i) {
        this.f6662r = i;
    }

    public boolean isPaid() {
        return this.f6647c;
    }

    public void setPaid(boolean z) {
        this.f6647c = z;
    }

    public String getKeywords() {
        return this.f6648d;
    }

    public void setKeywords(String str) {
        this.f6648d = str;
    }

    public String getData() {
        return this.f6649e;
    }

    public void setData(String str) {
        this.f6649e = str;
    }

    public int getTitleBarTheme() {
        return this.f6650f;
    }

    public void setTitleBarTheme(int i) {
        this.f6650f = i;
    }

    public boolean isAllowShowNotify() {
        return this.f6651g;
    }

    public void setAllowShowNotify(boolean z) {
        this.f6651g = z;
    }

    public boolean isDebug() {
        return this.f6652h;
    }

    public void setDebug(boolean z) {
        this.f6652h = z;
    }

    public boolean isUseTextureView() {
        return this.f6653i;
    }

    public void setUseTextureView(boolean z) {
        this.f6653i = z;
    }

    public boolean isSupportMultiProcess() {
        return this.f6654j;
    }

    public void setSupportMultiProcess(boolean z) {
        this.f6654j = z;
        C2397b.m5668a(z);
    }

    public String[] getNeedClearTaskReset() {
        return this.f6655k;
    }

    public void setNeedClearTaskReset(String... strArr) {
        this.f6655k = strArr;
    }

    public boolean isAsyncInit() {
        return this.f6656l;
    }

    public void setAsyncInit(boolean z) {
        this.f6656l = z;
    }

    /* renamed from: a */
    private String m8261a(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public int getDebugLog() {
        return this.f6661q;
    }

    public void setDebugLog(int i) {
        this.f6661q = i;
    }

    public static class Builder {

        /* renamed from: a */
        private String f6663a;

        /* renamed from: b */
        private String f6664b;

        /* renamed from: c */
        private boolean f6665c = false;

        /* renamed from: d */
        private String f6666d;

        /* renamed from: e */
        private String f6667e;

        /* renamed from: f */
        private int f6668f = 0;

        /* renamed from: g */
        private boolean f6669g;

        /* renamed from: h */
        private boolean f6670h;

        /* renamed from: i */
        private boolean f6671i;

        /* renamed from: j */
        private boolean f6672j;

        /* renamed from: k */
        private String[] f6673k;

        /* renamed from: l */
        private boolean f6674l;

        /* renamed from: m */
        private int f6675m;

        /* renamed from: n */
        private int f6676n;

        /* renamed from: o */
        private int f6677o;

        /* renamed from: p */
        private int f6678p;

        /* renamed from: q */
        private String f6679q;

        /* renamed from: r */
        private int f6680r;

        @Deprecated
        public Builder allowShowPageWhenScreenLock(boolean z) {
            return this;
        }

        public Builder() {
            boolean z = true;
            this.f6669g = true;
            this.f6670h = false;
            this.f6671i = Build.VERSION.SDK_INT < 14 ? false : z;
            this.f6672j = false;
            this.f6674l = false;
            this.f6675m = -1;
            this.f6676n = -1;
            this.f6677o = -1;
        }

        public Builder coppa(int i) {
            this.f6675m = i;
            return this;
        }

        public Builder setGDPR(int i) {
            this.f6676n = i;
            return this;
        }

        public Builder setCCPA(int i) {
            this.f6677o = i;
            return this;
        }

        public Builder appId(String str) {
            this.f6663a = str;
            return this;
        }

        public Builder appIcon(int i) {
            this.f6680r = i;
            return this;
        }

        @Deprecated
        public Builder appName(String str) {
            this.f6664b = str;
            return this;
        }

        @Deprecated
        public Builder paid(boolean z) {
            this.f6665c = z;
            return this;
        }

        @Deprecated
        public Builder keywords(String str) {
            this.f6666d = str;
            return this;
        }

        public Builder data(String str) {
            this.f6667e = str;
            return this;
        }

        @Deprecated
        public Builder titleBarTheme(int i) {
            this.f6668f = i;
            return this;
        }

        @Deprecated
        public Builder allowShowNotify(boolean z) {
            this.f6669g = z;
            return this;
        }

        public Builder debug(boolean z) {
            this.f6670h = z;
            return this;
        }

        public Builder useTextureView(boolean z) {
            this.f6671i = z;
            return this;
        }

        public Builder supportMultiProcess(boolean z) {
            this.f6672j = z;
            return this;
        }

        @Deprecated
        public Builder needClearTaskReset(String... strArr) {
            this.f6673k = strArr;
            return this;
        }

        public Builder asyncInit(boolean z) {
            this.f6674l = z;
            return this;
        }

        public Builder debugLog(int i) {
            this.f6678p = i;
            return this;
        }

        public Builder setPackageName(String str) {
            this.f6679q = str;
            return this;
        }

        public TTAdConfig build() {
            TTAdConfig tTAdConfig = new TTAdConfig();
            tTAdConfig.setAppId(this.f6663a);
            tTAdConfig.setCoppa(this.f6675m);
            tTAdConfig.setAppName(this.f6664b);
            tTAdConfig.setAppIcon(this.f6680r);
            tTAdConfig.setPaid(this.f6665c);
            tTAdConfig.setKeywords(this.f6666d);
            tTAdConfig.setData(this.f6667e);
            tTAdConfig.setTitleBarTheme(this.f6668f);
            tTAdConfig.setAllowShowNotify(this.f6669g);
            tTAdConfig.setDebug(this.f6670h);
            tTAdConfig.setUseTextureView(this.f6671i);
            tTAdConfig.setSupportMultiProcess(this.f6672j);
            tTAdConfig.setNeedClearTaskReset(this.f6673k);
            tTAdConfig.setAsyncInit(this.f6674l);
            tTAdConfig.setGDPR(this.f6676n);
            tTAdConfig.setCcpa(this.f6677o);
            tTAdConfig.setDebugLog(this.f6678p);
            tTAdConfig.setPackageName(this.f6679q);
            return tTAdConfig;
        }
    }
}
