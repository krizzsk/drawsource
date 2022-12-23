package com.applovin.impl.mediation.debugger.p041ui.p042a;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.mediation.debugger.p037b.p038a.C1665a;
import com.applovin.impl.mediation.debugger.p037b.p038a.C1666b;
import com.applovin.impl.mediation.debugger.p041ui.C1678a;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1715a;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1717c;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1721d;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1724e;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.sdk.C2271R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.a.c */
public class C1690c extends C1678a {

    /* renamed from: a */
    private List<C1665a> f2470a;

    /* renamed from: b */
    private C1969m f2471b;

    /* renamed from: c */
    private C1721d f2472c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<C1717c> f2473d;

    /* renamed from: e */
    private ListView f2474e;

    /* renamed from: a */
    private List<C1717c> m3507a(List<C1665a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C1665a next : list) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(next.mo13622a(), ViewCompat.MEASURED_STATE_MASK));
            spannableStringBuilder.append(new SpannedString("\n"));
            spannableStringBuilder.append(StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(next.mo13624c(), ViewCompat.MEASURED_STATE_MASK));
            arrayList.add(C1717c.m3600a(C1717c.C1720b.DETAIL).mo13763a(StringUtils.createSpannedString(next.mo13623b(), ViewCompat.MEASURED_STATE_MASK, 18, 1)).mo13768b(new SpannedString(spannableStringBuilder)).mo13762a((Context) this).mo13765a(true).mo13766a());
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public C1969m getSdk() {
        return this.f2471b;
    }

    public void initialize(final List<C1665a> list, final C1969m mVar) {
        this.f2470a = list;
        this.f2471b = mVar;
        this.f2473d = m3507a(list);
        C16911 r0 = new C1721d(this) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo13703a(int i) {
                return list.size();
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public int mo13705b() {
                return 1;
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public C1717c mo13706b(int i) {
                return new C1724e("");
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public List<C1717c> mo13707c(int i) {
                return C1690c.this.f2473d;
            }
        };
        this.f2472c = r0;
        r0.mo13777a((C1721d.C1723a) new C1721d.C1723a() {
            /* renamed from: a */
            public void mo13699a(final C1715a aVar, C1717c cVar) {
                C1690c.this.startActivity(MaxDebuggerAdUnitDetailActivity.class, mVar.mo14556af(), new C1678a.C1680a<MaxDebuggerAdUnitDetailActivity>() {
                    /* renamed from: a */
                    public void mo13696a(MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
                        maxDebuggerAdUnitDetailActivity.initialize((C1665a) list.get(aVar.mo13749b()), (C1666b) null, mVar);
                    }
                });
            }
        });
        this.f2472c.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Ad Units");
        setContentView(C2271R.layout.list_view);
        ListView listView = (ListView) findViewById(C2271R.C2273id.listView);
        this.f2474e = listView;
        listView.setAdapter(this.f2472c);
    }
}
