package com.mbridge.msdk.video.dynview.endcard.adapter;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p302c.C8481b;
import com.mbridge.msdk.foundation.same.p302c.C8484c;
import com.mbridge.msdk.foundation.tools.C8617ae;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.system.NoProGuard;
import com.mbridge.msdk.video.dynview.moffer.C9395c;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.util.ArrayList;
import java.util.List;

public class MBMoreOfferAdapter extends RecyclerView.Adapter<C9333b> implements NoProGuard {
    /* access modifiers changed from: private */
    public List<View> animViews = new ArrayList();
    /* access modifiers changed from: private */
    public int bitmapSuccessCount = 0;
    private List<CampaignEx> campaignExList = new ArrayList();
    /* access modifiers changed from: private */
    public boolean isShowMoreOffer;
    public C9332a listener;
    /* access modifiers changed from: private */
    public C9395c moreOfferShowCallBack;
    private String rewardEndCardurl = "";

    /* renamed from: com.mbridge.msdk.video.dynview.endcard.adapter.MBMoreOfferAdapter$a */
    public interface C9332a {
        /* renamed from: a */
        void mo62788a(int i);
    }

    static /* synthetic */ int access$008(MBMoreOfferAdapter mBMoreOfferAdapter) {
        int i = mBMoreOfferAdapter.bitmapSuccessCount;
        mBMoreOfferAdapter.bitmapSuccessCount = i + 1;
        return i;
    }

    public void setOnItemClickListener(C9332a aVar) {
        this.listener = aVar;
    }

    public void setRewardEndCardurl(String str) {
        this.rewardEndCardurl = str;
    }

    public void setMoreOfferShowCallBack(C9395c cVar) {
        this.moreOfferShowCallBack = cVar;
    }

    public C9333b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C9333b(LayoutInflater.from(viewGroup.getContext()).inflate(C8658p.m24799a(viewGroup.getContext(), "mbridge_reward_end_card_more_offer_item", "layout"), viewGroup, false));
    }

    public void onBindViewHolder(final C9333b bVar, final int i) {
        List<CampaignEx> list = this.campaignExList;
        if (list != null && list.size() > 0) {
            if (bVar.f22904a != null) {
                bVar.f22904a.setImageDrawable((Drawable) null);
                bVar.f22904a.setTag(this.campaignExList.get(i).getIconUrl());
            }
            C8481b.m24310a(bVar.itemView.getContext()).mo57883a(this.campaignExList.get(i).getIconUrl(), (C8484c) new C8484c() {
                public final void onFailedLoad(String str, String str2) {
                }

                public final void onSuccessLoad(Bitmap bitmap, String str) {
                    if (!(bVar.f22904a == null || bVar.f22904a.getTag() == null || !bVar.f22904a.getTag().equals(str))) {
                        bVar.f22904a.setBorderRadius(13);
                        bVar.f22904a.setImageBitmap(bitmap);
                    }
                    MBMoreOfferAdapter.access$008(MBMoreOfferAdapter.this);
                    if (!MBMoreOfferAdapter.this.isShowMoreOffer && MBMoreOfferAdapter.this.bitmapSuccessCount >= 5 && MBMoreOfferAdapter.this.moreOfferShowCallBack != null) {
                        boolean unused = MBMoreOfferAdapter.this.isShowMoreOffer = true;
                        MBMoreOfferAdapter.this.moreOfferShowCallBack.mo62914a((List<View>) MBMoreOfferAdapter.this.animViews);
                    }
                }
            });
            if (!TextUtils.isEmpty(this.campaignExList.get(i).getAppName())) {
                String a = C8617ae.m24720a(this.rewardEndCardurl, "mof_textmod");
                if (TextUtils.isEmpty(a) || !a.equals("1")) {
                    if (bVar.f22905b != null) {
                        bVar.f22905b.setVisibility(8);
                    }
                } else if (bVar.f22905b != null) {
                    bVar.f22905b.setText(this.campaignExList.get(i).getAppName());
                }
            }
            bVar.itemView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBMoreOfferAdapter.this.listener != null) {
                        MBMoreOfferAdapter.this.listener.mo62788a(i);
                    }
                }
            });
        }
    }

    public int getItemCount() {
        List<CampaignEx> list = this.campaignExList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: com.mbridge.msdk.video.dynview.endcard.adapter.MBMoreOfferAdapter$b */
    static class C9333b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        RoundImageView f22904a;

        /* renamed from: b */
        TextView f22905b;

        public C9333b(View view) {
            super(view);
            this.f22904a = (RoundImageView) view.findViewById(C8658p.m24799a(view.getContext(), "mbridge_reward_end_card_item_iv", "id"));
            this.f22905b = (TextView) view.findViewById(C8658p.m24799a(view.getContext(), "mbridge_reward_end_card_item_title_tv", "id"));
        }
    }

    public void setMoreOfferData(List<CampaignEx> list) {
        C9395c cVar;
        ArrayList arrayList = new ArrayList();
        if (list == null || list.size() <= 5) {
            C9395c cVar2 = this.moreOfferShowCallBack;
            if (cVar2 != null) {
                cVar2.mo62913a("Offer list is NULL or size less than 5.");
                return;
            }
            return;
        }
        int i = 0;
        for (CampaignEx next : list) {
            if (TextUtils.isEmpty(next.getIconUrl())) {
                i++;
            } else {
                arrayList.add(next);
            }
        }
        if (list.size() - i < 5 && (cVar = this.moreOfferShowCallBack) != null) {
            cVar.mo62913a("Offer icon is Null and size less than 5.");
        }
        this.campaignExList = arrayList;
    }
}
