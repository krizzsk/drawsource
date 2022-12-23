package com.bytedance.sdk.openadsdk.p174i.p175a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.p108d.C2828j;
import com.bytedance.sdk.component.p108d.C2832n;
import com.bytedance.sdk.openadsdk.p165d.C3707a;
import com.bytedance.sdk.openadsdk.p174i.C3783a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.i.a.a */
/* compiled from: GifLoader */
public class C3784a {

    /* renamed from: com.bytedance.sdk.openadsdk.i.a.a$b */
    /* compiled from: GifLoader */
    public interface C3787b {
        /* renamed from: a */
        void mo20602a();

        /* renamed from: a */
        void mo20603a(int i, String str, Throwable th);

        /* renamed from: a */
        void mo20604a(String str, C3788b bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20597a() {
    }

    /* renamed from: a */
    public void mo20601a(C3783a aVar, C3787b bVar, int i, int i2, String str) {
        mo20600a(aVar, bVar, i, i2, ImageView.ScaleType.CENTER_INSIDE, str);
    }

    /* renamed from: a */
    public void mo20600a(C3783a aVar, final C3787b bVar, int i, int i2, ImageView.ScaleType scaleType, String str) {
        C3707a.m12123a(aVar.f9751a).mo17639a(aVar.f9752b).mo17634a(i).mo17641b(i2).mo17642b(str).mo17635a(Bitmap.Config.RGB_565).mo17636a(scaleType).mo17640a(!TextUtils.isEmpty(str)).mo17633a((C2832n) new C2832n() {
            /* renamed from: a */
            public void mo17179a(C2828j jVar) {
                C3784a.this.mo20599a(jVar, bVar);
            }

            /* renamed from: a */
            public void mo17178a(int i, String str, Throwable th) {
                C3784a.this.mo20598a(i, str, th, bVar);
            }
        });
        mo20597a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20599a(C2828j jVar, C3787b bVar) {
        if (bVar != null) {
            Object b = jVar.mo17647b();
            int a = m12354a(jVar);
            if (b instanceof byte[]) {
                bVar.mo20604a(jVar.mo17646a(), new C3788b((byte[]) b, a));
            } else if (b instanceof Bitmap) {
                bVar.mo20604a(jVar.mo17646a(), new C3788b((Bitmap) b, a));
            } else {
                bVar.mo20603a(0, "not bitmap or gif result!", (Throwable) null);
            }
        }
        if (bVar != null) {
            bVar.mo20602a();
        }
    }

    /* renamed from: a */
    private int m12354a(C2828j jVar) {
        String str;
        Map<String, String> c = jVar.mo17648c();
        if (c == null || (str = c.get(CampaignEx.JSON_KEY_IMAGE_SIZE)) == null || !(str instanceof Integer)) {
            return 0;
        }
        return ((Integer) str).intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20598a(int i, String str, Throwable th, C3787b bVar) {
        if (bVar != null) {
            bVar.mo20603a(i, str, th);
        }
    }

    /* renamed from: b */
    public static C3786a m12355b() {
        return new C3786a();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.i.a.a$a */
    /* compiled from: GifLoader */
    static class C3786a implements C3787b {
        /* renamed from: a */
        public void mo20602a() {
        }

        /* renamed from: a */
        public void mo20603a(int i, String str, Throwable th) {
        }

        /* renamed from: a */
        public void mo20604a(String str, C3788b bVar) {
        }

        C3786a() {
        }
    }
}
