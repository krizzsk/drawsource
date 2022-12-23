package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.p093b.C2552c;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.utils.C2923x;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3703x;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3541d;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3545e;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3546f;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3556m;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.dislike.C3716b;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p178l.C3885n;
import com.bytedance.sdk.openadsdk.p178l.C3893s;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import com.com.bytedance.overseas.sdk.p185a.C3968c;
import com.com.bytedance.overseas.sdk.p185a.C3969d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.bannerexpress.a */
/* compiled from: TTBannerExpressAdImpl */
public class C3378a extends C3556m implements C2923x.C2924a {

    /* renamed from: a */
    protected BannerExpressView f8135a;

    /* renamed from: b */
    protected final Context f8136b;

    /* renamed from: c */
    protected C3431n f8137c;

    /* renamed from: d */
    protected AdSlot f8138d;

    /* renamed from: e */
    protected TTNativeExpressAd.ExpressAdInteractionListener f8139e;

    /* renamed from: f */
    TTDislikeDialogAbstract f8140f;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3716b f8141h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C3968c f8142i;

    /* renamed from: j */
    private C2923x f8143j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f8144k;

    /* renamed from: l */
    private int f8145l = 0;

    /* renamed from: m */
    private TTAdDislike.DislikeInteractionCallback f8146m;

    /* renamed from: n */
    private Context f8147n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Queue<Long> f8148o = new LinkedList();

    /* renamed from: p */
    private boolean f8149p;

    /* renamed from: q */
    private boolean f8150q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Double f8151r = null;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f8152s = "banner_ad";
    /* access modifiers changed from: private */

    /* renamed from: t */
    public NativeExpressView f8153t;

    /* renamed from: com.bytedance.sdk.openadsdk.core.bannerexpress.a$a */
    /* compiled from: TTBannerExpressAdImpl */
    public interface C3385a {
        /* renamed from: a */
        void mo19360a();
    }

    public C3378a(Context context, C3431n nVar, AdSlot adSlot) {
        this.f8136b = context;
        this.f8137c = nVar;
        this.f8138d = adSlot;
        mo19356a(context, nVar, adSlot);
    }

    /* renamed from: a */
    public void mo19356a(Context context, C3431n nVar, AdSlot adSlot) {
        BannerExpressView bannerExpressView = new BannerExpressView(context, nVar, adSlot);
        this.f8135a = bannerExpressView;
        mo19357a(bannerExpressView.getCurView(), this.f8137c);
    }

    public View getExpressAdView() {
        return this.f8135a;
    }

    public int getImageMode() {
        C3431n nVar = this.f8137c;
        if (nVar == null) {
            return -1;
        }
        return nVar.mo19570ad();
    }

    public List<FilterWord> getFilterWords() {
        C3431n nVar = this.f8137c;
        if (nVar == null) {
            return null;
        }
        return nVar.mo19571ae();
    }

    public void setExpressInteractionListener(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        this.f8139e = expressAdInteractionListener;
        this.f8135a.setExpressInteractionListener(expressAdInteractionListener);
    }

    public void setExpressInteractionListener(TTNativeExpressAd.AdInteractionListener adInteractionListener) {
        this.f8139e = adInteractionListener;
        this.f8135a.setExpressInteractionListener(adInteractionListener);
    }

    public int getInteractionType() {
        C3431n nVar = this.f8137c;
        if (nVar == null) {
            return -1;
        }
        return nVar.mo19519L();
    }

    public void render() {
        this.f8135a.mo19341b();
    }

    public void destroy() {
        BannerExpressView bannerExpressView = this.f8135a;
        if (bannerExpressView != null) {
            bannerExpressView.mo19342c();
        }
        m10054c();
    }

    public void setDislikeCallback(Activity activity, TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        if (dislikeInteractionCallback != null && activity != null) {
            this.f8146m = dislikeInteractionCallback;
            m10045a(activity, dislikeInteractionCallback);
        }
    }

    public void setDislikeDialog(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        if (tTDislikeDialogAbstract == null) {
            C2905l.m8110b("dialog is null, please check");
            return;
        }
        this.f8140f = tTDislikeDialogAbstract;
        tTDislikeDialogAbstract.setMaterialMeta(this.f8137c);
        BannerExpressView bannerExpressView = this.f8135a;
        if (bannerExpressView != null && bannerExpressView.getCurView() != null) {
            this.f8135a.getCurView().setOuterDislike(tTDislikeDialogAbstract);
        }
    }

