package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.click.C6779b;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p085b.C2462a;
import com.mbridge.msdk.foundation.p085b.C2470b;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.video.dynview.C9312a;
import com.mbridge.msdk.video.dynview.C9314b;
import com.mbridge.msdk.video.dynview.C9317c;
import com.mbridge.msdk.video.dynview.moffer.C9391a;
import com.mbridge.msdk.video.dynview.p353c.C9321a;
import com.mbridge.msdk.video.dynview.p354d.C9323b;
import com.mbridge.msdk.video.dynview.p354d.C9324c;
import com.mbridge.msdk.video.dynview.p354d.C9328g;
import com.mbridge.msdk.video.dynview.p360h.C9354a;
import com.mbridge.msdk.video.dynview.p365j.C9382c;
import com.mbridge.msdk.video.module.MBridgeBaseView;
import com.mbridge.msdk.video.p347bt.module.p350b.C9308f;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.HashMap;
import java.util.List;

public class MBridgeOrderCampView extends MBridgeBaseView {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public MBridgeOrderCampView f23156n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public List<CampaignEx> f23157o;

    /* renamed from: p */
    private int f23158p;

    /* renamed from: q */
    private int f23159q;

    /* renamed from: r */
    private int f23160r;

    /* renamed from: s */
    private int f23161s;

    /* renamed from: t */
    private String f23162t;

    /* renamed from: u */
    private FeedBackButton f23163u;

    /* renamed from: v */
    private ImageView f23164v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f23165w = false;

