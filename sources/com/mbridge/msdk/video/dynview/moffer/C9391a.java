package com.mbridge.msdk.video.dynview.moffer;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.video.dynview.p354d.C9327f;
import com.mbridge.msdk.video.dynview.p360h.C9356b;
import com.mbridge.msdk.video.module.MBridgeNativeEndCardView;
import com.mbridge.msdk.video.module.p367a.C9473a;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.video.dynview.moffer.a */
/* compiled from: MOfferEnergize */
public class C9391a {

    /* renamed from: a */
    private static volatile C9391a f23102a;

    /* renamed from: b */
    private Map<String, SoftReference<MOfferModel>> f23103b = new ConcurrentHashMap();

    private C9391a() {
    }

    /* renamed from: a */
    public static C9391a m26760a() {
        C9391a aVar;
        if (f23102a != null) {
            return f23102a;
        }
        synchronized (C9391a.class) {
            if (f23102a == null) {
                f23102a = new C9391a();
            }
            aVar = f23102a;
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo62918a(CampaignEx campaignEx) {
        Map<String, SoftReference<MOfferModel>> map = this.f23103b;
        if (map != null && !map.containsKey(campaignEx.getRequestId())) {
            try {
                SoftReference softReference = new SoftReference(new MOfferModel());
                if (softReference.get() != null) {
                    ((MOfferModel) softReference.get()).bulidMofferAd(campaignEx);
                }
                this.f23103b.put(campaignEx.getRequestId(), softReference);
            } catch (Exception e) {
                C8672v.m24878d("MOfferEnergize", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public final void mo62917a(final ViewGroup viewGroup, String str, C9473a aVar) {
        SoftReference softReference;
        MOfferModel mOfferModel;
        Map<String, SoftReference<MOfferModel>> map = this.f23103b;
        if (map != null && map.containsKey(str) && (softReference = this.f23103b.get(str)) != null && softReference.get() != null && (mOfferModel = (MOfferModel) softReference.get()) != null) {
            mOfferModel.setMoreOfferListener(new C9327f() {
                /* renamed from: a */
                public final void mo62779a(int i, String str) {
                }

                /* renamed from: a */
                public final void mo62780a(ViewGroup viewGroup, CampaignUnit campaignUnit) {
                    RelativeLayout relativeLayout;
                    try {
                        if (viewGroup != null && viewGroup != null) {
                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                            }
                            layoutParams.addRule(12, -1);
                            viewGroup.setLayoutParams(layoutParams);
                            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeAllViews();
                            }
                            viewGroup.addView(viewGroup);
                            if (viewGroup != null && (viewGroup instanceof MBridgeNativeEndCardView)) {
                                if (((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess()) {
                                    relativeLayout = (RelativeLayout) viewGroup.findViewById(-1642631508);
                                } else {
                                    relativeLayout = (RelativeLayout) viewGroup.findViewById(C8658p.m24799a(C8388a.m23845e().mo56913g(), "mbridge_native_ec_layout", "id"));
                                }
                                new C9356b().mo62863a(relativeLayout, 0, C8677z.m24924b(C8388a.m23845e().mo56913g(), 100.0f), 500);
                            }
                            new C9356b().mo62862a(viewGroup, 0, C8677z.m24947h(C8388a.m23845e().mo56913g()), 0, C8677z.m24924b(C8388a.m23845e().mo56913g(), 90.0f), 0);
                            try {
                                if (viewGroup instanceof MBridgeNativeEndCardView) {
                                    ((MBridgeNativeEndCardView) viewGroup).setMoreOfferCampaignUnit(campaignUnit);
                                }
                            } catch (Throwable th) {
                                C8672v.m24874a("MOfferEnergize", th.getMessage());
                            }
                        }
                    } catch (Exception e) {
                        C8672v.m24874a("MOfferEnergize", e.getMessage());
                    }
                }
            }, aVar);
        }
    }

    /* renamed from: a */
    public final void mo62919a(CampaignEx campaignEx, final ViewGroup viewGroup, C9473a aVar) {
        MOfferModel mOfferModel = new MOfferModel();
        mOfferModel.bulidMofferAd(campaignEx);
        mOfferModel.setMoreOfferListener(new C9327f() {
            /* renamed from: a */
            public final void mo62779a(int i, String str) {
            }

            /* renamed from: a */
            public final void mo62780a(ViewGroup viewGroup, CampaignUnit campaignUnit) {
                RelativeLayout relativeLayout;
                try {
                    if (viewGroup != null && viewGroup != null) {
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
                        if (layoutParams == null) {
                            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                        }
                        layoutParams.addRule(12, -1);
                        viewGroup.setLayoutParams(layoutParams);
                        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeAllViews();
                        }
                        if (viewGroup != null) {
                            if (viewGroup instanceof MBridgeNativeEndCardView) {
                                if (((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess()) {
                                    relativeLayout = (RelativeLayout) viewGroup.findViewById(-1642631508);
                                } else {
                                    relativeLayout = (RelativeLayout) viewGroup.findViewById(C8658p.m24799a(C8388a.m23845e().mo56913g(), "mbridge_native_ec_layout", "id"));
                                }
                                new C9356b().mo62863a(relativeLayout, 0, C8677z.m24924b(C8388a.m23845e().mo56913g(), 100.0f), 500);
                            }
                            RelativeLayout relativeLayout2 = (RelativeLayout) viewGroup.findViewById(C8658p.m24799a(C8388a.m23845e().mo56913g(), "mbridge_reward_moreoffer_layout", "id"));
                            if (relativeLayout2 == null) {
                                relativeLayout2 = (RelativeLayout) viewGroup.findViewById(-82036151);
                            }
                            if (relativeLayout2 == null) {
                                viewGroup.addView(viewGroup);
                            } else if (viewGroup.isShown()) {
                                relativeLayout2.setVisibility(0);
                                relativeLayout2.addView(viewGroup);
                            }
                        }
                        new C9356b().mo62862a(viewGroup, 0, C8677z.m24947h(C8388a.m23845e().mo56913g()), 0, C8677z.m24924b(C8388a.m23845e().mo56913g(), 90.0f), 0);
                        try {
                            if (viewGroup instanceof MBridgeNativeEndCardView) {
                                ((MBridgeNativeEndCardView) viewGroup).setMoreOfferCampaignUnit(campaignUnit);
                            }
                        } catch (Throwable th) {
                            C8672v.m24874a("MOfferEnergize", th.getMessage());
                        }
                    }
                } catch (Exception e) {
                    C8672v.m24874a("MOfferEnergize", e.getMessage());
                }
            }
        }, aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f23103b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo62920a(java.lang.String r2) {
        /*
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.ref.SoftReference<com.mbridge.msdk.video.dynview.moffer.MOfferModel>> r0 = r1.f23103b
            if (r0 == 0) goto L_0x0012
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L_0x0012
            r2 = 1
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.moffer.C9391a.mo62920a(java.lang.String):boolean");
    }

    /* renamed from: b */
    public final void mo62921b() {
        try {
            if (this.f23103b != null) {
                for (SoftReference<MOfferModel> softReference : this.f23103b.values()) {
                    MOfferModel mOfferModel = (MOfferModel) softReference.get();
                    if (mOfferModel != null) {
                        mOfferModel.mofDestroy();
                    }
                }
                this.f23103b.clear();
            }
        } catch (Exception e) {
            C8672v.m24878d("MOfferEnergize", e.getMessage());
        }
    }
}
