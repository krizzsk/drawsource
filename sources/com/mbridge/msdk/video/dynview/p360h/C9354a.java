package com.mbridge.msdk.video.dynview.p360h;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.video.dynview.C9312a;
import com.mbridge.msdk.video.dynview.C9317c;
import com.mbridge.msdk.video.dynview.p352b.C9315a;
import com.mbridge.msdk.video.dynview.p352b.C9316b;
import com.mbridge.msdk.video.dynview.p353c.C9321a;
import com.mbridge.msdk.video.dynview.p354d.C9326e;
import com.mbridge.msdk.video.dynview.p354d.C9328g;
import com.mbridge.msdk.video.dynview.p365j.C9382c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.h.a */
/* compiled from: MBridgeUI */
public final class C9354a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static boolean f22979a = false;

    public C9354a() {
    }

    public C9354a(Context context, List<CampaignEx> list, C9328g gVar, Map<String, Object> map) {
        m26679a(new C9382c().mo62904a(context, list), gVar, map);
    }

    public C9354a(C9317c cVar, C9328g gVar, Map<String, Object> map) {
        m26679a(cVar, gVar, map);
    }

    /* renamed from: a */
    private void m26679a(C9317c cVar, final C9328g gVar, Map<String, Object> map) {
        View view;
        if (gVar != null) {
            if (cVar == null) {
                gVar.mo62660a(C9321a.NOT_FOUND_VIEWOPTION);
            } else if (cVar.mo62745a() == null) {
                gVar.mo62660a(C9321a.NOT_FOUND_CONTEXT);
            } else if (TextUtils.isEmpty(cVar.mo62746b())) {
                gVar.mo62660a(C9321a.NOT_FOUND_LAYOUTNAME);
            } else {
                try {
                    if (!TextUtils.isEmpty(cVar.mo62756l())) {
                        CampaignEx campaignEx = (cVar.mo62751g() == null || cVar.mo62751g().size() <= 0) ? null : cVar.mo62751g().get(0);
                        try {
                            Context g = C8388a.m23845e().mo56913g();
                            C8598e.m24671a(g, DyAdType.REWARD + "", cVar.mo62753i(), "create dynamic view", "start", campaignEx);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        view = DynamicViewCreator.getInstance().createDynamicView(new DyOption.Builder().campaignEx(campaignEx).fileDir(cVar.mo62756l()).dyAdType(DyAdType.REWARD).orientation(cVar.mo62749e()).templateType(cVar.mo62753i()).build());
                        if (view != null) {
                            f22979a = true;
                            try {
                                Context g2 = C8388a.m23845e().mo56913g();
                                C8598e.m24671a(g2, DyAdType.REWARD + "", cVar.mo62753i(), "create dynamic view", "view create done", campaignEx);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        } else {
                            f22979a = false;
                            view = LayoutInflater.from(cVar.mo62745a()).inflate(C8658p.m24799a(cVar.mo62745a(), cVar.mo62746b(), "layout"), (ViewGroup) null);
                        }
                    } else {
                        f22979a = false;
                        view = LayoutInflater.from(cVar.mo62745a()).inflate(C8658p.m24799a(cVar.mo62745a(), cVar.mo62746b(), "layout"), (ViewGroup) null);
                    }
                    if (map == null) {
                        map = new HashMap<>();
                    }
                    map.put("is_dy_success", Boolean.valueOf(f22979a));
                    C9316b.m26507a().mo62744a(view, cVar, map);
                    C9315a.m26505a().mo62743a(view, cVar, map, new C9326e() {
                        /* renamed from: a */
                        public final void mo62777a(View view, List<View> list) {
                            C9312a aVar = new C9312a();
                            aVar.mo62737a(view);
                            aVar.mo62738a(list);
                            aVar.mo62739a(C9354a.f22979a);
                            gVar.mo62659a(aVar);
                        }

                        /* renamed from: a */
                        public final void mo62778a(C9321a aVar) {
                            gVar.mo62660a(aVar);
                        }
                    });
                } catch (Exception e3) {
                    C8672v.m24878d("MBridgeUI", e3.getMessage());
                    if (gVar != null) {
                        gVar.mo62660a(C9321a.VIEW_CREATE_ERROR);
                    }
                }
            }
        }
    }
}