    /* renamed from: x */
    private C9324c f23166x = new C9324c() {
        /* renamed from: a */
        public final void mo62776a(CampaignEx campaignEx, int i) {
            if (campaignEx != null) {
                try {
                    MBridgeOrderCampView.this.setCampaign(campaignEx);
                    MBridgeOrderCampView.m26784a(MBridgeOrderCampView.this, campaignEx, 0, i);
                } catch (Exception e) {
                    C8672v.m24878d(MBridgeBaseView.TAG, e.getMessage());
                }
            }
        }

        /* renamed from: a */
        public final void mo62775a() {
            MBridgeOrderCampView.m26783a(MBridgeOrderCampView.this);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C9323b f23167y;

    /* renamed from: z */
    private boolean f23168z = false;

    public MBridgeOrderCampView(Context context) {
        super(context);
    }

    public MBridgeOrderCampView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void init(Context context) {
        this.f23156n = this;
    }

    public void createView(final ViewGroup viewGroup) {
        if (this.f23157o == null) {
            C9323b bVar = this.f23167y;
            if (bVar != null) {
                bVar.mo62774b();
                return;
            }
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("order_view_callback", this.f23166x);
        C9317c b = new C9382c().mo62906b(C8388a.m23845e().mo56913g(), this.f23157o);
        C9314b.m26503a();
        new C9354a(b, new C9328g() {
            /* renamed from: a */
            public final void mo62659a(C9312a aVar) {
                if (aVar != null) {
                    try {
                        MBridgeOrderCampView.this.f23156n.addView(aVar.mo62736a());
                        boolean unused = MBridgeOrderCampView.this.f23165w = aVar.mo62741c();
                        viewGroup.removeAllViews();
                        viewGroup.addView(MBridgeOrderCampView.this.f23156n);
                        C9308f.m26484a(C8388a.m23845e().mo56913g(), (List<CampaignEx>) MBridgeOrderCampView.this.f23157o, ((CampaignEx) MBridgeOrderCampView.this.f23157o.get(0)).getCampaignUnitId());
                        MBridgeOrderCampView.this.setViewStatus();
                        if (MBridgeOrderCampView.this.f23167y != null) {
                            MBridgeOrderCampView.this.f23167y.mo62773a();
                        }
                    } catch (Exception e) {
                        C8672v.m24878d(MBridgeBaseView.TAG, e.getMessage());
                    }
                }
            }

            /* renamed from: a */
            public final void mo62660a(C9321a aVar) {
                try {
                    C9308f.m26485a(C8388a.m23845e().mo56913g(), (List<CampaignEx>) MBridgeOrderCampView.this.f23157o, ((CampaignEx) MBridgeOrderCampView.this.f23157o.get(0)).getCampaignUnitId(), aVar.mo62772b());
                    if (MBridgeOrderCampView.this.f23167y != null) {
                        MBridgeOrderCampView.this.f23167y.mo62774b();
                    }
                } catch (Exception e) {
                    C8672v.m24878d(MBridgeBaseView.TAG, e.getMessage());
                }
            }
        }, hashMap);
    }

    public void setCampaignExes(List<CampaignEx> list) {
        this.f23157o = list;
    }

    public void setCampOrderViewBuildCallback(C9323b bVar) {
        this.f23167y = bVar;
    }

    public void setRewarded(boolean z) {
        this.f23168z = z;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0031 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r5.f23157o
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            r0 = 0
        L_0x0009:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r5.f23157o
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x0034
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x001f }
            r2.<init>()     // Catch:{ JSONException -> 0x001f }
            java.lang.String r1 = "camp_position"
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x001d }
            goto L_0x0026
        L_0x001d:
            r1 = move-exception
            goto L_0x0023
        L_0x001f:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
        L_0x0023:
            r1.printStackTrace()
        L_0x0026:
            com.mbridge.msdk.video.module.a.a r1 = r5.f23199e
            if (r1 == 0) goto L_0x0031
            com.mbridge.msdk.video.module.a.a r1 = r5.f23199e
            r3 = 110(0x6e, float:1.54E-43)
            r1.mo62631a(r3, r2)
        L_0x0031:
            int r0 = r0 + 1
            goto L_0x0009
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.onAttachedToWindow():void");
    }

    public void setViewStatus() {
        MBridgeOrderCampView mBridgeOrderCampView = this.f23156n;
        if (mBridgeOrderCampView != null && this.f23168z) {
            RelativeLayout relativeLayout = (RelativeLayout) mBridgeOrderCampView.findViewById(filterFindViewId(this.f23165w, "mbridge_native_order_camp_controller"));
            this.f23163u = (FeedBackButton) this.f23156n.findViewById(filterFindViewId(this.f23165w, "mbridge_native_order_camp_feed_btn"));
            this.f23164v = (ImageView) this.f23156n.findViewById(filterFindViewId(this.f23165w, "mbridge_iv_link"));
            if (relativeLayout != null) {
                relativeLayout.setPadding(this.f23158p, this.f23160r, this.f23159q, this.f23161s);
            }
            FeedBackButton feedBackButton = this.f23163u;
            if (!(feedBackButton == null || feedBackButton == null)) {
                try {
                    if (this.f23157o == null) {
                        feedBackButton.setVisibility(8);
                    } else if (this.f23157o.get(0) == null) {
                        this.f23163u.setVisibility(8);
                    } else if (C2470b.m6168a().mo16428b()) {
                        this.f23162t = this.f23157o.get(0).getCampaignUnitId();
                        this.f23196b = this.f23157o.get(0);
                        C2470b a = C2470b.m6168a();
                        a.mo16422a(this.f23162t + "_" + 2, (C2462a) new C2462a() {
                            /* renamed from: a */
                            public final void mo16392a() {
                            }

                            /* renamed from: a */
                            public final void mo16393a(String str) {
                            }

                            /* renamed from: b */
                            public final void mo16394b() {
                            }
                        });
                        C2470b a2 = C2470b.m6168a();
                        a2.mo16423a(this.f23162t + "_" + 2, this.f23196b);
                        C2470b a3 = C2470b.m6168a();
                        a3.mo16424a(this.f23162t + "_" + 2, this.f23163u);
                    } else {
                        this.f23163u.setVisibility(8);
                    }
                } catch (Exception e) {
                    C8672v.m24878d(MBridgeBaseView.TAG, e.getMessage());
                }
            }
            ImageView imageView = this.f23164v;
            if (imageView != null && imageView != null) {
                try {
                    C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
                    if (b != null) {
                        final String af = b.mo16188af();
                        if (TextUtils.isEmpty(af)) {
                            this.f23164v.setVisibility(8);
                        }
                        this.f23164v.setOnClickListener(new View.OnClickListener() {
                            public final void onClick(View view) {
                                C6779b.m20647b(MBridgeOrderCampView.this.f23195a, af);
                            }
                        });
                        return;
                    }
                    this.f23164v.setVisibility(8);
                } catch (Exception e2) {
                    C8672v.m24878d(MBridgeBaseView.TAG, e2.getMessage());
                }
            }
        }
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        this.f23158p = i;
        this.f23159q = i2;
        this.f23160r = i3;
        this.f23161s = i4;
        setViewStatus();
    }

    public void startAlphaAnimation() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500);
        this.f23156n.startAnimation(alphaAnimation);
    }

    public void startTranslateAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(500);
        this.f23156n.startAnimation(translateAnimation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m26784a(com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView r8, com.mbridge.msdk.foundation.entity.CampaignEx r9, int r10, int r11) {
        /*
            if (r9 == 0) goto L_0x0059
            boolean r0 = r9.isDynamicView()
            if (r0 == 0) goto L_0x0059
            com.mbridge.msdk.foundation.entity.CampaignEx$c r0 = r9.getRewardTemplateMode()     // Catch:{ Exception -> 0x004f }
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0023
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004f }
            r2.<init>()     // Catch:{ Exception -> 0x004f }
            int r0 = r0.mo57573b()     // Catch:{ Exception -> 0x004f }
            r2.append(r0)     // Catch:{ Exception -> 0x004f }
            r2.append(r1)     // Catch:{ Exception -> 0x004f }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x004f }
        L_0x0023:
            r7 = r1
            android.content.Context r0 = r8.f23195a     // Catch:{ Exception -> 0x004f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004f }
            r1.<init>()     // Catch:{ Exception -> 0x004f }
            java.lang.String r2 = "order_view_click"
            r1.append(r2)     // Catch:{ Exception -> 0x004f }
            r1.append(r7)     // Catch:{ Exception -> 0x004f }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x004f }
            java.lang.String r2 = r9.getCampaignUnitId()     // Catch:{ Exception -> 0x004f }
            boolean r3 = r9.isBidCampaign()     // Catch:{ Exception -> 0x004f }
            java.lang.String r4 = r9.getRequestId()     // Catch:{ Exception -> 0x004f }
            java.lang.String r5 = r9.getRequestIdNotice()     // Catch:{ Exception -> 0x004f }
            java.lang.String r6 = r9.getId()     // Catch:{ Exception -> 0x004f }
            com.mbridge.msdk.foundation.same.report.C8598e.m24675a((android.content.Context) r0, (java.lang.String) r1, (java.lang.String) r2, (boolean) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7)     // Catch:{ Exception -> 0x004f }
            goto L_0x0059
        L_0x004f:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            java.lang.String r0 = "MBridgeBaseView"
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r0, r9)
        L_0x0059:
            r9 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0070 }
            r0.<init>()     // Catch:{ JSONException -> 0x0070 }
            java.lang.String r9 = com.mbridge.msdk.foundation.same.C8469a.f20746g     // Catch:{ JSONException -> 0x006e }
            org.json.JSONObject r10 = r8.mo62972a(r10)     // Catch:{ JSONException -> 0x006e }
            r0.put(r9, r10)     // Catch:{ JSONException -> 0x006e }
            java.lang.String r9 = "camp_position"
            r0.put(r9, r11)     // Catch:{ JSONException -> 0x006e }
            goto L_0x0076
        L_0x006e:
            r9 = move-exception
            goto L_0x0073
        L_0x0070:
            r10 = move-exception
            r0 = r9
            r9 = r10
        L_0x0073:
            r9.printStackTrace()
        L_0x0076:
            com.mbridge.msdk.video.module.a.a r9 = r8.f23199e
            if (r9 == 0) goto L_0x0081
            com.mbridge.msdk.video.module.a.a r8 = r8.f23199e
            r9 = 105(0x69, float:1.47E-43)
            r8.mo62631a(r9, r0)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.m26784a(com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView, com.mbridge.msdk.foundation.entity.CampaignEx, int, int):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m26783a(MBridgeOrderCampView mBridgeOrderCampView) {
        try {
            C9391a.m26760a().mo62921b();
        } catch (Exception e) {
            C8672v.m24878d(MBridgeBaseView.TAG, e.getMessage());
        }
        if (mBridgeOrderCampView.f23199e != null) {
            mBridgeOrderCampView.f23199e.mo62631a(104, "");
        }
    }
}
