package com.mbridge.msdk.video.dynview.ordercamp.p366a;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.dycreator.baseview.MBFrameLayout;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeTextView;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p302c.C8481b;
import com.mbridge.msdk.foundation.same.p302c.C8484c;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.video.dynview.p360h.C9356b;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.util.List;
import java.util.Locale;

/* renamed from: com.mbridge.msdk.video.dynview.ordercamp.a.a */
/* compiled from: OrderCampAdapter */
public final class C9397a extends BaseAdapter {

    /* renamed from: a */
    private boolean f23108a = false;

    /* renamed from: b */
    private C9399a f23109b;

    /* renamed from: c */
    private List<CampaignEx> f23110c;

    public final long getItemId(int i) {
        return (long) i;
    }

    public C9397a(List<CampaignEx> list) {
        this.f23110c = list;
    }

    public final int getCount() {
        List<CampaignEx> list = this.f23110c;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.f23110c.size();
    }

    public final Object getItem(int i) {
        List<CampaignEx> list = this.f23110c;
        if (list != null) {
            return list.get(i);
        }
        return null;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        int i2 = i;
        if (view == null) {
            try {
                view2 = m26775a(i);
            } catch (Exception e) {
                e = e;
                view2 = view;
                C8672v.m24878d("OrderCampAdapter", e.getMessage());
                return view2;
            }
        } else {
            this.f23109b = (C9399a) view.getTag();
            view2 = view;
        }
        try {
            this.f23109b.f23114a = (RelativeLayout) view2.findViewById(m26778c("mbridge_lv_item_rl"));
            this.f23109b.f23118e = (TextView) view2.findViewById(m26778c("mbridge_lv_title_tv"));
            this.f23109b.f23120g = (TextView) view2.findViewById(m26778c("mbridge_lv_tv_install"));
            this.f23109b.f23128o = (MBHeatLevelLayoutView) view2.findViewById(m26778c("mbridge_lv_sv_heat_level"));
            this.f23109b.f23119f = (TextView) view2.findViewById(m26778c("mbridge_lv_desc_tv"));
            this.f23109b.f23123j = (ImageView) view2.findViewById(m26778c("mbridge_iv_flag"));
            this.f23109b.f23121h = (TextView) view2.findViewById(m26778c("mbridge_order_viewed_tv"));
            double d = 5.0d;
            if (this.f23108a) {
                if (this.f23110c != null) {
                    if (this.f23109b != null) {
                        if (this.f23110c.size() != 0) {
                            if (this.f23109b.f23125l != null && (this.f23109b.f23125l instanceof MBCusRoundImageView)) {
                                this.f23109b.f23125l.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
                                m26776a(this.f23109b.f23125l, this.f23110c.get(i2).getImageUrl(), false);
                            }
                            if (this.f23109b.f23124k != null) {
                                m26776a(this.f23109b.f23124k, this.f23110c.get(i2).getImageUrl(), false);
                            }
                            if (this.f23109b.f23126m != null && (this.f23109b.f23126m instanceof MBCusRoundImageView)) {
                                this.f23109b.f23126m.setBorder(50, 20, -1);
                                m26776a(this.f23109b.f23126m, this.f23110c.get(i2).getIconUrl(), true);
                            }
                            double rating = this.f23110c.get(i2).getRating();
                            if (rating > 0.0d) {
                                d = rating;
                            }
                            if (this.f23109b.f23127n != null) {
                                this.f23109b.f23127n.setRating((int) d);
                                this.f23109b.f23127n.setOrientation(0);
                            }
                            if (this.f23109b.f23128o != null) {
                                this.f23109b.f23128o.setHeatCount(this.f23110c.get(i2).getNumberRating());
                            }
                        }
                    }
                }
            } else if (this.f23110c != null) {
                if (this.f23109b != null) {
                    if (this.f23110c.size() != 0) {
                        if (this.f23109b.f23116c != null) {
                            m26776a(this.f23109b.f23116c, this.f23110c.get(i2).getImageUrl(), false);
                        }
                        if (this.f23109b.f23124k != null) {
                            m26776a(this.f23109b.f23124k, this.f23110c.get(i2).getImageUrl(), false);
                        }
                        if (this.f23109b.f23117d != null) {
                            this.f23109b.f23117d.setBorderRadius(25);
                            m26776a(this.f23109b.f23117d, this.f23110c.get(i2).getIconUrl(), true);
                        }
                        double rating2 = this.f23110c.get(i2).getRating();
                        if (rating2 > 0.0d) {
                            d = rating2;
                        }
                        if (this.f23109b.f23122i != null) {
                            this.f23109b.f23122i.setRatingAndUser(d, this.f23110c.get(i2).getNumberRating());
                            this.f23109b.f23122i.setOrientation(0);
                        }
                        if (this.f23109b.f23115b != null) {
                            this.f23109b.f23115b.setWidthRatio(1.0f);
                            this.f23109b.f23115b.setHeightRatio(1.0f);
                            this.f23109b.f23115b.setAutoscroll(false);
                        }
                        if (this.f23109b.f23116c != null) {
                            this.f23109b.f23116c.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
                        }
                    }
                }
            }
            if (this.f23109b != null) {
                if (this.f23109b.f23118e != null) {
                    this.f23109b.f23118e.setText(this.f23110c.get(i2).getAppName());
                }
                if (this.f23109b.f23119f != null) {
                    this.f23109b.f23119f.setText(this.f23110c.get(i2).getAppDesc());
                }
                if (this.f23109b.f23120g != null) {
                    String adCall = this.f23110c.get(i2).getAdCall();
                    if (this.f23109b.f23120g instanceof MBridgeTextView) {
                        ((MBridgeTextView) this.f23109b.f23120g).setObjectAnimator(new C9356b().mo62867c(this.f23109b.f23120g));
                    }
                    this.f23109b.f23120g.setText(adCall);
                }
                if (this.f23109b.f23123j != null) {
                    try {
                        String language = Locale.getDefault().getLanguage();
                        Context g = C8388a.m23845e().mo56913g();
                        if (g != null) {
                            if (!TextUtils.isEmpty(language)) {
                                if (language.equals("zh")) {
                                    this.f23109b.f23123j.setImageDrawable(g.getResources().getDrawable(g.getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", C8388a.m23845e().mo56903b())));
                                }
                            }
                            this.f23109b.f23123j.setImageDrawable(g.getResources().getDrawable(g.getResources().getIdentifier("mbridge_reward_flag_en", "drawable", C8388a.m23845e().mo56903b())));
                        }
                    } catch (Exception e2) {
                        C8672v.m24878d("OrderCampAdapter", e2.getMessage());
                    }
                }
                if (this.f23109b.f23121h != null) {
                    try {
                        this.f23109b.f23121h.setText(C8388a.m23845e().mo56913g().getResources().getString(C8388a.m23845e().mo56913g().getResources().getIdentifier("mbridge_reward_viewed_text_str", "string", C8388a.m23845e().mo56903b())));
                        this.f23109b.f23121h.setVisibility(0);
                    } catch (Exception e3) {
                        C8672v.m24878d("OrderCampAdapter", e3.getMessage());
                    }
                }
            }
        } catch (Exception e4) {
            e = e4;
        }
        return view2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b A[Catch:{ Exception -> 0x0120 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050 A[Catch:{ Exception -> 0x0120 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057 A[Catch:{ Exception -> 0x0120 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View m26775a(int r12) {
        /*
            r11 = this;
            java.lang.String r0 = "mbridge_lv_ration"
            java.lang.String r1 = "mbridge_lv_sv_starlevel"
            java.lang.String r2 = "mbridge_lv_icon_iv"
            java.lang.String r3 = "mbridge_lv_iv_burl"
            java.lang.String r4 = "mbridge_lv_iv"
            r5 = 0
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r6 = r11.f23110c     // Catch:{ Exception -> 0x0120 }
            java.lang.String r7 = ""
            if (r6 == 0) goto L_0x0041
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r6 = r11.f23110c     // Catch:{ Exception -> 0x0120 }
            java.lang.Object r6 = r6.get(r12)     // Catch:{ Exception -> 0x0120 }
            if (r6 == 0) goto L_0x0041
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0120 }
            r6.<init>()     // Catch:{ Exception -> 0x0120 }
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r8 = r11.f23110c     // Catch:{ Exception -> 0x0120 }
            java.lang.Object r8 = r8.get(r12)     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.foundation.entity.CampaignEx r8 = (com.mbridge.msdk.foundation.entity.CampaignEx) r8     // Catch:{ Exception -> 0x0120 }
            int r8 = r8.getMof_tplid()     // Catch:{ Exception -> 0x0120 }
            r6.append(r8)     // Catch:{ Exception -> 0x0120 }
            r6.append(r7)     // Catch:{ Exception -> 0x0120 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0120 }
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r8 = r11.f23110c     // Catch:{ Exception -> 0x0120 }
            java.lang.Object r8 = r8.get(r12)     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.foundation.entity.CampaignEx r8 = (com.mbridge.msdk.foundation.entity.CampaignEx) r8     // Catch:{ Exception -> 0x0120 }
            java.lang.String r8 = r8.getCMPTEntryUrl()     // Catch:{ Exception -> 0x0120 }
            goto L_0x0044
        L_0x0041:
            java.lang.String r6 = "501"
            r8 = r7
        L_0x0044:
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0120 }
            r10 = 0
            if (r9 != 0) goto L_0x0050
            java.lang.String r6 = com.mbridge.msdk.foundation.tools.C8639i.m24750a(r10, r6, r8)     // Catch:{ Exception -> 0x0120 }
            goto L_0x0051
        L_0x0050:
            r6 = r7
        L_0x0051:
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0120 }
            if (r8 != 0) goto L_0x012a
            java.lang.String r8 = "\\.xml"
            java.lang.String[] r6 = r6.split(r8)     // Catch:{ Exception -> 0x0120 }
            if (r6 == 0) goto L_0x0075
            int r8 = r6.length     // Catch:{ Exception -> 0x0120 }
            if (r8 <= 0) goto L_0x0075
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0120 }
            r7.<init>()     // Catch:{ Exception -> 0x0120 }
            r6 = r6[r10]     // Catch:{ Exception -> 0x0120 }
            r7.append(r6)     // Catch:{ Exception -> 0x0120 }
            java.lang.String r6 = "_item.xml"
            r7.append(r6)     // Catch:{ Exception -> 0x0120 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0120 }
        L_0x0075:
            boolean r6 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x0120 }
            if (r6 != 0) goto L_0x012a
            com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0120 }
            android.content.Context r6 = r6.mo56913g()     // Catch:{ Exception -> 0x0120 }
            int r6 = com.mbridge.msdk.foundation.tools.C8660r.m24819e((android.content.Context) r6)     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.foundation.controller.a r8 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0120 }
            java.lang.String r8 = r8.mo56914h()     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.c.b r9 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.c.a r8 = r9.mo16286b(r8)     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.dycreator.wrapper.DyOption$Builder r9 = new com.mbridge.msdk.dycreator.wrapper.DyOption$Builder     // Catch:{ Exception -> 0x0120 }
            r9.<init>()     // Catch:{ Exception -> 0x0120 }
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r10 = r11.f23110c     // Catch:{ Exception -> 0x0120 }
            java.lang.Object r12 = r10.get(r12)     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.foundation.entity.CampaignEx r12 = (com.mbridge.msdk.foundation.entity.CampaignEx) r12     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.dycreator.wrapper.DyOption$IViewOptionBuilder r12 = r9.campaignEx(r12)     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.dycreator.wrapper.DyOption$IViewOptionBuilder r12 = r12.fileDir(r7)     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.dycreator.wrapper.DyAdType r7 = com.mbridge.msdk.dycreator.wrapper.DyAdType.REWARD     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.dycreator.wrapper.DyOption$IViewOptionBuilder r12 = r12.dyAdType(r7)     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.dycreator.wrapper.DyOption$IViewOptionBuilder r12 = r12.orientation(r6)     // Catch:{ Exception -> 0x0120 }
            java.lang.String r6 = r8.mo16188af()     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.dycreator.wrapper.DyOption$IViewOptionBuilder r12 = r12.adChoiceLink(r6)     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.dycreator.wrapper.DyOption r12 = r12.build()     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator r6 = com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator.getInstance()     // Catch:{ Exception -> 0x0120 }
            android.view.View r12 = r6.createDynamicView(r12)     // Catch:{ Exception -> 0x0120 }
            if (r12 == 0) goto L_0x012b
            r6 = 1
            r11.f23108a = r6     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.video.dynview.ordercamp.a.a$a r6 = new com.mbridge.msdk.video.dynview.ordercamp.a.a$a     // Catch:{ Exception -> 0x0120 }
            r6.<init>()     // Catch:{ Exception -> 0x0120 }
            r11.f23109b = r6     // Catch:{ Exception -> 0x0120 }
            int r7 = r11.m26777b(r4)     // Catch:{ Exception -> 0x0120 }
            android.view.View r7 = r12.findViewById(r7)     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView r7 = (com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView) r7     // Catch:{ Exception -> 0x0120 }
            r6.f23125l = r7     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.video.dynview.ordercamp.a.a$a r6 = r11.f23109b     // Catch:{ Exception -> 0x0120 }
            int r7 = r11.m26777b(r3)     // Catch:{ Exception -> 0x0120 }
            android.view.View r7 = r12.findViewById(r7)     // Catch:{ Exception -> 0x0120 }
            android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0120 }
            r6.f23124k = r7     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.video.dynview.ordercamp.a.a$a r6 = r11.f23109b     // Catch:{ Exception -> 0x0120 }
            int r7 = r11.m26777b(r2)     // Catch:{ Exception -> 0x0120 }
            android.view.View r7 = r12.findViewById(r7)     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView r7 = (com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView) r7     // Catch:{ Exception -> 0x0120 }
            r6.f23126m = r7     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.video.dynview.ordercamp.a.a$a r6 = r11.f23109b     // Catch:{ Exception -> 0x0120 }
            int r7 = r11.m26777b(r1)     // Catch:{ Exception -> 0x0120 }
            android.view.View r7 = r12.findViewById(r7)     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView r7 = (com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView) r7     // Catch:{ Exception -> 0x0120 }
            r6.f23127n = r7     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.video.dynview.ordercamp.a.a$a r6 = r11.f23109b     // Catch:{ Exception -> 0x0120 }
            int r7 = r11.m26777b(r0)     // Catch:{ Exception -> 0x0120 }
            android.view.View r7 = r12.findViewById(r7)     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.dycreator.baseview.MBFrameLayout r7 = (com.mbridge.msdk.dycreator.baseview.MBFrameLayout) r7     // Catch:{ Exception -> 0x0120 }
            r6.f23129p = r7     // Catch:{ Exception -> 0x0120 }
            com.mbridge.msdk.video.dynview.ordercamp.a.a$a r6 = r11.f23109b     // Catch:{ Exception -> 0x0120 }
            r12.setTag(r6)     // Catch:{ Exception -> 0x0120 }
            goto L_0x012b
        L_0x0120:
            r12 = move-exception
            java.lang.String r12 = r12.getMessage()
            java.lang.String r6 = "OrderCampAdapter"
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r6, r12)
        L_0x012a:
            r12 = r5
        L_0x012b:
            boolean r6 = r11.f23108a
            if (r6 == 0) goto L_0x0130
            goto L_0x01a4
        L_0x0130:
            com.mbridge.msdk.foundation.controller.a r12 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            android.content.Context r12 = r12.mo56913g()
            android.view.LayoutInflater r12 = android.view.LayoutInflater.from(r12)
            com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            android.content.Context r6 = r6.mo56913g()
            android.content.Context r6 = r6.getApplicationContext()
            java.lang.String r7 = "mbridge_order_layout_item"
            java.lang.String r8 = "layout"
            int r6 = com.mbridge.msdk.foundation.tools.C8658p.m24799a(r6, r7, r8)
            android.view.View r12 = r12.inflate(r6, r5)
            com.mbridge.msdk.video.dynview.ordercamp.a.a$a r5 = new com.mbridge.msdk.video.dynview.ordercamp.a.a$a
            r5.<init>()
            r11.f23109b = r5
            int r4 = r11.m26774a((java.lang.String) r4)
            android.view.View r4 = r12.findViewById(r4)
            com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView r4 = (com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView) r4
            r5.f23116c = r4
            com.mbridge.msdk.video.dynview.ordercamp.a.a$a r4 = r11.f23109b
            int r3 = r11.m26774a((java.lang.String) r3)
            android.view.View r3 = r12.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r4.f23124k = r3
            com.mbridge.msdk.video.dynview.ordercamp.a.a$a r3 = r11.f23109b
            int r2 = r11.m26774a((java.lang.String) r2)
            android.view.View r2 = r12.findViewById(r2)
            com.mbridge.msdk.videocommon.view.RoundImageView r2 = (com.mbridge.msdk.videocommon.view.RoundImageView) r2
            r3.f23117d = r2
            com.mbridge.msdk.video.dynview.ordercamp.a.a$a r2 = r11.f23109b
            int r1 = r11.m26774a((java.lang.String) r1)
            android.view.View r1 = r12.findViewById(r1)
            com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView r1 = (com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView) r1
            r2.f23122i = r1
            com.mbridge.msdk.video.dynview.ordercamp.a.a$a r1 = r11.f23109b
            int r0 = r11.m26774a((java.lang.String) r0)
            android.view.View r0 = r12.findViewById(r0)
            com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView r0 = (com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView) r0
            r1.f23115b = r0
            com.mbridge.msdk.video.dynview.ordercamp.a.a$a r0 = r11.f23109b
            r12.setTag(r0)
        L_0x01a4:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.ordercamp.p366a.C9397a.m26775a(int):android.view.View");
    }

    /* renamed from: a */
    private void m26776a(final ImageView imageView, String str, final boolean z) {
        if (imageView != null) {
            if (!TextUtils.isEmpty(str)) {
                C8481b.m24310a(imageView.getContext()).mo57883a(str, (C8484c) new C8484c() {
                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                        try {
                            if (!bitmap.isRecycled()) {
                                imageView.setImageBitmap(bitmap);
                            }
                        } catch (Throwable th) {
                            C8672v.m24878d("OrderCampAdapter", th.getMessage());
                        }
                    }

                    public final void onFailedLoad(String str, String str2) {
                        if (z) {
                            imageView.setVisibility(8);
                        }
                    }
                });
            } else if (z) {
                imageView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.mbridge.msdk.video.dynview.ordercamp.a.a$a */
    /* compiled from: OrderCampAdapter */
    static class C9399a {

        /* renamed from: a */
        RelativeLayout f23114a;

        /* renamed from: b */
        MBRotationView f23115b;

        /* renamed from: c */
        MBridgeImageView f23116c;

        /* renamed from: d */
        RoundImageView f23117d;

        /* renamed from: e */
        TextView f23118e;

        /* renamed from: f */
        TextView f23119f;

        /* renamed from: g */
        TextView f23120g;

        /* renamed from: h */
        TextView f23121h;

        /* renamed from: i */
        MBridgeLevelLayoutView f23122i;

        /* renamed from: j */
        ImageView f23123j;

        /* renamed from: k */
        ImageView f23124k;

        /* renamed from: l */
        MBCusRoundImageView f23125l;

        /* renamed from: m */
        MBCusRoundImageView f23126m;

        /* renamed from: n */
        MBStarLevelLayoutView f23127n;

        /* renamed from: o */
        MBHeatLevelLayoutView f23128o;

        /* renamed from: p */
        MBFrameLayout f23129p;

        C9399a() {
        }
    }

    /* renamed from: a */
    private int m26774a(String str) {
        return C8658p.m24799a(C8388a.m23845e().mo56913g().getApplicationContext(), str, "id");
    }

    /* renamed from: b */
    private int m26777b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.hashCode();
        }
        return -1;
    }

    /* renamed from: c */
    private int m26778c(String str) {
        if (this.f23108a) {
            return m26777b(str);
        }
        return m26774a(str);
    }
}
