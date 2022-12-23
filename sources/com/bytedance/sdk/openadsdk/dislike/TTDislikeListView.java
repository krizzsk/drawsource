package com.bytedance.sdk.openadsdk.dislike;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.bannerexpress.C3378a;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3912a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3917a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p180a.C3921e;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181b.C3931b;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import java.util.ArrayList;
import java.util.List;

public class TTDislikeListView extends ListView {

    /* renamed from: a */
    protected IListenerManager f9620a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3431n f9621b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AdapterView.OnItemClickListener f9622c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f9623d;

    /* renamed from: e */
    private AdapterView.OnItemClickListener f9624e = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (TTDislikeListView.this.getAdapter() == null || TTDislikeListView.this.getAdapter().getItem(i) == null || !(TTDislikeListView.this.getAdapter().getItem(i) instanceof FilterWord)) {
                throw new IllegalArgumentException("Adapter data is abnormal, it must be FilterWord");
            }
            FilterWord filterWord = (FilterWord) TTDislikeListView.this.getAdapter().getItem(i);
            if (!filterWord.hasSecondOptions()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(filterWord);
                if (TTDislikeListView.this.f9621b != null) {
                    C3090e.m8911a(TTDislikeListView.this.f9621b, (List<FilterWord>) arrayList);
                }
                if (!TextUtils.isEmpty(TTDislikeListView.this.f9623d)) {
                    if (C3948b.m12959c()) {
                        TTDislikeListView.this.m12150a("onItemClickClosed");
                    } else {
                        C3378a.C3385a e = C3457h.m10580d().mo19760e(TTDislikeListView.this.f9623d);
                        if (e != null) {
                            e.mo19360a();
                            C3457h.m10580d().mo19766f(TTDislikeListView.this.f9623d);
                        }
                    }
                }
            }
            try {
                if (TTDislikeListView.this.f9622c != null) {
                    TTDislikeListView.this.f9622c.onItemClick(adapterView, view, i, j);
                }
            } catch (Throwable unused) {
            }
        }
    };

    public TTDislikeListView(Context context) {
        super(context);
        m12146a();
    }

    public TTDislikeListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12146a();
    }

    public TTDislikeListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12146a();
    }

    public void setMaterialMeta(C3431n nVar) {
        this.f9621b = nVar;
    }

    /* renamed from: a */
    private void m12146a() {
        super.setOnItemClickListener(this.f9624e);
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f9622c = onItemClickListener;
    }

    public void setClosedListenerKey(String str) {
        this.f9623d = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12150a(final String str) {
        C2882e.m8044c(new C2885g("Reward_executeMultiProcessCallback") {
            public void run() {
                try {
                    if (!TextUtils.isEmpty(TTDislikeListView.this.f9623d)) {
                        TTDislikeListView.this.mo20484a(6).executeDisLikeClosedCallback(TTDislikeListView.this.f9623d, str);
                    }
                } catch (Throwable th) {
                    C2905l.m8115c("TTDislikeListView", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IListenerManager mo20484a(int i) {
        if (this.f9620a == null) {
            this.f9620a = C3917a.asInterface(C3912a.m12924a(C3513m.m10963a()).mo20782a(i));
        }
        return this.f9620a;
    }

    /* renamed from: a */
    public static void m12148a(final int i, final String str, final C3378a.C3385a aVar) {
        if (C3948b.m12959c()) {
            C2882e.m8044c(new C2885g("DislikeClosed_registerMultiProcessListener") {
                public void run() {
                    C3912a a = C3912a.m12924a(C3513m.m10963a());
                    if (i == 6 && aVar != null) {
                        try {
                            C2905l.m8111b("TTDislikeListView", "start registerDislikeClickCloseListener ! ");
                            C3931b bVar = new C3931b(str, aVar);
                            IListenerManager asInterface = C3921e.asInterface(a.mo20782a(6));
                            if (asInterface != null) {
                                asInterface.registerDisLikeClosedListener(str, bVar);
                                C2905l.m8111b("TTDislikeListView", "end registerDislikeClickCloseListener ! ");
                            }
                        } catch (RemoteException e) {
                            e.printStackTrace();
                            C2905l.m8111b("TTDislikeListView", "multiProcess registerDislikeClickCloseListener error");
                        }
                    }
                }
            }, 5);
        }
    }

    /* renamed from: a */
    public static void m12147a(final int i, final String str) {
        if (C3948b.m12959c()) {
            C2882e.m8044c(new C2885g("DislikeClosed_unregisterMultiProcessListener") {
                public void run() {
                    C3912a a = C3912a.m12924a(C3513m.m10963a());
                    if (i == 6) {
                        try {
                            C2905l.m8111b("TTDislikeListView", "start unregisterDislikeClickCloseListener ! ");
                            IListenerManager asInterface = C3921e.asInterface(a.mo20782a(6));
                            if (asInterface != null) {
                                asInterface.unregisterDisLikeClosedListener(str);
                                C2905l.m8111b("TTDislikeListView", "end unregisterDislikeClickCloseListener ! ");
                            }
                        } catch (RemoteException unused) {
                            C2905l.m8111b("TTDislikeListView", "multiProcess unregisterMultiProcessListener error");
                        }
                    }
                }
            }, 5);
        }
    }
}
