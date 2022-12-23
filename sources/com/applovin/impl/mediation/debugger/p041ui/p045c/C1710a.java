package com.applovin.impl.mediation.debugger.p041ui.p045c;

import android.os.Bundle;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.p037b.p039b.C1671b;
import com.applovin.impl.mediation.debugger.p041ui.C1678a;
import com.applovin.impl.mediation.debugger.p041ui.p045c.C1713b;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1715a;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1717c;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1721d;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.C2271R;

/* renamed from: com.applovin.impl.mediation.debugger.ui.c.a */
public class C1710a extends C1678a {

    /* renamed from: a */
    private C1713b f2541a;

    /* renamed from: b */
    private ListView f2542b;

    public C1710a() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    /* access modifiers changed from: protected */
    public C1969m getSdk() {
        C1713b bVar = this.f2541a;
        if (bVar != null) {
            return bVar.mo13704a().mo13674v();
        }
        return null;
    }

    public void initialize(final C1671b bVar) {
        setTitle(bVar.mo13660i());
        C1713b bVar2 = new C1713b(bVar, this);
        this.f2541a = bVar2;
        bVar2.mo13777a((C1721d.C1723a) new C1721d.C1723a() {
            /* renamed from: a */
            public void mo13699a(C1715a aVar, C1717c cVar) {
                if (aVar.mo13748a() == C1713b.C1714a.TEST_ADS.ordinal()) {
                    C1969m v = bVar.mo13674v();
                    C1671b.C1673b c = bVar.mo13653c();
                    if (C1671b.C1673b.READY == c) {
                        C1710a.this.startActivity(MaxDebuggerMultiAdActivity.class, v.mo14556af(), new C1678a.C1680a<MaxDebuggerMultiAdActivity>() {
                            /* renamed from: a */
                            public void mo13696a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                                maxDebuggerMultiAdActivity.initialize(bVar);
                            }
                        });
                        return;
                    } else if (C1671b.C1673b.DISABLED == c) {
                        v.mo14518J().mo13810d();
                        Utils.showAlert("Restart Required", cVar.mo13758m(), C1710a.this);
                        return;
                    }
                }
                Utils.showAlert("Instructions", cVar.mo13758m(), C1710a.this);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2271R.layout.list_view);
        ListView listView = (ListView) findViewById(C2271R.C2273id.listView);
        this.f2542b = listView;
        listView.setAdapter(this.f2541a);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f2541a.mo13704a().mo13664m().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f2541a.mo13746c();
            this.f2541a.mo13787j();
        }
    }
}
