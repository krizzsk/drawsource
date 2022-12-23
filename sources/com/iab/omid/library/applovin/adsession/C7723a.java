package com.iab.omid.library.applovin.adsession;

import android.view.View;
import com.iab.omid.library.applovin.p237b.C7725a;
import com.iab.omid.library.applovin.p237b.C7728c;
import com.iab.omid.library.applovin.p237b.C7732f;
import com.iab.omid.library.applovin.p239d.C7744e;
import com.iab.omid.library.applovin.p240e.C7746a;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.C7749a;
import com.iab.omid.library.applovin.publisher.C7750b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.adsession.a */
public class C7723a extends AdSession {

    /* renamed from: a */
    private static final Pattern f18664a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f18665b;

    /* renamed from: c */
    private final AdSessionConfiguration f18666c;

    /* renamed from: d */
    private final List<C7728c> f18667d = new ArrayList();

    /* renamed from: e */
    private C7746a f18668e;

    /* renamed from: f */
    private AdSessionStatePublisher f18669f;

    /* renamed from: g */
    private boolean f18670g = false;

    /* renamed from: h */
    private boolean f18671h = false;

    /* renamed from: i */
    private final String f18672i;

    /* renamed from: j */
    private boolean f18673j;

    /* renamed from: k */
    private boolean f18674k;

    /* renamed from: l */
    private PossibleObstructionListener f18675l;

    C7723a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f18666c = adSessionConfiguration;
        this.f18665b = adSessionContext;
        this.f18672i = UUID.randomUUID().toString();
        m21444c((View) null);
        this.f18669f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C7749a(adSessionContext.getWebView()) : new C7750b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f18669f.mo54800a();
        C7725a.m21466a().mo54748a(this);
        this.f18669f.mo54804a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C7728c m21441a(View view) {
        for (C7728c next : this.f18667d) {
            if (next.mo54767a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m21442a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        } else if (!f18664a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    /* renamed from: b */
    private static void m21443b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m21444c(View view) {
        this.f18668e = new C7746a(view);
    }

    /* renamed from: d */
    private void m21445d(View view) {
        Collection<C7723a> b = C7725a.m21466a().mo54749b();
        if (b != null && !b.isEmpty()) {
            for (C7723a next : b) {
                if (next != this && next.mo54717e() == view) {
                    next.f18668e.clear();
                }
            }
        }
    }

    /* renamed from: k */
    private void m21446k() {
        if (this.f18673j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: l */
    private void m21447l() {
        if (this.f18674k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C7728c> mo54711a() {
        return this.f18667d;
    }

    /* renamed from: a */
    public void mo54712a(List<C7746a> list) {
        if (mo54714b()) {
            ArrayList arrayList = new ArrayList();
            for (C7746a aVar : list) {
                View view = (View) aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f18675l.onPossibleObstructionsDetected(this.f18672i, arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54713a(JSONObject jSONObject) {
        m21447l();
        getAdSessionStatePublisher().mo54812a(jSONObject);
        this.f18674k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f18671h) {
            m21443b(view);
            m21442a(str);
            if (m21441a(view) == null) {
                this.f18667d.add(new C7728c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* renamed from: b */
    public boolean mo54714b() {
        return this.f18675l != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo54715c() {
        m21446k();
        getAdSessionStatePublisher().mo54820g();
        this.f18673j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo54716d() {
        m21447l();
        getAdSessionStatePublisher().mo54822h();
        this.f18674k = true;
    }

    /* renamed from: e */
    public View mo54717e() {
        return (View) this.f18668e.get();
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f18671h) {
            C7744e.m21560a((Object) errorType, "Error type is null");
            C7744e.m21562a(str, "Message is null");
            getAdSessionStatePublisher().mo54805a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo54718f() {
        return this.f18670g && !this.f18671h;
    }

    public void finish() {
        if (!this.f18671h) {
            this.f18668e.clear();
            removeAllFriendlyObstructions();
            this.f18671h = true;
            getAdSessionStatePublisher().mo54819f();
            C7725a.m21466a().mo54752c(this);
            getAdSessionStatePublisher().mo54814b();
            this.f18669f = null;
            this.f18675l = null;
        }
    }

    /* renamed from: g */
    public boolean mo54719g() {
        return this.f18670g;
    }

    public String getAdSessionId() {
        return this.f18672i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f18669f;
    }

    /* renamed from: h */
    public boolean mo54720h() {
        return this.f18671h;
    }

    /* renamed from: i */
    public boolean mo54721i() {
        return this.f18666c.isNativeImpressionOwner();
    }

    /* renamed from: j */
    public boolean mo54722j() {
        return this.f18666c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f18671h) {
            C7744e.m21560a((Object) view, "AdView is null");
            if (mo54717e() != view) {
                m21444c(view);
                getAdSessionStatePublisher().mo54823i();
                m21445d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f18671h) {
            this.f18667d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f18671h) {
            m21443b(view);
            C7728c a = m21441a(view);
            if (a != null) {
                this.f18667d.remove(a);
            }
        }
    }

    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f18675l = possibleObstructionListener;
    }

    public void start() {
        if (!this.f18670g) {
            this.f18670g = true;
            C7725a.m21466a().mo54750b(this);
            this.f18669f.mo54801a(C7732f.m21506a().mo54793d());
            this.f18669f.mo54806a(this, this.f18665b);
        }
    }
}
