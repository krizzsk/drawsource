package com.iab.omid.library.smaato.adsession;

import android.view.View;
import com.iab.omid.library.smaato.publisher.AdSessionStatePublisher;
import com.iab.omid.library.smaato.publisher.C8024a;
import com.iab.omid.library.smaato.publisher.C8025b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p012c.C0689a;
import p012c.C0692c;
import p012c.C0696f;
import p397e.C12469e;
import p400h.C12480a;

/* renamed from: com.iab.omid.library.smaato.adsession.a */
public class C8021a extends AdSession {

    /* renamed from: l */
    private static final Pattern f19358l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final AdSessionContext f19359a;

    /* renamed from: b */
    private final AdSessionConfiguration f19360b;

    /* renamed from: c */
    private final List<C0692c> f19361c = new ArrayList();

    /* renamed from: d */
    private C12480a f19362d;

    /* renamed from: e */
    private AdSessionStatePublisher f19363e;

    /* renamed from: f */
    private boolean f19364f = false;

    /* renamed from: g */
    private boolean f19365g = false;

    /* renamed from: h */
    private final String f19366h;

    /* renamed from: i */
    private boolean f19367i;

    /* renamed from: j */
    private boolean f19368j;

    /* renamed from: k */
    private PossibleObstructionListener f19369k;

    C8021a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f19360b = adSessionConfiguration;
        this.f19359a = adSessionContext;
        this.f19366h = UUID.randomUUID().toString();
        m22807d((View) null);
        this.f19363e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C8024a(adSessionContext.getWebView()) : new C8025b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f19363e.mo55955i();
        C0689a.m34c().mo10262a(this);
        this.f19363e.mo55936a(adSessionConfiguration);
    }

    /* renamed from: a */
    private void m22801a() {
        if (this.f19367i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: a */
    private static void m22802a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: a */
    private void m22803a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        } else if (!f19358l.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    /* renamed from: b */
    private C0692c m22804b(View view) {
        for (C0692c next : this.f19361c) {
            if (next.mo10282c().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m22805b() {
        if (this.f19368j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: c */
    private void m22806c(View view) {
        Collection<C8021a> b = C0689a.m34c().mo10263b();
        if (b != null && !b.isEmpty()) {
            for (C8021a next : b) {
                if (next != this && next.mo55901c() == view) {
                    next.f19362d.clear();
                }
            }
        }
    }

    /* renamed from: d */
    private void m22807d(View view) {
        this.f19362d = new C12480a(view);
    }

    /* renamed from: a */
    public void mo55899a(List<C12480a> list) {
        if (mo55903e()) {
            ArrayList arrayList = new ArrayList();
            for (C12480a aVar : list) {
                View view = (View) aVar.get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f19369k.onPossibleObstructionsDetected(this.f19366h, arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo55900a(JSONObject jSONObject) {
        m22805b();
        getAdSessionStatePublisher().mo55944a(jSONObject);
        this.f19368j = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f19365g) {
            m22802a(view);
            m22803a(str);
            if (m22804b(view) == null) {
                this.f19361c.add(new C0692c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* renamed from: c */
    public View mo55901c() {
        return (View) this.f19362d.get();
    }

    /* renamed from: d */
    public List<C0692c> mo55902d() {
        return this.f19361c;
    }

    /* renamed from: e */
    public boolean mo55903e() {
        return this.f19369k != null;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f19365g) {
            C12469e.m33308a((Object) errorType, "Error type is null");
            C12469e.m33310a(str, "Message is null");
            getAdSessionStatePublisher().mo55937a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo55904f() {
        return this.f19364f && !this.f19365g;
    }

    public void finish() {
        if (!this.f19365g) {
            this.f19362d.clear();
            removeAllFriendlyObstructions();
            this.f19365g = true;
            getAdSessionStatePublisher().mo55951f();
            C0689a.m34c().mo10264b(this);
            getAdSessionStatePublisher().mo55946b();
            this.f19363e = null;
            this.f19369k = null;
        }
    }

    /* renamed from: g */
    public boolean mo55905g() {
        return this.f19365g;
    }

    public String getAdSessionId() {
        return this.f19366h;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f19363e;
    }

    /* renamed from: h */
    public boolean mo55906h() {
        return this.f19360b.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean mo55907i() {
        return this.f19360b.isNativeMediaEventsOwner();
    }

    /* renamed from: j */
    public boolean mo55908j() {
        return this.f19364f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo55909k() {
        m22801a();
        getAdSessionStatePublisher().mo55952g();
        this.f19367i = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo55910l() {
        m22805b();
        getAdSessionStatePublisher().mo55954h();
        this.f19368j = true;
    }

    public void registerAdView(View view) {
        if (!this.f19365g) {
            C12469e.m33308a((Object) view, "AdView is null");
            if (mo55901c() != view) {
                m22807d(view);
                getAdSessionStatePublisher().mo55932a();
                m22806c(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f19365g) {
            this.f19361c.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f19365g) {
            m22802a(view);
            C0692c b = m22804b(view);
            if (b != null) {
                this.f19361c.remove(b);
            }
        }
    }

    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f19369k = possibleObstructionListener;
    }

    public void start() {
        if (!this.f19364f) {
            this.f19364f = true;
            C0689a.m34c().mo10265c(this);
            this.f19363e.mo55933a(C0696f.m75c().mo10304b());
            this.f19363e.mo55938a(this, this.f19359a);
        }
    }
}
