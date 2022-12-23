package com.iab.omid.library.mmadbridge.adsession;

import android.view.View;
import com.iab.omid.library.mmadbridge.p261b.C7927a;
import com.iab.omid.library.mmadbridge.p261b.C7930c;
import com.iab.omid.library.mmadbridge.p261b.C7934f;
import com.iab.omid.library.mmadbridge.p263d.C7946e;
import com.iab.omid.library.mmadbridge.p264e.C7948a;
import com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher;
import com.iab.omid.library.mmadbridge.publisher.C7951a;
import com.iab.omid.library.mmadbridge.publisher.C7952b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.adsession.a */
public class C7925a extends AdSession {

    /* renamed from: a */
    private static final Pattern f19125a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f19126b;

    /* renamed from: c */
    private final AdSessionConfiguration f19127c;

    /* renamed from: d */
    private final List<C7930c> f19128d = new ArrayList();

    /* renamed from: e */
    private C7948a f19129e;

    /* renamed from: f */
    private AdSessionStatePublisher f19130f;

    /* renamed from: g */
    private boolean f19131g = false;

    /* renamed from: h */
    private boolean f19132h = false;

    /* renamed from: i */
    private final String f19133i;

    /* renamed from: j */
    private boolean f19134j;

    /* renamed from: k */
    private boolean f19135k;

    /* renamed from: l */
    private PossibleObstructionListener f19136l;

    C7925a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f19127c = adSessionConfiguration;
        this.f19126b = adSessionContext;
        this.f19133i = UUID.randomUUID().toString();
        m22349c((View) null);
        this.f19130f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C7951a(adSessionContext.getWebView()) : new C7952b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f19130f.mo55578a();
        C7927a.m22371a().mo55526a(this);
        this.f19130f.mo55582a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C7930c m22346a(View view) {
        for (C7930c next : this.f19128d) {
            if (next.mo55545a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m22347a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        } else if (!f19125a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    /* renamed from: b */
    private static void m22348b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m22349c(View view) {
        this.f19129e = new C7948a(view);
    }

    /* renamed from: d */
    private void m22350d(View view) {
        Collection<C7925a> b = C7927a.m22371a().mo55527b();
        if (b != null && !b.isEmpty()) {
            for (C7925a next : b) {
                if (next != this && next.mo55495e() == view) {
                    next.f19129e.clear();
                }
            }
        }
    }

    /* renamed from: k */
    private void m22351k() {
        if (this.f19134j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: l */
    private void m22352l() {
        if (this.f19135k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C7930c> mo55489a() {
        return this.f19128d;
    }

    /* renamed from: a */
    public void mo55490a(List<C7948a> list) {
        if (mo55492b()) {
            ArrayList arrayList = new ArrayList();
            for (C7948a aVar : list) {
                View view = (View) aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f19136l.onPossibleObstructionsDetected(this.f19133i, arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55491a(JSONObject jSONObject) {
        m22352l();
        getAdSessionStatePublisher().mo55590a(jSONObject);
        this.f19135k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f19132h) {
            m22348b(view);
            m22347a(str);
            if (m22346a(view) == null) {
                this.f19128d.add(new C7930c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* renamed from: b */
    public boolean mo55492b() {
        return this.f19136l != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo55493c() {
        m22351k();
        getAdSessionStatePublisher().mo55598g();
        this.f19134j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo55494d() {
        m22352l();
        getAdSessionStatePublisher().mo55600h();
        this.f19135k = true;
    }

    /* renamed from: e */
    public View mo55495e() {
        return (View) this.f19129e.get();
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f19132h) {
            C7946e.m22465a((Object) errorType, "Error type is null");
            C7946e.m22467a(str, "Message is null");
            getAdSessionStatePublisher().mo55583a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo55496f() {
        return this.f19131g && !this.f19132h;
    }

    public void finish() {
        if (!this.f19132h) {
            this.f19129e.clear();
            removeAllFriendlyObstructions();
            this.f19132h = true;
            getAdSessionStatePublisher().mo55597f();
            C7927a.m22371a().mo55530c(this);
            getAdSessionStatePublisher().mo55592b();
            this.f19130f = null;
            this.f19136l = null;
        }
    }

    /* renamed from: g */
    public boolean mo55497g() {
        return this.f19131g;
    }

    public String getAdSessionId() {
        return this.f19133i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f19130f;
    }

    /* renamed from: h */
    public boolean mo55498h() {
        return this.f19132h;
    }

    /* renamed from: i */
    public boolean mo55499i() {
        return this.f19127c.isNativeImpressionOwner();
    }

    /* renamed from: j */
    public boolean mo55500j() {
        return this.f19127c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f19132h) {
            C7946e.m22465a((Object) view, "AdView is null");
            if (mo55495e() != view) {
                m22349c(view);
                getAdSessionStatePublisher().mo55601i();
                m22350d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f19132h) {
            this.f19128d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f19132h) {
            m22348b(view);
            C7930c a = m22346a(view);
            if (a != null) {
                this.f19128d.remove(a);
            }
        }
    }

    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f19136l = possibleObstructionListener;
    }

    public void start() {
        if (!this.f19131g) {
            this.f19131g = true;
            C7927a.m22371a().mo55528b(this);
            this.f19130f.mo55579a(C7934f.m22411a().mo55571d());
            this.f19130f.mo55584a(this, this.f19126b);
        }
    }
}