    /* renamed from: a */
    private void m10045a(Activity activity, TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        if (this.f8141h == null) {
            this.f8141h = new C3716b(activity, this.f8137c);
        }
        this.f8147n = activity;
        this.f8141h.setDislikeInteractionCallback(dislikeInteractionCallback);
        BannerExpressView bannerExpressView = this.f8135a;
        if (bannerExpressView != null && bannerExpressView.getCurView() != null) {
            this.f8135a.getCurView().setDislike(this.f8141h);
        }
    }

    /* renamed from: a */
    private C3968c m10044a(C3431n nVar) {
        if (nVar.mo19519L() == 4) {
            return C3969d.m13089a(this.f8136b, nVar, this.f8152s);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10052b(C3431n nVar) {
        if (this.f8135a.getNextView() != null && this.f8135a.mo19345f()) {
            m10053b(this.f8135a.getNextView(), nVar);
            mo19357a(this.f8135a.getNextView(), nVar);
        }
    }

    /* renamed from: b */
    private void m10053b(NativeExpressView nativeExpressView, C3431n nVar) {
        if (nativeExpressView != null && nVar != null) {
            if (this.f8146m != null) {
                this.f8141h.mo20493a(nVar);
                if (nativeExpressView != null) {
                    nativeExpressView.setDislike(this.f8141h);
                }
            }
            TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f8140f;
            if (tTDislikeDialogAbstract != null) {
                tTDislikeDialogAbstract.setMaterialMeta(nVar);
                if (nativeExpressView != null) {
                    nativeExpressView.setOuterDislike(this.f8140f);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19357a(final NativeExpressView nativeExpressView, C3431n nVar) {
        if (nativeExpressView != null && nVar != null) {
            this.f8137c = nVar;
            this.f8142i = m10044a(nVar);
            this.f8153t = nativeExpressView;
            final String a = C3885n.m12675a();
            final C3385a a2 = mo19355a();
            nativeExpressView.setClosedListenerKey(a);
            nativeExpressView.setBannerClickClosedListener(a2);
            nativeExpressView.setBackupListener(new C2552c() {
                /* renamed from: a */
                public boolean mo16640a(ViewGroup viewGroup, int i) {
                    try {
                        nativeExpressView.mo20038m();
                        BannerExpressBackupView bannerExpressBackupView = new BannerExpressBackupView(nativeExpressView.getContext());
                        bannerExpressBackupView.setClosedListenerKey(a);
                        bannerExpressBackupView.mo19329a(C3378a.this.f8137c, nativeExpressView, C3378a.this.f8142i);
                        bannerExpressBackupView.setDislikeInner(C3378a.this.f8141h);
                        bannerExpressBackupView.setDislikeOuter(C3378a.this.f8140f);
                        return true;
                    } catch (Exception unused) {
                        return false;
                    }
                }
            });
            C3090e.m8903a(nVar);
            EmptyView a3 = m10041a((ViewGroup) nativeExpressView);
            if (a3 == null) {
                a3 = new EmptyView(this.f8136b, nativeExpressView);
                nativeExpressView.addView(a3);
            }
            final C3431n nVar2 = nVar;
            final EmptyView emptyView = a3;
            final NativeExpressView nativeExpressView2 = nativeExpressView;
            a3.setCallback(new EmptyView.C3332a() {
                /* renamed from: a */
                public void mo19273a(boolean z) {
                    if (z) {
                        C3378a.this.m10050b();
                        C2905l.m8111b("TTBannerExpressAd", "Get focus, start timing");
                    } else {
                        C3378a.this.m10054c();
                        C2905l.m8111b("TTBannerExpressAd", "Lose focus, stop timing");
                    }
                    C2882e.m8039b().execute(new C3386b(z, nVar2, C3378a.this));
                }

                /* renamed from: a */
                public void mo19271a() {
                    C3378a.this.m10050b();
                }

                /* renamed from: b */
                public void mo19274b() {
                    if (C3378a.this.f8135a != null) {
                        EmptyView emptyView = emptyView;
                        C3378a aVar = C3378a.this;
                        if (emptyView == aVar.m10041a((ViewGroup) aVar.f8135a.getCurView())) {
                            C3378a.this.m10054c();
                        }
                    }
                    C3378a.this.m10056c(nVar2);
                }

                /* renamed from: a */
                public void mo19272a(View view) {
                    C3457h.m10580d().mo19745a(a, a2);
                    C2905l.m8111b("TTBannerExpressAd", "ExpressView SHOW");
                    if (C3378a.this.f8148o != null) {
                        C3378a.this.f8148o.offer(Long.valueOf(System.currentTimeMillis()));
                    }
                    HashMap hashMap = new HashMap();
                    NativeExpressView nativeExpressView = nativeExpressView2;
                    if (nativeExpressView != null) {
                        hashMap.put("dynamic_show_type", Integer.valueOf(nativeExpressView.getDynamicShowType()));
                    }
                    if (view != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("width", view.getWidth());
                            jSONObject.put("height", view.getHeight());
                            jSONObject.put("alpha", (double) view.getAlpha());
                        } catch (Throwable unused) {
                        }
                        hashMap.put("root_view", jSONObject.toString());
                    }
                    C3090e.m8899a(C3378a.this.f8136b, nVar2, C3378a.this.f8152s, (Map<String, Object>) hashMap, C3378a.this.f8151r);
                    if (C3378a.this.f8139e != null) {
                        C3378a.this.f8139e.onAdShow(view, nVar2.mo19519L());
                    }
                    if (nVar2.mo19575ai()) {
                        C3898x.m12759a(nVar2, view);
                    }
                    C3378a.this.m10050b();
                    if (!(C3378a.this.f8963g.getAndSet(true) || C3378a.this.f8135a == null || C3378a.this.f8135a.getCurView() == null || C3378a.this.f8135a.getCurView().getWebView() == null)) {
                        C3904y.m12850a(C3378a.this.f8136b, C3378a.this.f8137c, C3378a.this.f8152s, C3378a.this.f8135a.getCurView().getWebView().getWebView());
                    }
                    if (C3378a.this.f8135a != null && C3378a.this.f8135a.getCurView() != null) {
                        C3378a.this.f8135a.getCurView().mo20036k();
                        C3378a.this.f8135a.getCurView().mo20034i();
                    }
                }
            });
            C3546f fVar = new C3546f(this.f8136b, nVar, this.f8152s, 2);
            fVar.mo19305a((View) nativeExpressView);
            fVar.mo19308a((TTNativeExpressAd) this);
            fVar.mo19311a(this.f8142i);
            nativeExpressView.setClickListener(fVar);
            C3545e eVar = new C3545e(this.f8136b, nVar, this.f8152s, 2);
            eVar.mo19305a((View) nativeExpressView);
            eVar.mo19308a((TTNativeExpressAd) this);
            eVar.mo19311a(this.f8142i);
            nativeExpressView.setClickCreativeListener(eVar);
            a3.setNeedCheckingShow(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10050b() {
        C2923x xVar = this.f8143j;
        if (xVar != null) {
            xVar.removeCallbacksAndMessages((Object) null);
            this.f8143j.sendEmptyMessageDelayed(112202, 1000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m10054c() {
        C2923x xVar = this.f8143j;
        if (xVar != null) {
            xVar.removeCallbacksAndMessages((Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m10056c(C3431n nVar) {
        Queue<Long> queue = this.f8148o;
        if (queue != null && queue.size() > 0 && nVar != null) {
            try {
                long longValue = this.f8148o.poll().longValue();
                if (longValue > 0 && this.f8153t != null) {
                    C3090e.m8913a((System.currentTimeMillis() - longValue) + "", nVar, this.f8152s, this.f8153t.getAdShowTime());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.bannerexpress.a$b */
    /* compiled from: TTBannerExpressAdImpl */
    private static class C3386b implements Runnable {

        /* renamed from: a */
        boolean f8167a;

        /* renamed from: b */
        C3431n f8168b;

        /* renamed from: c */
        WeakReference<C3378a> f8169c;

        C3386b(boolean z, C3431n nVar, C3378a aVar) {
            this.f8167a = z;
            this.f8168b = nVar;
            this.f8169c = new WeakReference<>(aVar);
        }

        public void run() {
            WeakReference<C3378a> weakReference = this.f8169c;
            if (weakReference != null && weakReference.get() != null) {
                ((C3378a) this.f8169c.get()).m10048a(this.f8167a, this.f8168b);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10048a(boolean z, C3431n nVar) {
        Long poll;
        if (z) {
            try {
                this.f8148o.offer(Long.valueOf(System.currentTimeMillis()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (this.f8148o.size() > 0 && this.f8153t != null && (poll = this.f8148o.poll()) != null) {
            long longValue = poll.longValue();
            C3090e.m8913a((System.currentTimeMillis() - longValue) + "", nVar, this.f8152s, this.f8153t.getAdShowTime());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public EmptyView m10041a(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        int i = 0;
        while (i < viewGroup.getChildCount()) {
            try {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof EmptyView) {
                    return (EmptyView) childAt;
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Map<String, Object> getMediaExtraInfo() {
        C3431n nVar = this.f8137c;
        if (nVar != null) {
            return nVar.mo19576aj();
        }
        return null;
    }

    public String getAdCreativeToken() {
        return this.f8137c.mo19640n();
    }

    public void setSlideIntervalTime(int i) {
        if (i > 0) {
            this.f8152s = "slide_banner_ad";
            mo19357a(this.f8135a.getCurView(), this.f8137c);
            this.f8135a.setDuration(1000);
            if (i < 30000) {
                i = 30000;
            } else if (i > 120000) {
                i = 120000;
            }
            this.f8144k = i;
            this.f8143j = new C2923x(Looper.getMainLooper(), this);
            this.f8138d.setIsRotateBanner(1);
            this.f8138d.setRotateTime(this.f8144k);
            this.f8138d.setRotateOrder(1);
        }
    }

    /* renamed from: d */
    private void m10057d() {
        C3541d.m11124a(this.f8136b).mo20090a(this.f8138d, 1, (TTAdNative.NativeExpressAdListener) null, new C3541d.C3544a() {
            /* renamed from: a */
            public void mo19359a(List<C3431n> list) {
                if (list == null || list.isEmpty()) {
                    C3378a.this.m10050b();
                    return;
                }
                C3431n nVar = list.get(0);
                C3378a.this.f8135a.mo19338a(nVar, C3378a.this.f8138d);
                C3378a.this.m10052b(nVar);
                C3378a.this.f8135a.mo19343d();
            }

            /* renamed from: a */
            public void mo19358a() {
                C3378a.this.m10050b();
            }
        }, 5000);
    }

    /* renamed from: a */
    public void mo17240a(Message message) {
        if (message.what == 112202) {
            if (C3703x.m12105a(this.f8135a, 50, 1)) {
                this.f8145l += 1000;
            }
            if (this.f8145l >= this.f8144k) {
                m10057d();
                AdSlot adSlot = this.f8138d;
                adSlot.setRotateOrder(adSlot.getRotateOrder() + 1);
                this.f8145l = 0;
                m10054c();
                return;
            }
            m10050b();
        }
    }

    public void win(Double d) {
        if (!this.f8149p) {
            C3893s.m12718a(this.f8137c, d);
            this.f8149p = true;
        }
    }

    public void loss(Double d, String str, String str2) {
        if (!this.f8150q) {
            C3893s.m12719a(this.f8137c, d, str, str2);
            this.f8150q = true;
        }
    }

    public void setPrice(Double d) {
        this.f8151r = d;
    }

    /* renamed from: a */
    public C3385a mo19355a() {
        return new C3385a() {
            /* renamed from: a */
            public void mo19360a() {
                View view;
                int width = C3378a.this.f8153t.getWidth();
                int height = C3378a.this.f8153t.getHeight();
                if (((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d)) {
                    view = LayoutInflater.from(C3378a.this.f8136b).inflate(C2914t.m8159f(C3378a.this.f8136b, "tt_banner_ad_closed_300_250"), (ViewGroup) null, false);
                } else {
                    view = LayoutInflater.from(C3378a.this.f8136b).inflate(C2914t.m8159f(C3378a.this.f8136b, "tt_banner_ad_closed_320_50"), (ViewGroup) null, false);
                }
                C3378a aVar = C3378a.this;
                EmptyView a = aVar.m10041a((ViewGroup) aVar.f8153t);
                C3378a.this.f8153t.removeAllViews();
                C3378a.this.f8153t.addView(view, new ViewGroup.LayoutParams(width, height));
                view.findViewById(C2914t.m8158e(C3378a.this.f8136b, "tt_ad_closed_page_logo")).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        TTWebsiteActivity.m8711a(C3378a.this.f8136b, C3378a.this.f8137c, C3378a.this.f8152s);
                    }
                });
                TextView textView = (TextView) view.findViewById(C2914t.m8158e(C3378a.this.f8136b, "tt_ad_closed_text"));
                textView.setText(C2914t.m8151a(C3378a.this.f8136b, "tt_ad_is_closed"));
                textView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        TTWebsiteActivity.m8711a(C3378a.this.f8136b, C3378a.this.f8137c, C3378a.this.f8152s);
                    }
                });
                C3378a.this.f8153t.setClickCreativeListener((C3545e) null);
                C3378a.this.f8153t.setClickListener((C3546f) null);
                if (C3513m.m10973h().mo19871n() == 1) {
                    C3378a.this.m10054c();
                } else if (C3378a.this.f8144k != 0) {
                    C3378a.this.f8153t.addView(a);
                }
            }
        };
    }
}
