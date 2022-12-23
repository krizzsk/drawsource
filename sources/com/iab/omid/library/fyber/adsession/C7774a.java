package com.iab.omid.library.fyber.adsession;

import android.view.View;
import com.iab.omid.library.fyber.p243b.C7776a;
import com.iab.omid.library.fyber.p243b.C7779c;
import com.iab.omid.library.fyber.p243b.C7783f;
import com.iab.omid.library.fyber.p245d.C7795e;
import com.iab.omid.library.fyber.p246e.C7797a;
import com.iab.omid.library.fyber.publisher.AdSessionStatePublisher;
import com.iab.omid.library.fyber.publisher.C7800a;
import com.iab.omid.library.fyber.publisher.C7801b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.adsession.a */
public class C7774a extends AdSession {

    /* renamed from: a */
    private static final Pattern f18781a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f18782b;

    /* renamed from: c */
    private final AdSessionConfiguration f18783c;

    /* renamed from: d */
    private final List<C7779c> f18784d = new ArrayList();

    /* renamed from: e */
    private C7797a f18785e;

    /* renamed from: f */
    private AdSessionStatePublisher f18786f;

    /* renamed from: g */
    private boolean f18787g = false;

    /* renamed from: h */
    private boolean f18788h = false;

    /* renamed from: i */
    private final String f18789i;

    /* renamed from: j */
    private boolean f18790j;

    /* renamed from: k */
    private boolean f18791k;

    /* renamed from: l */
    private PossibleObstructionListener f18792l;

    C7774a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f18783c = adSessionConfiguration;
        this.f18782b = adSessionContext;
        this.f18789i = UUID.randomUUID().toString();
        m21674c((View) null);
        this.f18786f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C7800a(adSessionContext.getWebView()) : new C7801b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f18786f.mo54999a();
        C7776a.m21696a().mo54947a(this);
        this.f18786f.mo55003a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C7779c m21671a(View view) {
        for (C7779c next : this.f18784d) {
            if (next.mo54966a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m21672a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        } else if (!f18781a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    /* renamed from: b */
    private static void m21673b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m21674c(View view) {
        this.f18785e = new C7797a(view);
    }

    /* renamed from: d */
    private void m21675d(View view) {
        Collection<C7774a> b = C7776a.m21696a().mo54948b();
        if (b != null && !b.isEmpty()) {
            for (C7774a next : b) {
                if (next != this && next.mo54916e() == view) {
                    next.f18785e.clear();
                }
            }
        }
    }

    /* renamed from: k */
    private void m21676k() {
        if (this.f18790j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: l */
    private void m21677l() {
        if (this.f18791k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C7779c> mo54910a() {
        return this.f18784d;
    }

    /* renamed from: a */
    public void mo54911a(List<C7797a> list) {
        if (mo54913b()) {
            ArrayList arrayList = new ArrayList();
            for (C7797a aVar : list) {
                View view = (View) aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f18792l.onPossibleObstructionsDetected(this.f18789i, arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54912a(JSONObject jSONObject) {
        m21677l();
        getAdSessionStatePublisher().mo55011a(jSONObject);
        this.f18791k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f18788h) {
            m21673b(view);
            m21672a(str);
            if (m21671a(view) == null) {
                this.f18784d.add(new C7779c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* renamed from: b */
    public boolean mo54913b() {
        return this.f18792l != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo54914c() {
        m21676k();
        getAdSessionStatePublisher().mo55019g();
        this.f18790j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo54915d() {
        m21677l();
        getAdSessionStatePublisher().mo55021h();
        this.f18791k = true;
    }

    /* renamed from: e */
    public View mo54916e() {
        return (View) this.f18785e.get();
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f18788h) {
            C7795e.m21790a((Object) errorType, "Error type is null");
            C7795e.m21792a(str, "Message is null");
            getAdSessionStatePublisher().mo55004a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo54917f() {
        return this.f18787g && !this.f18788h;
    }

    public void finish() {
        if (!this.f18788h) {
            this.f18785e.clear();
            removeAllFriendlyObstructions();
            this.f18788h = true;
            getAdSessionStatePublisher().mo55018f();
            C7776a.m21696a().mo54951c(this);
            getAdSessionStatePublisher().mo55013b();
            this.f18786f = null;
            this.f18792l = null;
        }
    }

    /* renamed from: g */
    public boolean mo54918g() {
        return this.f18787g;
    }

    public String getAdSessionId() {
        return this.f18789i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f18786f;
    }

    /* renamed from: h */
    public boolean mo54919h() {
        return this.f18788h;
    }

    /* renamed from: i */
    public boolean mo54920i() {
        return this.f18783c.isNativeImpressionOwner();
    }

    /* renamed from: j */
    public boolean mo54921j() {
        return this.f18783c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f18788h) {
            C7795e.m21790a((Object) view, "AdView is null");
            if (mo54916e() != view) {
                m21674c(view);
                getAdSessionStatePublisher().mo55022i();
                m21675d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f18788h) {
            this.f18784d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f18788h) {
            m21673b(view);
            C7779c a = m21671a(view);
            if (a != null) {
                this.f18784d.remove(a);
            }
        }
    }

    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f18792l = possibleObstructionListener;
    }

    public void start() {
        if (!this.f18787g) {
            this.f18787g = true;
            C7776a.m21696a().mo54949b(this);
            this.f18786f.mo55000a(C7783f.m21736a().mo54992d());
            this.f18786f.mo55005a(this, this.f18782b);
        }
    }
}
