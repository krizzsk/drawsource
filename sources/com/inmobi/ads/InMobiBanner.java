package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.google.common.base.Ascii;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.media.C5738aj;
import com.inmobi.media.C5788b;
import com.inmobi.media.C5840bp;
import com.inmobi.media.C5853c;
import com.inmobi.media.C6183hw;
import com.inmobi.media.C6184hx;
import com.inmobi.media.C6195ic;
import com.inmobi.media.C6215il;
import com.vungle.warren.model.ReportDBAdapter;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public final class InMobiBanner extends RelativeLayout {

    /* renamed from: a */
    public static final String f19544a = InMobiBanner.class.getSimpleName();

    /* renamed from: b */
    public BannerAdEventListener f19545b;

    /* renamed from: c */
    public C5738aj f19546c;

    /* renamed from: d */
    public AnimationType f19547d = AnimationType.ROTATE_HORIZONTAL_AXIS;

    /* renamed from: e */
    public C8087a f19548e = new C8087a(this);

    /* renamed from: f */
    private int f19549f;

    /* renamed from: g */
    private boolean f19550g = true;

    /* renamed from: h */
    private C5853c f19551h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f19552i = 0;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f19553j = 0;

    /* renamed from: k */
    private long f19554k = 0;

    /* renamed from: l */
    private WeakReference<Activity> f19555l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C5840bp f19556m = new C5840bp();

    /* renamed from: n */
    private PreloadManager f19557n = new PreloadManager() {

        /* renamed from: b */
        private C5788b f19559b = new C5788b(InMobiBanner.this);

        public final void preload() {
            InMobiBanner.this.setEnableAutoRefresh(false);
            InMobiBanner.this.f19556m.f14694e = "NonAB";
            InMobiBanner.this.mo56185a((PublisherCallbacks) this.f19559b, false);
        }

        public final void load() {
            try {
                InMobiBanner.this.f19546c.mo34588n();
            } catch (IllegalStateException e) {
                C6195ic.m18378a((byte) 1, InMobiBanner.f19544a, e.getMessage());
                if (InMobiBanner.this.f19545b != null) {
                    InMobiBanner.this.f19545b.onAdLoadFailed(InMobiBanner.this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    };

    public enum AnimationType {
        ANIMATION_OFF,
        ROTATE_HORIZONTAL_AXIS,
        ANIMATION_ALPHA,
        ROTATE_VERTICAL_AXIS
    }

    public InMobiBanner(Context context, AttributeSet attributeSet) throws SdkNotInitializedException {
        super(context, attributeSet);
        if (C6183hw.m18323b()) {
            if (context instanceof Activity) {
                this.f19555l = new WeakReference<>((Activity) context);
            }
            this.f19546c = new C5738aj();
            String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID);
            String attributeValue2 = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "refreshInterval");
            if (attributeValue != null) {
                long a = m23118a(attributeValue);
                if (a != Long.MIN_VALUE) {
                    this.f19556m.f14690a = a;
                } else {
                    throw new InvalidPlacementIdException();
                }
            }
            m23120a(getContext());
            this.f19549f = this.f19546c.mo34593s();
            this.f19551h = new C5853c(this);
            if (attributeValue2 != null) {
                try {
                    setRefreshInterval(Integer.parseInt(attributeValue2.trim()));
                } catch (NumberFormatException unused) {
                    C6195ic.m18378a((byte) 1, f19544a, "Refresh interval value supplied in XML layout is not valid. Falling back to default value.");
                }
            }
        } else {
            throw new SdkNotInitializedException(f19544a);
        }
    }

    /* renamed from: a */
    private static long m23118a(String str) {
        try {
            StringBuilder sb = new StringBuilder(str.trim());
            if ("plid-".equalsIgnoreCase(sb.substring(0, 5))) {
                return Long.parseLong(sb.substring(5, sb.length()).trim());
            }
            C6195ic.m18378a((byte) 1, f19544a, "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
            C6195ic.m18378a((byte) 1, f19544a, "Invalid Placement id: ".concat(String.valueOf(str)));
            return Long.MIN_VALUE;
        } catch (NumberFormatException unused) {
            C6195ic.m18378a((byte) 1, f19544a, "Placement id value supplied in XML layout is not valid. Banner creation failed.");
            C6195ic.m18378a((byte) 1, f19544a, "Invalid Placement id: ".concat(String.valueOf(str)));
        } catch (StringIndexOutOfBoundsException unused2) {
            C6195ic.m18378a((byte) 1, f19544a, "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
            C6195ic.m18378a((byte) 1, f19544a, "Invalid Placement id: ".concat(String.valueOf(str)));
        }
    }

    public InMobiBanner(Context context, long j) throws SdkNotInitializedException {
        super(context);
        if (C6183hw.m18323b()) {
            if (context instanceof Activity) {
                this.f19555l = new WeakReference<>((Activity) context);
            }
            this.f19546c = new C5738aj();
            this.f19556m.f14690a = j;
            m23120a(context);
            this.f19549f = this.f19546c.mo34593s();
            this.f19551h = new C5853c(this);
            return;
        }
        throw new SdkNotInitializedException(f19544a);
    }

    /* renamed from: a */
    private boolean m23121a(boolean z) {
        if (!z || this.f19545b != null) {
            return true;
        }
        C6195ic.m18378a((byte) 1, f19544a, "Listener supplied is null, Ignoring your call.");
        return false;
    }

    public final void getSignals() {
        if (!m23121a(true)) {
            return;
        }
        if (m23124b("getSignals()")) {
            m23120a(getContext());
            setEnableAutoRefresh(false);
            this.f19546c.mo34652b((PublisherCallbacks) this.f19548e);
            return;
        }
        this.f19548e.onRequestPayloadCreationFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
    }

    public final PreloadManager getPreloadManager() {
        return this.f19557n;
    }

    public final void load(byte[] bArr) {
        if (!m23121a(false)) {
            return;
        }
        if (m23124b("load(byte[])")) {
            this.f19556m.f14694e = "AB";
            m23120a(getContext());
            this.f19546c.mo34580a(bArr, (PublisherCallbacks) this.f19548e);
            return;
        }
        this.f19546c.mo34576a((byte) 86);
        this.f19548e.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
    }

    public final void load() {
        if (m23121a(false)) {
            this.f19556m.f14694e = "NonAB";
            mo56185a((PublisherCallbacks) this.f19548e, false);
        }
    }

    /* renamed from: a */
    public final void mo56185a(final PublisherCallbacks publisherCallbacks, final boolean z) {
        try {
            this.f19546c.mo34598x();
            if (z) {
                this.f19556m.f14694e = "NonAB";
            }
            m23120a(getContext());
            if (this.f19546c.mo34594t()) {
                this.f19546c.mo34582b((byte) Ascii.f18305SI);
                if (this.f19545b != null) {
                    this.f19545b.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                }
                C6195ic.m18378a((byte) 1, f19544a, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
            } else if (!m23124b("load")) {
                this.f19546c.mo34576a((byte) 86);
                this.f19546c.mo34525a(this.f19546c.mo34587m(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
            } else if (!mo56186a()) {
                new Handler().postDelayed(new Runnable() {
                    public final void run() {
                        try {
                            if (InMobiBanner.this.mo56186a()) {
                                InMobiBanner.this.m23130f();
                                if (InMobiBanner.this.m23128d()) {
                                    InMobiBanner.this.f19546c.mo34579a(publisherCallbacks, InMobiBanner.this.getFrameSizeString(), z);
                                    return;
                                }
                                return;
                            }
                            C6195ic.m18378a((byte) 1, InMobiBanner.f19544a, "The height or width of the banner can not be determined");
                            InMobiBanner.this.f19546c.mo34576a((byte) 86);
                            InMobiBanner.this.f19546c.mo34525a(InMobiBanner.this.f19546c.mo34587m(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                        } catch (Exception unused) {
                            InMobiBanner.this.f19546c.mo34576a((byte) 87);
                            C6195ic.m18378a((byte) 1, InMobiBanner.f19544a, "SDK encountered unexpected error while loading an ad");
                            String unused2 = InMobiBanner.f19544a;
                        }
                    }
                }, 200);
            } else {
                m23130f();
                if (m23128d()) {
                    this.f19546c.mo34579a(publisherCallbacks, getFrameSizeString(), z);
                }
            }
        } catch (Exception unused) {
            this.f19546c.mo34576a((byte) 87);
            C6195ic.m18378a((byte) 1, f19544a, "Unable to load ad; SDK encountered an unexpected error");
        }
    }

    /* renamed from: b */
    private boolean m23124b(String str) {
        if (!mo56186a()) {
            if (getLayoutParams() == null) {
                String str2 = f19544a;
                C6195ic.m18378a((byte) 1, str2, "The layout params of the banner must be set before calling " + str + " or call setBannerSize(int widthInDp, int heightInDp) before " + str);
                return false;
            } else if (getLayoutParams().width == -2 || getLayoutParams().height == -2) {
                C6195ic.m18378a((byte) 1, f19544a, "The height or width of a Banner ad can't be WRAP_CONTENT or call setBannerSize(int widthInDp, int heightInDp) before ".concat(String.valueOf(str)));
                return false;
            } else {
                m23129e();
            }
        }
        return true;
    }

    public final void load(Context context) {
        if (m23121a(false)) {
            if (context instanceof Activity) {
                this.f19555l = new WeakReference<>((Activity) context);
            } else {
                this.f19555l = null;
            }
            this.f19556m.f14694e = "NonAB";
            mo56185a((PublisherCallbacks) this.f19548e, false);
        }
    }

    @Deprecated
    public final JSONObject getAdMetaInfo() {
        return this.f19546c.mo34648D();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m23128d() {
        long j = this.f19554k;
        if (j != 0 && !this.f19546c.mo34581a(j)) {
            return false;
        }
        this.f19554k = SystemClock.elapsedRealtime();
        return true;
    }

    public final void setExtras(Map<String, String> map) {
        if (map != null) {
            C6184hx.m18346a(map.get("tp"));
            C6184hx.m18348b(map.get("tp-ver"));
        }
        this.f19556m.f14692c = map;
    }

    public final void setKeywords(String str) {
        this.f19556m.f14691b = str;
    }

    public final void setContentUrl(String str) {
        this.f19556m.f14695f = str;
    }

    public final void setListener(BannerAdEventListener bannerAdEventListener) {
        this.f19545b = bannerAdEventListener;
    }

    public final void setEnableAutoRefresh(boolean z) {
        try {
            if (this.f19550g != z) {
                this.f19550g = z;
                if (z) {
                    mo56187b();
                } else {
                    m23130f();
                }
            }
        } catch (Exception unused) {
            C6195ic.m18378a((byte) 1, f19544a, "Unable to setup auto-refresh on the ad; SDK encountered an unexpected error");
        }
    }

    public final void setRefreshInterval(int i) {
        try {
            this.f19556m.f14694e = "NonAB";
            m23120a(getContext());
            this.f19549f = this.f19546c.mo34575a(i, this.f19549f);
        } catch (Exception unused) {
            C6195ic.m18378a((byte) 1, f19544a, "Unable to set refresh interval for the ad; SDK encountered an unexpected error");
        }
    }

    public final void setAnimationType(AnimationType animationType) {
        this.f19547d = animationType;
    }

    public final void disableHardwareAcceleration() {
        this.f19556m.f14693d = true;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            this.f19546c.mo34596v();
            m23129e();
            if (!mo56186a()) {
                getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    public final void onGlobalLayout() {
                        try {
                            int unused = InMobiBanner.this.f19552i = C6215il.m18449b(InMobiBanner.this.getMeasuredWidth());
                            int unused2 = InMobiBanner.this.f19553j = C6215il.m18449b(InMobiBanner.this.getMeasuredHeight());
                            if (!InMobiBanner.this.mo56186a()) {
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 16) {
                                InMobiBanner.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            } else {
                                InMobiBanner.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                            }
                        } catch (Exception unused3) {
                            C6195ic.m18378a((byte) 1, InMobiBanner.f19544a, "InMobiBanner$1.onGlobalLayout() handler threw unexpected error");
                            String unused4 = InMobiBanner.f19544a;
                        }
                    }
                });
            }
            mo56187b();
            if (Build.VERSION.SDK_INT >= 29) {
                C6215il.m18447a(getContext(), getRootWindowInsets());
            }
        } catch (Exception unused) {
            C6195ic.m18378a((byte) 1, f19544a, "InMobiBanner#onAttachedToWindow() handler threw unexpected error");
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            m23130f();
            this.f19546c.mo34595u();
        } catch (Exception unused) {
            C6195ic.m18378a((byte) 1, f19544a, "InMobiBanner.onDetachedFromWindow() handler threw unexpected error");
        }
    }

    /* renamed from: e */
    private void m23129e() {
        if (getLayoutParams() != null) {
            this.f19552i = C6215il.m18449b(getLayoutParams().width);
            this.f19553j = C6215il.m18449b(getLayoutParams().height);
        }
    }

    public final void setBannerSize(int i, int i2) {
        this.f19552i = i;
        this.f19553j = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo56186a() {
        return this.f19552i > 0 && this.f19553j > 0;
    }

    /* access modifiers changed from: private */
    public String getFrameSizeString() {
        return this.f19552i + "x" + this.f19553j;
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        try {
            super.onVisibilityChanged(view, i);
            if (i == 0) {
                mo56187b();
            } else {
                m23130f();
            }
        } catch (Exception unused) {
            C6195ic.m18378a((byte) 1, f19544a, "InMobiBanner$1.onVisibilityChanged() handler threw unexpected error");
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        try {
            super.onWindowFocusChanged(z);
            if (z) {
                mo56187b();
            } else {
                m23130f();
            }
        } catch (Exception unused) {
            C6195ic.m18378a((byte) 1, f19544a, "InMobiBanner$1.onWindowFocusChanged() handler threw unexpected error");
        }
    }

    /* renamed from: a */
    private void m23120a(Context context) {
        this.f19546c.mo34577a(context, this.f19556m, getFrameSizeString());
        C5738aj ajVar = this.f19546c;
        int i = this.f19549f;
        this.f19549f = ajVar.mo34575a(i, i);
    }

    /* renamed from: b */
    public final void mo56187b() {
        C5853c cVar;
        if (isShown() && hasWindowFocus()) {
            C5853c cVar2 = this.f19551h;
            if (cVar2 != null) {
                cVar2.removeMessages(1);
            }
            if (this.f19546c.mo34586l() && this.f19550g && (cVar = this.f19551h) != null) {
                cVar.sendEmptyMessageDelayed(1, (long) (this.f19549f * 1000));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m23130f() {
        C5853c cVar = this.f19551h;
        if (cVar != null) {
            cVar.removeMessages(1);
        }
    }

    public final void resume() {
        try {
            if (this.f19555l == null) {
                this.f19546c.mo34591q();
            }
        } catch (Exception unused) {
            C6195ic.m18378a((byte) 1, "InMobi", "Could not resume ad; SDK encountered an unexpected error");
        }
    }

    public final void pause() {
        try {
            if (this.f19555l == null) {
                this.f19546c.mo34592r();
            }
        } catch (Exception unused) {
            C6195ic.m18378a((byte) 1, "InMobi", "Could not pause ad; SDK encountered an unexpected error");
        }
    }

    @Deprecated
    public final String getCreativeId() {
        return this.f19546c.mo34647C();
    }

    public final void destroy() {
        m23130f();
        removeAllViews();
        this.f19546c.mo34597w();
        this.f19545b = null;
    }

    /* renamed from: com.inmobi.ads.InMobiBanner$a */
    public static final class C8087a extends C5788b {
        public final byte getType() {
            return 0;
        }

        C8087a(InMobiBanner inMobiBanner) {
            super(inMobiBanner);
        }

        public final void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
            super.onAdFetchSuccessful(adMetaInfo);
            InMobiBanner inMobiBanner = (InMobiBanner) this.f14552a.get();
            if (inMobiBanner != null) {
                try {
                    inMobiBanner.f19546c.mo34588n();
                } catch (IllegalStateException e) {
                    C6195ic.m18378a((byte) 1, InMobiBanner.f19544a, e.getMessage());
                    if (inMobiBanner.f19545b != null) {
                        inMobiBanner.f19545b.onAdLoadFailed(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    }
                }
            }
        }

        public final void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiBanner inMobiBanner = (InMobiBanner) this.f14552a.get();
            if (inMobiBanner != null) {
                if (inMobiBanner.f19545b != null) {
                    inMobiBanner.f19545b.onAdLoadFailed(inMobiBanner, inMobiAdRequestStatus);
                }
                inMobiBanner.mo56187b();
            }
        }
    }
}
