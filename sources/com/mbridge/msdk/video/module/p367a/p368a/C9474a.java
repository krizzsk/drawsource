package com.mbridge.msdk.video.module.p367a.p368a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.click.C6779b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8672v;

/* renamed from: com.mbridge.msdk.video.module.a.a.a */
/* compiled from: CommonContainerNotifyListener */
public class C9474a extends C9480f {

    /* renamed from: a */
    private Activity f23485a;

    /* renamed from: b */
    private CampaignEx f23486b;

    public C9474a(Activity activity, CampaignEx campaignEx) {
        this.f23485a = activity;
        this.f23486b = campaignEx;
    }

    /* renamed from: a */
    public void mo62631a(int i, Object obj) {
        super.mo62631a(i, obj);
        if (i == 106 && this.f23485a != null && this.f23486b != null) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                String a = C6779b.m20642a(this.f23486b.getClickURL(), "-999", "-999");
                if (!TextUtils.isEmpty(a)) {
                    intent.setData(Uri.parse(a));
                    this.f23485a.startActivity(intent);
                }
            } catch (Throwable th) {
                C8672v.m24875a("NotifyListener", th.getMessage(), th);
            }
            this.f23485a.finish();
        }
    }
}
