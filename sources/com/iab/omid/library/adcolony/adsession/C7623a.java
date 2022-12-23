package com.iab.omid.library.adcolony.adsession;

import android.view.View;
import com.iab.omid.library.adcolony.p225b.C7625a;
import com.iab.omid.library.adcolony.p225b.C7628c;
import com.iab.omid.library.adcolony.p225b.C7632f;
import com.iab.omid.library.adcolony.p227d.C7644e;
import com.iab.omid.library.adcolony.p228e.C7646a;
import com.iab.omid.library.adcolony.publisher.AdSessionStatePublisher;
import com.iab.omid.library.adcolony.publisher.C7649a;
import com.iab.omid.library.adcolony.publisher.C7650b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.adsession.a */
public class C7623a extends AdSession {

    /* renamed from: a */
    private static final Pattern f18430a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f18431b;

    /* renamed from: c */
    private final AdSessionConfiguration f18432c;

    /* renamed from: d */
    private final List<C7628c> f18433d = new ArrayList();

    /* renamed from: e */
    private C7646a f18434e;

    /* renamed from: f */
    private AdSessionStatePublisher f18435f;

    /* renamed from: g */
    private boolean f18436g = false;

    /* renamed from: h */
    private boolean f18437h = false;

    /* renamed from: i */
    private final String f18438i;

    /* renamed from: j */
    private boolean f18439j;

    /* renamed from: k */
    private boolean f18440k;

    /* renamed from: l */
    private PossibleObstructionListener f18441l;

    C7623a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f18432c = adSessionConfiguration;
        this.f18431b = adSessionContext;
        this.f18438i = UUID.randomUUID().toString();
        m20984c((View) null);
        this.f18435f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C7649a(adSessionContext.getWebView()) : new C7650b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f18435f.mo54402a();
        C7625a.m21006a().mo54350a(this);
        this.f18435f.mo54406a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C7628c m20981a(View view) {
        for (C7628c next : this.f18433d) {
            if (next.mo54369a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m20982a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        } else if (!f18430a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    /* renamed from: b */
    private static void m20983b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m20984c(View view) {
        this.f18434e = new C7646a(view);
    }

    /* renamed from: d */
    private void m20985d(View view) {
        Collection<C7623a> b = C7625a.m21006a().mo54351b();
        if (b != null && !b.isEmpty()) {
            for (C7623a next : b) {
                if (next != this && next.mo54319e() == view) {
                    next.f18434e.clear();
                }
            }
        }
    }

    /* renamed from: k */
    private void m20986k() {
        if (this.f18439j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: l */
    private void m20987l() {
        if (this.f18440k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C7628c> mo54313a() {
        return this.f18433d;
    }

    /* renamed from: a */
    public void mo54314a(List<C7646a> list) {
        if (mo54316b()) {
            ArrayList arrayList = new ArrayList();
            for (C7646a aVar : list) {
                View view = (View) aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f18441l.onPossibleObstructionsDetected(this.f18438i, arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo54315a(JSONObject jSONObject) {
        m20987l();
        getAdSessionStatePublisher().mo54414a(jSONObject);
        this.f18440k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f18437h) {
            m20983b(view);
            m20982a(str);
            if (m20981a(view) == null) {
                this.f18433d.add(new C7628c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* renamed from: b */
    public boolean mo54316b() {
        return this.f18441l != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo54317c() {
        m20986k();
        getAdSessionStatePublisher().mo54422g();
        this.f18439j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo54318d() {
        m20987l();
        getAdSessionStatePublisher().mo54424h();
        this.f18440k = true;
    }

    /* renamed from: e */
    public View mo54319e() {
        return (View) this.f18434e.get();
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f18437h) {
            C7644e.m21100a((Object) errorType, "Error type is null");
            C7644e.m21102a(str, "Message is null");
            getAdSessionStatePublisher().mo54407a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo54320f() {
        return this.f18436g && !this.f18437h;
    }

    public void finish() {
        if (!this.f18437h) {
            this.f18434e.clear();
            removeAllFriendlyObstructions();
            this.f18437h = true;
            getAdSessionStatePublisher().mo54421f();
            C7625a.m21006a().mo54354c(this);
            getAdSessionStatePublisher().mo54416b();
            this.f18435f = null;
            this.f18441l = null;
        }
    }

    /* renamed from: g */
    public boolean mo54321g() {
        return this.f18436g;
    }

    public String getAdSessionId() {
        return this.f18438i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f18435f;
    }

    /* renamed from: h */
    public boolean mo54322h() {
        return this.f18437h;
    }

    /* renamed from: i */
    public boolean mo54323i() {
        return this.f18432c.isNativeImpressionOwner();
    }

    /* renamed from: j */
    public boolean mo54324j() {
        return this.f18432c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f18437h) {
            C7644e.m21100a((Object) view, "AdView is null");
            if (mo54319e() != view) {
                m20984c(view);
                getAdSessionStatePublisher().mo54425i();
                m20985d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f18437h) {
            this.f18433d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f18437h) {
            m20983b(view);
            C7628c a = m20981a(view);
            if (a != null) {
                this.f18433d.remove(a);
            }
        }
    }

    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f18441l = possibleObstructionListener;
    }

    public void start() {
        if (!this.f18436g) {
            this.f18436g = true;
            C7625a.m21006a().mo54352b(this);
            this.f18435f.mo54403a(C7632f.m21046a().mo54395d());
            this.f18435f.mo54408a(this, this.f18431b);
        }
    }
}
