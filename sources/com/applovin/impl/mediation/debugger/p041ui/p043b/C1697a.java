package com.applovin.impl.mediation.debugger.p041ui.p043b;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.applovin.impl.adview.C1433a;
import com.applovin.impl.mediation.debugger.p041ui.C1678a;
import com.applovin.impl.mediation.debugger.p041ui.p043b.C1706b;
import com.applovin.impl.mediation.debugger.p041ui.p043b.p044a.C1704a;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1715a;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1717c;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1721d;
import com.applovin.impl.sdk.AppLovinContentProviderUtils;
import com.applovin.impl.sdk.C1798a;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.sdk.C2271R;
import com.google.android.exoplayer2.util.MimeTypes;

/* renamed from: com.applovin.impl.mediation.debugger.ui.b.a */
public class C1697a extends C1678a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C1706b f2488a;

    /* renamed from: b */
    private DataSetObserver f2489b;

    /* renamed from: c */
    private FrameLayout f2490c;

    /* renamed from: d */
    private ListView f2491d;

    /* renamed from: e */
    private C1433a f2492e;

    /* renamed from: a */
    private void m3516a() {
        Uri cacheJPEGImageWithFileName;
        Bitmap a = this.f2488a.mo13776a(this.f2491d);
        if (a != null && (cacheJPEGImageWithFileName = AppLovinContentProviderUtils.cacheJPEGImageWithFileName(a, "mediation_debugger_screenshot.jpeg")) != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(MimeTypes.IMAGE_JPEG);
            intent.putExtra("android.intent.extra.STREAM", cacheJPEGImageWithFileName);
            intent.addFlags(1);
            startActivity(Intent.createChooser(intent, "Share Mediation Debugger"));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3517a(final Context context) {
        if (StringUtils.isValidString(this.f2488a.mo13739g()) && !this.f2488a.mo13735c()) {
            this.f2488a.mo13734a(true);
            runOnUiThread(new Runnable() {
                public void run() {
                    Utils.showAlert(C1697a.this.f2488a.mo13738f(), C1697a.this.f2488a.mo13739g(), context);
                }
            });
        }
    }

    /* renamed from: b */
    private void m3522b() {
        m3524c();
        C1433a aVar = new C1433a(this, 50, 16842874);
        this.f2492e = aVar;
        aVar.setColor(-3355444);
        this.f2490c.addView(this.f2492e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f2490c.bringChildToFront(this.f2492e);
        this.f2492e.mo12955a();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m3524c() {
        C1433a aVar = this.f2492e;
        if (aVar != null) {
            aVar.mo12956b();
            this.f2490c.removeView(this.f2492e);
            this.f2492e = null;
        }
    }

    /* access modifiers changed from: protected */
    public C1969m getSdk() {
        C1706b bVar = this.f2488a;
        if (bVar != null) {
            return bVar.mo13736d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(C2271R.layout.list_view);
        this.f2490c = (FrameLayout) findViewById(16908290);
        this.f2491d = (ListView) findViewById(C2271R.C2273id.listView);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C2271R.C2275menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C1706b bVar = this.f2488a;
        if (bVar != null) {
            bVar.unregisterDataSetObserver(this.f2489b);
            this.f2488a.mo13777a((C1721d.C1723a) null);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C2271R.C2273id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        m3516a();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f2491d.setAdapter(this.f2488a);
        C1706b bVar = this.f2488a;
        if (bVar != null && !bVar.mo13704a()) {
            m3522b();
        }
    }

    public void setListAdapter(C1706b bVar, final C1798a aVar) {
        DataSetObserver dataSetObserver;
        C1706b bVar2 = this.f2488a;
        if (!(bVar2 == null || (dataSetObserver = this.f2489b) == null)) {
            bVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f2488a = bVar;
        this.f2489b = new DataSetObserver() {
            public void onChanged() {
                C1697a.this.m3524c();
                C1697a aVar = C1697a.this;
                aVar.m3517a((Context) aVar);
            }
        };
        m3517a((Context) this);
        this.f2488a.registerDataSetObserver(this.f2489b);
        this.f2488a.mo13777a((C1721d.C1723a) new C1721d.C1723a() {
            /* renamed from: a */
            public void mo13699a(C1715a aVar, final C1717c cVar) {
                C1697a aVar2;
                String str;
                String str2;
                int a = aVar.mo13748a();
                if (a == C1706b.C1709b.MAX.ordinal()) {
                    Utils.showAlert(cVar.mo13757l(), cVar.mo13758m(), C1697a.this);
                } else if (a == C1706b.C1709b.ADS.ordinal()) {
                    if (aVar.mo13749b() == C1706b.C1708a.AD_UNITS.ordinal()) {
                        if (C1697a.this.f2488a.mo13737e().size() > 0) {
                            C1697a.this.startActivity(MaxDebuggerAdUnitsListActivity.class, aVar, new C1678a.C1680a<MaxDebuggerAdUnitsListActivity>() {
                                /* renamed from: a */
                                public void mo13696a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                                    maxDebuggerAdUnitsListActivity.initialize(C1697a.this.f2488a.mo13737e(), C1697a.this.f2488a.mo13736d());
                                }
                            });
                            return;
                        }
                        aVar2 = C1697a.this;
                        str = "No live ad units";
                        str2 = "Please setup or enable your MAX ad units on https://applovin.com.";
                    } else if (aVar.mo13749b() != C1706b.C1708a.SELECT_LIVE_NETWORKS.ordinal()) {
                        return;
                    } else {
                        if (C1697a.this.f2488a.mo13740h().size() <= 0 && C1697a.this.f2488a.mo13741i().size() <= 0) {
                            aVar2 = C1697a.this;
                            str = "Complete Integrations";
                            str2 = "Please complete integrations in order to access this.";
                        } else if (C1697a.this.f2488a.mo13736d().mo14518J().mo13806a()) {
                            Utils.showAlert("Restart Required", cVar.mo13758m(), C1697a.this);
                            return;
                        } else {
                            C1697a.this.startActivity(MaxDebuggerTestLiveNetworkActivity.class, aVar, new C1678a.C1680a<MaxDebuggerTestLiveNetworkActivity>() {
                                /* renamed from: a */
                                public void mo13696a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                                    maxDebuggerTestLiveNetworkActivity.initialize(C1697a.this.f2488a.mo13740h(), C1697a.this.f2488a.mo13741i(), C1697a.this.f2488a.mo13736d());
                                }
                            });
                            return;
                        }
                    }
                    Utils.showAlert(str, str2, aVar2);
                } else if ((a == C1706b.C1709b.INCOMPLETE_NETWORKS.ordinal() || a == C1706b.C1709b.COMPLETED_NETWORKS.ordinal()) && (cVar instanceof C1704a)) {
                    C1697a.this.startActivity(MaxDebuggerDetailActivity.class, aVar, new C1678a.C1680a<MaxDebuggerDetailActivity>() {
                        /* renamed from: a */
                        public void mo13696a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                            maxDebuggerDetailActivity.initialize(((C1704a) cVar).mo13726d());
                        }
                    });
                }
            }
        });
    }
}
