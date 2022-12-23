package com.tapjoy.internal;

import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import com.smaato.sdk.video.vast.model.StaticResource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.cx */
public final class C11344cx extends C11333cm {

    /* renamed from: i */
    private static final Pattern f27076i = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    public final C11334cn f27077a;

    /* renamed from: b */
    public final List<C11354df> f27078b = new ArrayList();

    /* renamed from: c */
    public C11372du f27079c;

    /* renamed from: d */
    public boolean f27080d = false;

    /* renamed from: e */
    public boolean f27081e = false;

    /* renamed from: f */
    public final String f27082f;

    /* renamed from: g */
    public boolean f27083g;

    /* renamed from: h */
    public boolean f27084h;

    /* renamed from: j */
    private final C11335co f27085j;

    /* renamed from: k */
    private C11370ds f27086k;

    /* renamed from: b */
    private void m31041b(View view) {
        this.f27086k = new C11370ds(view);
    }

    /* renamed from: c */
    public final View mo69788c() {
        return (View) this.f27086k.get();
    }

    /* renamed from: d */
    public final boolean mo69789d() {
        return this.f27080d && !this.f27081e;
    }

    public C11344cx(C11334cn cnVar, C11335co coVar) {
        this.f27077a = cnVar;
        this.f27085j = coVar;
        this.f27082f = UUID.randomUUID().toString();
        m31041b((View) null);
        if (coVar.f27034h == C11336cp.HTML || coVar.f27034h == C11336cp.JAVASCRIPT) {
            this.f27079c = new C11374dv(coVar.f27028b);
        } else {
            this.f27079c = new C11375dw(Collections.unmodifiableMap(coVar.f27030d), coVar.f27031e);
        }
        this.f27079c.mo69813a();
        C11351dd.m31050a().f27111a.add(this);
        C11372du duVar = this.f27079c;
        C11356dh a = C11356dh.m31057a();
        WebView c = duVar.mo69822c();
        JSONObject jSONObject = new JSONObject();
        C11365do.m31083a(jSONObject, "impressionOwner", cnVar.f27022a);
        C11365do.m31083a(jSONObject, "mediaEventsOwner", cnVar.f27023b);
        C11365do.m31083a(jSONObject, StaticResource.CREATIVE_TYPE, cnVar.f27025d);
        C11365do.m31083a(jSONObject, "impressionType", cnVar.f27026e);
        C11365do.m31083a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(cnVar.f27024c));
        a.mo69806a(c, "init", jSONObject);
    }

    /* renamed from: a */
    public final void mo69779a() {
        if (!this.f27080d) {
            this.f27080d = true;
            C11351dd a = C11351dd.m31050a();
            boolean b = a.mo69793b();
            a.f27112b.add(this);
            if (!b) {
                C11358di a2 = C11358di.m31067a();
                C11352de.m31052a().f27116c = a2;
                C11352de a3 = C11352de.m31052a();
                a3.f27114a = true;
                a3.f27115b = false;
                a3.mo69794b();
                C11377dx.m31113a();
                C11377dx.m31117b();
                C11330cj cjVar = a2.f27129b;
                cjVar.f27017b = cjVar.mo69776a();
                cjVar.mo69777b();
                cjVar.f27016a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, cjVar);
            }
            this.f27079c.mo69814a(C11358di.m31067a().f27128a);
            this.f27079c.mo69816a(this, this.f27085j);
        }
    }

    /* renamed from: a */
    public final void mo69781a(C11338cr crVar, String str) {
        if (!this.f27081e) {
            C11368dq.m31091a((Object) crVar, "Error type is null");
            C11368dq.m31092a(str, "Message is null");
            C11372du duVar = this.f27079c;
            C11356dh.m31057a().mo69806a(duVar.mo69822c(), "error", crVar.toString(), str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: a */
    public final void mo69780a(View view) {
        if (!this.f27081e) {
            C11368dq.m31091a((Object) view, "AdView is null");
            if (mo69788c() != view) {
                m31041b(view);
                this.f27079c.mo69823d();
                Collection<T> unmodifiableCollection = Collections.unmodifiableCollection(C11351dd.m31050a().f27111a);
                if (unmodifiableCollection != null && !unmodifiableCollection.isEmpty()) {
                    for (T t : unmodifiableCollection) {
                        if (t != this && t.mo69788c() == view) {
                            t.f27086k.clear();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo69782b() {
        if (!this.f27081e) {
            this.f27086k.clear();
            if (!this.f27081e) {
                this.f27078b.clear();
            }
            this.f27081e = true;
            C11356dh.m31057a().mo69806a(this.f27079c.mo69822c(), "finishSession", new Object[0]);
            C11351dd a = C11351dd.m31050a();
            boolean b = a.mo69793b();
            a.f27111a.remove(this);
            a.f27112b.remove(this);
            if (b && !a.mo69793b()) {
                C11358di a2 = C11358di.m31067a();
                C11377dx a3 = C11377dx.m31113a();
                C11377dx.m31119c();
                a3.f27162b.clear();
                C11377dx.f27157a.post(new Runnable() {
                    public final void run() {
                        C11377dx.this.f27166h.mo69840b();
                    }
                });
                C11352de a4 = C11352de.m31052a();
                a4.f27114a = false;
                a4.f27115b = false;
                a4.f27116c = null;
                C11330cj cjVar = a2.f27129b;
                cjVar.f27016a.getContentResolver().unregisterContentObserver(cjVar);
            }
            this.f27079c.mo69821b();
            this.f27079c = null;
        }
    }
}
