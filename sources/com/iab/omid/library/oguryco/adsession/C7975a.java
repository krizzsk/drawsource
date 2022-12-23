package com.iab.omid.library.oguryco.adsession;

import android.view.View;
import com.iab.omid.library.oguryco.p267b.C7977a;
import com.iab.omid.library.oguryco.p267b.C7981c;
import com.iab.omid.library.oguryco.p267b.C7985f;
import com.iab.omid.library.oguryco.p269d.C7997e;
import com.iab.omid.library.oguryco.p270e.C7999a;
import com.iab.omid.library.oguryco.publisher.AdSessionStatePublisher;
import com.iab.omid.library.oguryco.publisher.C8002a;
import com.iab.omid.library.oguryco.publisher.C8003b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.adsession.a */
public class C7975a extends AdSession {

    /* renamed from: a */
    private static final Pattern f19242a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f19243b;

    /* renamed from: c */
    private final AdSessionConfiguration f19244c;

    /* renamed from: d */
    private final List<C7981c> f19245d = new ArrayList();

    /* renamed from: e */
    private C7999a f19246e;

    /* renamed from: f */
    private AdSessionStatePublisher f19247f;

    /* renamed from: g */
    private boolean f19248g = false;

    /* renamed from: h */
    private boolean f19249h = false;

    /* renamed from: i */
    private String f19250i;

    /* renamed from: j */
    private boolean f19251j;

    /* renamed from: k */
    private boolean f19252k;

    C7975a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f19244c = adSessionConfiguration;
        this.f19243b = adSessionContext;
        this.f19250i = UUID.randomUUID().toString();
        m22579c((View) null);
        this.f19247f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C8002a(adSessionContext.getWebView()) : new C8003b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f19247f.mo55793a();
        C7977a.m22601a().mo55747a(this);
        this.f19247f.mo55797a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C7981c m22576a(View view) {
        for (C7981c next : this.f19245d) {
            if (next.mo55760a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m22577a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50 || !f19242a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
    }

    /* renamed from: b */
    private void m22578b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m22579c(View view) {
        this.f19246e = new C7999a(view);
    }

    /* renamed from: d */
    private void m22580d(View view) {
        Collection<C7975a> b = C7977a.m22601a().mo55748b();
        if (b != null && b.size() > 0) {
            for (C7975a next : b) {
                if (next != this && next.mo55692d() == view) {
                    next.f19246e.clear();
                }
            }
        }
    }

    /* renamed from: j */
    private void m22581j() {
        if (this.f19251j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: k */
    private void m22582k() {
        if (this.f19252k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C7981c> mo55688a() {
        return this.f19245d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55689a(JSONObject jSONObject) {
        m22582k();
        getAdSessionStatePublisher().mo55805a(jSONObject);
        this.f19252k = true;
    }

    public void addFriendlyObstruction(View view) {
        addFriendlyObstruction(view, FriendlyObstructionPurpose.OTHER, (String) null);
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f19249h) {
            m22578b(view);
            m22577a(str);
            if (m22576a(view) == null) {
                this.f19245d.add(new C7981c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo55690b() {
        m22581j();
        getAdSessionStatePublisher().mo55813g();
        this.f19251j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo55691c() {
        m22582k();
        getAdSessionStatePublisher().mo55815h();
        this.f19252k = true;
    }

    /* renamed from: d */
    public View mo55692d() {
        return (View) this.f19246e.get();
    }

    /* renamed from: e */
    public boolean mo55693e() {
        return this.f19248g && !this.f19249h;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f19249h) {
            C7997e.m22696a((Object) errorType, "Error type is null");
            C7997e.m22698a(str, "Message is null");
            getAdSessionStatePublisher().mo55798a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo55694f() {
        return this.f19248g;
    }

    public void finish() {
        if (!this.f19249h) {
            this.f19246e.clear();
            removeAllFriendlyObstructions();
            this.f19249h = true;
            getAdSessionStatePublisher().mo55812f();
            C7977a.m22601a().mo55751c(this);
            getAdSessionStatePublisher().mo55807b();
            this.f19247f = null;
        }
    }

    /* renamed from: g */
    public boolean mo55695g() {
        return this.f19249h;
    }

    public String getAdSessionId() {
        return this.f19250i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f19247f;
    }

    /* renamed from: h */
    public boolean mo55696h() {
        return this.f19244c.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean mo55697i() {
        return this.f19244c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f19249h) {
            C7997e.m22696a((Object) view, "AdView is null");
            if (mo55692d() != view) {
                m22579c(view);
                getAdSessionStatePublisher().mo55816i();
                m22580d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f19249h) {
            this.f19245d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f19249h) {
            m22578b(view);
            C7981c a = m22576a(view);
            if (a != null) {
                this.f19245d.remove(a);
            }
        }
    }

    public void start() {
        if (!this.f19248g) {
            this.f19248g = true;
            C7977a.m22601a().mo55749b(this);
            this.f19247f.mo55794a(C7985f.m22644a().mo55786d());
            this.f19247f.mo55799a(this, this.f19243b);
        }
    }
}
