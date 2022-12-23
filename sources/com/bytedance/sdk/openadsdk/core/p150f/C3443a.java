package com.bytedance.sdk.openadsdk.core.p150f;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTImage;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.C3508l;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3417k;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.dislike.C3716b;
import com.bytedance.sdk.openadsdk.p170h.C3753b;
import com.bytedance.sdk.openadsdk.p170h.p171a.C3752b;
import com.bytedance.sdk.openadsdk.p178l.C3893s;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.f.a */
/* compiled from: TTNativeAdImpl */
public class C3443a implements TTNativeAd {

    /* renamed from: a */
    private int f8482a;

    /* renamed from: b */
    private boolean f8483b;

    /* renamed from: c */
    private boolean f8484c;
    /* access modifiers changed from: protected */

    /* renamed from: g */
    public final C3508l f8485g;

    /* renamed from: h */
    protected final C3431n f8486h;

    /* renamed from: i */
    protected final Context f8487i;

    /* renamed from: j */
    protected TTAdDislike f8488j;

    /* renamed from: k */
    protected int f8489k;

    /* renamed from: l */
    protected String f8490l;

    /* renamed from: a */
    private String m10547a(int i) {
        return i != 1 ? i != 2 ? (i == 5 || i != 9) ? "embeded_ad" : "draw_ad" : "interaction" : "banner_ad";
    }

    public View getAdView() {
        return null;
    }

    public C3443a(Context context, C3431n nVar, int i) {
        if (nVar == null) {
            C2905l.m8110b("materialMeta can't been null");
        }
        this.f8486h = nVar;
        this.f8487i = context;
        this.f8489k = i;
        this.f8485g = new C3508l(this.f8487i, this, nVar, m10547a(i));
    }

