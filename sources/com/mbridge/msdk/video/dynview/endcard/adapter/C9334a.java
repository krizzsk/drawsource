package com.mbridge.msdk.video.dynview.endcard.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p302c.C8481b;
import com.mbridge.msdk.foundation.same.p302c.C8484c;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.video.dynview.endcard.cloudview.C9343d;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.video.dynview.endcard.adapter.a */
/* compiled from: ViewTagsAdapter */
public final class C9334a extends C9343d {

    /* renamed from: a */
    private List<CampaignEx> f22906a;

    /* renamed from: a */
    public final void mo62792a(View view, int i, float f) {
    }

    /* renamed from: a */
    public final void mo62793a(List<CampaignEx> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (CampaignEx next : list) {
                if (!TextUtils.isEmpty(next.getIconUrl())) {
                    arrayList.add(next);
                }
            }
            this.f22906a = arrayList;
        }
    }

    /* renamed from: a */
    public final int mo62789a() {
        List<CampaignEx> list = this.f22906a;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.f22906a.size();
    }

    /* renamed from: a */
    public final View mo62791a(Context context, int i, ViewGroup viewGroup) {
        List<CampaignEx> list;
        View inflate = LayoutInflater.from(context).inflate(C8658p.m24799a(viewGroup.getContext(), "mbridge_reward_view_tag_item", "layout"), viewGroup, false);
        if (inflate != null) {
            final RoundImageView roundImageView = (RoundImageView) inflate.findViewById(C8658p.m24799a(context, "mbridge_tag_icon", "id"));
            if (!(roundImageView == null || (list = this.f22906a) == null || list.size() <= 0)) {
                roundImageView.setBorderRadius(2);
                C8481b.m24310a(context).mo57883a(this.f22906a.get(i).getIconUrl(), (C8484c) new C8484c() {
                    public final void onFailedLoad(String str, String str2) {
                    }

                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                        RoundImageView roundImageView = roundImageView;
                        if (roundImageView != null) {
                            roundImageView.setImageBitmap(bitmap);
                        }
                    }
                });
            }
            TextView textView = (TextView) inflate.findViewById(C8658p.m24799a(context, "mbridge_tag_title", "id"));
            if (textView != null) {
                textView.setText(this.f22906a.get(i).getAppName());
            }
        }
        return inflate;
    }

    /* renamed from: a */
    public final int mo62790a(int i) {
        return i % 5;
    }
}
