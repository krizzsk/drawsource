package com.mbridge.msdk.video.dynview.p361i.p362a;

import android.graphics.Bitmap;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.video.dynview.C9317c;
import com.mbridge.msdk.video.dynview.p359g.C9350a;
import com.mbridge.msdk.video.dynview.p361i.C9363a;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.i.a.a */
/* compiled from: ChoiceOneDrawBitBg */
public class C9364a {

    /* renamed from: a */
    private static volatile C9364a f22995a;

    /* renamed from: b */
    private View f22996b;

    /* renamed from: c */
    private Bitmap f22997c;

    /* renamed from: d */
    private Bitmap f22998d;

    private C9364a() {
    }

    /* renamed from: a */
    public static C9364a m26697a() {
        C9364a aVar;
        if (f22995a != null) {
            return f22995a;
        }
        synchronized (C9364a.class) {
            if (f22995a == null) {
                f22995a = new C9364a();
            }
            aVar = f22995a;
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo62879a(Map map, C9317c cVar, View view) {
        Bitmap bitmap;
        List<CampaignEx> g;
        this.f22996b = view;
        int e = cVar.mo62749e();
        float d = cVar.mo62748d();
        float c = cVar.mo62747c();
        if (map != null && map.size() > 1 && (g = cVar.mo62751g()) != null && g.size() > 1) {
            if (map.get(SameMD5.getMD5(g.get(0).getImageUrl())) != null && (map.get(SameMD5.getMD5(g.get(0).getImageUrl())) instanceof Bitmap)) {
                Bitmap bitmap2 = (Bitmap) map.get(SameMD5.getMD5(g.get(0).getImageUrl()));
                if (!(g.get(0) == null || bitmap2 == null || bitmap2.isRecycled())) {
                    this.f22997c = C9363a.m26695a().mo62878a(bitmap2, 0);
                }
            }
            if (map.get(SameMD5.getMD5(g.get(1).getImageUrl())) != null && (map.get(SameMD5.getMD5(g.get(1).getImageUrl())) instanceof Bitmap)) {
                Bitmap bitmap3 = (Bitmap) map.get(SameMD5.getMD5(g.get(1).getImageUrl()));
                if (g.get(1) != null && !bitmap3.isRecycled()) {
                    this.f22998d = C9363a.m26695a().mo62878a(bitmap3, 1);
                }
            }
        }
        Bitmap bitmap4 = this.f22997c;
        if (bitmap4 != null && !bitmap4.isRecycled() && (bitmap = this.f22998d) != null && !bitmap.isRecycled()) {
            m26698a(e, d, c, this.f22997c, this.f22998d);
        }
    }

    /* renamed from: a */
    private synchronized void m26698a(int i, float f, float f2, Bitmap bitmap, Bitmap bitmap2) {
        C9350a.C9352a a = C9350a.m26656a();
        a.mo62855a(i).mo62856a(bitmap).mo62860b(bitmap2);
        if (i != 2) {
            a.mo62854a(f).mo62859b(f2);
        } else if (f > f2) {
            a.mo62854a(f).mo62859b(f2);
        } else {
            a.mo62854a(f2).mo62859b(f);
        }
        this.f22996b.setBackground(a.mo62858a());
    }

    /* renamed from: b */
    public final void mo62880b() {
        if (this.f22996b != null) {
            this.f22996b = null;
        }
        Bitmap bitmap = this.f22997c;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f22997c.recycle();
            this.f22997c = null;
        }
        Bitmap bitmap2 = this.f22998d;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.f22998d.recycle();
            this.f22998d = null;
        }
    }
}
