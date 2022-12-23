package com.iab.omid.library.inmobi.adsession;

import android.view.View;
import com.iab.omid.library.inmobi.p249b.C7827a;
import com.iab.omid.library.inmobi.p249b.C7830c;
import com.iab.omid.library.inmobi.p249b.C7834f;
import com.iab.omid.library.inmobi.p251d.C7846e;
import com.iab.omid.library.inmobi.p252e.C7848a;
import com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher;
import com.iab.omid.library.inmobi.publisher.C7851a;
import com.iab.omid.library.inmobi.publisher.C7852b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.adsession.a */
public class C7825a extends AdSession {

    /* renamed from: a */
    private static final Pattern f18898a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f18899b;

    /* renamed from: c */
    private final AdSessionConfiguration f18900c;

    /* renamed from: d */
    private final List<C7830c> f18901d = new ArrayList();

    /* renamed from: e */
    private C7848a f18902e;

    /* renamed from: f */
    private AdSessionStatePublisher f18903f;

    /* renamed from: g */
    private boolean f18904g = false;

    /* renamed from: h */
    private boolean f18905h = false;

    /* renamed from: i */
    private final String f18906i;

    /* renamed from: j */
    private boolean f18907j;

    /* renamed from: k */
    private boolean f18908k;

    C7825a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f18900c = adSessionConfiguration;
        this.f18899b = adSessionContext;
        this.f18906i = UUID.randomUUID().toString();
        m21904c((View) null);
        this.f18903f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C7851a(adSessionContext.getWebView()) : new C7852b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f18903f.mo55194a();
        C7827a.m21924a().mo55142a(this);
        this.f18903f.mo55198a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C7830c m21901a(View view) {
        for (C7830c next : this.f18901d) {
            if (next.mo55161a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m21902a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50 || !f18898a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
    }

    /* renamed from: b */
    private static void m21903b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m21904c(View view) {
        this.f18902e = new C7848a(view);
    }

    /* renamed from: d */
    private void m21905d(View view) {
        Collection<C7825a> b = C7827a.m21924a().mo55143b();
        if (b != null && !b.isEmpty()) {
            for (C7825a next : b) {
                if (next != this && next.mo55111d() == view) {
                    next.f18902e.clear();
                }
            }
        }
    }

    /* renamed from: j */
    private void m21906j() {
        if (this.f18907j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: k */
    private void m21907k() {
        if (this.f18908k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C7830c> mo55107a() {
        return this.f18901d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55108a(JSONObject jSONObject) {
        m21907k();
        getAdSessionStatePublisher().mo55206a(jSONObject);
        this.f18908k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f18905h) {
            m21903b(view);
            m21902a(str);
            if (m21901a(view) == null) {
                this.f18901d.add(new C7830c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo55109b() {
        m21906j();
        getAdSessionStatePublisher().mo55214g();
        this.f18907j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo55110c() {
        m21907k();
        getAdSessionStatePublisher().mo55216h();
        this.f18908k = true;
    }

    /* renamed from: d */
    public View mo55111d() {
        return (View) this.f18902e.get();
    }

    /* renamed from: e */
    public boolean mo55112e() {
        return this.f18904g && !this.f18905h;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f18905h) {
            C7846e.m22016a((Object) errorType, "Error type is null");
            C7846e.m22018a(str, "Message is null");
            getAdSessionStatePublisher().mo55199a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo55113f() {
        return this.f18904g;
    }

    public void finish() {
        if (!this.f18905h) {
            this.f18902e.clear();
            removeAllFriendlyObstructions();
            this.f18905h = true;
            getAdSessionStatePublisher().mo55213f();
            C7827a.m21924a().mo55146c(this);
            getAdSessionStatePublisher().mo55208b();
            this.f18903f = null;
        }
    }

    /* renamed from: g */
    public boolean mo55114g() {
        return this.f18905h;
    }

    public String getAdSessionId() {
        return this.f18906i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f18903f;
    }

    /* renamed from: h */
    public boolean mo55115h() {
        return this.f18900c.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean mo55116i() {
        return this.f18900c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f18905h) {
            C7846e.m22016a((Object) view, "AdView is null");
            if (mo55111d() != view) {
                m21904c(view);
                getAdSessionStatePublisher().mo55217i();
                m21905d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f18905h) {
            this.f18901d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f18905h) {
            m21903b(view);
            C7830c a = m21901a(view);
            if (a != null) {
                this.f18901d.remove(a);
            }
        }
    }

    public void start() {
        if (!this.f18904g) {
            this.f18904g = true;
            C7827a.m21924a().mo55144b(this);
            this.f18903f.mo55195a(C7834f.m21964a().mo55187d());
            this.f18903f.mo55200a(this, this.f18899b);
        }
    }
}
