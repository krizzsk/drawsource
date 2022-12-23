package com.iab.omid.library.amazon.adsession;

import android.view.View;
import com.iab.omid.library.amazon.p231b.C7675a;
import com.iab.omid.library.amazon.p231b.C7678c;
import com.iab.omid.library.amazon.p231b.C7682f;
import com.iab.omid.library.amazon.p233d.C7694e;
import com.iab.omid.library.amazon.p234e.C7696a;
import com.iab.omid.library.amazon.publisher.AdSessionStatePublisher;
import com.iab.omid.library.amazon.publisher.C7699a;
import com.iab.omid.library.amazon.publisher.C7700b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.adsession.a */
public class C7673a extends AdSession {

    /* renamed from: a */
    private static final Pattern f18547a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f18548b;

    /* renamed from: c */
    private final AdSessionConfiguration f18549c;

    /* renamed from: d */
    private final List<C7678c> f18550d = new ArrayList();

    /* renamed from: e */
    private C7696a f18551e;

    /* renamed from: f */
    private AdSessionStatePublisher f18552f;

    /* renamed from: g */
    private boolean f18553g = false;

    /* renamed from: h */
    private boolean f18554h = false;

    /* renamed from: i */
    private final String f18555i;

    /* renamed from: j */
    private boolean f18556j;

    /* renamed from: k */
    private boolean f18557k;

    /* renamed from: l */
    private PossibleObstructionListener f18558l;

    C7673a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f18549c = adSessionConfiguration;
        this.f18548b = adSessionContext;
        this.f18555i = UUID.randomUUID().toString();
        m21214c((View) null);
        this.f18552f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C7699a(adSessionContext.getWebView()) : new C7700b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f18552f.mo54601a();
        C7675a.m21236a().mo54549a(this);
        this.f18552f.mo54605a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C7678c m21211a(View view) {
        for (C7678c next : this.f18550d) {
            if (next.mo54568a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m21212a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        } else if (!f18547a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    /* renamed from: b */
    private static void m21213b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m21214c(View view) {
        this.f18551e = new C7696a(view);
    }

    /* renamed from: d */
    private void m21215d(View view) {
        Collection<C7673a> b = C7675a.m21236a().mo54550b();
        if (b != null && !b.isEmpty()) {
            for (C7673a next : b) {
                if (next != this && next.mo54518e() == view) {
                    next.f18551e.clear();
                }
            }
        }
    }

    /* renamed from: k */
    private void m21216k() {
        if (this.f18556j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: l */
    private void m21217l() {
        if (this.f18557k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C7678c> mo54512a() {
        return this.f18550d;
    }

    /* renamed from: a */
    public void mo54513a(List<C7696a> list) {
        if (mo54515b()) {
            ArrayList arrayList = new ArrayList();
            for (C7696a aVar : list) {
                View view = (View) aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f18558l.onPossibleObstructionsDetected(this.f18555i, arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54514a(JSONObject jSONObject) {
        m21217l();
        getAdSessionStatePublisher().mo54613a(jSONObject);
        this.f18557k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f18554h) {
            m21213b(view);
            m21212a(str);
            if (m21211a(view) == null) {
                this.f18550d.add(new C7678c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* renamed from: b */
    public boolean mo54515b() {
        return this.f18558l != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo54516c() {
        m21216k();
        getAdSessionStatePublisher().mo54621g();
        this.f18556j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo54517d() {
        m21217l();
        getAdSessionStatePublisher().mo54623h();
        this.f18557k = true;
    }

    /* renamed from: e */
    public View mo54518e() {
        return (View) this.f18551e.get();
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f18554h) {
            C7694e.m21330a((Object) errorType, "Error type is null");
            C7694e.m21332a(str, "Message is null");
            getAdSessionStatePublisher().mo54606a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo54519f() {
        return this.f18553g && !this.f18554h;
    }

    public void finish() {
        if (!this.f18554h) {
            this.f18551e.clear();
            removeAllFriendlyObstructions();
            this.f18554h = true;
            getAdSessionStatePublisher().mo54620f();
            C7675a.m21236a().mo54553c(this);
            getAdSessionStatePublisher().mo54615b();
            this.f18552f = null;
            this.f18558l = null;
        }
    }

    /* renamed from: g */
    public boolean mo54520g() {
        return this.f18553g;
    }

    public String getAdSessionId() {
        return this.f18555i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f18552f;
    }

    /* renamed from: h */
    public boolean mo54521h() {
        return this.f18554h;
    }

    /* renamed from: i */
    public boolean mo54522i() {
        return this.f18549c.isNativeImpressionOwner();
    }

    /* renamed from: j */
    public boolean mo54523j() {
        return this.f18549c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f18554h) {
            C7694e.m21330a((Object) view, "AdView is null");
            if (mo54518e() != view) {
                m21214c(view);
                getAdSessionStatePublisher().mo54624i();
                m21215d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f18554h) {
            this.f18550d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f18554h) {
            m21213b(view);
            C7678c a = m21211a(view);
            if (a != null) {
                this.f18550d.remove(a);
            }
        }
    }

    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f18558l = possibleObstructionListener;
    }

    public void start() {
        if (!this.f18553g) {
            this.f18553g = true;
            C7675a.m21236a().mo54551b(this);
            this.f18552f.mo54602a(C7682f.m21276a().mo54594d());
            this.f18552f.mo54607a(this, this.f18548b);
        }
    }
}
