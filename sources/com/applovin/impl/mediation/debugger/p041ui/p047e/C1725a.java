package com.applovin.impl.mediation.debugger.p041ui.p047e;

import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.p037b.p038a.C1668d;
import com.applovin.impl.mediation.debugger.p041ui.C1678a;
import com.applovin.impl.mediation.debugger.p041ui.p043b.p044a.C1704a;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1715a;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1717c;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1721d;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1724e;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.C2271R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.e.a */
public class C1725a extends C1678a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C1969m f2608a;

    /* renamed from: b */
    private List<C1668d> f2609b;

    /* renamed from: c */
    private List<C1668d> f2610c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1721d f2611d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<C1717c> f2612e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List<C1717c> f2613f;

    /* renamed from: g */
    private ListView f2614g;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.e.a$a */
    enum C1729a {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public C1725a() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C1668d m3644a(C1715a aVar) {
        return (aVar.mo13748a() == C1729a.BIDDERS.ordinal() ? this.f2609b : this.f2610c).get(aVar.mo13749b());
    }

    /* renamed from: a */
    private List<C1717c> m3647a(List<C1668d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (final C1668d next : list) {
            arrayList.add(new C1704a(next.mo13641c(), this) {
                /* renamed from: f */
                public int mo13728f() {
                    if (C1725a.this.f2608a.mo14518J().mo13809c() == null || !C1725a.this.f2608a.mo14518J().mo13809c().equals(next.mo13639a())) {
                        return 0;
                    }
                    return C2271R.C2272drawable.applovin_ic_check_mark_borderless;
                }

                /* renamed from: g */
                public int mo13729g() {
                    if (C1725a.this.f2608a.mo14518J().mo13809c() == null || !C1725a.this.f2608a.mo14518J().mo13809c().equals(next.mo13639a())) {
                        return super.mo13729g();
                    }
                    return -16776961;
                }

                /* renamed from: k */
                public SpannedString mo13756k() {
                    return StringUtils.createSpannedString(next.mo13640b(), mo13709b() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
                }
            });
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public C1969m getSdk() {
        return this.f2608a;
    }

    public void initialize(List<C1668d> list, List<C1668d> list2, final C1969m mVar) {
        this.f2608a = mVar;
        this.f2609b = list;
        this.f2610c = list2;
        this.f2612e = m3647a(list);
        this.f2613f = m3647a(list2);
        C17261 r1 = new C1721d(this) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo13703a(int i) {
                return (i == C1729a.BIDDERS.ordinal() ? C1725a.this.f2612e : C1725a.this.f2613f).size();
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public int mo13705b() {
                return C1729a.COUNT.ordinal();
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public C1717c mo13706b(int i) {
                return i == C1729a.BIDDERS.ordinal() ? new C1724e("BIDDERS") : new C1724e("WATERFALL");
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public List<C1717c> mo13707c(int i) {
                return i == C1729a.BIDDERS.ordinal() ? C1725a.this.f2612e : C1725a.this.f2613f;
            }

            /* access modifiers changed from: protected */
            /* renamed from: k */
            public C1717c mo13788k() {
                return new C1717c.C1719a(C1717c.C1720b.SECTION_CENTERED).mo13764a("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").mo13766a();
            }
        };
        this.f2611d = r1;
        r1.mo13777a((C1721d.C1723a) new C1721d.C1723a() {
            /* renamed from: a */
            public void mo13699a(C1715a aVar, C1717c cVar) {
                String a = C1725a.this.m3644a(aVar).mo13639a();
                if (!StringUtils.isValidString(a) || !StringUtils.isValidString(mVar.mo14518J().mo13809c()) || !a.equals(mVar.mo14518J().mo13809c())) {
                    mVar.mo14518J().mo13805a(true);
                    mVar.mo14518J().mo13803a(a);
                } else {
                    mVar.mo14518J().mo13805a(false);
                    mVar.mo14518J().mo13803a((String) null);
                }
                C1725a.this.f2611d.notifyDataSetChanged();
            }
        });
        this.f2611d.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(C2271R.layout.list_view);
        ListView listView = (ListView) findViewById(C2271R.C2273id.listView);
        this.f2614g = listView;
        listView.setAdapter(this.f2611d);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f2612e = m3647a(this.f2609b);
        this.f2613f = m3647a(this.f2610c);
        this.f2611d.mo13787j();
    }
}