    public void registerViewForInteraction(ViewGroup viewGroup, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        if (viewGroup == null) {
            C2905l.m8110b("container can't been null");
        } else if (view == null) {
            C2905l.m8110b("clickView can't been null");
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(view);
            registerViewForInteraction(viewGroup, arrayList, (List<View>) null, adInteractionListener);
        }
    }

    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, TTNativeAd.AdInteractionListener adInteractionListener) {
        if (viewGroup == null) {
            C2905l.m8110b("container can't been null");
        } else if (list == null) {
            C2905l.m8110b("clickView can't been null");
        } else if (list.size() <= 0) {
            C2905l.m8110b("clickViews size must been more than 1");
        } else {
            registerViewForInteraction(viewGroup, list, list2, (View) null, adInteractionListener);
        }
    }

    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        if (viewGroup == null) {
            C2905l.m8110b("container can't been null");
        } else if (list == null) {
            C2905l.m8110b("clickView can't been null");
        } else if (list.size() <= 0) {
            C2905l.m8110b("clickViews size must been more than 1");
        } else {
            registerViewForInteraction(viewGroup, (List<View>) null, list, list2, view, adInteractionListener);
        }
    }

    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        if (viewGroup == null) {
            C2905l.m8110b("container can't been null");
        } else if (list2 == null) {
            C2905l.m8110b("clickView can't been null");
        } else if (list2.size() <= 0) {
            C2905l.m8110b("clickViews size must been more than 1");
        } else {
            m10550a(list3 != null && list3.size() > 0);
            if (m10551a()) {
                list3 = m10548a(list2, list3);
            }
            this.f8485g.mo19977a(viewGroup, list, list2, list3, view, adInteractionListener);
        }
    }

    /* renamed from: a */
    private List<View> m10548a(List<View> list, List<View> list2) {
        LinkedList linkedList = new LinkedList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                linkedList.add(list.get(i));
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                linkedList.add(list2.get(i2));
            }
        }
        return linkedList;
    }

    public TTImage getVideoCoverImage() {
        C3431n nVar = this.f8486h;
        if (nVar == null || nVar.mo19517J() == null) {
            return null;
        }
        return new TTImage(this.f8486h.mo19517J().mo15934b(), this.f8486h.mo19517J().mo15937c(), this.f8486h.mo19517J().mo15951h());
    }

    public Bitmap getAdLogo() {
        return BitmapFactory.decodeResource(this.f8487i.getResources(), C2914t.m8157d(C3513m.m10963a(), "tt_ad_logo_new"));
    }

    public String getTitle() {
        if (this.f8486h.mo19567aa() != null && !TextUtils.isEmpty(this.f8486h.mo19567aa().mo19404b())) {
            return this.f8486h.mo19567aa().mo19404b();
        }
        if (!TextUtils.isEmpty(getSource())) {
            return getSource();
        }
        return this.f8486h.mo19528U();
    }

    public String getDescription() {
        if (!TextUtils.isEmpty(this.f8486h.mo19528U())) {
            return this.f8486h.mo19528U();
        }
        return this.f8486h.mo19529V();
    }

    public String getButtonText() {
        return this.f8486h.mo19530W();
    }

    public int getAppScore() {
        if (this.f8486h.mo19567aa() != null) {
            return (int) this.f8486h.mo19567aa().mo19409d();
        }
        return 0;
    }

    public int getAppCommentNum() {
        if (this.f8486h.mo19567aa() != null) {
            return this.f8486h.mo19567aa().mo19410e();
        }
        return 0;
    }

    public int getAppSize() {
        if (this.f8486h.mo19567aa() != null) {
            return this.f8486h.mo19567aa().mo19411f();
        }
        return 0;
    }

    public String getSource() {
        return this.f8486h.mo19518K();
    }

    public TTImage getIcon() {
        if (this.f8486h.mo19520M() == null) {
            return null;
        }
        return C3417k.m10248a(this.f8486h.mo19520M());
    }

    public List<TTImage> getImageList() {
        ArrayList arrayList = new ArrayList();
        if (this.f8486h.mo19523P() != null && !this.f8486h.mo19523P().isEmpty()) {
            for (C3417k a : this.f8486h.mo19523P()) {
                arrayList.add(C3417k.m10248a(a));
            }
        }
        return arrayList;
    }

    public int getInteractionType() {
        C3431n nVar = this.f8486h;
        if (nVar == null) {
            return -1;
        }
        return nVar.mo19519L();
    }

    public int getImageMode() {
        C3431n nVar = this.f8486h;
        if (nVar == null) {
            return -1;
        }
        return nVar.mo19570ad();
    }

    public List<FilterWord> getFilterWords() {
        C3431n nVar = this.f8486h;
        if (nVar == null) {
            return null;
        }
        return nVar.mo19571ae();
    }

    public TTAdDislike getDislikeDialog(Activity activity) {
        if (this.f8488j == null) {
            m10549a(activity);
        }
        return this.f8488j;
    }

    public TTAdDislike getDislikeDialog(final TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.setMaterialMeta(this.f8486h);
            return new TTAdDislike() {
                public void setDislikeInteractionCallback(TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
                }

                public void showDislikeDialog() {
                    if ((tTDislikeDialogAbstract.getContext() instanceof Activity) && !((Activity) tTDislikeDialogAbstract.getContext()).isFinishing()) {
                        tTDislikeDialogAbstract.show();
                    }
                }
            };
        }
        throw new IllegalArgumentException("dialog is null, please check");
    }

    public View getAdLogoView() {
        if (this.f8487i == null) {
            C2905l.m8118e("TTNativeAdImpl", "getAdLogoView mContext == null");
            return null;
        }
        ImageView imageView = new ImageView(this.f8487i);
        imageView.setImageResource(C2914t.m8157d(this.f8487i, "tt_ad_logo_new"));
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C3443a.this.showPrivacyActivity();
            }
        });
        return imageView;
    }

    public Map<String, Object> getMediaExtraInfo() {
        C3431n nVar = this.f8486h;
        if (nVar != null) {
            return nVar.mo19576aj();
        }
        return null;
    }

    /* renamed from: a */
    private void m10549a(Activity activity) {
        Context context = this.f8487i;
        Context context2 = activity;
        if (context instanceof Activity) {
            context2 = activity;
            if (!((Activity) context).isFinishing()) {
                context2 = this.f8487i;
            }
        }
        this.f8488j = new C3716b(context2, this.f8486h);
    }

    /* renamed from: a */
    private void m10550a(boolean z) {
        C3752b c = C3752b.m12257b().mo20542a(this.f8489k).mo20547c(String.valueOf(C3898x.m12794f(this.f8486h)));
        if (z) {
            C3753b.m12287a().mo20578c(c);
        } else {
            C3753b.m12287a().mo20579d(c);
        }
    }

    /* renamed from: a */
    private boolean m10551a() {
        C3431n nVar = this.f8486h;
        if (nVar == null || nVar.mo19519L() == 5) {
            return false;
        }
        if (this.f8482a == 0) {
            this.f8482a = C3898x.m12794f(this.f8486h);
        }
        if (C3513m.m10973h().mo19844d(this.f8482a) == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18855a(String str) {
        this.f8490l = str;
    }

    public void showPrivacyActivity() {
        Context context = this.f8487i;
        if (context != null) {
            TTWebsiteActivity.m8711a(context, this.f8486h, this.f8490l);
        }
    }

    public String getAdCreativeToken() {
        return this.f8486h.mo19640n();
    }

    public void win(Double d) {
        if (!this.f8483b) {
            C3893s.m12718a(this.f8486h, d);
            this.f8483b = true;
        }
    }

    public void loss(Double d, String str, String str2) {
        if (!this.f8484c) {
            C3893s.m12719a(this.f8486h, d, str, str2);
            this.f8484c = true;
        }
    }

    public void setPrice(Double d) {
        C3508l lVar = this.f8485g;
        if (lVar != null) {
            lVar.mo19978a(d);
        }
    }
}
