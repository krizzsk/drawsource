package com.iab.omid.library.ironsrc.adsession;

import android.view.View;
import com.iab.omid.library.ironsrc.p255b.C7877a;
import com.iab.omid.library.ironsrc.p255b.C7880c;
import com.iab.omid.library.ironsrc.p255b.C7884f;
import com.iab.omid.library.ironsrc.p257d.C7896e;
import com.iab.omid.library.ironsrc.p258e.C7898a;
import com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher;
import com.iab.omid.library.ironsrc.publisher.C7901a;
import com.iab.omid.library.ironsrc.publisher.C7902b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.adsession.a */
public class C7875a extends AdSession {

    /* renamed from: a */
    private static final Pattern f19011a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f19012b;

    /* renamed from: c */
    private final AdSessionConfiguration f19013c;

    /* renamed from: d */
    private final List<C7880c> f19014d = new ArrayList();

    /* renamed from: e */
    private C7898a f19015e;

    /* renamed from: f */
    private AdSessionStatePublisher f19016f;

    /* renamed from: g */
    private boolean f19017g = false;

    /* renamed from: h */
    private boolean f19018h = false;

    /* renamed from: i */
    private String f19019i;

    /* renamed from: j */
    private boolean f19020j;

    /* renamed from: k */
    private boolean f19021k;

    C7875a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f19013c = adSessionConfiguration;
        this.f19012b = adSessionContext;
        this.f19019i = UUID.randomUUID().toString();
        m22128c((View) null);
        this.f19016f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C7901a(adSessionContext.getWebView()) : new C7902b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f19016f.mo55380a();
        C7877a.m22148a().mo55336a(this);
        this.f19016f.mo55384a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C7880c m22125a(View view) {
        for (C7880c next : this.f19014d) {
            if (next.mo55347a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m22126a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50 || !f19011a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
    }

    /* renamed from: b */
    private void m22127b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m22128c(View view) {
        this.f19015e = new C7898a(view);
    }

    /* renamed from: d */
    private void m22129d(View view) {
        Collection<C7875a> b = C7877a.m22148a().mo55337b();
        if (b != null && b.size() > 0) {
            for (C7875a next : b) {
                if (next != this && next.mo55305d() == view) {
                    next.f19015e.clear();
                }
            }
        }
    }

    /* renamed from: j */
    private void m22130j() {
        if (this.f19020j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: k */
    private void m22131k() {
        if (this.f19021k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C7880c> mo55301a() {
        return this.f19014d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55302a(JSONObject jSONObject) {
        m22131k();
        getAdSessionStatePublisher().mo55392a(jSONObject);
        this.f19021k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f19018h) {
            m22127b(view);
            m22126a(str);
            if (m22125a(view) == null) {
                this.f19014d.add(new C7880c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo55303b() {
        m22130j();
        getAdSessionStatePublisher().mo55400g();
        this.f19020j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo55304c() {
        m22131k();
        getAdSessionStatePublisher().mo55402h();
        this.f19021k = true;
    }

    /* renamed from: d */
    public View mo55305d() {
        return (View) this.f19015e.get();
    }

    /* renamed from: e */
    public boolean mo55306e() {
        return this.f19017g && !this.f19018h;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f19018h) {
            C7896e.m22237a((Object) errorType, "Error type is null");
            C7896e.m22239a(str, "Message is null");
            getAdSessionStatePublisher().mo55385a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo55307f() {
        return this.f19017g;
    }

    public void finish() {
        if (!this.f19018h) {
            this.f19015e.clear();
            removeAllFriendlyObstructions();
            this.f19018h = true;
            getAdSessionStatePublisher().mo55399f();
            C7877a.m22148a().mo55340c(this);
            getAdSessionStatePublisher().mo55394b();
            this.f19016f = null;
        }
    }

    /* renamed from: g */
    public boolean mo55308g() {
        return this.f19018h;
    }

    public String getAdSessionId() {
        return this.f19019i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f19016f;
    }

    /* renamed from: h */
    public boolean mo55309h() {
        return this.f19013c.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean mo55310i() {
        return this.f19013c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f19018h) {
            C7896e.m22237a((Object) view, "AdView is null");
            if (mo55305d() != view) {
                m22128c(view);
                getAdSessionStatePublisher().mo55403i();
                m22129d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f19018h) {
            this.f19014d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f19018h) {
            m22127b(view);
            C7880c a = m22125a(view);
            if (a != null) {
                this.f19014d.remove(a);
            }
        }
    }

    public void start() {
        if (!this.f19017g) {
            this.f19017g = true;
            C7877a.m22148a().mo55338b(this);
            this.f19016f.mo55381a(C7884f.m22186a().mo55373d());
            this.f19016f.mo55386a(this, this.f19012b);
        }
    }
}
