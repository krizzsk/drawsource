package com.iab.omid.library.vungle.adsession;

import android.view.View;
import com.iab.omid.library.vungle.p273b.C8041a;
import com.iab.omid.library.vungle.p273b.C8044c;
import com.iab.omid.library.vungle.p273b.C8048f;
import com.iab.omid.library.vungle.p275d.C8060e;
import com.iab.omid.library.vungle.p276e.C8062a;
import com.iab.omid.library.vungle.publisher.AdSessionStatePublisher;
import com.iab.omid.library.vungle.publisher.C8065a;
import com.iab.omid.library.vungle.publisher.C8066b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.adsession.a */
public class C8039a extends AdSession {

    /* renamed from: a */
    private static final Pattern f19431a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f19432b;

    /* renamed from: c */
    private final AdSessionConfiguration f19433c;

    /* renamed from: d */
    private final List<C8044c> f19434d = new ArrayList();

    /* renamed from: e */
    private C8062a f19435e;

    /* renamed from: f */
    private AdSessionStatePublisher f19436f;

    /* renamed from: g */
    private boolean f19437g = false;

    /* renamed from: h */
    private boolean f19438h = false;

    /* renamed from: i */
    private final String f19439i;

    /* renamed from: j */
    private boolean f19440j;

    /* renamed from: k */
    private boolean f19441k;

    C8039a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f19433c = adSessionConfiguration;
        this.f19432b = adSessionContext;
        this.f19439i = UUID.randomUUID().toString();
        m22905c((View) null);
        this.f19436f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C8065a(adSessionContext.getWebView()) : new C8066b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f19436f.mo56111a();
        C8041a.m22925a().mo56059a(this);
        this.f19436f.mo56115a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C8044c m22902a(View view) {
        for (C8044c next : this.f19434d) {
            if (next.mo56078a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m22903a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        } else if (!f19431a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    /* renamed from: b */
    private static void m22904b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m22905c(View view) {
        this.f19435e = new C8062a(view);
    }

    /* renamed from: d */
    private void m22906d(View view) {
        Collection<C8039a> b = C8041a.m22925a().mo56060b();
        if (b != null && !b.isEmpty()) {
            for (C8039a next : b) {
                if (next != this && next.mo56028d() == view) {
                    next.f19435e.clear();
                }
            }
        }
    }

    /* renamed from: j */
    private void m22907j() {
        if (this.f19440j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: k */
    private void m22908k() {
        if (this.f19441k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C8044c> mo56024a() {
        return this.f19434d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo56025a(JSONObject jSONObject) {
        m22908k();
        getAdSessionStatePublisher().mo56123a(jSONObject);
        this.f19441k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f19438h) {
            m22904b(view);
            m22903a(str);
            if (m22902a(view) == null) {
                this.f19434d.add(new C8044c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo56026b() {
        m22907j();
        getAdSessionStatePublisher().mo56131g();
        this.f19440j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo56027c() {
        m22908k();
        getAdSessionStatePublisher().mo56133h();
        this.f19441k = true;
    }

    /* renamed from: d */
    public View mo56028d() {
        return (View) this.f19435e.get();
    }

    /* renamed from: e */
    public boolean mo56029e() {
        return this.f19437g && !this.f19438h;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f19438h) {
            C8060e.m23017a((Object) errorType, "Error type is null");
            C8060e.m23019a(str, "Message is null");
            getAdSessionStatePublisher().mo56116a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo56030f() {
        return this.f19437g;
    }

    public void finish() {
        if (!this.f19438h) {
            this.f19435e.clear();
            removeAllFriendlyObstructions();
            this.f19438h = true;
            getAdSessionStatePublisher().mo56130f();
            C8041a.m22925a().mo56063c(this);
            getAdSessionStatePublisher().mo56125b();
            this.f19436f = null;
        }
    }

    /* renamed from: g */
    public boolean mo56031g() {
        return this.f19438h;
    }

    public String getAdSessionId() {
        return this.f19439i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f19436f;
    }

    /* renamed from: h */
    public boolean mo56032h() {
        return this.f19433c.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean mo56033i() {
        return this.f19433c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f19438h) {
            C8060e.m23017a((Object) view, "AdView is null");
            if (mo56028d() != view) {
                m22905c(view);
                getAdSessionStatePublisher().mo56134i();
                m22906d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f19438h) {
            this.f19434d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f19438h) {
            m22904b(view);
            C8044c a = m22902a(view);
            if (a != null) {
                this.f19434d.remove(a);
            }
        }
    }

    public void start() {
        if (!this.f19437g) {
            this.f19437g = true;
            C8041a.m22925a().mo56061b(this);
            this.f19436f.mo56112a(C8048f.m22965a().mo56104d());
            this.f19436f.mo56117a(this, this.f19432b);
        }
    }
}
